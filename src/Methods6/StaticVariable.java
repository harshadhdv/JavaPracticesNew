package Methods6;

//41. Create a static variable and access it from two different static methods
public class StaticVariable {
    static int num = 10;
    //static variable with value
    static int num2 ;
    //static variable without value
    static void display(){
        System.out.println(num);
    }
    static void display(int a){
        num2=a;
        System.out.println(num2);
        sum(num2);
        //the num2 has a value here, it is passed to the sum method .
        //without initializing a value to the num2 and passing it to the sum method
        //is invalid
    }
    static void sum(int a){
        System.out.println(num+a);
    }
    public static void main(String[] args){
        display();
        display(7);
        sum(5);
    }
}
//a static variable belongs to the class rather than the individual objects .
//all the instance of this class share the same variable .