public class Player
{
	int number = 0;

	public void guess()
	{
		number = (int)(Math.random() * 10);
		String guessing = new StringBuilder("I'm guessing ").append(number).toString();
		System.out.println(guessing);
	}
}
