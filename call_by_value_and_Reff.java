
// call by Reference

public class call_by_value_and_Reff {
    public static void main(String[] args) {
        Random r1 = new Random(4, 5);
        System.out.println(r1.x + " -> " + r1.y);
        addTen(r1);
        System.out.println(r1.x + " -> " + r1.y);
    }

    static void addTen(Random r) {
        r.x += 10;
        r.y += 10;
    }

}

class Random {
    int x;
    int y;

    Random(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

// call by value

// public class call_by_value_and_Reff {
// public static void main(String[] args) {
// int x = 4;
// int y = 5;
// System.out.println(x + " -> " + y);
// addTen(x, y);
// System.out.println(x + " -> " + y);
// }
// static void addTen(int x, int y) {
// x += 10;
// y += 10;
// }

// }
