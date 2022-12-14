class Demo{

int x,y;

void create(int x, int y){
    this.x = x;
    this.y = y;

}

void display(){
    System.out.println("x is " +x );
    System.out.println("y is " +y );

}


}

class This_keyword{
    public static void main(String arg[]){
        Demo obj = new Demo();
        obj.create(10, 20);
        obj.display();
        
        obj.x = 100;
        obj.display();
    }
}