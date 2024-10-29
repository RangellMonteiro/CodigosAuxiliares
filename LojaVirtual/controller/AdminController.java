package controller;

import view.AdminView;
import java.util.Scanner;

public class AdminController {
    private ProdutoController produtoController;
    private AdminView adminView;

    public AdminController() {
        this.produtoController = new ProdutoController();
        this.adminView = new AdminView();
    }

    public void executar(Scanner scanner) {
        boolean sair = false;
        while (!sair) {
            int opcao = adminView.mostrarMenuAdmin(scanner);
            switch (opcao) {
                case 1:
                    produtoController.cadastrarProduto(scanner);
                    break;
                case 2:
                    produtoController.editarProduto(scanner);
                    break;
                case 3:
                    produtoController.listarProdutos();
                    break;
                case 4:
                    sair = true;
                    System.out.println("Saindo do menu do administrador...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
