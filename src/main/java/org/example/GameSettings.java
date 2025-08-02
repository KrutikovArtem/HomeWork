package org.example;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers=0;

    GameSettings(String gameName){
        this.gameName=gameName;
    }

    static void setMaxPlayers(int newMaxPlayers){
        maxPlayers=newMaxPlayers;
    }

    void addPlayer(){
        if(maxPlayers>currentPlayers){
            currentPlayers++;
        }
    }

    void printGameStatus(){
        System.out.println(gameName+ "Текущее кол-во игроков: "+ currentPlayers + " При макс. игроках:"+ maxPlayers);
    }
}
