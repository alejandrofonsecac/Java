package devdojo.orientacaoobjetos.test;
import devdojo.orientacaoobjetos.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nomeProfessor = "Joao";
        professor.sexoProfessor = 'M';
        professor.idadeProfessor = 29;

        System.out.println(professor.nomeProfessor +
                " " + professor.sexoProfessor
                +  " " + professor.idadeProfessor);
    }
}
