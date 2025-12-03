package devdojo.orientacaoobjetos.Gassociacao.exercicios.Associacao.dominio;

public class Aluno {
    private String nome;
    private String professor;
    private int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }
}
