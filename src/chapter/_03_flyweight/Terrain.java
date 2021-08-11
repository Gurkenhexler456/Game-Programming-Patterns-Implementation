package chapter._03_flyweight;

public class Terrain {

	private 	int 		m_MovementCost;
	private 	boolean 	m_IsWater;
	private		TerrainType	m_Type;
	
	public Terrain(int _movementCost, boolean _isWater, TerrainType _type) {
		m_MovementCost 	= 	_movementCost;
		m_IsWater 		= 	_isWater;
		m_Type 			= 	_type;
	}
	
	public int getMovementCost() {
		return m_MovementCost;
	}
	
	public boolean isWater() {
		return m_IsWater;
	}
	
	public TerrainType getType() {
		return m_Type;
	}
	
}
