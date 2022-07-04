public class ExceptionHandling {
    public static void main(String[] args) {
    try{
    int number1 = 12;
    int number2 = 0;
    System.out.println(number1/number2);
        }
    catch(ArrayIndexOutOfBoundsException excep){
    System.out.println("Exception Occurred");
        }
    finally
        {
    System.out.println("Finally Block");
        }
    }
    }