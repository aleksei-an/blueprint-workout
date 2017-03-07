package org.sorgen.blueprintworkout;

import org.sorgen.blueprintworkout.api.HelloWorldService;

/**
 * 07.03.2017
 * 18:22
 *
 * @author aan
 */
public class HelloWorldClient {

    HelloWorldService helloWorldService = null;

    public void startUp() {
        System.out.println("========>>>>Client HelloWorld: About to execute a method from the Hello World service");
        helloWorldService.hello();
        System.out.println("========>>>>Client HelloWorld: ... if you didn't just see a Hello World message something went wrong");
    }

    public HelloWorldService getHelloWorldService() {
        return helloWorldService;
    }

    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;

    }

}