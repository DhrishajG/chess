package chess;

class Rook extends Piece{
	private PieceColour colour;
	private String symbol;

	Rook(PieceColour pc){
		if (pc.equals(PieceColour.WHITE)){
			this.colour=PieceColour.WHITE;
			this.symbol="♖";
		}
		else if (pc.equals(PieceColour.BLACK)){
			this.colour=PieceColour.BLACK;
			this.symbol="♜";
		}
	}

	public String getSymbol(){
		return symbol;
	}
	public PieceColour getColour(){
		return colour;
	}

	boolean isLegitMove(int i0, int j0, int i1, int j1) {
		if(Board.hasPiece(i1, j1) && Board.getPiece(i1, j1).getColour() == this.colour){
			return false;
		}
		if(i0-i1 == 0){
			int jOffSet = -1;
			if (j0<j1){
				jOffSet = 1;
			}
			for(int j = j0+jOffSet; j != j1; j += jOffSet){
				if(Board.hasPiece(i0, j)){
					return false;
				}
			}
		}
		else if(j0-j1 == 0){
			int iOffSet = -1;
			if (i0<i1){
				iOffSet = 1;
			}
			for(int i = i0+iOffSet; i != i1; i += iOffSet){
				if(Board.hasPiece(i, j0)){
					return false;
				}
			}
		}
		else{
			return false;
		}
		return true;
	}
}
