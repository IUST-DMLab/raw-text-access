package ir.ac.iust.dml.kg.raw.services.access.entities;

public class RelationDefinition {
  private Range subject;
  private Range object;
  private Range predicate;

  public Range getSubject() {
    return subject;
  }

  public void setSubject(Range subject) {
    this.subject = subject;
  }

  public Range getObject() {
    return object;
  }

  public void setObject(Range object) {
    this.object = object;
  }

  public Range getPredicate() {
    return predicate;
  }

  public void setPredicate(Range predicate) {
    this.predicate = predicate;
  }
}
