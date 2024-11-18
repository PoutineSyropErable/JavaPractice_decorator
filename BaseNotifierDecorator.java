package comp303.decorator;

public abstract class BaseNotifierDecorator implements INotifier
{
	public final INotifier wrapped;
	protected final DatabaseService databaseService;

	BaseNotifierDecorator(INotifier wrapped)
	{
		this.wrapped = wrapped;
		databaseService = new DatabaseService();

	}

	@Override
	public void send(String msg)
	{
		wrapped.send(msg);
	}

	@Override
	public String getUsername()
	{
		return wrapped.getUsername();
	}

}
