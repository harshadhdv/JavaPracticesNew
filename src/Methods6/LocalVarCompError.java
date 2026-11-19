package Methods6;

public class LocalVarCompError {
    void display(){
        int num = 7 ;
        System.out.println(num);
    }
    public static void main(String[] args){
        LocalVarCompError l = new LocalVarCompError();
        l.display();
        System.out.println();//num
    }
}
// What happens?
//- number is declared inside the display() method.
//- It can be accessed anywhere inside the display() method after its declaration.
//- It cannot be accessed inside main() because it is outside its scope.
//cannot find symbol
//symbol: variable number

//Important rules to remember
//1. A local variable is declared inside a method, constructor, or block.
//2. Its scope is limited to the block in which it is declared.
//3. It cannot be directly accessed outside that scope.
//4. Local variables must be initialized before use.
//5. When the method finishes execution, its local variables' lifetime ends.

//Interview takeaway:
// Scope determines where a variable can be accessed;
// lifetime determines how long it exists.
// These are related but different concepts.