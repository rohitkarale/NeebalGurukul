package neebalsgurukul.day15;

public class Assignment02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedPrinter sharedPrinter = new SharedPrinter();
        
        Thread evenThread = new Thread(new EvenNumberPrinter(sharedPrinter));
        Thread oddThread = new Thread(new OddNumberPrinter(sharedPrinter));
        
        evenThread.start();
        oddThread.start();
	}

}
class SharedPrinter {
    private volatile boolean isEvenTurn = true;
    
    synchronized void printEven(int number) {
        while (!isEvenTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Even: " + number);
        isEvenTurn = false;
        notify();
    }
    
    synchronized void printOdd(int number) {
        while (isEvenTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Odd: " + number);
        isEvenTurn = true;
        notify();
    }
}

class EvenNumberPrinter implements Runnable {
    private final SharedPrinter sharedPrinter;
    
    public EvenNumberPrinter(SharedPrinter sharedPrinter) {
        this.sharedPrinter = sharedPrinter;
    }
    
    @Override
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            sharedPrinter.printEven(i);
        }
    }
}

class OddNumberPrinter implements Runnable {
    private final SharedPrinter sharedPrinter;
    
    public OddNumberPrinter(SharedPrinter sharedPrinter) {
        this.sharedPrinter = sharedPrinter;
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 19; i += 2) {
            sharedPrinter.printOdd(i);
        }
    }
}