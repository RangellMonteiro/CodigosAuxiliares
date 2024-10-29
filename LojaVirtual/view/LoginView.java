package view;

import java.util.Scanner;

public class LoginView {
    public String getEmail(Scanner scanner) {
        System.out.print("Digite seu email: ");
        return scanner.nextLine();
    }

    public String getSenha(Scanner scanner) {
        System.out.print("Digite sua senha: ");
        return scanner.nextLine();
    }
}
