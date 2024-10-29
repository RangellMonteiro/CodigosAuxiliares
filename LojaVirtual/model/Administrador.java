package model;

public class Administrador extends Usuario {
    private String nome;

    public Administrador(String email, String senha, String nome) {
        super(email, senha);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
