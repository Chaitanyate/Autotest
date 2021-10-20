package Day3;

public class testresult {
    public static void main(String[] args){
        jim jim = new jim();
        kim kim = new kim();
        System.out.println("Addition of jim"+jim.addnum(2,3));
        System.out.println("Subtraction of jim"+jim.subnum(10,5));
        System.out.println("Division of jim"+jim.divnum(10,2));

        System.out.println("<------------------------->");
        System.out.println("Addition of kim"+kim.addnum(4,4));
        System.out.println("Subtraction of kim"+kim.subnum(2,2));
        System.out.println("power of kim"+kim.pownum(2,2));

    }
}
