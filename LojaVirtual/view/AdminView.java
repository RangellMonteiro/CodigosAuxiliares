package view;

import java.util.Scanner;

public class AdminView {
    public int mostrarMenuAdmin(Scanner scanner) {
        System.out.println("Menu Admin:");
        System.out.println("1. Cadastrar Produto");
        System.out.println("2. Editar Produto");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }
}
