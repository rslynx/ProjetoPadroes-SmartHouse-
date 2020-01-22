package decorator;

public class MovDecorator extends CenarioDecorator{

	
	public MovDecorator(CompCenario cenario) {
		super(cenario);
	}

	@Override
	public String movimento() {
		return "houve movimento em " + getCenario().getNome();
	}
}
