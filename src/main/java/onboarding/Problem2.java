package onboarding;

import java.util.Stack;

public class Problem2 {
    public static void main(String[] args) {
        System.out.println(solution("browoanoommnaon"));
    }
    public static Stack<String> solution(String cryptogram) {

        String answer = "answer";

        Stack<String> stack = new Stack<>();
        String[] n = cryptogram.split("");

        for(int i=0;i<n.length-1;i++) {

            stack.push(n[i]);
            //stack.push(n[i+1]);
            System.out.println(stack);

            if (n[i].equals(n[i +1])) {
                System.out.println("같");
                System.out.println(stack.pop());
                System.out.println(stack.pop());
            }
            //else
               // continue;

        }
        System.out.println(stack.toString());

        return stack;

    }
}
