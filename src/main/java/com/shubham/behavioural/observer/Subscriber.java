package com.shubham.behavioural.observer;

public class Subscriber implements Observer {
    private final String email;

    public Subscriber(String email) {
        this.email = email;
    }

    @Override
    public void update(String news) {
        System.out.println("Email sent to " + email + ": " + news);
    }

    @Override
    public String toString() {
        return "Subscriber{" + "email='" + email + '\'' + '}';
    }
}
