/*
Question:
Program to Reverse the Linked list.
 */

import java.util.*;
public class reverse_list {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            list.add(6);
            System.out.println("Original list : " + list);
            System.out.println("After reversed list : " + list.reversed());        
    }
    }

/*
Output:
Original list : [1, 2, 3, 4, 5, 6]
After reversed list : [6, 5, 4, 3, 2, 1]
 */