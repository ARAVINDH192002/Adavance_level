import java.util.*;

class Phonebook {
    String name;
    int number;

    Phonebook(String name, int number) {
        this.name = name;
        this.number = number;
    }

    void display() {
        System.out.println(name + " " + number);
    }
}

class Search_PhoneDirectory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Phonebook[] phArr = new Phonebook[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int number = sc.nextInt();
            phArr[i] = new Phonebook(name, number);
        }
        String find = sc.next();

        for (Phonebook obj : phArr) {
            if (obj.name.startsWith(find)) obj.display();
        }
    }
}
