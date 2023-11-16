package Task10_01;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        Class c = Calculator.class;

        try {
            Method m = c.getDeclaredMethod("add", double.class, double.class);
            CalcAnno anno = m.getAnnotation(CalcAnno.class);
            System.out.println("Add:  "+calculator.add(anno.num1(), anno.num2()));

            m = c.getMethod("subtract", double.class, double.class);
            anno = m.getAnnotation(CalcAnno.class);
            System.out.println("Subtract:  "+calculator.subtract(anno.num1(), anno.num2()));

            m = c.getMethod("multiply", double.class, double.class);
            anno = m.getAnnotation(CalcAnno.class);
            System.out.println("Multiply:  "+calculator.multiply(anno.num1(), anno.num2()));

            m = c.getMethod("divide", double.class, double.class);
            anno = m.getAnnotation(CalcAnno.class);
            System.out.println("Divide:  "+calculator.divide(anno.num1(), anno.num2()));
        }
        catch (Exception e){
            System.out.println(e);
            //e.getStackTrace();
        }
    }
}
