package realTasksWeek1;

public class FinRaAnna {
    public static void main(String[] args) {
        FINRA();
    }
    public static void FINRA(){

        for (int i = 1; i <=30; i++) {
            if (i % 15 == 0){ //first checking divisibility by 15, because if a number is divisible by 15, it is ALSO divisible by both 3 and 5, so we need this condition to be checked first
                System.out.println("FINRA");
            } else if (i % 3 == 0){
                System.out.println("FIN");
            } else if (i % 5 == 0){
                System.out.println("RA");
            }else{
                System.out.println(i);
            }
        }

    }
}
/*
 Numbers -- FINRA
Write a method that prints out the numbers from 1 to 30 but;
for numbers which are multiple of 3 print "FIN" instead of the number,
for numbers which are multiple of 5, print "RA" instead of the number,
and for numbers which are multiple of both 3 and 5, print "FINRA" instead of the number.
 */