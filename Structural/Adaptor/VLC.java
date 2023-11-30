public class VLC implements AdvancedMedia {

    @Override
    public void play(String song, String ext) {
        System.out.println("vlc played" + song);
    }

}
