package devdojo.orientacaoobjetos.Hheranca.test;
import devdojo.orientacaoobjetos.Hheranca.dominio.Funcionario;
import devdojo.orientacaoobjetos.Hheranca.dominio.Pessoa;

public class HerancaTest02 {
    public static void main(String[] args) {

        // 0 - Bloco de inicialização estatico da super classe é exeecutado quando a JVM carregar classe pai
        // 1 - Bloco de inicialização estatico da sub classe é excutado
        // 2 - Aloca espaço em memoria para o objeto
        // 3 - Cada atributo de classe e criado e inicializado com valrees default ou o quer for passado da classe pai
        // 4 - Bloco de inicializalição da super classe é executado na ordem que aparece
        // 5 - Constructor da super classe é executado
        // 6 - Espaço alocado em memoria para a subclasse
        // 7 - Cada atributo da subclasse é criado e inicializado com valores default ou o que for passado da classe pai
        // 8 - Bloco de inicialização da subclasse é executado
        // 9 - Cnstructor de subclasse é executado

        Funcionario funcionario = new Funcionario("Jorge");
    }
}
