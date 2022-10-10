import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //initialize scanner object to take input
        int n = sc.nextInt(); //taking input from user
        System.out.print(n + " ");
        while(n!=1){
            if(n%2==0)
                n /= 2; //updating value of n
            else
                n = 3*n + 1; //updating value of n
            System.out.print(n + " "); //printing sequence
        }
    }
}
