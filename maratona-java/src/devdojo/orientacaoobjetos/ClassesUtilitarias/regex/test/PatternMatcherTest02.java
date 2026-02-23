package devdojo.orientacaoobjetos.ClassesUtilitarias.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        //A poosiã exibida no console mostra a pósiçã o que ele ECONTROU a expressã regular ele não mstra quando termina de ler (pelo menos cm os metodos usado nesse codigo, talvez com o matcher.end() mostre e eu não sei)

        // \d = Todos os digitos
        // \D = Tudo o que não for digito
        // \s = Todos os espaçõs em branco \t \n \f \r
        // \S = Todos os caracteres menos os espaços em branco
        // \w = Todos a-Z, A-Z, digitos, _, NAO RETORNA CARACTERES ESPECIAIS
        // \W = Tudo que não for incluso no \w

        String regex = "\\W";
        String text = "abaaba";
        String text2 = "%e_1b@yu94";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);
        System.out.println("texto:  " + text2);
        System.out.println("Indice: 0123456789");
        System.out.println("regex:  " + regex);
        System.out.println("Posições econtradas");
        while (matcher.find()){
            System.out.print(matcher.start()+ " "+  matcher.group()+ "\n");
        }
    }
}
