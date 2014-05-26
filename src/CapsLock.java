import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CapsLock {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		String word= inp.readLine().toString();

		if(word.equals(word.toUpperCase()))
		{
			System.out.println(word.toLowerCase());
			return;
		}

		String newWord="";
		boolean flag=false;

		if(Character.toString(word.charAt(0)).equals(Character.toString(word.charAt(0)).toLowerCase()))
		{
			newWord=newWord+Character.toString(word.charAt(0)).toUpperCase();
			for(int i=1;i<word.length();i++)
			{
				if(Character.toString(word.charAt(i)).equals(Character.toString(word.charAt(i)).toUpperCase()))
				{
					newWord=newWord+Character.toString(word.charAt(i)).toLowerCase();
				}
				else
				{
					System.out.println(word);
					return;
				}
			}
			System.out.println(newWord);
		}
		else
		{
			System.out.println(word);
		}



	}

}
