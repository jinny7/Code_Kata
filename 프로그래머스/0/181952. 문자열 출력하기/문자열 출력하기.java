import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if(a.length() > 1000000){
            System.out.print("문자열이 너무 깁니다.");
        }else{
            System.out.print(a);
        }
        
    }
}