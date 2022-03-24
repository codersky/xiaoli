package programming.stack;

import java.util.Stack;

public class StackReverse<T> {

    public T pop(Stack<T> stack) {
        if (stack.isEmpty()){
            return null;
        }
        T t = stack.pop();
        if(stack.isEmpty()){
            return t;
        }else {
            T last = pop(stack);
            stack.push(t);
            return last;
        }
    }

    public void reverse(Stack<T> tStack){

        if(tStack.isEmpty()){
            return;
        }

        T t = pop(tStack);
        reverse(tStack);
        tStack.push(t);

    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack);
        new StackReverse<Integer>().reverse(stack);
        System.out.println(stack);


    }

}
