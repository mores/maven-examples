package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields used to update the header customizations.
 */
public class CheckoutBrandingHeaderInput {
  /**
   * The header alignment.
   */
  private CheckoutBrandingHeaderAlignment alignment;

  /**
   * The header position.
   */
  private CheckoutBrandingHeaderPosition position;

  /**
   * The store logo.
   */
  private CheckoutBrandingLogoInput logo;

  /**
   * The background image of the header (must not be of SVG format).
   */
  private CheckoutBrandingImageInput banner;

  public CheckoutBrandingHeaderInput() {
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
   * The header position.
   */
  public CheckoutBrandingHeaderPosition getPosition() {
    return position;
  }

  public void setPosition(CheckoutBrandingHeaderPosition position) {
    this.position = position;
  }

  /**
   * The store logo.
   */
  public CheckoutBrandingLogoInput getLogo() {
    return logo;
  }

  public void setLogo(CheckoutBrandingLogoInput logo) {
    this.logo = logo;
  }

  /**
   * The background image of the header (must not be of SVG format).
   */
  public CheckoutBrandingImageInput getBanner() {
    return banner;
  }

  public void setBanner(CheckoutBrandingImageInput banner) {
    this.banner = banner;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingHeaderInput{alignment='" + alignment + "', position='" + position + "', logo='" + logo + "', banner='" + banner + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingHeaderInput that = (CheckoutBrandingHeaderInput) o;
    return Objects.equals(alignment, that.alignment) &&
        Objects.equals(position, that.position) &&
        Objects.equals(logo, that.logo) &&
        Objects.equals(banner, that.banner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alignment, position, logo, banner);
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
     * The header position.
     */
    private CheckoutBrandingHeaderPosition position;

    /**
     * The store logo.
     */
    private CheckoutBrandingLogoInput logo;

    /**
     * The background image of the header (must not be of SVG format).
     */
    private CheckoutBrandingImageInput banner;

    public CheckoutBrandingHeaderInput build() {
      CheckoutBrandingHeaderInput result = new CheckoutBrandingHeaderInput();
      result.alignment = this.alignment;
      result.position = this.position;
      result.logo = this.logo;
      result.banner = this.banner;
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
     * The header position.
     */
    public Builder position(CheckoutBrandingHeaderPosition position) {
      this.position = position;
      return this;
    }

    /**
     * The store logo.
     */
    public Builder logo(CheckoutBrandingLogoInput logo) {
      this.logo = logo;
      return this;
    }

    /**
     * The background image of the header (must not be of SVG format).
     */
    public Builder banner(CheckoutBrandingImageInput banner) {
      this.banner = banner;
      return this;
    }
  }
}
