package com.test.shopify.generated.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = AndroidApplication.class, name = "AndroidApplication"),
    @JsonSubTypes.Type(value = AppleApplication.class, name = "AppleApplication")
})
public interface MobilePlatformApplication {
}
