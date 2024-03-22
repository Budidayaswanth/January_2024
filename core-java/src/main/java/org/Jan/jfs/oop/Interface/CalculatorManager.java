package org.Jan.jfs.oop.Interface;

interface Calculator{
    double calculate(double p,double r,double t);
}
class SimpleInterestCalculator implements Calculator{
    @Override
    public double calculate(double p,double r,double t){
        return (p*r*t)/100;
    }
}
class EmiCalculator implements Calculator{
    @Override
    public double calculate(double p,double r, double t){
        r =r/12/100;
        return p*r*Math.pow(1+r,t)/(Math.pow(1+r,t)-1);
    }
}
public class CalculatorManager {
    public static void main(String[] args) {
        Calculator clc =new SimpleInterestCalculator();
        double res =clc.calculate(200000,2,12);
        System.out.println(res);
    }


}
