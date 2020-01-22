package state;

import decorator.CenarioDecorator;

public class NormalState extends State{

	public NormalState(CenarioDecorator c) {
		super(c);
		System.out.println("Todo ok na " + c.getNome());
	}
	
}
