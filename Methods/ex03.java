package Methods;
import java.util.*;

public class ex03 {
    public static void main(String args[]){
        //Stack

        Stack<String> stack = new Stack<String>();
        stack.push("bottom");
        printStack(stack);
        stack.push("second");
        printStack(stack);
        stack.push("third");
        printStack(stack);

        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
    }
    private static void printStack(Stack<String> s){
        if(s.isEmpty()){
            System.out.println("you nothing in the stack");

        }else {
            System.out.printf("%s Top\n", s);
        }
    }
}