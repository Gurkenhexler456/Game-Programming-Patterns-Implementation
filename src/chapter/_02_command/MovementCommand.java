package chapter._02_command;

import chapter.common.Actor;
import chapter.common.math.Vector2f;

public class MovementCommand implements ICommand {

	private Vector2f m_Offset;
	
	public MovementCommand(Vector2f _offset) {
		
		m_Offset = _offset;
	}
	
	
	@Override
	public void execute(Actor _actor) {
		
		_actor.getPosition().add(m_Offset);
	}

	@Override
	public void undo(Actor _actor) {
		
		_actor.getPosition().sub(m_Offset);
	}

}
