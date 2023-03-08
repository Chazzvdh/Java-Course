public class wrapper_classes {
    public static void main(String[] arg) {
        // Wrapper class = provides a way to use primitive data types as reference data types
        //                  reference data types contain useful methods
        //                  can be used with collections (ex.ArrayList)

        // primitive    //wrapper
        //------        //------
        //boolean       //Boolean
        //char          //Character
        //int           //Integer
        //double        //Double

        // Autoboxing = the automatic conversions that java compiler
        //              makes between the primitive types, and their corresponding object wrapper classes
        // unboxing = the reverse of autoboxing. Automatic conversions of wrapper class to primitive

        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Chazz";

        if(a==true) {
            System.out.println("This is true");
        }
    }
}
