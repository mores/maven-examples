package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * The input fields to create an app discount.
 */
public class DiscountAutomaticAppInput {
  /**
   * Determines which discount classes the discount can combine with.
   */
  private DiscountCombinesWithInput combinesWith;

  /**
   * The ID of the function providing the app discount type.
   */
  private String functionId;

  /**
   * The title of the discount.
   */
  private String title;

  /**
   * The date and time when the discount starts.
   */
  private OffsetDateTime startsAt;

  /**
   * The date and time when the discount ends. For open-ended discounts, use `null`.
   */
  private OffsetDateTime endsAt;

  /**
   * Additional metafields to associate to the discount.
   */
  private List<MetafieldInput> metafields = Collections.emptyList();

  public DiscountAutomaticAppInput() {
  }

  /**
   * Determines which discount classes the discount can combine with.
   */
  public DiscountCombinesWithInput getCombinesWith() {
    return combinesWith;
  }

  public void setCombinesWith(DiscountCombinesWithInput combinesWith) {
    this.combinesWith = combinesWith;
  }

  /**
   * The ID of the function providing the app discount type.
   */
  public String getFunctionId() {
    return functionId;
  }

  public void setFunctionId(String functionId) {
    this.functionId = functionId;
  }

  /**
   * The title of the discount.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The date and time when the discount starts.
   */
  public OffsetDateTime getStartsAt() {
    return startsAt;
  }

  public void setStartsAt(OffsetDateTime startsAt) {
    this.startsAt = startsAt;
  }

  /**
   * The date and time when the discount ends. For open-ended discounts, use `null`.
   */
  public OffsetDateTime getEndsAt() {
    return endsAt;
  }

  public void setEndsAt(OffsetDateTime endsAt) {
    this.endsAt = endsAt;
  }

  /**
   * Additional metafields to associate to the discount.
   */
  public List<MetafieldInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<MetafieldInput> metafields) {
    this.metafields = metafields;
  }

  @Override
  public String toString() {
    return "DiscountAutomaticAppInput{combinesWith='" + combinesWith + "', functionId='" + functionId + "', title='" + title + "', startsAt='" + startsAt + "', endsAt='" + endsAt + "', metafields='" + metafields + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountAutomaticAppInput that = (DiscountAutomaticAppInput) o;
    return Objects.equals(combinesWith, that.combinesWith) &&
        Objects.equals(functionId, that.functionId) &&
        Objects.equals(title, that.title) &&
        Objects.equals(startsAt, that.startsAt) &&
        Objects.equals(endsAt, that.endsAt) &&
        Objects.equals(metafields, that.metafields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(combinesWith, functionId, title, startsAt, endsAt, metafields);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Determines which discount classes the discount can combine with.
     */
    private DiscountCombinesWithInput combinesWith;

    /**
     * The ID of the function providing the app discount type.
     */
    private String functionId;

    /**
     * The title of the discount.
     */
    private String title;

    /**
     * The date and time when the discount starts.
     */
    private OffsetDateTime startsAt;

    /**
     * The date and time when the discount ends. For open-ended discounts, use `null`.
     */
    private OffsetDateTime endsAt;

    /**
     * Additional metafields to associate to the discount.
     */
    private List<MetafieldInput> metafields = Collections.emptyList();

    public DiscountAutomaticAppInput build() {
      DiscountAutomaticAppInput result = new DiscountAutomaticAppInput();
      result.combinesWith = this.combinesWith;
      result.functionId = this.functionId;
      result.title = this.title;
      result.startsAt = this.startsAt;
      result.endsAt = this.endsAt;
      result.metafields = this.metafields;
      return result;
    }

    /**
     * Determines which discount classes the discount can combine with.
     */
    public Builder combinesWith(DiscountCombinesWithInput combinesWith) {
      this.combinesWith = combinesWith;
      return this;
    }

    /**
     * The ID of the function providing the app discount type.
     */
    public Builder functionId(String functionId) {
      this.functionId = functionId;
      return this;
    }

    /**
     * The title of the discount.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The date and time when the discount starts.
     */
    public Builder startsAt(OffsetDateTime startsAt) {
      this.startsAt = startsAt;
      return this;
    }

    /**
     * The date and time when the discount ends. For open-ended discounts, use `null`.
     */
    public Builder endsAt(OffsetDateTime endsAt) {
      this.endsAt = endsAt;
      return this;
    }

    /**
     * Additional metafields to associate to the discount.
     */
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
      return this;
    }
  }
}
