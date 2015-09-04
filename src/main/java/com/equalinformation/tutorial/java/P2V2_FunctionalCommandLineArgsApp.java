package com.equalinformation.tutorial.java;

import java.util.Arrays;

/**
 * Created by bpupadhyaya on 9/3/15.
 * Note the shortcuts, parallel to Scala. Static method??
 */
public class P2V2_FunctionalCommandLineArgsApp {
    public static void main(String[] args) {
        Arrays.asList(args).forEach(System.out::println);
    }
}
