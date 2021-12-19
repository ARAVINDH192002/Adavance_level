import java.util.*;

class Mark {
    int rollNo;
    int m1;
    int m2;
    int m3;

    Mark(int rollNo, int m1, int m2, int m3) {
        this.rollNo = rollNo;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public int totalMark() {
        return this.m1 + this.m2 + this.m3;
    }

    public int mark(int i) {
        switch (i) {
            case 1:
                return this.m1;
            case 2:
                return this.m2;
            case 3:
                return this.m3;
            default:
                return -1;
        }
    }
}

class Mark_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Mark[] markArr = new Mark[n];

        for (int i = 0; i < markArr.length; i++) {
            int rollNo = sc.nextInt();
            int m1 = sc.nextInt();
            int m2 = sc.nextInt();
            int m3 = sc.nextInt();

            markArr[i] = new Mark(rollNo, m1, m2, m3);
        }

        ArrayList<Integer> totMarkArr = new ArrayList<>();
        for (int i = 0; i < markArr.length; i++) {
            totMarkArr.add(markArr[i].totalMark());
            System.out.println(markArr[i].totalMark());
        }

        for (int j = 0; j < 3; j++) {
            int maxMark = 0, ind = 0;
            for (Mark obj : markArr) {
                maxMark = Math.max(maxMark, obj.mark(j + 1));
                if (maxMark == obj.mark(j + 1)) ind = obj.rollNo;
            }
            System.out.println(ind + " " + maxMark);
        }
        int maxTot = Collections.max(totMarkArr);
        System.out.println(totMarkArr.indexOf(maxTot) + 1 + " " + maxTot);
    }
}
