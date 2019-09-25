package biblioteca;

public class Professor extends Pessoa {
	private String formacao;
    private float salario;
    private String departamento;
    
    public Professor(String nome, int cpf, String formacao, float salario, String departamento) {
    	super(nome, cpf);
    	this.formacao = formacao;
    	this.salario = salario;
    	this.departamento = departamento;
    	tempoDeEmprestimoEmDias = 7 + (int)(0.7 * 7);
    }

	public float getSalario() {
		return salario;
	}
}
