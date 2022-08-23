package runTimePoly;

public class Solution {
	static void display(Employee e){
		e.work();
	}
	
	public static void main(String[] args) {		
//		Employee e=new Developer();
//		e.work();
		
		display(new Developer());
		display(new Tester());
		
	}
}
