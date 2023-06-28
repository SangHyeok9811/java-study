package ch07.instrumentEx;

public class Main {
    public static void main(String[] args){
        Guitar g = new Guitar("기타");
        Piano p = new Piano("피아노");
        g.play();
        System.out.println("\n-------------------------------------\n");
        p.play();
    }
}
