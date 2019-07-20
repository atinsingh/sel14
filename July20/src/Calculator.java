public class Calculator {

    public int sum(int a, int b) {
        return a+b;
    }

    public double sum(double a, double b) {
        return a+b;
    }

    public long sum(long a, long b){
        return a+b;
    }
    public int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.sum(10.0,10);
    }
}
