package controller;

import model.Produto;

import java.util.ArrayList;

public class ProdutoController {
    private ArrayList<Produto> produtos;

    public ProdutoController() {
        this.produtos = new ArrayList<>();
        // Adicionando produtos para teste
        produtos.add(new Produto("001", "Produto 1", 10, 50.0));
        produtos.add(new Produto("002", "Produto 2", 5, 30.0));
    }

    public void cadastrarProduto(String codigo, String nome, int quantidade, double preco) {
        produtos.add(new Produto(codigo, nome, quantidade, preco));
    }

    public void editarProduto(String codigo, String nome, int quantidade, double preco) {
        for (Produto produto : produtos) {
            if (produto.getCodigo().equals(codigo)) {
                produto.setQuantidade(quantidade);
                // Não há método set para o nome e preço, então seria necessário criar.
                return;
            }
        }
    }

    public Produto buscarProdutoPorCodigo(String codigo) {
        for (Produto produto : produtos) {
            if (produto.getCodigo().equals(codigo)) {
                return produto;
            }
        }
        return null;
    }
}
