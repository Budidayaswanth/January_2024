package org.Jan.jfs.oop.methods;

public class MyMathUtil {

    public int biggestOf(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public int SumOfNaturalNumber(int n) {
        return (n * n + 1) / 2;
    }

    public void showPrime(int lb,int ub){
        for (int i =lb;i<=ub;i++){
            if(isPrime(i)){
                System.out.print(i +" ");
            }
        }
    }
    private boolean isPrime(int n){
        if(n <2){
            return false;
        }
        if(n % 2==0 &&  n !=2){
            return false;
        }

        for (int i=2;i<=n/2;i++){
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }

    public int gcd(int a,int b,int c){
        return gcd(a,gcd(b,c));
    }

    private int gcd(int a,int b){
        while(a !=b){
            if (a >b){
                a=a-b;
            }else {
                b=b-a;
            }
        }
        return a;
    }
}
