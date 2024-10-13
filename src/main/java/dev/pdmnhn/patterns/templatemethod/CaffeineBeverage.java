package dev.pdmnhn.patterns.templatemethod;

public abstract class CaffeineBeverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if(shouldAddCondiments()) {
            addCondiments();
        } else {
            System.out.println("Skipping adding condiments");
        }
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    /**
     * Optional hook that can be used by the subclass to change how the algorithm runs
     */
    protected boolean shouldAddCondiments() {
        return true;
    }
}
