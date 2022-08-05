package recursion;

public class Power {
    public static void main(String[] args) {
        Power p = new Power();
        System.out.println(p.power(2,2));

    }
    public int power(int base, int exp) {
        if (exp<0) {
            return -1;
        }
        if (exp==0 || exp==1) {
            return base;
        }
        return base * power(base, exp-1);
    }
}
