package ir.ac.iust.dml.kg.raw.services.access;

import edu.stanford.nlp.pipeline.Annotation;
import ir.ac.iust.dml.kg.raw.SentenceTokenizer;
import ir.ac.iust.dml.kg.raw.TextProcess;
import ir.ac.iust.dml.kg.raw.rulebased.ExtractTriple;
import ir.ac.iust.dml.kg.raw.rulebased.RuleAndPredicate;
import ir.ac.iust.dml.kg.raw.rulebased.Triple;
import ir.ac.iust.dml.kg.raw.services.access.entities.Rule;
import ir.ac.iust.dml.kg.raw.services.access.repositories.RuleRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mohammad on 7/13/2017.
 */
public class TripleExtractor {

    private RuleRepository ruleDao;
    public List<Triple> extractTriplesByRules(String input) throws Exception {
        List<Triple> result = new ArrayList<>();
        RuleTestData ruleTestData=new RuleTestData();
        ruleTestData.setText(input);
        List<Rule> rules=ruleDao.findAll();
        List<RuleAndPredicate> ruleAndPredicates=new ArrayList<>();
        for(Rule rule:rules)
        {
            RuleAndPredicate ruleAndPredicate=new RuleAndPredicate();
            ruleAndPredicate.setRule(rule.getRule());
            ruleAndPredicate.setPredicate(rule.getPredicate());
            ruleAndPredicates.add(ruleAndPredicate);
        }

        ruleTestData.setRules(ruleAndPredicates);
        ExtractTriple extractTriple = new ExtractTriple(ruleTestData.getRules());
        final List<String> lines = SentenceTokenizer.SentenceSplitterRaw(input);
        TextProcess tp = new TextProcess();
        for (String line : lines) {
            Annotation annotation = new Annotation(line);
            tp.preProcess(annotation);
            result.addAll(extractTriple.extractTripleFromAnnotation(annotation));
        }
        return result;
    }
}
