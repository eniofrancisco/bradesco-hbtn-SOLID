# Projeto: Tratamento de Erros — Clean Code

Este projeto demonstra boas práticas de tratamento de erros em Java, com base nos princípios do Clean Code. A classe  foi revisada para remover abordagens inadequadas e manter apenas métodos que utilizam exceções de forma clara, contextual e segura.

## 📄 Arquivo principal

- : contém exemplos de tratamento de erros com uso adequado de exceções, evitando códigos de erro e valores nulos.

## 🎯 Princípios aplicados

- ✅ **Use exceções ao invés de códigos de erro**  
  Evita o uso de flags como  ou , que dificultam a manutenção e leitura.

- ✅ **Lance exceções com contexto útil**  
  Mensagens de erro informam claramente o motivo e o valor envolvido, como no caso de .

- ✅ **Evite retornar ou passar **  
  O código evita o uso de  como resposta para erros, preferindo lançar exceções.

## 📁 Estrutura

```
0x04/error/
├── Error.java
└── README.md
```

## 📚 Referências

- Clean Code — Robert C. Martin
- Effective Java — Joshua Bloch
- Documentação oficial de exceções em Java

## 📌 Observações

Este projeto faz parte do repositório [bradesco-hbtn-SOLID](https://github.com/seu-usuario/bradesco-hbtn-SOLID) e serve como base para estudos sobre tratamento de erros limpo, seguro e legível em Java.

