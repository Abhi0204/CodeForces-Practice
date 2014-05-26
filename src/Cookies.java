import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Cookies {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		int total= Integer.parseInt(inp.readLine());
		String line=inp.readLine();
		
		String[] arr=(line.split(" "));
		int result=0;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+Integer.parseInt(arr[i]);
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if((sum-Integer.parseInt(arr[i]))%2==0)
			{
				result++;
			}
		}
		System.out.println(result);
	}

}
