package org.example;

public class Player implements MediaPlayer {
    MediaAdapter mediaAdapter;
    @Override
    public void play(String fileType, String fileName) {
        if (fileType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file " + fileName);
        } else if(fileType.equalsIgnoreCase("mp4") || fileType.equalsIgnoreCase("vlc")) {
            mediaAdapter = new MediaAdapter(fileType);
            mediaAdapter.play(fileType, fileName);
        } else {
            System.out.println("Invalid media type " + fileType);
        }
    }
}
