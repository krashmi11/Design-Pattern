public class Adapter extends mediaPlayer {
    AdvancedMedia advancedMedia;
    String ext, song;

    public Adapter(String ext, String song) {
        this.ext = ext;
        this.song = song;
    }

    public void play(String ext, String song) {
        if (ext.equals("Mp3")) {
            mediaPlayer audioPlayer = new AudioPlayer();
            audioPlayer.play(ext, song);
        } else if (ext.equals("MP4")) {
            advancedMedia = new MP4();
            advancedMedia.play(song, ext);
        } else if (ext.equals("VLC")) {
            advancedMedia = new VLC();
            advancedMedia.play(song, ext);
        } else {
            System.out.println("None can be played");
        }
    }
}
