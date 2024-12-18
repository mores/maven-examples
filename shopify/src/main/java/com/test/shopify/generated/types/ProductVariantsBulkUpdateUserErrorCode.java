package com.test.shopify.generated.types;

/**
 * Possible error codes that can be returned by `ProductVariantsBulkUpdateUserError`.
 */
public enum ProductVariantsBulkUpdateUserErrorCode {
  INVALID_INPUT,

  CANNOT_SPECIFY_BOTH,

  MUST_SPECIFY_ONE_OF_PAIR,

  PRODUCT_DOES_NOT_EXIST,

  PRODUCT_VARIANT_ID_MISSING,

  PRODUCT_VARIANT_DOES_NOT_EXIST,

  OPTION_DOES_NOT_EXIST,

  OPTION_VALUE_DOES_NOT_EXIST,

  MUST_BE_FOR_THIS_PRODUCT,

  NOT_DEFINED_FOR_SHOP,

  PRODUCT_SUSPENDED,

  NO_INVENTORY_QUANTITIES_ON_VARIANTS_UPDATE,

  VARIANT_ALREADY_EXISTS,

  GREATER_THAN_OR_EQUAL_TO,

  NEED_TO_ADD_OPTION_VALUES,

  OPTION_VALUES_FOR_NUMBER_OF_UNKNOWN_OPTIONS,

  SUBSCRIPTION_VIOLATION,

  NO_INVENTORY_QUANTITES_DURING_UPDATE,

  NEGATIVE_PRICE_VALUE
}
