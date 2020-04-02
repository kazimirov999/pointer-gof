package com.pointer.pattern.abstractfactory;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = null;
        if ("cola".equals(args[0])) {
            abstractFactory = new CocaColaFactory();
        }else if("Regina".equals(args[0])){
            abstractFactory = new ReginaFactory();
        }

        Client client = new Client(abstractFactory);
        client.run();
    }
}
