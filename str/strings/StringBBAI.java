package strings;

public class StringBBAI {

	public static void main(String[] args) {
		StringBuffer sbf = new StringBuffer("Hello ");
		sbf.append(" World!");
		sbf.insert(6, "Programming");
		System.out.println(sbf);
		StringBuilder sbr = new StringBuilder("Hello ");
		sbr.append(" World!");
		sbr.insert(6, "Programming");
		System.out.println(sbr);

	}

}
