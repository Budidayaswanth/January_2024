package org.Jan.jfs.annotation;

public class MathUtil {
    @DocInfo(author = "gopal",createDate = "2022-08-27",description = "This method is used to calculate the EMI",version = "1.0",reviewers = {"JOHN","smith"})
    public static double emiCalculator(double amount,double rate,int months){
        double r =rate/12/100;
        double emi =amount*r*Math.pow(1+r,months)/(Math.pow(1+r,months)-1);
        return emi;
    }
    @DocInfo(author = "umesh",createDate = "2023-09-02",description = "This method is used to calculate the simple interest",version = "1.0",reviewers = {"pawen", "lokesh"})
    public static double SimpleInterest(double amount,double rate,double months){
        return amount*rate*months/100;
    }
    @DocInfo(author = "Jaswanth",createDate = "2010-05.14",description = "This method is used to calculate the  compound inerest",version = "1.0",reviewers = {"King"})
    public static double compoundInterest(double amount,double rate,double months){
        return amount*Math.pow(1+rate/100,months)-amount;
    }

    @DocInfo(author = "preaveen",createDate = "2022-04-24",description = "This method is used to calculate the Factorial",version = "1.0",reviewers = {"ganesh"})
    public static double Factorial(double num){
        if (num ==0 || num ==1){
            return 1;
        }
        return num*Factorial(num-1);
    }

}
