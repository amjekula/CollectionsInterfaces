package Collections;

import java.util.*;

public class Collection {

    Stack<String> stack;
    public Stack stack(){
        stack = new Stack<String>();
        stack.push("Clive");
        stack.push("Luzz");
        stack.push("Thera");
        stack.push("Koko");
        stack.push("Lloyd");
        stack.pop();
        /*Iterator<String> itr = stack.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }*/
        return stack;
    }

}
