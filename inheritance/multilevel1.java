class A{
    void display(){
        System.out.println("class is A");
    }
}


class B extends A{
    void display1(){
        System.out.println("class is B");
    }
    // void display(){
    //     System.out.println("class is B");
    // }
}

class C extends B {
    void display2(){
        System.out.println("class is c");
    }
}


class Multilevel1{
    public static void main(String arg[]){
        C obj = new c();
        // C obj = new B();

        obj.display();
    }
}