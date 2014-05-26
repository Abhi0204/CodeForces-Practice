import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Taxi {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
	    int T= Integer.parseInt(inp.readLine());
	    String total=inp.readLine();
	    int noOfTaxi=0;
	    int sum=0;
	    int index=0;
	    for(int i=index;i<T;i++)
	    {
	    	
	    	sum=sum+Integer.parseInt(total.split(" ")[i]);
	    	if(sum>4)
	    	{
	    		noOfTaxi++;
	    		index=i;
	    		sum=0;
	    	}
	    	
	    	else if(sum==4)
	    	{
	    		noOfTaxi++;
	    		index=i+1;
	    		sum=0;
	    	}
	    	else if(i==T-1)
	    	{
	    		noOfTaxi++;
	    	}
	    	
	    }
	    
	    System.out.println(noOfTaxi);
	}

}
