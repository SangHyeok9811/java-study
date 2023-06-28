package ch01;

public class StringEx {
    public static void main(String[] args) {

        String exam1 = "\"안녕 하세요\"";
        System.out.println(exam1);

        String name = "한상혁";
        String tel1 = "010";
        String hyp = "-";
        int tel2 = 3800;
        int tel3 = 4350;

        String nameTel = "\"" + name + "님의" + " " + "전화번호는" + " " + tel1 + hyp + tel2 + hyp + tel3 +
                        " " + "입니다" + "\"" + "\n이상 저의 \"전화번호\" 입니다" ;

        System.out.println(nameTel);
        String fullTel = "010-3800-4350";
        String nameTel2 =  "\"" + name + "님의" + " " + "전화번호는" + " " + fullTel + " " + "입니다\"" +
                            "\n이상 저의 \"전화번호\" 입니다";

        System.out.println(nameTel2);

        String adr = "서울에 삽니다";

        String adrMessage = "\"" + name + "님\"은" + " " + adr;
        System.out.println(adrMessage);
    }
}
