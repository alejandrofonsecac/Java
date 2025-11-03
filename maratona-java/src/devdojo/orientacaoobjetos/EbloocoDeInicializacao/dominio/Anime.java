package devdojo.orientacaoobjetos.EbloocoDeInicializacao.dominio;

public class Anime {
    public String nome;
    private int[] episodios;

    // 1 - Alocado espaço em memoria
    // 2 - Cada atributo de classe e criado e inicilizado com default
    //      ou o quer for passado
    // 3 - Bloco de inicialização executado
    // 4 - Constructor é executado

    {
        System.out.println("Dentro do Bloco de Inicializacao");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(){
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }

        for(int episdios : this.episodios){
            System.out.print(episdios + " ");
        }
    }

    public String getNome(){
        return nome;
    }

    public int[] getEpisodios(){
        return episodios;
    }
}
