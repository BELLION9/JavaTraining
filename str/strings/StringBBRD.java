package strings;

public class StringBBRD {

	public static void main(String[] args) {
		StringBuffer sbf = new StringBuffer("ABCDEFGHIJKL");
        sbf.reverse();
        sbf.delete(3, 6);
        System.out.println(sbf);

        StringBuilder sbd = new StringBuilder("123456789");
        sbd.delete(3, 6); 
        sbd.reverse();
        System.out.println(sbd);

	}

}
