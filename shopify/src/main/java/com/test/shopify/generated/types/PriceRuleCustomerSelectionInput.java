package com.test.shopify.generated.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields to update a price rule customer selection.
 */
public class PriceRuleCustomerSelectionInput {
  /**
   * Whether the price rule applies to all customers.
   */
  private Boolean forAllCustomers = false;

  /**
   * List of customer segments that contain the customers to whom the price rule
   * applies. No single customer IDs may be present.
   */
  private List<String> segmentIds;

  /**
   * List of customers to add to the current list of customers to whom the price rule applies. `savedSearchIds` must be empty.
   */
  private List<String> customerIdsToAdd;

  /**
   * A list of customers to remove from the current list of customers to whom the price rule applies.
   */
  private List<String> customerIdsToRemove;

  public PriceRuleCustomerSelectionInput() {
  }

  /**
   * Whether the price rule applies to all customers.
   */
  public Boolean getForAllCustomers() {
    return forAllCustomers;
  }

  public void setForAllCustomers(Boolean forAllCustomers) {
    this.forAllCustomers = forAllCustomers;
  }

  /**
   * List of customer segments that contain the customers to whom the price rule
   * applies. No single customer IDs may be present.
   */
  public List<String> getSegmentIds() {
    return segmentIds;
  }

  public void setSegmentIds(List<String> segmentIds) {
    this.segmentIds = segmentIds;
  }

  /**
   * List of customers to add to the current list of customers to whom the price rule applies. `savedSearchIds` must be empty.
   */
  public List<String> getCustomerIdsToAdd() {
    return customerIdsToAdd;
  }

  public void setCustomerIdsToAdd(List<String> customerIdsToAdd) {
    this.customerIdsToAdd = customerIdsToAdd;
  }

  /**
   * A list of customers to remove from the current list of customers to whom the price rule applies.
   */
  public List<String> getCustomerIdsToRemove() {
    return customerIdsToRemove;
  }

  public void setCustomerIdsToRemove(List<String> customerIdsToRemove) {
    this.customerIdsToRemove = customerIdsToRemove;
  }

  @Override
  public String toString() {
    return "PriceRuleCustomerSelectionInput{forAllCustomers='" + forAllCustomers + "', segmentIds='" + segmentIds + "', customerIdsToAdd='" + customerIdsToAdd + "', customerIdsToRemove='" + customerIdsToRemove + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceRuleCustomerSelectionInput that = (PriceRuleCustomerSelectionInput) o;
    return Objects.equals(forAllCustomers, that.forAllCustomers) &&
        Objects.equals(segmentIds, that.segmentIds) &&
        Objects.equals(customerIdsToAdd, that.customerIdsToAdd) &&
        Objects.equals(customerIdsToRemove, that.customerIdsToRemove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forAllCustomers, segmentIds, customerIdsToAdd, customerIdsToRemove);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the price rule applies to all customers.
     */
    private Boolean forAllCustomers = false;

    /**
     * List of customer segments that contain the customers to whom the price rule
     * applies. No single customer IDs may be present.
     */
    private List<String> segmentIds;

    /**
     * List of customers to add to the current list of customers to whom the price rule applies. `savedSearchIds` must be empty.
     */
    private List<String> customerIdsToAdd;

    /**
     * A list of customers to remove from the current list of customers to whom the price rule applies.
     */
    private List<String> customerIdsToRemove;

    public PriceRuleCustomerSelectionInput build() {
      PriceRuleCustomerSelectionInput result = new PriceRuleCustomerSelectionInput();
      result.forAllCustomers = this.forAllCustomers;
      result.segmentIds = this.segmentIds;
      result.customerIdsToAdd = this.customerIdsToAdd;
      result.customerIdsToRemove = this.customerIdsToRemove;
      return result;
    }

    /**
     * Whether the price rule applies to all customers.
     */
    public Builder forAllCustomers(Boolean forAllCustomers) {
      this.forAllCustomers = forAllCustomers;
      return this;
    }

    /**
     * List of customer segments that contain the customers to whom the price rule
     * applies. No single customer IDs may be present.
     */
    public Builder segmentIds(List<String> segmentIds) {
      this.segmentIds = segmentIds;
      return this;
    }

    /**
     * List of customers to add to the current list of customers to whom the price rule applies. `savedSearchIds` must be empty.
     */
    public Builder customerIdsToAdd(List<String> customerIdsToAdd) {
      this.customerIdsToAdd = customerIdsToAdd;
      return this;
    }

    /**
     * A list of customers to remove from the current list of customers to whom the price rule applies.
     */
    public Builder customerIdsToRemove(List<String> customerIdsToRemove) {
      this.customerIdsToRemove = customerIdsToRemove;
      return this;
    }
  }
}
