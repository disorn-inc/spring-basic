package com.example.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//Java ver.
//@Component
//public class IdService {
//    private NumberGenerator numberGenerator;
//
//    public static void main(String[] args) {
//        NumberGenerator numberGenerator = new NumberGenerator();
//
//        // Constructor Injection -> Use in all method.
//        // IdService idService = new IdService(numberGenerator);
//        // Setter Injection -> freedom use
//        // idService.setNumberGenerator(numberGenerator);
//        // Method Injection -> Use in only this method.
//        // String id = idService.generate(numberGenerator);
//        IdService idService = new IdService();
//        idService.setNumberGenerator(numberGenerator);
//        String id = idService.generate();
//        System.out.println(id);
//    }
//
//    public void setNumberGenerator(NumberGenerator numberGenerator) {
//        this.numberGenerator = numberGenerator;
//    }
//
//    public String generate() {
//        String id = "HELLO" + numberGenerator.get();
//        return id;
//    }
//}

@Component
public class IdService {

    @Autowired
    private NumberGenerator numberGenerator;

    public String generate() {
        String id = "HELLO" + numberGenerator.get();
        return id;
    }
}
