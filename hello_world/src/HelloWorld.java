public class HelloWorld {
    public static void main(String[] args){
        String myName = "eric";
        String message = "hello " + myName;
        System.out.println(message);
        message = message.replace("eric", "Eric");
        System.out.println(message);
    }
}
