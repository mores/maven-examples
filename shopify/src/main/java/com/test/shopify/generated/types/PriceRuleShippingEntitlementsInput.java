package com.test.shopify.generated.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields to update a price rule shipping entitlement.
 */
public class PriceRuleShippingEntitlementsInput {
  /**
   * Whether the price rule applies to all shipping lines.
   */
  private Boolean targetAllShippingLines = false;

  /**
   * The codes for the countries to which the price rule applies to.
   */
  private List<CountryCode> countryCodes;

  /**
   * Whether the price rule is applicable to countries that haven't been defined in the shop's shipping zones.
   */
  private Boolean includeRestOfWorld = false;

  public PriceRuleShippingEntitlementsInput() {
  }

  /**
   * Whether the price rule applies to all shipping lines.
   */
  public Boolean getTargetAllShippingLines() {
    return targetAllShippingLines;
  }

  public void setTargetAllShippingLines(Boolean targetAllShippingLines) {
    this.targetAllShippingLines = targetAllShippingLines;
  }

  /**
   * The codes for the countries to which the price rule applies to.
   */
  public List<CountryCode> getCountryCodes() {
    return countryCodes;
  }

  public void setCountryCodes(List<CountryCode> countryCodes) {
    this.countryCodes = countryCodes;
  }

  /**
   * Whether the price rule is applicable to countries that haven't been defined in the shop's shipping zones.
   */
  public Boolean getIncludeRestOfWorld() {
    return includeRestOfWorld;
  }

  public void setIncludeRestOfWorld(Boolean includeRestOfWorld) {
    this.includeRestOfWorld = includeRestOfWorld;
  }

  @Override
  public String toString() {
    return "PriceRuleShippingEntitlementsInput{targetAllShippingLines='" + targetAllShippingLines + "', countryCodes='" + countryCodes + "', includeRestOfWorld='" + includeRestOfWorld + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceRuleShippingEntitlementsInput that = (PriceRuleShippingEntitlementsInput) o;
    return Objects.equals(targetAllShippingLines, that.targetAllShippingLines) &&
        Objects.equals(countryCodes, that.countryCodes) &&
        Objects.equals(includeRestOfWorld, that.includeRestOfWorld);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetAllShippingLines, countryCodes, includeRestOfWorld);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the price rule applies to all shipping lines.
     */
    private Boolean targetAllShippingLines = false;

    /**
     * The codes for the countries to which the price rule applies to.
     */
    private List<CountryCode> countryCodes;

    /**
     * Whether the price rule is applicable to countries that haven't been defined in the shop's shipping zones.
     */
    private Boolean includeRestOfWorld = false;

    public PriceRuleShippingEntitlementsInput build() {
      PriceRuleShippingEntitlementsInput result = new PriceRuleShippingEntitlementsInput();
      result.targetAllShippingLines = this.targetAllShippingLines;
      result.countryCodes = this.countryCodes;
      result.includeRestOfWorld = this.includeRestOfWorld;
      return result;
    }

    /**
     * Whether the price rule applies to all shipping lines.
     */
    public Builder targetAllShippingLines(Boolean targetAllShippingLines) {
      this.targetAllShippingLines = targetAllShippingLines;
      return this;
    }

    /**
     * The codes for the countries to which the price rule applies to.
     */
    public Builder countryCodes(List<CountryCode> countryCodes) {
      this.countryCodes = countryCodes;
      return this;
    }

    /**
     * Whether the price rule is applicable to countries that haven't been defined in the shop's shipping zones.
     */
    public Builder includeRestOfWorld(Boolean includeRestOfWorld) {
      this.includeRestOfWorld = includeRestOfWorld;
      return this;
    }
  }
}
