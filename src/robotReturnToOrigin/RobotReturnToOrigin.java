package robotReturnToOrigin;

public class RobotReturnToOrigin {
	public boolean JudgeCircle(String moves) {
        int x =0; 
        int y = 0;
        for (int i = 0; i < moves.Length; i++){
            if (moves[i] == 'R')
            {
                x++;
            }
            else if (moves[i] == 'L')
            {
                x--;
            }
            else if (moves[i] == 'U')
            {
                y++;
            }
            else if (moves[i] == 'D')
            {
                y--;
            }
        }
        if ( x == 0 && y == 0)
        {
            return true;
        }
        
        return false;
    }  
}
