import java.util.*;
import java.io.*;
public class StackDemo{
    public static void main(String args[])
    {
        Stack<integer>stk=new Stack<Integer>();
        stk.push(10);
        stk.push(15);
        stk.push(30);
        stk.push(20);
        stk.push(5);
        System.out.println("Initial Stack:"+stk);
        System.out.println("The element at the top of the stack is:"+stk.peek());
        System.out.println("Popped element:"+stk.pop());
        System.out.println("Popped element:"+stk.pop());
        System.out.println("The element at the top of the stack:"+stk.peek());
    }
}