package Task10_01;

public class Calculator{
    /**
     * Method for adding 2 numbers
     */
    @CalcAnno(num1=1, num2=3)
    public double add(double num1, double num2){
        return num1+num2;
    }
    /**
     * Method for subtracting 2 numbers
     */
    @CalcAnno(num1=-100, num2=10)
    public double subtract(double num1, double num2){
        return num1-num2;
    }
    /**
     * Method for multiplying 2 numbers
     */
    @CalcAnno(num1=4, num2=7)
    public double multiply(double num1, double num2){
        return num1*num2;
    }
    /**
     * Method for dividing 2 numbers, second number != 0
     */
    @CalcAnno(num1=10, num2=3)
    public double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }else{
            System.out.println("Error: Second number is 0!");
            return 0;
        }
    }
}
