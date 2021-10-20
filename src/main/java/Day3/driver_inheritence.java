package Day3;

public class driver_inheritence {
    public static void main(String[] args) {
        trainpath tr = new trainpath();
        tr.launchapp("https://www.unionbankofindia.co.in/english/emicalculator.aspx");
        String s=tr.extractEmi("10000","5","20");
        System.out.println("the emi is"+s);
        //tr.tearDown();
    }
}
