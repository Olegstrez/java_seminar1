package dz2;

public class myPow {

    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        if (x == 1) {
            return 1.0;
        }
        if (n == 1) {
            return x;
        }

        if (n % 2 == 0) {
            return myPow(x * x, n / 2);

        } else if (n % 2 == 1) {
            return myPow(x, (n - 1)) * x;
        } else {
            return myPow(1 / x, -n);
        }

    }
}

