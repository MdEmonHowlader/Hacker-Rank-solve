package test1;

class Binding {
    void eat(){
        System.out.println("Binding");
    }
}
 class M extends Binding{
    void eat(){
        System.out.println("M");
    }
    public static void main(String[] args) {
        Binding a= new M();
        a.eat();
    }
}