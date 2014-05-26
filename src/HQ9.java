import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;


public class HQ9 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
	    String T= inp.readLine();
	    
	    HashSet<String> set=new HashSet<String>();
	    set.add("H");
	    set.add("Q");
	    set.add("9");
	    //set.add("+");
	    
	    boolean flag=false;
	    for(int i=0;i<T.length();i++)
	    {
	    	if(set.contains(Character.toString(T.charAt(i))))
	    			{
	    		flag=true;
	    			}
	    	
	    }
	    if(flag==true)
	    	System.out.println("YES");
	    else
	    	System.out.println("NO");
	}

}
