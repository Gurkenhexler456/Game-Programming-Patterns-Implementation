package chapter.common;

import chapter.common.math.Vector2f;

public class Actor {
	
	private Vector2f m_Position;
	
	
	public Actor(Vector2f _position) {
		m_Position = _position;
	}
	
	public Actor() {
		this(new Vector2f());
	}
	
}
