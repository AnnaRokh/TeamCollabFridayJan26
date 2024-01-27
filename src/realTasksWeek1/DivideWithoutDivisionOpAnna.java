package realTasksWeek1;

public class DivideWithoutDivisionOpAnna {

    public static void main(String[] args) {

        System.out.println(DivideWithoutDivisionOperator(49,7));

    }

    public static int DivideWithoutDivisionOperator(int a, int b) {
        int count = 0;

        //we could check the divisibility first by adding a condition if(a % b == 0){ , but that was not asked

        if (b == 0) {
            System.err.println("You cannot divide by zero");
        } else {


            while (a > 0) {
                a -= b;
                count++;
            }
        }
            return count;
        }

}
/*
Write a method that can divide two numbers without using division operator.
 */