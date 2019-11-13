package NumbersProblem;

/*
 * @author: LiuGuohu
 * @company: XGLAB
 * @description: 数值的整数次方 剑指offer
 * @date: 2019/11/10
 */
public class NumIntegerPower {

    public double power(double base, int exponent) {
        if (equal(base, 0.0))
            return 0.0;
        int abexponent = exponent;
        if (exponent < 0)
            abexponent = -abexponent;
        double res = getPower(base, abexponent);
        if (exponent < 0)
            res = 1.0 / res;
        return res;
    }

    private double getPower(double b, int e) {
        if (e == 0)
            return 1;
        if (e == 1)
            return b;
        double result = getPower(b, e >> 1);
        result *= result;

        if ((e & 1) == 1)
            result *= b;
        return result;
    }

    public boolean equal(double num1, double num2) {
        if (num1 - num2 > -0.000001 && num1 - num2 < 0.000001)
            return true;
        else
            return false;
    }
}
