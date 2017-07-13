package ir.ac.iust.dml.kg.raw.services.access;
import ir.ac.iust.dml.kg.raw.rulebased.RuleAndPredicate;

import java.util.List;

/**
 * Created by mohammad on 7/13/2017.
 */
public class RuleTestData {
    private List<RuleAndPredicate> rules;
    private String text;

    public List<RuleAndPredicate> getRules() {
        return rules;
    }

    public void setRules(List<RuleAndPredicate> rules) {
        this.rules = rules;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
