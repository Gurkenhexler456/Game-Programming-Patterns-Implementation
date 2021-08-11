package chapter._03_flyweight;

public class World {

	public static final Terrain TERRAIN_GRASS 	= new Terrain(1, false, TerrainType.GRASS);
	public static final Terrain TERRAIN_HILL 	= new Terrain(2, false, TerrainType.HILL);
	public static final Terrain TERRAIN_WATER 	= new Terrain(3, true, TerrainType.WATER);
	
	
	private Terrain[] m_Terrain;
	private int m_Width;
	private int m_Height;
	
	public World(int _width, int _height) {
		
		m_Width 	= _width;
		m_Height 	= _height;
		m_Terrain 	= new Terrain[m_Width * m_Height];
	}
	
	
	public void generateTerrain() {
		
		for(int y = 0; y < m_Height; y++) {
			
			for(int x = 0; x < m_Width; x++) {
				
				int index = x + y * m_Width;
				
				if(Math.random() < 0.1) {
					
					m_Terrain[index] = TERRAIN_HILL;
				}
				else {
					
					m_Terrain[index] = TERRAIN_GRASS;
				}
				
				
				if(x == y) {
					m_Terrain[index] = TERRAIN_WATER;
				}
			}
		}
	}
	
	public Terrain getTerrain(int _x, int _y) {
		
		int index = _x + _y * m_Width;
		
		return m_Terrain[index];
	}
	
}
