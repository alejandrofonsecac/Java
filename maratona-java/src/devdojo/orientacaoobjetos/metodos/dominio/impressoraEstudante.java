package devdojo.orientacaoobjetos.metodos.dominio;
import devdojo.orientacaoobjetos.metodos.dominio.Estudante;

public class impressoraEstudante {
    public void imprime(Estudante estudante) {

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}