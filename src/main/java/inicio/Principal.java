package main.java.inicio;

public class Principal {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Danyel");
        aluno.setSobrenome("Henrique");
        System.out.println(aluno.matricular());

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Jessica");
        aluno2.setSobrenome("Martinho");
        System.out.println(aluno2.matricular());
    }
}
