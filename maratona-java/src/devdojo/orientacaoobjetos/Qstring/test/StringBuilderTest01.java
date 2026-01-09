package devdojo.orientacaoobjetos.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        // {1} Ao contrario das Strings normais StringBuilders não são imutaveis, pois elas são um objeto, ELA É MUTAVEL
        //Isso quer dizer que a String normal qunado mudamos ela com .contact ela cria outra String na StringPool, já o StringBuilder não, ele MUTA (MUTAVEL), ele modifica a propria String e não cria outra nova.

        // {2} Quando imprimimos um StringBuilder ele é atomaticamente convertido para String, por isso nã e necessario usar o metodo .toString

        String nome = "Alejandro";
        nome.concat(" Fonseca");
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Alejandro"); // {1}
        sb.append(" DEV").append(" Olá").append(" DEV");

        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb.toString()); // {2}
    }
}
