package decorator;

public class Cenario implements CompCenario {

	protected String nome;	
	
	public Cenario(String nome) {
		this.nome = nome;
	}

	@Override
	public String ligarLuz() {
		return "Ligou luz";
	}

	@Override
	public String desligarLuz() {
		return "Desligou luz";
	}

	@Override
	public String movimento() {
		return "MOVEU";
	}
	
	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
