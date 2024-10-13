package dev.pdmnhn.patterns.templatemethod;

public class TestDrive {
    public static void main(String[] args) {
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();
        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
