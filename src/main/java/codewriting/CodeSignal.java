package codewriting;

public class CodeSignal {

    public static void main(String[] args) {
        System.out.println(reverseInParentheses("foo(bar)baz"));
    }

    /**
     * Write a function that reverses characters
     * in (possibly nested) parentheses in the input string.
     * Input strings will always be well-formed with matching ()s.
     */
    static String reverseInParentheses(String inputString) {
        if (inputString == null || inputString.length() == 0) {
            return "";
        }
        while (inputString.contains("(") && inputString.contains(")")) {
            int reverseFrom = -1;
            int reverseTo = -1;
            for (int i = 0; i < inputString.length(); i++) {
                if (inputString.charAt(i) == '(') {
                    reverseFrom = i;
                }
                if (inputString.charAt(i) == ')') {
                    reverseTo = i;
                }
                if (reverseFrom >= 0 && reverseTo >= 0) {
                    break;
                }
            }
            if (reverseFrom >= 0 && reverseTo >= 0) {
                String subString = inputString.substring(reverseFrom, reverseTo + 1);
                System.out.println(subString);
                String reverse = new StringBuilder(subString).reverse().toString().replaceAll("\\(", "").replaceAll("\\)", "");
                System.out.println(reverse);
//                inputString = inputString.replaceAll(subString, reverse);
                inputString = inputString.substring(0, reverseFrom) + reverse + inputString.substring(reverseTo+1);
            } else {
                return inputString;
            }
        }
        return inputString;
    }


}
