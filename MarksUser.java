import java.util.Scanner;

public class MarksUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        
        System.out.print("Enter number of subjects: ");
        int size = scanner.nextInt();

        int[] marks = new int[size];

        
        System.out.println("Enter marks for each subject:");
        for (int i = 0; i < size; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

     
        System.out.println("\nMarks entered:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }

        scanner.close();
    }
}



