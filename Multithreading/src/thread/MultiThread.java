package thread;


class Student extends Thread{
	String name;
	Student(String name){
		this.name=name;
	}
	public synchronized void run(){
		for(int i=0;i<5;i++){
			System.out.println(getName()+i+" study");
			System.out.println(Thread.currentThread()+" ");
		}
	}
}
//class Student1 extends Thread{
//	String name;
//	Student1(String name){
//		this.name=name;
//	}
//	public synchronized void study(){
//		for(int i=0;i<5;i++){
//			System.out.println(name+" studying");
//		}
//	}
//}


class MultiThread {
	public static void main(String[] args) {
		Student s=new Student("Tanvir");
		
		//Student1 s1=new Student1("Rahul");
		
		
		Thread t=new Thread(s);
		Thread t1=new Thread(s);
		t.setName("Giri");
		t1.setName("Girish");
		t.setPriority(10);
		
		
		System.out.println(t.getName());
		
		t.start();
		t1.start();
		
	}

	
}
