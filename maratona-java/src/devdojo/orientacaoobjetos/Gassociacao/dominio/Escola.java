package devdojo.orientacaoobjetos.Gassociacao.dominio;

public class Escola {
    private String nome;
    private Professor[] professores;

    public Escola(String nome) {//Constructor
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professores) {//Sobrecarga no constructor

        //Agora posso ter uma escola JÁ COM OS PROFESSORES

        this.nome = nome; //Recebe o professor disponivel
        this.professores = professores;
    }

    public void imprime(){
        System.out.println(this.nome);

        if(this.professores == null){
            return;
        }

        for(Professor professor : this.professores){
            System.out.println(professor.getNome());
        }
    }


    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
