package devdojo.orientacaoobjetos.Gassociacao.exercicios.Associacao.dominio;

public class Professor {
    private String nome;
    private Aluno[] alunos;
    private Seminiario seminario;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, Aluno[] alunos, Seminiario seminario) {
        this.nome = nome;
        this.alunos = alunos;
        this.seminario = seminario;
    }

    public void imprimirProfessorSeminario() {
        System.out.println(this.nome);
        System.out.println(seminario.getSeminiario());
    }

    public void imprimirAlunos(){
        if(this.alunos == null){
            System.out.println("Não há alunos neste seminario");
            return;
        }
        for (Aluno aluno : alunos){
            System.out.println(aluno.getNome());
        }
    }


    //Getters and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Seminiario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminiario seminario) {
        this.seminario = seminario;
    }
}
