package org.example;

public class Mp4Player implements Mp4MediaPlayer{
    @Override
    public void play(String fileName) {
        System.out.println("Playing mp4 file " + fileName);
    }
}
