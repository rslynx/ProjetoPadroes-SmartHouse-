package factory;

import java.util.ArrayList;
import java.util.List;

import decorator.Cenario;
import decorator.CenarioDecorator;
import decorator.LuzDecorator;
import decorator.MovDecorator;

public class FestaNaPiscinaFactory extends AmbienteFactory{
	
	public FestaNaPiscinaFactory() {}
	
	public List<CenarioDecorator> criarAmbiente() {
		List<CenarioDecorator> L = new ArrayList<CenarioDecorator>();
		L.add(new LuzDecorator(new Cenario("Cozinha")));
		L.add(new LuzDecorator( new Cenario("Jardim")));
		return L;
	}
}
