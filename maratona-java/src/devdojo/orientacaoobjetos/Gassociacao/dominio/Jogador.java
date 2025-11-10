package devdojo.orientacaoobjetos.Gassociacao.dominio;

public class Jogador {
    private String nome;
    private Time time;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void imprimir(){
        System.out.println(this.nome);
    }

    public void imprimirJogadorTime(){
        System.out.println(this.nome);
        if(time != null){
            System.out.println(time.getNome());
        }
    }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }
}