import java.util.Scanner;

class recurement{
    String n;
    String q;
    String g;
    int e;

    Q5(String a, String b, String c, int d) {
        this.n = a;
        this.q = b;
        this.g = c;
        this.e = d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Q5[] arr = new Q5[n];
        for (int i = 0; i < n; i++) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = Integer.parseInt(sc.nextLine());
            arr[i] = new Q5(a, b, c, d);
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j].e > arr[i].e) {
                    Q5 tp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tp;
                }
                if (arr[i].e == arr[j].e) {
                    if (arr[j].n.compareTo(arr[i].n) > 0) {
                        Q5 tp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tp;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].n);
            System.out.println(arr[i].q);
            System.out.println(arr[i].g);
            System.out.println(arr[i].e);
        }
    }
}
