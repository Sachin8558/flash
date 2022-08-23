package FinalFeature;
 final class XYZ{  
     void demo(){
      System.out.println("XYZ Class Method");
   }  
}  
	   
 
 //Can not inherit the Final class
class FinalMethodExample extends XYZ{  
   void demo(){
      System.out.println("ABC Class Method");
   }  
	     
   public static void main(String args[]){  
	   FinalMethodExample obj= new FinalMethodExample();  
      obj.demo();  
   }  
}