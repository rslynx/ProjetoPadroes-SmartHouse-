package state;

import decorator.CenarioDecorator;

public abstract class State {
	CenarioDecorator c;

	public State(CenarioDecorator c) {
		super();
		this.c = c;
	}
}
