package chapter._02_command;

import java.util.LinkedList;
import java.util.Random;
import java.util.Stack;

import chapter.PatternTest;
import chapter.common.Player;
import chapter.common.math.Vector2f;

public class CommandTest extends PatternTest {

	private Random m_PRNG = new Random();
	
	@Override
	public void test() {
		
		Stack<ICommand> done 		= new Stack<ICommand>();
		Player			player 		= new Player(); 
		
		int 			iterations 	= m_PRNG.nextInt(10) + 10;
		
		for(int i = 0; i < iterations; i++) {
			
			int steps = m_PRNG.nextInt(20) + 2;
			
			for(int s = 0; s < steps; s++) {
				ICommand cmd = emitRandomMove();
				cmd.execute(player);
				done.push(cmd);
				
				System.out.printf("executed player movement: %s\n", player.getPosition().toString());
			}
			
			steps = m_PRNG.nextInt(done.size());
			
			for(int s = 0; s < steps; s++) {
				ICommand cmd = done.pop();
				cmd.undo(player);
				
				System.out.printf("undid player movement: %s\n", player.getPosition().toString());
			}
		}
		
	}
	
	public ICommand emitRandomMove() {
		
		int x = m_PRNG.nextInt(3) - 1;
		int y = m_PRNG.nextInt(3) - 1;
		
		return new MovementCommand(new Vector2f(x, y));
	}

}
