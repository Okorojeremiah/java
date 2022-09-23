package Chapter14;

public class StringIndexMethod {
    public static void main(String[] args) {

        String letters = "abcdefghijklmabcdefghijklm";

        System.out.printf("'c' is located at index %d%n", letters.indexOf('c'));
        System.out.printf("'a' is located at index %d%n", letters.indexOf('a', 1));
        System.out.printf("'def' is located at index %d%n", letters.indexOf("def", 7));
        System.out.printf("'$' is located at index %d%n", letters.indexOf('$'));
        System.out.printf(" 'c' is located at index %d%n", letters.indexOf("c"));
        System.out.printf("'hello' is located at index %d%n", letters.indexOf("hello"));

//      Using lastIndexOf;
        System.out.println();
        System.out.printf("'a' is located at lastIndex of %d%n", letters.lastIndexOf('a'));
        System.out.printf("'c' is located at lastIndex of %d%n", letters.lastIndexOf('c'));
        System.out.printf("'d' is located at lastIndex of %d%n", letters.lastIndexOf('d'));

        System.out.printf("'a' is located at lastIndex of %d%n", letters.lastIndexOf('a', 14));



    }
}
