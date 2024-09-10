public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int divideByZero = 5 / 0;
            System.out.println("Rest of code in try block");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException => " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception => " + e.getMessage());
        } finally {
            System.out.println("This is the finally block");
        }
    }
}

