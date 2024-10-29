package controller;

import model.Cliente;
import model.Pedido;
import model.Produto;

import java.util.ArrayList;

public class PedidoController {
    private ArrayList<Pedido> pedidos;

    public PedidoController() {
        this.pedidos = new ArrayList<>();
    }

    public void finalizarPedido(Cliente cliente, ArrayList<Produto> produtosCarrinho) {
        if (produtosCarrinho.isEmpty()) {
            System.out.println("O carrinho está vazio. Adicione produtos antes de finalizar o pedido.");
            return;
        }

        Pedido pedido = new Pedido(cliente, produtosCarrinho);
        pedidos.add(pedido);

        // Atualizar o estoque
        for (Produto produto : produtosCarrinho) {
            produto.setQuantidade(produto.getQuantidade() - 1);
        }

        System.out.println("Pedido realizado com sucesso!");
        new CarrinhoController().limparCarrinho(); // Limpa o carrinho após a finalização
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
}
