package smarthouse;

import java.util.List;

import decorator.Cenario;
import decorator.CenarioDecorator;
import decorator.LuzDecorator;
import decorator.MovDecorator;
import factory.FestaEmCasaFactory;
import factory.FestaNaPiscinaFactory;
import state.IncendioState;
import state.NormalState;
import state.State;

public class Main {

	public static void main(String[] args) {
		
		
		CenarioDecorator sala  = new MovDecorator(new LuzDecorator( new Cenario("Sala")));
		List<CenarioDecorator> festaEmCasa = new FestaEmCasaFactory().criarAmbiente();
		List<CenarioDecorator> festaNaP = new FestaNaPiscinaFactory().criarAmbiente();
		System.out.println(sala.ligarLuz());
		System.out.println(sala.movimento());
		System.out.println(festaEmCasa.get(1).desligarLuz());
		System.out.println(festaNaP.get(1).ligarLuz());
		System.out.println(festaNaP.get(1).desligarLuz());
		State normalState = new NormalState(sala);
		State incendioState = new IncendioState(sala);

	}

}
