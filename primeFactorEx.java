package threading_programs;

class primeThread extends Thread{
	public void run() {
		System.out.println("Prime numbers between 1 to 20: ");
		for(int i = 2; i <= 20; i++) {
			boolean isPrime= true;
			for(int j = 2; j <= i / 2; j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(i);
			}
		}
	}
}
class factorThread extends Thread{
	public void run() {
		System.out.println("Factors between 1 to 20: ");
		for(int n = 1; n <= 20; n++) {
			System.out.println("Factor of "+ n + ":");
			for(int i = 1; i <= n; i++) {
				if(n % i == 0) {
				System.out.println(i + " ");
				}
			}
		}
	}
}
public class primeFactorEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primeThread pt = new primeThread();
		factorThread ft = new factorThread();
		pt.start();
		ft.start();
	}

}