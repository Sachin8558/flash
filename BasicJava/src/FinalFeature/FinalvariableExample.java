package FinalFeature;
class FinalvariableExample{  

   final int MAX_VALUE=99;
   void myMethod(){  
      MAX_VALUE=101;	//Can not Re-Initialize the final variable.
   }  
   public static void main(String args[]){  
	   FinalvariableExample obj=new  FinalvariableExample();  
      obj.myMethod();  
   }  
}