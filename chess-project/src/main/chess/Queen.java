package chess;

class Queen extends Piece{
	private PieceColour colour;
	private String symbol;

	Queen(PieceColour pc){
		if (pc.equals(PieceColour.WHITE)){
			this.colour=PieceColour.WHITE;
			this.symbol="♕";
		}
		else if (pc.equals(PieceColour.BLACK)){
			this.colour=PieceColour.BLACK;
			this.symbol="♛";
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
		if(new Bishop(this.colour).isLegitMove(i0, j0, i1, j1) == true || new Rook(this.colour).isLegitMove(i0, j0, i1, j1) == true){
			return true;
		}
		return false;
	}

}
