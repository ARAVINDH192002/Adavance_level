import java.util.*;

class Requirement {
    String name;
    String qualification;
    String gender;
    int experience;

    public Requirement(String n, String qul, String gen, int exp) {
        name = n;
        qualification = qul;
        gender = gen;
        experience = exp;
    }

    void display() {
        System.out.println(name + "\n" + qualification + "\n" + gender + "\n" + experience);
    }
}

class Object_Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Requirement[] reqArr = new Requirement[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            sc.nextLine();
            String qualify = sc.nextLine();
            String gen = sc.next();
            sc.nextLine();
            int exp = sc.nextInt();
            reqArr[i] = new Requirement(name, qualify, gen, exp);
        }

        for (int i = 0; i < reqArr.length; i++) {
            for (int j = i + 1; j < reqArr.length; j++) {
                if (reqArr[i].experience < reqArr[j].experience) {
                    Requirement temp = reqArr[i];
                    reqArr[i] = reqArr[j];
                    reqArr[j] = temp;
                }
            }
        }
        for (int i = 0; i < reqArr.length; i++) {
            for (int j = i + 1; j < reqArr.length; j++) {
                if (reqArr[i].experience == reqArr[j].experience) {
                    if (reqArr[i].name.compareToIgnoreCase(reqArr[j].name) > 0) {
                        Requirement temp = reqArr[i];
                        reqArr[i] = reqArr[j];
                        reqArr[j] = temp;
                    }
                }
            }
        }

        for (Requirement obj : reqArr) obj.display();
    }
}

 
