package com.test.shopify.generated.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields specifying the behavior of checkout for a B2B buyer.
 */
public class BuyerExperienceConfigurationInput {
  /**
   * Whether to checkout to draft order for merchant review.
   */
  private Boolean checkoutToDraft;

  /**
   * Represents the merchant configured payment terms.
   */
  private String paymentTermsTemplateId;

  /**
   * Whether to allow customers to edit their shipping address at checkout.
   */
  private Boolean editableShippingAddress;

  public BuyerExperienceConfigurationInput() {
  }

  /**
   * Whether to checkout to draft order for merchant review.
   */
  public Boolean getCheckoutToDraft() {
    return checkoutToDraft;
  }

  public void setCheckoutToDraft(Boolean checkoutToDraft) {
    this.checkoutToDraft = checkoutToDraft;
  }

  /**
   * Represents the merchant configured payment terms.
   */
  public String getPaymentTermsTemplateId() {
    return paymentTermsTemplateId;
  }

  public void setPaymentTermsTemplateId(String paymentTermsTemplateId) {
    this.paymentTermsTemplateId = paymentTermsTemplateId;
  }

  /**
   * Whether to allow customers to edit their shipping address at checkout.
   */
  public Boolean getEditableShippingAddress() {
    return editableShippingAddress;
  }

  public void setEditableShippingAddress(Boolean editableShippingAddress) {
    this.editableShippingAddress = editableShippingAddress;
  }

  @Override
  public String toString() {
    return "BuyerExperienceConfigurationInput{checkoutToDraft='" + checkoutToDraft + "', paymentTermsTemplateId='" + paymentTermsTemplateId + "', editableShippingAddress='" + editableShippingAddress + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BuyerExperienceConfigurationInput that = (BuyerExperienceConfigurationInput) o;
    return Objects.equals(checkoutToDraft, that.checkoutToDraft) &&
        Objects.equals(paymentTermsTemplateId, that.paymentTermsTemplateId) &&
        Objects.equals(editableShippingAddress, that.editableShippingAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkoutToDraft, paymentTermsTemplateId, editableShippingAddress);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether to checkout to draft order for merchant review.
     */
    private Boolean checkoutToDraft;

    /**
     * Represents the merchant configured payment terms.
     */
    private String paymentTermsTemplateId;

    /**
     * Whether to allow customers to edit their shipping address at checkout.
     */
    private Boolean editableShippingAddress;

    public BuyerExperienceConfigurationInput build() {
      BuyerExperienceConfigurationInput result = new BuyerExperienceConfigurationInput();
      result.checkoutToDraft = this.checkoutToDraft;
      result.paymentTermsTemplateId = this.paymentTermsTemplateId;
      result.editableShippingAddress = this.editableShippingAddress;
      return result;
    }

    /**
     * Whether to checkout to draft order for merchant review.
     */
    public Builder checkoutToDraft(Boolean checkoutToDraft) {
      this.checkoutToDraft = checkoutToDraft;
      return this;
    }

    /**
     * Represents the merchant configured payment terms.
     */
    public Builder paymentTermsTemplateId(String paymentTermsTemplateId) {
      this.paymentTermsTemplateId = paymentTermsTemplateId;
      return this;
    }

    /**
     * Whether to allow customers to edit their shipping address at checkout.
     */
    public Builder editableShippingAddress(Boolean editableShippingAddress) {
      this.editableShippingAddress = editableShippingAddress;
      return this;
    }
  }
}
