package Stack;

import java.util.*;

class stack {
    ArrayList<Integer> list;

    public stack() {
        list = new ArrayList<>();
    }

    public void push(int data) {
        list.add(data);
    }

    public int pop() {
        if (list.size() == 0) {
            System.out.println("Stack underflow");
            return -1;
        }
        int top = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return top;
    }

    public int peek() {
        if (list.size() == 0) {
            System.out.println("Stack underflow");
            return -1;
        }
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public int size() {
        return list.size();
    }
    public static void main(String[] args) {
        stack s = new stack();
        s.push(10);
        s.push(20);
        s.push(30);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}
