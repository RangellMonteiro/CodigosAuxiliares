// src/model/Carrinho.java
package model;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> produtos;

    public Carrinho() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public double calcularValorTotal() {
        // Simulação de preço fixo para simplificar
        double total = 0.0;
        for (Produto produto : produtos) {
            total += 50.0; // Preço fixo por produto
        }
        return total;
    }

    public boolean verificarEstoque() {
        for (Produto produto : produtos) {
            if (produto.getQuantidade() <= 0) {
                return false; // Algum produto está fora de estoque
            }
        }
        return true;
    }
}
