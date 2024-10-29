package controller;

import model.Usuario;
import model.Cliente;
import model.Administrador;

import java.util.ArrayList;

public class UsuarioController {
    private ArrayList<Usuario> usuarios;

    public UsuarioController() {
        this.usuarios = new ArrayList<>();
        // Criando usuários para teste
        usuarios.add(new Cliente("cliente@example.com", "senha123", "Cliente Exemplo", "12345678901", "123456789",
                "Endereço Exemplo"));
        usuarios.add(new Administrador("admin@example.com", "admin123", "Admin Exemplo"));
    }

    public Usuario autenticarUsuario(String email, String senha) throws Exception {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
                return usuario;
            }
        }
        throw new Exception("Usuário não encontrado ou senha incorreta.");
    }
}
