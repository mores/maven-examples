package com.test.shopify.generated.types;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for specifying a product variant to create or update.
 */
public class ProductVariantInput {
  /**
   * Whether a product variant requires components. The default value is `false`.
   * If `true`, then the product variant can only be purchased as a parent bundle with components and it will be omitted
   * from channels that don't support bundles.
   */
  private Boolean requiresComponents;

  /**
   * The value of the barcode associated with the product.
   */
  private String barcode;

  /**
   * The compare-at price of the variant.
   */
  private String compareAtPrice;

  /**
   * Specifies the product variant to update or create a new variant if absent.
   */
  private String id;

  /**
   * The ID of the media to associate with the variant. This field can only be used
   * in mutations that create media images and must match one of the IDs being
   * created on the product. This field only accepts one value.
   */
  private String mediaId;

  /**
   * The URL of the media to associate with the variant. This field can only be
   * used in mutations that create media images and must match one of the URLs
   * being created on the product. This field only accepts one value.
   */
  private List<String> mediaSrc;

  /**
   * Whether customers are allowed to place an order for the product variant when it's out of stock.
   */
  private ProductVariantInventoryPolicy inventoryPolicy;

  /**
   * The inventory quantities at each location where the variant is stocked.
   * Supported as input with the `productVariantCreate` mutation only.
   */
  private List<InventoryLevelInput> inventoryQuantities;

  /**
   * The inventory item associated with the variant. Used for unit cost.
   */
  private InventoryItemInput inventoryItem;

  /**
   * Additional customizable information about the product variant.
   */
  private List<MetafieldInput> metafields;

  /**
   * The custom properties that a shop owner uses to define product variants.
   */
  private List<String> options;

  /**
   * The order of the product variant in the list of product variants. The first position in the list is 1.
   */
  private Integer position;

  /**
   * The price of the variant.
   */
  private String price;

  /**
   * The product to create the variant for. Used as input only to the `productVariantCreate` mutation.
   */
  private String productId;

  /**
   * Whether the variant is taxable.
   */
  private Boolean taxable;

  /**
   * The tax code associated with the variant.
   */
  private String taxCode;

  public ProductVariantInput() {
  }

  /**
   * Whether a product variant requires components. The default value is `false`.
   * If `true`, then the product variant can only be purchased as a parent bundle with components and it will be omitted
   * from channels that don't support bundles.
   */
  public Boolean getRequiresComponents() {
    return requiresComponents;
  }

  public void setRequiresComponents(Boolean requiresComponents) {
    this.requiresComponents = requiresComponents;
  }

