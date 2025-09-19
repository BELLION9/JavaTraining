package keywords;

public class BankInfo {
	static int acccount= 0;
	String accountHolder;
	BankInfo(String name){
		this.accountHolder = name;
		acccount++;
	}
	void showDetails(){
		System.out.println("Bank Holder Name:" +accountHolder);
		
	}
	
	public static void main(String[] args) {
		BankInfo p= new BankInfo("Priyanshu");
		BankInfo n= new BankInfo("Nikhil");
		p.showDetails();
		n.showDetails();
		System.out.println("Total Acc:" +acccount+ " Acc created");

	}

}
