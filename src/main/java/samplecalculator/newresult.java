package samplecalculator;

public class newresult {
    public static void main(String[] args) {
        samplecalc calc = new samplecalc();
        calc.launch("http://localhost:3000/");
        calc.performcalculation("20","10");
    }
}
