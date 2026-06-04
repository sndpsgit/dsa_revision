package com.sandeep;

import java.io.IOException;

public class processFork {
    public static void main(String[] args) throws IOException, InterruptedException {

        // We look for a special command-line flag to know if this execution is the Child
        if (args.length > 0 && args[0].equals("--child")) {
            // ==========================================
            //               CHILD PROCESS
            // ==========================================
            for (int i = 0; i < 5; i++) {
                System.out.println("Child running... (PID: " + ProcessHandle.current().pid() + ")");
                Thread.sleep(1000); // Wait for 1 second
            }
        } else {
            // ==========================================
            //              PARENT PROCESS
            // ==========================================
            System.out.println("Parent process started. (PID: " + ProcessHandle.current().pid() + ")");

            // Tell Java to launch a new process running this exact same class with the "--child" flag
            ProcessBuilder pb = new ProcessBuilder("java", "ProcessFork", "--child");

            // Connect the child's output stream directly to our main terminal screen
            pb.inheritIO();

            // Fire! This boots up the child process concurrently
            Process childProcess = pb.start();

            // Parent execution loop runs at the exact same time as the child
            for (int i = 0; i < 5; i++) {
                System.out.println("Parent running... (PID: " + ProcessHandle.current().pid() + ")");
                Thread.sleep(1000); // Wait for 1 second
            }

            // Wait for the child process to finish before closing the application completely
            childProcess.waitFor();
            System.out.println("Child finished. Parent exiting.");
        }
    }
}
