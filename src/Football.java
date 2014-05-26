import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Football {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		String line= (inp.readLine());

		int count=0;
		int count1=0;

		for(int i=0;i<line.length();i++)
		{
			if(i==line.length()-1)
			{
				break;
			}
			if(line.charAt(i)=='1'&&line.charAt(i+1)=='1')
			{
				count++;
				if(count+1==7)
				{
					break;
				}
			}
			else
			{
				count=0;
			}
			if(line.charAt(i)=='0'&&line.charAt(i+1)=='0')
			{
				count1++;
				if(count1+1==7)
				{
					break;
				}
			}
			else
			{
				count1=0;
			}
		}
		count=count+1;
		count1=count1+1;
		if(count>=7||count1>=7)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}

	}

}
