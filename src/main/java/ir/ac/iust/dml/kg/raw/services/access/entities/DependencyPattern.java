package ir.ac.iust.dml.kg.raw.services.access.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Document(collection = "dependencyPattern")
public class DependencyPattern {
  @Id
  @JsonIgnore
  private ObjectId uid;
  private String pattern;
  @Indexed
  private Integer count;
  @Indexed
  private Integer sentenceLength;
  private Set<String> samples = new HashSet<>();
  private List<RelationDefinition> relations = new ArrayList<>();

  public DependencyPattern() {
  }

  public DependencyPattern(String pattern) {
    this.pattern = pattern;
  }

  public ObjectId getUid() {
    return uid;
  }

  public void setUid(ObjectId uid) {
    this.uid = uid;
  }

  public String getPattern() {
    return pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public Integer getSentenceLength() {
    return sentenceLength;
  }

  public void setSentenceLength(Integer sentenceLength) {
    this.sentenceLength = sentenceLength;
  }

  public Set<String> getSamples() {
    return samples;
  }

  public void setSamples(Set<String> samples) {
    this.samples = samples;
  }

  public List<RelationDefinition> getRelations() {
    return relations;
  }

  public void setRelations(List<RelationDefinition> relations) {
    this.relations = relations;
  }
}
