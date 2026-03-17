public class uc4 {
    public static void main(String[] args) {

        String name = "";

        if (args.length == 0) {
            name = "World";
        } 
        else {
            for (int i = 0; i < args.length; i++) {
                name = name + args[i];

                if (i < args.length - 1) {
                    name = name + ", ";
                }
            }
        }

        System.out.println("Hello, " + name + "!");
    }
}