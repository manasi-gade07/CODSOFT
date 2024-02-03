import java.util.Scanner;
class Grade
{
    public String Grade_pointer(int avg)
    {
        switch (avg/ 10)
        {
            case 10 :
                return "A+";
            case 9:
                return  "A";
            case 8:
                return "B+";
            case 7:
                return "B";
            case 6:
                return "C";
            case 5:
                return "D";

            default:
                return "fail";

        }
    }


}
public class Calculator{
    public static void main(String[] args) {
        int n,total_marks;
        int  avg_percent;
        String grade;
        Scanner sc = new Scanner(System.in);
        Grade p = new Grade();
        System.out.println("Enter number of subjects:");
        n = sc.nextInt();
        total_marks=0;
//     Taken input of marks and calculated total marks
        int  [] marks = new int[n];
        for(int i =0;i<n;i++)
        {
            System.out.println("Enter marks of subject" + " " + (i+1) + " "+ "out of 100:");
            marks[i] = sc.nextInt();
            total_marks += marks[i];
        }

       // Calculated average percentage
        avg_percent= total_marks / n;
        //Calculated Grades
        grade = p.Grade_pointer(avg_percent);
        //Displayed Result:
        System.out.println("Here is your result:");
        System.out.println("Total marks obtained:" + total_marks);
        System.out.println("Percentage Obtained:" + avg_percent + "%");
        System.out.println("Grade Obtained:" + grade);


    }
}
