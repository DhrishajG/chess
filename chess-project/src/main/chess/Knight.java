package chess;

class Knight extends Piece{
	private PieceColour colour;
	private String symbol;

 	Knight(PieceColour pc){
		if (pc.equals(PieceColour.WHITE)){
			this.colour=PieceColour.WHITE;
			this.symbol="♘";
		}
		else if (pc.equals(PieceColour.BLACK)){
			this.colour=PieceColour.BLACK;
			this.symbol="♞";
		}
	}

	public String getSymbol(){
		return symbol;
	}
	public PieceColour getColour(){
		return colour;
	}

	@Override
	boolean isLegitMove(int i0, int j0, int i1, int j1) {
		if(Board.hasPiece(i1, j1)){
			if(Board.getPiece(i1, j1).getColour() == this.colour){
				return false;
			}
		}
		if(Math.abs(i0-i1) == 2 && Math.abs(j0-j1) == 1){
			return true;
		}
		if(Math.abs(i0-i1) == 1 && Math.abs(j0-j1) == 2){
			return true;
		}
		return false;
	}
}
