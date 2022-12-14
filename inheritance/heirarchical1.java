class A{
    void display(){
        System.out.println("class is A");
    }
}


class B extends A{
    void display1(){
        System.out.println("class is B");
    }
}

class C extends A {
    void display2(){
        System.out.println("class is c");
    }
}

class Heirarchical1{
    public static void main(String arg[]){
        C obj = new C();
        obj.display();
    }
}