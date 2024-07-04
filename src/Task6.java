import java.util.Scanner;

public class Task6 {
    Scanner sc = new Scanner(System.in);
    String name = "Azerbaycan";
    int ch = sc.nextInt();
    public void task6(){

           for(int i = 0;i<name.length();i++) {
               String word = name.substring(name.indexOf(ch));
               System.out.println(word);
           }
    }

}
