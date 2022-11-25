package dz2;

public class ClimbingStairs {
    int[] num = new int[100];

    public int climbStairs(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        if (num[n - 1] == 0)
            num[n - 1] = climbStairs(n - 1);
        if (num[n - 2] == 0)
            num[n - 2] = climbStairs(n - 2);
        return num[n - 1] + num[n - 2];
//        Числа фибаначи дают ответ количество комбинаций
    }
}
