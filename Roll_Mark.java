import java.util.Scanner;

class Roll_no{
    int roll;
    int m1;
    int m2;
    int m3;

    Q3(int a, int b, int c, int d) {
        this.roll = a;
        this.m1 = b;
        this.m2 = c;
        this.m3 = d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Q3[] arr = new Q3[n];
        for (int i = 0; i < n; i++) {
            int r = sc.nextInt();
            int m1 = sc.nextInt();
            int m2 = sc.nextInt();
            int m3 = sc.nextInt();
            arr[i] = new Q3(r, m1, m2, m3);
        }
        int high = 0;
        Q3 th = arr[0];
        for (int i = 0; i < n; i++) {
            int mark = arr[i].m1 + arr[i].m2 + arr[i].m3;
            System.out.println(mark);
            if (mark > high) {
                high = mark;
                th = arr[i];
            }
        }
        Q3 h1 = arr[0];
        Q3 h2 = arr[0];
        Q3 h3 = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i].m1 > h1.m1) {
                h1 = arr[i];
            }
            if (arr[i].m2 > h2.m2) {
                h2 = arr[i];
            }
            if (arr[i].m3 > h3.m3) {
                h3 = arr[i];
            }
        }
        System.out.println(h1.roll + " " + h1.m1);
        System.out.println(h2.roll + " " + h2.m2);
        System.out.println(h3.roll + " " + h3.m3);
        System.out.println(th.roll + " " + high);
    }
}
