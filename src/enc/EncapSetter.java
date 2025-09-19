package enc;

class PasswordManager{
	private String password;
	public void setPassword(String p){
		password = p;
		System.out.println("Password changed Successfully to " +password);
	}
}

public class EncapSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PasswordManager pm = new PasswordManager();
		pm.setPassword("Krish@9876");

	}

}
