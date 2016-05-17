public class GuessGame
{
	Player p1;
	Player p2;
	Player p3;

	public void startGame()
	{
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();

		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;

		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;

		int targetNumber = (int)(Math.random() * 10);
		System.out.println("I'm thinking of a number between 0 and 9 ...");

		while(true)
		{
			String announceTarget = new StringBuilder("The number to guess is ").append(targetNumber).toString();
			System.out.println(announceTarget);

			p1.guess();
			p2.guess();
			p3.guess();

			guessp1 = p1.number;
			String p1Guess = new StringBuilder("Player one guessed ").append(guessp1).toString();
			System.out.println(p1Guess);

			guessp2 = p2.number;
			String p2Guess = new StringBuilder("Player two guessed ").append(guessp2).toString();
			System.out.println(p2Guess);

			guessp3 = p3.number;
			String p3Guess = new StringBuilder("Player three guessed ").append(guessp3).toString();
			System.out.println(p3Guess);

			if(guessp1 == targetNumber)
			{
				p1isRight = true;
			}
			if(guessp2 == targetNumber)
			{
				p2isRight = true;
			}
			if(guessp3 == targetNumber)
			{
				p3isRight = true;
			}

			if(p1isRight || p2isRight || p3isRight)
			{

				System.out.println("We have a winner!");
				String p1Right = new StringBuilder("Player one got it right? ").append(p1isRight).toString();
				System.out.println(p1Right);
				String p2Right = new StringBuilder("Player two got it right? ").append(p2isRight).toString();
				System.out.println(p2Right);
				String p3Right = new StringBuilder("Player three got it right? ").append(p3isRight).toString();
				System.out.println(p3Right);
				System.out.println("Game is over.");
				break;
			}
			else
			{
				System.out.println("Players will have to try again.");
				break;
			}
		}
	}
}