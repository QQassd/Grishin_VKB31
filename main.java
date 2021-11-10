import java.util.*;

public class main
{
    static double a, b, c, d;

    static double f(double x)
    {
        return a*x*x*x + b*x*x + c*x + d;
    }

    public static void main(String[] args)

    {
        Scanner con = new Scanner(System.in);
        a = con.nextDouble();
        b = con.nextDouble();
        c = con.nextDouble();
        d = con.nextDouble();

        double right = 1;
        while(f(right) * f(-right) >= 0) right *= 2;
        double left = -right;
        while (right - left > 1e-6)

        {
            double middle = (left + right) / 2;
            if (f(middle) * f(right) > 0) right = middle;
            else left = middle;
        }

        System.out.println(left);
        con.close();

    }

}
