package chess;

public class Pawn extends Piece{
	private PieceColour colour;
	private String symbol;

	public Pawn(PieceColour pc){
		if (pc.equals(PieceColour.WHITE)){
			this.colour=PieceColour.WHITE;
			this.symbol="♙";
		}
		else if (pc.equals(PieceColour.BLACK)){
			this.colour=PieceColour.BLACK;
			this.symbol="♟";
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
		if(Board.hasPiece(i1, j1) == false){
			if(j0 - j1 == 0){
				if(i1-i0 == 1 && this.colour == PieceColour.BLACK){
					return true;
				}
				else if (i1-i0 == 2 && this.colour == PieceColour.BLACK && i0 == 1){
					return true;
				}
				if(i0-i1 == 1 && this.colour == PieceColour.WHITE){
					return true;
				}
				else if (i0-i1 == 2 && this.colour == PieceColour.WHITE && i0 == 6){
					return true;
				}
			}
		}
		else{
			Piece piece = Board.getPiece(i1, j1);
			if(piece.getColour() != this.colour){
			if(j0 - j1 == 1 || j1- j0 == 1){
				if(i1-i0 == 1 && this.colour == PieceColour.BLACK){
					return true;
				}
				if(i0-i1 == 1 && this.colour == PieceColour.WHITE){
					return true;
					}
				}
			}
		}
		return false;
	}

}
