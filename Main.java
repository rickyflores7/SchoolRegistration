import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;

public class Main  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student = new Student();

        System.out.println("================================");
        System.out.println("\t MDI Novare University");
        System.out.println("    Powered by : StackTrek");
        System.out.println("================================");
        System.out.println("\t  BE DIFFERENT BE US");
        System.out.println("================================");
        System.out.println("\tSchool Registration Form");
        System.out.println("\t  User Creation Portal");

        System.out.print("\nFirst name: ");
        student.setFirstName(scanner.nextLine());

        System.out.print("Last name: ");
        student.setLastName(scanner.nextLine());

        System.out.print("Birthday (YYYY/MM/DD): ");
        student.setBirthday(scanner.nextLine());

        System.out.print("Course: ");
        student.setCourse(scanner.nextLine());

        System.out.print("Email Address: ");
        student.setEmail(scanner.nextLine());
        System.out.println("===================================");
        System.out.println("Student Number: "+ student.getStudentNumber());
        System.out.println("===================================");
        scanner.close();
    }

}