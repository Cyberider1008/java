abstract class A{

public abstract void disp();
//this is rugar method 
public void regular(){
    System.out.println("This is regular absract");
} 

}



class B extends A{

public void disp(){
    System.out.println("It is dissp of class B ");
}

}


class Abstract1{
    public static void main(String arg[]){
        B obj = new B();
        obj.disp();
        // This is regular Method
        obj.regular();
    }
}