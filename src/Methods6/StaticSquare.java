package Methods6;

//43. Create a class with a static method that calculates the square of a number.
public class StaticSquare {
    static int num = 5;
    //directly using the static variable
    static void square(){
        System.out.println(num*num);
    }
    //updating the static variable and using it
    static void square(int a){
        num=a;
        System.out.println(num*num);
    }
    public static void main(String[] args){
        square();
        square(10);
    }
}
//we can also directly call the method square() without parameter
//and also with parameter because that method is overloaded.
