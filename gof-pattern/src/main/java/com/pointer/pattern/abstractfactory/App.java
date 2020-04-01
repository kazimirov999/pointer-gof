package com.pointer.pattern.abstractfactory;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = null;
        if ("cola".equals(args[0])) {
            abstractFactory = new CocaColaFactory();
        } else if ("fanta".equals(args[0])) {
            abstractFactory = new FantaFactory();
        } else if ("kostya".equals(args[0])) {
            abstractFactory = new KostyaColaFactory();
        }

        Client client = new Client(abstractFactory);
        client.run();
    }
}
