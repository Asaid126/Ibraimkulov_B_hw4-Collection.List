import java.util.Comparator;

public class Sort implements Comparator<String> {
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();     //Заменяет все ниже закомментированное
//        if (o1.length() > o2.length()) {
//            return -1;
//        } else if (o1.length() < o2.length()) {
//            return 1;
//        } else {
//            return 0;
//        }
    }
}




