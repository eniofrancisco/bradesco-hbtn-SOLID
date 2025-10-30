public class Error {

    // ✅ Usa exceções ao invés de códigos de erro
    public User createUser(User user) {
        try {
            loadUser(user.getId());
            throw new UserExistsException(user.getId());
        } catch (UserNotFoundException exception) {
            // usuário não existe, pode ser criado
        }
        resolveGroup(user);
        return userRepository.save(user);
    }

    // ✅ Exceção com contexto útil
    public void validate(String id) {
        if (ownerRepo.count(id) == 0) {
            throw new ValidationException("id: " + id + " não foi informado, deveria ser informado...");
        }
    }

    // Dependências fictícias para compilação
    private UserRepository userRepository;
    private OwnerRepository ownerRepo;

    private void resolveGroup(User user) {}
    private Object loadUser(String id) throws UserNotFoundException { return null; }

    // Classes fictícias
    public static class User {
        public String getId() { return "123"; }
    }

    public static class UserRepository {
        public User save(User user) { return user; }
    }

    public static class OwnerRepository {
        public int count(String id) { return 0; }
    }

    public static class UserExistsException extends RuntimeException {
        public UserExistsException(String id) {
            super("Usuário com id " + id + " já existe.");
        }
    }

    public static class UserNotFoundException extends Exception {}

    public static class ValidationException extends RuntimeException {
        public ValidationException(String message) {
            super(message);
        }
    }
}
