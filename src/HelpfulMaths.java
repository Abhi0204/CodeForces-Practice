import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class HelpfulMaths {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
	    String line= (inp.readLine());
	   
	    String[] arr=line.split("\\+");
	    ArrayList<Integer> arrayList=new ArrayList<Integer>();
	    for(String str:arr)
	    {
	    	arrayList.add(Integer.parseInt(str));
	    }
	    Collections.sort(arrayList);
	    
	    String result=arrayList.get(0).toString();
	    
	    for(int i=1;i<arrayList.size();i++)
	    {
	    	result=result+"+"+arrayList.get(i).toString();
	    }
	    
	    System.out.println(result);
	}

}
