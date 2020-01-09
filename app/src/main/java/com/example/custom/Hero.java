package com.example.custom;

public class Hero {

    int image;

    String Name,Team;

    public int getImage() {
        return image;
    }

    public String getName() {
        return Name;
    }

    public String getTeam() {
        return Team;
    }

    public Hero(int image, String name, String team) {
        this.image = image;
        this.Name = name;
        this.Team = team;


    }
}
