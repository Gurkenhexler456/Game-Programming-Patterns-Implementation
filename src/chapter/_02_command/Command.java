package chapter._02_command;

import chapter.common.Actor;

public abstract class Command {

	private Actor m_Actor;
	
	public Command(Actor _actor) {
		
		m_Actor = _actor;
	}
	
	public abstract void execute();
	
}
