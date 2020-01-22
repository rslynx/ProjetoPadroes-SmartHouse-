package factory;

import java.util.List;

import decorator.CenarioDecorator;

public abstract class AmbienteFactory {
	public abstract List<CenarioDecorator> criarAmbiente();
}
