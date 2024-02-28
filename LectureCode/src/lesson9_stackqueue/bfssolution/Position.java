package lesson9_stackqueue.bfssolution;

class Position{
	int row;
	int col;
	Position(int row, int col){
		this.row = row;
		this.col = col;
	}
	public boolean equals(Object o){
		if(!(o instanceof Position)){
			return false;
			
		}
		Position pos = (Position)o;
		return (pos.row == row && pos.col == col);
	}
	
	public int hashCode() {
		return row * Board.SIZE + col;
	}
	
	
}