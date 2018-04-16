import java.util.ArrayList;
import java.util.List;
public class OddNumbersExterminator {

    public List<Integer> exterminator(List<Integer> lista) {
        List<Integer> even = new ArrayList<>();
        for (Integer entry : lista) {
            if (entry % 2 == 0) {
                even.add(entry); }
        }

    return even;
    }
}




