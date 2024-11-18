package comp303.decorator;

public class Notifier
{
	private final String username;
	protected final DatabaseService databaseService;

	public Notifier(String username)
	{
		this.username = username;
		databaseService = new DatabaseService();
	}

	public String getUsername()
	{
		return username;
	}

	public void send(String msg)
	{

		String mail = databaseService.getMailFromUsername(username);
		System.out.println("Sending " + msg + "By Mail to " + mail);
	}

	public static void main(String[] args)
	{
		System.out.println("test");

	}
}
