import java.util.HashSet;
import java.util.Scanner;


public class StringTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		String line=scanner.nextLine();
		
		HashSet<Character> vowelSet=new HashSet<Character>();
		vowelSet.add('a');
		vowelSet.add('e');
		vowelSet.add('i');
		vowelSet.add('o');
		vowelSet.add('O');
		vowelSet.add('u');
		vowelSet.add('A');
		vowelSet.add('I');
		vowelSet.add('E');
		vowelSet.add('U');
		vowelSet.add('y');
		vowelSet.add('Y');

        String result="";
		for(int i=0;i<line.length();i++)
		{
			if(!vowelSet.contains(line.charAt(i)))
			
				result=result+"."+line.charAt(i);
			
			
		}
		System.out.println(result.toLowerCase());
	}

}
