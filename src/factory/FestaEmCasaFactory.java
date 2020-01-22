package factory;

import java.util.ArrayList;
import java.util.List;

import decorator.Cenario;
import decorator.CenarioDecorator;
import decorator.LuzDecorator;
import decorator.MovDecorator;

public class FestaEmCasaFactory extends AmbienteFactory{
	
	public FestaEmCasaFactory() {}
	
	public List<CenarioDecorator> criarAmbiente() {
		List<CenarioDecorator> L = new ArrayList<CenarioDecorator>();
		L.add(new LuzDecorator(new Cenario("Cozinha")));
		L.add(new MovDecorator(new LuzDecorator( new Cenario("Sala"))));
		return L;
	}
}
