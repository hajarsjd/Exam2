import java.util.ArrayList;
import java.util.List;

public class Task2 {
    ArrayList<String> arrayList = new ArrayList<>();
    public void task2(){
        arrayList.add("hello");
       arrayList.add("world");

        List<String> list = arrayList.stream()
                .map(word -> new StringBuilder(word).reverse().toString())
                        .toList();

        list.forEach(System.out::println);
    }
}
