package com.bijju.core;

import java.util.Properties;

public class App {
    public static void main(String[] args) {
        Properties props = new Properties();
        props.load(App.class.getClass().getResourceAsStream("log4j.properties"));
        PropertyConfigurator.configure(props);
    }
}
