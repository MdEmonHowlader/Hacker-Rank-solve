package test1;

abstract class Abstraction_OOP {
   void Bike(){
        System.out.println("Bikes");
    }
    abstract void run();
    void changeClass(){
        System.out.println("Change Class");
    }
}


 class Honda extends Abstraction_OOP{
    void run(){
        System.out.println("Run");
    }
    
}
 class Test  {
    public static void main(String[] args) {
        Abstraction_OOP e= new Honda();
     
        e.changeClass();
           e.run();
    }
}
