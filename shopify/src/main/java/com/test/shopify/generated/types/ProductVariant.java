package com.test.shopify.generated.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Represents a product variant.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ProductVariant implements CommentEventEmbed, MetafieldReference, MetafieldReferencer, com.test.shopify.generated.types.HasMetafieldDefinitions, com.test.shopify.generated.types.HasMetafields, com.test.shopify.generated.types.HasPublishedTranslations, com.test.shopify.generated.types.LegacyInteroperability, com.test.shopify.generated.types.Navigable, com.test.shopify.generated.types.Node {
  /**
   * Whether the product variant is available for sale.
   */
  private boolean availableForSale;

  /**
   * The value of the barcode associated with the product.
   */
  private String barcode;

  /**
   * The compare-at price of the variant in the default shop currency.
   */
  private String compareAtPrice;

  /**
   * The pricing that applies for a customer in a given context.
   */
  private ProductVariantContextualPricing contextualPricing;

  /**
   * The date and time when the variant was created.
   */
  private OffsetDateTime createdAt;

  /**
   * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
   * returns the single next record, sorted ascending by ID.
   */
  private String defaultCursor;

  /**
   * The [delivery profile](https://shopify.dev/api/admin-graphql/latest/objects/DeliveryProfile) for the variant.
   */
  private DeliveryProfile deliveryProfile;

  /**
   * Display name of the variant, based on product's title + variant's title.
   */
  private String displayName;

  /**
   * The fulfillment service that stocks a product variant.
   *   
   * This is a third-party fulfillment service if the following conditions are met:
   * - The product variant is stocked by a single fulfillment service.
   * - The [FulfillmentService](/api/admin-graphql/latest/objects/FulfillmentService)
   * is a third-party fulfillment service. Third-party fulfillment services don't
   * have a handle with the value `manual`.
   * - The fulfillment service hasn't [opted into SKU sharing](/api/admin-graphql/latest/objects/FulfillmentService#field-fulfillmentservice-permitsskusharing).
   *   
   * If the conditions aren't met, then the fulfillment service has the `manual` handle.
   */
  private FulfillmentService fulfillmentService;

  /**
   * Whether changes to the fulfillment service for the product variant are allowed.
   */
  private EditableProperty fulfillmentServiceEditable;

  /**
   * The Harmonized System Code (or HS Tariff Code) for the variant.
   */
  private String harmonizedSystemCode;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The featured image for the variant.
   */
  private Image image;

  /**
   * The inventory item, which is used to query for inventory information.
   */
  private InventoryItem inventoryItem;

  /**
   * The fulfillment service that tracks the number of items in stock for the product variant.
   */
  private ProductVariantInventoryManagement inventoryManagement;

  /**
   * Whether customers are allowed to place an order for the product variant when it's out of stock.
   */
  private ProductVariantInventoryPolicy inventoryPolicy;

  /**
   * The total sellable quantity of the variant.
   */
  private Integer inventoryQuantity;

  /**
   * The ID of the corresponding resource in the REST Admin API.
   */
  private String legacyResourceId;

  /**
   * The media associated with the product variant.
   */
  private MediaConnection media;

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
   * including its `namespace` and `key`, that's associated with a Shopify resource
   * for the purposes of adding and storing additional information.
   */
  private Metafield metafield;

  /**
   * List of metafield definitions.
   */
  private MetafieldDefinitionConnection metafieldDefinitions;

  /**
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  private MetafieldConnection metafields;

  /**
   * The order of the product variant in the list of product variants. The first position in the list is 1.
   */
  private int position;

  /**
   * List of prices and compare-at prices in the presentment currencies for this shop.
   */
  private ProductVariantPricePairConnection presentmentPrices;

  /**
   * The price of the product variant in the default shop currency.
   */
  private String price;

  /**
   * Returns a private metafield by namespace and key that belongs to the resource.
   */
  private PrivateMetafield privateMetafield;

  /**
   * List of private metafields that belong to the resource.
   */
  private PrivateMetafieldConnection privateMetafields;

  /**
   * The product that this variant belongs to.
   */
  private Product product;

  /**
   * A list of the product variant components.
   */
  private ProductVariantComponentConnection productVariantComponents;

  /**
   * Whether a product variant requires components. The default value is `false`.
   * If `true`, then the product variant can only be purchased as a parent bundle with components and it will be omitted
   * from channels that don't support bundles.
   */
  private boolean requiresComponents;

  /**
   * Whether a customer needs to provide a shipping address when placing an order for the product variant.
   */
  private boolean requiresShipping;

  /**
   * List of product options applied to the variant.
   */
  private List<SelectedOption> selectedOptions;

  /**
   * The total sellable quantity of the variant for online channels.
   * This doesn't represent the total available inventory or capture
   * [limitations based on customer location](https://help.shopify.com/manual/markets/inventory_and_fulfillment).
   */
  private int sellableOnlineQuantity;

  /**
   * Count of selling plan groups associated with the product variant.
   */
  private int sellingPlanGroupCount;

  /**
   * A list of all selling plan groups defined in the current shop associated with the product variant.
   */
  private SellingPlanGroupConnection sellingPlanGroups;

  /**
   * A case-sensitive identifier for the product variant in the shop.
   * Required in order to connect to a fulfillment service.
   */
  private String sku;

  /**
   * The Storefront GraphQL API ID of the `ProductVariant`.
   *   
   * As of the `2022-04` version release, the Storefront GraphQL API will no longer
   * return Base64 encoded IDs to match the behavior of the Admin GraphQL API.
   * Therefore, you can safely use the `id` field's value instead.
   */
  private String storefrontId;

  /**
   * The tax code for the product variant.
   */
  private String taxCode;

  /**
   * Whether a tax is charged when the product variant is sold.
   */
  private boolean taxable;

  /**
   * The title of the product variant.
   */
  private String title;

  /**
   * The published translations associated with the resource.
   */
  private List<Translation> translations;

  /**
   * The date and time (ISO 8601 format) when the product variant was last modified.
   */
  private OffsetDateTime updatedAt;

  /**
   * The weight of the product variant in the unit system specified with weight_unit.
   */
  private Double weight;

  /**
   * The unit of measurement that applies to the product variant's weight. If you
   * don't specify a value for weight_unit, then the shop's default unit of
   * measurement is applied. Valid values: `g`, `kg`, `oz`, `lb`.
   */
  private WeightUnit weightUnit;

  public ProductVariant() {
  }

  /**
   * Whether the product variant is available for sale.
   */
  public boolean getAvailableForSale() {
    return availableForSale;
  }

  public void setAvailableForSale(boolean availableForSale) {
    this.availableForSale = availableForSale;
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
   * The compare-at price of the variant in the default shop currency.
   */
  public String getCompareAtPrice() {
    return compareAtPrice;
  }

  public void setCompareAtPrice(String compareAtPrice) {
    this.compareAtPrice = compareAtPrice;
  }

  /**
   * The pricing that applies for a customer in a given context.
   */
  public ProductVariantContextualPricing getContextualPricing() {
    return contextualPricing;
  }

  public void setContextualPricing(ProductVariantContextualPricing contextualPricing) {
    this.contextualPricing = contextualPricing;
  }

  /**
   * The date and time when the variant was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
   * returns the single next record, sorted ascending by ID.
   */
  public String getDefaultCursor() {
    return defaultCursor;
  }

  public void setDefaultCursor(String defaultCursor) {
    this.defaultCursor = defaultCursor;
  }

  /**
   * The [delivery profile](https://shopify.dev/api/admin-graphql/latest/objects/DeliveryProfile) for the variant.
   */
  public DeliveryProfile getDeliveryProfile() {
    return deliveryProfile;
  }

  public void setDeliveryProfile(DeliveryProfile deliveryProfile) {
    this.deliveryProfile = deliveryProfile;
  }

  /**
   * Display name of the variant, based on product's title + variant's title.
   */
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * The fulfillment service that stocks a product variant.
   *   
   * This is a third-party fulfillment service if the following conditions are met:
   * - The product variant is stocked by a single fulfillment service.
   * - The [FulfillmentService](/api/admin-graphql/latest/objects/FulfillmentService)
   * is a third-party fulfillment service. Third-party fulfillment services don't
   * have a handle with the value `manual`.
   * - The fulfillment service hasn't [opted into SKU sharing](/api/admin-graphql/latest/objects/FulfillmentService#field-fulfillmentservice-permitsskusharing).
   *   
   * If the conditions aren't met, then the fulfillment service has the `manual` handle.
   */
  public FulfillmentService getFulfillmentService() {
    return fulfillmentService;
  }

  public void setFulfillmentService(FulfillmentService fulfillmentService) {
    this.fulfillmentService = fulfillmentService;
  }

  /**
   * Whether changes to the fulfillment service for the product variant are allowed.
   */
  public EditableProperty getFulfillmentServiceEditable() {
    return fulfillmentServiceEditable;
  }

  public void setFulfillmentServiceEditable(EditableProperty fulfillmentServiceEditable) {
    this.fulfillmentServiceEditable = fulfillmentServiceEditable;
  }

  /**
   * The Harmonized System Code (or HS Tariff Code) for the variant.
   */
  public String getHarmonizedSystemCode() {
    return harmonizedSystemCode;
  }

  public void setHarmonizedSystemCode(String harmonizedSystemCode) {
    this.harmonizedSystemCode = harmonizedSystemCode;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The featured image for the variant.
   */
  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }

  /**
   * The inventory item, which is used to query for inventory information.
   */
  public InventoryItem getInventoryItem() {
    return inventoryItem;
  }

  public void setInventoryItem(InventoryItem inventoryItem) {
    this.inventoryItem = inventoryItem;
  }

  /**
   * The fulfillment service that tracks the number of items in stock for the product variant.
   */
  public ProductVariantInventoryManagement getInventoryManagement() {
    return inventoryManagement;
  }

  public void setInventoryManagement(ProductVariantInventoryManagement inventoryManagement) {
    this.inventoryManagement = inventoryManagement;
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
   * The total sellable quantity of the variant.
   */
  public Integer getInventoryQuantity() {
    return inventoryQuantity;
  }

  public void setInventoryQuantity(Integer inventoryQuantity) {
    this.inventoryQuantity = inventoryQuantity;
  }

  /**
   * The ID of the corresponding resource in the REST Admin API.
   */
  public String getLegacyResourceId() {
    return legacyResourceId;
  }

  public void setLegacyResourceId(String legacyResourceId) {
    this.legacyResourceId = legacyResourceId;
  }

  /**
   * The media associated with the product variant.
   */
  public MediaConnection getMedia() {
    return media;
  }

  public void setMedia(MediaConnection media) {
    this.media = media;
  }

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
   * including its `namespace` and `key`, that's associated with a Shopify resource
   * for the purposes of adding and storing additional information.
   */
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  /**
   * List of metafield definitions.
   */
  public MetafieldDefinitionConnection getMetafieldDefinitions() {
    return metafieldDefinitions;
  }

  public void setMetafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
    this.metafieldDefinitions = metafieldDefinitions;
  }

  /**
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  public MetafieldConnection getMetafields() {
    return metafields;
  }

  public void setMetafields(MetafieldConnection metafields) {
    this.metafields = metafields;
  }

  /**
   * The order of the product variant in the list of product variants. The first position in the list is 1.
   */
  public int getPosition() {
    return position;
  }

  public void setPosition(int position) {
    this.position = position;
  }

  /**
   * List of prices and compare-at prices in the presentment currencies for this shop.
   */
  public ProductVariantPricePairConnection getPresentmentPrices() {
    return presentmentPrices;
  }

  public void setPresentmentPrices(ProductVariantPricePairConnection presentmentPrices) {
    this.presentmentPrices = presentmentPrices;
  }

  /**
   * The price of the product variant in the default shop currency.
   */
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  /**
   * Returns a private metafield by namespace and key that belongs to the resource.
   */
  public PrivateMetafield getPrivateMetafield() {
    return privateMetafield;
  }

  public void setPrivateMetafield(PrivateMetafield privateMetafield) {
    this.privateMetafield = privateMetafield;
  }

  /**
   * List of private metafields that belong to the resource.
   */
  public PrivateMetafieldConnection getPrivateMetafields() {
    return privateMetafields;
  }

  public void setPrivateMetafields(PrivateMetafieldConnection privateMetafields) {
    this.privateMetafields = privateMetafields;
  }

  /**
   * The product that this variant belongs to.
   */
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  /**
   * A list of the product variant components.
   */
  public ProductVariantComponentConnection getProductVariantComponents() {
    return productVariantComponents;
  }

  public void setProductVariantComponents(
      ProductVariantComponentConnection productVariantComponents) {
    this.productVariantComponents = productVariantComponents;
  }

  /**
   * Whether a product variant requires components. The default value is `false`.
   * If `true`, then the product variant can only be purchased as a parent bundle with components and it will be omitted
   * from channels that don't support bundles.
   */
  public boolean getRequiresComponents() {
    return requiresComponents;
  }

  public void setRequiresComponents(boolean requiresComponents) {
    this.requiresComponents = requiresComponents;
  }

  /**
   * Whether a customer needs to provide a shipping address when placing an order for the product variant.
   */
  public boolean getRequiresShipping() {
    return requiresShipping;
  }

  public void setRequiresShipping(boolean requiresShipping) {
    this.requiresShipping = requiresShipping;
  }

  /**
   * List of product options applied to the variant.
   */
  public List<SelectedOption> getSelectedOptions() {
    return selectedOptions;
  }

  public void setSelectedOptions(List<SelectedOption> selectedOptions) {
    this.selectedOptions = selectedOptions;
  }

  /**
   * The total sellable quantity of the variant for online channels.
   * This doesn't represent the total available inventory or capture
   * [limitations based on customer location](https://help.shopify.com/manual/markets/inventory_and_fulfillment).
   */
  public int getSellableOnlineQuantity() {
    return sellableOnlineQuantity;
  }

  public void setSellableOnlineQuantity(int sellableOnlineQuantity) {
    this.sellableOnlineQuantity = sellableOnlineQuantity;
  }

  /**
   * Count of selling plan groups associated with the product variant.
   */
  public int getSellingPlanGroupCount() {
    return sellingPlanGroupCount;
  }

  public void setSellingPlanGroupCount(int sellingPlanGroupCount) {
    this.sellingPlanGroupCount = sellingPlanGroupCount;
  }

  /**
   * A list of all selling plan groups defined in the current shop associated with the product variant.
   */
  public SellingPlanGroupConnection getSellingPlanGroups() {
    return sellingPlanGroups;
  }

  public void setSellingPlanGroups(SellingPlanGroupConnection sellingPlanGroups) {
    this.sellingPlanGroups = sellingPlanGroups;
  }

  /**
   * A case-sensitive identifier for the product variant in the shop.
   * Required in order to connect to a fulfillment service.
   */
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  /**
   * The Storefront GraphQL API ID of the `ProductVariant`.
   *   
   * As of the `2022-04` version release, the Storefront GraphQL API will no longer
   * return Base64 encoded IDs to match the behavior of the Admin GraphQL API.
   * Therefore, you can safely use the `id` field's value instead.
   */
  public String getStorefrontId() {
    return storefrontId;
  }

  public void setStorefrontId(String storefrontId) {
    this.storefrontId = storefrontId;
  }

  /**
   * The tax code for the product variant.
   */
  public String getTaxCode() {
    return taxCode;
  }

  public void setTaxCode(String taxCode) {
    this.taxCode = taxCode;
  }

  /**
   * Whether a tax is charged when the product variant is sold.
   */
  public boolean getTaxable() {
    return taxable;
  }

  public void setTaxable(boolean taxable) {
    this.taxable = taxable;
  }

  /**
   * The title of the product variant.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The published translations associated with the resource.
   */
  public List<Translation> getTranslations() {
    return translations;
  }

  public void setTranslations(List<Translation> translations) {
    this.translations = translations;
  }

  /**
   * The date and time (ISO 8601 format) when the product variant was last modified.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * The weight of the product variant in the unit system specified with weight_unit.
   */
  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  /**
   * The unit of measurement that applies to the product variant's weight. If you
   * don't specify a value for weight_unit, then the shop's default unit of
   * measurement is applied. Valid values: `g`, `kg`, `oz`, `lb`.
   */
  public WeightUnit getWeightUnit() {
    return weightUnit;
  }

  public void setWeightUnit(WeightUnit weightUnit) {
    this.weightUnit = weightUnit;
  }

  @Override
  public String toString() {
    return "ProductVariant{availableForSale='" + availableForSale + "', barcode='" + barcode + "', compareAtPrice='" + compareAtPrice + "', contextualPricing='" + contextualPricing + "', createdAt='" + createdAt + "', defaultCursor='" + defaultCursor + "', deliveryProfile='" + deliveryProfile + "', displayName='" + displayName + "', fulfillmentService='" + fulfillmentService + "', fulfillmentServiceEditable='" + fulfillmentServiceEditable + "', harmonizedSystemCode='" + harmonizedSystemCode + "', id='" + id + "', image='" + image + "', inventoryItem='" + inventoryItem + "', inventoryManagement='" + inventoryManagement + "', inventoryPolicy='" + inventoryPolicy + "', inventoryQuantity='" + inventoryQuantity + "', legacyResourceId='" + legacyResourceId + "', media='" + media + "', metafield='" + metafield + "', metafieldDefinitions='" + metafieldDefinitions + "', metafields='" + metafields + "', position='" + position + "', presentmentPrices='" + presentmentPrices + "', price='" + price + "', privateMetafield='" + privateMetafield + "', privateMetafields='" + privateMetafields + "', product='" + product + "', productVariantComponents='" + productVariantComponents + "', requiresComponents='" + requiresComponents + "', requiresShipping='" + requiresShipping + "', selectedOptions='" + selectedOptions + "', sellableOnlineQuantity='" + sellableOnlineQuantity + "', sellingPlanGroupCount='" + sellingPlanGroupCount + "', sellingPlanGroups='" + sellingPlanGroups + "', sku='" + sku + "', storefrontId='" + storefrontId + "', taxCode='" + taxCode + "', taxable='" + taxable + "', title='" + title + "', translations='" + translations + "', updatedAt='" + updatedAt + "', weight='" + weight + "', weightUnit='" + weightUnit + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductVariant that = (ProductVariant) o;
    return availableForSale == that.availableForSale &&
        Objects.equals(barcode, that.barcode) &&
        Objects.equals(compareAtPrice, that.compareAtPrice) &&
        Objects.equals(contextualPricing, that.contextualPricing) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(defaultCursor, that.defaultCursor) &&
        Objects.equals(deliveryProfile, that.deliveryProfile) &&
        Objects.equals(displayName, that.displayName) &&
        Objects.equals(fulfillmentService, that.fulfillmentService) &&
        Objects.equals(fulfillmentServiceEditable, that.fulfillmentServiceEditable) &&
        Objects.equals(harmonizedSystemCode, that.harmonizedSystemCode) &&
        Objects.equals(id, that.id) &&
        Objects.equals(image, that.image) &&
        Objects.equals(inventoryItem, that.inventoryItem) &&
        Objects.equals(inventoryManagement, that.inventoryManagement) &&
        Objects.equals(inventoryPolicy, that.inventoryPolicy) &&
        Objects.equals(inventoryQuantity, that.inventoryQuantity) &&
        Objects.equals(legacyResourceId, that.legacyResourceId) &&
        Objects.equals(media, that.media) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafieldDefinitions, that.metafieldDefinitions) &&
        Objects.equals(metafields, that.metafields) &&
        position == that.position &&
        Objects.equals(presentmentPrices, that.presentmentPrices) &&
        Objects.equals(price, that.price) &&
        Objects.equals(privateMetafield, that.privateMetafield) &&
        Objects.equals(privateMetafields, that.privateMetafields) &&
        Objects.equals(product, that.product) &&
        Objects.equals(productVariantComponents, that.productVariantComponents) &&
        requiresComponents == that.requiresComponents &&
        requiresShipping == that.requiresShipping &&
        Objects.equals(selectedOptions, that.selectedOptions) &&
        sellableOnlineQuantity == that.sellableOnlineQuantity &&
        sellingPlanGroupCount == that.sellingPlanGroupCount &&
        Objects.equals(sellingPlanGroups, that.sellingPlanGroups) &&
        Objects.equals(sku, that.sku) &&
        Objects.equals(storefrontId, that.storefrontId) &&
        Objects.equals(taxCode, that.taxCode) &&
        taxable == that.taxable &&
        Objects.equals(title, that.title) &&
        Objects.equals(translations, that.translations) &&
        Objects.equals(updatedAt, that.updatedAt) &&
        Objects.equals(weight, that.weight) &&
        Objects.equals(weightUnit, that.weightUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableForSale, barcode, compareAtPrice, contextualPricing, createdAt, defaultCursor, deliveryProfile, displayName, fulfillmentService, fulfillmentServiceEditable, harmonizedSystemCode, id, image, inventoryItem, inventoryManagement, inventoryPolicy, inventoryQuantity, legacyResourceId, media, metafield, metafieldDefinitions, metafields, position, presentmentPrices, price, privateMetafield, privateMetafields, product, productVariantComponents, requiresComponents, requiresShipping, selectedOptions, sellableOnlineQuantity, sellingPlanGroupCount, sellingPlanGroups, sku, storefrontId, taxCode, taxable, title, translations, updatedAt, weight, weightUnit);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the product variant is available for sale.
     */
    private boolean availableForSale;

    /**
     * The value of the barcode associated with the product.
     */
    private String barcode;

    /**
     * The compare-at price of the variant in the default shop currency.
     */
    private String compareAtPrice;

    /**
     * The pricing that applies for a customer in a given context.
     */
    private ProductVariantContextualPricing contextualPricing;

    /**
     * The date and time when the variant was created.
     */
    private OffsetDateTime createdAt;

    /**
     * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
     * returns the single next record, sorted ascending by ID.
     */
    private String defaultCursor;

    /**
     * The [delivery profile](https://shopify.dev/api/admin-graphql/latest/objects/DeliveryProfile) for the variant.
     */
    private DeliveryProfile deliveryProfile;

    /**
     * Display name of the variant, based on product's title + variant's title.
     */
    private String displayName;

    /**
     * The fulfillment service that stocks a product variant.
     *   
     * This is a third-party fulfillment service if the following conditions are met:
     * - The product variant is stocked by a single fulfillment service.
     * - The [FulfillmentService](/api/admin-graphql/latest/objects/FulfillmentService)
     * is a third-party fulfillment service. Third-party fulfillment services don't
     * have a handle with the value `manual`.
     * - The fulfillment service hasn't [opted into SKU sharing](/api/admin-graphql/latest/objects/FulfillmentService#field-fulfillmentservice-permitsskusharing).
     *   
     * If the conditions aren't met, then the fulfillment service has the `manual` handle.
     */
    private FulfillmentService fulfillmentService;

    /**
     * Whether changes to the fulfillment service for the product variant are allowed.
     */
    private EditableProperty fulfillmentServiceEditable;

    /**
     * The Harmonized System Code (or HS Tariff Code) for the variant.
     */
    private String harmonizedSystemCode;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The featured image for the variant.
     */
    private Image image;

    /**
     * The inventory item, which is used to query for inventory information.
     */
    private InventoryItem inventoryItem;

    /**
     * The fulfillment service that tracks the number of items in stock for the product variant.
     */
    private ProductVariantInventoryManagement inventoryManagement;

    /**
     * Whether customers are allowed to place an order for the product variant when it's out of stock.
     */
    private ProductVariantInventoryPolicy inventoryPolicy;

    /**
     * The total sellable quantity of the variant.
     */
    private Integer inventoryQuantity;

    /**
     * The ID of the corresponding resource in the REST Admin API.
     */
    private String legacyResourceId;

    /**
     * The media associated with the product variant.
     */
    private MediaConnection media;

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
     * including its `namespace` and `key`, that's associated with a Shopify resource
     * for the purposes of adding and storing additional information.
     */
    private Metafield metafield;

    /**
     * List of metafield definitions.
     */
    private MetafieldDefinitionConnection metafieldDefinitions;

    /**
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    private MetafieldConnection metafields;

    /**
     * The order of the product variant in the list of product variants. The first position in the list is 1.
     */
    private int position;

    /**
     * List of prices and compare-at prices in the presentment currencies for this shop.
     */
    private ProductVariantPricePairConnection presentmentPrices;

    /**
     * The price of the product variant in the default shop currency.
     */
    private String price;

    /**
     * Returns a private metafield by namespace and key that belongs to the resource.
     */
    private PrivateMetafield privateMetafield;

    /**
     * List of private metafields that belong to the resource.
     */
    private PrivateMetafieldConnection privateMetafields;

    /**
     * The product that this variant belongs to.
     */
    private Product product;

    /**
     * A list of the product variant components.
     */
    private ProductVariantComponentConnection productVariantComponents;

    /**
     * Whether a product variant requires components. The default value is `false`.
     * If `true`, then the product variant can only be purchased as a parent bundle with components and it will be omitted
     * from channels that don't support bundles.
     */
    private boolean requiresComponents;

    /**
     * Whether a customer needs to provide a shipping address when placing an order for the product variant.
     */
    private boolean requiresShipping;

    /**
     * List of product options applied to the variant.
     */
    private List<SelectedOption> selectedOptions;

    /**
     * The total sellable quantity of the variant for online channels.
     * This doesn't represent the total available inventory or capture
     * [limitations based on customer location](https://help.shopify.com/manual/markets/inventory_and_fulfillment).
     */
    private int sellableOnlineQuantity;

    /**
     * Count of selling plan groups associated with the product variant.
     */
    private int sellingPlanGroupCount;

    /**
     * A list of all selling plan groups defined in the current shop associated with the product variant.
     */
    private SellingPlanGroupConnection sellingPlanGroups;

    /**
     * A case-sensitive identifier for the product variant in the shop.
     * Required in order to connect to a fulfillment service.
     */
    private String sku;

    /**
     * The Storefront GraphQL API ID of the `ProductVariant`.
     *   
     * As of the `2022-04` version release, the Storefront GraphQL API will no longer
     * return Base64 encoded IDs to match the behavior of the Admin GraphQL API.
     * Therefore, you can safely use the `id` field's value instead.
     */
    private String storefrontId;

    /**
     * The tax code for the product variant.
     */
    private String taxCode;

    /**
     * Whether a tax is charged when the product variant is sold.
     */
    private boolean taxable;

    /**
     * The title of the product variant.
     */
    private String title;

    /**
     * The published translations associated with the resource.
     */
    private List<Translation> translations;

    /**
     * The date and time (ISO 8601 format) when the product variant was last modified.
     */
    private OffsetDateTime updatedAt;

    /**
     * The weight of the product variant in the unit system specified with weight_unit.
     */
    private Double weight;

    /**
     * The unit of measurement that applies to the product variant's weight. If you
     * don't specify a value for weight_unit, then the shop's default unit of
     * measurement is applied. Valid values: `g`, `kg`, `oz`, `lb`.
     */
    private WeightUnit weightUnit;

    public ProductVariant build() {
      ProductVariant result = new ProductVariant();
      result.availableForSale = this.availableForSale;
      result.barcode = this.barcode;
      result.compareAtPrice = this.compareAtPrice;
      result.contextualPricing = this.contextualPricing;
      result.createdAt = this.createdAt;
      result.defaultCursor = this.defaultCursor;
      result.deliveryProfile = this.deliveryProfile;
      result.displayName = this.displayName;
      result.fulfillmentService = this.fulfillmentService;
      result.fulfillmentServiceEditable = this.fulfillmentServiceEditable;
      result.harmonizedSystemCode = this.harmonizedSystemCode;
      result.id = this.id;
      result.image = this.image;
      result.inventoryItem = this.inventoryItem;
      result.inventoryManagement = this.inventoryManagement;
      result.inventoryPolicy = this.inventoryPolicy;
      result.inventoryQuantity = this.inventoryQuantity;
      result.legacyResourceId = this.legacyResourceId;
      result.media = this.media;
      result.metafield = this.metafield;
      result.metafieldDefinitions = this.metafieldDefinitions;
      result.metafields = this.metafields;
      result.position = this.position;
      result.presentmentPrices = this.presentmentPrices;
      result.price = this.price;
      result.privateMetafield = this.privateMetafield;
      result.privateMetafields = this.privateMetafields;
      result.product = this.product;
      result.productVariantComponents = this.productVariantComponents;
      result.requiresComponents = this.requiresComponents;
      result.requiresShipping = this.requiresShipping;
      result.selectedOptions = this.selectedOptions;
      result.sellableOnlineQuantity = this.sellableOnlineQuantity;
      result.sellingPlanGroupCount = this.sellingPlanGroupCount;
      result.sellingPlanGroups = this.sellingPlanGroups;
      result.sku = this.sku;
      result.storefrontId = this.storefrontId;
      result.taxCode = this.taxCode;
      result.taxable = this.taxable;
      result.title = this.title;
      result.translations = this.translations;
      result.updatedAt = this.updatedAt;
      result.weight = this.weight;
      result.weightUnit = this.weightUnit;
      return result;
    }

    /**
     * Whether the product variant is available for sale.
     */
    public Builder availableForSale(boolean availableForSale) {
      this.availableForSale = availableForSale;
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
     * The compare-at price of the variant in the default shop currency.
     */
    public Builder compareAtPrice(String compareAtPrice) {
      this.compareAtPrice = compareAtPrice;
      return this;
    }

    /**
     * The pricing that applies for a customer in a given context.
     */
    public Builder contextualPricing(ProductVariantContextualPricing contextualPricing) {
      this.contextualPricing = contextualPricing;
      return this;
    }

    /**
     * The date and time when the variant was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
     * returns the single next record, sorted ascending by ID.
     */
    public Builder defaultCursor(String defaultCursor) {
      this.defaultCursor = defaultCursor;
      return this;
    }

    /**
     * The [delivery profile](https://shopify.dev/api/admin-graphql/latest/objects/DeliveryProfile) for the variant.
     */
    public Builder deliveryProfile(DeliveryProfile deliveryProfile) {
      this.deliveryProfile = deliveryProfile;
      return this;
    }

    /**
     * Display name of the variant, based on product's title + variant's title.
     */
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * The fulfillment service that stocks a product variant.
     *   
     * This is a third-party fulfillment service if the following conditions are met:
     * - The product variant is stocked by a single fulfillment service.
     * - The [FulfillmentService](/api/admin-graphql/latest/objects/FulfillmentService)
     * is a third-party fulfillment service. Third-party fulfillment services don't
     * have a handle with the value `manual`.
     * - The fulfillment service hasn't [opted into SKU sharing](/api/admin-graphql/latest/objects/FulfillmentService#field-fulfillmentservice-permitsskusharing).
     *   
     * If the conditions aren't met, then the fulfillment service has the `manual` handle.
     */
    public Builder fulfillmentService(FulfillmentService fulfillmentService) {
      this.fulfillmentService = fulfillmentService;
      return this;
    }

    /**
     * Whether changes to the fulfillment service for the product variant are allowed.
     */
    public Builder fulfillmentServiceEditable(EditableProperty fulfillmentServiceEditable) {
      this.fulfillmentServiceEditable = fulfillmentServiceEditable;
      return this;
    }

    /**
     * The Harmonized System Code (or HS Tariff Code) for the variant.
     */
    public Builder harmonizedSystemCode(String harmonizedSystemCode) {
      this.harmonizedSystemCode = harmonizedSystemCode;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The featured image for the variant.
     */
    public Builder image(Image image) {
      this.image = image;
      return this;
    }

    /**
     * The inventory item, which is used to query for inventory information.
     */
    public Builder inventoryItem(InventoryItem inventoryItem) {
      this.inventoryItem = inventoryItem;
      return this;
    }

    /**
     * The fulfillment service that tracks the number of items in stock for the product variant.
     */
    public Builder inventoryManagement(ProductVariantInventoryManagement inventoryManagement) {
      this.inventoryManagement = inventoryManagement;
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
     * The total sellable quantity of the variant.
     */
    public Builder inventoryQuantity(Integer inventoryQuantity) {
      this.inventoryQuantity = inventoryQuantity;
      return this;
    }

    /**
     * The ID of the corresponding resource in the REST Admin API.
     */
    public Builder legacyResourceId(String legacyResourceId) {
      this.legacyResourceId = legacyResourceId;
      return this;
    }

    /**
     * The media associated with the product variant.
     */
    public Builder media(MediaConnection media) {
      this.media = media;
      return this;
    }

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
     * including its `namespace` and `key`, that's associated with a Shopify resource
     * for the purposes of adding and storing additional information.
     */
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    /**
     * List of metafield definitions.
     */
    public Builder metafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
      this.metafieldDefinitions = metafieldDefinitions;
      return this;
    }

    /**
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    public Builder metafields(MetafieldConnection metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * The order of the product variant in the list of product variants. The first position in the list is 1.
     */
    public Builder position(int position) {
      this.position = position;
      return this;
    }

    /**
     * List of prices and compare-at prices in the presentment currencies for this shop.
     */
    public Builder presentmentPrices(ProductVariantPricePairConnection presentmentPrices) {
      this.presentmentPrices = presentmentPrices;
      return this;
    }

    /**
     * The price of the product variant in the default shop currency.
     */
    public Builder price(String price) {
      this.price = price;
      return this;
    }

    /**
     * Returns a private metafield by namespace and key that belongs to the resource.
     */
    public Builder privateMetafield(PrivateMetafield privateMetafield) {
      this.privateMetafield = privateMetafield;
      return this;
    }

    /**
     * List of private metafields that belong to the resource.
     */
    public Builder privateMetafields(PrivateMetafieldConnection privateMetafields) {
      this.privateMetafields = privateMetafields;
      return this;
    }

    /**
     * The product that this variant belongs to.
     */
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    /**
     * A list of the product variant components.
     */
    public Builder productVariantComponents(
        ProductVariantComponentConnection productVariantComponents) {
      this.productVariantComponents = productVariantComponents;
      return this;
    }

    /**
     * Whether a product variant requires components. The default value is `false`.
     * If `true`, then the product variant can only be purchased as a parent bundle with components and it will be omitted
     * from channels that don't support bundles.
     */
    public Builder requiresComponents(boolean requiresComponents) {
      this.requiresComponents = requiresComponents;
      return this;
    }

    /**
     * Whether a customer needs to provide a shipping address when placing an order for the product variant.
     */
    public Builder requiresShipping(boolean requiresShipping) {
      this.requiresShipping = requiresShipping;
      return this;
    }

    /**
     * List of product options applied to the variant.
     */
    public Builder selectedOptions(List<SelectedOption> selectedOptions) {
      this.selectedOptions = selectedOptions;
      return this;
    }

    /**
     * The total sellable quantity of the variant for online channels.
     * This doesn't represent the total available inventory or capture
     * [limitations based on customer location](https://help.shopify.com/manual/markets/inventory_and_fulfillment).
     */
    public Builder sellableOnlineQuantity(int sellableOnlineQuantity) {
      this.sellableOnlineQuantity = sellableOnlineQuantity;
      return this;
    }

    /**
     * Count of selling plan groups associated with the product variant.
     */
    public Builder sellingPlanGroupCount(int sellingPlanGroupCount) {
      this.sellingPlanGroupCount = sellingPlanGroupCount;
      return this;
    }

    /**
     * A list of all selling plan groups defined in the current shop associated with the product variant.
     */
    public Builder sellingPlanGroups(SellingPlanGroupConnection sellingPlanGroups) {
      this.sellingPlanGroups = sellingPlanGroups;
      return this;
    }

    /**
     * A case-sensitive identifier for the product variant in the shop.
     * Required in order to connect to a fulfillment service.
     */
    public Builder sku(String sku) {
      this.sku = sku;
      return this;
    }

    /**
     * The Storefront GraphQL API ID of the `ProductVariant`.
     *   
     * As of the `2022-04` version release, the Storefront GraphQL API will no longer
     * return Base64 encoded IDs to match the behavior of the Admin GraphQL API.
     * Therefore, you can safely use the `id` field's value instead.
     */
    public Builder storefrontId(String storefrontId) {
      this.storefrontId = storefrontId;
      return this;
    }

    /**
     * The tax code for the product variant.
     */
    public Builder taxCode(String taxCode) {
      this.taxCode = taxCode;
      return this;
    }

    /**
     * Whether a tax is charged when the product variant is sold.
     */
    public Builder taxable(boolean taxable) {
      this.taxable = taxable;
      return this;
    }

    /**
     * The title of the product variant.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The published translations associated with the resource.
     */
    public Builder translations(List<Translation> translations) {
      this.translations = translations;
      return this;
    }

    /**
     * The date and time (ISO 8601 format) when the product variant was last modified.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    /**
     * The weight of the product variant in the unit system specified with weight_unit.
     */
    public Builder weight(Double weight) {
      this.weight = weight;
      return this;
    }

    /**
     * The unit of measurement that applies to the product variant's weight. If you
     * don't specify a value for weight_unit, then the shop's default unit of
     * measurement is applied. Valid values: `g`, `kg`, `oz`, `lb`.
     */
    public Builder weightUnit(WeightUnit weightUnit) {
      this.weightUnit = weightUnit;
      return this;
    }
  }
}
