package org.Java.sc.di;

public class SessionGreetings implements GreetingService {

    @Override
    public String greet(String name) {
        return String.format("Dear %s, Wish you all the best for exams", name);
    }
}
