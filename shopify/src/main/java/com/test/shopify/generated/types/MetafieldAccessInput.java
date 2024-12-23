package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the access settings for the metafields under the definition.
 */
public class MetafieldAccessInput {
  /**
   * The admin access setting to use for the metafields under this definition.
   */
  private MetafieldAdminAccessInput admin;

  /**
   * The storefront access setting to use for the metafields under this definition.
   */
  private MetafieldStorefrontAccessInput storefront;

  /**
   * The Customer Account API access setting to use for the metafields under this definition.
   */
  private MetafieldCustomerAccountAccessInput customerAccount;

  public MetafieldAccessInput() {
  }

  /**
   * The admin access setting to use for the metafields under this definition.
   */
  public MetafieldAdminAccessInput getAdmin() {
    return admin;
  }

  public void setAdmin(MetafieldAdminAccessInput admin) {
    this.admin = admin;
  }

  /**
   * The storefront access setting to use for the metafields under this definition.
   */
  public MetafieldStorefrontAccessInput getStorefront() {
    return storefront;
  }

  public void setStorefront(MetafieldStorefrontAccessInput storefront) {
    this.storefront = storefront;
  }

  /**
   * The Customer Account API access setting to use for the metafields under this definition.
   */
  public MetafieldCustomerAccountAccessInput getCustomerAccount() {
    return customerAccount;
  }

  public void setCustomerAccount(MetafieldCustomerAccountAccessInput customerAccount) {
    this.customerAccount = customerAccount;
  }

  @Override
  public String toString() {
    return "MetafieldAccessInput{admin='" + admin + "', storefront='" + storefront + "', customerAccount='" + customerAccount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldAccessInput that = (MetafieldAccessInput) o;
    return Objects.equals(admin, that.admin) &&
        Objects.equals(storefront, that.storefront) &&
        Objects.equals(customerAccount, that.customerAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(admin, storefront, customerAccount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The admin access setting to use for the metafields under this definition.
     */
    private MetafieldAdminAccessInput admin;

    /**
     * The storefront access setting to use for the metafields under this definition.
     */
    private MetafieldStorefrontAccessInput storefront;

    /**
     * The Customer Account API access setting to use for the metafields under this definition.
     */
    private MetafieldCustomerAccountAccessInput customerAccount;

    public MetafieldAccessInput build() {
      MetafieldAccessInput result = new MetafieldAccessInput();
      result.admin = this.admin;
      result.storefront = this.storefront;
      result.customerAccount = this.customerAccount;
      return result;
    }

    /**
     * The admin access setting to use for the metafields under this definition.
     */
    public Builder admin(MetafieldAdminAccessInput admin) {
      this.admin = admin;
      return this;
    }

    /**
     * The storefront access setting to use for the metafields under this definition.
     */
    public Builder storefront(MetafieldStorefrontAccessInput storefront) {
      this.storefront = storefront;
      return this;
    }

    /**
     * The Customer Account API access setting to use for the metafields under this definition.
     */
    public Builder customerAccount(MetafieldCustomerAccountAccessInput customerAccount) {
      this.customerAccount = customerAccount;
      return this;
    }
  }
}
