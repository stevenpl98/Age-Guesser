
/* Choose a number from 2-10
 * Multiply that number by 2
 * Then add 5
 * Multiply that number by 50
 * If your birthday has not passed then add (current year-251)
 * If your birthday has passed then add (current year-250)
 * Subtract your birth year from the total
 * 
 * If testing over 100, change num to 2, age will be inaccurate with any number over 2 as num
 */
import java.util.Calendar;
import java.util.Scanner;

public class GuessAge
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Let's guess your age!");
		System.out.println();

		Scanner input = new Scanner(System.in);
		System.out.print("Choose a number between 1 and 10: ");
		int num = input.nextInt();

		System.out.print("Has your birthday passed this year? Type " + '"' + "yes" + '"' + " or " + '"' + "no" + '"' + ": ");
		String passed = input.next();

		System.out.print("What year were you born in? Type the 4 digit year: ");
		int yearBorn = input.nextInt();

		int minusYear = 0;
		int year = Calendar.getInstance().get(Calendar.YEAR);
		
		if (passed.equals("yes"))
		{
			minusYear = minusYear + (year - 250);
		}
		if (passed.equals("no"))
		{
			minusYear = minusYear + (year - 251);
		}

		int numAge = ((((num * 2) + 5) * 50) + minusYear) - yearBorn;

		String newNumAge = Integer.toString(numAge);
		String age = "";
		
		if ((year - yearBorn) >= 100)
		{
			age += newNumAge.substring(0, 3);
			int Age = Integer.parseInt(age) - (num * 100);
			System.out.println("You are " + Age + " years old!");
		}
		else if ((year - yearBorn) < 100 && (year - yearBorn) > 10)
		{
			age += newNumAge.substring(1, 3);
			System.out.println("You are " + age + " years old!");
		}
		else if ((year - yearBorn) < 10 && (year - yearBorn) > 2)
		{
			age += newNumAge.substring(2, 3);
			System.out.println("You are " + age + " years old!");
		}
		else if ((year - yearBorn) < 2)
		{
			age += newNumAge.substring(2, 3);
			System.out.println("You are " + age + " year old!");
		}
	}
}