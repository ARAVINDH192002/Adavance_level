import java.util.Scanner;
    interface Book {
    abstract void display();
    }

    class MyBook implements Book {
    String title;
    String author;
    int price;

    MyBook(String title, String author, int price) {
    this.title = title;
    this.author = author;
    this.price = price;
    }

    @Override
    public void display() {
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("Price: " + price);
    }
    }

    class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String title = sc.nextLine();
    String author = sc.nextLine();
    int price = sc.nextInt();
    MyBook x = new MyBook(title, author, price);
    x.display();
    }
    }

 
