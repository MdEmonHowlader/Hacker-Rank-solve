package test1;

public class Em {
    int i=12;
    public void E(int j){
        System.out.println(i);
        this.i=j*10;
    }
}

 class N extends Em{
    public  N(int j){
        super.E(j);
        System.out.println(i);
        this.i=j*20;
    }
}

 class MainClass{
    public static void main(String[] args) {
        N test= new N(26);
        System.out.println(test.i);
        

    }
}