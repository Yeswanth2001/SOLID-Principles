/**

Problem - It breaks Single Responbility Principle where class or interface should have only one responbility but below covering multiple functionality in single interface.

interface IUser {
	
	void login();
	void register();
	void logError();
	void sendMail();
	
} 

**/

// Solution - Break the functionality into multiple interface.

interface IUser {
	
	void login();
	void register();
	
}

interface ILogger {
	
	void logError();
	
}

interface IMail {
	
	void sendMail();
}

class SRP {
	public static void main(String[] args) {
		
	}
}