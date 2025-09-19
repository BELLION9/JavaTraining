package strings;

public class StringsBBRC {

	public static void main(String[] args) {
		StringBuffer sbf = new StringBuffer("Hello Java");
        sbf.replace(6, 10, "World");
        System.out.println("After Replace Buffer: " + sbf);

        StringBuilder sbd = new StringBuilder();
        System.out.println(sbd);
        
        System.out.println("Initial capacity of Builder: " + sbd.capacity());
        sbd.append("This is a long text to check capacity expansion.");
        System.out.println(sbd);
        System.out.println("Capacity after append: " + sbd.capacity());

	}

}
