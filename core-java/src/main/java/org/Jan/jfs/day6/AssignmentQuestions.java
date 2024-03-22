package org.Jan.jfs.day6;

public class AssignmentQuestions {
    public static void main(String[] args) {
        int requiredBoxes = numberOfBoxesRequired(108, 10);
        System.out.println("Number of boxes required :" + requiredBoxes);
        requiredBoxes = numberOfBoxesRequired(100, 10);
        System.out.println("Number of boxes required :" + requiredBoxes);
        printAllPrimeFactors(35);
        System.out.println(" ");
        printAllPrimeFactors(54);
        System.out.println(" ");
        fibonacciSeries(5);
        System.out.println(" ");
        fibonacciSeries(10);
        System.out.println(" ");
        double sum = sumOfSeries(5);
        System.out.println("Sum of series :" + sum);
    }

    public static void fibonacciSeries(int n) {
        int num1=0;
        int num2 =1;
        for (int i=0;i<n;i++){

            System.out.print(num1+ " ");
            int num3=num1+num2;
            num1=num2;
            num2=num3;

        }

    }

    public static double sumOfSeries(int n) {
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        if (n == 0 || n == 1) {
            return 1;
        } else {
            sum= n * (n - 1);
        }
        return sum;
    }


    public static void printAllPrimeFactors(int n) {
        int count = 0;
        for (int i = 2; ; i++) {
            if (isPrime(i)) {
                System.out.print(i +" ");
                count++;
            }
            if (count == n) {
                break;
            }
        }
    }

    public static int numberOfBoxesRequired(int totalItems, int itemsBox) {
        int numberOfBoxes = totalItems / itemsBox;
        if (totalItems % itemsBox != 0) {
            numberOfBoxes++;
        }
        return numberOfBoxes;
    }

    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        else if (n % 2 ==0 && n !=2){
            return false;
        }
        else {
            for (int i=2;i<=n/2;i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}
