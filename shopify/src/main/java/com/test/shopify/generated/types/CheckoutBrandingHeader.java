package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The header customizations.
 */
public class CheckoutBrandingHeader {
  /**
   * The header alignment.
   */
  private CheckoutBrandingHeaderAlignment alignment;

  /**
   * The background image of the header.
   */
  private CheckoutBrandingImage banner;

  /**
   * The store logo.
   */
  private CheckoutBrandingLogo logo;

  /**
   * The header position.
   */
  private CheckoutBrandingHeaderPosition position;

  public CheckoutBrandingHeader() {
  }

  /**
   * The header alignment.
   */
  public CheckoutBrandingHeaderAlignment getAlignment() {
    return alignment;
  }

  public void setAlignment(CheckoutBrandingHeaderAlignment alignment) {
    this.alignment = alignment;
  }

  /**
   * The background image of the header.
   */
  public CheckoutBrandingImage getBanner() {
    return banner;
  }

  public void setBanner(CheckoutBrandingImage banner) {
    this.banner = banner;
  }

  /**
   * The store logo.
   */
  public CheckoutBrandingLogo getLogo() {
    return logo;
  }

  public void setLogo(CheckoutBrandingLogo logo) {
    this.logo = logo;
  }

  /**
   * The header position.
   */
  public CheckoutBrandingHeaderPosition getPosition() {
    return position;
  }

  public void setPosition(CheckoutBrandingHeaderPosition position) {
    this.position = position;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingHeader{alignment='" + alignment + "', banner='" + banner + "', logo='" + logo + "', position='" + position + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingHeader that = (CheckoutBrandingHeader) o;
    return Objects.equals(alignment, that.alignment) &&
        Objects.equals(banner, that.banner) &&
        Objects.equals(logo, that.logo) &&
        Objects.equals(position, that.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alignment, banner, logo, position);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The header alignment.
     */
    private CheckoutBrandingHeaderAlignment alignment;

    /**
     * The background image of the header.
     */
    private CheckoutBrandingImage banner;

    /**
     * The store logo.
     */
    private CheckoutBrandingLogo logo;

    /**
     * The header position.
     */
    private CheckoutBrandingHeaderPosition position;

    public CheckoutBrandingHeader build() {
      CheckoutBrandingHeader result = new CheckoutBrandingHeader();
      result.alignment = this.alignment;
      result.banner = this.banner;
      result.logo = this.logo;
      result.position = this.position;
      return result;
    }

    /**
     * The header alignment.
     */
    public Builder alignment(CheckoutBrandingHeaderAlignment alignment) {
      this.alignment = alignment;
      return this;
    }

    /**
     * The background image of the header.
     */
    public Builder banner(CheckoutBrandingImage banner) {
      this.banner = banner;
      return this;
    }

    /**
     * The store logo.
     */
    public Builder logo(CheckoutBrandingLogo logo) {
      this.logo = logo;
      return this;
    }

    /**
     * The header position.
     */
    public Builder position(CheckoutBrandingHeaderPosition position) {
      this.position = position;
      return this;
    }
  }
}
