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
  private MetafieldAdminAccess admin;

  /**
   * The storefront access setting to use for the metafields under this definition.
   */
  private MetafieldStorefrontAccess storefront;

  public MetafieldAccessInput() {
  }

  /**
   * The admin access setting to use for the metafields under this definition.
   */
  public MetafieldAdminAccess getAdmin() {
    return admin;
  }

  public void setAdmin(MetafieldAdminAccess admin) {
    this.admin = admin;
  }

  /**
   * The storefront access setting to use for the metafields under this definition.
   */
  public MetafieldStorefrontAccess getStorefront() {
    return storefront;
  }

  public void setStorefront(MetafieldStorefrontAccess storefront) {
    this.storefront = storefront;
  }

  @Override
  public String toString() {
    return "MetafieldAccessInput{admin='" + admin + "', storefront='" + storefront + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldAccessInput that = (MetafieldAccessInput) o;
    return Objects.equals(admin, that.admin) &&
        Objects.equals(storefront, that.storefront);
  }

  @Override
  public int hashCode() {
    return Objects.hash(admin, storefront);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The admin access setting to use for the metafields under this definition.
     */
    private MetafieldAdminAccess admin;

    /**
     * The storefront access setting to use for the metafields under this definition.
     */
    private MetafieldStorefrontAccess storefront;

    public MetafieldAccessInput build() {
      MetafieldAccessInput result = new MetafieldAccessInput();
      result.admin = this.admin;
      result.storefront = this.storefront;
      return result;
    }

    /**
     * The admin access setting to use for the metafields under this definition.
     */
    public Builder admin(MetafieldAdminAccess admin) {
      this.admin = admin;
      return this;
    }

    /**
     * The storefront access setting to use for the metafields under this definition.
     */
    public Builder storefront(MetafieldStorefrontAccess storefront) {
      this.storefront = storefront;
      return this;
    }
  }
}
