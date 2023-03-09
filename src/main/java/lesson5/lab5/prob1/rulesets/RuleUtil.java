package lesson5.lab5.prob1.rulesets;

public class RuleUtil {

    static void nonempty(String[] textFields) throws RuleException {
        for (String s : textFields) {
            if (s.isBlank()) {
                throw new RuleException("All fields must be nonempty");
            }
        }
    }

    static void validateIsbn(String isbn) throws RuleException {

        try {
            Long.parseLong(isbn);
            if (isbn.length() == 10) {
                if (!isbn.startsWith("0") && !isbn.startsWith("1")) {
                    throw new RuleException("If Isbn has length 10, the first digit must be 0 or 1");
                }
            } else if (isbn.length() == 13) {
                if (!isbn.startsWith("978") && !isbn.startsWith("978")) {
                    throw new RuleException("If Isbn has length 13, the first 3 digits must be either 978 or 979");
                }
            } else {
                throw new RuleException("Isbn must be numeric and consist of either 10 or 13 characters");
            }
        } catch (NumberFormatException ex) {
            throw new RuleException("Isbn must be numeric and consist of either 10 or 13 characters");
        }
    }

    static void validatePrice(String s) throws RuleException {
        try {
            float price = Float.parseFloat(s);
            if (price <= 0.49F) {
                throw new RuleException("Price must be a number greater than 0.49");
            }
        } catch (NumberFormatException ex) {
            throw new RuleException("Price must be a floating point number with two decimal places");
        }
    }
}
