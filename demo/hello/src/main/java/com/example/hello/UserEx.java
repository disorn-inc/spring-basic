package com.example.hello;

// Bad practice store state in singleton.
// When concurrency
//@Component
//public class User {
//    private int id;
//    private String name;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}
// --if must use -> define scope
//@Component
//// prototype -> create for each user and delete when done. but should't use
//@Scope("prototype")
//public class User {
//    private int id;
//    private String name;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}


