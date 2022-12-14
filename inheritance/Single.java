class Parent{
    int x,y;
    public void create(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void display(){
        System.out.println("x is "+x);
        System.out.println("y is "+y);

    }
}

class Single extends Parent{

    public static void main(String arg[]){
        Single p = new Single();
        p.create(12,13);
        p.display();
        this.x= 10;
        // x(this) = 100;
        p.display();
    }
}