import java.util.*;

public class Number_Conversion {
    static String conversion(String number, int from, int to) {
        return Integer.toString(Integer.parseInt(number, from), to);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fromStr = sc.next();
        String toStr = sc.next();
        String number = sc.next();
        String[] strArr = {fromStr, toStr};
        int[] numArr = {0, 0};

        for (int i = 0; i < strArr.length; i++) {
            switch (strArr[i].toUpperCase()) {
                case "B":
                    numArr[i] = 2;
                    break;
                case "D":
                    numArr[i] = 10;
                    break;
                case "O":
                    numArr[i] = 8;
                    break;
                case "H":
                    numArr[i] = 16;
                default:
                    break;
            }
        }

        System.out.println(conversion(number, numArr[0], numArr[1]));
    }
}
