package may17;

public class CollectionsFramework {


    public static void main(String[] args) {


        //Collections Framework -> List, Set, Queue, Map
        // Collections vs Collection -> Collection of super interface of List,Set and Queue vs Collections is a util class to manipulate collections

        // List: an ordered(index-based) collection that allows duplicates
            // ArrayList -> resizable list that is backed by array (retrieval is fast, modification is slow)
            // LinkedList -> resizable list that is backed by Node element, elements are linked to each other through references (retrieval is slow, modification is fast)
            // Vector -> legacy version of ArrayList, synchronized
            // Stack -> legacy class that represents LIFO, synchronized, Deque/ArrayDeque is preferred

       // Set: an unordered collection that does not allow duplicates
          //  HashSet ->  does not keep the insertion order
          // LinkedHashSet -> keeps the insertion order
          // TreeSet -> orders the elements according to the natural order (sorts the set)

      // Queue: unordered collection that supports FIFO order
        // LinkedList ->  FIFO order
        // PriorityQueue -> order is determined by the natural order

    }
}
