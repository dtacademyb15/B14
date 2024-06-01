package may17;

import java.util.*;

public class WordCount {


    public static void main(String[] args) {

        // [and, or, to, and, to, or,to, for, hello]

        // {and=2, or=2, to=3, for=1, hello=1}


        List<String> words = List.of("and", "or", "to", "and", "to", "or", "to", "for", "hello");


        Map<String, Integer> map = new HashMap<>();

//        for(String word: words){
//
//            if(!map.containsKey(word)){ // if the map does not have this word yet
//                map.put(word, 1); //
//            }else{
////                Integer count = map.get(word);
////                count++;
////                map.put(word, count); // update the count with a new incremented value
//                map.put(word, map.get(word)+1); // update the count with a new incremented value
//            }
//
//        }


        for(String word: words){
                map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println(map);


        // Find the word with the most frequent count

        int max = Integer.MIN_VALUE;
        String wordWithMax = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() > max){
                max = entry.getValue();
                wordWithMax = entry.getKey();
            }
        }

        System.out.println("Max value: " + max);
        System.out.println("Word with Max frequency: " + wordWithMax);



        // Sort the map by its values to obtain top 3 frequent words

        //Get the entry set from the map
        Set< Map.Entry<String, Integer>> entries = map.entrySet();
        // Convert Set to List so that you can sort it
        List< Map.Entry<String, Integer> > entryList = new ArrayList<>(entries);

        //Sort the list of entries by the Entry's value using comparator
        Collections.sort(entryList, Comparator.comparing(Map.Entry::getValue));

        // Obtain the last 3/first 2 of this list
        List<Map.Entry<String, Integer>> top3Words = new ArrayList<>(entryList.subList(entryList.size()-3, entryList.size()));

        System.out.println(top3Words);


    }
}
