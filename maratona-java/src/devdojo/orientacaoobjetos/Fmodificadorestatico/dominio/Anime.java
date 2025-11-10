package devdojo.orientacaoobjetos.Fmodificadorestatico.dominio;

public class Anime {
    public String nome;
    private static int[] episodios;
    //Agora episodio pertencem a ANIME (class)

    // 0 - Bloco de inicialização é executado quando a JVM carregar classe
    // 1 - Alocado espaço em memoria
    // 2 - Cada atributo de classe e criado e inicilizado com default
    //      ou o quer for passado
    // 3 - Bloco de inicialização executado
    // 4 - Constructor é executado


    // Um exemplo dado e que dentro do bloco ESTATICO nao posso acessar .nome,
    //  pois ele acontece na etapa 1, qando e alocado os espaços em memoria, no
    //      caso a variavel nome (public String nome;).

    // --- IMPORTANTE ---
    //  --- Bloco de inicialização ESTATICOS sao executados apenas 1 vez ---
    static {
        System.out.println("Dentro do Bloco de Inicializacao ESTATICO 1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do Bloco de Inicializacao Estatico 2");
    }

    static {
        System.out.println("Dentro do Bloco de Inicializacao Estatico 3");
    }

    {
        System.out.println("Dentro do Bloco de Inicialização NAO estatico");
    }


    public Anime(){
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }

        for(int episdios : Anime.episodios){//Como esta estatico tem que usar o nome da classe
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
