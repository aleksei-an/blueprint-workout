package org.sorgen.blueprintworkout.server;

import org.sorgen.blueprintworkout.api.HelloWorldService;

/**
 * 07.03.2017
 * 18:29
 *
 * @author aan
 */
public class HelloWorldServiceImpl implements HelloWorldService {

    public void hello() {
        System.out.println("======>>> A message from the server: Hello World!");
    }

    public void startUp() {
        System.out.println("======>>> Starting HelloWorld Server");
    }

}