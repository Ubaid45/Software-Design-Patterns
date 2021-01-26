package com.practice.creational.patterns.singleton;

public class DbSingleton {

    private static volatile DbSingleton instance = null;

    private DbSingleton (){
        // if accessed by reflection
        if (instance != null){
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static  DbSingleton getInstance(){
        if (instance == null){
            // if multiple threads trying to create instance at same time, lock one by sync them
            synchronized (DbSingleton.class){
                if (instance == null){
                    instance = new DbSingleton();
                }
            }
        }

        return instance;
    }
}
