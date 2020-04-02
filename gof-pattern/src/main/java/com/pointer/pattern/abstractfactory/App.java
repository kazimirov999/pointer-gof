package com.pointer.pattern.abstractfactory;

/**
 * Hello world!
 */
public class App {

    public static void main(String... args) {
        AbstractFactory abstractFactory = null;
        if ("cola".equals(args[0])) {
            abstractFactory = new CocaColaFactory();
        } else if ("karavan".equals(args[0])) {
            abstractFactory = new KaravanFactory();

            Client client = new Client(abstractFactory);
            client.run();
        }
    }
}