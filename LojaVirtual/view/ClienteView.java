package view;

import java.util.Scanner;

public class ClienteView {
    public int mostrarMenuCliente(Scanner scanner) {
        System.out.println("Menu Cliente:");
        System.out.println("1. Adicionar Produto ao Carrinho");
        System.out.println("2. Ver Carrinho");
        System.out.println("3. Finalizar Pedido");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }
}
