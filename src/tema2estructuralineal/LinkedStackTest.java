package tema2estructuralineal;

import java.util.Arrays;

public class LinkedStackTest {

    public static <E> void reverse(E[] a) {

        Stack<E> buffer = new ArrayStack<>(a.length);

        for (int i = 0; i < a.length; i++) {
            buffer.push(a[i]);
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = buffer.pop();
        }
    }

    public static void main(String args[]) {

        Integer[] a = {4, 8, 15, 16, 23, 42};

        // autoboxing allows this
        String[] s = {"Jack", "Kate", "Hurley", "Jin", "Michael"};

        System.out.println("a = " + Arrays.toString(a));
        System.out.println("s = " + Arrays.toString(s));
        System.out.println("Reversing...");
        reverse(a);
        reverse(s);
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("s = " + Arrays.toString(s));

        System.out.println("----------");

        System.out.println("Matched...");
        String exp = "()";
        System.out.println(exp);
        System.out.println(isMatched(exp));

        System.out.println("-----------");

        System.out.println("HTML...");
        String html = """
                       <body>
                       <center>
                       <h1> The Little Boat </h1>
                       </center>
                       <p> The storm tossed the little
                       boat like a cheap sneaker in an
                       old washing machine. The three
                       drunken fishermen were used to
                       such treatment, of course, but
                       not the tree salesman, who even as
                       a stowaway now felt that he
                       had overpaid for the voyage. </p>
                       <ol>
                       <li> Will the salesman die? </li>
                       <li> What color is the boat? </li>
                       <li> And what about Naomi? </li>
                       </ol>
                       </body>""";
        
        System.out.println(html);
        System.out.println(isHTMLMatched(html));

    }

    public static boolean isMatched(String expression) {

        final String opening = "({[";
        final String closing = ")}]";
        Stack<Character> buffer = new LinkedStack<>();

        for (char c : expression.toCharArray()) {
            if (opening.indexOf(c) != -1) {
                buffer.push(c);
            } else if (closing.indexOf(c) != -1) {
                if (buffer.isEmpty()) {
                    return false;
                }
                if (closing.indexOf(c) != opening.indexOf(buffer.pop())) {
                    return false;
                }
            }
        }

        return buffer.isEmpty();
    }

    public static boolean isHTMLMatched(String html) {

        Stack<String> buffer = new LinkedStack<>();
        int j = html.indexOf('<');

        while (j != -1) {
            int k = html.indexOf('>', j + 1);
            if (k == -1) {
                return false;
            }
            String tag = html.substring(j + 1, k);
            if (!tag.startsWith("/")) {
                buffer.push(tag);
            } else {
                if (buffer.isEmpty()) {
                    return false;
                }
                if (!tag.substring(1).equals(buffer.pop())) {
                    return false;
                }
            }
            j = html.indexOf('<', k + 1);
        }
        return buffer.isEmpty();
    }
}
