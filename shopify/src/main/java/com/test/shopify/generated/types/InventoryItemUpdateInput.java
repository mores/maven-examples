package com.test.shopify.generated.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for an inventory item.
 */
public class InventoryItemUpdateInput {
  /**
   * Unit cost associated with the inventory item, the currency is the shop's default currency.
   */
  private String cost;

  /**
   * Whether the inventory item is tracked. The value must be true to adjust the item's inventory levels.
   */
  private Boolean tracked;

  /**
   * The ISO 3166-1 alpha-2 country code of where the item originated from.
   */
  private CountryCode countryCodeOfOrigin;

  /**
   * The ISO 3166-2 alpha-2 province/state code of where the item originated from.
   */
  private String provinceCodeOfOrigin;

  /**
   * The harmonized system code of the inventory item. This must be a number between 6 and 13 digits.
   */
  private String harmonizedSystemCode;

  /**
   * List of country-specific harmonized system codes.
   */
  private List<CountryHarmonizedSystemCodeInput> countryHarmonizedSystemCodes;

  public InventoryItemUpdateInput() {
  }

  /**
   * Unit cost associated with the inventory item, the currency is the shop's default currency.
   */
  public String getCost() {
    return cost;
  }

  public void setCost(String cost) {
    this.cost = cost;
  }

  /**
   * Whether the inventory item is tracked. The value must be true to adjust the item's inventory levels.
   */
  public Boolean getTracked() {
    return tracked;
  }

  public void setTracked(Boolean tracked) {
    this.tracked = tracked;
  }

  /**
   * The ISO 3166-1 alpha-2 country code of where the item originated from.
   */
  public CountryCode getCountryCodeOfOrigin() {
    return countryCodeOfOrigin;
  }

  public void setCountryCodeOfOrigin(CountryCode countryCodeOfOrigin) {
    this.countryCodeOfOrigin = countryCodeOfOrigin;
  }

  /**
   * The ISO 3166-2 alpha-2 province/state code of where the item originated from.
   */
  public String getProvinceCodeOfOrigin() {
    return provinceCodeOfOrigin;
  }

  public void setProvinceCodeOfOrigin(String provinceCodeOfOrigin) {
    this.provinceCodeOfOrigin = provinceCodeOfOrigin;
  }

  /**
   * The harmonized system code of the inventory item. This must be a number between 6 and 13 digits.
   */
  public String getHarmonizedSystemCode() {
    return harmonizedSystemCode;
  }

  public void setHarmonizedSystemCode(String harmonizedSystemCode) {
    this.harmonizedSystemCode = harmonizedSystemCode;
  }

  /**
   * List of country-specific harmonized system codes.
   */
  public List<CountryHarmonizedSystemCodeInput> getCountryHarmonizedSystemCodes() {
    return countryHarmonizedSystemCodes;
  }

  public void setCountryHarmonizedSystemCodes(
      List<CountryHarmonizedSystemCodeInput> countryHarmonizedSystemCodes) {
    this.countryHarmonizedSystemCodes = countryHarmonizedSystemCodes;
  }

  @Override
  public String toString() {
    return "InventoryItemUpdateInput{cost='" + cost + "', tracked='" + tracked + "', countryCodeOfOrigin='" + countryCodeOfOrigin + "', provinceCodeOfOrigin='" + provinceCodeOfOrigin + "', harmonizedSystemCode='" + harmonizedSystemCode + "', countryHarmonizedSystemCodes='" + countryHarmonizedSystemCodes + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryItemUpdateInput that = (InventoryItemUpdateInput) o;
    return Objects.equals(cost, that.cost) &&
        Objects.equals(tracked, that.tracked) &&
        Objects.equals(countryCodeOfOrigin, that.countryCodeOfOrigin) &&
        Objects.equals(provinceCodeOfOrigin, that.provinceCodeOfOrigin) &&
        Objects.equals(harmonizedSystemCode, that.harmonizedSystemCode) &&
        Objects.equals(countryHarmonizedSystemCodes, that.countryHarmonizedSystemCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cost, tracked, countryCodeOfOrigin, provinceCodeOfOrigin, harmonizedSystemCode, countryHarmonizedSystemCodes);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Unit cost associated with the inventory item, the currency is the shop's default currency.
     */
    private String cost;

    /**
     * Whether the inventory item is tracked. The value must be true to adjust the item's inventory levels.
     */
    private Boolean tracked;

    /**
     * The ISO 3166-1 alpha-2 country code of where the item originated from.
     */
    private CountryCode countryCodeOfOrigin;

    /**
     * The ISO 3166-2 alpha-2 province/state code of where the item originated from.
     */
    private String provinceCodeOfOrigin;

    /**
     * The harmonized system code of the inventory item. This must be a number between 6 and 13 digits.
     */
    private String harmonizedSystemCode;

    /**
     * List of country-specific harmonized system codes.
     */
    private List<CountryHarmonizedSystemCodeInput> countryHarmonizedSystemCodes;

    public InventoryItemUpdateInput build() {
      InventoryItemUpdateInput result = new InventoryItemUpdateInput();
      result.cost = this.cost;
      result.tracked = this.tracked;
      result.countryCodeOfOrigin = this.countryCodeOfOrigin;
      result.provinceCodeOfOrigin = this.provinceCodeOfOrigin;
      result.harmonizedSystemCode = this.harmonizedSystemCode;
      result.countryHarmonizedSystemCodes = this.countryHarmonizedSystemCodes;
      return result;
    }

    /**
     * Unit cost associated with the inventory item, the currency is the shop's default currency.
     */
    public Builder cost(String cost) {
      this.cost = cost;
      return this;
    }

    /**
     * Whether the inventory item is tracked. The value must be true to adjust the item's inventory levels.
     */
    public Builder tracked(Boolean tracked) {
      this.tracked = tracked;
      return this;
    }

    /**
     * The ISO 3166-1 alpha-2 country code of where the item originated from.
     */
    public Builder countryCodeOfOrigin(CountryCode countryCodeOfOrigin) {
      this.countryCodeOfOrigin = countryCodeOfOrigin;
      return this;
    }

    /**
     * The ISO 3166-2 alpha-2 province/state code of where the item originated from.
     */
    public Builder provinceCodeOfOrigin(String provinceCodeOfOrigin) {
      this.provinceCodeOfOrigin = provinceCodeOfOrigin;
      return this;
    }

    /**
     * The harmonized system code of the inventory item. This must be a number between 6 and 13 digits.
     */
    public Builder harmonizedSystemCode(String harmonizedSystemCode) {
      this.harmonizedSystemCode = harmonizedSystemCode;
      return this;
    }

    /**
     * List of country-specific harmonized system codes.
     */
    public Builder countryHarmonizedSystemCodes(
        List<CountryHarmonizedSystemCodeInput> countryHarmonizedSystemCodes) {
      this.countryHarmonizedSystemCodes = countryHarmonizedSystemCodes;
      return this;
    }
  }
}
