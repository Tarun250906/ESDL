import java.util.Scanner;

public class stringsop{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1=scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2=scanner.nextLine();

        System.out.print("Enter third string: ");
        String str3=scanner.nextLine();

        String fullstring=str1+" "+str2+" "+str3;
        boolean running=true;
        while(running){
            System.out.println("\n--- String Operations Menu ---");
            System.out.println("1.Show Final String");
            System.out.println("2.Length of String");
            System.out.println("3.Character at Position");
            System.out.println("4.Convert to Uppercase");
            System.out.println("5.Convert to Lowercase");
            System.out.println("6.Exit");
            System.out.print("Enter your choice: ");

            int choice=scanner.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Final string: "+fullstring);
                    break;

                case 2:
                    System.out.println("Length of string is: "+fullstring.length());
                    break;

                case 3:
                    System.out.print("Enter position (0 to "+(fullstring.length()-1)+"): ");
                    int x = scanner.nextInt();
                    if (x >= 0 && x < fullstring.length()) {
                        System.out.println("Character at position "+x+": "+fullstring.charAt(x));
                    } else {
                        System.out.println("Invalid position!");
                    }
                    break;

                case 4:
                    System.out.println("Uppercase string: "+fullstring.toUpperCase());
                    break;

                case 5:
                    System.out.println("Lowercase string: "+fullstring.toLowerCase());
                    break;

                case 6:
                    System.out.println("program exited");
                    running=false;
                    break;
                    default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 6.");
            }
        }
        scanner.close();
    }
}
