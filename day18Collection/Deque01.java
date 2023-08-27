package day18Collection;

import java.util.Deque;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Deque01 {

    public static void main(String[] args) {
        Deque<String> deneme = new LinkedList<>();
        deneme.add("k");
        deneme.add("a");
        deneme.add("z");
        deneme.add("d");
        deneme.add("v");
        System.out.println(deneme); //[k, a, z, d, v]

       String s=deneme.poll();
        System.out.println(deneme);
        System.out.println(s);



    }
}
