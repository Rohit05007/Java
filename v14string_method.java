import java.util.Scanner;

class v14string_method {
    public static void main(String[] args) {
        // string method

        String name = "ROHIT";
        // (1)
        int value = name.length();
        System.out.println(value);
        // (2)
        String lstring = name.toLowerCase();
        System.out.println(lstring);
        // (3)
        String ustring = name.toUpperCase();
        System.out.println(ustring);
        // (4)
        String nonTrimmedString = "           Rohit                ";
        System.out.println(nonTrimmedString);
        String trimedString = nonTrimmedString.trim();
        System.out.println(trimedString);
        // (5)
        System.out.println(name.substring(3));
        // (6)
        System.out.println(name.substring(1, 3));
        // (7)
        System.out.println(name.replace('R', 'M'));
        System.out.println(name.replace("ROH", "H"));
        // (8)
        System.out.println(name.startsWith("RO"));
        System.out.println(name.startsWith("MO"));
        // (9)
        System.out.println(name.endsWith("IT"));
        System.out.println(name.endsWith("ET"));
        // (10)
        System.out.println(name.charAt(4));
        // (11)
        System.out.println(name.indexOf("I"));
        // (12)
        String modifiedname = "Harryrry";
        System.out.println(modifiedname.indexOf("rry", 4));
        // (13)
        System.out.println(name.lastIndexOf("IT"));
        // (14)
        System.out.println(name.lastIndexOf("O", 2));
        // (15)
        System.out.println(name.equals("ROHIT"));
        System.out.println(name.equals("rohit"));
        // (16)
        System.out.println(name.equalsIgnoreCase("rohit"));
        System.out.println(name.equalsIgnoreCase("mohan"));
        // Escape sequence characters
        /*
             (1) (\n)= (For Newline)
             (2) (\t )=(For Tab)
             (3) (\')=(For Single quote)
             (4)(\\ )=(For Backslash)
             Etc.
         */
        System.out.println("I am escape sequence \n double quto");
        System.out.println("I am escape sequence \t double quto");
        System.out.println("I am escape sequence \' double quto");
        System.out.println("I am escape sequence \\ double quto");
        System.out.println("I am escape sequence \" double quto");

    }
}