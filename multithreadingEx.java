package threading_programs;
class sumthread extends Thread{
	public void run() {
		int i; 
		int num_sum = 0;;
		for(i = 1; i <= 10; i++) {
			num_sum += i;
			System.out.println("sum =" + num_sum);
			try {
				sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println("Error!");
			}
		}
	}	
}
class productthread extends Thread{
	public void run() {
		int i; 
		int product = 1;
		for(i = 1; i <= 10; i++) {
			product *= i;
			System.out.println("product =" + product);
			try {
				sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println("Error!");
			}
		}
	}	
}
public class multithreadingEx {
	public static void main(String[] args) {
		sumthread st = new sumthread();
		productthread pt = new productthread();
		st.start();
		pt.start();
	}
}


