
public class Piece {
		
	private char side;
	private char type; // 'Q', 'K'(King), 'B', 'R', 'N'(Knight), 'P',
	private int[][] moves;
	
	
	
	Piece(char side, char type, int[][] moves){
		this.side = side;
		this.type = type;
		this.moves = moves;
		//this.moves = moves;
		
		//if (this.type == Pawn)
		
	}
}
