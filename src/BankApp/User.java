package BankApp;

public class User {
	
	protected static String usersName;
	protected static int userId;
	protected static int userPin;

	public User(int userId, String usersName, int userPin) {
		this.userId = userId;
		this.usersName = usersName;
		this.userPin = userPin;
		
		//Set default user info:
		setUserId(123);
		setUserPin(123);
		
	}

	public String getUsersName() {
		return usersName;
	}

	public void setUsersName(String usersName) {
		this.usersName = usersName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getUserPin() {
		return userPin;
	}

	public void setUserPin(int userPin) {
		this.userPin = userPin;
	}


}
