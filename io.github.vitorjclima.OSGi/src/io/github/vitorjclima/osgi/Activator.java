package io.github.vitorjclima.osgi;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import io.github.vitorjclima.osgi.service.Service;
import io.github.vitorjclima.osgi.service.ServiceImpl;

public class Activator implements BundleActivator {

    public void start(BundleContext context) throws Exception {
        System.out.println("Hello World!!");
    }

    public void stop(BundleContext context) throws Exception {
        System.out.println("Goodbye World!!");
    }

    Service service;
    ServiceImpl serviceimpl;
}
