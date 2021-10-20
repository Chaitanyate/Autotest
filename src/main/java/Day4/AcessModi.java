package Day4;

public class AcessModi {

    public int a =10;
   private int b= 20;
  protected   int c=30;
    int d=40;

    public static void main(String[] args) {
        AcessModi ac = new AcessModi();
        System.out.println(ac.a);
        System.out.println(ac.b);
        System.out.println(ac.c);
        System.out.println(ac.d);

    }
}
