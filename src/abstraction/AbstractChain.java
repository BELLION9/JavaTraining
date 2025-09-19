package abstraction;

abstract class Employee {
    abstract void work();
}

abstract class Developer extends Employee {
    abstract void language();
}

class JavaDeveloper extends Developer {
    void work() {
        System.out.println("Writes code");
    }
    void language() {
        System.out.println("Uses Java");
    }
}

public class AbstractChain {
    public static void main(String[] args) {
        JavaDeveloper jd = new JavaDeveloper();
        jd.work();
        jd.language();
    }
}
