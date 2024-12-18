package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields used to create a web presence for a market.
 */
public class MarketWebPresenceCreateInput {
  /**
   * The web presence's domain ID. This field must be `null` if the `subfolderSuffix` isn't `null`.
   */
  private String domainId;

  /**
   * The default locale for the market’s web presence.
   */
  private String defaultLocale;

  /**
   * The alternate locales for the market’s web presence.
   */
  private List<String> alternateLocales;

  /**
   * The market-specific suffix of the subfolders defined by the web presence.
   * For example: in `/en-us`, the subfolder suffix is `us`.
   * Only ASCII characters are allowed. This field must be `null` if the `domainId` isn't `null`.
   */
  private String subfolderSuffix;

  public MarketWebPresenceCreateInput() {
  }

  /**
   * The web presence's domain ID. This field must be `null` if the `subfolderSuffix` isn't `null`.
   */
  public String getDomainId() {
    return domainId;
  }

  public void setDomainId(String domainId) {
    this.domainId = domainId;
  }

  /**
   * The default locale for the market’s web presence.
   */
  public String getDefaultLocale() {
    return defaultLocale;
  }

  public void setDefaultLocale(String defaultLocale) {
    this.defaultLocale = defaultLocale;
  }

  /**
   * The alternate locales for the market’s web presence.
   */
  public List<String> getAlternateLocales() {
    return alternateLocales;
  }

  public void setAlternateLocales(List<String> alternateLocales) {
    this.alternateLocales = alternateLocales;
  }

  /**
   * The market-specific suffix of the subfolders defined by the web presence.
   * For example: in `/en-us`, the subfolder suffix is `us`.
   * Only ASCII characters are allowed. This field must be `null` if the `domainId` isn't `null`.
   */
  public String getSubfolderSuffix() {
    return subfolderSuffix;
  }

  public void setSubfolderSuffix(String subfolderSuffix) {
    this.subfolderSuffix = subfolderSuffix;
  }

  @Override
  public String toString() {
    return "MarketWebPresenceCreateInput{domainId='" + domainId + "', defaultLocale='" + defaultLocale + "', alternateLocales='" + alternateLocales + "', subfolderSuffix='" + subfolderSuffix + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketWebPresenceCreateInput that = (MarketWebPresenceCreateInput) o;
    return Objects.equals(domainId, that.domainId) &&
        Objects.equals(defaultLocale, that.defaultLocale) &&
        Objects.equals(alternateLocales, that.alternateLocales) &&
        Objects.equals(subfolderSuffix, that.subfolderSuffix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainId, defaultLocale, alternateLocales, subfolderSuffix);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The web presence's domain ID. This field must be `null` if the `subfolderSuffix` isn't `null`.
     */
    private String domainId;

    /**
     * The default locale for the market’s web presence.
     */
    private String defaultLocale;

    /**
     * The alternate locales for the market’s web presence.
     */
    private List<String> alternateLocales;

    /**
     * The market-specific suffix of the subfolders defined by the web presence.
     * For example: in `/en-us`, the subfolder suffix is `us`.
     * Only ASCII characters are allowed. This field must be `null` if the `domainId` isn't `null`.
     */
    private String subfolderSuffix;

    public MarketWebPresenceCreateInput build() {
      MarketWebPresenceCreateInput result = new MarketWebPresenceCreateInput();
      result.domainId = this.domainId;
      result.defaultLocale = this.defaultLocale;
      result.alternateLocales = this.alternateLocales;
      result.subfolderSuffix = this.subfolderSuffix;
      return result;
    }

    /**
     * The web presence's domain ID. This field must be `null` if the `subfolderSuffix` isn't `null`.
     */
    public Builder domainId(String domainId) {
      this.domainId = domainId;
      return this;
    }

    /**
     * The default locale for the market’s web presence.
     */
    public Builder defaultLocale(String defaultLocale) {
      this.defaultLocale = defaultLocale;
      return this;
    }

    /**
     * The alternate locales for the market’s web presence.
     */
    public Builder alternateLocales(List<String> alternateLocales) {
      this.alternateLocales = alternateLocales;
      return this;
    }

    /**
     * The market-specific suffix of the subfolders defined by the web presence.
     * For example: in `/en-us`, the subfolder suffix is `us`.
     * Only ASCII characters are allowed. This field must be `null` if the `domainId` isn't `null`.
     */
    public Builder subfolderSuffix(String subfolderSuffix) {
      this.subfolderSuffix = subfolderSuffix;
      return this;
    }
  }
}