  /**
   * The value of the barcode associated with the product.
   */
  public String getBarcode() {
    return barcode;
  }

  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }

  /**
   * The compare-at price of the variant.
   */
  public String getCompareAtPrice() {
    return compareAtPrice;
  }

  public void setCompareAtPrice(String compareAtPrice) {
    this.compareAtPrice = compareAtPrice;
  }

  /**
   * Specifies the product variant to update or create a new variant if absent.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The ID of the media to associate with the variant. This field can only be used
   * in mutations that create media images and must match one of the IDs being
   * created on the product. This field only accepts one value.
   */
  public String getMediaId() {
    return mediaId;
  }

  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }

  /**
   * The URL of the media to associate with the variant. This field can only be
   * used in mutations that create media images and must match one of the URLs
   * being created on the product. This field only accepts one value.
   */
  public List<String> getMediaSrc() {
    return mediaSrc;
  }

  public void setMediaSrc(List<String> mediaSrc) {
    this.mediaSrc = mediaSrc;
  }

  /**
   * Whether customers are allowed to place an order for the product variant when it's out of stock.
   */
  public ProductVariantInventoryPolicy getInventoryPolicy() {
    return inventoryPolicy;
  }

  public void setInventoryPolicy(ProductVariantInventoryPolicy inventoryPolicy) {
    this.inventoryPolicy = inventoryPolicy;
  }

  /**
   * The inventory quantities at each location where the variant is stocked.
   * Supported as input with the `productVariantCreate` mutation only.
   */
  public List<InventoryLevelInput> getInventoryQuantities() {
    return inventoryQuantities;
  }

  public void setInventoryQuantities(List<InventoryLevelInput> inventoryQuantities) {
    this.inventoryQuantities = inventoryQuantities;
  }

  /**
   * The inventory item associated with the variant. Used for unit cost.
   */
  public InventoryItemInput getInventoryItem() {
    return inventoryItem;
  }

  public void setInventoryItem(InventoryItemInput inventoryItem) {
    this.inventoryItem = inventoryItem;
  }

  /**
   * Additional customizable information about the product variant.
   */
  public List<MetafieldInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<MetafieldInput> metafields) {
    this.metafields = metafields;
  }

  /**
   * The custom properties that a shop owner uses to define product variants.
   */
  public List<String> getOptions() {
    return options;
  }

  public void setOptions(List<String> options) {
    this.options = options;
  }

  /**
   * The order of the product variant in the list of product variants. The first position in the list is 1.
   */
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  /**
   * The price of the variant.
   */
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  /**
   * The product to create the variant for. Used as input only to the `productVariantCreate` mutation.
   */
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  /**
   * Whether the variant is taxable.
   */
  public Boolean getTaxable() {
    return taxable;
  }

  public void setTaxable(Boolean taxable) {
    this.taxable = taxable;
  }

  /**
   * The tax code associated with the variant.
   */
  public String getTaxCode() {
    return taxCode;
  }

  public void setTaxCode(String taxCode) {
    this.taxCode = taxCode;
  }

  @Override
  public String toString() {
    return "ProductVariantInput{requiresComponents='" + requiresComponents + "', barcode='" + barcode + "', compareAtPrice='" + compareAtPrice + "', id='" + id + "', mediaId='" + mediaId + "', mediaSrc='" + mediaSrc + "', inventoryPolicy='" + inventoryPolicy + "', inventoryQuantities='" + inventoryQuantities + "', inventoryItem='" + inventoryItem + "', metafields='" + metafields + "', options='" + options + "', position='" + position + "', price='" + price + "', productId='" + productId + "', taxable='" + taxable + "', taxCode='" + taxCode + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductVariantInput that = (ProductVariantInput) o;
    return Objects.equals(requiresComponents, that.requiresComponents) &&
        Objects.equals(barcode, that.barcode) &&
        Objects.equals(compareAtPrice, that.compareAtPrice) &&
        Objects.equals(id, that.id) &&
        Objects.equals(mediaId, that.mediaId) &&
        Objects.equals(mediaSrc, that.mediaSrc) &&
        Objects.equals(inventoryPolicy, that.inventoryPolicy) &&
        Objects.equals(inventoryQuantities, that.inventoryQuantities) &&
        Objects.equals(inventoryItem, that.inventoryItem) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(options, that.options) &&
        Objects.equals(position, that.position) &&
        Objects.equals(price, that.price) &&
        Objects.equals(productId, that.productId) &&
        Objects.equals(taxable, that.taxable) &&
        Objects.equals(taxCode, that.taxCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiresComponents, barcode, compareAtPrice, id, mediaId, mediaSrc, inventoryPolicy, inventoryQuantities, inventoryItem, metafields, options, position, price, productId, taxable, taxCode);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether a product variant requires components. The default value is `false`.
     * If `true`, then the product variant can only be purchased as a parent bundle with components and it will be omitted
     * from channels that don't support bundles.
     */
    private Boolean requiresComponents;

    /**
     * The value of the barcode associated with the product.
     */
    private String barcode;

    /**
     * The compare-at price of the variant.
     */
    private String compareAtPrice;

    /**
     * Specifies the product variant to update or create a new variant if absent.
     */
    private String id;

    /**
     * The ID of the media to associate with the variant. This field can only be used
     * in mutations that create media images and must match one of the IDs being
     * created on the product. This field only accepts one value.
     */
    private String mediaId;

    /**
     * The URL of the media to associate with the variant. This field can only be
     * used in mutations that create media images and must match one of the URLs
     * being created on the product. This field only accepts one value.
     */
    private List<String> mediaSrc;

    /**
     * Whether customers are allowed to place an order for the product variant when it's out of stock.
     */
    private ProductVariantInventoryPolicy inventoryPolicy;

    /**
     * The inventory quantities at each location where the variant is stocked.
     * Supported as input with the `productVariantCreate` mutation only.
     */
    private List<InventoryLevelInput> inventoryQuantities;

    /**
     * The inventory item associated with the variant. Used for unit cost.
     */
    private InventoryItemInput inventoryItem;

    /**
     * Additional customizable information about the product variant.
     */
    private List<MetafieldInput> metafields;

    /**
     * The custom properties that a shop owner uses to define product variants.
     */
    private List<String> options;

    /**
     * The order of the product variant in the list of product variants. The first position in the list is 1.
     */
    private Integer position;

    /**
     * The price of the variant.
     */
    private String price;

    /**
     * The product to create the variant for. Used as input only to the `productVariantCreate` mutation.
     */
    private String productId;

    /**
     * Whether the variant is taxable.
     */
    private Boolean taxable;

    /**
     * The tax code associated with the variant.
     */
    private String taxCode;

    public ProductVariantInput build() {
      ProductVariantInput result = new ProductVariantInput();
      result.requiresComponents = this.requiresComponents;
      result.barcode = this.barcode;
      result.compareAtPrice = this.compareAtPrice;
      result.id = this.id;
      result.mediaId = this.mediaId;
      result.mediaSrc = this.mediaSrc;
      result.inventoryPolicy = this.inventoryPolicy;
      result.inventoryQuantities = this.inventoryQuantities;
      result.inventoryItem = this.inventoryItem;
      result.metafields = this.metafields;
      result.options = this.options;
      result.position = this.position;
      result.price = this.price;
      result.productId = this.productId;
      result.taxable = this.taxable;
      result.taxCode = this.taxCode;
      return result;
    }

    /**
     * Whether a product variant requires components. The default value is `false`.
     * If `true`, then the product variant can only be purchased as a parent bundle with components and it will be omitted
     * from channels that don't support bundles.
     */
    public Builder requiresComponents(Boolean requiresComponents) {
      this.requiresComponents = requiresComponents;
      return this;
    }

    /**
     * The value of the barcode associated with the product.
     */
    public Builder barcode(String barcode) {
      this.barcode = barcode;
      return this;
    }

    /**
     * The compare-at price of the variant.
     */
    public Builder compareAtPrice(String compareAtPrice) {
      this.compareAtPrice = compareAtPrice;
      return this;
    }

    /**
     * Specifies the product variant to update or create a new variant if absent.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The ID of the media to associate with the variant. This field can only be used
     * in mutations that create media images and must match one of the IDs being
     * created on the product. This field only accepts one value.
     */
    public Builder mediaId(String mediaId) {
      this.mediaId = mediaId;
      return this;
    }

    /**
     * The URL of the media to associate with the variant. This field can only be
     * used in mutations that create media images and must match one of the URLs
     * being created on the product. This field only accepts one value.
     */
    public Builder mediaSrc(List<String> mediaSrc) {
      this.mediaSrc = mediaSrc;
      return this;
    }

    /**
     * Whether customers are allowed to place an order for the product variant when it's out of stock.
     */
    public Builder inventoryPolicy(ProductVariantInventoryPolicy inventoryPolicy) {
      this.inventoryPolicy = inventoryPolicy;
      return this;
    }

    /**
     * The inventory quantities at each location where the variant is stocked.
     * Supported as input with the `productVariantCreate` mutation only.
     */
    public Builder inventoryQuantities(List<InventoryLevelInput> inventoryQuantities) {
      this.inventoryQuantities = inventoryQuantities;
      return this;
    }

    /**
     * The inventory item associated with the variant. Used for unit cost.
     */
    public Builder inventoryItem(InventoryItemInput inventoryItem) {
      this.inventoryItem = inventoryItem;
      return this;
    }

    /**
     * Additional customizable information about the product variant.
     */
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * The custom properties that a shop owner uses to define product variants.
     */
    public Builder options(List<String> options) {
      this.options = options;
      return this;
    }

    /**
     * The order of the product variant in the list of product variants. The first position in the list is 1.
     */
    public Builder position(Integer position) {
      this.position = position;
      return this;
    }

    /**
     * The price of the variant.
     */
    public Builder price(String price) {
      this.price = price;
      return this;
    }

    /**
     * The product to create the variant for. Used as input only to the `productVariantCreate` mutation.
     */
    public Builder productId(String productId) {
      this.productId = productId;
      return this;
    }

    /**
     * Whether the variant is taxable.
     */
    public Builder taxable(Boolean taxable) {
      this.taxable = taxable;
      return this;
    }

    /**
     * The tax code associated with the variant.
     */
    public Builder taxCode(String taxCode) {
      this.taxCode = taxCode;
      return this;
    }
  }
}
