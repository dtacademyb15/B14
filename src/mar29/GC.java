package mar29;


public class GC {


    public static void main(String[] args) {


        Doctor doc1 = new Doctor(1, "Dr. Who", "internal");
        Doctor doc2 = new Doctor(2, "Dr. Oz", "surgeon");
        Doctor doc3 = new Doctor(3, "Dr. Smith", "dentist");


        doc1 = doc2;
        doc2 = doc3;
        doc3 = doc1;

        doc2 = null;

        Doctor doc4;
        doc4 = new Doctor(4, "ds", "ds");

        Doctor doc5 = doc4;

        doc5 = null;


//        doc5.doSomething();
//        System.out.println(doc5.name);

//        int[] arr =  new int[2000000000];

        System.gc();



    }
}
