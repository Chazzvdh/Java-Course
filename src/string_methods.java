public class string_methods {
    public static void main(String[] arg) {
        // String = a reference data type that can store one or more characters
        //          reference data types have access to useful methods

        String name = "Chazz";

        //Boolean result = name.equals("Chazz");
        //int result = name.length();
        //char result = name.charAt(0);
        //int result = name.indexOf("h");
        //boolean result = name.isEmpty();
        //String result = name.toUpperCase();
        //String result = name.toLowerCase();
        //String result = name.trim();
        String result = name.replace("C", "T");



        System.out.println(result);
    }
}
