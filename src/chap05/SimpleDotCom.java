package chap05;

public class SimpleDotCom {
	int[] locationCells;
	int numOfHits=0;
	
	public void setLocationCells(int[] locs) {
		locationCells=locs;
	}
	
	public String checkYourself(String userGuess) {
		int guess=Integer.parseInt(userGuess);
		String result="miss";
		for(int cell:locationCells) {
			if(guess==cell) {
				numOfHits++;
				result="hit";
				break;
			}
		}
		if(numOfHits==locationCells.length) {
			result="kill";
		}
		System.out.println(result);
		return result;
	}
}
