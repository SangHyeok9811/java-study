package ch07.instrumentEx;

public class Instrument {
    String name;

    public Instrument(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println(name + "가 실행됩니다");
    }
}
