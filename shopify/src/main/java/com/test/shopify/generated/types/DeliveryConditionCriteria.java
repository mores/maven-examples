package com.test.shopify.generated.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = MoneyV2.class, name = "MoneyV2"),
    @JsonSubTypes.Type(value = Weight.class, name = "Weight")
})
public interface DeliveryConditionCriteria {
}
