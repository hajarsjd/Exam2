import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task4 {
    ArrayList<String> arrayList = new ArrayList<>();
    public void task4() {
        arrayList.add("hello");
        arrayList.add("world");

        Map<Object, List<String>> grouped = arrayList.stream()
                .collect(Collectors.groupingBy(word -> word.charAt(0)));

        grouped.forEach((first, wordList) -> {
            System.out.println(first);
            wordList.forEach(word -> System.out.println(" - " + word));
        });


    }
}
