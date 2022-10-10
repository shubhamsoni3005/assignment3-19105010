import java.util.Arrays;

public class Ques3 {
    public static void sortStrings(String[] strings){
        int n = strings.length;
        String temp;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // to compare one string with other strings
                if (strings[i].compareTo(strings[j]) > 0) {
                    // swapping
                    temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        String[] names = { "Rahul", "Ajay", "Gourav", "Riya" };
        sortStrings(names);
        System.out.println(Arrays.toString(names));
    }
}
