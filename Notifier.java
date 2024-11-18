package comp303.decorator;

public class Notifier implements INotifier
{
	private final String username;
	protected final DatabaseService databaseService;

	public Notifier(String username)
	{
		this.username = username;
		databaseService = new DatabaseService();
	}

	@Override
	public void send(String msg)
	{

		String mail = databaseService.getMailFromUsername(username);
		System.out.println("Sending " + msg + "By Mail to " + mail);
	}

	@Override
	public String getUsername()
	{
		return username;
	}

	// -----------------------------------------------------------------------------------
	public static void main(String[] args)
	{
		System.out.println("test");

	}
}
