package devdojo.orientacaoobjetos.Oexeption.exeption.test;

import devdojo.orientacaoobjetos.Oexeption.exeption.dominio.Leitor1;
import devdojo.orientacaoobjetos.Oexeption.exeption.dominio.Leitor2;

import java.io.*;

// {1} Aqui temos tryWithResurces que faz com que a conexão que abrimos se feche automaticamente apos o termino do codigo, isso é pois na class Leitor implementamos o Closeable que fecha a conexao automaticamente.
//  é importante lembrar que as conexões são fechadas de baixo para cima, ou seja, no codigo o leitor2 e fechado primeiro e apos isso o leitor1 e fechado

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo(){
        try(Leitor1 leitor1 = new Leitor1();// {1}
            Leitor2 leitor2 = new Leitor2()){

        }catch (IOException e){

        }
    }

    public static void lerArquivo2(){
        Reader reader = null;

        try{
            reader = new BufferedReader(new FileReader("test.txt"));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            }catch (IOException exe){
                exe.printStackTrace();
            }
        }
    }
}
