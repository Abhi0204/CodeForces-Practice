import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Watermelon {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
	    int T= Integer.parseInt(inp.readLine());
	    
	    if(T%2==0 && T!=2)
	    
	    	System.out.println("yes");
	    
	    else
	    
	    System.out.println("No");	
	    
	}

}
