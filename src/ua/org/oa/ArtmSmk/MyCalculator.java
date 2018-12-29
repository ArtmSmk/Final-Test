package ua.org.oa.ArtmSmk;

// task 9
public class MyCalculator {
    long power(int n, int p) {
        long exponent = 0;
        try {
            if (n < 0 || p < 0) {
                throw new MyException(n, p);
            } else if (n == 0 || p == 0) {
                throw new MyException(n, p);
            } else if (n > 0 && p > 0) {
                exponent = (long) Math.pow(n, p);
            }
        } catch (MyException myException) {
            myException.printStackTrace();
        }
        return exponent;
    }
}

