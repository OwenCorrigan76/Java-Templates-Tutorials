package exceptions;

public class ThrowingExceptions {

    // we can throw an exception - add it to method signature
    public double calculatePay(double hours, double payRate) throws NegativeInputException {
        if(hours > 40){
            // unchecked exception
            throw new IllegalArgumentException("Hours must be under 40");
        }
        if(hours < 0 || payRate < 0){
            // checked exception
            throw new NegativeInputException();
        }
        return hours * payRate;
    }
}
