package demo.bt4;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.isEmpty());
        int num;
        String result = "";
        System.out.println("Nhập vào một số: ");
        num = sc.nextInt();
        do {
            int mod = num % 2;
            stack.push(mod);
            num = num / 2;
        } while (num != 0);
        System.out.println(stack.isEmpty());
        int sizeStack = stack.size();
        for (int i = 0; i < sizeStack; i++) {
            int numberStack = stack.pop();
            result += numberStack;
        }
        System.out.println("số nhị phân là: " + result);

    }
}
