public class MP4 implements AdvancedMedia {

    @Override
    public void play(String song, String ext) {
        System.out.println("MP4 played" + song);
    }

}
