package devdojo.orientacaoobjetos.Gassociacao.exercicios.Associacao.dominio;

public class Aluno {
    private Aluno[] alunos;
    private int idade;
    private String professor;

    public Aluno(Aluno[] alunos, int idade) {
        this.alunos = alunos;
        this.idade = idade;
    }

    public void imprimirAlunos(){

    }

    public Aluno[] getNome() {
        return alunos;
    }

    public void setNome(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
