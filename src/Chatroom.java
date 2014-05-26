import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Chatroom {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		String line= inp.readLine().toString();

		String word="Hello";
		int index=0;
		int count=0;
		boolean flag=false;
		for(int i=0;i<word.length();i++)
		{
			for(int j=index;j<line.length();j++)
			{
				if(Character.toString(word.charAt(i)).equalsIgnoreCase(Character.toString(line.charAt(j))))
				{
				count++;
				index=j+1;
				break;
					
				}
				
			}
			
			if(count==word.length())
			{
				flag=true;
				break;
			}
		}
			
		if(flag==true)
		{
			System.out.println("YES");
		}
		else
			System.out.println("NO");

	}

}
