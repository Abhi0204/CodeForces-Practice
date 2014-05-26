import java.util.Scanner;


public class NextRound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		String line=scanner.nextLine();
		int totalParticipants=Integer.parseInt(line.split(" ")[0]);
	    int cutoffScoreParticipant=Integer.parseInt(line.split(" ")[1]);
	    int count=0;
	    line=scanner.nextLine();
	    
	    String[] lineArray=line.split(" ");
	    int cutoffScore=Integer.parseInt(lineArray[cutoffScoreParticipant-1]);
	    for(String str:lineArray)
	    {
	    	if (Integer.parseInt(str)>=cutoffScore && Integer.parseInt(str)!=0)
	    	{
	    		count++;
	    	}
	    }
	    System.out.println(count);
	    	
	    

	}

}
