package decorator;

public class LuzDecorator extends CenarioDecorator{

	public LuzDecorator(CompCenario cenario) {
		super(cenario);
	}

	@Override
	public String ligarLuz() {
		return "Luz ligada em " + getCenario().getNome();
	}

	@Override
	public String desligarLuz() {
		return "Luz desligada em " + getCenario().getNome();
	}
}
