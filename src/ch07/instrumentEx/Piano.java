package ch07.instrumentEx;

public class Piano extends Instrument {
    public Piano(String name){
        super(name);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("뚠뚠뚠뚠뚠~");
    }
}
