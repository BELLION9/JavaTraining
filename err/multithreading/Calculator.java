package multithreading;
// creation of thread , run , start
class SquareThread extends Thread {
    int num;
    SquareThread(int num){ this.num = num; }
    public void run() { System.out.println("Square of "+num+" = "+(num*num)); }
}class CubeThread extends Thread {
    int num;
    CubeThread(int num){ this.num = num; }
    public void run() { System.out.println("Cube of "+num+" = "+(num*num*num)); }
}class EqiTri extends Thread{
	int num;
	EqiTri(int num){this.num = num;}
	public void run() { System.out.println("Cube of "+num+" = "+(0.5*num*num)); }
}
public class Calculator {
    public static void main(String[] args) {
        Thread t1 = new SquareThread(5);
        Thread t2 = new CubeThread(5);
        Thread t3 = new EqiTri(10);
        t1.start(); t2.start(); t3.start();
    }
}
