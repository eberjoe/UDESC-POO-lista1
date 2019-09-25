package biblioteca;

public class Pessoa {
    private String nome;
    private int cpf;
    protected int tempoDeEmprestimoEmDias = 7; // vamos assumir 7 dias como o tempo default.
    /*Construtor.*/
    public Pessoa(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    /*getter for the time.*/
    public int mostrarTempoDeEmprestimo() {
        return tempoDeEmprestimoEmDias;        
    }
    
    public String getNome() {
        return nome;
    }
}
