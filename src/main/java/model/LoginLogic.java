package model;

public class LoginLogic {
	public boolean execute(Login login) {
//		System.out.println("userId");
//		LoginServlet s = new LoginServlet();
		String userId = login.getUserId();
		String pass = login.getPass();
		System.out.println(userId + pass);
		if (userId.equals("root") && pass.equals("1234")) {
			System.out.println("a");
			return true;
		}else {
			System.out.println("i");
			return false;
		}

	}

}
