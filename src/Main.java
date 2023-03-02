import list.List;
import stack.Stack;

import java.util.Random;

public class Main {
    public static Integer find_max_stack(Stack stack)
    {
        int maximum = 0;
        Stack temp = new Stack();

        Integer t = 0;
        while(t != null){
            t = (Integer) stack.pop();
            if(t!=null && t >= maximum)
            {
                maximum = t;
            }
            if(t!=null) temp.push(t);
        }

        t = 0;

        while(t != null) {
            t = (Integer) temp.pop();
            if(t!=null) stack.push(t);
        }

        return maximum;
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack();

        //Testing Stack
        //Putting random integers into Stack
        Random r = new Random();
        for(int i = 0; i<25; i++){
            int temp = r.nextInt(100);
            s.push(temp);
        }
        System.out.println("-------------");
        s.print();
        System.out.println("-------------");

        System.out.println("-------------");
        System.out.println(find_max_stack(s));
        System.out.println("-------------");

        s.print();
        System.out.println("-------------");

        System.out.println("Exercise 2 --------------\n");
        List list = new List();
        for(int i = 0; i<20;i++){
            System.out.print(i + " ");
            list.append((Integer)i);
        }
        System.out.println("\n#################### \n Recursively printed list: \n ####################");
        list.print();
    }
}