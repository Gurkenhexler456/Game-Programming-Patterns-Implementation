package chapter.common.math;

public class Vector2f {

	protected float m_X;
	protected float m_Y;
	
	/**
	 * creates a 2D vector with the given components
	 * @param _x the x component of the new vector
	 * @param _y the y component of the new vector
	 */
	public Vector2f(float _x, float _y) {
		
		m_X = _x;
		m_Y = _y;
	}
	
	/**
	 * creates a new vector and zeroes its components
	 */
	public Vector2f() {
		
		this(0, 0);
	}
	
	
	/**
	 * adds the other vector to this and stores it in this
	 * @param _other the vector to add from this vector
	 */
	public void add(Vector2f _other) {
		
		m_X += _other.getX();
		m_Y += _other.getY();
	}
	
	/**
	 * subtracts the other vector to this and stores it in this
	 * @param _other the vector to substract from this
	 */
	public void sub(Vector2f _other) {
		
		m_X -= _other.getX();
		m_Y -= _other.getY();
	}
	
	/**
	 * multiplies a vector with this
	 * @param _other the vector to multiple with this
	 */
	public void mult(Vector2f _other) {
		
		m_X *= _other.getX();
		m_Y *= _other.getY();
	}
	
	/**
	 * divides a vector with this
	 * @param _other the vector to divide with this
	 */
	public void div(Vector2f _other) {
		
		m_X /= _other.getX();
		m_Y /= _other.getY();
	}
	
	/**
	 * clones the current vector and returns it
	 * @return the cloned vector
	 */
	public Vector2f clone() {
		
		return new Vector2f(m_X, m_Y);
	}
	
	
	/**
	 * sets the components of the vectors
	 * @param _x the new x component of the vector
	 * @param _y the new y component of the vector
	 */
	public void set(float _x, float _y) {
		
		m_X = _x;
		m_Y = _y;
	}
	
	/**
	 * sets the components of the vectors
	 * @param _other the vector to copy the content from
	 */
	public void set(Vector2f _other) {
		
		m_X = _other.getX();
		m_Y = _other.getY();
	}
	
	
	/**
	 * returns the x component of the vector
	 * @return the x component
	 */
	public float getX() {
		
		return m_X;
	}
	
	/**
	 * sets the x component of the vector
	 * @param _x the new value for the x component
	 */
	public void setX(float _x) {
		
		m_X = _x;
	}
	
	/**
	 * returns the y component of the vector
	 * @return the y component
	 */
	public float getY() {
		
		return m_Y;
	}

	/**
	 * sets the y component of the vector
	 * @param _y the new value for the y component
	 */
	public void setY(float _y) {
		
		m_Y = _y;
	}
	
	public String toString() {
		
		StringBuilder result = new StringBuilder();
		result.append("(");
		result.append(String.format("%5.2f", m_X));
		result.append(", ");
		result.append(String.format("%5.2f", m_Y));
		result.append(")");
		return result.toString();
	}
	
}
