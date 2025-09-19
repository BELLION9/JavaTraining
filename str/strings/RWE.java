package strings;

public class RWE {

	public static void main(String[] args) {
		StringBuilder log = new StringBuilder();

        log.append("Smart Home Log:\n");
        log.append("Device: Light -> ON\n");
        log.append("Device: Fan -> OFF\n");

        int start = log.indexOf("Fan");
        log.replace(start, start + 10, "Fan -> ON");

        System.out.println(log);

	}

}

