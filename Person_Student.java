import java.util.Scanner;
class Person {

}
class Student extends Person {
    String fn;
    String ln;
    Integer id;
    int[] arr;
    int n;

    Student(String fn, String ln, int id, int[] arr, int n) {
        this.arr = arr;
        this.fn = fn;
        this.ln = ln;
        this.id = id;
        this.n = n;
    }

    void display() {
        System.out.println("Name: " + ln + " " + fn);
        System.out.println("ID: " + id);
    }

    void getGrade() {
        int sum = 0;
        for (int i = 0; i < n; i++) {
        sum += arr[i];
    }
    sum /= n;
    if (sum >= 90 && sum <= 100)
        System.out.println("Grade: O");
    else if (sum >= 80 && sum < 90)
        System.out.println("Grade: E");
    else if (sum >= 70 && sum < 80)
        System.out.println("Grade: A");
    else if (sum >= 55 && sum < 70)
        System.out.println("Grade: P");
    else if (sum >= 40 && sum < 55)
        System.out.println("Grade: D");
    else if (sum < 40)
        System.out.println("Grade: T");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fn = sc.nextLine();
        String ln = sc.nextLine();
        int id = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
        }
        Student stu = new Student(fn, ln, id, arr, n);
        stu.display();
        stu.getGrade();
    }
}

 
