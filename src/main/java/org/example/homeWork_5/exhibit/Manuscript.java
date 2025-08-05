package org.example.homeWork_5.exhibit;

public class Manuscript extends Exhibit{
    @Override
    public String describe() {
        return "Древний текс";
    }

    @Override
    public void preserve() {
        System.out.println("Контроль влажности");
    }
}
