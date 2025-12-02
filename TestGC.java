class Sample{
    int multiply(int a, int b){
        return a * b;
    }
    public class TestGC {
    public static void main(String[] args) {
        Sample obj = new Sample();
        int result = obj.multiply(5, 10);
        System.out.println("Multiplication Result: " + result);
    }
}