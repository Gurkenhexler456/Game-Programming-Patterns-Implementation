package chapter._03_flyweight;

import chapter.PatternTest;

public class FlyweightTest extends PatternTest{


	@Override
	public void test() {
		
		int world_x = 10;
		int world_y = 10;
		
		World world = new World(world_x, world_y);
	
		world.generateTerrain();
		
		for(int y = 0; y < world_y; y++) {
			
			for(int x = 0; x < world_x; x++) {
				
				char c;
				
				switch (world.getTerrain(x, y).getType()) {
				
					case 	GRASS 	: 	c = 'g';
										break;
					case 	HILL 	: 	c = 'h';
										break;
					case 	WATER 	: 	c = 'w';
										break;
					default			:	c = ' ';
				}
				
				System.out.printf(" %c", c);
			}
			
			System.out.printf("\n");
		}
	}
	
}
