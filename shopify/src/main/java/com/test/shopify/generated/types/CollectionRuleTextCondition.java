package com.test.shopify.generated.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Specifies the condition for a text field.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CollectionRuleTextCondition implements CollectionRuleConditionObject {
  /**
   * The value of the condition.
   */
  private String value;

  public CollectionRuleTextCondition() {
  }

  /**
   * The value of the condition.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "CollectionRuleTextCondition{value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionRuleTextCondition that = (CollectionRuleTextCondition) o;
    return Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The value of the condition.
     */
    private String value;

    public CollectionRuleTextCondition build() {
      CollectionRuleTextCondition result = new CollectionRuleTextCondition();
      result.value = this.value;
      return result;
    }

    /**
     * The value of the condition.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
