package devdojo.orientacaoobjetos.ClassesUtilitarias.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        //A poosiã exibida no console mostra a pósiçã o que ele ECONTROU a expressã regular ele não mstra quando termina de ler (pelo menos cm os metodos usado nesse codigo, talvez com o matcher.end() mostre e eu não sei)

        // \d = Todos os digitos
        // \D = Tudo o que não for digito
        // \s = Todos os espaçõs em branco \t \n \f \r
        // \S = Todos os caracteres menos os espaços em branco
        // \w = Todos a-Z, A-Z, digitos, _, NAO RETORNA CARACTERES ESPECIAIS
        // \W = Tudo que não for incluso no \w

        //=== Range ===
        // [abc] -> Procurar por a,b,c individualmente
        // no range - serve para servir de range, exemplo: a-z -> procurar de a a z

        // String regex = "[a-zA-C]";
        String regex = "0[xX][0-9a-fA-F]";
        String text = "abaaba";
        String text2 = "12 0x 0X 0xFFABC 0x109 0x1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);
        System.out.println("texto:  " + text2);
        System.out.println("Indice: 0123456789");
        System.out.println("regex:  " + regex);
        System.out.println("Posições econtradas");
        while (matcher.find()){
            System.out.print(matcher.start()+ " "+  matcher.group()+ "\n");
        }

        System.out.println("==========");
        int numeroHex = 0x59F86A; //Para usar numeroHexadeciamal coloque 0x ou 0X antes dele
        System.out.println(numeroHex);
    }
}
