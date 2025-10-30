import java.util.List;

public class UserModel {

    private int idUser;
    private String descricao;

    public static final int IDADE_MINIMA = 18;

    // Retorna todos os usuários
    public List<User> fetchUsers() {
        return List.of(); // exemplo fictício
    }

    public List<User> getAllUsers() {
        return List.of(); // exemplo fictício
    }

    public List<User> getUsers() {
        return List.of(); // exemplo fictício
    }

    // Classe fictícia para representar um usuário
    public static class User {
        // atributos e métodos do usuário
    }
}
