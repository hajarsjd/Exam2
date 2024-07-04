import java.util.Scanner;

public class Task5 {
    Scanner scanner = new Scanner(System.in);
    String name = "Melek";
    String userName = scanner.nextLine();
    public void task5(){

        char[] ch = name.toCharArray();
       if(userName.equalsIgnoreCase(name)) {
           System.out.println("Name is: " +name);
       }else{
           System.out.println("Error");
       }
    }

}
