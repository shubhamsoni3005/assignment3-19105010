public class Ques1 {
    public static int compareStrings(String s1, String s2) {
        for (int i = 0; i < s1.length() && i < s2.length(); i++) { //loop through strings
            if (s1.charAt(i) == s2.charAt(i)) //if char is same then, continue
                continue;
            else
                return s1.charAt(i) - s2.charAt(i); //if different, return difference
        }

        if (s1.length() != s2.length()) //edge case for strings having some common part
            return s2.length() - s1.length();
        else //strings are equal
            return 0;
    }

    public static void main(String[] args) {
        String s1 = new String("shubham");
        String s2 = new String("soni");
        String s3 = new String("shubham");
        String s4 = new String("shubhamsoni");

        System.out.println(compareStrings(s1, s2));
        System.out.println(compareStrings(s1, s3));
        System.out.println(compareStrings(s2, s1));
        System.out.println(compareStrings(s4, s1));
        System.out.println(compareStrings(s1, s4));
    }
}
