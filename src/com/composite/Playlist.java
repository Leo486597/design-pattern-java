package com.composite;

import java.util.ArrayList;

public class Playlist implements IComponent{
    private String playlistName;
    private ArrayList<IComponent> playlist = new ArrayList<>();

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
    }

    @Override
    public void play() {
        System.out.println("playing playlist " + getName());

        for (IComponent component : playlist) {
            component.play();
        } 
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        System.out.println("setting speed for playlist" + getName());
        
        for (IComponent component : playlist) {
            component.setPlaybackSpeed(speed);           
        }
    }

    @Override
    public String getName() {
        return this.playlistName;
    }
    
    public void add(IComponent component){
        this.playlist.add(component);
    }

    public void remove(IComponent component){
        this.playlist.remove(component);
    }
}
