package com.test.shopify.generated.types;

/**
 * Possible error codes that can be returned by `BillingAttemptUserError`.
 */
public enum BillingAttemptUserErrorCode {
  INVALID,

  BLANK,

  CONTRACT_NOT_FOUND,

  ORIGIN_TIME_BEFORE_CONTRACT_CREATION,

  UPCOMING_CYCLE_LIMIT_EXCEEDED,

  CYCLE_INDEX_OUT_OF_RANGE,

  CYCLE_START_DATE_OUT_OF_RANGE,

  ORIGIN_TIME_OUT_OF_RANGE,

  CONTRACT_UNDER_REVIEW,

  CONTRACT_TERMINATED
}
