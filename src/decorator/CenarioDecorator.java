package decorator;

public class CenarioDecorator implements CompCenario{
	
	protected CompCenario cenario;
	
	public CenarioDecorator(CompCenario cenario) {
		this.setCenario(cenario);
	}

	
	@Override
	public String ligarLuz() {
		return getCenario().ligarLuz();
	}

	@Override
	public String desligarLuz() {
		return getCenario().desligarLuz();
	}

	@Override
	public String movimento() {
		return getCenario().movimento();
	}

	public CompCenario getCenario() {
		return cenario;
	}

	public void setCenario(CompCenario cenario) {
		this.cenario = cenario;
	}

	@Override
	public String getNome() {
		return cenario.getNome();
	}

	@Override
	public void setNome(String nome) {
		cenario.setNome(nome);
	}
	
	
	

}
