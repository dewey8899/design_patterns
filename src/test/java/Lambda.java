public class Lambda {
    final static String salutation = "Hello! ";

    public static void main(String args[]) {
        GreetingService greetService1 = (s) -> s+salutation;
        System.out.println(greetService1.sayMessage("Dewey"));
    }

    interface GreetingService {
        String sayMessage(String message);
    }
}
