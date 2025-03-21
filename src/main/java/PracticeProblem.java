public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static boolean isPalindrome(String line)
	{
		line = line.toLowerCase();
		line = line.replaceAll("\\s", ""); 
		for (int i=0 ; i<line.length()/2 ; i++)
		{
			if (line.charAt(i)!=line.charAt(line.length()-1-i))
			{
				return false;
			}
		}
		return true;
	}



	public static int getAge(String[] names, int[] ages, String name)
	{
		int age=0;
		for (int i = 0; i<names.length; i++)
		{
			if (names[i]==name)
			{
				age = ages[i];
			}
		}
		return age;
	}


	public static int countWords(String line, char letter)
	{
		String[] lineArr = line.split(" ");
		int occurences=0;
		for (int i=0; i<lineArr.length; i++)
		{
			String word = lineArr[i];
			for (int x = 0; x<word.length(); x++)
			{
				if (word.charAt(x)==letter)
				{
					occurences++;
					break;
				}
			}
		}
		return occurences;
	}
}
