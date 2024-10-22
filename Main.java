
public class Main {
    public static void main(String[] args) {
        MyComplex c1 = new MyComplex(3.0, 4.0);
        MyComplex c2 = new MyComplex(1.5, -2.0);

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

        c1.addInto(c2);
        System.out.println("c1 sau khi cộng c2: " + c1);

        MyComplex c3 = c1.addNew(c2);
        System.out.println("c3 = " + c3);
    }
}