import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class UltraFastMathematician {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
	    String number1= (inp.readLine());
	    String number2= (inp.readLine());

	   int i=0;
	   String result="";
	   while(i<number1.length())
	   {
		   if(number1.charAt(i)==number2.charAt(i))
		   {
			   result=result+"0";
		   }
		   else
		   {
			   result=result+"1";
		   }
		   i++;
	   }
	   System.out.println(result);
	    
	}

}
