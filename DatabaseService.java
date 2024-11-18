package comp303.decorator;

public class DatabaseService
{

	public DatabaseService()
	{

	}

	public String getMailFromUsername(String username)
	{
		return username + "@Mail.com";
	}

	public String getPhoneFromUsername(String username)
	{
		return username + "@Phone";
	}

	public String getFBNameFromUsername(String username)
	{
		return username + "@Facebook";
	}

}
