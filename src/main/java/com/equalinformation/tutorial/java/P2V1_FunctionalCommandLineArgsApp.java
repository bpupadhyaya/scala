package com.equalinformation.tutorial.java;

import java.util.Arrays;

/**
 * Created by bpupadhyaya on 9/3/15.
 * Functional literal input param type optional - type inference
 */
public class P2V1_FunctionalCommandLineArgsApp {
    public static void main(String[] args) {
        Arrays.asList(args).forEach(arg -> System.out.println(arg));
    }
}
