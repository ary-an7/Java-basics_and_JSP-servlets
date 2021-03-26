interface Bike
 {  
   void bike();
   void run();  //method without body
   void changeGear();
 }  
 
 class Yamaha implements Bike
 {  
 public void run()
 	{
 		System.out.println("running safely..");
 	} 
public void bike()     
   {
   		System.out.println("bike is created");
   }  
public void changeGear()
   {
   		System.out.println("gear changed");
   }  
 }  

class Main
 {  
 	public static void main(String[] args){  
  	Yamaha obj = new Yamaha();  
  	obj.bike();
  	obj.run();  
  	obj.changeGear(); 

 }  
}  
