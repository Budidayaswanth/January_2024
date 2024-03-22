package org.Jan.jfs.oop.Interface;
interface MyMathQuestions{
    int gcd(int a,int b);
    boolean isPrime(int num);
    int factorial(int num);
    default int gcd(int a,int b,int c){
        return gcd(gcd(a,b),c);
    }
    private static void showSystemInfo(){
        System.out.println("Os :"+System.getProperty("os.name"));
        System.out.println("Java Version :" +System.getProperty("java.version"));
    }

}
class MyMathQuestionsImpl implements MyMathQuestions {
    @Override
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = 0;
            b = a % b;
            a = temp;
        }
        return a;
    }

    @Override
    public boolean isPrime(int num) {
        if (num > 2) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (i % num == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int factorial(int num) {
        int res = 1;
        for (int i = 2; i <= num; i++) {
            res *= i;
        }
        return res;
    }
}
interface One{
    void m1();
    default void m2(){
        System.out.println("M2 Method");
    }
}
interface Two{
    void m1();
   default void m3(){
       System.out.println("Two M3 Method");
    }
     private void m4(){
         System.out.println("M4 Method ");
    }
}
interface Three{

}

public class MyInterfaceDemo {
    public static void main(String[] args) {
        MyMathQuestions obj =new MyMathQuestionsImpl();
        int fact =obj.factorial(5);
        System.out.println(fact);
    }


}
