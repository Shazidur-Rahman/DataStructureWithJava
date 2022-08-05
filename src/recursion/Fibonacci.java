package recursion;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci rec = new Fibonacci();
        System.out.println(rec.fibonacci(4));
    }

    public int fibonacci(int num){
        if (num < 0)
            return -1;
        if (num == 0 || num == 1)
            return num;
        return fibonacci(num -1) + fibonacci(num -2);
    }
}
