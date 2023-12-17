package test1;

public class Excption1 {
    public static void main(String[] args) {
        int a[]=new int[4];
        try{
            System.out.println("Emon try "+ a[4]);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }catch(ArrayIndexOutOfBoundsException e1){
            System.out.println("Array index out of bounds exception");
        }catch(NullPointerException e2){
            System.out.println("Null pointer exception ");
        }
    }
}
