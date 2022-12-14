//instead of Multiple java


interface Employee{
    public void display();
}



class Demo implements Employee{
    public void display(){
        System.out.println("This is Demo");
    }
}

class Interface1{
    public static void main(String args[])
    {
    Demo obj = new Demo();
    obj.display();

}
}