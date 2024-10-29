package view;

import controller.UsuarioController;
import controller.CarrinhoController;
import controller.PedidoController;
import model.Usuario;
import model.Cliente;
import view.LoginView;
import view.ClienteView;
import view.AdminView;
import model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UsuarioController usuarioController = new UsuarioController();
        CarrinhoController carrinhoController = new CarrinhoController();
        PedidoController pedidoController = new PedidoController();

        LoginView loginView = new LoginView();
        String email = loginView.getEmail(scanner);
        String senha = loginView.getSenha(scanner);

        try {
            Usuario usuario = usuarioController.autenticarUsuario(email, senha);
            if (usuario instanceof Cliente) {
                Cliente cliente = (Cliente) usuario;
                ClienteView clienteView = new ClienteView();
                int opcao;

                do {
                    opcao = clienteView.mostrarMenuCliente(scanner);
                    switch (opcao) {
                        case 1:
                            carrinhoController.adicionarProdutoAoCarrinho(scanner, cliente);
                            break;
                        case 2:
                            carrinhoController.verCarrinho(cliente);
                            break;
                        case 3:
                            pedidoController.finalizarPedido(cliente, carrinhoController.getCarrinho());
                            break;
                    }
                } while (opcao != 4);

            } else if (usuario instanceof Administrador) {
                AdminView adminView = new AdminView();
                int opcao;

                do {
                    opcao = adminView.mostrarMenuAdmin(scanner);
                    switch (opcao) {
                        case 1:
                            // Cadastrar Produto
                            break;
                        case 2:
                            // Editar Produto
                            break;
                    }
                } while (opcao != 3);
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
