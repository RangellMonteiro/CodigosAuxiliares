package controller;

import model.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProdutoController {
    private List<Produto> produtos = new ArrayList<>();

    public void cadastrarProduto(Scanner scanner) {
        System.out.print("Digite o Codigo do produto: ");
        String codigo = scanner.nextLine();

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a quantidade do produto: ");
        int quantidade = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o preço do produto:");
        double preco = scanner.nextDouble();

        Produto produto = new Produto(codigo, nome, quantidade, preco);
        produtos.add(produto);

        System.out.println("Produto cadastrado com sucesso!");
    }

    public void editarProduto(Scanner scanner) {
        System.out.print("Digite o código do produto que deseja editar: ");
        String codigo = scanner.nextLine();

        Produto produto = buscarProdutoPorCodigo(codigo);

        if (produto != null) {
            System.out.print("Digite o novo nome do produto (atual: " + produto.getNome() + "): ");
            String novoNome = scanner.nextLine();
            System.out.print("Digite a nova quantidade do produto (atual: " + produto.getQuantidade() + "): ");
            int novaQuantidade = Integer.parseInt(scanner.nextLine());

            // Atualiza os detalhes do produto
            produto.setNome(novoNome);
            produto.setQuantidade(novaQuantidade);
            System.out.println("Produto atualizado com sucesso!");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public Produto buscarProdutoPorCodigo(String codigo) {
        for (Produto produto : produtos) {
            if (produto.getCodigo().equals(codigo)) {
                return produto;
            }
        }
        return null; // Retorna null se o produto não for encontrado
    }

    public void listarProdutos() {
        System.out.println("=== Lista de Produtos ===");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
