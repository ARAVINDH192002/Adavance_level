import java.util.Scanner;

class Telephone_index{
    String n;
    String ph;

    Q4(String n, String ph) {
        this.n = n;
        this.ph = ph;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Q4[] arr = new Q4[n];
        for (int i = 0; i < n; i++) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            arr[i] = new Q4(a, b);
        }
        String s = sc.nextLine();
        for (int i = 0; i < n; i++) {
            if (arr[i].n.startsWith(s)) {
                System.out.println(arr[i].n + " " + arr[i].ph);
            }
        }
    }
}
