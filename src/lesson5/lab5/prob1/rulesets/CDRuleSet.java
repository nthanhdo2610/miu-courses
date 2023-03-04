package lesson5.lab5.prob1.rulesets;

import lesson5.lab5.prob1.gui.CDWindow;

import java.awt.Component;
import java.util.logging.Logger;

/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Price must be a floating point number with two decimal places
 * 3. Price must be a number greater than 0.49.
 */

public class CDRuleSet implements RuleSet {

    private static final Logger LOGGER = Logger.getLogger(CDRuleSet.class.getName());

    @Override
    public void applyRules(Component ob) throws RuleException {
        CDWindow cdWindow = (CDWindow) ob;
        RuleUtil.nonempty(cdWindow.textFieldList());
        RuleUtil.validatePrice(cdWindow.getPriceValue());
    }
}
