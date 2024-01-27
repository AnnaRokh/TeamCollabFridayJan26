package realTasksWeek1;

public class EvenOdd {

    public static void main(String[] args) {
        EvenOdd(5);
        EvenOdd(6);
    }

    public static void EvenOdd (int number){
        if (number % 2 == 0){
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }
    }
}
/*
Numbers -- odd & even
Write a method that can identify  a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"
 */