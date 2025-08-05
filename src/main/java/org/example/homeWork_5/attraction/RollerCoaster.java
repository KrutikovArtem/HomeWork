package org.example.homeWork_5.attraction;

public class RollerCoaster implements Attraction{

    @Override
    public String info(){
        return "Острые ощущения";
    }


    @Override
    public void maintain(){
        System.out.println("Проверка безопасности");
    }
}
