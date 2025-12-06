package devdojo.orientacaoobjetos.Gassociacao.exercicios.Associacao.dominio;

public class Aluno {
    private String nome;
    private int idade;
    private Professor professor;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprimirAlunos(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if(professor != null){
            System.out.println("Professor: " + professor.getNome());
        }else {
            System.out.println("Professor: Nenhum professor");
        }
        System.out.println("-----------");
    }



    // Getters and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
