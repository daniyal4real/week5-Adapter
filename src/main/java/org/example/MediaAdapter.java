package org.example;

public class MediaAdapter implements MediaPlayer{
    private VlcMediaPlayer vlcMediaPlayer;
    private Mp4MediaPlayer mp4MediaPlayer;

    public MediaAdapter(String fileType) {
        if (fileType.equalsIgnoreCase("vlc")) {
            vlcMediaPlayer = new VlcPlayer();
        } else if (fileType.equalsIgnoreCase("mp4")) {
            mp4MediaPlayer = new Mp4Player();
        }
    }
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")) {
            vlcMediaPlayer.play(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            mp4MediaPlayer.play(fileName);
        }
    }
}
