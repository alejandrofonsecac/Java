package devdojo.orientacaoobjetos.Gassociacao.exercicios.Associacao.dominio;

public class Seminiario {
    private String titulo;
    private Local local;
    private Professor professor;

    public Seminiario(String titulo) {
        this.titulo = titulo;
    }

    public Seminiario(String titulo, Local local, Professor professor) {
        this.titulo = titulo;
        this.local = local;
        this.professor = professor;
    }

    public void imprimir() {
        System.out.println(this.titulo);
        if(local!=null){
            System.out.println(local.getLocal());

        }else{
            System.out.println("Não tem local ainda");
        }
        if(professor!=null){
            System.out.println(professor.getNome());

        }else{
            System.out.println("Não tem professor ainda");
        }
    }

    // Getters and Setters

    public String getSeminiario() {
        return titulo;
    }

    public void setSeminiario(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
