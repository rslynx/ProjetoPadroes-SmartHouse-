package state;
import decorator.CenarioDecorator;

public class IncendioState extends State{

	public IncendioState(CenarioDecorator c) {
		super(c);
		System.out.println("Há incendio na " + c.getNome() + ", favor se dirigir a saida mais proxima.  ");
	}
	
}
