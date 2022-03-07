package chess;

public class Bishop extends Piece{
	private PieceColour colour;
	private String symbol;

	public Bishop(PieceColour pc){
		if (pc.equals(PieceColour.WHITE)){
			this.colour=PieceColour.WHITE;
			this.symbol="♗";
		}
		else if (pc.equals(PieceColour.BLACK)){
			this.colour=PieceColour.BLACK;
			this.symbol="♝";
		}
	}

	public String getSymbol(){
		return symbol;
	}
	public PieceColour getColour(){
		return colour;
	}

	@Override
	public boolean isLegitMove(int i0, int j0, int i1, int j1) {
		int isTrue = -1;
		if(Math.abs(i1-i0) == Math.abs(j1-j0)){
			if(Board.hasPiece(i1, j1) == false || Board.getPiece(i1, j1).getColour() != this.colour){
				int iOffSet = 1;
				int jOffSet = 1;
				if(i0>i1){
					iOffSet = -1;
				}
				if(j0>j1){
					jOffSet = -1;
				}
				int j = j0 + jOffSet;
				for(int i = i0 + iOffSet; i!=i1; i+=iOffSet){
					if(Board.hasPiece(i, j)){
						isTrue ++;
					}
					j += jOffSet;
				}
			}
			else{isTrue++;}
		}
		else{isTrue++;}
		if(isTrue == -1){
			return true;
		}
		return false;
	}
}
