package devdojo.orientacaoobjetos.Gassociacao.exercicios.Associacao.dominio;

public class Professor {
    private String nome;
    private Aluno[] alunos;
    private String especialidade;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, Aluno[] alunos ) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public void imprimir(){
        System.out.println(this.nome);
        for(Aluno aluno : alunos){
            if(aluno == null){
                System.out.println("Nao temos nenhum aluno neste seminario");
                return;
            }
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

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
