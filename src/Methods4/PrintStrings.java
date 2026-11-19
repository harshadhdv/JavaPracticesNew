package Methods4;

//28. Write a method that accepts multiple Strings and prints each String.

public class PrintStrings {
    public static void printstr(String...str){
        int count = str.length;
        for (int i = 0 ; i <count ; i++){
            System.out.println(str[i]);
        }
    }
    public static void main(String[] args){
        printstr("har","sha","dh");
        printstr("harsha","harshaaa","harsh","dvh");
    }
}
