class Mammal {
   Mammal() {
   }
   public void WhatAmI() {
     System.out.println("Mammal");
   }
}
 
class Dog extends Mammal {
  public void WhatAmI() { 
	  System.out.println("Dog");
   }
}
 
public class Collie {
   public static void main(String argv[]) {
         Collie c = new Collie();
         c.SayHi(10);
         c.SayHi("Jack");
 
         Mammal d = new Dog();
         Mammal m = new Mammal();
                            
	d.WhatAmI();
        m.WhatAmI();
   }
 
   Collie() {
   }
 
  public void SayHi(String name   ) { 
       System.out.println("Hi, " + name);
   }
  public void SayHi(  int id ) { 
       System.out.println("Hi, Dog #" + id);
   }
}