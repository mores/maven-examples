package com.test.shopify.generated.types;

/**
 * The possible error codes associated with making billing attempts. The error codes supplement the
 * `error_message` to provide consistent results and help with dunning management.
 */
public enum SubscriptionBillingAttemptErrorCode {
  PAYMENT_METHOD_NOT_FOUND,

  PAYMENT_PROVIDER_IS_NOT_ENABLED,

  INVALID_PAYMENT_METHOD,

  UNEXPECTED_ERROR,

  EXPIRED_PAYMENT_METHOD,

  PAYMENT_METHOD_DECLINED,

  AUTHENTICATION_ERROR,

  TEST_MODE,

  BUYER_CANCELED_PAYMENT_METHOD,

  CUSTOMER_NOT_FOUND,

  CUSTOMER_INVALID,

  INVALID_SHIPPING_ADDRESS,

  INVALID_CUSTOMER_BILLING_AGREEMENT,

  INVOICE_ALREADY_PAID,

  PAYMENT_METHOD_INCOMPATIBLE_WITH_GATEWAY_CONFIG,

  AMOUNT_TOO_SMALL,

  INVENTORY_ALLOCATIONS_NOT_FOUND,

  TRANSIENT_ERROR
}
