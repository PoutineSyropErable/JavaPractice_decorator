package comp303.decorator;

public class FacebookNotifier extends Notifier
{
	public FacebookNotifier(String username)
	{
		super(username);
	}

	@Override
	public void send(String msg)
	{
		String fbName = databaseService.getFBNameFromUsername(getUsername());
		System.out.println("Sending " + msg + " on Facebook to " + fbName);
	}

}
