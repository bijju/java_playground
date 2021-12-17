package com.bijju.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Properties;

public class App
{
    private static final Logger log = LogManager.getLogger(App.class);

    public static void main(String[] args)
    {
        //PropertiesConfigurator is used to configure logger from properties file
        log.info("Starting app: .....");
        log.info("Shutting Down: Done!");
    }
}