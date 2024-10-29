package controller;

import model.Cliente;
import model.Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class CarrinhoController {
    private ArrayList<Produto> carrinho;

    public CarrinhoController() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarProdutoAoCarrinho(Scanner scanner, Cliente cliente) {
        System.out.print("Digite o código do produto: ");
        String codigoProduto = scanner.nextLine();
        Produto produto = new ProdutoController().buscarProdutoPorCodigo(codigoProduto); // Método que deve buscar o
                                                                                         // produto pelo código

        if (produto != null && produto.getQuantidade() > 0) {
            carrinho.add(produto);
            System.out.println("Produto adicionado ao carrinho: " + produto.getNome());
        } else {
            System.out.println("Produto não encontrado ou sem estoque.");
        }
    }

    public void verCarrinho(Cliente cliente) {
        if (carrinho.isEmpty()) {
            System.out.println("Seu carrinho está vazio.");
            return;
        }

        System.out.println("Produtos no carrinho:");
        for (Produto produto : carrinho) {
            System.out.println(produto.getNome() + " - " + produto.getQuantidade() + " unidades");
        }
    }

    public ArrayList<Produto> getCarrinho() {
        return carrinho;
    }

    public void limparCarrinho() {
        carrinho.clear();
    }
}
