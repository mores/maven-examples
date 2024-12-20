package com.test.shopify.generated.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;
import java.util.List;

/**
 * Represents an error in the input of a mutation.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = AbandonmentEmailStateUpdateUserError.class, name = "AbandonmentEmailStateUpdateUserError"),
    @JsonSubTypes.Type(value = AbandonmentUpdateActivitiesDeliveryStatusesUserError.class, name = "AbandonmentUpdateActivitiesDeliveryStatusesUserError"),
    @JsonSubTypes.Type(value = AppSubscriptionTrialExtendUserError.class, name = "AppSubscriptionTrialExtendUserError"),
    @JsonSubTypes.Type(value = BillingAttemptUserError.class, name = "BillingAttemptUserError"),
    @JsonSubTypes.Type(value = BulkMutationUserError.class, name = "BulkMutationUserError"),
    @JsonSubTypes.Type(value = BulkProductResourceFeedbackCreateUserError.class, name = "BulkProductResourceFeedbackCreateUserError"),
    @JsonSubTypes.Type(value = BusinessCustomerUserError.class, name = "BusinessCustomerUserError"),
    @JsonSubTypes.Type(value = CartTransformCreateUserError.class, name = "CartTransformCreateUserError"),
    @JsonSubTypes.Type(value = CartTransformDeleteUserError.class, name = "CartTransformDeleteUserError"),
    @JsonSubTypes.Type(value = CatalogUserError.class, name = "CatalogUserError"),
    @JsonSubTypes.Type(value = CheckoutBrandingUpsertUserError.class, name = "CheckoutBrandingUpsertUserError"),
    @JsonSubTypes.Type(value = CollectionAddProductsV2UserError.class, name = "CollectionAddProductsV2UserError"),
    @JsonSubTypes.Type(value = CustomerCancelDataErasureUserError.class, name = "CustomerCancelDataErasureUserError"),
    @JsonSubTypes.Type(value = CustomerEmailMarketingConsentUpdateUserError.class, name = "CustomerEmailMarketingConsentUpdateUserError"),
    @JsonSubTypes.Type(value = CustomerMergeUserError.class, name = "CustomerMergeUserError"),
    @JsonSubTypes.Type(value = CustomerPaymentMethodCreateFromDuplicationDataUserError.class, name = "CustomerPaymentMethodCreateFromDuplicationDataUserError"),
    @JsonSubTypes.Type(value = CustomerPaymentMethodGetDuplicationDataUserError.class, name = "CustomerPaymentMethodGetDuplicationDataUserError"),
    @JsonSubTypes.Type(value = CustomerPaymentMethodGetUpdateUrlUserError.class, name = "CustomerPaymentMethodGetUpdateUrlUserError"),
    @JsonSubTypes.Type(value = CustomerPaymentMethodRemoteUserError.class, name = "CustomerPaymentMethodRemoteUserError"),
    @JsonSubTypes.Type(value = CustomerPaymentMethodUserError.class, name = "CustomerPaymentMethodUserError"),
    @JsonSubTypes.Type(value = CustomerRequestDataErasureUserError.class, name = "CustomerRequestDataErasureUserError"),
    @JsonSubTypes.Type(value = CustomerSegmentMembersQueryUserError.class, name = "CustomerSegmentMembersQueryUserError"),
    @JsonSubTypes.Type(value = CustomerSmsMarketingConsentError.class, name = "CustomerSmsMarketingConsentError"),
    @JsonSubTypes.Type(value = DelegateAccessTokenCreateUserError.class, name = "DelegateAccessTokenCreateUserError"),
    @JsonSubTypes.Type(value = DelegateAccessTokenDestroyUserError.class, name = "DelegateAccessTokenDestroyUserError"),
    @JsonSubTypes.Type(value = DeliveryCustomizationError.class, name = "DeliveryCustomizationError"),
    @JsonSubTypes.Type(value = DeliveryLocationLocalPickupSettingsError.class, name = "DeliveryLocationLocalPickupSettingsError"),
    @JsonSubTypes.Type(value = DiscountUserError.class, name = "DiscountUserError"),
    @JsonSubTypes.Type(value = DisputeEvidenceUpdateUserError.class, name = "DisputeEvidenceUpdateUserError"),
    @JsonSubTypes.Type(value = ErrorsServerPixelUserError.class, name = "ErrorsServerPixelUserError"),
    @JsonSubTypes.Type(value = ErrorsWebPixelUserError.class, name = "ErrorsWebPixelUserError"),
    @JsonSubTypes.Type(value = FilesUserError.class, name = "FilesUserError"),
    @JsonSubTypes.Type(value = FulfillmentConstraintRuleCreateUserError.class, name = "FulfillmentConstraintRuleCreateUserError"),
    @JsonSubTypes.Type(value = FulfillmentConstraintRuleDeleteUserError.class, name = "FulfillmentConstraintRuleDeleteUserError"),
    @JsonSubTypes.Type(value = FulfillmentOrderHoldUserError.class, name = "FulfillmentOrderHoldUserError"),
    @JsonSubTypes.Type(value = FulfillmentOrderLineItemsPreparedForPickupUserError.class, name = "FulfillmentOrderLineItemsPreparedForPickupUserError"),
    @JsonSubTypes.Type(value = FulfillmentOrderMergeUserError.class, name = "FulfillmentOrderMergeUserError"),
    @JsonSubTypes.Type(value = FulfillmentOrderReleaseHoldUserError.class, name = "FulfillmentOrderReleaseHoldUserError"),
    @JsonSubTypes.Type(value = FulfillmentOrderRescheduleUserError.class, name = "FulfillmentOrderRescheduleUserError"),
    @JsonSubTypes.Type(value = FulfillmentOrderSplitUserError.class, name = "FulfillmentOrderSplitUserError"),
    @JsonSubTypes.Type(value = FulfillmentOrdersReleaseHoldsUserError.class, name = "FulfillmentOrdersReleaseHoldsUserError"),
    @JsonSubTypes.Type(value = FulfillmentOrdersSetFulfillmentDeadlineUserError.class, name = "FulfillmentOrdersSetFulfillmentDeadlineUserError"),
    @JsonSubTypes.Type(value = GiftCardUserError.class, name = "GiftCardUserError"),
    @JsonSubTypes.Type(value = InventoryAdjustQuantitiesUserError.class, name = "InventoryAdjustQuantitiesUserError"),
    @JsonSubTypes.Type(value = InventoryBulkToggleActivationUserError.class, name = "InventoryBulkToggleActivationUserError"),
    @JsonSubTypes.Type(value = InventoryMoveQuantitiesUserError.class, name = "InventoryMoveQuantitiesUserError"),
    @JsonSubTypes.Type(value = InventorySetOnHandQuantitiesUserError.class, name = "InventorySetOnHandQuantitiesUserError"),
    @JsonSubTypes.Type(value = InventorySetScheduledChangesUserError.class, name = "InventorySetScheduledChangesUserError"),
    @JsonSubTypes.Type(value = LocationActivateUserError.class, name = "LocationActivateUserError"),
    @JsonSubTypes.Type(value = LocationAddUserError.class, name = "LocationAddUserError"),
    @JsonSubTypes.Type(value = LocationDeactivateUserError.class, name = "LocationDeactivateUserError"),
    @JsonSubTypes.Type(value = LocationDeleteUserError.class, name = "LocationDeleteUserError"),
    @JsonSubTypes.Type(value = LocationEditUserError.class, name = "LocationEditUserError"),
    @JsonSubTypes.Type(value = MarketCurrencySettingsUserError.class, name = "MarketCurrencySettingsUserError"),
    @JsonSubTypes.Type(value = MarketingActivityUserError.class, name = "MarketingActivityUserError"),
    @JsonSubTypes.Type(value = MarketUserError.class, name = "MarketUserError"),
    @JsonSubTypes.Type(value = MediaUserError.class, name = "MediaUserError"),
    @JsonSubTypes.Type(value = MetafieldDefinitionCreateUserError.class, name = "MetafieldDefinitionCreateUserError"),
    @JsonSubTypes.Type(value = MetafieldDefinitionDeleteUserError.class, name = "MetafieldDefinitionDeleteUserError"),
    @JsonSubTypes.Type(value = MetafieldDefinitionPinUserError.class, name = "MetafieldDefinitionPinUserError"),
    @JsonSubTypes.Type(value = MetafieldDefinitionUnpinUserError.class, name = "MetafieldDefinitionUnpinUserError"),
    @JsonSubTypes.Type(value = MetafieldDefinitionUpdateUserError.class, name = "MetafieldDefinitionUpdateUserError"),
    @JsonSubTypes.Type(value = MetafieldsSetUserError.class, name = "MetafieldsSetUserError"),
    @JsonSubTypes.Type(value = MetaobjectUserError.class, name = "MetaobjectUserError"),
    @JsonSubTypes.Type(value = OrderCancelUserError.class, name = "OrderCancelUserError"),
    @JsonSubTypes.Type(value = OrderCreateMandatePaymentUserError.class, name = "OrderCreateMandatePaymentUserError"),
    @JsonSubTypes.Type(value = OrderEditRemoveDiscountUserError.class, name = "OrderEditRemoveDiscountUserError"),
    @JsonSubTypes.Type(value = OrderEditUpdateDiscountUserError.class, name = "OrderEditUpdateDiscountUserError"),
    @JsonSubTypes.Type(value = OrderInvoiceSendUserError.class, name = "OrderInvoiceSendUserError"),
    @JsonSubTypes.Type(value = PaymentCustomizationError.class, name = "PaymentCustomizationError"),
    @JsonSubTypes.Type(value = PaymentReminderSendUserError.class, name = "PaymentReminderSendUserError"),
    @JsonSubTypes.Type(value = PaymentTermsCreateUserError.class, name = "PaymentTermsCreateUserError"),
    @JsonSubTypes.Type(value = PaymentTermsDeleteUserError.class, name = "PaymentTermsDeleteUserError"),
    @JsonSubTypes.Type(value = PaymentTermsUpdateUserError.class, name = "PaymentTermsUpdateUserError"),
    @JsonSubTypes.Type(value = PriceListFixedPricesByProductBulkUpdateUserError.class, name = "PriceListFixedPricesByProductBulkUpdateUserError"),
    @JsonSubTypes.Type(value = PriceListPriceUserError.class, name = "PriceListPriceUserError"),
    @JsonSubTypes.Type(value = PriceListUserError.class, name = "PriceListUserError"),
    @JsonSubTypes.Type(value = PriceRuleUserError.class, name = "PriceRuleUserError"),
    @JsonSubTypes.Type(value = ProductChangeStatusUserError.class, name = "ProductChangeStatusUserError"),
    @JsonSubTypes.Type(value = ProductDeleteUserError.class, name = "ProductDeleteUserError"),
    @JsonSubTypes.Type(value = ProductDuplicateUserError.class, name = "ProductDuplicateUserError"),
    @JsonSubTypes.Type(value = ProductFeedCreateUserError.class, name = "ProductFeedCreateUserError"),
    @JsonSubTypes.Type(value = ProductFeedDeleteUserError.class, name = "ProductFeedDeleteUserError"),
    @JsonSubTypes.Type(value = ProductFullSyncUserError.class, name = "ProductFullSyncUserError"),
    @JsonSubTypes.Type(value = ProductVariantRelationshipBulkUpdateUserError.class, name = "ProductVariantRelationshipBulkUpdateUserError"),
    @JsonSubTypes.Type(value = ProductVariantsBulkCreateUserError.class, name = "ProductVariantsBulkCreateUserError"),
    @JsonSubTypes.Type(value = ProductVariantsBulkDeleteUserError.class, name = "ProductVariantsBulkDeleteUserError"),
    @JsonSubTypes.Type(value = ProductVariantsBulkReorderUserError.class, name = "ProductVariantsBulkReorderUserError"),
    @JsonSubTypes.Type(value = ProductVariantsBulkUpdateUserError.class, name = "ProductVariantsBulkUpdateUserError"),
    @JsonSubTypes.Type(value = PublicationUserError.class, name = "PublicationUserError"),
    @JsonSubTypes.Type(value = PubSubWebhookSubscriptionCreateUserError.class, name = "PubSubWebhookSubscriptionCreateUserError"),
    @JsonSubTypes.Type(value = PubSubWebhookSubscriptionUpdateUserError.class, name = "PubSubWebhookSubscriptionUpdateUserError"),
    @JsonSubTypes.Type(value = QuantityPricingByVariantUserError.class, name = "QuantityPricingByVariantUserError"),
    @JsonSubTypes.Type(value = QuantityRuleUserError.class, name = "QuantityRuleUserError"),
    @JsonSubTypes.Type(value = ReturnUserError.class, name = "ReturnUserError"),
    @JsonSubTypes.Type(value = SellingPlanGroupUserError.class, name = "SellingPlanGroupUserError"),
    @JsonSubTypes.Type(value = ShopPolicyUserError.class, name = "ShopPolicyUserError"),
    @JsonSubTypes.Type(value = ShopResourceFeedbackCreateUserError.class, name = "ShopResourceFeedbackCreateUserError"),
    @JsonSubTypes.Type(value = StandardMetafieldDefinitionEnableUserError.class, name = "StandardMetafieldDefinitionEnableUserError"),
    @JsonSubTypes.Type(value = SubscriptionBillingCycleSkipUserError.class, name = "SubscriptionBillingCycleSkipUserError"),
    @JsonSubTypes.Type(value = SubscriptionBillingCycleUnskipUserError.class, name = "SubscriptionBillingCycleUnskipUserError"),
    @JsonSubTypes.Type(value = SubscriptionBillingCycleUserError.class, name = "SubscriptionBillingCycleUserError"),
    @JsonSubTypes.Type(value = SubscriptionContractStatusUpdateUserError.class, name = "SubscriptionContractStatusUpdateUserError"),
    @JsonSubTypes.Type(value = SubscriptionContractUserError.class, name = "SubscriptionContractUserError"),
    @JsonSubTypes.Type(value = SubscriptionDraftUserError.class, name = "SubscriptionDraftUserError"),
    @JsonSubTypes.Type(value = TaxAppConfigureUserError.class, name = "TaxAppConfigureUserError"),
    @JsonSubTypes.Type(value = TranslationUserError.class, name = "TranslationUserError"),
    @JsonSubTypes.Type(value = UrlRedirectBulkDeleteByIdsUserError.class, name = "UrlRedirectBulkDeleteByIdsUserError"),
    @JsonSubTypes.Type(value = UrlRedirectBulkDeleteBySavedSearchUserError.class, name = "UrlRedirectBulkDeleteBySavedSearchUserError"),
    @JsonSubTypes.Type(value = UrlRedirectBulkDeleteBySearchUserError.class, name = "UrlRedirectBulkDeleteBySearchUserError"),
    @JsonSubTypes.Type(value = UrlRedirectImportUserError.class, name = "UrlRedirectImportUserError"),
    @JsonSubTypes.Type(value = UrlRedirectUserError.class, name = "UrlRedirectUserError"),
    @JsonSubTypes.Type(value = UserError.class, name = "UserError"),
    @JsonSubTypes.Type(value = ValidationUserError.class, name = "ValidationUserError")
})
public interface DisplayableError {
  /**
   * The path to the input field that caused the error.
   */
  List<String> getField();

  /**
   * The error message.
   */
  String getMessage();
}