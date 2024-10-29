package model;

import java.util.ArrayList;

public class Cliente extends Usuario {
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private ArrayList<String> cartoes;

    public Cliente(String email, String senha, String nome, String cpf, String telefone, String endereco) {
        super(email, senha);
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cartoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarCartao(String cartao) {
        cartoes.add(cartao);
    }

    public void removerCartao(String cartao) {
        cartoes.remove(cartao);
    }

    public ArrayList<String> getCartoes() {
        return cartoes;
    }
}
