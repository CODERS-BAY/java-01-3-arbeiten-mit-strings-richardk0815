public class VariablenUndDatentypen {
    public static void main(String[] args) {
        String text = " HelloWorld! ";
        System.out.println(text);
        System.out.println("String-Länge = " + text.length());
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.replaceFirst("World", "Codersbay"));
        System.out.println(text.stripLeading());
        System.out.println(text.repeat(15));
        for (int zaehler=1; zaehler <= 15; zaehler++) {
            System.out.println(text);
        }
    }
}
