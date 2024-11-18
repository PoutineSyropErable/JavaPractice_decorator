package comp303.decorator;

public class WhatsAppDecorator extends BaseNotifierDecorator
{

	public WhatsAppDecorator(INotifier wrapped)
	{
		super(wrapped);
	}

	@Override
	public void send(String msg)
	{

		super.send(msg);
		String phoneNbr = databaseService.getPhoneFromUsername(getUsername());
		System.out.println("Sending " + msg + " By WhatsApp on " + phoneNbr);
	}
}
