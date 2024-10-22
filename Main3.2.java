//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

            public static void main(String[] args) {
                MyPolynomial p1 = new MyPolynomial(2, -3, 1);
                MyPolynomial p2 = new MyPolynomial(1, 2);

                System.out.println("p1 = " + p1);
                System.out.println("p2 = " + p2);

                MyPolynomial p3 = p1.add(p2);
                System.out.println("p1 + p2 = " + p3);

                MyPolynomial p4 = p1.multiply(p2);
                System.out.println("p1 * p2 = " + p4);

                // Tính giá trị của đa thức p1 tại x = 2
                double result = p1.evaluate(2);
                System.out.println("p1(2) = " + result);
            }
        }
