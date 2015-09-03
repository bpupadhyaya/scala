package com.equalinformation.tutorial.java;

/**
 * Created by bpupadhyaya on 9/3/15.
 */
public class P1_CommandLineArgsApp {
    public static void main(String...args) {
        int loopCount = 0;
        while(loopCount < args.length) {
            System.out.println(args[loopCount]);
            loopCount += 1;
        }
    }
}
