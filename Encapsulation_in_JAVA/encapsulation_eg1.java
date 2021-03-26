class Encapsulation {
   private String name;
   private String id;
   private int age;

   public int getAge() {                                //getter methods
      return age;
   }

   public String getName() {
      return name;
   }

   public String getId() {
      return id;
   }

   public void setAge( int newAge) {                    //setter methods
      age = newAge;
   }

   public void setName(String newName) {
      name = newName;
   }

   public void setId( String newId) {
      id = newId;
   }
}
class Main {                                  //any class that wants to access the variables should access the methods through these getters and setters.

   public static void main(String args[]) {
      Encapsulation encap = new Encapsulation();
      encap.setName("Aryan_Pratap");
      encap.setAge(22);
      encap.setId("18030141CSE056");

      System.out.println("Name : " + encap.getName());
      System.out.println("Age : " + encap.getAge());
      System.out.println("Id : " + encap.getId());
   }
}
