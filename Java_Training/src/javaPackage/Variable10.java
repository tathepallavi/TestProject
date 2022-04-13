package javaPackage;

public class Variable10 {
	
	// Total 5 teams - how many mathch will be there
	public static void main(String[] args) {
		
		int totalTeams = 5;
		
		//combination formula will use
		int totalPlayedMatch = (totalTeams * (totalTeams - 1)) /2 ;
		
		System.out.println(totalPlayedMatch); // 10
		
		
		
	}

}
