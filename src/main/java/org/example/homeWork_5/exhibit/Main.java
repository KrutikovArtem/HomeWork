package org.example.homeWork_5.exhibit;

public class Main {

    public static void main(String[] args) {
        Museum museum = new Museum();
        Manuscript manuscript = new Manuscript();
        Sculpture sculpture = new Sculpture();

        museum.setExhibit(sculpture);

        museum.showExhib(sculpture);
        museum.showExhib(manuscript);
    }





}
