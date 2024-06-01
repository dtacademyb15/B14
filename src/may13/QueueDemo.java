package may13;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {


        Queue<String> customerQueue = new LinkedList<>(); //(First in First Out)FIFO queue

        customerQueue.offer("1A");
        customerQueue.offer("1B");
        customerQueue.offer("2A");
        customerQueue.offer("1C");
        customerQueue.offer("2B");
        customerQueue.offer("3A");


        System.out.println(customerQueue);

//        System.out.println(customerQueue.poll());
//        System.out.println(customerQueue.poll());

        while(!customerQueue.isEmpty()){
            System.out.println(customerQueue.poll());
        }


     }
}
