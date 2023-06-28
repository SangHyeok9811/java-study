package ch07.instrumentEx;

public class Guitar extends Instrument {
    public Guitar(String name) {
        super(name);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("딩디리딩딩 징징");
    }
}
