package may13;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {



        Stack<Integer> numberStack = new Stack<>();

        numberStack.push(1);
        numberStack.push(4);
        numberStack.push(2);
        numberStack.push(0);

        System.out.println(numberStack);

        System.out.println(numberStack.pop());

        System.out.println(numberStack);

        System.out.println(numberStack.peek());

        System.out.println(numberStack);

        while(!numberStack.empty()){
            System.out.println(numberStack.pop());
        }


        System.out.println(reverse("Hello World"));


        //Alternative stack implementation

        Deque<Integer> stackbyDeque = new ArrayDeque<>();
        stackbyDeque.push(10);
        stackbyDeque.push(32);
        stackbyDeque.push(21);
        System.out.println(stackbyDeque);
        System.out.println(stackbyDeque.pop());
    }


    public static String reverse(String str){

        Stack<Character> stack = new Stack<>();

        for(Character ch: str.toCharArray()){
           stack.push(ch);
        }


        StringBuilder sb = new StringBuilder();

        while(!stack.empty()){
            sb.append(stack.pop());
        }

        return sb.toString();
    }

}
