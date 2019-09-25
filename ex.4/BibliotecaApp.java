package biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {
    //Lista. Declarada como static para ser um atributo da classe JavaApplication1.
    static ArrayList<Pessoa> listaDePessoas = new ArrayList();
    
    //Um dos Metodos Solicitados.
    public static void listaAlunos() {
        for(Pessoa p : listaDePessoas) {
            if (p instanceof Aluno) {
                System.out.println("\n Aluno: " + p.getNome());
            }
        }
    }
    
    public static void listaProfessores() {
    	for(Pessoa p : listaDePessoas) {
    		if (p instanceof Professor) {
    			System.out.println("\n Professor: " + p.getNome());
    		}
    	}
    }
    
    public static void listaProfessoresSalario(float salario) {
    	for(Pessoa p : listaDePessoas) {
    		if (p instanceof Professor && ((Professor) p).getSalario() >= salario) {
    			System.out.println("\n Professor " + p.getNome() + " ganha mais de " + salario + ".");
    		}
    	}
    }
    
    public static int mostrarTempoEmprestimo(Pessoa pessoa) {
    	return pessoa.mostrarTempoDeEmprestimo();
    }
    
    public static void cadastraProfessor(String nome, int cpf, String formacao, float salario, String departamento) {
    	listaDePessoas.add(new Professor(nome, cpf, formacao, salario, departamento));
    }
    
    public static void cadastraPessoa(String nome, int cpf) {
    	listaDePessoas.add(new Pessoa(nome, cpf));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Adicionando Alunos e pessoas.
        listaDePessoas.add(new Aluno("aluno1", 111, "tads", "3", 81983));
        listaDePessoas.add(new Pessoa("Joao", 123));
        listaDePessoas.add(new Aluno("aluno2", 222, "civil", "6", 198291));
        listaDePessoas.add(new Pessoa("Paulo", 53434));
        listaDePessoas.add(new Aluno("aluno3", 333, "computacao", "4", 1874));
        listaDePessoas.add(new Pessoa("Maria", 73827));
        listaDePessoas.add(new Professor("Valmor", 158796496, "Mestre em Ciências da Computação", 15000, "Ciências Sociais"));
        listaDePessoas.add(new Aluno("aluno4", 623, "eletrica", "1", 98234));
        
        // testando a operacao de listar alunos.
        listaAlunos();
        
        // testando a operacao de listar professores
        listaProfessores();
        
    }
}
