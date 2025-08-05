package org.example.homeWork_5.exhibit;

public class Museum {

    Exhibit exhibit;

    public void setExhibit(Exhibit exhibit){
        this.exhibit=exhibit;
    }


    public void showExhib(Exhibit exhibit){
        exhibit.preserve();
        System.out.println(exhibit.describe());

    }
}
