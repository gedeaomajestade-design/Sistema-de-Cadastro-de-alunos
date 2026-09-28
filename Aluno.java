public class Aluno{

    String nome;
    String cpf;
    String curso;
    String turma;
    String periodo;
    public Aluno(String nome, String cpf, String curso, String turma, String periodo ){
        this.nome= nome;
        this.cpf = cpf;
        this.curso = curso;
        this.turma = turma;
        this.periodo = periodo;

    }
    public  void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Curso: " + curso);
        System.out.println("Turma: " + turma);
        System.out.println("Periodo: " + periodo);
    }
}