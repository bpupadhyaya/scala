package com.equalinformation.tutorial.java;

/**
 * Created by bpupadhyaya on 9/3/15.
 * Using imperative for and trying to be close to Scala implementation (functional style)
 * but Java for-each implementation is not a functional implementation
 */
public class P2V3_FunctionalCommandLineArgsAppUsingFor {
    public static void main(String[] params) {
        for(String param : params) {
            System.out.println(param);
        }
    }
}
