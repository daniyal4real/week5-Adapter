package org.example;

public class VlcPlayer implements VlcMediaPlayer{
    @Override
    public void play(String fileName) {
        System.out.println("Playing vlc file " + fileName);
    }
}
