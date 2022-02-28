package chess;

public class CheckInput {

	public static boolean checkCoordinateValidity(String input){
		if(input.length() != 2){
			return false;
		}
		char c1 = input.charAt(0);
		char c2 = input.charAt(1);
		if(c1 == '1' || c1 == '2' || c1 == '3' || c1 == '4' || c1 == '5' || c1 == '6' || c1 == '7' || c1 == '8'){
			if(c2 == 'a' || c2 == 'b' || c2 == 'c' || c2 == 'd' || c2 == 'e' || c2 == 'f' || c2 == 'g' || c2 == 'h'){
				return true;
			}
		}
		return false;
	}
}
