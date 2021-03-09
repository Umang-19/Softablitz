class Stack {
    private int tos;
    private int data[] = new int[10];

    Stack() {
        tos = -1;
    }

    void push(int val) {
        if (tos == 9)
            System.out.println("Stack is full !");
        else
            data[++tos] = val;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack is empty !");
            return 0;
        }
        else
            return data[tos--];
    }
}

public class Stackclass {
    public static void main(String args[]) {
        Stack s1 = new Stack();
        for(int i = 1 ; i <= 10 ; i++)
        s1.push(i);

        s1.push(30);

        for(int i = 1 ; i <= 10 ; i++)
        System.out.println("Popped value : " + s1.pop());

        s1.pop();
    }
}