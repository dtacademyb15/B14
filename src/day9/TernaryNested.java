package day9;

public class TernaryNested {


    public static void main(String[] args) {






        double salesAmount = 2000;

//        double commission;
//        if(salesAmount > 20000){
//            commission = 0.3;
//        }else if(salesAmount > 10000){
//            commission = 0.2;
//        }else {
//            commission = 0.1;
//        }

//        double commission = salesAmount > 10000 ? 0.2 : 0.1;
        double commission = salesAmount > 20000 ? 0.3 : salesAmount > 10000 ? 0.2 : 0.1;


        System.out.println("Your commission is " + (commission * 100 )+ " percent.\n" +
                "The commission amount is " + (salesAmount * commission));








    }
}
