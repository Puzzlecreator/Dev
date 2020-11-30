package com.engine.apphost;

public class ApplicationHost<Debug> {

    public boolean Debug = true;

    public static void main(String[] args)
    {
        // Initializes the class updater
        ClassInit CI = new ClassInit();

        CI.createWindow("RedShift Engine");
    }
}
