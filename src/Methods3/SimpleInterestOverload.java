package Methods3;

//22. Create overloaded calculate() methods to calculate simple interest using different parameter combinations.

public class SimpleInterestOverload {
    //method1:calculates with given all variables
    public static int calculate(int p , int r , int t){
        return (p*r*t)/100;
    }
    //method1:calculates with time t as default 1
    public static int calculate(int p , int r ){
        return(p*r*1)/100;
    }
    //methos3:calculates with time t as default 1 and rate r as default 5%
    public static int calculate(int p){
        return(p*5*1)/100;
    }
    public static void main(String[] args){
        System.out.println(calculate(10000,5,1));
        System.out.println(calculate(10000,5));
        System.out.println(calculate(10000));
    }

}
