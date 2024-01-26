public class Zadacha2 {
    public static void main(String[] args) {
//        in1To10(5, false) → true
//        in1To10(11, false) → false
//        in1To10(11, true) → true
        Zadacha2 num2 = new Zadacha2();
        System.out.println(num2.in1To10(5, false));
        System.out.println(num2.in1To10(11, false));
        System.out.println(num2.in1To10(11, true));
    }

    public boolean in1To10(int n, boolean outsideMode) {
        if (!outsideMode) {
            if (n >= 1 && n <= 10) {
                return true;
            } else {
                return false;
            }
        } else {
            if (n <= 1 || n >= 10) {
                return true;
            } else {
                return false;
            }

        }
    }
}