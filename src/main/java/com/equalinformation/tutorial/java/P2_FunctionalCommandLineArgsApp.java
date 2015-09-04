package com.equalinformation.tutorial.java;

import java.util.Arrays;

/**
 * Created by bpupadhyaya on 9/3/15.
 * Explicitly written param type in the lambda. () required.
 */
public class P2_FunctionalCommandLineArgsApp {
    public static void main(String[] args) {
        Arrays.asList(args).forEach((String arg) -> System.out.println(arg));
    }
}
