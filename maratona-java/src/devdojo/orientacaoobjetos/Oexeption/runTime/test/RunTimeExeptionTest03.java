package devdojo.orientacaoobjetos.Oexeption.runTime.test;

import devdojo.orientacaoobjetos.Oexeption.exeption.test.ExeptionTest02;

public class RunTimeExeptionTest03 {
    public static void main(String[] args) {
        abreConexao();
        System.out.println("======");
        abreConexao2();
    }

    // ===== FINALLY =====
    // Usamos o finally para executar uma ação independente da exceção.

    // {1} Essa linha vai ser executadaa por ultimo pois OBRIGATORIAMENTE tem que ser executaado o Finally

    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrendo dados no arquivo");
            return "Conexão aberta"; // {1}
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo sistema operacional");
        }
        return null;
    }

    private static void abreConexao2() {

        // Aqui podemos ver que não temos o catch, fazemos isso quando não queremos ou podemos lidar com a exceção, então se nos temos uma conexãao com o banco de dados aberto ou algo do tipo que faça estourar a memoria (ou algo do tipo) usamos o finally

        // OBS: e mais raro ser usado
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrendo dados no arquivo");
            throw new RuntimeException();
        }finally {
            System.out.println("Fechando recurso liberado pelo sistema operacional");
        }
    }
}

