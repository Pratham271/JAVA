import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float x0,y0,m1,m2,m3,m4,m,y,x,h,xn;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter x0,y0,xn,h:");
        x0=s.nextFloat();
        y0=s.nextFloat();
        xn=s.nextFloat();
        h=s.nextFloat();
        x=x0;
        y=y0;
        System.out.println("\n\nX\t\t\tY\n");
        while(x<xn)
        {
            m1 = f1(x0, y0);
            m2 = f((float)(x0 + h / 2.0), (float)(y0 + m1 * h / 2.0));
            m3 = f1((float)(x0 + h / 2.0), (float)(y0 + m2 * h / 2.0));
            m4 = f(x0 + h, y0 + m3 * h);
            m=((m1+2*m2+2*m3+m4)/6);
            y=y+m*h;
            x=x+h;
            System.out.println("\t\n" +x+ "\t\t" +y);
        }
    }
    public static float f(float x,float y){
        float m;
        float a= (float) 0.66;
        float b = (float) 1.33;

        m=((a*x)-b*x*y);
        return m;
    }
    public static float f1(float x, float y){
        float c = 1,d=1;
        float m;
        m=((d*x*y)-(c*y));
        return m;
    }
}
