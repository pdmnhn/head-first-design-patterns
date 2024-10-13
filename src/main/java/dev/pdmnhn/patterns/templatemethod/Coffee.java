package dev.pdmnhn.patterns.templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;


public class Coffee extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    protected boolean shouldAddCondiments() {
        System.out.println("Would you like to have your Coffee added with Sugar and Milk?(y/n)");
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            return "y".equalsIgnoreCase(Optional.ofNullable(reader.readLine()).map(String::strip).orElse(null));
        } catch (IOException exception) {
            throw new RuntimeException("Something went wrong!");
        }
    }
}
