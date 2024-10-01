package org.example;



public class Main {
    public static void main(String[] args) {

        Player player1 = new Player();
        player1.play("mp3", "file1.mp3");

        player1.play("mp4", "video.mp4");
        player1.play("vlc", "vlc-video.vlc");
        player1.play("txt", "text-file.txt");
    }
}