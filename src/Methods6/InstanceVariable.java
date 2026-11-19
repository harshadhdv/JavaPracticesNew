package Methods6;
//40. Create a class with an instance variable and access it inside an instance method.
public class InstanceVariable {
    int num  ;
     void printnum(int num2){
         num=num2;
        System.out.println(num);
    }
    public static void main(String[] args){
         InstanceVariable i1 = new InstanceVariable();
         i1.printnum(7);;
    }
}
//since printnum is a non static method / a instance method ...we should create an object
//before calling the method .
//there are two types in this method
//1. giving input to the method while calling it using passing parameters
//2. directly declaring and valuating the instance variable ;
//an instance variable belongs to every individual object in the class .
//each object can have its own value to the instance method
