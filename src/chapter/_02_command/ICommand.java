package chapter._02_command;

import chapter.common.Actor;

public interface ICommand {

	public void execute(Actor _actor);
	
}
