package comp303.decorator;

public class WhatsAppNotifier extends Notifier
{
	public WhatsAppNotifier(String username)
	{
		super(username);
	}

	@Override
	public void send(String msg)
	{
		String phoneNbr = databaseService.getPhoneFromUsername(getUsername());
		System.out.println("Sending " + msg + " By WhatsApp on " + phoneNbr);
	}

}
