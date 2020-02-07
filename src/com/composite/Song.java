package com.composite;

public class Song implements IComponent{
    private String songName;
    private String artist;
    private float speed = 1;

    public Song(String songName, String artist) {
        this.songName = songName;
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Playing song "+ getName());
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        this.speed = speed;
    }

    @Override
    public String getName() {
        return songName;
    }
    
    public String getArtist(){
        return this.artist;
    }
}
