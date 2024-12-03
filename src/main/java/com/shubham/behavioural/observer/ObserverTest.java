package com.shubham.behavioural.observer;

public class ObserverTest {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        NewsAgency newsAgency = new NewsAgency();
        Subscriber shubham = new Subscriber("shubham@gmail.com");
        Subscriber omkar = new Subscriber("omkar@gmail.com");
        Subscriber surekha = new Subscriber("surekha@gmail.com");
        newsAgency.subscribe(shubham);
        newsAgency.subscribe(omkar);
        newsAgency.subscribe(surekha);
        newsAgency.publishNews("BJP Wins Maharashtra Election!");

        newsAgency.unsubscribe(shubham);
        newsAgency.unsubscribe(omkar);
        newsAgency.publishNews("Donald Trump wins USA Election!");

    }
}
