package comp303.decorator;

public class Main
{

	public static void main(String[] args)
	{

		INotifier notifier = new FacebookDecorator(new WhatsAppDecorator(new Notifier("Nice!")));
		notifier.send("It works!!");

	}

}
