import java.util.HashSet;
import java.util.Scanner;


public class Team {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		scanner.nextLine();
		int total=0;
		for(int i=0;i<n;i++)
		{		
			int count=0;

			String line=scanner.nextLine();

			for(int j=0;j<line.trim().length();j++)
			{
				if(line.charAt(j)=='1')
				{
					count++;
				}

				if(count>=2)
				{
					total++;
					break;
				}
			}


		}
		System.out.println(total);
	}

}
