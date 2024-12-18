package com.test.shopify.generated.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Resources that metafield definitions can be applied to.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = Collection.class, name = "Collection"),
    @JsonSubTypes.Type(value = Company.class, name = "Company"),
    @JsonSubTypes.Type(value = CompanyLocation.class, name = "CompanyLocation"),
    @JsonSubTypes.Type(value = Customer.class, name = "Customer"),
    @JsonSubTypes.Type(value = DeliveryCustomization.class, name = "DeliveryCustomization"),
    @JsonSubTypes.Type(value = DiscountAutomaticNode.class, name = "DiscountAutomaticNode"),
    @JsonSubTypes.Type(value = DiscountCodeNode.class, name = "DiscountCodeNode"),
    @JsonSubTypes.Type(value = DiscountNode.class, name = "DiscountNode"),
    @JsonSubTypes.Type(value = Location.class, name = "Location"),
    @JsonSubTypes.Type(value = Market.class, name = "Market"),
    @JsonSubTypes.Type(value = Order.class, name = "Order"),
    @JsonSubTypes.Type(value = PaymentCustomization.class, name = "PaymentCustomization"),
    @JsonSubTypes.Type(value = Product.class, name = "Product"),
    @JsonSubTypes.Type(value = ProductVariant.class, name = "ProductVariant"),
    @JsonSubTypes.Type(value = Validation.class, name = "Validation")
})
public interface HasMetafieldDefinitions {
  /**
   * List of metafield definitions.
   */
  MetafieldDefinitionConnection getMetafieldDefinitions();
}
