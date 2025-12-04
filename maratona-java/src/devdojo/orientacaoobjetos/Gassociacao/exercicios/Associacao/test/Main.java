package devdojo.orientacaoobjetos.Gassociacao.exercicios.Associacao.test;

import devdojo.orientacaoobjetos.Gassociacao.exercicios.Associacao.dominio.Professor;
import devdojo.orientacaoobjetos.Gassociacao.exercicios.Associacao.dominio.Aluno;
import devdojo.orientacaoobjetos.Gassociacao.exercicios.Associacao.dominio.Local;
import devdojo.orientacaoobjetos.Gassociacao.exercicios.Associacao.dominio.Seminiario;

public class Main {
    public static void main(String[] args) {

        Professor professor = new Professor("Professor João");
        Professor professor2 = new Professor("Professora Ana");

        Aluno aluno = new Aluno("Aluno Alejandro", 16);
        Aluno aluno2 = new Aluno("Aluna Julia", 18);
        Local local = new Local("Rua das Laranjeiras, 213");
        Seminiario seminiario = new Seminiario("Programação na vida real"); //Titulo do Seminario

        Aluno[] alunos = {aluno, aluno2};
        professor.setAlunos(alunos);
        professor.setSeminario(seminiario);

        System.out.println("--- Professor ---");
        professor.imprimirProfessorSeminario();
        System.out.println("Alunos:");
        professor.imprimirAlunos();
        
    }
}
