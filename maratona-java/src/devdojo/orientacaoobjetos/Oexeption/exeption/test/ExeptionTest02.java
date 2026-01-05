package devdojo.orientacaoobjetos.Oexeption.exeption.test;

import java.io.File;
import java.io.IOException;

public class ExeptionTest02 {

    // Exceção Checked => Precisa ser chekada, precisa de tratamento
    // Exceção Unckeded = > Nao precisa ser checkada, RunTimeExeption...

    // Nos podemos usar esse trows IoException quando o nosso metodo e publico, pois quando ele e privado a classe nao pode acessar outras classes de maneira tão livre.

    // Além disso é bom usar try/catch quando queremos desenvolver mais o tratamento de erro ao inves de somente retoranar uma mensagem de erro, um exemmplo quee temos e quando queremos enviar um e-mail sobre o erro ou algo do tipo...

    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() throws IOException{

        //Teste
        File file = new File("arquivo\\test.txt");
            try{
                boolean isCriado = file.createNewFile();
                System.out.println("Arquivo criado: " + isCriado);
            } catch (IOException e){
                e.printStackTrace();
                throw e; // Aqui eestamos reelançando a exceção, para caso ela for tratada ela ser relançada
            }
    }
}
