package io.github.vitorjclima.osgi.service;

public class ServiceImpl implements Service {

    @Override
    public String sayHello() {
        System.out.println("Hello ServiceImpl.sayHello()");
        return "Hello!";
    }
}
