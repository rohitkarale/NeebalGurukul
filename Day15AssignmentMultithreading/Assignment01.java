package neebalsgurukul.day15;

public class Assignment01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread alphabetThread = new Thread(new AlphabetRunnable());
        Thread numberThread = new Thread(new NumberRunnable());

        alphabetThread.start();
        numberThread.start();
	}
	
	static class AlphabetRunnable implements Runnable {
        @Override
        public void run() {
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                System.out.print(ch + " ");
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
	
	static class NumberRunnable implements Runnable {
        @Override
        public void run() {
            for (int num = 1; num <= 26; num++) {
                System.out.print(num + " ");
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
