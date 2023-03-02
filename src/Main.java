import files.File;
import files.StackItem;
import list.List;
import stack.Stack;

import java.util.ArrayList;
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

    public static void printFiles(Stack files)
    {
        Stack temp = new Stack();
        StackItem current = (StackItem) temp.peek();
        while(current != null)
        {
            StackItem item = current;
            if(current != null) files.pop();

        }
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

        //-------------------------------------------------
        System.out.println("Exercise 3 ----------------\n");

        Stack files = new Stack();
        String rootDir = "C:/var/www/project/";

        File file1 = new File("css", rootDir, true);
        File file2 = new File("style.css", rootDir + "css", false);

        File file3 = new File("index.html", rootDir, false);

        File file7 = new File("images", rootDir, true);
        File file4 = new File("img1.png", rootDir + "images", false);
        File file5 = new File("img2.png", rootDir + "images", false);
        File file6 = new File("img3.png", rootDir + "images", false);

        StackItem fileItem1 = new StackItem(file1, 1);
        StackItem fileItem2 = new StackItem(file1, 1);
        StackItem fileItem3 = new StackItem(file1, 0);
        StackItem fileItem4 = new StackItem(file1, 2);
        StackItem fileItem5 = new StackItem(file1, 2);
        StackItem fileItem6 = new StackItem(file1, 2);
        StackItem fileItem7 = new StackItem(file1, 2);

        files.push(fileItem1);
        files.push(fileItem2);
        files.push(fileItem3);
        files.push(fileItem4);
        files.push(fileItem5);
        files.push(fileItem6);
        files.push(fileItem7);
    }
}