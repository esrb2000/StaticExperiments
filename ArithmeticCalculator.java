public class ArithmeticCalculator {
    public int a;
    public int b;

    public ArithmeticCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate(Operation operation) {
        if (operation == Operation.ADD) {
            return  a + b;
        }
        return 0;
    }

}
