import java.util.Arrays;

public class MyFirstClass {


    public static void main(String[] args) {
        System.out.println(" Ich werde auf der Remote angezeigt"); //Output - Terminal zeigt den compiled Terminal an

        System.out.println(Arrays.toString(args)); // durch die toString Methode werden die Namen des Objektes ausgegeben
        System.out.println(args); // es zeigt den Speicherort an und nicht das Objekt selbst
    }
}
