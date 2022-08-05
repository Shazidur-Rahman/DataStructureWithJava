package recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        SumOfDigits s = new SumOfDigits();
        System.out.println(s.sum(121));
    }
    public int sum(int num){
        if (num==0 || num < 0) {
            return 0;
        }
        return num%10 + sum(num/10);
    }

}
