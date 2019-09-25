package biblioteca;

public class Aluno extends Pessoa{
    private String curso;
    private String fase;
    private int matricula;

    public Aluno(String nome, int cpf, String curso, String fase, int matricula) {
        super(nome, cpf);
        this.curso = curso;
        this.fase = fase;
        this.matricula = matricula;
        tempoDeEmprestimoEmDias =  7 + (int)(0.4 * 7); 
    }
    
}
