package Methods6;

public class StaticAndNonStaticMethodCall {
    static void display(){
        System.out.println("Static method");
    }
    void display2(){
        System.out.println("non static method");
    }
    public static void main(String[] args){
        display();

        //we should create an object before calling the non static method because
        // that method directly belongs to an object(instance) of a class
        StaticAndNonStaticMethodCall n = new StaticAndNonStaticMethodCall();
        n.display2();
    }
}
//What happens if you don't create an object?
// Compilation error
//Because main() is static, and you're trying to call a non-static method directly from it.
//Java doesn't know which Student object's display() method you want to execute.

//Why don't static methods need objects?
//Because static methods belong to the class itself.

//However, remember that static methods cannot directly access instance variables or instance methods because
// they don't have an implicit current object (this).
