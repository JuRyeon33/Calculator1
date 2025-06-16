interface Calculator {
    int compute(int a, int b);
}


public class Main {
    public static void main(String[] args) {
        Calculator mul = new Calculator() {
            @Override
            public int compute(int a, int b) {
                return a * b;
            }
        };

        System.out.println(mul.compute(3, 4));

        Calculator mulmul = new Calculator() {
            @Override
            public int compute(int a, int b) {
                return a * b * a * b;
            }
        };

        System.out.println(mulmul.compute(3, 4));
    }
}