import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos Alunos Deseja Cadastrar: ");
        int quantidade = sc.nextInt();
        sc.nextLine();
        Aluno[] aluno = new Aluno[quantidade];
        for (int i = 1; i <= quantidade; i++) {
            System.out.println("\n======== Cadastrar Alunos ======" + (i + 1) + "====");
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("CPF: " );
            String cpf = sc.nextLine();
            System.out.println("Curso: ");
            String curso= sc.nextLine();
            System.out.println("Turma: ");
            String turma = sc.nextLine();
            System.out.println("Periodo; ");
            String periodo = sc.nextLine();
            aluno [i]= new Aluno(nome,cpf, curso, turma,periodo );
            Aluno aluno1 = new Aluno("Paulo", "12547896", "matematica", "A23", "manha");
            aluno1.exibirInformacoes();
        }
           System.out.println("\n======= Lista de Alunos====== ");
            for(int i = 0 ; i <aluno.length; i ++){
             aluno[i].exibirInformacoes();

        }
    }
}