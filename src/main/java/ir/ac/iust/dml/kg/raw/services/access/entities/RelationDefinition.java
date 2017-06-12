package ir.ac.iust.dml.kg.raw.services.access.entities;

import java.util.List;

public class RelationDefinition {
  private List<Integer> subject;
  private List<Integer> object;
  private List<Integer> predicate;
  private double accuracy;

  public List<Integer> getSubject() {
    return subject;
  }

  public void setSubject(List<Integer> subject) {
    this.subject = subject;
  }

  public List<Integer> getObject() {
    return object;
  }

  public void setObject(List<Integer> object) {
    this.object = object;
  }

  public List<Integer> getPredicate() {
    return predicate;
  }

  public void setPredicate(List<Integer> predicate) {
    this.predicate = predicate;
  }

  public double getAccuracy() {
    return accuracy;
  }

  public void setAccuracy(double accuracy) {
    this.accuracy = accuracy;
  }
}
