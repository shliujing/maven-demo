package me.lj.pattern.mediator;

public abstract class Colleague {
	protected Mediator mediator;//每一个同事都该知道其中介者

	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}
	
}
