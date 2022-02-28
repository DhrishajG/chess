package chess;

class King extends Piece{
	private PieceColour colour;
	private String symbol;

	King(PieceColour pc){
		if (pc.equals(PieceColour.WHITE)){
			this.colour=PieceColour.WHITE;
			this.symbol="♔";
		}
		else if (pc.equals(PieceColour.BLACK)){
			this.colour=PieceColour.BLACK;
			this.symbol="♚";
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
		if(Math.abs(i0-i1) != 1 || Math.abs(j0-j1) != 1){
			return false;
		}
		if(new Queen(this.colour).isLegitMove(i0, i1, j0, j1) == true){
			return true;
		}
		return true;
	}

}
