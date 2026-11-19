package Methods6;

//45. Create a Student class with:
//- Instance variables: name, roll number and marks.
//- A method to display student details.
//- A static variable to count the total number of students created.
public class StudentDetails {
    String name;
    int rollno;
    double marks;
    static int count = 0;

   static void studentdisplay(String stuname, int sturoll, double stunark) {
        System.out.println(stuname);
        System.out.println(sturoll);
        System.out.println(stunark);
       System.out.println(" ");
        count++;
    }
    public static void main(String[] args){

        studentdisplay("Harshaa", 9105,316);
        studentdisplay("mrpubg",10109,357);
        studentdisplay("Harshadh",12107,396);
        System.out.println(count);

    }
}