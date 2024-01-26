public class Zadacha1 {
    public static void main(String[] args) {
//          love6(6, 4) → true
//        love6(4, 5) → false
//        love6(1, 5) → true
        Zadacha1 num = new Zadacha1();
        System.out.println(num.love6(6, 4));
        System.out.println(num.love6(4, 5));
        System.out.println(num.love6(1, 5));
    }

    public boolean love6(int a, int b) {

        if (a == 6 || b == 6)
            return true;

        int sum = a + b;
        int diff = Math.abs(a - b);

        if (sum == 6 || diff == 6)
            return true;
        else
            return false;
    }
}