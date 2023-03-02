package stack;

import stack.StackElement;

public class Stack<T> {
    //Error codes:
    static int ERR_NONE = 0;
    static int ERR_OVERFLOW = 1;
    static int ERR_UNDERFLOW = 2;
    StackElement top;
    int ERROR;

    public Stack(){
        top = null;
        ERROR = ERR_NONE;
    }

    public void push(T value)
    {
        //create new stack element:
        StackElement newEl = new StackElement();
        newEl.data = value;

        //if stack is empty:
        if(top == null)
        {
            newEl.below = null;
        }else{
            newEl.below = top;
        }
        top = newEl;
    }

    public T pop()
    {
        if(top == null) return null;
        T value;
        value = (T) top.data;
        StackElement temp = top;
        top = temp.below;
        return value;
    }

    public T peek()
    {
        if(top == null) return null;
        return (T) top.data;
    }

    public void print()
    {
        if(top == null) {
            System.out.println("stack.Stack is empty");
            return;
        }

        StackElement current = top;
        while(current.below != null)
        {
            System.out.println(current.data);
            current = current.below;
        }
    }


}
