package thread;

public class Car extends Thread{
	
	public synchronized void sum(){
		for(int i=0;i<5;i++){
			System.out.println("Car running");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
