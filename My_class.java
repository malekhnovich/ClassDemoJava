/**
 * Created by maxalekhnovich on 6/15/17.
 */
 class Outer_Demo {
    int num;

    //inner class
    //used to access the private members of a class
    private class Inner_Demo {
        public void print(){
            System.out.println("This is an inner class");
        }
    }

    //Accessing the inner class from the method within

    void display_Inner(){
        Inner_Demo inner =new Inner_Demo();
        inner.print();
    }
}

public class My_class{
    public static void main(String[]args){
        //Instantiating the outer class
        Outer_Demo outer = new Outer_Demo();

        //Accessing the diplay_Inner() method
        outer.display_Inner();
    }

}