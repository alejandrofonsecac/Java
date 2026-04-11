package testesJava.testeDatas.Biblioteca_Manga.dominio;

import java.util.Objects;

public class Cliente {
    private String nome;
    private int idade;
    private long pedido;

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Cliente(String nome, int idade, long pedido) {
        this.nome = nome;
        this.pedido = pedido;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return idade == cliente.idade && Objects.equals(nome, cliente.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }



    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getPedido() { return pedido; }

    public void setPedido(Long pedido) { this.pedido = pedido; }
}
