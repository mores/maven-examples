package com.test.shopify.generated;

import java.lang.String;

public class DgsConstants {
  public static final String MUTATION_TYPE = "Mutation";

  public static class ABANDONEDCHECKOUT {
    public static final String TYPE_NAME = "AbandonedCheckout";

    public static final String AbandonedCheckoutUrl = "abandonedCheckoutUrl";

    public static final String DefaultCursor = "defaultCursor";

    public static final String Id = "id";

    public static final String LineItems = "lineItems";

    public static final String LineItemsQuantity = "lineItemsQuantity";

    public static final String TotalPriceSet = "totalPriceSet";

    public static class LINEITEMS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class ABANDONEDCHECKOUTLINEITEM {
    public static final String TYPE_NAME = "AbandonedCheckoutLineItem";

    public static final String CustomAttributes = "customAttributes";

    public static final String DiscountedTotalPriceSet = "discountedTotalPriceSet";

    public static final String DiscountedTotalPriceWithCodeDiscount = "discountedTotalPriceWithCodeDiscount";

    public static final String DiscountedUnitPriceSet = "discountedUnitPriceSet";

    public static final String DiscountedUnitPriceWithCodeDiscount = "discountedUnitPriceWithCodeDiscount";

    public static final String Id = "id";

    public static final String Image = "image";

    public static final String OriginalTotalPriceSet = "originalTotalPriceSet";

    public static final String OriginalUnitPriceSet = "originalUnitPriceSet";

    public static final String Product = "product";

    public static final String Quantity = "quantity";

    public static final String Sku = "sku";

    public static final String Title = "title";

    public static final String Variant = "variant";

    public static final String VariantTitle = "variantTitle";
  }

  public static class ABANDONEDCHECKOUTLINEITEMCONNECTION {
    public static final String TYPE_NAME = "AbandonedCheckoutLineItemConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class ABANDONEDCHECKOUTLINEITEMEDGE {
    public static final String TYPE_NAME = "AbandonedCheckoutLineItemEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class ABANDONMENT {
    public static final String TYPE_NAME = "Abandonment";

    public static final String AbandonedCheckoutPayload = "abandonedCheckoutPayload";

    public static final String AbandonmentType = "abandonmentType";

    public static final String App = "app";

    public static final String CartUrl = "cartUrl";

    public static final String CreatedAt = "createdAt";

    public static final String Customer = "customer";

    public static final String CustomerHasNoDraftOrderSinceAbandonment = "customerHasNoDraftOrderSinceAbandonment";

    public static final String CustomerHasNoOrderSinceAbandonment = "customerHasNoOrderSinceAbandonment";

    public static final String DaysSinceLastAbandonmentEmail = "daysSinceLastAbandonmentEmail";

    public static final String EmailSentAt = "emailSentAt";

    public static final String EmailState = "emailState";

    public static final String HoursSinceLastAbandonedCheckout = "hoursSinceLastAbandonedCheckout";

    public static final String Id = "id";

    public static final String InventoryAvailable = "inventoryAvailable";

    public static final String IsFromOnlineStore = "isFromOnlineStore";

    public static final String IsFromShopApp = "isFromShopApp";

    public static final String IsFromShopPay = "isFromShopPay";

    public static final String IsMostSignificantAbandonment = "isMostSignificantAbandonment";

    public static final String LastBrowseAbandonmentDate = "lastBrowseAbandonmentDate";

    public static final String LastCartAbandonmentDate = "lastCartAbandonmentDate";

    public static final String LastCheckoutAbandonmentDate = "lastCheckoutAbandonmentDate";

    public static final String MostRecentStep = "mostRecentStep";

    public static final String ProductsAddedToCart = "productsAddedToCart";

    public static final String ProductsViewed = "productsViewed";

    public static final String VisitStartedAt = "visitStartedAt";

    public static class PRODUCTSADDEDTOCART_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PRODUCTSVIEWED_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class ABANDONMENTEMAILSTATEUPDATEPAYLOAD {
    public static final String TYPE_NAME = "AbandonmentEmailStateUpdatePayload";

    public static final String Abandonment = "abandonment";

    public static final String UserErrors = "userErrors";
  }

  public static class ABANDONMENTEMAILSTATEUPDATEUSERERROR {
    public static final String TYPE_NAME = "AbandonmentEmailStateUpdateUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class ABANDONMENTUPDATEACTIVITIESDELIVERYSTATUSESPAYLOAD {
    public static final String TYPE_NAME = "AbandonmentUpdateActivitiesDeliveryStatusesPayload";

    public static final String Abandonment = "abandonment";

    public static final String UserErrors = "userErrors";
  }

  public static class ABANDONMENTUPDATEACTIVITIESDELIVERYSTATUSESUSERERROR {
    public static final String TYPE_NAME = "AbandonmentUpdateActivitiesDeliveryStatusesUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class ACCESSSCOPE {
    public static final String TYPE_NAME = "AccessScope";

    public static final String Description = "description";

    public static final String Handle = "handle";
  }

  public static class ADDALLPRODUCTSOPERATION {
    public static final String TYPE_NAME = "AddAllProductsOperation";

    public static final String Id = "id";

    public static final String ProcessedRowCount = "processedRowCount";

    public static final String RowCount = "rowCount";

    public static final String Status = "status";
  }

  public static class ADDITIONALFEE {
    public static final String TYPE_NAME = "AdditionalFee";

    public static final String Id = "id";

    public static final String Name = "name";

    public static final String Price = "price";

    public static final String TaxLines = "taxLines";
  }

  public static class ADDITIONALFEESALE {
    public static final String TYPE_NAME = "AdditionalFeeSale";

    public static final String ActionType = "actionType";

    public static final String AdditionalFee = "additionalFee";

    public static final String Id = "id";

    public static final String LineType = "lineType";

    public static final String Quantity = "quantity";

    public static final String Taxes = "taxes";

    public static final String TotalAmount = "totalAmount";

    public static final String TotalDiscountAmountAfterTaxes = "totalDiscountAmountAfterTaxes";

    public static final String TotalDiscountAmountBeforeTaxes = "totalDiscountAmountBeforeTaxes";

    public static final String TotalTaxAmount = "totalTaxAmount";
  }

  public static class ADJUSTMENTSALE {
    public static final String TYPE_NAME = "AdjustmentSale";

    public static final String ActionType = "actionType";

    public static final String Id = "id";

    public static final String LineType = "lineType";

    public static final String Quantity = "quantity";

    public static final String Taxes = "taxes";

    public static final String TotalAmount = "totalAmount";

    public static final String TotalDiscountAmountAfterTaxes = "totalDiscountAmountAfterTaxes";

    public static final String TotalDiscountAmountBeforeTaxes = "totalDiscountAmountBeforeTaxes";

    public static final String TotalTaxAmount = "totalTaxAmount";
  }

  public static class ALLDISCOUNTITEMS {
    public static final String TYPE_NAME = "AllDiscountItems";

    public static final String AllItems = "allItems";
  }

  public static class APIVERSION {
    public static final String TYPE_NAME = "ApiVersion";

    public static final String DisplayName = "displayName";

    public static final String Handle = "handle";

    public static final String Supported = "supported";
  }

  public static class APP {
    public static final String TYPE_NAME = "App";

    public static final String ApiKey = "apiKey";

    public static final String AppStoreAppUrl = "appStoreAppUrl";

    public static final String AppStoreDeveloperUrl = "appStoreDeveloperUrl";

    public static final String AvailableAccessScopes = "availableAccessScopes";

    public static final String Banner = "banner";

    public static final String Description = "description";

    public static final String DeveloperName = "developerName";

    public static final String DeveloperType = "developerType";

    public static final String DeveloperUrl = "developerUrl";

    public static final String Embedded = "embedded";

    public static final String FailedRequirements = "failedRequirements";

    public static final String Features = "features";

    public static final String Feedback = "feedback";

    public static final String Handle = "handle";

    public static final String Icon = "icon";

    public static final String Id = "id";

    public static final String InstallUrl = "installUrl";

    public static final String Installation = "installation";

    public static final String IsPostPurchaseAppInUse = "isPostPurchaseAppInUse";

    public static final String LaunchUrl = "launchUrl";

    public static final String NavigationItems = "navigationItems";

    public static final String PreviouslyInstalled = "previouslyInstalled";

    public static final String PricingDetails = "pricingDetails";

    public static final String PricingDetailsSummary = "pricingDetailsSummary";

    public static final String PrivacyPolicyUrl = "privacyPolicyUrl";

    public static final String PublicCategory = "publicCategory";

    public static final String Published = "published";

    public static final String RequestedAccessScopes = "requestedAccessScopes";

    public static final String Screenshots = "screenshots";

    public static final String ShopifyDeveloped = "shopifyDeveloped";

    public static final String Title = "title";

    public static final String UninstallMessage = "uninstallMessage";

    public static final String UninstallUrl = "uninstallUrl";

    public static final String WebhookApiVersion = "webhookApiVersion";
  }

  public static class APPCATALOG {
    public static final String TYPE_NAME = "AppCatalog";

    public static final String Apps = "apps";

    public static final String Id = "id";

    public static final String Operations = "operations";

    public static final String PriceList = "priceList";

    public static final String Publication = "publication";

    public static final String Status = "status";

    public static final String Title = "title";

    public static class APPS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class APPCONNECTION {
    public static final String TYPE_NAME = "AppConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class APPCREDIT {
    public static final String TYPE_NAME = "AppCredit";

    public static final String Amount = "amount";

    public static final String CreatedAt = "createdAt";

    public static final String Description = "description";

    public static final String Id = "id";

    public static final String Test = "test";
  }

  public static class APPCREDITCONNECTION {
    public static final String TYPE_NAME = "AppCreditConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class APPCREDITEDGE {
    public static final String TYPE_NAME = "AppCreditEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class APPDISCOUNTTYPE {
    public static final String TYPE_NAME = "AppDiscountType";

    public static final String App = "app";

    public static final String AppBridge = "appBridge";

    public static final String AppKey = "appKey";

    public static final String Description = "description";

    public static final String DiscountClass = "discountClass";

    public static final String FunctionId = "functionId";

    public static final String TargetType = "targetType";

    public static final String Title = "title";
  }

  public static class APPEDGE {
    public static final String TYPE_NAME = "AppEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class APPFEEDBACK {
    public static final String TYPE_NAME = "AppFeedback";

    public static final String App = "app";

    public static final String Link = "link";

    public static final String Messages = "messages";
  }

  public static class APPINSTALLATION {
    public static final String TYPE_NAME = "AppInstallation";

    public static final String AccessScopes = "accessScopes";

    public static final String ActiveSubscriptions = "activeSubscriptions";

    public static final String AllSubscriptions = "allSubscriptions";

    public static final String App = "app";

    public static final String Channel = "channel";

    public static final String Credits = "credits";

    public static final String Id = "id";

    public static final String LaunchUrl = "launchUrl";

    public static final String Metafield = "metafield";

    public static final String Metafields = "metafields";

    public static final String OneTimePurchases = "oneTimePurchases";

    public static final String PrivateMetafield = "privateMetafield";

    public static final String PrivateMetafields = "privateMetafields";

    public static final String Publication = "publication";

    public static final String RevenueAttributionRecords = "revenueAttributionRecords";

    public static final String Subscriptions = "subscriptions";

    public static final String UninstallUrl = "uninstallUrl";

    public static class ALLSUBSCRIPTIONS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";
    }

    public static class CREDITS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";
    }

    public static class METAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class METAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Keys = "keys";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class ONETIMEPURCHASES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";
    }

    public static class PRIVATEMETAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class PRIVATEMETAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class REVENUEATTRIBUTIONRECORDS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";
    }
  }

  public static class APPINSTALLATIONCONNECTION {
    public static final String TYPE_NAME = "AppInstallationConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class APPINSTALLATIONEDGE {
    public static final String TYPE_NAME = "AppInstallationEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class APPPLANV2 {
    public static final String TYPE_NAME = "AppPlanV2";

    public static final String PricingDetails = "pricingDetails";
  }

  public static class APPPURCHASEONETIME {
    public static final String TYPE_NAME = "AppPurchaseOneTime";

    public static final String CreatedAt = "createdAt";

    public static final String Id = "id";

    public static final String Name = "name";

    public static final String Price = "price";

    public static final String Status = "status";

    public static final String Test = "test";
  }

  public static class APPPURCHASEONETIMECONNECTION {
    public static final String TYPE_NAME = "AppPurchaseOneTimeConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class APPPURCHASEONETIMECREATEPAYLOAD {
    public static final String TYPE_NAME = "AppPurchaseOneTimeCreatePayload";

    public static final String AppPurchaseOneTime = "appPurchaseOneTime";

    public static final String ConfirmationUrl = "confirmationUrl";

    public static final String UserErrors = "userErrors";
  }

  public static class APPPURCHASEONETIMEEDGE {
    public static final String TYPE_NAME = "AppPurchaseOneTimeEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class APPRECURRINGPRICING {
    public static final String TYPE_NAME = "AppRecurringPricing";

    public static final String Discount = "discount";

    public static final String Interval = "interval";

    public static final String Price = "price";
  }

  public static class APPREVENUEATTRIBUTIONRECORD {
    public static final String TYPE_NAME = "AppRevenueAttributionRecord";

    public static final String Amount = "amount";

    public static final String CapturedAt = "capturedAt";

    public static final String CreatedAt = "createdAt";

    public static final String Id = "id";

    public static final String IdempotencyKey = "idempotencyKey";

    public static final String Test = "test";

    public static final String Type = "type";
  }

  public static class APPREVENUEATTRIBUTIONRECORDCONNECTION {
    public static final String TYPE_NAME = "AppRevenueAttributionRecordConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class APPREVENUEATTRIBUTIONRECORDEDGE {
    public static final String TYPE_NAME = "AppRevenueAttributionRecordEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class APPSUBSCRIPTION {
    public static final String TYPE_NAME = "AppSubscription";

    public static final String CreatedAt = "createdAt";

    public static final String CurrentPeriodEnd = "currentPeriodEnd";

    public static final String Id = "id";

    public static final String LineItems = "lineItems";

    public static final String Name = "name";

    public static final String ReturnUrl = "returnUrl";

    public static final String Status = "status";

    public static final String Test = "test";

    public static final String TrialDays = "trialDays";
  }

  public static class APPSUBSCRIPTIONCANCELPAYLOAD {
    public static final String TYPE_NAME = "AppSubscriptionCancelPayload";

    public static final String AppSubscription = "appSubscription";

    public static final String UserErrors = "userErrors";
  }

  public static class APPSUBSCRIPTIONCONNECTION {
    public static final String TYPE_NAME = "AppSubscriptionConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class APPSUBSCRIPTIONCREATEPAYLOAD {
    public static final String TYPE_NAME = "AppSubscriptionCreatePayload";

    public static final String AppSubscription = "appSubscription";

    public static final String ConfirmationUrl = "confirmationUrl";

    public static final String UserErrors = "userErrors";
  }

  public static class APPSUBSCRIPTIONDISCOUNT {
    public static final String TYPE_NAME = "AppSubscriptionDiscount";

    public static final String DurationLimitInIntervals = "durationLimitInIntervals";

    public static final String PriceAfterDiscount = "priceAfterDiscount";

    public static final String RemainingDurationInIntervals = "remainingDurationInIntervals";

    public static final String Value = "value";
  }

  public static class APPSUBSCRIPTIONDISCOUNTAMOUNT {
    public static final String TYPE_NAME = "AppSubscriptionDiscountAmount";

    public static final String Amount = "amount";
  }

  public static class APPSUBSCRIPTIONDISCOUNTPERCENTAGE {
    public static final String TYPE_NAME = "AppSubscriptionDiscountPercentage";

    public static final String Percentage = "percentage";
  }

  public static class APPSUBSCRIPTIONEDGE {
    public static final String TYPE_NAME = "AppSubscriptionEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class APPSUBSCRIPTIONLINEITEM {
    public static final String TYPE_NAME = "AppSubscriptionLineItem";

    public static final String Id = "id";

    public static final String Plan = "plan";

    public static final String UsageRecords = "usageRecords";

    public static class USAGERECORDS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";
    }
  }

  public static class APPSUBSCRIPTIONLINEITEMUPDATEPAYLOAD {
    public static final String TYPE_NAME = "AppSubscriptionLineItemUpdatePayload";

    public static final String AppSubscription = "appSubscription";

    public static final String ConfirmationUrl = "confirmationUrl";

    public static final String UserErrors = "userErrors";
  }

  public static class APPSUBSCRIPTIONTRIALEXTENDPAYLOAD {
    public static final String TYPE_NAME = "AppSubscriptionTrialExtendPayload";

    public static final String AppSubscription = "appSubscription";

    public static final String UserErrors = "userErrors";
  }

  public static class APPSUBSCRIPTIONTRIALEXTENDUSERERROR {
    public static final String TYPE_NAME = "AppSubscriptionTrialExtendUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class APPUSAGEPRICING {
    public static final String TYPE_NAME = "AppUsagePricing";

    public static final String BalanceUsed = "balanceUsed";

    public static final String CappedAmount = "cappedAmount";

    public static final String Interval = "interval";

    public static final String Terms = "terms";
  }

  public static class APPUSAGERECORD {
    public static final String TYPE_NAME = "AppUsageRecord";

    public static final String CreatedAt = "createdAt";

    public static final String Description = "description";

    public static final String Id = "id";

    public static final String IdempotencyKey = "idempotencyKey";

    public static final String Price = "price";

    public static final String SubscriptionLineItem = "subscriptionLineItem";
  }

  public static class APPUSAGERECORDCONNECTION {
    public static final String TYPE_NAME = "AppUsageRecordConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class APPUSAGERECORDCREATEPAYLOAD {
    public static final String TYPE_NAME = "AppUsageRecordCreatePayload";

    public static final String AppUsageRecord = "appUsageRecord";

    public static final String UserErrors = "userErrors";
  }

  public static class APPUSAGERECORDEDGE {
    public static final String TYPE_NAME = "AppUsageRecordEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class ATTRIBUTE {
    public static final String TYPE_NAME = "Attribute";

    public static final String Key = "key";

    public static final String Value = "value";
  }

  public static class AUTOMATICDISCOUNTAPPLICATION {
    public static final String TYPE_NAME = "AutomaticDiscountApplication";

    public static final String AllocationMethod = "allocationMethod";

    public static final String Index = "index";

    public static final String TargetSelection = "targetSelection";

    public static final String TargetType = "targetType";

    public static final String Title = "title";

    public static final String Value = "value";
  }

  public static class AVAILABLECHANNELDEFINITIONSBYCHANNEL {
    public static final String TYPE_NAME = "AvailableChannelDefinitionsByChannel";

    public static final String ChannelDefinitions = "channelDefinitions";

    public static final String ChannelName = "channelName";
  }

  public static class BASICEVENT {
    public static final String TYPE_NAME = "BasicEvent";

    public static final String AppTitle = "appTitle";

    public static final String AttributeToApp = "attributeToApp";

    public static final String AttributeToUser = "attributeToUser";

    public static final String CreatedAt = "createdAt";

    public static final String CriticalAlert = "criticalAlert";

    public static final String Id = "id";

    public static final String Message = "message";
  }

  public static class BILLINGATTEMPTUSERERROR {
    public static final String TYPE_NAME = "BillingAttemptUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class BULKMUTATIONUSERERROR {
    public static final String TYPE_NAME = "BulkMutationUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class BULKOPERATION {
    public static final String TYPE_NAME = "BulkOperation";

    public static final String CompletedAt = "completedAt";

    public static final String CreatedAt = "createdAt";

    public static final String ErrorCode = "errorCode";

    public static final String FileSize = "fileSize";

    public static final String Id = "id";

    public static final String ObjectCount = "objectCount";

    public static final String PartialDataUrl = "partialDataUrl";

    public static final String Query = "query";

    public static final String RootObjectCount = "rootObjectCount";

    public static final String Status = "status";

    public static final String Type = "type";

    public static final String Url = "url";
  }

  public static class BULKOPERATIONCANCELPAYLOAD {
    public static final String TYPE_NAME = "BulkOperationCancelPayload";

    public static final String BulkOperation = "bulkOperation";

    public static final String UserErrors = "userErrors";
  }

  public static class BULKOPERATIONRUNMUTATIONPAYLOAD {
    public static final String TYPE_NAME = "BulkOperationRunMutationPayload";

    public static final String BulkOperation = "bulkOperation";

    public static final String UserErrors = "userErrors";
  }

  public static class BULKOPERATIONRUNQUERYPAYLOAD {
    public static final String TYPE_NAME = "BulkOperationRunQueryPayload";

    public static final String BulkOperation = "bulkOperation";

    public static final String UserErrors = "userErrors";
  }

  public static class BULKPRODUCTRESOURCEFEEDBACKCREATEPAYLOAD {
    public static final String TYPE_NAME = "BulkProductResourceFeedbackCreatePayload";

    public static final String Feedback = "feedback";

    public static final String UserErrors = "userErrors";
  }

  public static class BULKPRODUCTRESOURCEFEEDBACKCREATEUSERERROR {
    public static final String TYPE_NAME = "BulkProductResourceFeedbackCreateUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class BUNDLESFEATURE {
    public static final String TYPE_NAME = "BundlesFeature";

    public static final String EligibleForBundles = "eligibleForBundles";

    public static final String IneligibilityReason = "ineligibilityReason";

    public static final String SellsBundles = "sellsBundles";
  }

  public static class BUSINESSCUSTOMERUSERERROR {
    public static final String TYPE_NAME = "BusinessCustomerUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class BUYEREXPERIENCECONFIGURATION {
    public static final String TYPE_NAME = "BuyerExperienceConfiguration";

    public static final String CheckoutToDraft = "checkoutToDraft";

    public static final String EditableShippingAddress = "editableShippingAddress";

    public static final String PayNowOnly = "payNowOnly";

    public static final String PaymentTermsTemplate = "paymentTermsTemplate";
  }

  public static class CALCULATEDAUTOMATICDISCOUNTAPPLICATION {
    public static final String TYPE_NAME = "CalculatedAutomaticDiscountApplication";

    public static final String AllocationMethod = "allocationMethod";

    public static final String AppliedTo = "appliedTo";

    public static final String Description = "description";

    public static final String Id = "id";

    public static final String TargetSelection = "targetSelection";

    public static final String TargetType = "targetType";

    public static final String Value = "value";
  }

  public static class CALCULATEDDISCOUNTALLOCATION {
    public static final String TYPE_NAME = "CalculatedDiscountAllocation";

    public static final String AllocatedAmountSet = "allocatedAmountSet";

    public static final String DiscountApplication = "discountApplication";
  }

  public static class CALCULATEDDISCOUNTAPPLICATIONCONNECTION {
    public static final String TYPE_NAME = "CalculatedDiscountApplicationConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class CALCULATEDDISCOUNTAPPLICATIONEDGE {
    public static final String TYPE_NAME = "CalculatedDiscountApplicationEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class CALCULATEDDISCOUNTCODEAPPLICATION {
    public static final String TYPE_NAME = "CalculatedDiscountCodeApplication";

    public static final String AllocationMethod = "allocationMethod";

    public static final String AppliedTo = "appliedTo";

    public static final String Code = "code";

    public static final String Description = "description";

    public static final String Id = "id";

    public static final String TargetSelection = "targetSelection";

    public static final String TargetType = "targetType";

    public static final String Value = "value";
  }

  public static class CALCULATEDDRAFTORDER {
    public static final String TYPE_NAME = "CalculatedDraftOrder";

    public static final String AppliedDiscount = "appliedDiscount";

    public static final String AvailableShippingRates = "availableShippingRates";

    public static final String BillingAddressMatchesShippingAddress = "billingAddressMatchesShippingAddress";

    public static final String CurrencyCode = "currencyCode";

    public static final String Customer = "customer";

    public static final String LineItems = "lineItems";

    public static final String LineItemsSubtotalPrice = "lineItemsSubtotalPrice";

    public static final String MarketName = "marketName";

    public static final String MarketRegionCountryCode = "marketRegionCountryCode";

    public static final String Phone = "phone";

    public static final String PresentmentCurrencyCode = "presentmentCurrencyCode";

    public static final String PurchasingEntity = "purchasingEntity";

    public static final String ShippingLine = "shippingLine";

    public static final String SubtotalPrice = "subtotalPrice";

    public static final String SubtotalPriceSet = "subtotalPriceSet";

    public static final String TaxLines = "taxLines";

    public static final String TotalDiscountsSet = "totalDiscountsSet";

    public static final String TotalLineItemsPriceSet = "totalLineItemsPriceSet";

    public static final String TotalPrice = "totalPrice";

    public static final String TotalPriceSet = "totalPriceSet";

    public static final String TotalShippingPrice = "totalShippingPrice";

    public static final String TotalShippingPriceSet = "totalShippingPriceSet";

    public static final String TotalTax = "totalTax";

    public static final String TotalTaxSet = "totalTaxSet";
  }

  public static class CALCULATEDDRAFTORDERLINEITEM {
    public static final String TYPE_NAME = "CalculatedDraftOrderLineItem";

    public static final String AppliedDiscount = "appliedDiscount";

    public static final String Custom = "custom";

    public static final String CustomAttributes = "customAttributes";

    public static final String CustomAttributesV2 = "customAttributesV2";

    public static final String DiscountedTotal = "discountedTotal";

    public static final String DiscountedTotalSet = "discountedTotalSet";

    public static final String DiscountedUnitPrice = "discountedUnitPrice";

    public static final String DiscountedUnitPriceSet = "discountedUnitPriceSet";

    public static final String FulfillmentService = "fulfillmentService";

    public static final String Image = "image";

    public static final String IsGiftCard = "isGiftCard";

    public static final String Name = "name";

    public static final String OriginalTotal = "originalTotal";

    public static final String OriginalTotalSet = "originalTotalSet";

    public static final String OriginalUnitPrice = "originalUnitPrice";

    public static final String OriginalUnitPriceSet = "originalUnitPriceSet";

    public static final String Product = "product";

    public static final String Quantity = "quantity";

    public static final String RequiresShipping = "requiresShipping";

    public static final String Sku = "sku";

    public static final String Taxable = "taxable";

    public static final String Title = "title";

    public static final String TotalDiscount = "totalDiscount";

    public static final String TotalDiscountSet = "totalDiscountSet";

    public static final String Variant = "variant";

    public static final String VariantTitle = "variantTitle";

    public static final String Vendor = "vendor";

    public static final String Weight = "weight";
  }

  public static class CALCULATEDLINEITEM {
    public static final String TYPE_NAME = "CalculatedLineItem";

    public static final String CalculatedDiscountAllocations = "calculatedDiscountAllocations";

    public static final String CustomAttributes = "customAttributes";

    public static final String DiscountAllocations = "discountAllocations";

    public static final String DiscountedUnitPriceSet = "discountedUnitPriceSet";

    public static final String EditableQuantity = "editableQuantity";

    public static final String EditableQuantityBeforeChanges = "editableQuantityBeforeChanges";

    public static final String EditableSubtotalSet = "editableSubtotalSet";

    public static final String HasStagedLineItemDiscount = "hasStagedLineItemDiscount";

    public static final String Id = "id";

    public static final String Image = "image";

    public static final String OriginalUnitPriceSet = "originalUnitPriceSet";

    public static final String Quantity = "quantity";

    public static final String Restockable = "restockable";

    public static final String Restocking = "restocking";

    public static final String Sku = "sku";

    public static final String StagedChanges = "stagedChanges";

    public static final String Title = "title";

    public static final String UneditableSubtotalSet = "uneditableSubtotalSet";

    public static final String Variant = "variant";

    public static final String VariantTitle = "variantTitle";
  }

  public static class CALCULATEDLINEITEMCONNECTION {
    public static final String TYPE_NAME = "CalculatedLineItemConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class CALCULATEDLINEITEMEDGE {
    public static final String TYPE_NAME = "CalculatedLineItemEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class CALCULATEDMANUALDISCOUNTAPPLICATION {
    public static final String TYPE_NAME = "CalculatedManualDiscountApplication";

    public static final String AllocationMethod = "allocationMethod";

    public static final String AppliedTo = "appliedTo";

    public static final String Description = "description";

    public static final String Id = "id";

    public static final String TargetSelection = "targetSelection";

    public static final String TargetType = "targetType";

    public static final String Value = "value";
  }

  public static class CALCULATEDORDER {
    public static final String TYPE_NAME = "CalculatedOrder";

    public static final String AddedDiscountApplications = "addedDiscountApplications";

    public static final String AddedLineItems = "addedLineItems";

    public static final String CartDiscountAmountSet = "cartDiscountAmountSet";

    public static final String Committed = "committed";

    public static final String Id = "id";

    public static final String LineItems = "lineItems";

    public static final String NotificationPreviewHtml = "notificationPreviewHtml";

    public static final String NotificationPreviewTitle = "notificationPreviewTitle";

    public static final String Order = "order";

    public static final String OriginalOrder = "originalOrder";

    public static final String StagedChanges = "stagedChanges";

    public static final String SubtotalLineItemsQuantity = "subtotalLineItemsQuantity";

    public static final String SubtotalPriceSet = "subtotalPriceSet";

    public static final String TaxLines = "taxLines";

    public static final String TotalOutstandingSet = "totalOutstandingSet";

    public static final String TotalPriceSet = "totalPriceSet";

    public static class ADDEDDISCOUNTAPPLICATIONS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class ADDEDLINEITEMS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class LINEITEMS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String Query = "query";
    }

    public static class STAGEDCHANGES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class CALCULATEDSCRIPTDISCOUNTAPPLICATION {
    public static final String TYPE_NAME = "CalculatedScriptDiscountApplication";

    public static final String AllocationMethod = "allocationMethod";

    public static final String AppliedTo = "appliedTo";

    public static final String Description = "description";

    public static final String Id = "id";

    public static final String TargetSelection = "targetSelection";

    public static final String TargetType = "targetType";

    public static final String Value = "value";
  }

  public static class CARDPAYMENTDETAILS {
    public static final String TYPE_NAME = "CardPaymentDetails";

    public static final String AvsResultCode = "avsResultCode";

    public static final String Bin = "bin";

    public static final String Company = "company";

    public static final String CvvResultCode = "cvvResultCode";

    public static final String ExpirationMonth = "expirationMonth";

    public static final String ExpirationYear = "expirationYear";

    public static final String Name = "name";

    public static final String Number = "number";

    public static final String PaymentMethodName = "paymentMethodName";

    public static final String Wallet = "wallet";
  }

  public static class CARTTRANSFORM {
    public static final String TYPE_NAME = "CartTransform";

    public static final String BlockOnFailure = "blockOnFailure";

    public static final String FunctionId = "functionId";

    public static final String Id = "id";

    public static final String Metafield = "metafield";

    public static final String Metafields = "metafields";

    public static final String PrivateMetafield = "privateMetafield";

    public static final String PrivateMetafields = "privateMetafields";

    public static class METAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class METAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Keys = "keys";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PRIVATEMETAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class PRIVATEMETAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class CARTTRANSFORMCONNECTION {
    public static final String TYPE_NAME = "CartTransformConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class CARTTRANSFORMCREATEPAYLOAD {
    public static final String TYPE_NAME = "CartTransformCreatePayload";

    public static final String CartTransform = "cartTransform";

    public static final String UserErrors = "userErrors";
  }

  public static class CARTTRANSFORMCREATEUSERERROR {
    public static final String TYPE_NAME = "CartTransformCreateUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class CARTTRANSFORMDELETEPAYLOAD {
    public static final String TYPE_NAME = "CartTransformDeletePayload";

    public static final String DeletedId = "deletedId";

    public static final String UserErrors = "userErrors";
  }

  public static class CARTTRANSFORMDELETEUSERERROR {
    public static final String TYPE_NAME = "CartTransformDeleteUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class CARTTRANSFORMEDGE {
    public static final String TYPE_NAME = "CartTransformEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class CARTTRANSFORMELIGIBLEOPERATIONS {
    public static final String TYPE_NAME = "CartTransformEligibleOperations";

    public static final String ExpandOperation = "expandOperation";

    public static final String MergeOperation = "mergeOperation";

    public static final String UpdateOperation = "updateOperation";
  }

  public static class CARTTRANSFORMFEATURE {
    public static final String TYPE_NAME = "CartTransformFeature";

    public static final String EligibleOperations = "eligibleOperations";
  }

  public static class CATALOGCONNECTION {
    public static final String TYPE_NAME = "CatalogConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";

    public static final String TotalCount = "totalCount";
  }

  public static class CATALOGCONTEXTUPDATEPAYLOAD {
    public static final String TYPE_NAME = "CatalogContextUpdatePayload";

    public static final String Catalog = "catalog";

    public static final String UserErrors = "userErrors";
  }

  public static class CATALOGCREATEPAYLOAD {
    public static final String TYPE_NAME = "CatalogCreatePayload";

    public static final String Catalog = "catalog";

    public static final String UserErrors = "userErrors";
  }

  public static class CATALOGCSVOPERATION {
    public static final String TYPE_NAME = "CatalogCsvOperation";

    public static final String Id = "id";

    public static final String ProcessedRowCount = "processedRowCount";

    public static final String RowCount = "rowCount";

    public static final String Status = "status";
  }

  public static class CATALOGDELETEPAYLOAD {
    public static final String TYPE_NAME = "CatalogDeletePayload";

    public static final String DeletedId = "deletedId";

    public static final String UserErrors = "userErrors";
  }

  public static class CATALOGEDGE {
    public static final String TYPE_NAME = "CatalogEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class CATALOGUPDATEPAYLOAD {
    public static final String TYPE_NAME = "CatalogUpdatePayload";

    public static final String Catalog = "catalog";

    public static final String UserErrors = "userErrors";
  }

  public static class CATALOGUSERERROR {
    public static final String TYPE_NAME = "CatalogUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class CHANNEL {
    public static final String TYPE_NAME = "Channel";

    public static final String App = "app";

    public static final String CollectionPublicationsV3 = "collectionPublicationsV3";

    public static final String Collections = "collections";

    public static final String Handle = "handle";

    public static final String HasCollection = "hasCollection";

    public static final String Id = "id";

    public static final String Name = "name";

    public static final String NavigationItems = "navigationItems";

    public static final String OverviewPath = "overviewPath";

    public static final String ProductPublications = "productPublications";

    public static final String ProductPublicationsV3 = "productPublicationsV3";

    public static final String Products = "products";

    public static final String SupportsFuturePublishing = "supportsFuturePublishing";

    public static class COLLECTIONPUBLICATIONSV3_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class COLLECTIONS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class HASCOLLECTION_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class PRODUCTPUBLICATIONS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PRODUCTPUBLICATIONSV3_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PRODUCTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class CHANNELCONNECTION {
    public static final String TYPE_NAME = "ChannelConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class CHANNELDEFINITION {
    public static final String TYPE_NAME = "ChannelDefinition";

    public static final String ChannelName = "channelName";

    public static final String Handle = "handle";

    public static final String Id = "id";

    public static final String IsMarketplace = "isMarketplace";

    public static final String SubChannelName = "subChannelName";

    public static final String SvgIcon = "svgIcon";
  }

  public static class CHANNELEDGE {
    public static final String TYPE_NAME = "ChannelEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class CHANNELINFORMATION {
    public static final String TYPE_NAME = "ChannelInformation";

    public static final String App = "app";

    public static final String ChannelDefinition = "channelDefinition";

    public static final String ChannelId = "channelId";

    public static final String Id = "id";
  }

  public static class CHECKOUTBRANDING {
    public static final String TYPE_NAME = "CheckoutBranding";

    public static final String Customizations = "customizations";

    public static final String DesignSystem = "designSystem";
  }

  public static class CHECKOUTBRANDINGBUTTON {
    public static final String TYPE_NAME = "CheckoutBrandingButton";

    public static final String Background = "background";

    public static final String BlockPadding = "blockPadding";

    public static final String Border = "border";

    public static final String CornerRadius = "cornerRadius";

    public static final String InlinePadding = "inlinePadding";

    public static final String Typography = "typography";
  }

  public static class CHECKOUTBRANDINGBUTTONCOLORROLES {
    public static final String TYPE_NAME = "CheckoutBrandingButtonColorRoles";

    public static final String Accent = "accent";

    public static final String Background = "background";

    public static final String Border = "border";

    public static final String Decorative = "decorative";

    public static final String Hover = "hover";

    public static final String Icon = "icon";

    public static final String Text = "text";
  }

  public static class CHECKOUTBRANDINGCHECKBOX {
    public static final String TYPE_NAME = "CheckoutBrandingCheckbox";

    public static final String CornerRadius = "cornerRadius";
  }

  public static class CHECKOUTBRANDINGCHOICELIST {
    public static final String TYPE_NAME = "CheckoutBrandingChoiceList";

    public static final String Group = "group";
  }

  public static class CHECKOUTBRANDINGCHOICELISTGROUP {
    public static final String TYPE_NAME = "CheckoutBrandingChoiceListGroup";

    public static final String Spacing = "spacing";
  }

  public static class CHECKOUTBRANDINGCOLORGLOBAL {
    public static final String TYPE_NAME = "CheckoutBrandingColorGlobal";

    public static final String Accent = "accent";

    public static final String Brand = "brand";

    public static final String Critical = "critical";

    public static final String Decorative = "decorative";

    public static final String Info = "info";

    public static final String Success = "success";

    public static final String Warning = "warning";
  }

  public static class CHECKOUTBRANDINGCOLORROLES {
    public static final String TYPE_NAME = "CheckoutBrandingColorRoles";

    public static final String Accent = "accent";

    public static final String Background = "background";

    public static final String Border = "border";

    public static final String Decorative = "decorative";

    public static final String Icon = "icon";

    public static final String Text = "text";
  }

  public static class CHECKOUTBRANDINGCOLORS {
    public static final String TYPE_NAME = "CheckoutBrandingColors";

    public static final String Global = "global";

    public static final String Schemes = "schemes";
  }

  public static class CHECKOUTBRANDINGCOLORSCHEME {
    public static final String TYPE_NAME = "CheckoutBrandingColorScheme";

    public static final String Base = "base";

    public static final String Control = "control";

    public static final String PrimaryButton = "primaryButton";

    public static final String SecondaryButton = "secondaryButton";
  }

  public static class CHECKOUTBRANDINGCOLORSCHEMES {
    public static final String TYPE_NAME = "CheckoutBrandingColorSchemes";

    public static final String Scheme1 = "scheme1";

    public static final String Scheme2 = "scheme2";
  }

  public static class CHECKOUTBRANDINGCONTROL {
    public static final String TYPE_NAME = "CheckoutBrandingControl";

    public static final String Border = "border";

    public static final String Color = "color";

    public static final String CornerRadius = "cornerRadius";

    public static final String LabelPosition = "labelPosition";
  }

  public static class CHECKOUTBRANDINGCONTROLCOLORROLES {
    public static final String TYPE_NAME = "CheckoutBrandingControlColorRoles";

    public static final String Accent = "accent";

    public static final String Background = "background";

    public static final String Border = "border";

    public static final String Decorative = "decorative";

    public static final String Icon = "icon";

    public static final String Selected = "selected";

    public static final String Text = "text";
  }

  public static class CHECKOUTBRANDINGCORNERRADIUSVARIABLES {
    public static final String TYPE_NAME = "CheckoutBrandingCornerRadiusVariables";

    public static final String Base = "base";

    public static final String Large = "large";

    public static final String Small = "small";
  }

  public static class CHECKOUTBRANDINGCUSTOMFONT {
    public static final String TYPE_NAME = "CheckoutBrandingCustomFont";

    public static final String GenericFileId = "genericFileId";

    public static final String Sources = "sources";

    public static final String Weight = "weight";
  }

  public static class CHECKOUTBRANDINGCUSTOMIZATIONS {
    public static final String TYPE_NAME = "CheckoutBrandingCustomizations";

    public static final String Checkbox = "checkbox";

    public static final String ChoiceList = "choiceList";

    public static final String Control = "control";

    public static final String Favicon = "favicon";

    public static final String Global = "global";

    public static final String Header = "header";

    public static final String HeadingLevel1 = "headingLevel1";

    public static final String HeadingLevel2 = "headingLevel2";

    public static final String HeadingLevel3 = "headingLevel3";

    public static final String Main = "main";

    public static final String MerchandiseThumbnail = "merchandiseThumbnail";

    public static final String OrderSummary = "orderSummary";

    public static final String PrimaryButton = "primaryButton";

    public static final String SecondaryButton = "secondaryButton";

    public static final String Select = "select";

    public static final String TextField = "textField";
  }

  public static class CHECKOUTBRANDINGDESIGNSYSTEM {
    public static final String TYPE_NAME = "CheckoutBrandingDesignSystem";

    public static final String Colors = "colors";

    public static final String CornerRadius = "cornerRadius";

    public static final String Typography = "typography";
  }

  public static class CHECKOUTBRANDINGFONTGROUP {
    public static final String TYPE_NAME = "CheckoutBrandingFontGroup";

    public static final String Base = "base";

    public static final String Bold = "bold";

    public static final String LoadingStrategy = "loadingStrategy";

    public static final String Name = "name";
  }

  public static class CHECKOUTBRANDINGFONTSIZE {
    public static final String TYPE_NAME = "CheckoutBrandingFontSize";

    public static final String Base = "base";

    public static final String Ratio = "ratio";
  }

  public static class CHECKOUTBRANDINGGLOBAL {
    public static final String TYPE_NAME = "CheckoutBrandingGlobal";

    public static final String CornerRadius = "cornerRadius";

    public static final String Typography = "typography";
  }

  public static class CHECKOUTBRANDINGHEADER {
    public static final String TYPE_NAME = "CheckoutBrandingHeader";

    public static final String Alignment = "alignment";

    public static final String Banner = "banner";

    public static final String Logo = "logo";

    public static final String Position = "position";
  }

  public static class CHECKOUTBRANDINGHEADINGLEVEL {
    public static final String TYPE_NAME = "CheckoutBrandingHeadingLevel";

    public static final String Typography = "typography";
  }

  public static class CHECKOUTBRANDINGIMAGE {
    public static final String TYPE_NAME = "CheckoutBrandingImage";

    public static final String Image = "image";
  }

  public static class CHECKOUTBRANDINGLOGO {
    public static final String TYPE_NAME = "CheckoutBrandingLogo";

    public static final String Image = "image";

    public static final String MaxWidth = "maxWidth";
  }

  public static class CHECKOUTBRANDINGMAIN {
    public static final String TYPE_NAME = "CheckoutBrandingMain";

    public static final String BackgroundImage = "backgroundImage";

    public static final String ColorScheme = "colorScheme";
  }

  public static class CHECKOUTBRANDINGMERCHANDISETHUMBNAIL {
    public static final String TYPE_NAME = "CheckoutBrandingMerchandiseThumbnail";

    public static final String Border = "border";

    public static final String CornerRadius = "cornerRadius";
  }

  public static class CHECKOUTBRANDINGORDERSUMMARY {
    public static final String TYPE_NAME = "CheckoutBrandingOrderSummary";

    public static final String BackgroundImage = "backgroundImage";

    public static final String ColorScheme = "colorScheme";
  }

  public static class CHECKOUTBRANDINGSELECT {
    public static final String TYPE_NAME = "CheckoutBrandingSelect";

    public static final String Border = "border";

    public static final String Typography = "typography";
  }

  public static class CHECKOUTBRANDINGSHOPIFYFONT {
    public static final String TYPE_NAME = "CheckoutBrandingShopifyFont";

    public static final String Sources = "sources";

    public static final String Weight = "weight";
  }

  public static class CHECKOUTBRANDINGTEXTFIELD {
    public static final String TYPE_NAME = "CheckoutBrandingTextField";

    public static final String Border = "border";

    public static final String Typography = "typography";
  }

  public static class CHECKOUTBRANDINGTYPOGRAPHY {
    public static final String TYPE_NAME = "CheckoutBrandingTypography";

    public static final String Primary = "primary";

    public static final String Secondary = "secondary";

    public static final String Size = "size";
  }

  public static class CHECKOUTBRANDINGTYPOGRAPHYSTYLE {
    public static final String TYPE_NAME = "CheckoutBrandingTypographyStyle";

    public static final String Font = "font";

    public static final String Kerning = "kerning";

    public static final String LetterCase = "letterCase";

    public static final String Size = "size";

    public static final String Weight = "weight";
  }

  public static class CHECKOUTBRANDINGTYPOGRAPHYSTYLEGLOBAL {
    public static final String TYPE_NAME = "CheckoutBrandingTypographyStyleGlobal";

    public static final String Kerning = "kerning";

    public static final String LetterCase = "letterCase";
  }

  public static class CHECKOUTBRANDINGUPSERTPAYLOAD {
    public static final String TYPE_NAME = "CheckoutBrandingUpsertPayload";

    public static final String CheckoutBranding = "checkoutBranding";

    public static final String UserErrors = "userErrors";
  }

  public static class CHECKOUTBRANDINGUPSERTUSERERROR {
    public static final String TYPE_NAME = "CheckoutBrandingUpsertUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class CHECKOUTPROFILE {
    public static final String TYPE_NAME = "CheckoutProfile";

    public static final String CreatedAt = "createdAt";

    public static final String EditedAt = "editedAt";

    public static final String Id = "id";

    public static final String IsPublished = "isPublished";

    public static final String Name = "name";

    public static final String UpdatedAt = "updatedAt";
  }

  public static class CHECKOUTPROFILECONNECTION {
    public static final String TYPE_NAME = "CheckoutProfileConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class CHECKOUTPROFILEEDGE {
    public static final String TYPE_NAME = "CheckoutProfileEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class COLLECTION {
    public static final String TYPE_NAME = "Collection";

    public static final String AvailablePublicationCount = "availablePublicationCount";

    public static final String Description = "description";

    public static final String DescriptionHtml = "descriptionHtml";

    public static final String Feedback = "feedback";

    public static final String Handle = "handle";

    public static final String HasProduct = "hasProduct";

    public static final String Id = "id";

    public static final String Image = "image";

    public static final String LegacyResourceId = "legacyResourceId";

    public static final String Metafield = "metafield";

    public static final String MetafieldDefinitions = "metafieldDefinitions";

    public static final String Metafields = "metafields";

    public static final String PrivateMetafield = "privateMetafield";

    public static final String PrivateMetafields = "privateMetafields";

    public static final String Products = "products";

    public static final String ProductsCount = "productsCount";

    public static final String PublicationCount = "publicationCount";

    public static final String Publications = "publications";

    public static final String PublishedOnChannel = "publishedOnChannel";

    public static final String PublishedOnCurrentChannel = "publishedOnCurrentChannel";

    public static final String PublishedOnCurrentPublication = "publishedOnCurrentPublication";

    public static final String PublishedOnPublication = "publishedOnPublication";

    public static final String ResourcePublications = "resourcePublications";

    public static final String ResourcePublicationsV2 = "resourcePublicationsV2";

    public static final String RuleSet = "ruleSet";

    public static final String Seo = "seo";

    public static final String SortOrder = "sortOrder";

    public static final String StorefrontId = "storefrontId";

    public static final String TemplateSuffix = "templateSuffix";

    public static final String Title = "title";

    public static final String Translations = "translations";

    public static final String UnpublishedChannels = "unpublishedChannels";

    public static final String UnpublishedPublications = "unpublishedPublications";

    public static final String UpdatedAt = "updatedAt";

    public static class DESCRIPTION_INPUT_ARGUMENT {
      public static final String TruncateAt = "truncateAt";
    }

    public static class HASPRODUCT_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class METAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class METAFIELDDEFINITIONS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String PinnedStatus = "pinnedStatus";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class METAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Keys = "keys";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PRIVATEMETAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class PRIVATEMETAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PRODUCTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";
    }

    public static class PUBLICATIONCOUNT_INPUT_ARGUMENT {
      public static final String OnlyPublished = "onlyPublished";
    }

    public static class PUBLICATIONS_INPUT_ARGUMENT {
      public static final String OnlyPublished = "onlyPublished";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PUBLISHEDONCHANNEL_INPUT_ARGUMENT {
      public static final String ChannelId = "channelId";
    }

    public static class PUBLISHEDONPUBLICATION_INPUT_ARGUMENT {
      public static final String PublicationId = "publicationId";
    }

    public static class RESOURCEPUBLICATIONS_INPUT_ARGUMENT {
      public static final String OnlyPublished = "onlyPublished";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class RESOURCEPUBLICATIONSV2_INPUT_ARGUMENT {
      public static final String OnlyPublished = "onlyPublished";

      public static final String CatalogType = "catalogType";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class TRANSLATIONS_INPUT_ARGUMENT {
      public static final String Locale = "locale";

      public static final String MarketId = "marketId";
    }

    public static class UNPUBLISHEDCHANNELS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class UNPUBLISHEDPUBLICATIONS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class COLLECTIONADDPRODUCTSPAYLOAD {
    public static final String TYPE_NAME = "CollectionAddProductsPayload";

    public static final String Collection = "collection";

    public static final String UserErrors = "userErrors";
  }

  public static class COLLECTIONADDPRODUCTSV2PAYLOAD {
    public static final String TYPE_NAME = "CollectionAddProductsV2Payload";

    public static final String Job = "job";

    public static final String UserErrors = "userErrors";
  }

  public static class COLLECTIONADDPRODUCTSV2USERERROR {
    public static final String TYPE_NAME = "CollectionAddProductsV2UserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class COLLECTIONCONNECTION {
    public static final String TYPE_NAME = "CollectionConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class COLLECTIONCREATEPAYLOAD {
    public static final String TYPE_NAME = "CollectionCreatePayload";

    public static final String Collection = "collection";

    public static final String UserErrors = "userErrors";
  }

  public static class COLLECTIONDELETEPAYLOAD {
    public static final String TYPE_NAME = "CollectionDeletePayload";

    public static final String DeletedCollectionId = "deletedCollectionId";

    public static final String Shop = "shop";

    public static final String UserErrors = "userErrors";
  }

  public static class COLLECTIONEDGE {
    public static final String TYPE_NAME = "CollectionEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class COLLECTIONPUBLICATION {
    public static final String TYPE_NAME = "CollectionPublication";

    public static final String Channel = "channel";

    public static final String Collection = "collection";

    public static final String IsPublished = "isPublished";

    public static final String Publication = "publication";

    public static final String PublishDate = "publishDate";
  }

  public static class COLLECTIONPUBLICATIONCONNECTION {
    public static final String TYPE_NAME = "CollectionPublicationConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class COLLECTIONPUBLICATIONEDGE {
    public static final String TYPE_NAME = "CollectionPublicationEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class COLLECTIONPUBLISHPAYLOAD {
    public static final String TYPE_NAME = "CollectionPublishPayload";

    public static final String Collection = "collection";

    public static final String CollectionPublications = "collectionPublications";

    public static final String Shop = "shop";

    public static final String UserErrors = "userErrors";
  }

  public static class COLLECTIONREMOVEPRODUCTSPAYLOAD {
    public static final String TYPE_NAME = "CollectionRemoveProductsPayload";

    public static final String Job = "job";

    public static final String UserErrors = "userErrors";
  }

  public static class COLLECTIONREORDERPRODUCTSPAYLOAD {
    public static final String TYPE_NAME = "CollectionReorderProductsPayload";

    public static final String Job = "job";

    public static final String UserErrors = "userErrors";
  }

  public static class COLLECTIONRULE {
    public static final String TYPE_NAME = "CollectionRule";

    public static final String Column = "column";

    public static final String Condition = "condition";

    public static final String ConditionObject = "conditionObject";

    public static final String Relation = "relation";
  }

  public static class COLLECTIONRULECONDITIONS {
    public static final String TYPE_NAME = "CollectionRuleConditions";

    public static final String AllowedRelations = "allowedRelations";

    public static final String DefaultRelation = "defaultRelation";

    public static final String RuleObject = "ruleObject";

    public static final String RuleType = "ruleType";
  }

  public static class COLLECTIONRULEMETAFIELDCONDITION {
    public static final String TYPE_NAME = "CollectionRuleMetafieldCondition";

    public static final String MetafieldDefinition = "metafieldDefinition";
  }

  public static class COLLECTIONRULEPRODUCTCATEGORYCONDITION {
    public static final String TYPE_NAME = "CollectionRuleProductCategoryCondition";

    public static final String Value = "value";
  }

  public static class COLLECTIONRULESET {
    public static final String TYPE_NAME = "CollectionRuleSet";

    public static final String AppliedDisjunctively = "appliedDisjunctively";

    public static final String Rules = "rules";
  }

  public static class COLLECTIONRULETEXTCONDITION {
    public static final String TYPE_NAME = "CollectionRuleTextCondition";

    public static final String Value = "value";
  }

  public static class COLLECTIONUNPUBLISHPAYLOAD {
    public static final String TYPE_NAME = "CollectionUnpublishPayload";

    public static final String Collection = "collection";

    public static final String Shop = "shop";

    public static final String UserErrors = "userErrors";
  }

  public static class COLLECTIONUPDATEPAYLOAD {
    public static final String TYPE_NAME = "CollectionUpdatePayload";

    public static final String Collection = "collection";

    public static final String Job = "job";

    public static final String UserErrors = "userErrors";
  }

  public static class COMMENTEVENT {
    public static final String TYPE_NAME = "CommentEvent";

    public static final String AppTitle = "appTitle";

    public static final String Attachments = "attachments";

    public static final String AttributeToApp = "attributeToApp";

    public static final String AttributeToUser = "attributeToUser";

    public static final String Author = "author";

    public static final String CanDelete = "canDelete";

    public static final String CanEdit = "canEdit";

    public static final String CreatedAt = "createdAt";

    public static final String CriticalAlert = "criticalAlert";

    public static final String Edited = "edited";

    public static final String Embed = "embed";

    public static final String Id = "id";

    public static final String Message = "message";

    public static final String RawMessage = "rawMessage";

    public static final String Subject = "subject";
  }

  public static class COMMENTEVENTATTACHMENT {
    public static final String TYPE_NAME = "CommentEventAttachment";

    public static final String FileExtension = "fileExtension";

    public static final String Id = "id";

    public static final String Image = "image";

    public static final String Name = "name";

    public static final String Size = "size";

    public static final String Url = "url";
  }

  public static class COMPANIESDELETEPAYLOAD {
    public static final String TYPE_NAME = "CompaniesDeletePayload";

    public static final String DeletedCompanyIds = "deletedCompanyIds";

    public static final String UserErrors = "userErrors";
  }

  public static class COMPANY {
    public static final String TYPE_NAME = "Company";

    public static final String ContactCount = "contactCount";

    public static final String ContactRoles = "contactRoles";

    public static final String Contacts = "contacts";

    public static final String CreatedAt = "createdAt";

    public static final String CustomerSince = "customerSince";

    public static final String DefaultCursor = "defaultCursor";

    public static final String DefaultRole = "defaultRole";

    public static final String DraftOrders = "draftOrders";

    public static final String Events = "events";

    public static final String ExternalId = "externalId";

    public static final String HasTimelineComment = "hasTimelineComment";

    public static final String Id = "id";

    public static final String LifetimeDuration = "lifetimeDuration";

    public static final String LocationCount = "locationCount";

    public static final String Locations = "locations";

    public static final String MainContact = "mainContact";

    public static final String Metafield = "metafield";

    public static final String MetafieldDefinitions = "metafieldDefinitions";

    public static final String Metafields = "metafields";

    public static final String Name = "name";

    public static final String Note = "note";

    public static final String OrderCount = "orderCount";

    public static final String Orders = "orders";

    public static final String PrivateMetafield = "privateMetafield";

    public static final String PrivateMetafields = "privateMetafields";

    public static final String TotalSpent = "totalSpent";

    public static final String UpdatedAt = "updatedAt";

    public static class CONTACTROLES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";
    }

    public static class CONTACTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class DRAFTORDERS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class EVENTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class LOCATIONS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class METAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class METAFIELDDEFINITIONS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String PinnedStatus = "pinnedStatus";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class METAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Keys = "keys";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class ORDERS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";
    }

    public static class PRIVATEMETAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class PRIVATEMETAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class COMPANYADDRESS {
    public static final String TYPE_NAME = "CompanyAddress";

    public static final String Address1 = "address1";

    public static final String Address2 = "address2";

    public static final String City = "city";

    public static final String CompanyName = "companyName";

    public static final String Country = "country";

    public static final String CountryCode = "countryCode";

    public static final String CreatedAt = "createdAt";

    public static final String FirstName = "firstName";

    public static final String FormattedAddress = "formattedAddress";

    public static final String FormattedArea = "formattedArea";

    public static final String Id = "id";

    public static final String LastName = "lastName";

    public static final String Phone = "phone";

    public static final String Province = "province";

    public static final String Recipient = "recipient";

    public static final String UpdatedAt = "updatedAt";

    public static final String Zip = "zip";

    public static final String ZoneCode = "zoneCode";

    public static class FORMATTEDADDRESS_INPUT_ARGUMENT {
      public static final String WithName = "withName";

      public static final String WithCompanyName = "withCompanyName";
    }
  }

  public static class COMPANYADDRESSDELETEPAYLOAD {
    public static final String TYPE_NAME = "CompanyAddressDeletePayload";

    public static final String DeletedAddressId = "deletedAddressId";

    public static final String UserErrors = "userErrors";
  }

  public static class COMPANYASSIGNCUSTOMERASCONTACTPAYLOAD {
    public static final String TYPE_NAME = "CompanyAssignCustomerAsContactPayload";

    public static final String CompanyContact = "companyContact";

    public static final String UserErrors = "userErrors";
  }

  public static class COMPANYASSIGNMAINCONTACTPAYLOAD {
    public static final String TYPE_NAME = "CompanyAssignMainContactPayload";

    public static final String Company = "company";

    public static final String UserErrors = "userErrors";
  }

  public static class COMPANYCONNECTION {
    public static final String TYPE_NAME = "CompanyConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class COMPANYCONTACT {
    public static final String TYPE_NAME = "CompanyContact";

    public static final String Company = "company";

    public static final String CreatedAt = "createdAt";

    public static final String Customer = "customer";

    public static final String DraftOrders = "draftOrders";

    public static final String Id = "id";

    public static final String IsMainContact = "isMainContact";

    public static final String LifetimeDuration = "lifetimeDuration";

    public static final String Locale = "locale";

    public static final String Orders = "orders";

    public static final String RoleAssignments = "roleAssignments";

    public static final String Title = "title";

    public static final String UpdatedAt = "updatedAt";

    public static class DRAFTORDERS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class ORDERS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";
    }

    public static class ROLEASSIGNMENTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }
  }

  public static class COMPANYCONTACTASSIGNROLEPAYLOAD {
    public static final String TYPE_NAME = "CompanyContactAssignRolePayload";

    public static final String CompanyContactRoleAssignment = "companyContactRoleAssignment";

    public static final String UserErrors = "userErrors";
  }

  public static class COMPANYCONTACTASSIGNROLESPAYLOAD {
    public static final String TYPE_NAME = "CompanyContactAssignRolesPayload";

    public static final String RoleAssignments = "roleAssignments";

    public static final String UserErrors = "userErrors";
  }

  public static class COMPANYCONTACTCONNECTION {
    public static final String TYPE_NAME = "CompanyContactConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class COMPANYCONTACTCREATEPAYLOAD {
    public static final String TYPE_NAME = "CompanyContactCreatePayload";

    public static final String CompanyContact = "companyContact";

    public static final String UserErrors = "userErrors";
  }

  public static class COMPANYCONTACTDELETEPAYLOAD {
    public static final String TYPE_NAME = "CompanyContactDeletePayload";

    public static final String DeletedCompanyContactId = "deletedCompanyContactId";

    public static final String UserErrors = "userErrors";
  }

  public static class COMPANYCONTACTEDGE {
    public static final String TYPE_NAME = "CompanyContactEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class COMPANYCONTACTREMOVEFROMCOMPANYPAYLOAD {
    public static final String TYPE_NAME = "CompanyContactRemoveFromCompanyPayload";

    public static final String RemovedCompanyContactId = "removedCompanyContactId";

    public static final String UserErrors = "userErrors";
  }

  public static class COMPANYCONTACTREVOKEROLEPAYLOAD {
    public static final String TYPE_NAME = "CompanyContactRevokeRolePayload";

    public static final String RevokedCompanyContactRoleAssignmentId = "revokedCompanyContactRoleAssignmentId";

    public static final String UserErrors = "userErrors";
  }

  public static class COMPANYCONTACTREVOKEROLESPAYLOAD {
    public static final String TYPE_NAME = "CompanyContactRevokeRolesPayload";

    public static final String RevokedRoleAssignmentIds = "revokedRoleAssignmentIds";

    public static final String UserErrors = "userErrors";
  }

  public static class COMPANYCONTACTROLE {
    public static final String TYPE_NAME = "CompanyContactRole";

    public static final String Id = "id";

    public static final String Name = "name";

    public static final String Note = "note";
  }

  public static class COMPANYCONTACTROLEASSIGNMENT {
    public static final String TYPE_NAME = "CompanyContactRoleAssignment";

    public static final String Company = "company";

    public static final String CompanyContact = "companyContact";

    public static final String CompanyLocation = "companyLocation";

    public static final String CreatedAt = "createdAt";

    public static final String Id = "id";

    public static final String Role = "role";

    public static final String UpdatedAt = "updatedAt";
  }

  public static class COMPANYCONTACTROLEASSIGNMENTCONNECTION {
    public static final String TYPE_NAME = "CompanyContactRoleAssignmentConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class COMPANYCONTACTROLEASSIGNMENTEDGE {
    public static final String TYPE_NAME = "CompanyContactRoleAssignmentEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class COMPANYCONTACTROLECONNECTION {
    public static final String TYPE_NAME = "CompanyContactRoleConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class COMPANYCONTACTROLEEDGE {
    public static final String TYPE_NAME = "CompanyContactRoleEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class COMPANYCONTACTSDELETEPAYLOAD {
    public static final String TYPE_NAME = "CompanyContactsDeletePayload";

    public static final String DeletedCompanyContactIds = "deletedCompanyContactIds";

    public static final String UserErrors = "userErrors";
  }

  public static class COMPANYCONTACTSENDWELCOMEEMAILPAYLOAD {
    public static final String TYPE_NAME = "CompanyContactSendWelcomeEmailPayload";

    public static final String CompanyContact = "companyContact";

    public static final String UserErrors = "userErrors";
  }

  public static class COMPANYCONTACTUPDATEPAYLOAD {
    public static final String TYPE_NAME = "CompanyContactUpdatePayload";

    public static final String CompanyContact = "companyContact";

    public static final String UserErrors = "userErrors";
  }

  public static class COMPANYCREATEPAYLOAD {
    public static final String TYPE_NAME = "CompanyCreatePayload";

    public static final String Company = "company";

    public static final String UserErrors = "userErrors";
  }

  public static class COMPANYDELETEPAYLOAD {
    public static final String TYPE_NAME = "CompanyDeletePayload";

    public static final String DeletedCompanyId = "deletedCompanyId";

    public static final String UserErrors = "userErrors";
  }

  public static class COMPANYEDGE {
    public static final String TYPE_NAME = "CompanyEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class COMPANYLOCATION {
    public static final String TYPE_NAME = "CompanyLocation";

    public static final String BillingAddress = "billingAddress";

    public static final String BuyerExperienceConfiguration = "buyerExperienceConfiguration";

    public static final String Catalogs = "catalogs";

    public static final String Company = "company";

    public static final String CreatedAt = "createdAt";

    public static final String Currency = "currency";

    public static final String DefaultCursor = "defaultCursor";

    public static final String DraftOrders = "draftOrders";

    public static final String Events = "events";

    public static final String ExternalId = "externalId";

    public static final String HasTimelineComment = "hasTimelineComment";

    public static final String Id = "id";

    public static final String InCatalog = "inCatalog";

    public static final String Locale = "locale";

    public static final String Market = "market";

    public static final String Metafield = "metafield";

    public static final String MetafieldDefinitions = "metafieldDefinitions";

    public static final String Metafields = "metafields";

    public static final String Name = "name";

    public static final String Note = "note";

    public static final String OrderCount = "orderCount";

    public static final String Orders = "orders";

    public static final String Phone = "phone";

    public static final String PrivateMetafield = "privateMetafield";

    public static final String PrivateMetafields = "privateMetafields";

    public static final String RoleAssignments = "roleAssignments";

    public static final String ShippingAddress = "shippingAddress";

    public static final String TaxExemptions = "taxExemptions";

    public static final String TaxRegistrationId = "taxRegistrationId";

    public static final String TotalSpent = "totalSpent";

    public static final String UpdatedAt = "updatedAt";

    public static class CATALOGS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class DRAFTORDERS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class EVENTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class INCATALOG_INPUT_ARGUMENT {
      public static final String CatalogId = "catalogId";
    }

    public static class METAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class METAFIELDDEFINITIONS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String PinnedStatus = "pinnedStatus";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class METAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Keys = "keys";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class ORDERS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";
    }

    public static class PRIVATEMETAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class PRIVATEMETAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class ROLEASSIGNMENTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }
  }

  public static class COMPANYLOCATIONASSIGNADDRESSPAYLOAD {
    public static final String TYPE_NAME = "CompanyLocationAssignAddressPayload";

    public static final String Addresses = "addresses";

    public static final String UserErrors = "userErrors";
  }

  public static class COMPANYLOCATIONASSIGNROLESPAYLOAD {
    public static final String TYPE_NAME = "CompanyLocationAssignRolesPayload";

    public static final String RoleAssignments = "roleAssignments";

    public static final String UserErrors = "userErrors";
  }

  public static class COMPANYLOCATIONASSIGNTAXEXEMPTIONSPAYLOAD {
    public static final String TYPE_NAME = "CompanyLocationAssignTaxExemptionsPayload";

    public static final String CompanyLocation = "companyLocation";

    public static final String UserErrors = "userErrors";
  }

  public static class COMPANYLOCATIONCATALOG {
    public static final String TYPE_NAME = "CompanyLocationCatalog";

    public static final String CompanyLocations = "companyLocations";

    public static final String CompanyLocationsCount = "companyLocationsCount";

    public static final String Id = "id";

    public static final String Operations = "operations";

    public static final String PriceList = "priceList";

    public static final String Publication = "publication";

    public static final String Status = "status";

    public static final String Title = "title";

    public static class COMPANYLOCATIONS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }
  }

  public static class COMPANYLOCATIONCONNECTION {
    public static final String TYPE_NAME = "CompanyLocationConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class COMPANYLOCATIONCREATEPAYLOAD {
    public static final String TYPE_NAME = "CompanyLocationCreatePayload";

    public static final String CompanyLocation = "companyLocation";

    public static final String UserErrors = "userErrors";
  }

  public static class COMPANYLOCATIONCREATETAXREGISTRATIONPAYLOAD {
    public static final String TYPE_NAME = "CompanyLocationCreateTaxRegistrationPayload";

    public static final String CompanyLocation = "companyLocation";

    public static final String UserErrors = "userErrors";
  }

  public static class COMPANYLOCATIONDELETEPAYLOAD {
    public static final String TYPE_NAME = "CompanyLocationDeletePayload";

    public static final String DeletedCompanyLocationId = "deletedCompanyLocationId";

    public static final String UserErrors = "userErrors";
  }

  public static class COMPANYLOCATIONEDGE {
    public static final String TYPE_NAME = "CompanyLocationEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class COMPANYLOCATIONREVOKEROLESPAYLOAD {
    public static final String TYPE_NAME = "CompanyLocationRevokeRolesPayload";

    public static final String RevokedRoleAssignmentIds = "revokedRoleAssignmentIds";

    public static final String UserErrors = "userErrors";
  }

  public static class COMPANYLOCATIONREVOKETAXEXEMPTIONSPAYLOAD {
    public static final String TYPE_NAME = "CompanyLocationRevokeTaxExemptionsPayload";

    public static final String CompanyLocation = "companyLocation";

    public static final String UserErrors = "userErrors";
  }

  public static class COMPANYLOCATIONREVOKETAXREGISTRATIONPAYLOAD {
    public static final String TYPE_NAME = "CompanyLocationRevokeTaxRegistrationPayload";

    public static final String CompanyLocation = "companyLocation";

    public static final String UserErrors = "userErrors";
  }

  public static class COMPANYLOCATIONSDELETEPAYLOAD {
    public static final String TYPE_NAME = "CompanyLocationsDeletePayload";

    public static final String DeletedCompanyLocationIds = "deletedCompanyLocationIds";

    public static final String UserErrors = "userErrors";
  }

  public static class COMPANYLOCATIONUPDATEPAYLOAD {
    public static final String TYPE_NAME = "CompanyLocationUpdatePayload";

    public static final String CompanyLocation = "companyLocation";

    public static final String UserErrors = "userErrors";
  }

  public static class COMPANYREVOKEMAINCONTACTPAYLOAD {
    public static final String TYPE_NAME = "CompanyRevokeMainContactPayload";

    public static final String Company = "company";

    public static final String UserErrors = "userErrors";
  }

  public static class COMPANYUPDATEPAYLOAD {
    public static final String TYPE_NAME = "CompanyUpdatePayload";

    public static final String Company = "company";

    public static final String UserErrors = "userErrors";
  }

  public static class COUNTRIESINSHIPPINGZONES {
    public static final String TYPE_NAME = "CountriesInShippingZones";

    public static final String CountryCodes = "countryCodes";

    public static final String IncludeRestOfWorld = "includeRestOfWorld";
  }

  public static class COUNTRYHARMONIZEDSYSTEMCODE {
    public static final String TYPE_NAME = "CountryHarmonizedSystemCode";

    public static final String CountryCode = "countryCode";

    public static final String HarmonizedSystemCode = "harmonizedSystemCode";
  }

  public static class COUNTRYHARMONIZEDSYSTEMCODECONNECTION {
    public static final String TYPE_NAME = "CountryHarmonizedSystemCodeConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class COUNTRYHARMONIZEDSYSTEMCODEEDGE {
    public static final String TYPE_NAME = "CountryHarmonizedSystemCodeEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class CURRENCYFORMATS {
    public static final String TYPE_NAME = "CurrencyFormats";

    public static final String MoneyFormat = "moneyFormat";

    public static final String MoneyInEmailsFormat = "moneyInEmailsFormat";

    public static final String MoneyWithCurrencyFormat = "moneyWithCurrencyFormat";

    public static final String MoneyWithCurrencyInEmailsFormat = "moneyWithCurrencyInEmailsFormat";
  }

  public static class CURRENCYSETTING {
    public static final String TYPE_NAME = "CurrencySetting";

    public static final String CurrencyCode = "currencyCode";

    public static final String CurrencyName = "currencyName";

    public static final String Enabled = "enabled";

    public static final String RateUpdatedAt = "rateUpdatedAt";
  }

  public static class CURRENCYSETTINGCONNECTION {
    public static final String TYPE_NAME = "CurrencySettingConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class CURRENCYSETTINGEDGE {
    public static final String TYPE_NAME = "CurrencySettingEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class CUSTOMER {
    public static final String TYPE_NAME = "Customer";

    public static final String Addresses = "addresses";

    public static final String AmountSpent = "amountSpent";

    public static final String CanDelete = "canDelete";

    public static final String CompanyContactProfiles = "companyContactProfiles";

    public static final String CreatedAt = "createdAt";

    public static final String DefaultAddress = "defaultAddress";

    public static final String DisplayName = "displayName";

    public static final String Email = "email";

    public static final String EmailMarketingConsent = "emailMarketingConsent";

    public static final String Events = "events";

    public static final String FirstName = "firstName";

    public static final String HasTimelineComment = "hasTimelineComment";

    public static final String Id = "id";

    public static final String Image = "image";

    public static final String LastName = "lastName";

    public static final String LastOrder = "lastOrder";

    public static final String LegacyResourceId = "legacyResourceId";

    public static final String LifetimeDuration = "lifetimeDuration";

    public static final String Locale = "locale";

    public static final String Market = "market";

    public static final String Mergeable = "mergeable";

    public static final String Metafield = "metafield";

    public static final String MetafieldDefinitions = "metafieldDefinitions";

    public static final String Metafields = "metafields";

    public static final String MultipassIdentifier = "multipassIdentifier";

    public static final String Note = "note";

    public static final String NumberOfOrders = "numberOfOrders";

    public static final String Orders = "orders";

    public static final String PaymentMethods = "paymentMethods";

    public static final String Phone = "phone";

    public static final String PrivateMetafield = "privateMetafield";

    public static final String PrivateMetafields = "privateMetafields";

    public static final String ProductSubscriberStatus = "productSubscriberStatus";

    public static final String SmsMarketingConsent = "smsMarketingConsent";

    public static final String State = "state";

    public static final String Statistics = "statistics";

    public static final String SubscriptionContracts = "subscriptionContracts";

    public static final String Tags = "tags";

    public static final String TaxExempt = "taxExempt";

    public static final String TaxExemptions = "taxExemptions";

    public static final String UnsubscribeUrl = "unsubscribeUrl";

    public static final String UpdatedAt = "updatedAt";

    public static final String ValidEmailAddress = "validEmailAddress";

    public static final String VerifiedEmail = "verifiedEmail";

    public static class ADDRESSES_INPUT_ARGUMENT {
      public static final String First = "first";
    }

    public static class EVENTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class METAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class METAFIELDDEFINITIONS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String PinnedStatus = "pinnedStatus";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class METAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Keys = "keys";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class ORDERS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class PAYMENTMETHODS_INPUT_ARGUMENT {
      public static final String ShowRevoked = "showRevoked";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PRIVATEMETAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class PRIVATEMETAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class SUBSCRIPTIONCONTRACTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class CUSTOMERACCOUNTSV2 {
    public static final String TYPE_NAME = "CustomerAccountsV2";

    public static final String CustomerAccountsVersion = "customerAccountsVersion";

    public static final String LoginLinksVisibleOnStorefrontAndCheckout = "loginLinksVisibleOnStorefrontAndCheckout";

    public static final String LoginRequiredAtCheckout = "loginRequiredAtCheckout";

    public static final String Url = "url";
  }

  public static class CUSTOMERADDTAXEXEMPTIONSPAYLOAD {
    public static final String TYPE_NAME = "CustomerAddTaxExemptionsPayload";

    public static final String Customer = "customer";

    public static final String UserErrors = "userErrors";
  }

  public static class CUSTOMERCANCELDATAERASUREPAYLOAD {
    public static final String TYPE_NAME = "CustomerCancelDataErasurePayload";

    public static final String CustomerId = "customerId";

    public static final String UserErrors = "userErrors";
  }

  public static class CUSTOMERCANCELDATAERASUREUSERERROR {
    public static final String TYPE_NAME = "CustomerCancelDataErasureUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class CUSTOMERCONNECTION {
    public static final String TYPE_NAME = "CustomerConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class CUSTOMERCREATEPAYLOAD {
    public static final String TYPE_NAME = "CustomerCreatePayload";

    public static final String Customer = "customer";

    public static final String UserErrors = "userErrors";
  }

  public static class CUSTOMERCREDITCARD {
    public static final String TYPE_NAME = "CustomerCreditCard";

    public static final String BillingAddress = "billingAddress";

    public static final String Brand = "brand";

    public static final String ExpiresSoon = "expiresSoon";

    public static final String ExpiryMonth = "expiryMonth";

    public static final String ExpiryYear = "expiryYear";

    public static final String FirstDigits = "firstDigits";

    public static final String IsRevocable = "isRevocable";

    public static final String LastDigits = "lastDigits";

    public static final String MaskedNumber = "maskedNumber";

    public static final String Name = "name";

    public static final String Source = "source";

    public static final String VirtualLastDigits = "virtualLastDigits";
  }

  public static class CUSTOMERCREDITCARDBILLINGADDRESS {
    public static final String TYPE_NAME = "CustomerCreditCardBillingAddress";

    public static final String Address1 = "address1";

    public static final String City = "city";

    public static final String Country = "country";

    public static final String CountryCode = "countryCode";

    public static final String FirstName = "firstName";

    public static final String LastName = "lastName";

    public static final String Province = "province";

    public static final String ProvinceCode = "provinceCode";

    public static final String Zip = "zip";
  }

  public static class CUSTOMERDELETEPAYLOAD {
    public static final String TYPE_NAME = "CustomerDeletePayload";

    public static final String DeletedCustomerId = "deletedCustomerId";

    public static final String Shop = "shop";

    public static final String UserErrors = "userErrors";
  }

  public static class CUSTOMEREDGE {
    public static final String TYPE_NAME = "CustomerEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class CUSTOMEREMAILADDRESS {
    public static final String TYPE_NAME = "CustomerEmailAddress";

    public static final String EmailAddress = "emailAddress";

    public static final String MarketingState = "marketingState";

    public static final String MarketingUnsubscribeUrl = "marketingUnsubscribeUrl";

    public static final String OpenTrackingLevel = "openTrackingLevel";

    public static final String OpenTrackingUrl = "openTrackingUrl";
  }

  public static class CUSTOMEREMAILMARKETINGCONSENTSTATE {
    public static final String TYPE_NAME = "CustomerEmailMarketingConsentState";

    public static final String ConsentUpdatedAt = "consentUpdatedAt";

    public static final String MarketingOptInLevel = "marketingOptInLevel";

    public static final String MarketingState = "marketingState";
  }

  public static class CUSTOMEREMAILMARKETINGCONSENTUPDATEPAYLOAD {
    public static final String TYPE_NAME = "CustomerEmailMarketingConsentUpdatePayload";

    public static final String Customer = "customer";

    public static final String UserErrors = "userErrors";
  }

  public static class CUSTOMEREMAILMARKETINGCONSENTUPDATEUSERERROR {
    public static final String TYPE_NAME = "CustomerEmailMarketingConsentUpdateUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class CUSTOMERGENERATEACCOUNTACTIVATIONURLPAYLOAD {
    public static final String TYPE_NAME = "CustomerGenerateAccountActivationUrlPayload";

    public static final String AccountActivationUrl = "accountActivationUrl";

    public static final String UserErrors = "userErrors";
  }

  public static class CUSTOMERJOURNEY {
    public static final String TYPE_NAME = "CustomerJourney";

    public static final String CustomerOrderIndex = "customerOrderIndex";

    public static final String DaysToConversion = "daysToConversion";

    public static final String FirstVisit = "firstVisit";

    public static final String LastVisit = "lastVisit";

    public static final String Moments = "moments";
  }

  public static class CUSTOMERJOURNEYSUMMARY {
    public static final String TYPE_NAME = "CustomerJourneySummary";

    public static final String CustomerOrderIndex = "customerOrderIndex";

    public static final String DaysToConversion = "daysToConversion";

    public static final String FirstVisit = "firstVisit";

    public static final String LastVisit = "lastVisit";

    public static final String Moments = "moments";

    public static final String MomentsCount = "momentsCount";

    public static final String Ready = "ready";

    public static class MOMENTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class CUSTOMERMERGEABLE {
    public static final String TYPE_NAME = "CustomerMergeable";

    public static final String ErrorFields = "errorFields";

    public static final String IsMergeable = "isMergeable";

    public static final String MergeInProgress = "mergeInProgress";

    public static final String Reason = "reason";
  }

  public static class CUSTOMERMERGEERROR {
    public static final String TYPE_NAME = "CustomerMergeError";

    public static final String ErrorFields = "errorFields";

    public static final String Message = "message";
  }

  public static class CUSTOMERMERGEPAYLOAD {
    public static final String TYPE_NAME = "CustomerMergePayload";

    public static final String Job = "job";

    public static final String ResultingCustomerId = "resultingCustomerId";

    public static final String UserErrors = "userErrors";
  }

  public static class CUSTOMERMERGEPREVIEW {
    public static final String TYPE_NAME = "CustomerMergePreview";

    public static final String AlternateFields = "alternateFields";

    public static final String BlockingFields = "blockingFields";

    public static final String CustomerMergeErrors = "customerMergeErrors";

    public static final String DefaultFields = "defaultFields";

    public static final String ResultingCustomerId = "resultingCustomerId";
  }

  public static class CUSTOMERMERGEPREVIEWALTERNATEFIELDS {
    public static final String TYPE_NAME = "CustomerMergePreviewAlternateFields";

    public static final String DefaultAddress = "defaultAddress";

    public static final String Email = "email";

    public static final String FirstName = "firstName";

    public static final String LastName = "lastName";

    public static final String PhoneNumber = "phoneNumber";
  }

  public static class CUSTOMERMERGEPREVIEWBLOCKINGFIELDS {
    public static final String TYPE_NAME = "CustomerMergePreviewBlockingFields";

    public static final String Note = "note";

    public static final String Tags = "tags";
  }

  public static class CUSTOMERMERGEPREVIEWDEFAULTFIELDS {
    public static final String TYPE_NAME = "CustomerMergePreviewDefaultFields";

    public static final String Addresses = "addresses";

    public static final String DefaultAddress = "defaultAddress";

    public static final String DiscountNodeCount = "discountNodeCount";

    public static final String DiscountNodes = "discountNodes";

    public static final String DisplayName = "displayName";

    public static final String DraftOrderCount = "draftOrderCount";

    public static final String DraftOrders = "draftOrders";

    public static final String Email = "email";

    public static final String FirstName = "firstName";

    public static final String GiftCardCount = "giftCardCount";

    public static final String GiftCards = "giftCards";

    public static final String LastName = "lastName";

    public static final String MetafieldCount = "metafieldCount";

    public static final String Note = "note";

    public static final String OrderCount = "orderCount";

    public static final String Orders = "orders";

    public static final String PhoneNumber = "phoneNumber";

    public static final String Tags = "tags";

    public static class ADDRESSES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class DISCOUNTNODES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";
    }

    public static class DRAFTORDERS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";
    }

    public static class GIFTCARDS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";
    }

    public static class ORDERS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";
    }
  }

  public static class CUSTOMERMERGEREQUEST {
    public static final String TYPE_NAME = "CustomerMergeRequest";

    public static final String CustomerMergeErrors = "customerMergeErrors";

    public static final String JobId = "jobId";

    public static final String ResultingCustomerId = "resultingCustomerId";

    public static final String Status = "status";
  }

  public static class CUSTOMERMERGEUSERERROR {
    public static final String TYPE_NAME = "CustomerMergeUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class CUSTOMERMOMENTCONNECTION {
    public static final String TYPE_NAME = "CustomerMomentConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class CUSTOMERMOMENTEDGE {
    public static final String TYPE_NAME = "CustomerMomentEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class CUSTOMERPAYMENTINSTRUMENTBILLINGADDRESS {
    public static final String TYPE_NAME = "CustomerPaymentInstrumentBillingAddress";

    public static final String Address1 = "address1";

    public static final String City = "city";

    public static final String Country = "country";

    public static final String CountryCode = "countryCode";

    public static final String Name = "name";

    public static final String Province = "province";

    public static final String ProvinceCode = "provinceCode";

    public static final String Zip = "zip";
  }

  public static class CUSTOMERPAYMENTMETHOD {
    public static final String TYPE_NAME = "CustomerPaymentMethod";

    public static final String Customer = "customer";

    public static final String Id = "id";

    public static final String Instrument = "instrument";

    public static final String RevokedAt = "revokedAt";

    public static final String RevokedReason = "revokedReason";

    public static final String SubscriptionContracts = "subscriptionContracts";

    public static class SUBSCRIPTIONCONTRACTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class CUSTOMERPAYMENTMETHODCONNECTION {
    public static final String TYPE_NAME = "CustomerPaymentMethodConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class CUSTOMERPAYMENTMETHODCREATEFROMDUPLICATIONDATAPAYLOAD {
    public static final String TYPE_NAME = "CustomerPaymentMethodCreateFromDuplicationDataPayload";

    public static final String CustomerPaymentMethod = "customerPaymentMethod";

    public static final String UserErrors = "userErrors";
  }

  public static class CUSTOMERPAYMENTMETHODCREATEFROMDUPLICATIONDATAUSERERROR {
    public static final String TYPE_NAME = "CustomerPaymentMethodCreateFromDuplicationDataUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class CUSTOMERPAYMENTMETHODCREDITCARDCREATEPAYLOAD {
    public static final String TYPE_NAME = "CustomerPaymentMethodCreditCardCreatePayload";

    public static final String CustomerPaymentMethod = "customerPaymentMethod";

    public static final String Processing = "processing";

    public static final String UserErrors = "userErrors";
  }

  public static class CUSTOMERPAYMENTMETHODCREDITCARDUPDATEPAYLOAD {
    public static final String TYPE_NAME = "CustomerPaymentMethodCreditCardUpdatePayload";

    public static final String CustomerPaymentMethod = "customerPaymentMethod";

    public static final String Processing = "processing";

    public static final String UserErrors = "userErrors";
  }

  public static class CUSTOMERPAYMENTMETHODEDGE {
    public static final String TYPE_NAME = "CustomerPaymentMethodEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class CUSTOMERPAYMENTMETHODGETDUPLICATIONDATAPAYLOAD {
    public static final String TYPE_NAME = "CustomerPaymentMethodGetDuplicationDataPayload";

    public static final String EncryptedDuplicationData = "encryptedDuplicationData";

    public static final String UserErrors = "userErrors";
  }

  public static class CUSTOMERPAYMENTMETHODGETDUPLICATIONDATAUSERERROR {
    public static final String TYPE_NAME = "CustomerPaymentMethodGetDuplicationDataUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class CUSTOMERPAYMENTMETHODGETUPDATEURLPAYLOAD {
    public static final String TYPE_NAME = "CustomerPaymentMethodGetUpdateUrlPayload";

    public static final String UpdatePaymentMethodUrl = "updatePaymentMethodUrl";

    public static final String UserErrors = "userErrors";
  }

  public static class CUSTOMERPAYMENTMETHODGETUPDATEURLUSERERROR {
    public static final String TYPE_NAME = "CustomerPaymentMethodGetUpdateUrlUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class CUSTOMERPAYMENTMETHODPAYPALBILLINGAGREEMENTCREATEPAYLOAD {
    public static final String TYPE_NAME = "CustomerPaymentMethodPaypalBillingAgreementCreatePayload";

    public static final String CustomerPaymentMethod = "customerPaymentMethod";

    public static final String UserErrors = "userErrors";
  }

  public static class CUSTOMERPAYMENTMETHODPAYPALBILLINGAGREEMENTUPDATEPAYLOAD {
    public static final String TYPE_NAME = "CustomerPaymentMethodPaypalBillingAgreementUpdatePayload";

    public static final String CustomerPaymentMethod = "customerPaymentMethod";

    public static final String UserErrors = "userErrors";
  }

  public static class CUSTOMERPAYMENTMETHODREMOTECREATEPAYLOAD {
    public static final String TYPE_NAME = "CustomerPaymentMethodRemoteCreatePayload";

    public static final String CustomerPaymentMethod = "customerPaymentMethod";

    public static final String UserErrors = "userErrors";
  }

  public static class CUSTOMERPAYMENTMETHODREMOTECREDITCARDCREATEPAYLOAD {
    public static final String TYPE_NAME = "CustomerPaymentMethodRemoteCreditCardCreatePayload";

    public static final String CustomerPaymentMethod = "customerPaymentMethod";

    public static final String UserErrors = "userErrors";
  }

  public static class CUSTOMERPAYMENTMETHODREMOTEUSERERROR {
    public static final String TYPE_NAME = "CustomerPaymentMethodRemoteUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class CUSTOMERPAYMENTMETHODREVOKEPAYLOAD {
    public static final String TYPE_NAME = "CustomerPaymentMethodRevokePayload";

    public static final String RevokedCustomerPaymentMethodId = "revokedCustomerPaymentMethodId";

    public static final String UserErrors = "userErrors";
  }

  public static class CUSTOMERPAYMENTMETHODSENDUPDATEEMAILPAYLOAD {
    public static final String TYPE_NAME = "CustomerPaymentMethodSendUpdateEmailPayload";

    public static final String Customer = "customer";

    public static final String UserErrors = "userErrors";
  }

  public static class CUSTOMERPAYMENTMETHODUSERERROR {
    public static final String TYPE_NAME = "CustomerPaymentMethodUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class CUSTOMERPAYPALBILLINGAGREEMENT {
    public static final String TYPE_NAME = "CustomerPaypalBillingAgreement";

    public static final String BillingAddress = "billingAddress";

    public static final String Inactive = "inactive";

    public static final String IsRevocable = "isRevocable";

    public static final String PaypalAccountEmail = "paypalAccountEmail";
  }

  public static class CUSTOMERPHONENUMBER {
    public static final String TYPE_NAME = "CustomerPhoneNumber";

    public static final String MarketingState = "marketingState";

    public static final String PhoneNumber = "phoneNumber";
  }

  public static class CUSTOMERREMOVETAXEXEMPTIONSPAYLOAD {
    public static final String TYPE_NAME = "CustomerRemoveTaxExemptionsPayload";

    public static final String Customer = "customer";

    public static final String UserErrors = "userErrors";
  }

  public static class CUSTOMERREPLACETAXEXEMPTIONSPAYLOAD {
    public static final String TYPE_NAME = "CustomerReplaceTaxExemptionsPayload";

    public static final String Customer = "customer";

    public static final String UserErrors = "userErrors";
  }

  public static class CUSTOMERREQUESTDATAERASUREPAYLOAD {
    public static final String TYPE_NAME = "CustomerRequestDataErasurePayload";

    public static final String CustomerId = "customerId";

    public static final String UserErrors = "userErrors";
  }

  public static class CUSTOMERREQUESTDATAERASUREUSERERROR {
    public static final String TYPE_NAME = "CustomerRequestDataErasureUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class CUSTOMERSEGMENTMEMBER {
    public static final String TYPE_NAME = "CustomerSegmentMember";

    public static final String AmountSpent = "amountSpent";

    public static final String DefaultAddress = "defaultAddress";

    public static final String DefaultEmailAddress = "defaultEmailAddress";

    public static final String DefaultPhoneNumber = "defaultPhoneNumber";

    public static final String DisplayName = "displayName";

    public static final String FirstName = "firstName";

    public static final String Id = "id";

    public static final String LastName = "lastName";

    public static final String LastOrderId = "lastOrderId";

    public static final String Mergeable = "mergeable";

    public static final String Metafield = "metafield";

    public static final String Metafields = "metafields";

    public static final String Note = "note";

    public static final String NumberOfOrders = "numberOfOrders";

    public static final String PrivateMetafield = "privateMetafield";

    public static final String PrivateMetafields = "privateMetafields";

    public static class METAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class METAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Keys = "keys";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PRIVATEMETAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class PRIVATEMETAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class CUSTOMERSEGMENTMEMBERCONNECTION {
    public static final String TYPE_NAME = "CustomerSegmentMemberConnection";

    public static final String Edges = "edges";

    public static final String PageInfo = "pageInfo";

    public static final String Statistics = "statistics";

    public static final String TotalCount = "totalCount";
  }

  public static class CUSTOMERSEGMENTMEMBEREDGE {
    public static final String TYPE_NAME = "CustomerSegmentMemberEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class CUSTOMERSEGMENTMEMBERSQUERY {
    public static final String TYPE_NAME = "CustomerSegmentMembersQuery";

    public static final String CurrentCount = "currentCount";

    public static final String Done = "done";

    public static final String Id = "id";
  }

  public static class CUSTOMERSEGMENTMEMBERSQUERYCREATEPAYLOAD {
    public static final String TYPE_NAME = "CustomerSegmentMembersQueryCreatePayload";

    public static final String CustomerSegmentMembersQuery = "customerSegmentMembersQuery";

    public static final String UserErrors = "userErrors";
  }

  public static class CUSTOMERSEGMENTMEMBERSQUERYUSERERROR {
    public static final String TYPE_NAME = "CustomerSegmentMembersQueryUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class CUSTOMERSHOPPAYAGREEMENT {
    public static final String TYPE_NAME = "CustomerShopPayAgreement";

    public static final String BillingAddress = "billingAddress";

    public static final String ExpiresSoon = "expiresSoon";

    public static final String ExpiryMonth = "expiryMonth";

    public static final String ExpiryYear = "expiryYear";

    public static final String Inactive = "inactive";

    public static final String IsRevocable = "isRevocable";

    public static final String LastDigits = "lastDigits";

    public static final String MaskedNumber = "maskedNumber";

    public static final String Name = "name";
  }

  public static class CUSTOMERSMSMARKETINGCONSENTERROR {
    public static final String TYPE_NAME = "CustomerSmsMarketingConsentError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class CUSTOMERSMSMARKETINGCONSENTSTATE {
    public static final String TYPE_NAME = "CustomerSmsMarketingConsentState";

    public static final String ConsentCollectedFrom = "consentCollectedFrom";

    public static final String ConsentUpdatedAt = "consentUpdatedAt";

    public static final String MarketingOptInLevel = "marketingOptInLevel";

    public static final String MarketingState = "marketingState";
  }

  public static class CUSTOMERSMSMARKETINGCONSENTUPDATEPAYLOAD {
    public static final String TYPE_NAME = "CustomerSmsMarketingConsentUpdatePayload";

    public static final String Customer = "customer";

    public static final String UserErrors = "userErrors";
  }

  public static class CUSTOMERSTATISTICS {
    public static final String TYPE_NAME = "CustomerStatistics";

    public static final String PredictedSpendTier = "predictedSpendTier";
  }

  public static class CUSTOMERUPDATEDEFAULTADDRESSPAYLOAD {
    public static final String TYPE_NAME = "CustomerUpdateDefaultAddressPayload";

    public static final String Customer = "customer";

    public static final String UserErrors = "userErrors";
  }

  public static class CUSTOMERUPDATEPAYLOAD {
    public static final String TYPE_NAME = "CustomerUpdatePayload";

    public static final String Customer = "customer";

    public static final String UserErrors = "userErrors";
  }

  public static class CUSTOMERVISIT {
    public static final String TYPE_NAME = "CustomerVisit";

    public static final String Id = "id";

    public static final String LandingPage = "landingPage";

    public static final String LandingPageHtml = "landingPageHtml";

    public static final String MarketingEvent = "marketingEvent";

    public static final String OccurredAt = "occurredAt";

    public static final String ReferralCode = "referralCode";

    public static final String ReferralInfoHtml = "referralInfoHtml";

    public static final String ReferrerUrl = "referrerUrl";

    public static final String Source = "source";

    public static final String SourceDescription = "sourceDescription";

    public static final String SourceType = "sourceType";

    public static final String UtmParameters = "utmParameters";
  }

  public static class CUSTOMERVISITPRODUCTINFO {
    public static final String TYPE_NAME = "CustomerVisitProductInfo";

    public static final String Product = "product";

    public static final String Quantity = "quantity";

    public static final String Variant = "variant";
  }

  public static class CUSTOMERVISITPRODUCTINFOCONNECTION {
    public static final String TYPE_NAME = "CustomerVisitProductInfoConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class CUSTOMERVISITPRODUCTINFOEDGE {
    public static final String TYPE_NAME = "CustomerVisitProductInfoEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class DELEGATEACCESSTOKEN {
    public static final String TYPE_NAME = "DelegateAccessToken";

    public static final String AccessScopes = "accessScopes";

    public static final String AccessToken = "accessToken";

    public static final String CreatedAt = "createdAt";
  }

  public static class DELEGATEACCESSTOKENCREATEPAYLOAD {
    public static final String TYPE_NAME = "DelegateAccessTokenCreatePayload";

    public static final String DelegateAccessToken = "delegateAccessToken";

    public static final String Shop = "shop";

    public static final String UserErrors = "userErrors";
  }

  public static class DELEGATEACCESSTOKENCREATEUSERERROR {
    public static final String TYPE_NAME = "DelegateAccessTokenCreateUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class DELEGATEACCESSTOKENDESTROYPAYLOAD {
    public static final String TYPE_NAME = "DelegateAccessTokenDestroyPayload";

    public static final String Shop = "shop";

    public static final String Status = "status";

    public static final String UserErrors = "userErrors";
  }

  public static class DELEGATEACCESSTOKENDESTROYUSERERROR {
    public static final String TYPE_NAME = "DelegateAccessTokenDestroyUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class DELETIONEVENT {
    public static final String TYPE_NAME = "DeletionEvent";

    public static final String OccurredAt = "occurredAt";

    public static final String SubjectId = "subjectId";

    public static final String SubjectType = "subjectType";
  }

  public static class DELETIONEVENTCONNECTION {
    public static final String TYPE_NAME = "DeletionEventConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class DELETIONEVENTEDGE {
    public static final String TYPE_NAME = "DeletionEventEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class DELIVERYAVAILABLESERVICE {
    public static final String TYPE_NAME = "DeliveryAvailableService";

    public static final String Countries = "countries";

    public static final String Name = "name";
  }

  public static class DELIVERYBRANDEDPROMISE {
    public static final String TYPE_NAME = "DeliveryBrandedPromise";

    public static final String Handle = "handle";

    public static final String Name = "name";
  }

  public static class DELIVERYCARRIERSERVICE {
    public static final String TYPE_NAME = "DeliveryCarrierService";

    public static final String AvailableServicesForCountries = "availableServicesForCountries";

    public static final String FormattedName = "formattedName";

    public static final String Icon = "icon";

    public static final String Id = "id";

    public static final String Name = "name";

    public static class AVAILABLESERVICESFORCOUNTRIES_INPUT_ARGUMENT {
      public static final String Origins = "origins";

      public static final String CountryCodes = "countryCodes";

      public static final String RestOfWorld = "restOfWorld";
    }
  }

  public static class DELIVERYCARRIERSERVICEANDLOCATIONS {
    public static final String TYPE_NAME = "DeliveryCarrierServiceAndLocations";

    public static final String CarrierService = "carrierService";

    public static final String Locations = "locations";
  }

  public static class DELIVERYCONDITION {
    public static final String TYPE_NAME = "DeliveryCondition";

    public static final String ConditionCriteria = "conditionCriteria";

    public static final String Field = "field";

    public static final String Id = "id";

    public static final String Operator = "operator";
  }

  public static class DELIVERYCOUNTRY {
    public static final String TYPE_NAME = "DeliveryCountry";

    public static final String Code = "code";

    public static final String Id = "id";

    public static final String Name = "name";

    public static final String Provinces = "provinces";

    public static final String TranslatedName = "translatedName";
  }

  public static class DELIVERYCOUNTRYANDZONE {
    public static final String TYPE_NAME = "DeliveryCountryAndZone";

    public static final String Country = "country";

    public static final String Zone = "zone";
  }

  public static class DELIVERYCOUNTRYCODEORRESTOFWORLD {
    public static final String TYPE_NAME = "DeliveryCountryCodeOrRestOfWorld";

    public static final String CountryCode = "countryCode";

    public static final String RestOfWorld = "restOfWorld";
  }

  public static class DELIVERYCOUNTRYCODESORRESTOFWORLD {
    public static final String TYPE_NAME = "DeliveryCountryCodesOrRestOfWorld";

    public static final String CountryCodes = "countryCodes";

    public static final String RestOfWorld = "restOfWorld";
  }

  public static class DELIVERYCUSTOMIZATION {
    public static final String TYPE_NAME = "DeliveryCustomization";

    public static final String Enabled = "enabled";

    public static final String ErrorHistory = "errorHistory";

    public static final String FunctionId = "functionId";

    public static final String Id = "id";

    public static final String Metafield = "metafield";

    public static final String MetafieldDefinitions = "metafieldDefinitions";

    public static final String Metafields = "metafields";

    public static final String PrivateMetafield = "privateMetafield";

    public static final String PrivateMetafields = "privateMetafields";

    public static final String ShopifyFunction = "shopifyFunction";

    public static final String Title = "title";

    public static class METAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class METAFIELDDEFINITIONS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String PinnedStatus = "pinnedStatus";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class METAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Keys = "keys";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PRIVATEMETAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class PRIVATEMETAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class DELIVERYCUSTOMIZATIONACTIVATIONPAYLOAD {
    public static final String TYPE_NAME = "DeliveryCustomizationActivationPayload";

    public static final String Ids = "ids";

    public static final String UserErrors = "userErrors";
  }

  public static class DELIVERYCUSTOMIZATIONCONNECTION {
    public static final String TYPE_NAME = "DeliveryCustomizationConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class DELIVERYCUSTOMIZATIONCREATEPAYLOAD {
    public static final String TYPE_NAME = "DeliveryCustomizationCreatePayload";

    public static final String DeliveryCustomization = "deliveryCustomization";

    public static final String UserErrors = "userErrors";
  }

  public static class DELIVERYCUSTOMIZATIONDELETEPAYLOAD {
    public static final String TYPE_NAME = "DeliveryCustomizationDeletePayload";

    public static final String DeletedId = "deletedId";

    public static final String UserErrors = "userErrors";
  }

  public static class DELIVERYCUSTOMIZATIONEDGE {
    public static final String TYPE_NAME = "DeliveryCustomizationEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class DELIVERYCUSTOMIZATIONERROR {
    public static final String TYPE_NAME = "DeliveryCustomizationError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class DELIVERYCUSTOMIZATIONUPDATEPAYLOAD {
    public static final String TYPE_NAME = "DeliveryCustomizationUpdatePayload";

    public static final String DeliveryCustomization = "deliveryCustomization";

    public static final String UserErrors = "userErrors";
  }

  public static class DELIVERYLEGACYMODEBLOCKED {
    public static final String TYPE_NAME = "DeliveryLegacyModeBlocked";

    public static final String Blocked = "blocked";

    public static final String Reasons = "reasons";
  }

  public static class DELIVERYLOCALPICKUPSETTINGS {
    public static final String TYPE_NAME = "DeliveryLocalPickupSettings";

    public static final String Instructions = "instructions";

    public static final String PickupTime = "pickupTime";
  }

  public static class DELIVERYLOCATIONGROUP {
    public static final String TYPE_NAME = "DeliveryLocationGroup";

    public static final String Id = "id";

    public static final String Locations = "locations";

    public static final String LocationsCount = "locationsCount";

    public static class LOCATIONS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";

      public static final String IncludeLegacy = "includeLegacy";

      public static final String IncludeInactive = "includeInactive";
    }
  }

  public static class DELIVERYLOCATIONGROUPZONE {
    public static final String TYPE_NAME = "DeliveryLocationGroupZone";

    public static final String MethodDefinitionCounts = "methodDefinitionCounts";

    public static final String MethodDefinitions = "methodDefinitions";

    public static final String Zone = "zone";

    public static class METHODDEFINITIONS_INPUT_ARGUMENT {
      public static final String Eligible = "eligible";

      public static final String Type = "type";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";
    }
  }

  public static class DELIVERYLOCATIONGROUPZONECONNECTION {
    public static final String TYPE_NAME = "DeliveryLocationGroupZoneConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class DELIVERYLOCATIONGROUPZONEEDGE {
    public static final String TYPE_NAME = "DeliveryLocationGroupZoneEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class DELIVERYLOCATIONLOCALPICKUPSETTINGSERROR {
    public static final String TYPE_NAME = "DeliveryLocationLocalPickupSettingsError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class DELIVERYMETHOD {
    public static final String TYPE_NAME = "DeliveryMethod";

    public static final String BrandedPromise = "brandedPromise";

    public static final String Id = "id";

    public static final String MaxDeliveryDateTime = "maxDeliveryDateTime";

    public static final String MethodType = "methodType";

    public static final String MinDeliveryDateTime = "minDeliveryDateTime";

    public static final String ServiceCode = "serviceCode";
  }

  public static class DELIVERYMETHODDEFINITION {
    public static final String TYPE_NAME = "DeliveryMethodDefinition";

    public static final String Active = "active";

    public static final String Description = "description";

    public static final String Id = "id";

    public static final String MethodConditions = "methodConditions";

    public static final String Name = "name";

    public static final String RateProvider = "rateProvider";
  }

  public static class DELIVERYMETHODDEFINITIONCONNECTION {
    public static final String TYPE_NAME = "DeliveryMethodDefinitionConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class DELIVERYMETHODDEFINITIONCOUNTS {
    public static final String TYPE_NAME = "DeliveryMethodDefinitionCounts";

    public static final String ParticipantDefinitionsCount = "participantDefinitionsCount";

    public static final String RateDefinitionsCount = "rateDefinitionsCount";
  }

  public static class DELIVERYMETHODDEFINITIONEDGE {
    public static final String TYPE_NAME = "DeliveryMethodDefinitionEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class DELIVERYPARTICIPANT {
    public static final String TYPE_NAME = "DeliveryParticipant";

    public static final String AdaptToNewServicesFlag = "adaptToNewServicesFlag";

    public static final String CarrierService = "carrierService";

    public static final String FixedFee = "fixedFee";

    public static final String Id = "id";

    public static final String ParticipantServices = "participantServices";

    public static final String PercentageOfRateFee = "percentageOfRateFee";
  }

  public static class DELIVERYPARTICIPANTSERVICE {
    public static final String TYPE_NAME = "DeliveryParticipantService";

    public static final String Active = "active";

    public static final String Name = "name";
  }

  public static class DELIVERYPRODUCTVARIANTSCOUNT {
    public static final String TYPE_NAME = "DeliveryProductVariantsCount";

    public static final String Capped = "capped";

    public static final String Count = "count";
  }

  public static class DELIVERYPROFILE {
    public static final String TYPE_NAME = "DeliveryProfile";

    public static final String ActiveMethodDefinitionsCount = "activeMethodDefinitionsCount";

    public static final String Default = "default";

    public static final String Id = "id";

    public static final String LegacyMode = "legacyMode";

    public static final String LocationsWithoutRatesCount = "locationsWithoutRatesCount";

    public static final String Name = "name";

    public static final String OriginLocationCount = "originLocationCount";

    public static final String ProductVariantsCount = "productVariantsCount";

    public static final String ProductVariantsCountV2 = "productVariantsCountV2";

    public static final String ProfileItems = "profileItems";

    public static final String ProfileLocationGroups = "profileLocationGroups";

    public static final String SellingPlanGroups = "sellingPlanGroups";

    public static final String UnassignedLocations = "unassignedLocations";

    public static final String UnassignedLocationsPaginated = "unassignedLocationsPaginated";

    public static final String ZoneCountryCount = "zoneCountryCount";

    public static class PROFILEITEMS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PROFILELOCATIONGROUPS_INPUT_ARGUMENT {
      public static final String LocationGroupId = "locationGroupId";
    }

    public static class SELLINGPLANGROUPS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class UNASSIGNEDLOCATIONSPAGINATED_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class DELIVERYPROFILECONNECTION {
    public static final String TYPE_NAME = "DeliveryProfileConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class DELIVERYPROFILECREATEPAYLOAD {
    public static final String TYPE_NAME = "DeliveryProfileCreatePayload";

    public static final String Profile = "profile";

    public static final String UserErrors = "userErrors";
  }

  public static class DELIVERYPROFILEEDGE {
    public static final String TYPE_NAME = "DeliveryProfileEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class DELIVERYPROFILEITEM {
    public static final String TYPE_NAME = "DeliveryProfileItem";

    public static final String Id = "id";

    public static final String Product = "product";

    public static final String Variants = "variants";

    public static class VARIANTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class DELIVERYPROFILEITEMCONNECTION {
    public static final String TYPE_NAME = "DeliveryProfileItemConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class DELIVERYPROFILEITEMEDGE {
    public static final String TYPE_NAME = "DeliveryProfileItemEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class DELIVERYPROFILELOCATIONGROUP {
    public static final String TYPE_NAME = "DeliveryProfileLocationGroup";

    public static final String CountriesInAnyZone = "countriesInAnyZone";

    public static final String LocationGroup = "locationGroup";

    public static final String LocationGroupZones = "locationGroupZones";

    public static class LOCATIONGROUPZONES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class DELIVERYPROFILEREMOVEPAYLOAD {
    public static final String TYPE_NAME = "DeliveryProfileRemovePayload";

    public static final String Job = "job";

    public static final String UserErrors = "userErrors";
  }

  public static class DELIVERYPROFILEUPDATEPAYLOAD {
    public static final String TYPE_NAME = "DeliveryProfileUpdatePayload";

    public static final String Profile = "profile";

    public static final String UserErrors = "userErrors";
  }

  public static class DELIVERYPROVINCE {
    public static final String TYPE_NAME = "DeliveryProvince";

    public static final String Code = "code";

    public static final String Id = "id";

    public static final String Name = "name";

    public static final String TranslatedName = "translatedName";
  }

  public static class DELIVERYRATEDEFINITION {
    public static final String TYPE_NAME = "DeliveryRateDefinition";

    public static final String Id = "id";

    public static final String Price = "price";
  }

  public static class DELIVERYSETTING {
    public static final String TYPE_NAME = "DeliverySetting";

    public static final String LegacyModeBlocked = "legacyModeBlocked";

    public static final String LegacyModeProfiles = "legacyModeProfiles";
  }

  public static class DELIVERYSETTINGUPDATEPAYLOAD {
    public static final String TYPE_NAME = "DeliverySettingUpdatePayload";

    public static final String Setting = "setting";

    public static final String UserErrors = "userErrors";
  }

  public static class DELIVERYSHIPPINGORIGINASSIGNPAYLOAD {
    public static final String TYPE_NAME = "DeliveryShippingOriginAssignPayload";

    public static final String UserErrors = "userErrors";
  }

  public static class DELIVERYZONE {
    public static final String TYPE_NAME = "DeliveryZone";

    public static final String Countries = "countries";

    public static final String Id = "id";

    public static final String Name = "name";
  }

  public static class DISCOUNTALLOCATION {
    public static final String TYPE_NAME = "DiscountAllocation";

    public static final String AllocatedAmount = "allocatedAmount";

    public static final String AllocatedAmountSet = "allocatedAmountSet";

    public static final String DiscountApplication = "discountApplication";
  }

  public static class DISCOUNTAMOUNT {
    public static final String TYPE_NAME = "DiscountAmount";

    public static final String Amount = "amount";

    public static final String AppliesOnEachItem = "appliesOnEachItem";
  }

  public static class DISCOUNTAPPLICATIONCONNECTION {
    public static final String TYPE_NAME = "DiscountApplicationConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class DISCOUNTAPPLICATIONEDGE {
    public static final String TYPE_NAME = "DiscountApplicationEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class DISCOUNTAUTOMATICACTIVATEPAYLOAD {
    public static final String TYPE_NAME = "DiscountAutomaticActivatePayload";

    public static final String AutomaticDiscountNode = "automaticDiscountNode";

    public static final String UserErrors = "userErrors";
  }

  public static class DISCOUNTAUTOMATICAPP {
    public static final String TYPE_NAME = "DiscountAutomaticApp";

    public static final String AppDiscountType = "appDiscountType";

    public static final String AsyncUsageCount = "asyncUsageCount";

    public static final String CombinesWith = "combinesWith";

    public static final String CreatedAt = "createdAt";

    public static final String DiscountClass = "discountClass";

    public static final String DiscountId = "discountId";

    public static final String EndsAt = "endsAt";

    public static final String ErrorHistory = "errorHistory";

    public static final String StartsAt = "startsAt";

    public static final String Status = "status";

    public static final String Title = "title";

    public static final String UpdatedAt = "updatedAt";
  }

  public static class DISCOUNTAUTOMATICAPPCREATEPAYLOAD {
    public static final String TYPE_NAME = "DiscountAutomaticAppCreatePayload";

    public static final String AutomaticAppDiscount = "automaticAppDiscount";

    public static final String UserErrors = "userErrors";
  }

  public static class DISCOUNTAUTOMATICAPPUPDATEPAYLOAD {
    public static final String TYPE_NAME = "DiscountAutomaticAppUpdatePayload";

    public static final String AutomaticAppDiscount = "automaticAppDiscount";

    public static final String UserErrors = "userErrors";
  }

  public static class DISCOUNTAUTOMATICBASIC {
    public static final String TYPE_NAME = "DiscountAutomaticBasic";

    public static final String AsyncUsageCount = "asyncUsageCount";

    public static final String CombinesWith = "combinesWith";

    public static final String CreatedAt = "createdAt";

    public static final String CustomerGets = "customerGets";

    public static final String DiscountClass = "discountClass";

    public static final String EndsAt = "endsAt";

    public static final String MinimumRequirement = "minimumRequirement";

    public static final String RecurringCycleLimit = "recurringCycleLimit";

    public static final String ShortSummary = "shortSummary";

    public static final String StartsAt = "startsAt";

    public static final String Status = "status";

    public static final String Summary = "summary";

    public static final String Title = "title";

    public static final String UpdatedAt = "updatedAt";

    public static final String UsageCount = "usageCount";
  }

  public static class DISCOUNTAUTOMATICBASICCREATEPAYLOAD {
    public static final String TYPE_NAME = "DiscountAutomaticBasicCreatePayload";

    public static final String AutomaticDiscountNode = "automaticDiscountNode";

    public static final String UserErrors = "userErrors";
  }

  public static class DISCOUNTAUTOMATICBASICUPDATEPAYLOAD {
    public static final String TYPE_NAME = "DiscountAutomaticBasicUpdatePayload";

    public static final String AutomaticDiscountNode = "automaticDiscountNode";

    public static final String UserErrors = "userErrors";
  }

  public static class DISCOUNTAUTOMATICBULKDELETEPAYLOAD {
    public static final String TYPE_NAME = "DiscountAutomaticBulkDeletePayload";

    public static final String Job = "job";

    public static final String UserErrors = "userErrors";
  }

  public static class DISCOUNTAUTOMATICBXGY {
    public static final String TYPE_NAME = "DiscountAutomaticBxgy";

    public static final String AsyncUsageCount = "asyncUsageCount";

    public static final String CombinesWith = "combinesWith";

    public static final String CreatedAt = "createdAt";

    public static final String CustomerBuys = "customerBuys";

    public static final String CustomerGets = "customerGets";

    public static final String DiscountClass = "discountClass";

    public static final String EndsAt = "endsAt";

    public static final String Events = "events";

    public static final String Id = "id";

    public static final String StartsAt = "startsAt";

    public static final String Status = "status";

    public static final String Summary = "summary";

    public static final String Title = "title";

    public static final String UpdatedAt = "updatedAt";

    public static final String UsageCount = "usageCount";

    public static final String UsesPerOrderLimit = "usesPerOrderLimit";

    public static class EVENTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }
  }

  public static class DISCOUNTAUTOMATICBXGYCREATEPAYLOAD {
    public static final String TYPE_NAME = "DiscountAutomaticBxgyCreatePayload";

    public static final String AutomaticDiscountNode = "automaticDiscountNode";

    public static final String UserErrors = "userErrors";
  }

  public static class DISCOUNTAUTOMATICBXGYUPDATEPAYLOAD {
    public static final String TYPE_NAME = "DiscountAutomaticBxgyUpdatePayload";

    public static final String AutomaticDiscountNode = "automaticDiscountNode";

    public static final String UserErrors = "userErrors";
  }

  public static class DISCOUNTAUTOMATICCONNECTION {
    public static final String TYPE_NAME = "DiscountAutomaticConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class DISCOUNTAUTOMATICDEACTIVATEPAYLOAD {
    public static final String TYPE_NAME = "DiscountAutomaticDeactivatePayload";

    public static final String AutomaticDiscountNode = "automaticDiscountNode";

    public static final String UserErrors = "userErrors";
  }

  public static class DISCOUNTAUTOMATICDELETEPAYLOAD {
    public static final String TYPE_NAME = "DiscountAutomaticDeletePayload";

    public static final String DeletedAutomaticDiscountId = "deletedAutomaticDiscountId";

    public static final String UserErrors = "userErrors";
  }

  public static class DISCOUNTAUTOMATICEDGE {
    public static final String TYPE_NAME = "DiscountAutomaticEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class DISCOUNTAUTOMATICFREESHIPPING {
    public static final String TYPE_NAME = "DiscountAutomaticFreeShipping";

    public static final String AppliesOnOneTimePurchase = "appliesOnOneTimePurchase";

    public static final String AppliesOnSubscription = "appliesOnSubscription";

    public static final String AsyncUsageCount = "asyncUsageCount";

    public static final String CombinesWith = "combinesWith";

    public static final String CreatedAt = "createdAt";

    public static final String DestinationSelection = "destinationSelection";

    public static final String DiscountClass = "discountClass";

    public static final String EndsAt = "endsAt";

    public static final String HasTimelineComment = "hasTimelineComment";

    public static final String MaximumShippingPrice = "maximumShippingPrice";

    public static final String MinimumRequirement = "minimumRequirement";

    public static final String RecurringCycleLimit = "recurringCycleLimit";

    public static final String ShortSummary = "shortSummary";

    public static final String StartsAt = "startsAt";

    public static final String Status = "status";

    public static final String Summary = "summary";

    public static final String Title = "title";

    public static final String TotalSales = "totalSales";

    public static final String UpdatedAt = "updatedAt";
  }

  public static class DISCOUNTAUTOMATICFREESHIPPINGCREATEPAYLOAD {
    public static final String TYPE_NAME = "DiscountAutomaticFreeShippingCreatePayload";

    public static final String AutomaticDiscountNode = "automaticDiscountNode";

    public static final String UserErrors = "userErrors";
  }

  public static class DISCOUNTAUTOMATICFREESHIPPINGUPDATEPAYLOAD {
    public static final String TYPE_NAME = "DiscountAutomaticFreeShippingUpdatePayload";

    public static final String AutomaticDiscountNode = "automaticDiscountNode";

    public static final String UserErrors = "userErrors";
  }

  public static class DISCOUNTAUTOMATICNODE {
    public static final String TYPE_NAME = "DiscountAutomaticNode";

    public static final String AutomaticDiscount = "automaticDiscount";

    public static final String Events = "events";

    public static final String Id = "id";

    public static final String Metafield = "metafield";

    public static final String MetafieldDefinitions = "metafieldDefinitions";

    public static final String Metafields = "metafields";

    public static final String PrivateMetafield = "privateMetafield";

    public static final String PrivateMetafields = "privateMetafields";

    public static class EVENTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class METAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class METAFIELDDEFINITIONS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String PinnedStatus = "pinnedStatus";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class METAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Keys = "keys";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PRIVATEMETAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class PRIVATEMETAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class DISCOUNTAUTOMATICNODECONNECTION {
    public static final String TYPE_NAME = "DiscountAutomaticNodeConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class DISCOUNTAUTOMATICNODEEDGE {
    public static final String TYPE_NAME = "DiscountAutomaticNodeEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class DISCOUNTCODEACTIVATEPAYLOAD {
    public static final String TYPE_NAME = "DiscountCodeActivatePayload";

    public static final String CodeDiscountNode = "codeDiscountNode";

    public static final String UserErrors = "userErrors";
  }

  public static class DISCOUNTCODEAPP {
    public static final String TYPE_NAME = "DiscountCodeApp";

    public static final String AppDiscountType = "appDiscountType";

    public static final String AppliesOncePerCustomer = "appliesOncePerCustomer";

    public static final String AsyncUsageCount = "asyncUsageCount";

    public static final String CodeCount = "codeCount";

    public static final String Codes = "codes";

    public static final String CombinesWith = "combinesWith";

    public static final String CreatedAt = "createdAt";

    public static final String CustomerSelection = "customerSelection";

    public static final String DiscountClass = "discountClass";

    public static final String DiscountId = "discountId";

    public static final String EndsAt = "endsAt";

    public static final String ErrorHistory = "errorHistory";

    public static final String HasTimelineComment = "hasTimelineComment";

    public static final String RecurringCycleLimit = "recurringCycleLimit";

    public static final String ShareableUrls = "shareableUrls";

    public static final String StartsAt = "startsAt";

    public static final String Status = "status";

    public static final String Title = "title";

    public static final String TotalSales = "totalSales";

    public static final String UpdatedAt = "updatedAt";

    public static final String UsageLimit = "usageLimit";

    public static class CODES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";

      public static final String SavedSearchId = "savedSearchId";
    }
  }

  public static class DISCOUNTCODEAPPCREATEPAYLOAD {
    public static final String TYPE_NAME = "DiscountCodeAppCreatePayload";

    public static final String CodeAppDiscount = "codeAppDiscount";

    public static final String UserErrors = "userErrors";
  }

  public static class DISCOUNTCODEAPPLICATION {
    public static final String TYPE_NAME = "DiscountCodeApplication";

    public static final String AllocationMethod = "allocationMethod";

    public static final String Code = "code";

    public static final String Index = "index";

    public static final String TargetSelection = "targetSelection";

    public static final String TargetType = "targetType";

    public static final String Value = "value";
  }

  public static class DISCOUNTCODEAPPUPDATEPAYLOAD {
    public static final String TYPE_NAME = "DiscountCodeAppUpdatePayload";

    public static final String CodeAppDiscount = "codeAppDiscount";

    public static final String UserErrors = "userErrors";
  }

  public static class DISCOUNTCODEBASIC {
    public static final String TYPE_NAME = "DiscountCodeBasic";

    public static final String AppliesOncePerCustomer = "appliesOncePerCustomer";

    public static final String AsyncUsageCount = "asyncUsageCount";

    public static final String CodeCount = "codeCount";

    public static final String Codes = "codes";

    public static final String CombinesWith = "combinesWith";

    public static final String CreatedAt = "createdAt";

    public static final String CustomerGets = "customerGets";

    public static final String CustomerSelection = "customerSelection";

    public static final String DiscountClass = "discountClass";

    public static final String EndsAt = "endsAt";

    public static final String HasTimelineComment = "hasTimelineComment";

    public static final String MinimumRequirement = "minimumRequirement";

    public static final String RecurringCycleLimit = "recurringCycleLimit";

    public static final String ShareableUrls = "shareableUrls";

    public static final String ShortSummary = "shortSummary";

    public static final String StartsAt = "startsAt";

    public static final String Status = "status";

    public static final String Summary = "summary";

    public static final String Title = "title";

    public static final String TotalSales = "totalSales";

    public static final String UpdatedAt = "updatedAt";

    public static final String UsageLimit = "usageLimit";

    public static class CODES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";

      public static final String SavedSearchId = "savedSearchId";
    }
  }

  public static class DISCOUNTCODEBASICCREATEPAYLOAD {
    public static final String TYPE_NAME = "DiscountCodeBasicCreatePayload";

    public static final String CodeDiscountNode = "codeDiscountNode";

    public static final String UserErrors = "userErrors";
  }

  public static class DISCOUNTCODEBASICUPDATEPAYLOAD {
    public static final String TYPE_NAME = "DiscountCodeBasicUpdatePayload";

    public static final String CodeDiscountNode = "codeDiscountNode";

    public static final String UserErrors = "userErrors";
  }

  public static class DISCOUNTCODEBULKACTIVATEPAYLOAD {
    public static final String TYPE_NAME = "DiscountCodeBulkActivatePayload";

    public static final String Job = "job";

    public static final String UserErrors = "userErrors";
  }

  public static class DISCOUNTCODEBULKDEACTIVATEPAYLOAD {
    public static final String TYPE_NAME = "DiscountCodeBulkDeactivatePayload";

    public static final String Job = "job";

    public static final String UserErrors = "userErrors";
  }

  public static class DISCOUNTCODEBULKDELETEPAYLOAD {
    public static final String TYPE_NAME = "DiscountCodeBulkDeletePayload";

    public static final String Job = "job";

    public static final String UserErrors = "userErrors";
  }

  public static class DISCOUNTCODEBXGY {
    public static final String TYPE_NAME = "DiscountCodeBxgy";

    public static final String AppliesOncePerCustomer = "appliesOncePerCustomer";

    public static final String AsyncUsageCount = "asyncUsageCount";

    public static final String CodeCount = "codeCount";

    public static final String Codes = "codes";

    public static final String CombinesWith = "combinesWith";

    public static final String CreatedAt = "createdAt";

    public static final String CustomerBuys = "customerBuys";

    public static final String CustomerGets = "customerGets";

    public static final String CustomerSelection = "customerSelection";

    public static final String DiscountClass = "discountClass";

    public static final String EndsAt = "endsAt";

    public static final String HasTimelineComment = "hasTimelineComment";

    public static final String ShareableUrls = "shareableUrls";

    public static final String StartsAt = "startsAt";

    public static final String Status = "status";

    public static final String Summary = "summary";

    public static final String Title = "title";

    public static final String TotalSales = "totalSales";

    public static final String UpdatedAt = "updatedAt";

    public static final String UsageLimit = "usageLimit";

    public static final String UsesPerOrderLimit = "usesPerOrderLimit";

    public static class CODES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";

      public static final String SavedSearchId = "savedSearchId";
    }
  }

  public static class DISCOUNTCODEBXGYCREATEPAYLOAD {
    public static final String TYPE_NAME = "DiscountCodeBxgyCreatePayload";

    public static final String CodeDiscountNode = "codeDiscountNode";

    public static final String UserErrors = "userErrors";
  }

  public static class DISCOUNTCODEBXGYUPDATEPAYLOAD {
    public static final String TYPE_NAME = "DiscountCodeBxgyUpdatePayload";

    public static final String CodeDiscountNode = "codeDiscountNode";

    public static final String UserErrors = "userErrors";
  }

  public static class DISCOUNTCODEDEACTIVATEPAYLOAD {
    public static final String TYPE_NAME = "DiscountCodeDeactivatePayload";

    public static final String CodeDiscountNode = "codeDiscountNode";

    public static final String UserErrors = "userErrors";
  }

  public static class DISCOUNTCODEDELETEPAYLOAD {
    public static final String TYPE_NAME = "DiscountCodeDeletePayload";

    public static final String DeletedCodeDiscountId = "deletedCodeDiscountId";

    public static final String UserErrors = "userErrors";
  }

  public static class DISCOUNTCODEFREESHIPPING {
    public static final String TYPE_NAME = "DiscountCodeFreeShipping";

    public static final String AppliesOnOneTimePurchase = "appliesOnOneTimePurchase";

    public static final String AppliesOnSubscription = "appliesOnSubscription";

    public static final String AppliesOncePerCustomer = "appliesOncePerCustomer";

    public static final String AsyncUsageCount = "asyncUsageCount";

    public static final String CodeCount = "codeCount";

    public static final String Codes = "codes";

    public static final String CombinesWith = "combinesWith";

    public static final String CreatedAt = "createdAt";

    public static final String CustomerSelection = "customerSelection";

    public static final String DestinationSelection = "destinationSelection";

    public static final String DiscountClass = "discountClass";

    public static final String EndsAt = "endsAt";

    public static final String HasTimelineComment = "hasTimelineComment";

    public static final String MaximumShippingPrice = "maximumShippingPrice";

    public static final String MinimumRequirement = "minimumRequirement";

    public static final String RecurringCycleLimit = "recurringCycleLimit";

    public static final String ShareableUrls = "shareableUrls";

    public static final String ShortSummary = "shortSummary";

    public static final String StartsAt = "startsAt";

    public static final String Status = "status";

    public static final String Summary = "summary";

    public static final String Title = "title";

    public static final String TotalSales = "totalSales";

    public static final String UpdatedAt = "updatedAt";

    public static final String UsageLimit = "usageLimit";

    public static class CODES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";

      public static final String SavedSearchId = "savedSearchId";
    }
  }

  public static class DISCOUNTCODEFREESHIPPINGCREATEPAYLOAD {
    public static final String TYPE_NAME = "DiscountCodeFreeShippingCreatePayload";

    public static final String CodeDiscountNode = "codeDiscountNode";

    public static final String UserErrors = "userErrors";
  }

  public static class DISCOUNTCODEFREESHIPPINGUPDATEPAYLOAD {
    public static final String TYPE_NAME = "DiscountCodeFreeShippingUpdatePayload";

    public static final String CodeDiscountNode = "codeDiscountNode";

    public static final String UserErrors = "userErrors";
  }

  public static class DISCOUNTCODENODE {
    public static final String TYPE_NAME = "DiscountCodeNode";

    public static final String CodeDiscount = "codeDiscount";

    public static final String Events = "events";

    public static final String Id = "id";

    public static final String Metafield = "metafield";

    public static final String MetafieldDefinitions = "metafieldDefinitions";

    public static final String Metafields = "metafields";

    public static final String PrivateMetafield = "privateMetafield";

    public static final String PrivateMetafields = "privateMetafields";

    public static class EVENTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class METAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class METAFIELDDEFINITIONS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String PinnedStatus = "pinnedStatus";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class METAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Keys = "keys";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PRIVATEMETAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class PRIVATEMETAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class DISCOUNTCODENODECONNECTION {
    public static final String TYPE_NAME = "DiscountCodeNodeConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class DISCOUNTCODENODEEDGE {
    public static final String TYPE_NAME = "DiscountCodeNodeEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class DISCOUNTCODEREDEEMCODEBULKDELETEPAYLOAD {
    public static final String TYPE_NAME = "DiscountCodeRedeemCodeBulkDeletePayload";

    public static final String Job = "job";

    public static final String UserErrors = "userErrors";
  }

  public static class DISCOUNTCOLLECTIONS {
    public static final String TYPE_NAME = "DiscountCollections";

    public static final String Collections = "collections";

    public static class COLLECTIONS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class DISCOUNTCOMBINESWITH {
    public static final String TYPE_NAME = "DiscountCombinesWith";

    public static final String OrderDiscounts = "orderDiscounts";

    public static final String ProductDiscounts = "productDiscounts";

    public static final String ShippingDiscounts = "shippingDiscounts";
  }

  public static class DISCOUNTCOUNTRIES {
    public static final String TYPE_NAME = "DiscountCountries";

    public static final String Countries = "countries";

    public static final String IncludeRestOfWorld = "includeRestOfWorld";
  }

  public static class DISCOUNTCOUNTRYALL {
    public static final String TYPE_NAME = "DiscountCountryAll";

    public static final String AllCountries = "allCountries";
  }

  public static class DISCOUNTCUSTOMERALL {
    public static final String TYPE_NAME = "DiscountCustomerAll";

    public static final String AllCustomers = "allCustomers";
  }

  public static class DISCOUNTCUSTOMERBUYS {
    public static final String TYPE_NAME = "DiscountCustomerBuys";

    public static final String Items = "items";

    public static final String Value = "value";
  }

  public static class DISCOUNTCUSTOMERGETS {
    public static final String TYPE_NAME = "DiscountCustomerGets";

    public static final String AppliesOnOneTimePurchase = "appliesOnOneTimePurchase";

    public static final String AppliesOnSubscription = "appliesOnSubscription";

    public static final String Items = "items";

    public static final String Value = "value";
  }

  public static class DISCOUNTCUSTOMERS {
    public static final String TYPE_NAME = "DiscountCustomers";

    public static final String Customers = "customers";
  }

  public static class DISCOUNTCUSTOMERSEGMENTS {
    public static final String TYPE_NAME = "DiscountCustomerSegments";

    public static final String Segments = "segments";
  }

  public static class DISCOUNTMINIMUMQUANTITY {
    public static final String TYPE_NAME = "DiscountMinimumQuantity";

    public static final String GreaterThanOrEqualToQuantity = "greaterThanOrEqualToQuantity";
  }

  public static class DISCOUNTMINIMUMSUBTOTAL {
    public static final String TYPE_NAME = "DiscountMinimumSubtotal";

    public static final String GreaterThanOrEqualToSubtotal = "greaterThanOrEqualToSubtotal";
  }

  public static class DISCOUNTNODE {
    public static final String TYPE_NAME = "DiscountNode";

    public static final String Discount = "discount";

    public static final String Events = "events";

    public static final String Id = "id";

    public static final String Metafield = "metafield";

    public static final String MetafieldDefinitions = "metafieldDefinitions";

    public static final String Metafields = "metafields";

    public static final String PrivateMetafield = "privateMetafield";

    public static final String PrivateMetafields = "privateMetafields";

    public static class EVENTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class METAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class METAFIELDDEFINITIONS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String PinnedStatus = "pinnedStatus";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class METAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Keys = "keys";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PRIVATEMETAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class PRIVATEMETAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class DISCOUNTNODECONNECTION {
    public static final String TYPE_NAME = "DiscountNodeConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class DISCOUNTNODEEDGE {
    public static final String TYPE_NAME = "DiscountNodeEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class DISCOUNTONQUANTITY {
    public static final String TYPE_NAME = "DiscountOnQuantity";

    public static final String Effect = "effect";

    public static final String Quantity = "quantity";
  }

  public static class DISCOUNTPERCENTAGE {
    public static final String TYPE_NAME = "DiscountPercentage";

    public static final String Percentage = "percentage";
  }

  public static class DISCOUNTPRODUCTS {
    public static final String TYPE_NAME = "DiscountProducts";

    public static final String ProductVariants = "productVariants";

    public static final String Products = "products";

    public static class PRODUCTVARIANTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PRODUCTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class DISCOUNTPURCHASEAMOUNT {
    public static final String TYPE_NAME = "DiscountPurchaseAmount";

    public static final String Amount = "amount";
  }

  public static class DISCOUNTQUANTITY {
    public static final String TYPE_NAME = "DiscountQuantity";

    public static final String Quantity = "quantity";
  }

  public static class DISCOUNTREDEEMCODE {
    public static final String TYPE_NAME = "DiscountRedeemCode";

    public static final String AsyncUsageCount = "asyncUsageCount";

    public static final String Code = "code";

    public static final String CreatedBy = "createdBy";

    public static final String Id = "id";
  }

  public static class DISCOUNTREDEEMCODEBULKADDPAYLOAD {
    public static final String TYPE_NAME = "DiscountRedeemCodeBulkAddPayload";

    public static final String BulkCreation = "bulkCreation";

    public static final String UserErrors = "userErrors";
  }

  public static class DISCOUNTREDEEMCODEBULKCREATION {
    public static final String TYPE_NAME = "DiscountRedeemCodeBulkCreation";

    public static final String Codes = "codes";

    public static final String CodesCount = "codesCount";

    public static final String CreatedAt = "createdAt";

    public static final String DiscountCode = "discountCode";

    public static final String Done = "done";

    public static final String FailedCount = "failedCount";

    public static final String Id = "id";

    public static final String ImportedCount = "importedCount";

    public static class CODES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class DISCOUNTREDEEMCODEBULKCREATIONCODE {
    public static final String TYPE_NAME = "DiscountRedeemCodeBulkCreationCode";

    public static final String Code = "code";

    public static final String DiscountRedeemCode = "discountRedeemCode";

    public static final String Errors = "errors";
  }

  public static class DISCOUNTREDEEMCODEBULKCREATIONCODECONNECTION {
    public static final String TYPE_NAME = "DiscountRedeemCodeBulkCreationCodeConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class DISCOUNTREDEEMCODEBULKCREATIONCODEEDGE {
    public static final String TYPE_NAME = "DiscountRedeemCodeBulkCreationCodeEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class DISCOUNTREDEEMCODECONNECTION {
    public static final String TYPE_NAME = "DiscountRedeemCodeConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class DISCOUNTREDEEMCODEEDGE {
    public static final String TYPE_NAME = "DiscountRedeemCodeEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class DISCOUNTSHAREABLEURL {
    public static final String TYPE_NAME = "DiscountShareableUrl";

    public static final String TargetItemImage = "targetItemImage";

    public static final String TargetType = "targetType";

    public static final String Title = "title";

    public static final String Url = "url";
  }

  public static class DISCOUNTUSERERROR {
    public static final String TYPE_NAME = "DiscountUserError";

    public static final String Code = "code";

    public static final String ExtraInfo = "extraInfo";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class DISPUTEEVIDENCEUPDATEPAYLOAD {
    public static final String TYPE_NAME = "DisputeEvidenceUpdatePayload";

    public static final String DisputeEvidence = "disputeEvidence";

    public static final String UserErrors = "userErrors";
  }

  public static class DISPUTEEVIDENCEUPDATEUSERERROR {
    public static final String TYPE_NAME = "DisputeEvidenceUpdateUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class DOMAIN {
    public static final String TYPE_NAME = "Domain";

    public static final String Host = "host";

    public static final String Id = "id";

    public static final String Localization = "localization";

    public static final String MarketWebPresence = "marketWebPresence";

    public static final String SslEnabled = "sslEnabled";

    public static final String Url = "url";
  }

  public static class DOMAINLOCALIZATION {
    public static final String TYPE_NAME = "DomainLocalization";

    public static final String AlternateLocales = "alternateLocales";

    public static final String Country = "country";

    public static final String DefaultLocale = "defaultLocale";
  }

  public static class DRAFTORDER {
    public static final String TYPE_NAME = "DraftOrder";

    public static final String AppliedDiscount = "appliedDiscount";

    public static final String BillingAddress = "billingAddress";

    public static final String BillingAddressMatchesShippingAddress = "billingAddressMatchesShippingAddress";

    public static final String CompletedAt = "completedAt";

    public static final String CreatedAt = "createdAt";

    public static final String CurrencyCode = "currencyCode";

    public static final String CustomAttributes = "customAttributes";

    public static final String Customer = "customer";

    public static final String DefaultCursor = "defaultCursor";

    public static final String Email = "email";

    public static final String Events = "events";

    public static final String HasTimelineComment = "hasTimelineComment";

    public static final String Id = "id";

    public static final String InvoiceEmailTemplateSubject = "invoiceEmailTemplateSubject";

    public static final String InvoiceSentAt = "invoiceSentAt";

    public static final String InvoiceUrl = "invoiceUrl";

    public static final String LegacyResourceId = "legacyResourceId";

    public static final String LineItems = "lineItems";

    public static final String LineItemsSubtotalPrice = "lineItemsSubtotalPrice";

    public static final String LocalizationExtensions = "localizationExtensions";

    public static final String MarketName = "marketName";

    public static final String MarketRegionCountryCode = "marketRegionCountryCode";

    public static final String Metafield = "metafield";

    public static final String Metafields = "metafields";

    public static final String Name = "name";

    public static final String Note2 = "note2";

    public static final String Order = "order";

    public static final String PaymentTerms = "paymentTerms";

    public static final String Phone = "phone";

    public static final String PoNumber = "poNumber";

    public static final String PresentmentCurrencyCode = "presentmentCurrencyCode";

    public static final String PrivateMetafield = "privateMetafield";

    public static final String PrivateMetafields = "privateMetafields";

    public static final String PurchasingEntity = "purchasingEntity";

    public static final String Ready = "ready";

    public static final String ReserveInventoryUntil = "reserveInventoryUntil";

    public static final String ShippingAddress = "shippingAddress";

    public static final String ShippingLine = "shippingLine";

    public static final String Status = "status";

    public static final String SubtotalPrice = "subtotalPrice";

    public static final String SubtotalPriceSet = "subtotalPriceSet";

    public static final String Tags = "tags";

    public static final String TaxExempt = "taxExempt";

    public static final String TaxLines = "taxLines";

    public static final String TaxesIncluded = "taxesIncluded";

    public static final String TotalDiscountsSet = "totalDiscountsSet";

    public static final String TotalLineItemsPriceSet = "totalLineItemsPriceSet";

    public static final String TotalPrice = "totalPrice";

    public static final String TotalPriceSet = "totalPriceSet";

    public static final String TotalShippingPrice = "totalShippingPrice";

    public static final String TotalShippingPriceSet = "totalShippingPriceSet";

    public static final String TotalTax = "totalTax";

    public static final String TotalTaxSet = "totalTaxSet";

    public static final String TotalWeight = "totalWeight";

    public static final String UpdatedAt = "updatedAt";

    public static final String VisibleToCustomer = "visibleToCustomer";

    public static class EVENTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class LINEITEMS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class LOCALIZATIONEXTENSIONS_INPUT_ARGUMENT {
      public static final String CountryCodes = "countryCodes";

      public static final String Purposes = "purposes";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class METAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class METAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Keys = "keys";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PRIVATEMETAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class PRIVATEMETAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class DRAFTORDERAPPLIEDDISCOUNT {
    public static final String TYPE_NAME = "DraftOrderAppliedDiscount";

    public static final String Amount = "amount";

    public static final String AmountSet = "amountSet";

    public static final String AmountV2 = "amountV2";

    public static final String Description = "description";

    public static final String Title = "title";

    public static final String Value = "value";

    public static final String ValueType = "valueType";
  }

  public static class DRAFTORDERBULKADDTAGSPAYLOAD {
    public static final String TYPE_NAME = "DraftOrderBulkAddTagsPayload";

    public static final String Job = "job";

    public static final String UserErrors = "userErrors";
  }

  public static class DRAFTORDERBULKDELETEPAYLOAD {
    public static final String TYPE_NAME = "DraftOrderBulkDeletePayload";

    public static final String Job = "job";

    public static final String UserErrors = "userErrors";
  }

  public static class DRAFTORDERBULKREMOVETAGSPAYLOAD {
    public static final String TYPE_NAME = "DraftOrderBulkRemoveTagsPayload";

    public static final String Job = "job";

    public static final String UserErrors = "userErrors";
  }

  public static class DRAFTORDERCALCULATEPAYLOAD {
    public static final String TYPE_NAME = "DraftOrderCalculatePayload";

    public static final String CalculatedDraftOrder = "calculatedDraftOrder";

    public static final String UserErrors = "userErrors";
  }

  public static class DRAFTORDERCOMPLETEPAYLOAD {
    public static final String TYPE_NAME = "DraftOrderCompletePayload";

    public static final String DraftOrder = "draftOrder";

    public static final String UserErrors = "userErrors";
  }

  public static class DRAFTORDERCONNECTION {
    public static final String TYPE_NAME = "DraftOrderConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class DRAFTORDERCREATEFROMORDERPAYLOAD {
    public static final String TYPE_NAME = "DraftOrderCreateFromOrderPayload";

    public static final String DraftOrder = "draftOrder";

    public static final String UserErrors = "userErrors";
  }

  public static class DRAFTORDERCREATEMERCHANTCHECKOUTPAYLOAD {
    public static final String TYPE_NAME = "DraftOrderCreateMerchantCheckoutPayload";

    public static final String UserErrors = "userErrors";
  }

  public static class DRAFTORDERCREATEPAYLOAD {
    public static final String TYPE_NAME = "DraftOrderCreatePayload";

    public static final String DraftOrder = "draftOrder";

    public static final String UserErrors = "userErrors";
  }

  public static class DRAFTORDERDELETEPAYLOAD {
    public static final String TYPE_NAME = "DraftOrderDeletePayload";

    public static final String DeletedId = "deletedId";

    public static final String UserErrors = "userErrors";
  }

  public static class DRAFTORDERDUPLICATEPAYLOAD {
    public static final String TYPE_NAME = "DraftOrderDuplicatePayload";

    public static final String DraftOrder = "draftOrder";

    public static final String UserErrors = "userErrors";
  }

  public static class DRAFTORDEREDGE {
    public static final String TYPE_NAME = "DraftOrderEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class DRAFTORDERINVOICEPREVIEWPAYLOAD {
    public static final String TYPE_NAME = "DraftOrderInvoicePreviewPayload";

    public static final String PreviewHtml = "previewHtml";

    public static final String PreviewSubject = "previewSubject";

    public static final String UserErrors = "userErrors";
  }

  public static class DRAFTORDERINVOICESENDPAYLOAD {
    public static final String TYPE_NAME = "DraftOrderInvoiceSendPayload";

    public static final String DraftOrder = "draftOrder";

    public static final String UserErrors = "userErrors";
  }

  public static class DRAFTORDERLINEITEM {
    public static final String TYPE_NAME = "DraftOrderLineItem";

    public static final String AppliedDiscount = "appliedDiscount";

    public static final String Custom = "custom";

    public static final String CustomAttributes = "customAttributes";

    public static final String CustomAttributesV2 = "customAttributesV2";

    public static final String DiscountedTotal = "discountedTotal";

    public static final String DiscountedTotalSet = "discountedTotalSet";

    public static final String DiscountedUnitPrice = "discountedUnitPrice";

    public static final String DiscountedUnitPriceSet = "discountedUnitPriceSet";

    public static final String FulfillmentService = "fulfillmentService";

    public static final String Grams = "grams";

    public static final String Id = "id";

    public static final String Image = "image";

    public static final String IsGiftCard = "isGiftCard";

    public static final String Name = "name";

    public static final String OriginalTotal = "originalTotal";

    public static final String OriginalTotalSet = "originalTotalSet";

    public static final String OriginalUnitPrice = "originalUnitPrice";

    public static final String OriginalUnitPriceSet = "originalUnitPriceSet";

    public static final String Product = "product";

    public static final String Quantity = "quantity";

    public static final String RequiresShipping = "requiresShipping";

    public static final String Sku = "sku";

    public static final String TaxLines = "taxLines";

    public static final String Taxable = "taxable";

    public static final String Title = "title";

    public static final String TotalDiscount = "totalDiscount";

    public static final String TotalDiscountSet = "totalDiscountSet";

    public static final String Variant = "variant";

    public static final String VariantTitle = "variantTitle";

    public static final String Vendor = "vendor";

    public static final String Weight = "weight";
  }

  public static class DRAFTORDERLINEITEMCONNECTION {
    public static final String TYPE_NAME = "DraftOrderLineItemConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class DRAFTORDERLINEITEMEDGE {
    public static final String TYPE_NAME = "DraftOrderLineItemEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class DRAFTORDERTAG {
    public static final String TYPE_NAME = "DraftOrderTag";

    public static final String Handle = "handle";

    public static final String Id = "id";

    public static final String Title = "title";
  }

  public static class DRAFTORDERUPDATEPAYLOAD {
    public static final String TYPE_NAME = "DraftOrderUpdatePayload";

    public static final String DraftOrder = "draftOrder";

    public static final String UserErrors = "userErrors";
  }

  public static class DUTY {
    public static final String TYPE_NAME = "Duty";

    public static final String CountryCodeOfOrigin = "countryCodeOfOrigin";

    public static final String HarmonizedSystemCode = "harmonizedSystemCode";

    public static final String Id = "id";

    public static final String Price = "price";

    public static final String TaxLines = "taxLines";
  }

  public static class DUTYSALE {
    public static final String TYPE_NAME = "DutySale";

    public static final String ActionType = "actionType";

    public static final String Duty = "duty";

    public static final String Id = "id";

    public static final String LineType = "lineType";

    public static final String Quantity = "quantity";

    public static final String Taxes = "taxes";

    public static final String TotalAmount = "totalAmount";

    public static final String TotalDiscountAmountAfterTaxes = "totalDiscountAmountAfterTaxes";

    public static final String TotalDiscountAmountBeforeTaxes = "totalDiscountAmountBeforeTaxes";

    public static final String TotalTaxAmount = "totalTaxAmount";
  }

  public static class EDITABLEPROPERTY {
    public static final String TYPE_NAME = "EditableProperty";

    public static final String Locked = "locked";

    public static final String Reason = "reason";
  }

  public static class ERRORPOSITION {
    public static final String TYPE_NAME = "ErrorPosition";

    public static final String Character = "character";

    public static final String Line = "line";
  }

  public static class ERRORSSERVERPIXELUSERERROR {
    public static final String TYPE_NAME = "ErrorsServerPixelUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class ERRORSWEBPIXELUSERERROR {
    public static final String TYPE_NAME = "ErrorsWebPixelUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class EVENTBRIDGESERVERPIXELUPDATEPAYLOAD {
    public static final String TYPE_NAME = "EventBridgeServerPixelUpdatePayload";

    public static final String ServerPixel = "serverPixel";

    public static final String UserErrors = "userErrors";
  }

  public static class EVENTBRIDGEWEBHOOKSUBSCRIPTIONCREATEPAYLOAD {
    public static final String TYPE_NAME = "EventBridgeWebhookSubscriptionCreatePayload";

    public static final String UserErrors = "userErrors";

    public static final String WebhookSubscription = "webhookSubscription";
  }

  public static class EVENTBRIDGEWEBHOOKSUBSCRIPTIONUPDATEPAYLOAD {
    public static final String TYPE_NAME = "EventBridgeWebhookSubscriptionUpdatePayload";

    public static final String UserErrors = "userErrors";

    public static final String WebhookSubscription = "webhookSubscription";
  }

  public static class EVENTCONNECTION {
    public static final String TYPE_NAME = "EventConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class EVENTEDGE {
    public static final String TYPE_NAME = "EventEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class EXCHANGEV2 {
    public static final String TYPE_NAME = "ExchangeV2";

    public static final String Additions = "additions";

    public static final String CompletedAt = "completedAt";

    public static final String CreatedAt = "createdAt";

    public static final String Id = "id";

    public static final String Location = "location";

    public static final String Note = "note";

    public static final String Refunds = "refunds";

    public static final String Returns = "returns";

    public static final String StaffMember = "staffMember";

    public static final String TotalAmountProcessedSet = "totalAmountProcessedSet";

    public static final String TotalPriceSet = "totalPriceSet";

    public static final String Transactions = "transactions";
  }

  public static class EXCHANGEV2ADDITIONS {
    public static final String TYPE_NAME = "ExchangeV2Additions";

    public static final String LineItems = "lineItems";

    public static final String SubtotalPriceSet = "subtotalPriceSet";

    public static final String TaxLines = "taxLines";

    public static final String TotalPriceSet = "totalPriceSet";
  }

  public static class EXCHANGEV2CONNECTION {
    public static final String TYPE_NAME = "ExchangeV2Connection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class EXCHANGEV2EDGE {
    public static final String TYPE_NAME = "ExchangeV2Edge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class EXCHANGEV2LINEITEM {
    public static final String TYPE_NAME = "ExchangeV2LineItem";

    public static final String CustomAttributes = "customAttributes";

    public static final String DiscountedTotalSet = "discountedTotalSet";

    public static final String DiscountedUnitPriceSet = "discountedUnitPriceSet";

    public static final String FulfillmentService = "fulfillmentService";

    public static final String GiftCard = "giftCard";

    public static final String GiftCards = "giftCards";

    public static final String LineItem = "lineItem";

    public static final String Name = "name";

    public static final String OriginalTotalSet = "originalTotalSet";

    public static final String OriginalUnitPriceSet = "originalUnitPriceSet";

    public static final String Quantity = "quantity";

    public static final String RequiresShipping = "requiresShipping";

    public static final String Sku = "sku";

    public static final String TaxLines = "taxLines";

    public static final String Taxable = "taxable";

    public static final String Title = "title";

    public static final String Variant = "variant";

    public static final String VariantTitle = "variantTitle";

    public static final String Vendor = "vendor";
  }

  public static class EXCHANGEV2RETURNS {
    public static final String TYPE_NAME = "ExchangeV2Returns";

    public static final String LineItems = "lineItems";

    public static final String OrderDiscountAmountSet = "orderDiscountAmountSet";

    public static final String ShippingRefundAmountSet = "shippingRefundAmountSet";

    public static final String SubtotalPriceSet = "subtotalPriceSet";

    public static final String TaxLines = "taxLines";

    public static final String TipRefundAmountSet = "tipRefundAmountSet";

    public static final String TotalPriceSet = "totalPriceSet";
  }

  public static class EXTERNALVIDEO {
    public static final String TYPE_NAME = "ExternalVideo";

    public static final String Alt = "alt";

    public static final String EmbedUrl = "embedUrl";

    public static final String EmbeddedUrl = "embeddedUrl";

    public static final String Host = "host";

    public static final String Id = "id";

    public static final String MediaContentType = "mediaContentType";

    public static final String MediaErrors = "mediaErrors";

    public static final String MediaWarnings = "mediaWarnings";

    public static final String OriginUrl = "originUrl";

    public static final String Preview = "preview";

    public static final String Status = "status";
  }

  public static class FAILEDREQUIREMENT {
    public static final String TYPE_NAME = "FailedRequirement";

    public static final String Action = "action";

    public static final String Message = "message";
  }

  public static class FILEACKNOWLEDGEUPDATEFAILEDPAYLOAD {
    public static final String TYPE_NAME = "FileAcknowledgeUpdateFailedPayload";

    public static final String Files = "files";

    public static final String UserErrors = "userErrors";
  }

  public static class FILECONNECTION {
    public static final String TYPE_NAME = "FileConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class FILECREATEPAYLOAD {
    public static final String TYPE_NAME = "FileCreatePayload";

    public static final String Files = "files";

    public static final String UserErrors = "userErrors";
  }

  public static class FILEDELETEPAYLOAD {
    public static final String TYPE_NAME = "FileDeletePayload";

    public static final String DeletedFileIds = "deletedFileIds";

    public static final String UserErrors = "userErrors";
  }

  public static class FILEEDGE {
    public static final String TYPE_NAME = "FileEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class FILEERROR {
    public static final String TYPE_NAME = "FileError";

    public static final String Code = "code";

    public static final String Details = "details";

    public static final String Message = "message";
  }

  public static class FILESUSERERROR {
    public static final String TYPE_NAME = "FilesUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class FILEUPDATEPAYLOAD {
    public static final String TYPE_NAME = "FileUpdatePayload";

    public static final String Files = "files";

    public static final String UserErrors = "userErrors";
  }

  public static class FILTEROPTION {
    public static final String TYPE_NAME = "FilterOption";

    public static final String Label = "label";

    public static final String Value = "value";
  }

  public static class FINANCIALSUMMARYDISCOUNTALLOCATION {
    public static final String TYPE_NAME = "FinancialSummaryDiscountAllocation";

    public static final String ApproximateAllocatedAmountPerItem = "approximateAllocatedAmountPerItem";

    public static final String DiscountApplication = "discountApplication";
  }

  public static class FINANCIALSUMMARYDISCOUNTAPPLICATION {
    public static final String TYPE_NAME = "FinancialSummaryDiscountApplication";

    public static final String AllocationMethod = "allocationMethod";

    public static final String TargetSelection = "targetSelection";

    public static final String TargetType = "targetType";
  }

  public static class FLOWGENERATESIGNATUREPAYLOAD {
    public static final String TYPE_NAME = "FlowGenerateSignaturePayload";

    public static final String Payload = "payload";

    public static final String Signature = "signature";

    public static final String UserErrors = "userErrors";
  }

  public static class FLOWTRIGGERRECEIVEPAYLOAD {
    public static final String TYPE_NAME = "FlowTriggerReceivePayload";

    public static final String UserErrors = "userErrors";
  }

  public static class FULFILLMENT {
    public static final String TYPE_NAME = "Fulfillment";

    public static final String CreatedAt = "createdAt";

    public static final String DeliveredAt = "deliveredAt";

    public static final String DisplayStatus = "displayStatus";

    public static final String EstimatedDeliveryAt = "estimatedDeliveryAt";

    public static final String Events = "events";

    public static final String FulfillmentLineItems = "fulfillmentLineItems";

    public static final String FulfillmentOrders = "fulfillmentOrders";

    public static final String Id = "id";

    public static final String InTransitAt = "inTransitAt";

    public static final String LegacyResourceId = "legacyResourceId";

    public static final String Location = "location";

    public static final String Name = "name";

    public static final String Order = "order";

    public static final String OriginAddress = "originAddress";

    public static final String RequiresShipping = "requiresShipping";

    public static final String Service = "service";

    public static final String ShippingLabel = "shippingLabel";

    public static final String Status = "status";

    public static final String TotalQuantity = "totalQuantity";

    public static final String TrackingInfo = "trackingInfo";

    public static final String UpdatedAt = "updatedAt";

    public static class EVENTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";
    }

    public static class FULFILLMENTLINEITEMS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class FULFILLMENTORDERS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class TRACKINGINFO_INPUT_ARGUMENT {
      public static final String First = "first";
    }
  }

  public static class FULFILLMENTCANCELPAYLOAD {
    public static final String TYPE_NAME = "FulfillmentCancelPayload";

    public static final String Fulfillment = "fulfillment";

    public static final String UserErrors = "userErrors";
  }

  public static class FULFILLMENTCONNECTION {
    public static final String TYPE_NAME = "FulfillmentConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class FULFILLMENTCONSTRAINTRULE {
    public static final String TYPE_NAME = "FulfillmentConstraintRule";

    public static final String Function = "function";

    public static final String Id = "id";

    public static final String Metafield = "metafield";

    public static final String Metafields = "metafields";

    public static final String PrivateMetafield = "privateMetafield";

    public static final String PrivateMetafields = "privateMetafields";

    public static class METAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class METAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Keys = "keys";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PRIVATEMETAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class PRIVATEMETAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class FULFILLMENTCONSTRAINTRULECREATEPAYLOAD {
    public static final String TYPE_NAME = "FulfillmentConstraintRuleCreatePayload";

    public static final String FulfillmentConstraintRule = "fulfillmentConstraintRule";

    public static final String UserErrors = "userErrors";
  }

  public static class FULFILLMENTCONSTRAINTRULECREATEUSERERROR {
    public static final String TYPE_NAME = "FulfillmentConstraintRuleCreateUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class FULFILLMENTCONSTRAINTRULEDELETEPAYLOAD {
    public static final String TYPE_NAME = "FulfillmentConstraintRuleDeletePayload";

    public static final String Success = "success";

    public static final String UserErrors = "userErrors";
  }

  public static class FULFILLMENTCONSTRAINTRULEDELETEUSERERROR {
    public static final String TYPE_NAME = "FulfillmentConstraintRuleDeleteUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class FULFILLMENTCREATEV2PAYLOAD {
    public static final String TYPE_NAME = "FulfillmentCreateV2Payload";

    public static final String Fulfillment = "fulfillment";

    public static final String UserErrors = "userErrors";
  }

  public static class FULFILLMENTEDGE {
    public static final String TYPE_NAME = "FulfillmentEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class FULFILLMENTEVENT {
    public static final String TYPE_NAME = "FulfillmentEvent";

    public static final String Address1 = "address1";

    public static final String City = "city";

    public static final String Country = "country";

    public static final String EstimatedDeliveryAt = "estimatedDeliveryAt";

    public static final String HappenedAt = "happenedAt";

    public static final String Id = "id";

    public static final String Latitude = "latitude";

    public static final String Longitude = "longitude";

    public static final String Message = "message";

    public static final String Province = "province";

    public static final String Status = "status";

    public static final String Zip = "zip";
  }

  public static class FULFILLMENTEVENTCONNECTION {
    public static final String TYPE_NAME = "FulfillmentEventConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class FULFILLMENTEVENTCREATEPAYLOAD {
    public static final String TYPE_NAME = "FulfillmentEventCreatePayload";

    public static final String FulfillmentEvent = "fulfillmentEvent";

    public static final String UserErrors = "userErrors";
  }

  public static class FULFILLMENTEVENTEDGE {
    public static final String TYPE_NAME = "FulfillmentEventEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class FULFILLMENTHOLD {
    public static final String TYPE_NAME = "FulfillmentHold";

    public static final String HeldBy = "heldBy";

    public static final String Reason = "reason";

    public static final String ReasonNotes = "reasonNotes";
  }

  public static class FULFILLMENTLINEITEM {
    public static final String TYPE_NAME = "FulfillmentLineItem";

    public static final String DiscountedTotal = "discountedTotal";

    public static final String DiscountedTotalSet = "discountedTotalSet";

    public static final String Id = "id";

    public static final String LineItem = "lineItem";

    public static final String OriginalTotal = "originalTotal";

    public static final String OriginalTotalSet = "originalTotalSet";

    public static final String Quantity = "quantity";
  }

  public static class FULFILLMENTLINEITEMCONNECTION {
    public static final String TYPE_NAME = "FulfillmentLineItemConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class FULFILLMENTLINEITEMEDGE {
    public static final String TYPE_NAME = "FulfillmentLineItemEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class FULFILLMENTORDER {
    public static final String TYPE_NAME = "FulfillmentOrder";

    public static final String AssignedLocation = "assignedLocation";

    public static final String ChannelId = "channelId";

    public static final String CreatedAt = "createdAt";

    public static final String DeliveryMethod = "deliveryMethod";

    public static final String Destination = "destination";

    public static final String FulfillAt = "fulfillAt";

    public static final String FulfillBy = "fulfillBy";

    public static final String FulfillmentHolds = "fulfillmentHolds";

    public static final String FulfillmentOrdersForMerge = "fulfillmentOrdersForMerge";

    public static final String Fulfillments = "fulfillments";

    public static final String Id = "id";

    public static final String InternationalDuties = "internationalDuties";

    public static final String LineItems = "lineItems";

    public static final String LocationsForMove = "locationsForMove";

    public static final String MerchantRequests = "merchantRequests";

    public static final String Order = "order";

    public static final String OrderId = "orderId";

    public static final String OrderName = "orderName";

    public static final String OrderProcessedAt = "orderProcessedAt";

    public static final String RequestStatus = "requestStatus";

    public static final String Status = "status";

    public static final String SupportedActions = "supportedActions";

    public static final String UpdatedAt = "updatedAt";

    public static class FULFILLMENTORDERSFORMERGE_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class FULFILLMENTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class LINEITEMS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class LOCATIONSFORMOVE_INPUT_ARGUMENT {
      public static final String LineItemIds = "lineItemIds";

      public static final String Query = "query";

      public static final String LocationIds = "locationIds";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class MERCHANTREQUESTS_INPUT_ARGUMENT {
      public static final String Kind = "kind";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class FULFILLMENTORDERACCEPTCANCELLATIONREQUESTPAYLOAD {
    public static final String TYPE_NAME = "FulfillmentOrderAcceptCancellationRequestPayload";

    public static final String FulfillmentOrder = "fulfillmentOrder";

    public static final String UserErrors = "userErrors";
  }

  public static class FULFILLMENTORDERACCEPTFULFILLMENTREQUESTPAYLOAD {
    public static final String TYPE_NAME = "FulfillmentOrderAcceptFulfillmentRequestPayload";

    public static final String FulfillmentOrder = "fulfillmentOrder";

    public static final String UserErrors = "userErrors";
  }

  public static class FULFILLMENTORDERASSIGNEDLOCATION {
    public static final String TYPE_NAME = "FulfillmentOrderAssignedLocation";

    public static final String Address1 = "address1";

    public static final String Address2 = "address2";

    public static final String City = "city";

    public static final String CountryCode = "countryCode";

    public static final String Location = "location";

    public static final String Name = "name";

    public static final String Phone = "phone";

    public static final String Province = "province";

    public static final String Zip = "zip";
  }

  public static class FULFILLMENTORDERCANCELPAYLOAD {
    public static final String TYPE_NAME = "FulfillmentOrderCancelPayload";

    public static final String FulfillmentOrder = "fulfillmentOrder";

    public static final String ReplacementFulfillmentOrder = "replacementFulfillmentOrder";

    public static final String UserErrors = "userErrors";
  }

  public static class FULFILLMENTORDERCLOSEPAYLOAD {
    public static final String TYPE_NAME = "FulfillmentOrderClosePayload";

    public static final String FulfillmentOrder = "fulfillmentOrder";

    public static final String UserErrors = "userErrors";
  }

  public static class FULFILLMENTORDERCONNECTION {
    public static final String TYPE_NAME = "FulfillmentOrderConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class FULFILLMENTORDERDESTINATION {
    public static final String TYPE_NAME = "FulfillmentOrderDestination";

    public static final String Address1 = "address1";

    public static final String Address2 = "address2";

    public static final String City = "city";

    public static final String Company = "company";

    public static final String CountryCode = "countryCode";

    public static final String Email = "email";

    public static final String FirstName = "firstName";

    public static final String Id = "id";

    public static final String LastName = "lastName";

    public static final String Phone = "phone";

    public static final String Province = "province";

    public static final String Zip = "zip";
  }

  public static class FULFILLMENTORDEREDGE {
    public static final String TYPE_NAME = "FulfillmentOrderEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class FULFILLMENTORDERHOLDPAYLOAD {
    public static final String TYPE_NAME = "FulfillmentOrderHoldPayload";

    public static final String FulfillmentOrder = "fulfillmentOrder";

    public static final String RemainingFulfillmentOrder = "remainingFulfillmentOrder";

    public static final String UserErrors = "userErrors";
  }

  public static class FULFILLMENTORDERHOLDUSERERROR {
    public static final String TYPE_NAME = "FulfillmentOrderHoldUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class FULFILLMENTORDERINTERNATIONALDUTIES {
    public static final String TYPE_NAME = "FulfillmentOrderInternationalDuties";

    public static final String Incoterm = "incoterm";
  }

  public static class FULFILLMENTORDERLINEITEM {
    public static final String TYPE_NAME = "FulfillmentOrderLineItem";

    public static final String FinancialSummaries = "financialSummaries";

    public static final String Id = "id";

    public static final String Image = "image";

    public static final String InventoryItemId = "inventoryItemId";

    public static final String LineItem = "lineItem";

    public static final String OriginalUnitPriceSet = "originalUnitPriceSet";

    public static final String ProductTitle = "productTitle";

    public static final String RemainingQuantity = "remainingQuantity";

    public static final String RequiresShipping = "requiresShipping";

    public static final String Sku = "sku";

    public static final String TotalQuantity = "totalQuantity";

    public static final String VariantTitle = "variantTitle";

    public static final String Vendor = "vendor";

    public static final String Warnings = "warnings";

    public static final String Weight = "weight";
  }

  public static class FULFILLMENTORDERLINEITEMCONNECTION {
    public static final String TYPE_NAME = "FulfillmentOrderLineItemConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class FULFILLMENTORDERLINEITEMEDGE {
    public static final String TYPE_NAME = "FulfillmentOrderLineItemEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class FULFILLMENTORDERLINEITEMFINANCIALSUMMARY {
    public static final String TYPE_NAME = "FulfillmentOrderLineItemFinancialSummary";

    public static final String ApproximateDiscountedUnitPriceSet = "approximateDiscountedUnitPriceSet";

    public static final String DiscountAllocations = "discountAllocations";

    public static final String OriginalUnitPriceSet = "originalUnitPriceSet";

    public static final String Quantity = "quantity";
  }

  public static class FULFILLMENTORDERLINEITEMSPREPAREDFORPICKUPPAYLOAD {
    public static final String TYPE_NAME = "FulfillmentOrderLineItemsPreparedForPickupPayload";

    public static final String UserErrors = "userErrors";
  }

  public static class FULFILLMENTORDERLINEITEMSPREPAREDFORPICKUPUSERERROR {
    public static final String TYPE_NAME = "FulfillmentOrderLineItemsPreparedForPickupUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class FULFILLMENTORDERLINEITEMWARNING {
    public static final String TYPE_NAME = "FulfillmentOrderLineItemWarning";

    public static final String Description = "description";

    public static final String Title = "title";
  }

  public static class FULFILLMENTORDERLOCATIONFORMOVE {
    public static final String TYPE_NAME = "FulfillmentOrderLocationForMove";

    public static final String AvailableLineItems = "availableLineItems";

    public static final String AvailableLineItemsCount = "availableLineItemsCount";

    public static final String Location = "location";

    public static final String Message = "message";

    public static final String Movable = "movable";

    public static final String UnavailableLineItems = "unavailableLineItems";

    public static final String UnavailableLineItemsCount = "unavailableLineItemsCount";

    public static class AVAILABLELINEITEMS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class UNAVAILABLELINEITEMS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class FULFILLMENTORDERLOCATIONFORMOVECONNECTION {
    public static final String TYPE_NAME = "FulfillmentOrderLocationForMoveConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class FULFILLMENTORDERLOCATIONFORMOVEEDGE {
    public static final String TYPE_NAME = "FulfillmentOrderLocationForMoveEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class FULFILLMENTORDERMERCHANTREQUEST {
    public static final String TYPE_NAME = "FulfillmentOrderMerchantRequest";

    public static final String FulfillmentOrder = "fulfillmentOrder";

    public static final String Id = "id";

    public static final String Kind = "kind";

    public static final String Message = "message";

    public static final String RequestOptions = "requestOptions";

    public static final String ResponseData = "responseData";

    public static final String SentAt = "sentAt";
  }

  public static class FULFILLMENTORDERMERCHANTREQUESTCONNECTION {
    public static final String TYPE_NAME = "FulfillmentOrderMerchantRequestConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class FULFILLMENTORDERMERCHANTREQUESTEDGE {
    public static final String TYPE_NAME = "FulfillmentOrderMerchantRequestEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class FULFILLMENTORDERMERGEPAYLOAD {
    public static final String TYPE_NAME = "FulfillmentOrderMergePayload";

    public static final String FulfillmentOrderMerges = "fulfillmentOrderMerges";

    public static final String UserErrors = "userErrors";
  }

  public static class FULFILLMENTORDERMERGERESULT {
    public static final String TYPE_NAME = "FulfillmentOrderMergeResult";

    public static final String FulfillmentOrder = "fulfillmentOrder";
  }

  public static class FULFILLMENTORDERMERGEUSERERROR {
    public static final String TYPE_NAME = "FulfillmentOrderMergeUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class FULFILLMENTORDERMOVEPAYLOAD {
    public static final String TYPE_NAME = "FulfillmentOrderMovePayload";

    public static final String MovedFulfillmentOrder = "movedFulfillmentOrder";

    public static final String OriginalFulfillmentOrder = "originalFulfillmentOrder";

    public static final String RemainingFulfillmentOrder = "remainingFulfillmentOrder";

    public static final String UserErrors = "userErrors";
  }

  public static class FULFILLMENTORDEROPENPAYLOAD {
    public static final String TYPE_NAME = "FulfillmentOrderOpenPayload";

    public static final String FulfillmentOrder = "fulfillmentOrder";

    public static final String UserErrors = "userErrors";
  }

  public static class FULFILLMENTORDERREJECTCANCELLATIONREQUESTPAYLOAD {
    public static final String TYPE_NAME = "FulfillmentOrderRejectCancellationRequestPayload";

    public static final String FulfillmentOrder = "fulfillmentOrder";

    public static final String UserErrors = "userErrors";
  }

  public static class FULFILLMENTORDERREJECTFULFILLMENTREQUESTPAYLOAD {
    public static final String TYPE_NAME = "FulfillmentOrderRejectFulfillmentRequestPayload";

    public static final String FulfillmentOrder = "fulfillmentOrder";

    public static final String UserErrors = "userErrors";
  }

  public static class FULFILLMENTORDERRELEASEHOLDPAYLOAD {
    public static final String TYPE_NAME = "FulfillmentOrderReleaseHoldPayload";

    public static final String FulfillmentOrder = "fulfillmentOrder";

    public static final String UserErrors = "userErrors";
  }

  public static class FULFILLMENTORDERRELEASEHOLDUSERERROR {
    public static final String TYPE_NAME = "FulfillmentOrderReleaseHoldUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class FULFILLMENTORDERRESCHEDULEPAYLOAD {
    public static final String TYPE_NAME = "FulfillmentOrderReschedulePayload";

    public static final String FulfillmentOrder = "fulfillmentOrder";

    public static final String UserErrors = "userErrors";
  }

  public static class FULFILLMENTORDERRESCHEDULEUSERERROR {
    public static final String TYPE_NAME = "FulfillmentOrderRescheduleUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class FULFILLMENTORDERSPLITPAYLOAD {
    public static final String TYPE_NAME = "FulfillmentOrderSplitPayload";

    public static final String FulfillmentOrderSplits = "fulfillmentOrderSplits";

    public static final String UserErrors = "userErrors";
  }

  public static class FULFILLMENTORDERSPLITRESULT {
    public static final String TYPE_NAME = "FulfillmentOrderSplitResult";

    public static final String FulfillmentOrder = "fulfillmentOrder";

    public static final String RemainingFulfillmentOrder = "remainingFulfillmentOrder";

    public static final String ReplacementFulfillmentOrder = "replacementFulfillmentOrder";
  }

  public static class FULFILLMENTORDERSPLITUSERERROR {
    public static final String TYPE_NAME = "FulfillmentOrderSplitUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class FULFILLMENTORDERSRELEASEHOLDSPAYLOAD {
    public static final String TYPE_NAME = "FulfillmentOrdersReleaseHoldsPayload";

    public static final String Job = "job";

    public static final String UserErrors = "userErrors";
  }

  public static class FULFILLMENTORDERSRELEASEHOLDSUSERERROR {
    public static final String TYPE_NAME = "FulfillmentOrdersReleaseHoldsUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class FULFILLMENTORDERSSETFULFILLMENTDEADLINEPAYLOAD {
    public static final String TYPE_NAME = "FulfillmentOrdersSetFulfillmentDeadlinePayload";

    public static final String Success = "success";

    public static final String UserErrors = "userErrors";
  }

  public static class FULFILLMENTORDERSSETFULFILLMENTDEADLINEUSERERROR {
    public static final String TYPE_NAME = "FulfillmentOrdersSetFulfillmentDeadlineUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class FULFILLMENTORDERSUBMITCANCELLATIONREQUESTPAYLOAD {
    public static final String TYPE_NAME = "FulfillmentOrderSubmitCancellationRequestPayload";

    public static final String FulfillmentOrder = "fulfillmentOrder";

    public static final String UserErrors = "userErrors";
  }

  public static class FULFILLMENTORDERSUBMITFULFILLMENTREQUESTPAYLOAD {
    public static final String TYPE_NAME = "FulfillmentOrderSubmitFulfillmentRequestPayload";

    public static final String OriginalFulfillmentOrder = "originalFulfillmentOrder";

    public static final String SubmittedFulfillmentOrder = "submittedFulfillmentOrder";

    public static final String UnsubmittedFulfillmentOrder = "unsubmittedFulfillmentOrder";

    public static final String UserErrors = "userErrors";
  }

  public static class FULFILLMENTORDERSUPPORTEDACTION {
    public static final String TYPE_NAME = "FulfillmentOrderSupportedAction";

    public static final String Action = "action";

    public static final String ExternalUrl = "externalUrl";
  }

  public static class FULFILLMENTORIGINADDRESS {
    public static final String TYPE_NAME = "FulfillmentOriginAddress";

    public static final String Address1 = "address1";

    public static final String Address2 = "address2";

    public static final String City = "city";

    public static final String CountryCode = "countryCode";

    public static final String ProvinceCode = "provinceCode";

    public static final String Zip = "zip";
  }

  public static class FULFILLMENTSERVICE {
    public static final String TYPE_NAME = "FulfillmentService";

    public static final String CallbackUrl = "callbackUrl";

    public static final String FulfillmentOrdersOptIn = "fulfillmentOrdersOptIn";

    public static final String Handle = "handle";

    public static final String Id = "id";

    public static final String InventoryManagement = "inventoryManagement";

    public static final String Location = "location";

    public static final String PermitsSkuSharing = "permitsSkuSharing";

    public static final String ProductBased = "productBased";

    public static final String ServiceName = "serviceName";

    public static final String ShippingMethods = "shippingMethods";

    public static final String Type = "type";
  }

  public static class FULFILLMENTSERVICECREATEPAYLOAD {
    public static final String TYPE_NAME = "FulfillmentServiceCreatePayload";

    public static final String FulfillmentService = "fulfillmentService";

    public static final String UserErrors = "userErrors";
  }

  public static class FULFILLMENTSERVICEDELETEPAYLOAD {
    public static final String TYPE_NAME = "FulfillmentServiceDeletePayload";

    public static final String DeletedId = "deletedId";

    public static final String UserErrors = "userErrors";
  }

  public static class FULFILLMENTSERVICEUPDATEPAYLOAD {
    public static final String TYPE_NAME = "FulfillmentServiceUpdatePayload";

    public static final String FulfillmentService = "fulfillmentService";

    public static final String UserErrors = "userErrors";
  }

  public static class FULFILLMENTTRACKINGINFO {
    public static final String TYPE_NAME = "FulfillmentTrackingInfo";

    public static final String Company = "company";

    public static final String Number = "number";

    public static final String Url = "url";
  }

  public static class FULFILLMENTTRACKINGINFOUPDATEV2PAYLOAD {
    public static final String TYPE_NAME = "FulfillmentTrackingInfoUpdateV2Payload";

    public static final String Fulfillment = "fulfillment";

    public static final String UserErrors = "userErrors";
  }

  public static class FUNCTIONSAPPBRIDGE {
    public static final String TYPE_NAME = "FunctionsAppBridge";

    public static final String CreatePath = "createPath";

    public static final String DetailsPath = "detailsPath";
  }

  public static class FUNCTIONSERRORHISTORY {
    public static final String TYPE_NAME = "FunctionsErrorHistory";

    public static final String ErrorsFirstOccurredAt = "errorsFirstOccurredAt";

    public static final String FirstOccurredAt = "firstOccurredAt";

    public static final String HasBeenSharedSinceLastError = "hasBeenSharedSinceLastError";

    public static final String HasSharedRecentErrors = "hasSharedRecentErrors";
  }

  public static class GENERICFILE {
    public static final String TYPE_NAME = "GenericFile";

    public static final String Alt = "alt";

    public static final String CreatedAt = "createdAt";

    public static final String FileErrors = "fileErrors";

    public static final String FileStatus = "fileStatus";

    public static final String Id = "id";

    public static final String MimeType = "mimeType";

    public static final String OriginalFileSize = "originalFileSize";

    public static final String Preview = "preview";

    public static final String UpdatedAt = "updatedAt";

    public static final String Url = "url";
  }

  public static class GIFTCARD {
    public static final String TYPE_NAME = "GiftCard";

    public static final String Balance = "balance";

    public static final String CreatedAt = "createdAt";

    public static final String Customer = "customer";

    public static final String DisabledAt = "disabledAt";

    public static final String Enabled = "enabled";

    public static final String ExpiresOn = "expiresOn";

    public static final String Id = "id";

    public static final String InitialValue = "initialValue";

    public static final String LastCharacters = "lastCharacters";

    public static final String MaskedCode = "maskedCode";

    public static final String Note = "note";

    public static final String Order = "order";
  }

  public static class GIFTCARDCONNECTION {
    public static final String TYPE_NAME = "GiftCardConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class GIFTCARDCREATEPAYLOAD {
    public static final String TYPE_NAME = "GiftCardCreatePayload";

    public static final String GiftCard = "giftCard";

    public static final String GiftCardCode = "giftCardCode";

    public static final String UserErrors = "userErrors";
  }

  public static class GIFTCARDDISABLEPAYLOAD {
    public static final String TYPE_NAME = "GiftCardDisablePayload";

    public static final String GiftCard = "giftCard";

    public static final String UserErrors = "userErrors";
  }

  public static class GIFTCARDEDGE {
    public static final String TYPE_NAME = "GiftCardEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class GIFTCARDSALE {
    public static final String TYPE_NAME = "GiftCardSale";

    public static final String ActionType = "actionType";

    public static final String Id = "id";

    public static final String LineItem = "lineItem";

    public static final String LineType = "lineType";

    public static final String Quantity = "quantity";

    public static final String Taxes = "taxes";

    public static final String TotalAmount = "totalAmount";

    public static final String TotalDiscountAmountAfterTaxes = "totalDiscountAmountAfterTaxes";

    public static final String TotalDiscountAmountBeforeTaxes = "totalDiscountAmountBeforeTaxes";

    public static final String TotalTaxAmount = "totalTaxAmount";
  }

  public static class GIFTCARDUPDATEPAYLOAD {
    public static final String TYPE_NAME = "GiftCardUpdatePayload";

    public static final String GiftCard = "giftCard";

    public static final String UserErrors = "userErrors";
  }

  public static class GIFTCARDUSERERROR {
    public static final String TYPE_NAME = "GiftCardUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class IMAGE {
    public static final String TYPE_NAME = "Image";

    public static final String AltText = "altText";

    public static final String Height = "height";

    public static final String Id = "id";

    public static final String Metafield = "metafield";

    public static final String Metafields = "metafields";

    public static final String OriginalSrc = "originalSrc";

    public static final String PrivateMetafield = "privateMetafield";

    public static final String PrivateMetafields = "privateMetafields";

    public static final String Src = "src";

    public static final String TransformedSrc = "transformedSrc";

    public static final String Url = "url";

    public static final String Width = "width";

    public static class METAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class METAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Keys = "keys";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PRIVATEMETAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class PRIVATEMETAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class TRANSFORMEDSRC_INPUT_ARGUMENT {
      public static final String MaxWidth = "maxWidth";

      public static final String MaxHeight = "maxHeight";

      public static final String Crop = "crop";

      public static final String Scale = "scale";

      public static final String PreferredContentType = "preferredContentType";
    }

    public static class URL_INPUT_ARGUMENT {
      public static final String Transform = "transform";
    }
  }

  public static class IMAGECONNECTION {
    public static final String TYPE_NAME = "ImageConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class IMAGEEDGE {
    public static final String TYPE_NAME = "ImageEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class IMAGEUPLOADPARAMETER {
    public static final String TYPE_NAME = "ImageUploadParameter";

    public static final String Name = "name";

    public static final String Value = "value";
  }

  public static class INVENTORYACTIVATEPAYLOAD {
    public static final String TYPE_NAME = "InventoryActivatePayload";

    public static final String InventoryLevel = "inventoryLevel";

    public static final String UserErrors = "userErrors";
  }

  public static class INVENTORYADJUSTMENTGROUP {
    public static final String TYPE_NAME = "InventoryAdjustmentGroup";

    public static final String App = "app";

    public static final String Changes = "changes";

    public static final String CreatedAt = "createdAt";

    public static final String Id = "id";

    public static final String Reason = "reason";

    public static final String ReferenceDocumentUri = "referenceDocumentUri";

    public static final String StaffMember = "staffMember";

    public static class CHANGES_INPUT_ARGUMENT {
      public static final String InventoryItemIds = "inventoryItemIds";

      public static final String LocationIds = "locationIds";

      public static final String QuantityNames = "quantityNames";
    }
  }

  public static class INVENTORYADJUSTQUANTITIESPAYLOAD {
    public static final String TYPE_NAME = "InventoryAdjustQuantitiesPayload";

    public static final String InventoryAdjustmentGroup = "inventoryAdjustmentGroup";

    public static final String UserErrors = "userErrors";
  }

  public static class INVENTORYADJUSTQUANTITIESUSERERROR {
    public static final String TYPE_NAME = "InventoryAdjustQuantitiesUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class INVENTORYADJUSTQUANTITYPAYLOAD {
    public static final String TYPE_NAME = "InventoryAdjustQuantityPayload";

    public static final String InventoryLevel = "inventoryLevel";

    public static final String UserErrors = "userErrors";
  }

  public static class INVENTORYBULKADJUSTQUANTITYATLOCATIONPAYLOAD {
    public static final String TYPE_NAME = "InventoryBulkAdjustQuantityAtLocationPayload";

    public static final String InventoryLevels = "inventoryLevels";

    public static final String UserErrors = "userErrors";
  }

  public static class INVENTORYBULKTOGGLEACTIVATIONPAYLOAD {
    public static final String TYPE_NAME = "InventoryBulkToggleActivationPayload";

    public static final String InventoryItem = "inventoryItem";

    public static final String InventoryLevels = "inventoryLevels";

    public static final String UserErrors = "userErrors";
  }

  public static class INVENTORYBULKTOGGLEACTIVATIONUSERERROR {
    public static final String TYPE_NAME = "InventoryBulkToggleActivationUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class INVENTORYCHANGE {
    public static final String TYPE_NAME = "InventoryChange";

    public static final String Delta = "delta";

    public static final String Item = "item";

    public static final String LedgerDocumentUri = "ledgerDocumentUri";

    public static final String Location = "location";

    public static final String Name = "name";

    public static final String QuantityAfterChange = "quantityAfterChange";
  }

  public static class INVENTORYDEACTIVATEPAYLOAD {
    public static final String TYPE_NAME = "InventoryDeactivatePayload";

    public static final String UserErrors = "userErrors";
  }

  public static class INVENTORYITEM {
    public static final String TYPE_NAME = "InventoryItem";

    public static final String CountryCodeOfOrigin = "countryCodeOfOrigin";

    public static final String CountryHarmonizedSystemCodes = "countryHarmonizedSystemCodes";

    public static final String CreatedAt = "createdAt";

    public static final String DuplicateSkuCount = "duplicateSkuCount";

    public static final String HarmonizedSystemCode = "harmonizedSystemCode";

    public static final String Id = "id";

    public static final String InventoryHistoryUrl = "inventoryHistoryUrl";

    public static final String InventoryLevel = "inventoryLevel";

    public static final String InventoryLevels = "inventoryLevels";

    public static final String LegacyResourceId = "legacyResourceId";

    public static final String LocationsCount = "locationsCount";

    public static final String ProvinceCodeOfOrigin = "provinceCodeOfOrigin";

    public static final String RequiresShipping = "requiresShipping";

    public static final String Sku = "sku";

    public static final String Tracked = "tracked";

    public static final String TrackedEditable = "trackedEditable";

    public static final String UnitCost = "unitCost";

    public static final String UpdatedAt = "updatedAt";

    public static final String Variant = "variant";

    public static class COUNTRYHARMONIZEDSYSTEMCODES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class INVENTORYLEVEL_INPUT_ARGUMENT {
      public static final String LocationId = "locationId";
    }

    public static class INVENTORYLEVELS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String Query = "query";
    }
  }

  public static class INVENTORYITEMCONNECTION {
    public static final String TYPE_NAME = "InventoryItemConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class INVENTORYITEMEDGE {
    public static final String TYPE_NAME = "InventoryItemEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class INVENTORYITEMUPDATEPAYLOAD {
    public static final String TYPE_NAME = "InventoryItemUpdatePayload";

    public static final String InventoryItem = "inventoryItem";

    public static final String UserErrors = "userErrors";
  }

  public static class INVENTORYLEVEL {
    public static final String TYPE_NAME = "InventoryLevel";

    public static final String Available = "available";

    public static final String CanDeactivate = "canDeactivate";

    public static final String CreatedAt = "createdAt";

    public static final String DeactivationAlert = "deactivationAlert";

    public static final String DeactivationAlertHtml = "deactivationAlertHtml";

    public static final String Id = "id";

    public static final String Incoming = "incoming";

    public static final String Item = "item";

    public static final String Location = "location";

    public static final String Quantities = "quantities";

    public static final String ScheduledChanges = "scheduledChanges";

    public static final String UpdatedAt = "updatedAt";

    public static class QUANTITIES_INPUT_ARGUMENT {
      public static final String Names = "names";
    }

    public static class SCHEDULEDCHANGES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }
  }

  public static class INVENTORYLEVELCONNECTION {
    public static final String TYPE_NAME = "InventoryLevelConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class INVENTORYLEVELEDGE {
    public static final String TYPE_NAME = "InventoryLevelEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class INVENTORYMOVEQUANTITIESPAYLOAD {
    public static final String TYPE_NAME = "InventoryMoveQuantitiesPayload";

    public static final String InventoryAdjustmentGroup = "inventoryAdjustmentGroup";

    public static final String UserErrors = "userErrors";
  }

  public static class INVENTORYMOVEQUANTITIESUSERERROR {
    public static final String TYPE_NAME = "InventoryMoveQuantitiesUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class INVENTORYPROPERTIES {
    public static final String TYPE_NAME = "InventoryProperties";

    public static final String QuantityNames = "quantityNames";
  }

  public static class INVENTORYQUANTITY {
    public static final String TYPE_NAME = "InventoryQuantity";

    public static final String Id = "id";

    public static final String Name = "name";

    public static final String Quantity = "quantity";

    public static final String UpdatedAt = "updatedAt";
  }

  public static class INVENTORYQUANTITYNAME {
    public static final String TYPE_NAME = "InventoryQuantityName";

    public static final String BelongsTo = "belongsTo";

    public static final String Comprises = "comprises";

    public static final String DisplayName = "displayName";

    public static final String IsInUse = "isInUse";

    public static final String Name = "name";
  }

  public static class INVENTORYSCHEDULEDCHANGE {
    public static final String TYPE_NAME = "InventoryScheduledChange";

    public static final String ExpectedAt = "expectedAt";

    public static final String FromName = "fromName";

    public static final String InventoryLevel = "inventoryLevel";

    public static final String LedgerDocumentUri = "ledgerDocumentUri";

    public static final String Quantity = "quantity";

    public static final String ToName = "toName";
  }

  public static class INVENTORYSCHEDULEDCHANGECONNECTION {
    public static final String TYPE_NAME = "InventoryScheduledChangeConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class INVENTORYSCHEDULEDCHANGEEDGE {
    public static final String TYPE_NAME = "InventoryScheduledChangeEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class INVENTORYSETONHANDQUANTITIESPAYLOAD {
    public static final String TYPE_NAME = "InventorySetOnHandQuantitiesPayload";

    public static final String InventoryAdjustmentGroup = "inventoryAdjustmentGroup";

    public static final String UserErrors = "userErrors";
  }

  public static class INVENTORYSETONHANDQUANTITIESUSERERROR {
    public static final String TYPE_NAME = "InventorySetOnHandQuantitiesUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class INVENTORYSETSCHEDULEDCHANGESPAYLOAD {
    public static final String TYPE_NAME = "InventorySetScheduledChangesPayload";

    public static final String ScheduledChanges = "scheduledChanges";

    public static final String UserErrors = "userErrors";
  }

  public static class INVENTORYSETSCHEDULEDCHANGESUSERERROR {
    public static final String TYPE_NAME = "InventorySetScheduledChangesUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class JOB {
    public static final String TYPE_NAME = "Job";

    public static final String Done = "done";

    public static final String Id = "id";

    public static final String Query = "query";
  }

  public static class LIMITEDPENDINGORDERCOUNT {
    public static final String TYPE_NAME = "LimitedPendingOrderCount";

    public static final String AtMax = "atMax";

    public static final String Count = "count";
  }

  public static class LINEITEM {
    public static final String TYPE_NAME = "LineItem";

    public static final String CanRestock = "canRestock";

    public static final String Contract = "contract";

    public static final String CurrentQuantity = "currentQuantity";

    public static final String CustomAttributes = "customAttributes";

    public static final String DiscountAllocations = "discountAllocations";

    public static final String DiscountedTotal = "discountedTotal";

    public static final String DiscountedTotalSet = "discountedTotalSet";

    public static final String DiscountedUnitPrice = "discountedUnitPrice";

    public static final String DiscountedUnitPriceAfterAllDiscountsSet = "discountedUnitPriceAfterAllDiscountsSet";

    public static final String DiscountedUnitPriceSet = "discountedUnitPriceSet";

    public static final String Duties = "duties";

    public static final String FulfillableQuantity = "fulfillableQuantity";

    public static final String FulfillmentService = "fulfillmentService";

    public static final String FulfillmentStatus = "fulfillmentStatus";

    public static final String Id = "id";

    public static final String Image = "image";

    public static final String LineItemGroup = "lineItemGroup";

    public static final String MerchantEditable = "merchantEditable";

    public static final String Name = "name";

    public static final String NonFulfillableQuantity = "nonFulfillableQuantity";

    public static final String OriginalTotal = "originalTotal";

    public static final String OriginalTotalSet = "originalTotalSet";

    public static final String OriginalUnitPrice = "originalUnitPrice";

    public static final String OriginalUnitPriceSet = "originalUnitPriceSet";

    public static final String Product = "product";

    public static final String Quantity = "quantity";

    public static final String RefundableQuantity = "refundableQuantity";

    public static final String RequiresShipping = "requiresShipping";

    public static final String Restockable = "restockable";

    public static final String SellingPlan = "sellingPlan";

    public static final String Sku = "sku";

    public static final String StaffMember = "staffMember";

    public static final String TaxLines = "taxLines";

    public static final String Taxable = "taxable";

    public static final String Title = "title";

    public static final String TotalDiscount = "totalDiscount";

    public static final String TotalDiscountSet = "totalDiscountSet";

    public static final String UnfulfilledDiscountedTotal = "unfulfilledDiscountedTotal";

    public static final String UnfulfilledDiscountedTotalSet = "unfulfilledDiscountedTotalSet";

    public static final String UnfulfilledOriginalTotal = "unfulfilledOriginalTotal";

    public static final String UnfulfilledOriginalTotalSet = "unfulfilledOriginalTotalSet";

    public static final String UnfulfilledQuantity = "unfulfilledQuantity";

    public static final String Variant = "variant";

    public static final String VariantTitle = "variantTitle";

    public static final String Vendor = "vendor";

    public static class TAXLINES_INPUT_ARGUMENT {
      public static final String First = "first";
    }
  }

  public static class LINEITEMCONNECTION {
    public static final String TYPE_NAME = "LineItemConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class LINEITEMEDGE {
    public static final String TYPE_NAME = "LineItemEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class LINEITEMGROUP {
    public static final String TYPE_NAME = "LineItemGroup";

    public static final String Id = "id";

    public static final String Quantity = "quantity";

    public static final String Title = "title";

    public static final String VariantId = "variantId";

    public static final String VariantSku = "variantSku";
  }

  public static class LINEITEMMUTABLE {
    public static final String TYPE_NAME = "LineItemMutable";

    public static final String CanRestock = "canRestock";

    public static final String CustomAttributes = "customAttributes";

    public static final String DiscountAllocations = "discountAllocations";

    public static final String DiscountedTotal = "discountedTotal";

    public static final String DiscountedTotalSet = "discountedTotalSet";

    public static final String DiscountedUnitPrice = "discountedUnitPrice";

    public static final String DiscountedUnitPriceSet = "discountedUnitPriceSet";

    public static final String FulfillableQuantity = "fulfillableQuantity";

    public static final String FulfillmentService = "fulfillmentService";

    public static final String FulfillmentStatus = "fulfillmentStatus";

    public static final String Id = "id";

    public static final String Image = "image";

    public static final String MerchantEditable = "merchantEditable";

    public static final String Name = "name";

    public static final String NonFulfillableQuantity = "nonFulfillableQuantity";

    public static final String OriginalTotal = "originalTotal";

    public static final String OriginalTotalSet = "originalTotalSet";

    public static final String OriginalUnitPrice = "originalUnitPrice";

    public static final String OriginalUnitPriceSet = "originalUnitPriceSet";

    public static final String Product = "product";

    public static final String Quantity = "quantity";

    public static final String RefundableQuantity = "refundableQuantity";

    public static final String RequiresShipping = "requiresShipping";

    public static final String Restockable = "restockable";

    public static final String Sku = "sku";

    public static final String StaffMember = "staffMember";

    public static final String TaxLines = "taxLines";

    public static final String Taxable = "taxable";

    public static final String Title = "title";

    public static final String TotalDiscount = "totalDiscount";

    public static final String TotalDiscountSet = "totalDiscountSet";

    public static final String UnfulfilledDiscountedTotal = "unfulfilledDiscountedTotal";

    public static final String UnfulfilledDiscountedTotalSet = "unfulfilledDiscountedTotalSet";

    public static final String UnfulfilledOriginalTotal = "unfulfilledOriginalTotal";

    public static final String UnfulfilledOriginalTotalSet = "unfulfilledOriginalTotalSet";

    public static final String UnfulfilledQuantity = "unfulfilledQuantity";

    public static final String Variant = "variant";

    public static final String VariantTitle = "variantTitle";

    public static final String Vendor = "vendor";

    public static class TAXLINES_INPUT_ARGUMENT {
      public static final String First = "first";
    }
  }

  public static class LINEITEMMUTABLECONNECTION {
    public static final String TYPE_NAME = "LineItemMutableConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class LINEITEMMUTABLEEDGE {
    public static final String TYPE_NAME = "LineItemMutableEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class LINEITEMSELLINGPLAN {
    public static final String TYPE_NAME = "LineItemSellingPlan";

    public static final String Name = "name";

    public static final String SellingPlanId = "sellingPlanId";
  }

  public static class LINK {
    public static final String TYPE_NAME = "Link";

    public static final String Label = "label";

    public static final String Translations = "translations";

    public static final String Url = "url";

    public static class TRANSLATIONS_INPUT_ARGUMENT {
      public static final String Locale = "locale";

      public static final String MarketId = "marketId";
    }
  }

  public static class LOCALE {
    public static final String TYPE_NAME = "Locale";

    public static final String IsoCode = "isoCode";

    public static final String Name = "name";
  }

  public static class LOCALIZATIONEXTENSION {
    public static final String TYPE_NAME = "LocalizationExtension";

    public static final String CountryCode = "countryCode";

    public static final String Key = "key";

    public static final String Purpose = "purpose";

    public static final String Title = "title";

    public static final String Value = "value";
  }

  public static class LOCALIZATIONEXTENSIONCONNECTION {
    public static final String TYPE_NAME = "LocalizationExtensionConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class LOCALIZATIONEXTENSIONEDGE {
    public static final String TYPE_NAME = "LocalizationExtensionEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class LOCATION {
    public static final String TYPE_NAME = "Location";

    public static final String Activatable = "activatable";

    public static final String Address = "address";

    public static final String AddressVerified = "addressVerified";

    public static final String Deactivatable = "deactivatable";

    public static final String DeactivatedAt = "deactivatedAt";

    public static final String Deletable = "deletable";

    public static final String FulfillmentService = "fulfillmentService";

    public static final String FulfillsOnlineOrders = "fulfillsOnlineOrders";

    public static final String HasActiveInventory = "hasActiveInventory";

    public static final String HasUnfulfilledOrders = "hasUnfulfilledOrders";

    public static final String Id = "id";

    public static final String InventoryLevel = "inventoryLevel";

    public static final String InventoryLevels = "inventoryLevels";

    public static final String IsActive = "isActive";

    public static final String IsPrimary = "isPrimary";

    public static final String LegacyResourceId = "legacyResourceId";

    public static final String LocalPickupSettingsV2 = "localPickupSettingsV2";

    public static final String Metafield = "metafield";

    public static final String MetafieldDefinitions = "metafieldDefinitions";

    public static final String Metafields = "metafields";

    public static final String Name = "name";

    public static final String PrivateMetafield = "privateMetafield";

    public static final String PrivateMetafields = "privateMetafields";

    public static final String ShipsInventory = "shipsInventory";

    public static final String SuggestedAddresses = "suggestedAddresses";

    public static class INVENTORYLEVEL_INPUT_ARGUMENT {
      public static final String InventoryItemId = "inventoryItemId";
    }

    public static class INVENTORYLEVELS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String Query = "query";
    }

    public static class METAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class METAFIELDDEFINITIONS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String PinnedStatus = "pinnedStatus";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class METAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Keys = "keys";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PRIVATEMETAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class PRIVATEMETAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class LOCATIONACTIVATEPAYLOAD {
    public static final String TYPE_NAME = "LocationActivatePayload";

    public static final String Location = "location";

    public static final String LocationActivateUserErrors = "locationActivateUserErrors";
  }

  public static class LOCATIONACTIVATEUSERERROR {
    public static final String TYPE_NAME = "LocationActivateUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class LOCATIONADDPAYLOAD {
    public static final String TYPE_NAME = "LocationAddPayload";

    public static final String Location = "location";

    public static final String UserErrors = "userErrors";
  }

  public static class LOCATIONADDRESS {
    public static final String TYPE_NAME = "LocationAddress";

    public static final String Address1 = "address1";

    public static final String Address2 = "address2";

    public static final String City = "city";

    public static final String Country = "country";

    public static final String CountryCode = "countryCode";

    public static final String Formatted = "formatted";

    public static final String Latitude = "latitude";

    public static final String Longitude = "longitude";

    public static final String Phone = "phone";

    public static final String Province = "province";

    public static final String ProvinceCode = "provinceCode";

    public static final String Zip = "zip";
  }

  public static class LOCATIONADDUSERERROR {
    public static final String TYPE_NAME = "LocationAddUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class LOCATIONCONNECTION {
    public static final String TYPE_NAME = "LocationConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class LOCATIONDEACTIVATEPAYLOAD {
    public static final String TYPE_NAME = "LocationDeactivatePayload";

    public static final String Location = "location";

    public static final String LocationDeactivateUserErrors = "locationDeactivateUserErrors";
  }

  public static class LOCATIONDEACTIVATEUSERERROR {
    public static final String TYPE_NAME = "LocationDeactivateUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class LOCATIONDELETEPAYLOAD {
    public static final String TYPE_NAME = "LocationDeletePayload";

    public static final String DeletedLocationId = "deletedLocationId";

    public static final String LocationDeleteUserErrors = "locationDeleteUserErrors";
  }

  public static class LOCATIONDELETEUSERERROR {
    public static final String TYPE_NAME = "LocationDeleteUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class LOCATIONEDGE {
    public static final String TYPE_NAME = "LocationEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class LOCATIONEDITPAYLOAD {
    public static final String TYPE_NAME = "LocationEditPayload";

    public static final String Location = "location";

    public static final String UserErrors = "userErrors";
  }

  public static class LOCATIONEDITUSERERROR {
    public static final String TYPE_NAME = "LocationEditUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class LOCATIONLOCALPICKUPDISABLEPAYLOAD {
    public static final String TYPE_NAME = "LocationLocalPickupDisablePayload";

    public static final String LocationId = "locationId";

    public static final String UserErrors = "userErrors";
  }

  public static class LOCATIONLOCALPICKUPENABLEPAYLOAD {
    public static final String TYPE_NAME = "LocationLocalPickupEnablePayload";

    public static final String LocalPickupSettings = "localPickupSettings";

    public static final String UserErrors = "userErrors";
  }

  public static class LOCATIONSUGGESTEDADDRESS {
    public static final String TYPE_NAME = "LocationSuggestedAddress";

    public static final String Address1 = "address1";

    public static final String Address2 = "address2";

    public static final String City = "city";

    public static final String Country = "country";

    public static final String CountryCode = "countryCode";

    public static final String Formatted = "formatted";

    public static final String Province = "province";

    public static final String ProvinceCode = "provinceCode";

    public static final String Zip = "zip";
  }

  public static class MAILINGADDRESS {
    public static final String TYPE_NAME = "MailingAddress";

    public static final String Address1 = "address1";

    public static final String Address2 = "address2";

    public static final String City = "city";

    public static final String Company = "company";

    public static final String CoordinatesValidated = "coordinatesValidated";

    public static final String Country = "country";

    public static final String CountryCode = "countryCode";

    public static final String CountryCodeV2 = "countryCodeV2";

    public static final String FirstName = "firstName";

    public static final String Formatted = "formatted";

    public static final String FormattedArea = "formattedArea";

    public static final String Id = "id";

    public static final String LastName = "lastName";

    public static final String Latitude = "latitude";

    public static final String Longitude = "longitude";

    public static final String Name = "name";

    public static final String Phone = "phone";

    public static final String Province = "province";

    public static final String ProvinceCode = "provinceCode";

    public static final String TimeZone = "timeZone";

    public static final String Zip = "zip";

    public static class FORMATTED_INPUT_ARGUMENT {
      public static final String WithName = "withName";

      public static final String WithCompany = "withCompany";
    }
  }

  public static class MAILINGADDRESSCONNECTION {
    public static final String TYPE_NAME = "MailingAddressConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class MAILINGADDRESSEDGE {
    public static final String TYPE_NAME = "MailingAddressEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class MANUALDISCOUNTAPPLICATION {
    public static final String TYPE_NAME = "ManualDiscountApplication";

    public static final String AllocationMethod = "allocationMethod";

    public static final String Description = "description";

    public static final String Index = "index";

    public static final String TargetSelection = "targetSelection";

    public static final String TargetType = "targetType";

    public static final String Title = "title";

    public static final String Value = "value";
  }

  public static class MARKET {
    public static final String TYPE_NAME = "Market";

    public static final String Catalogs = "catalogs";

    public static final String CurrencySettings = "currencySettings";

    public static final String Enabled = "enabled";

    public static final String Handle = "handle";

    public static final String Id = "id";

    public static final String Metafield = "metafield";

    public static final String MetafieldDefinitions = "metafieldDefinitions";

    public static final String Metafields = "metafields";

    public static final String Name = "name";

    public static final String PriceList = "priceList";

    public static final String Primary = "primary";

    public static final String PrivateMetafield = "privateMetafield";

    public static final String PrivateMetafields = "privateMetafields";

    public static final String Regions = "regions";

    public static final String WebPresence = "webPresence";

    public static final String WebPresences = "webPresences";

    public static class CATALOGS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class METAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class METAFIELDDEFINITIONS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String PinnedStatus = "pinnedStatus";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class METAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Keys = "keys";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PRIVATEMETAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class PRIVATEMETAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class REGIONS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class WEBPRESENCES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class MARKETCATALOG {
    public static final String TYPE_NAME = "MarketCatalog";

    public static final String Id = "id";

    public static final String Markets = "markets";

    public static final String Operations = "operations";

    public static final String PriceList = "priceList";

    public static final String Publication = "publication";

    public static final String Status = "status";

    public static final String Title = "title";

    public static class MARKETS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class MARKETCATALOGCONNECTION {
    public static final String TYPE_NAME = "MarketCatalogConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class MARKETCATALOGEDGE {
    public static final String TYPE_NAME = "MarketCatalogEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class MARKETCONNECTION {
    public static final String TYPE_NAME = "MarketConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class MARKETCREATEPAYLOAD {
    public static final String TYPE_NAME = "MarketCreatePayload";

    public static final String Market = "market";

    public static final String UserErrors = "userErrors";
  }

  public static class MARKETCURRENCYSETTINGS {
    public static final String TYPE_NAME = "MarketCurrencySettings";

    public static final String BaseCurrency = "baseCurrency";

    public static final String LocalCurrencies = "localCurrencies";
  }

  public static class MARKETCURRENCYSETTINGSUPDATEPAYLOAD {
    public static final String TYPE_NAME = "MarketCurrencySettingsUpdatePayload";

    public static final String Market = "market";

    public static final String UserErrors = "userErrors";
  }

  public static class MARKETCURRENCYSETTINGSUSERERROR {
    public static final String TYPE_NAME = "MarketCurrencySettingsUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class MARKETDELETEPAYLOAD {
    public static final String TYPE_NAME = "MarketDeletePayload";

    public static final String DeletedId = "deletedId";

    public static final String UserErrors = "userErrors";
  }

  public static class MARKETEDGE {
    public static final String TYPE_NAME = "MarketEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class MARKETINGACTIVITIESDELETEALLEXTERNALPAYLOAD {
    public static final String TYPE_NAME = "MarketingActivitiesDeleteAllExternalPayload";

    public static final String Job = "job";

    public static final String UserErrors = "userErrors";
  }

  public static class MARKETINGACTIVITY {
    public static final String TYPE_NAME = "MarketingActivity";

    public static final String ActivityListUrl = "activityListUrl";

    public static final String AdSpend = "adSpend";

    public static final String App = "app";

    public static final String AppErrors = "appErrors";

    public static final String Budget = "budget";

    public static final String CreatedAt = "createdAt";

    public static final String FormData = "formData";

    public static final String HierarchyLevel = "hierarchyLevel";

    public static final String Id = "id";

    public static final String InMainWorkflowVersion = "inMainWorkflowVersion";

    public static final String MarketingChannel = "marketingChannel";

    public static final String MarketingChannelType = "marketingChannelType";

    public static final String MarketingEvent = "marketingEvent";

    public static final String ParentActivityId = "parentActivityId";

    public static final String ParentRemoteId = "parentRemoteId";

    public static final String SourceAndMedium = "sourceAndMedium";

    public static final String Status = "status";

    public static final String StatusBadgeType = "statusBadgeType";

    public static final String StatusBadgeTypeV2 = "statusBadgeTypeV2";

    public static final String StatusLabel = "statusLabel";

    public static final String StatusTransitionedAt = "statusTransitionedAt";

    public static final String Tactic = "tactic";

    public static final String TargetStatus = "targetStatus";

    public static final String Title = "title";

    public static final String UpdatedAt = "updatedAt";

    public static final String UrlParameterValue = "urlParameterValue";

    public static final String UtmParameters = "utmParameters";
  }

  public static class MARKETINGACTIVITYCONNECTION {
    public static final String TYPE_NAME = "MarketingActivityConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class MARKETINGACTIVITYCREATEEXTERNALPAYLOAD {
    public static final String TYPE_NAME = "MarketingActivityCreateExternalPayload";

    public static final String MarketingActivity = "marketingActivity";

    public static final String UserErrors = "userErrors";
  }

  public static class MARKETINGACTIVITYCREATEPAYLOAD {
    public static final String TYPE_NAME = "MarketingActivityCreatePayload";

    public static final String MarketingActivity = "marketingActivity";

    public static final String RedirectPath = "redirectPath";

    public static final String UserErrors = "userErrors";
  }

  public static class MARKETINGACTIVITYDELETEEXTERNALPAYLOAD {
    public static final String TYPE_NAME = "MarketingActivityDeleteExternalPayload";

    public static final String DeletedMarketingActivityId = "deletedMarketingActivityId";

    public static final String UserErrors = "userErrors";
  }

  public static class MARKETINGACTIVITYEDGE {
    public static final String TYPE_NAME = "MarketingActivityEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class MARKETINGACTIVITYEXTENSIONAPPERRORS {
    public static final String TYPE_NAME = "MarketingActivityExtensionAppErrors";

    public static final String Code = "code";

    public static final String UserErrors = "userErrors";
  }

  public static class MARKETINGACTIVITYUPDATEEXTERNALPAYLOAD {
    public static final String TYPE_NAME = "MarketingActivityUpdateExternalPayload";

    public static final String MarketingActivity = "marketingActivity";

    public static final String UserErrors = "userErrors";
  }

  public static class MARKETINGACTIVITYUPDATEPAYLOAD {
    public static final String TYPE_NAME = "MarketingActivityUpdatePayload";

    public static final String MarketingActivity = "marketingActivity";

    public static final String RedirectPath = "redirectPath";

    public static final String UserErrors = "userErrors";
  }

  public static class MARKETINGACTIVITYUPSERTEXTERNALPAYLOAD {
    public static final String TYPE_NAME = "MarketingActivityUpsertExternalPayload";

    public static final String MarketingActivity = "marketingActivity";

    public static final String UserErrors = "userErrors";
  }

  public static class MARKETINGACTIVITYUSERERROR {
    public static final String TYPE_NAME = "MarketingActivityUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class MARKETINGBUDGET {
    public static final String TYPE_NAME = "MarketingBudget";

    public static final String BudgetType = "budgetType";

    public static final String Total = "total";
  }

  public static class MARKETINGENGAGEMENT {
    public static final String TYPE_NAME = "MarketingEngagement";

    public static final String AdSpend = "adSpend";

    public static final String ChannelHandle = "channelHandle";

    public static final String ClicksCount = "clicksCount";

    public static final String CommentsCount = "commentsCount";

    public static final String ComplaintsCount = "complaintsCount";

    public static final String FailsCount = "failsCount";

    public static final String FavoritesCount = "favoritesCount";

    public static final String FirstTimeCustomers = "firstTimeCustomers";

    public static final String ImpressionsCount = "impressionsCount";

    public static final String IsCumulative = "isCumulative";

    public static final String MarketingActivity = "marketingActivity";

    public static final String OccurredOn = "occurredOn";

    public static final String Orders = "orders";

    public static final String ReturningCustomers = "returningCustomers";

    public static final String Sales = "sales";

    public static final String SendsCount = "sendsCount";

    public static final String SessionsCount = "sessionsCount";

    public static final String SharesCount = "sharesCount";

    public static final String UniqueClicksCount = "uniqueClicksCount";

    public static final String UniqueViewsCount = "uniqueViewsCount";

    public static final String UnsubscribesCount = "unsubscribesCount";

    public static final String UtcOffset = "utcOffset";

    public static final String ViewsCount = "viewsCount";
  }

  public static class MARKETINGENGAGEMENTCREATEPAYLOAD {
    public static final String TYPE_NAME = "MarketingEngagementCreatePayload";

    public static final String MarketingEngagement = "marketingEngagement";

    public static final String UserErrors = "userErrors";
  }

  public static class MARKETINGENGAGEMENTSDELETEPAYLOAD {
    public static final String TYPE_NAME = "MarketingEngagementsDeletePayload";

    public static final String Result = "result";

    public static final String UserErrors = "userErrors";
  }

  public static class MARKETINGEVENT {
    public static final String TYPE_NAME = "MarketingEvent";

    public static final String App = "app";

    public static final String Channel = "channel";

    public static final String ChannelHandle = "channelHandle";

    public static final String Description = "description";

    public static final String EndedAt = "endedAt";

    public static final String Id = "id";

    public static final String LegacyResourceId = "legacyResourceId";

    public static final String ManageUrl = "manageUrl";

    public static final String MarketingChannelType = "marketingChannelType";

    public static final String PreviewUrl = "previewUrl";

    public static final String RemoteId = "remoteId";

    public static final String ScheduledToEndAt = "scheduledToEndAt";

    public static final String SourceAndMedium = "sourceAndMedium";

    public static final String StartedAt = "startedAt";

    public static final String TargetTypeDisplayText = "targetTypeDisplayText";

    public static final String Type = "type";

    public static final String UtmCampaign = "utmCampaign";

    public static final String UtmMedium = "utmMedium";

    public static final String UtmSource = "utmSource";
  }

  public static class MARKETINGEVENTCONNECTION {
    public static final String TYPE_NAME = "MarketingEventConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class MARKETINGEVENTEDGE {
    public static final String TYPE_NAME = "MarketingEventEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class MARKETLOCALIZABLECONTENT {
    public static final String TYPE_NAME = "MarketLocalizableContent";

    public static final String Digest = "digest";

    public static final String Key = "key";

    public static final String Value = "value";
  }

  public static class MARKETLOCALIZABLERESOURCE {
    public static final String TYPE_NAME = "MarketLocalizableResource";

    public static final String MarketLocalizableContent = "marketLocalizableContent";

    public static final String MarketLocalizations = "marketLocalizations";

    public static final String ResourceId = "resourceId";

    public static class MARKETLOCALIZATIONS_INPUT_ARGUMENT {
      public static final String MarketId = "marketId";
    }
  }

  public static class MARKETLOCALIZABLERESOURCECONNECTION {
    public static final String TYPE_NAME = "MarketLocalizableResourceConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class MARKETLOCALIZABLERESOURCEEDGE {
    public static final String TYPE_NAME = "MarketLocalizableResourceEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class MARKETLOCALIZATION {
    public static final String TYPE_NAME = "MarketLocalization";

    public static final String Key = "key";

    public static final String Market = "market";

    public static final String Outdated = "outdated";

    public static final String UpdatedAt = "updatedAt";

    public static final String Value = "value";
  }

  public static class MARKETLOCALIZATIONSREGISTERPAYLOAD {
    public static final String TYPE_NAME = "MarketLocalizationsRegisterPayload";

    public static final String MarketLocalizations = "marketLocalizations";

    public static final String UserErrors = "userErrors";
  }

  public static class MARKETLOCALIZATIONSREMOVEPAYLOAD {
    public static final String TYPE_NAME = "MarketLocalizationsRemovePayload";

    public static final String MarketLocalizations = "marketLocalizations";

    public static final String UserErrors = "userErrors";
  }

  public static class MARKETREGIONCONNECTION {
    public static final String TYPE_NAME = "MarketRegionConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class MARKETREGIONCOUNTRY {
    public static final String TYPE_NAME = "MarketRegionCountry";

    public static final String Code = "code";

    public static final String Currency = "currency";

    public static final String Id = "id";

    public static final String Name = "name";
  }

  public static class MARKETREGIONDELETEPAYLOAD {
    public static final String TYPE_NAME = "MarketRegionDeletePayload";

    public static final String DeletedId = "deletedId";

    public static final String Market = "market";

    public static final String UserErrors = "userErrors";
  }

  public static class MARKETREGIONEDGE {
    public static final String TYPE_NAME = "MarketRegionEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class MARKETREGIONSCREATEPAYLOAD {
    public static final String TYPE_NAME = "MarketRegionsCreatePayload";

    public static final String Market = "market";

    public static final String UserErrors = "userErrors";
  }

  public static class MARKETREGIONSDELETEPAYLOAD {
    public static final String TYPE_NAME = "MarketRegionsDeletePayload";

    public static final String DeletedIds = "deletedIds";

    public static final String UserErrors = "userErrors";
  }

  public static class MARKETUPDATEPAYLOAD {
    public static final String TYPE_NAME = "MarketUpdatePayload";

    public static final String Market = "market";

    public static final String UserErrors = "userErrors";
  }

  public static class MARKETUSERERROR {
    public static final String TYPE_NAME = "MarketUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class MARKETWEBPRESENCE {
    public static final String TYPE_NAME = "MarketWebPresence";

    public static final String AlternateLocales = "alternateLocales";

    public static final String DefaultLocale = "defaultLocale";

    public static final String Domain = "domain";

    public static final String Id = "id";

    public static final String Market = "market";

    public static final String RootUrls = "rootUrls";

    public static final String SubfolderSuffix = "subfolderSuffix";
  }

  public static class MARKETWEBPRESENCECONNECTION {
    public static final String TYPE_NAME = "MarketWebPresenceConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class MARKETWEBPRESENCECREATEPAYLOAD {
    public static final String TYPE_NAME = "MarketWebPresenceCreatePayload";

    public static final String Market = "market";

    public static final String UserErrors = "userErrors";
  }

  public static class MARKETWEBPRESENCEDELETEPAYLOAD {
    public static final String TYPE_NAME = "MarketWebPresenceDeletePayload";

    public static final String DeletedId = "deletedId";

    public static final String Market = "market";

    public static final String UserErrors = "userErrors";
  }

  public static class MARKETWEBPRESENCEEDGE {
    public static final String TYPE_NAME = "MarketWebPresenceEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class MARKETWEBPRESENCEROOTURL {
    public static final String TYPE_NAME = "MarketWebPresenceRootUrl";

    public static final String Locale = "locale";

    public static final String Url = "url";
  }

  public static class MARKETWEBPRESENCEUPDATEPAYLOAD {
    public static final String TYPE_NAME = "MarketWebPresenceUpdatePayload";

    public static final String Market = "market";

    public static final String UserErrors = "userErrors";
  }

  public static class MEDIACONNECTION {
    public static final String TYPE_NAME = "MediaConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class MEDIAEDGE {
    public static final String TYPE_NAME = "MediaEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class MEDIAERROR {
    public static final String TYPE_NAME = "MediaError";

    public static final String Code = "code";

    public static final String Details = "details";

    public static final String Message = "message";
  }

  public static class MEDIAIMAGE {
    public static final String TYPE_NAME = "MediaImage";

    public static final String Alt = "alt";

    public static final String CreatedAt = "createdAt";

    public static final String FileErrors = "fileErrors";

    public static final String FileStatus = "fileStatus";

    public static final String Id = "id";

    public static final String Image = "image";

    public static final String MediaContentType = "mediaContentType";

    public static final String MediaErrors = "mediaErrors";

    public static final String MediaWarnings = "mediaWarnings";

    public static final String Metafield = "metafield";

    public static final String Metafields = "metafields";

    public static final String MimeType = "mimeType";

    public static final String OriginalSource = "originalSource";

    public static final String Preview = "preview";

    public static final String PrivateMetafield = "privateMetafield";

    public static final String PrivateMetafields = "privateMetafields";

    public static final String Status = "status";

    public static final String UpdatedAt = "updatedAt";

    public static class METAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class METAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Keys = "keys";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PRIVATEMETAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class PRIVATEMETAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class MEDIAIMAGEORIGINALSOURCE {
    public static final String TYPE_NAME = "MediaImageOriginalSource";

    public static final String FileSize = "fileSize";

    public static final String Url = "url";
  }

  public static class MEDIAPREVIEWIMAGE {
    public static final String TYPE_NAME = "MediaPreviewImage";

    public static final String Image = "image";

    public static final String Status = "status";
  }

  public static class MEDIAUSERERROR {
    public static final String TYPE_NAME = "MediaUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class MEDIAWARNING {
    public static final String TYPE_NAME = "MediaWarning";

    public static final String Code = "code";

    public static final String Message = "message";
  }

  public static class MERCHANTAPPROVALSIGNALS {
    public static final String TYPE_NAME = "MerchantApprovalSignals";

    public static final String IdentityVerified = "identityVerified";

    public static final String VerifiedByShopify = "verifiedByShopify";

    public static final String VerifiedByShopifyTier = "verifiedByShopifyTier";
  }

  public static class METAFIELD {
    public static final String TYPE_NAME = "Metafield";

    public static final String CreatedAt = "createdAt";

    public static final String Definition = "definition";

    public static final String Description = "description";

    public static final String Id = "id";

    public static final String Key = "key";

    public static final String LegacyResourceId = "legacyResourceId";

    public static final String Namespace = "namespace";

    public static final String Owner = "owner";

    public static final String OwnerType = "ownerType";

    public static final String Reference = "reference";

    public static final String References = "references";

    public static final String Type = "type";

    public static final String UpdatedAt = "updatedAt";

    public static final String Value = "value";

    public static class REFERENCES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";
    }
  }

  public static class METAFIELDACCESS {
    public static final String TYPE_NAME = "MetafieldAccess";

    public static final String Admin = "admin";

    public static final String Grants = "grants";

    public static final String Storefront = "storefront";
  }

  public static class METAFIELDACCESSGRANT {
    public static final String TYPE_NAME = "MetafieldAccessGrant";

    public static final String Access = "access";

    public static final String Grantee = "grantee";
  }

  public static class METAFIELDCONNECTION {
    public static final String TYPE_NAME = "MetafieldConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class METAFIELDDEFINITION {
    public static final String TYPE_NAME = "MetafieldDefinition";

    public static final String Access = "access";

    public static final String Description = "description";

    public static final String Id = "id";

    public static final String Key = "key";

    public static final String Metafields = "metafields";

    public static final String MetafieldsCount = "metafieldsCount";

    public static final String Name = "name";

    public static final String Namespace = "namespace";

    public static final String OwnerType = "ownerType";

    public static final String PinnedPosition = "pinnedPosition";

    public static final String StandardTemplate = "standardTemplate";

    public static final String Type = "type";

    public static final String UseAsCollectionCondition = "useAsCollectionCondition";

    public static final String ValidationStatus = "validationStatus";

    public static final String Validations = "validations";

    public static final String VisibleToStorefrontApi = "visibleToStorefrontApi";

    public static class METAFIELDS_INPUT_ARGUMENT {
      public static final String ValidationStatus = "validationStatus";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class METAFIELDSCOUNT_INPUT_ARGUMENT {
      public static final String ValidationStatus = "validationStatus";
    }
  }

  public static class METAFIELDDEFINITIONCONNECTION {
    public static final String TYPE_NAME = "MetafieldDefinitionConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class METAFIELDDEFINITIONCREATEPAYLOAD {
    public static final String TYPE_NAME = "MetafieldDefinitionCreatePayload";

    public static final String CreatedDefinition = "createdDefinition";

    public static final String UserErrors = "userErrors";
  }

  public static class METAFIELDDEFINITIONCREATEUSERERROR {
    public static final String TYPE_NAME = "MetafieldDefinitionCreateUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class METAFIELDDEFINITIONDELETEPAYLOAD {
    public static final String TYPE_NAME = "MetafieldDefinitionDeletePayload";

    public static final String DeletedDefinitionId = "deletedDefinitionId";

    public static final String UserErrors = "userErrors";
  }

  public static class METAFIELDDEFINITIONDELETEUSERERROR {
    public static final String TYPE_NAME = "MetafieldDefinitionDeleteUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class METAFIELDDEFINITIONEDGE {
    public static final String TYPE_NAME = "MetafieldDefinitionEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class METAFIELDDEFINITIONPINPAYLOAD {
    public static final String TYPE_NAME = "MetafieldDefinitionPinPayload";

    public static final String PinnedDefinition = "pinnedDefinition";

    public static final String UserErrors = "userErrors";
  }

  public static class METAFIELDDEFINITIONPINUSERERROR {
    public static final String TYPE_NAME = "MetafieldDefinitionPinUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class METAFIELDDEFINITIONSUPPORTEDVALIDATION {
    public static final String TYPE_NAME = "MetafieldDefinitionSupportedValidation";

    public static final String Name = "name";

    public static final String Type = "type";
  }

  public static class METAFIELDDEFINITIONTYPE {
    public static final String TYPE_NAME = "MetafieldDefinitionType";

    public static final String Category = "category";

    public static final String Name = "name";

    public static final String SupportedValidations = "supportedValidations";

    public static final String SupportsDefinitionMigrations = "supportsDefinitionMigrations";

    public static final String ValueType = "valueType";
  }

  public static class METAFIELDDEFINITIONUNPINPAYLOAD {
    public static final String TYPE_NAME = "MetafieldDefinitionUnpinPayload";

    public static final String UnpinnedDefinition = "unpinnedDefinition";

    public static final String UserErrors = "userErrors";
  }

  public static class METAFIELDDEFINITIONUNPINUSERERROR {
    public static final String TYPE_NAME = "MetafieldDefinitionUnpinUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class METAFIELDDEFINITIONUPDATEPAYLOAD {
    public static final String TYPE_NAME = "MetafieldDefinitionUpdatePayload";

    public static final String UpdatedDefinition = "updatedDefinition";

    public static final String UserErrors = "userErrors";

    public static final String ValidationJob = "validationJob";
  }

  public static class METAFIELDDEFINITIONUPDATEUSERERROR {
    public static final String TYPE_NAME = "MetafieldDefinitionUpdateUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class METAFIELDDEFINITIONVALIDATION {
    public static final String TYPE_NAME = "MetafieldDefinitionValidation";

    public static final String Name = "name";

    public static final String Type = "type";

    public static final String Value = "value";
  }

  public static class METAFIELDDELETEPAYLOAD {
    public static final String TYPE_NAME = "MetafieldDeletePayload";

    public static final String DeletedId = "deletedId";

    public static final String UserErrors = "userErrors";
  }

  public static class METAFIELDEDGE {
    public static final String TYPE_NAME = "MetafieldEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class METAFIELDREFERENCECONNECTION {
    public static final String TYPE_NAME = "MetafieldReferenceConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class METAFIELDREFERENCEEDGE {
    public static final String TYPE_NAME = "MetafieldReferenceEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class METAFIELDRELATION {
    public static final String TYPE_NAME = "MetafieldRelation";

    public static final String Key = "key";

    public static final String Name = "name";

    public static final String Namespace = "namespace";

    public static final String Referencer = "referencer";

    public static final String Target = "target";
  }

  public static class METAFIELDRELATIONCONNECTION {
    public static final String TYPE_NAME = "MetafieldRelationConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class METAFIELDRELATIONEDGE {
    public static final String TYPE_NAME = "MetafieldRelationEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class METAFIELDSSETPAYLOAD {
    public static final String TYPE_NAME = "MetafieldsSetPayload";

    public static final String Metafields = "metafields";

    public static final String UserErrors = "userErrors";
  }

  public static class METAFIELDSSETUSERERROR {
    public static final String TYPE_NAME = "MetafieldsSetUserError";

    public static final String Code = "code";

    public static final String ElementIndex = "elementIndex";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class METAFIELDSTOREFRONTVISIBILITY {
    public static final String TYPE_NAME = "MetafieldStorefrontVisibility";

    public static final String CreatedAt = "createdAt";

    public static final String Id = "id";

    public static final String Key = "key";

    public static final String LegacyResourceId = "legacyResourceId";

    public static final String Namespace = "namespace";

    public static final String OwnerType = "ownerType";

    public static final String UpdatedAt = "updatedAt";
  }

  public static class METAFIELDSTOREFRONTVISIBILITYCONNECTION {
    public static final String TYPE_NAME = "MetafieldStorefrontVisibilityConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class METAFIELDSTOREFRONTVISIBILITYCREATEPAYLOAD {
    public static final String TYPE_NAME = "MetafieldStorefrontVisibilityCreatePayload";

    public static final String MetafieldStorefrontVisibility = "metafieldStorefrontVisibility";

    public static final String UserErrors = "userErrors";
  }

  public static class METAFIELDSTOREFRONTVISIBILITYDELETEPAYLOAD {
    public static final String TYPE_NAME = "MetafieldStorefrontVisibilityDeletePayload";

    public static final String DeletedMetafieldStorefrontVisibilityId = "deletedMetafieldStorefrontVisibilityId";

    public static final String UserErrors = "userErrors";
  }

  public static class METAFIELDSTOREFRONTVISIBILITYEDGE {
    public static final String TYPE_NAME = "MetafieldStorefrontVisibilityEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class METAOBJECT {
    public static final String TYPE_NAME = "Metaobject";

    public static final String Capabilities = "capabilities";

    public static final String CreatedBy = "createdBy";

    public static final String CreatedByApp = "createdByApp";

    public static final String CreatedByStaff = "createdByStaff";

    public static final String Definition = "definition";

    public static final String DisplayName = "displayName";

    public static final String Field = "field";

    public static final String Fields = "fields";

    public static final String Handle = "handle";

    public static final String Id = "id";

    public static final String ReferencedBy = "referencedBy";

    public static final String StaffMember = "staffMember";

    public static final String ThumbnailField = "thumbnailField";

    public static final String Type = "type";

    public static final String UpdatedAt = "updatedAt";

    public static class FIELD_INPUT_ARGUMENT {
      public static final String Key = "key";
    }

    public static class REFERENCEDBY_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class METAOBJECTACCESS {
    public static final String TYPE_NAME = "MetaobjectAccess";

    public static final String Admin = "admin";

    public static final String Storefront = "storefront";
  }

  public static class METAOBJECTBULKDELETEPAYLOAD {
    public static final String TYPE_NAME = "MetaobjectBulkDeletePayload";

    public static final String Job = "job";

    public static final String UserErrors = "userErrors";
  }

  public static class METAOBJECTCAPABILITIES {
    public static final String TYPE_NAME = "MetaobjectCapabilities";

    public static final String OnlineStore = "onlineStore";

    public static final String Publishable = "publishable";

    public static final String Renderable = "renderable";

    public static final String Translatable = "translatable";
  }

  public static class METAOBJECTCAPABILITIESONLINESTORE {
    public static final String TYPE_NAME = "MetaobjectCapabilitiesOnlineStore";

    public static final String Data = "data";

    public static final String Enabled = "enabled";
  }

  public static class METAOBJECTCAPABILITIESPUBLISHABLE {
    public static final String TYPE_NAME = "MetaobjectCapabilitiesPublishable";

    public static final String Enabled = "enabled";
  }

  public static class METAOBJECTCAPABILITIESRENDERABLE {
    public static final String TYPE_NAME = "MetaobjectCapabilitiesRenderable";

    public static final String Data = "data";

    public static final String Enabled = "enabled";
  }

  public static class METAOBJECTCAPABILITIESTRANSLATABLE {
    public static final String TYPE_NAME = "MetaobjectCapabilitiesTranslatable";

    public static final String Enabled = "enabled";
  }

  public static class METAOBJECTCAPABILITYDATA {
    public static final String TYPE_NAME = "MetaobjectCapabilityData";

    public static final String OnlineStore = "onlineStore";

    public static final String Publishable = "publishable";
  }

  public static class METAOBJECTCAPABILITYDATAONLINESTORE {
    public static final String TYPE_NAME = "MetaobjectCapabilityDataOnlineStore";

    public static final String TemplateSuffix = "templateSuffix";
  }

  public static class METAOBJECTCAPABILITYDATAPUBLISHABLE {
    public static final String TYPE_NAME = "MetaobjectCapabilityDataPublishable";

    public static final String Status = "status";
  }

  public static class METAOBJECTCAPABILITYDEFINITIONDATAONLINESTORE {
    public static final String TYPE_NAME = "MetaobjectCapabilityDefinitionDataOnlineStore";

    public static final String CanCreateRedirects = "canCreateRedirects";

    public static final String UrlHandle = "urlHandle";
  }

  public static class METAOBJECTCAPABILITYDEFINITIONDATARENDERABLE {
    public static final String TYPE_NAME = "MetaobjectCapabilityDefinitionDataRenderable";

    public static final String MetaDescriptionKey = "metaDescriptionKey";

    public static final String MetaTitleKey = "metaTitleKey";
  }

  public static class METAOBJECTCONNECTION {
    public static final String TYPE_NAME = "MetaobjectConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class METAOBJECTCREATEPAYLOAD {
    public static final String TYPE_NAME = "MetaobjectCreatePayload";

    public static final String Metaobject = "metaobject";

    public static final String UserErrors = "userErrors";
  }

  public static class METAOBJECTDEFINITION {
    public static final String TYPE_NAME = "MetaobjectDefinition";

    public static final String Access = "access";

    public static final String Capabilities = "capabilities";

    public static final String CreatedByApp = "createdByApp";

    public static final String CreatedByStaff = "createdByStaff";

    public static final String Description = "description";

    public static final String DisplayNameKey = "displayNameKey";

    public static final String FieldDefinitions = "fieldDefinitions";

    public static final String HasThumbnailField = "hasThumbnailField";

    public static final String Id = "id";

    public static final String Metaobjects = "metaobjects";

    public static final String MetaobjectsCount = "metaobjectsCount";

    public static final String Name = "name";

    public static final String Type = "type";

    public static class METAOBJECTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class METAOBJECTDEFINITIONCONNECTION {
    public static final String TYPE_NAME = "MetaobjectDefinitionConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class METAOBJECTDEFINITIONCREATEPAYLOAD {
    public static final String TYPE_NAME = "MetaobjectDefinitionCreatePayload";

    public static final String MetaobjectDefinition = "metaobjectDefinition";

    public static final String UserErrors = "userErrors";
  }

  public static class METAOBJECTDEFINITIONDELETEPAYLOAD {
    public static final String TYPE_NAME = "MetaobjectDefinitionDeletePayload";

    public static final String DeletedId = "deletedId";

    public static final String UserErrors = "userErrors";
  }

  public static class METAOBJECTDEFINITIONEDGE {
    public static final String TYPE_NAME = "MetaobjectDefinitionEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class METAOBJECTDEFINITIONUPDATEPAYLOAD {
    public static final String TYPE_NAME = "MetaobjectDefinitionUpdatePayload";

    public static final String MetaobjectDefinition = "metaobjectDefinition";

    public static final String UserErrors = "userErrors";
  }

  public static class METAOBJECTDELETEPAYLOAD {
    public static final String TYPE_NAME = "MetaobjectDeletePayload";

    public static final String DeletedId = "deletedId";

    public static final String UserErrors = "userErrors";
  }

  public static class METAOBJECTEDGE {
    public static final String TYPE_NAME = "MetaobjectEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class METAOBJECTFIELD {
    public static final String TYPE_NAME = "MetaobjectField";

    public static final String Definition = "definition";

    public static final String Key = "key";

    public static final String Reference = "reference";

    public static final String References = "references";

    public static final String Thumbnail = "thumbnail";

    public static final String Type = "type";

    public static final String Value = "value";

    public static class REFERENCES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";
    }
  }

  public static class METAOBJECTFIELDDEFINITION {
    public static final String TYPE_NAME = "MetaobjectFieldDefinition";

    public static final String Description = "description";

    public static final String Key = "key";

    public static final String Name = "name";

    public static final String Required = "required";

    public static final String Type = "type";

    public static final String Validations = "validations";
  }

  public static class METAOBJECTTHUMBNAIL {
    public static final String TYPE_NAME = "MetaobjectThumbnail";

    public static final String File = "file";

    public static final String Hex = "hex";
  }

  public static class METAOBJECTUPDATEPAYLOAD {
    public static final String TYPE_NAME = "MetaobjectUpdatePayload";

    public static final String Metaobject = "metaobject";

    public static final String UserErrors = "userErrors";
  }

  public static class METAOBJECTUPSERTPAYLOAD {
    public static final String TYPE_NAME = "MetaobjectUpsertPayload";

    public static final String Metaobject = "metaobject";

    public static final String UserErrors = "userErrors";
  }

  public static class METAOBJECTUSERERROR {
    public static final String TYPE_NAME = "MetaobjectUserError";

    public static final String Code = "code";

    public static final String ElementIndex = "elementIndex";

    public static final String ElementKey = "elementKey";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class MODEL3D {
    public static final String TYPE_NAME = "Model3d";

    public static final String Alt = "alt";

    public static final String BoundingBox = "boundingBox";

    public static final String Filename = "filename";

    public static final String Id = "id";

    public static final String MediaContentType = "mediaContentType";

    public static final String MediaErrors = "mediaErrors";

    public static final String MediaWarnings = "mediaWarnings";

    public static final String OriginalSource = "originalSource";

    public static final String Preview = "preview";

    public static final String Sources = "sources";

    public static final String Status = "status";
  }

  public static class MODEL3DBOUNDINGBOX {
    public static final String TYPE_NAME = "Model3dBoundingBox";

    public static final String Size = "size";
  }

  public static class MODEL3DSOURCE {
    public static final String TYPE_NAME = "Model3dSource";

    public static final String Filesize = "filesize";

    public static final String Format = "format";

    public static final String MimeType = "mimeType";

    public static final String Url = "url";
  }

  public static class MONEYBAG {
    public static final String TYPE_NAME = "MoneyBag";

    public static final String PresentmentMoney = "presentmentMoney";

    public static final String ShopMoney = "shopMoney";
  }

  public static class MONEYV2 {
    public static final String TYPE_NAME = "MoneyV2";

    public static final String Amount = "amount";

    public static final String CurrencyCode = "currencyCode";
  }

  public static class MUTATION {
    public static final String TYPE_NAME = "Mutation";

    public static final String AbandonmentEmailStateUpdate = "abandonmentEmailStateUpdate";

    public static final String AbandonmentUpdateActivitiesDeliveryStatuses = "abandonmentUpdateActivitiesDeliveryStatuses";

    public static final String AppPurchaseOneTimeCreate = "appPurchaseOneTimeCreate";

    public static final String AppSubscriptionCancel = "appSubscriptionCancel";

    public static final String AppSubscriptionCreate = "appSubscriptionCreate";

    public static final String AppSubscriptionLineItemUpdate = "appSubscriptionLineItemUpdate";

    public static final String AppSubscriptionTrialExtend = "appSubscriptionTrialExtend";

    public static final String AppUsageRecordCreate = "appUsageRecordCreate";

    public static final String BulkOperationCancel = "bulkOperationCancel";

    public static final String BulkOperationRunMutation = "bulkOperationRunMutation";

    public static final String BulkOperationRunQuery = "bulkOperationRunQuery";

    public static final String BulkProductResourceFeedbackCreate = "bulkProductResourceFeedbackCreate";

    public static final String CartTransformCreate = "cartTransformCreate";

    public static final String CartTransformDelete = "cartTransformDelete";

    public static final String CatalogContextUpdate = "catalogContextUpdate";

    public static final String CatalogCreate = "catalogCreate";

    public static final String CatalogDelete = "catalogDelete";

    public static final String CatalogUpdate = "catalogUpdate";

    public static final String CheckoutBrandingUpsert = "checkoutBrandingUpsert";

    public static final String CollectionAddProducts = "collectionAddProducts";

    public static final String CollectionAddProductsV2 = "collectionAddProductsV2";

    public static final String CollectionCreate = "collectionCreate";

    public static final String CollectionDelete = "collectionDelete";

    public static final String CollectionPublish = "collectionPublish";

    public static final String CollectionRemoveProducts = "collectionRemoveProducts";

    public static final String CollectionReorderProducts = "collectionReorderProducts";

    public static final String CollectionUnpublish = "collectionUnpublish";

    public static final String CollectionUpdate = "collectionUpdate";

    public static final String CompaniesDelete = "companiesDelete";

    public static final String CompanyAddressDelete = "companyAddressDelete";

    public static final String CompanyAssignCustomerAsContact = "companyAssignCustomerAsContact";

    public static final String CompanyAssignMainContact = "companyAssignMainContact";

    public static final String CompanyContactAssignRole = "companyContactAssignRole";

    public static final String CompanyContactAssignRoles = "companyContactAssignRoles";

    public static final String CompanyContactCreate = "companyContactCreate";

    public static final String CompanyContactDelete = "companyContactDelete";

    public static final String CompanyContactRemoveFromCompany = "companyContactRemoveFromCompany";

    public static final String CompanyContactRevokeRole = "companyContactRevokeRole";

    public static final String CompanyContactRevokeRoles = "companyContactRevokeRoles";

    public static final String CompanyContactSendWelcomeEmail = "companyContactSendWelcomeEmail";

    public static final String CompanyContactUpdate = "companyContactUpdate";

    public static final String CompanyContactsDelete = "companyContactsDelete";

    public static final String CompanyCreate = "companyCreate";

    public static final String CompanyDelete = "companyDelete";

    public static final String CompanyLocationAssignAddress = "companyLocationAssignAddress";

    public static final String CompanyLocationAssignRoles = "companyLocationAssignRoles";

    public static final String CompanyLocationAssignTaxExemptions = "companyLocationAssignTaxExemptions";

    public static final String CompanyLocationCreate = "companyLocationCreate";

    public static final String CompanyLocationCreateTaxRegistration = "companyLocationCreateTaxRegistration";

    public static final String CompanyLocationDelete = "companyLocationDelete";

    public static final String CompanyLocationRevokeRoles = "companyLocationRevokeRoles";

    public static final String CompanyLocationRevokeTaxExemptions = "companyLocationRevokeTaxExemptions";

    public static final String CompanyLocationRevokeTaxRegistration = "companyLocationRevokeTaxRegistration";

    public static final String CompanyLocationUpdate = "companyLocationUpdate";

    public static final String CompanyLocationsDelete = "companyLocationsDelete";

    public static final String CompanyRevokeMainContact = "companyRevokeMainContact";

    public static final String CompanyUpdate = "companyUpdate";

    public static final String CustomerAddTaxExemptions = "customerAddTaxExemptions";

    public static final String CustomerCancelDataErasure = "customerCancelDataErasure";

    public static final String CustomerCreate = "customerCreate";

    public static final String CustomerDelete = "customerDelete";

    public static final String CustomerEmailMarketingConsentUpdate = "customerEmailMarketingConsentUpdate";

    public static final String CustomerGenerateAccountActivationUrl = "customerGenerateAccountActivationUrl";

    public static final String CustomerMerge = "customerMerge";

    public static final String CustomerPaymentMethodCreateFromDuplicationData = "customerPaymentMethodCreateFromDuplicationData";

    public static final String CustomerPaymentMethodCreditCardCreate = "customerPaymentMethodCreditCardCreate";

    public static final String CustomerPaymentMethodCreditCardUpdate = "customerPaymentMethodCreditCardUpdate";

    public static final String CustomerPaymentMethodGetDuplicationData = "customerPaymentMethodGetDuplicationData";

    public static final String CustomerPaymentMethodGetUpdateUrl = "customerPaymentMethodGetUpdateUrl";

    public static final String CustomerPaymentMethodPaypalBillingAgreementCreate = "customerPaymentMethodPaypalBillingAgreementCreate";

    public static final String CustomerPaymentMethodPaypalBillingAgreementUpdate = "customerPaymentMethodPaypalBillingAgreementUpdate";

    public static final String CustomerPaymentMethodRemoteCreate = "customerPaymentMethodRemoteCreate";

    public static final String CustomerPaymentMethodRemoteCreditCardCreate = "customerPaymentMethodRemoteCreditCardCreate";

    public static final String CustomerPaymentMethodRevoke = "customerPaymentMethodRevoke";

    public static final String CustomerPaymentMethodSendUpdateEmail = "customerPaymentMethodSendUpdateEmail";

    public static final String CustomerRemoveTaxExemptions = "customerRemoveTaxExemptions";

    public static final String CustomerReplaceTaxExemptions = "customerReplaceTaxExemptions";

    public static final String CustomerRequestDataErasure = "customerRequestDataErasure";

    public static final String CustomerSegmentMembersQueryCreate = "customerSegmentMembersQueryCreate";

    public static final String CustomerSmsMarketingConsentUpdate = "customerSmsMarketingConsentUpdate";

    public static final String CustomerUpdate = "customerUpdate";

    public static final String CustomerUpdateDefaultAddress = "customerUpdateDefaultAddress";

    public static final String DelegateAccessTokenCreate = "delegateAccessTokenCreate";

    public static final String DelegateAccessTokenDestroy = "delegateAccessTokenDestroy";

    public static final String DeliveryCustomizationActivation = "deliveryCustomizationActivation";

    public static final String DeliveryCustomizationCreate = "deliveryCustomizationCreate";

    public static final String DeliveryCustomizationDelete = "deliveryCustomizationDelete";

    public static final String DeliveryCustomizationUpdate = "deliveryCustomizationUpdate";

    public static final String DeliveryProfileCreate = "deliveryProfileCreate";

    public static final String DeliveryProfileRemove = "deliveryProfileRemove";

    public static final String DeliveryProfileUpdate = "deliveryProfileUpdate";

    public static final String DeliverySettingUpdate = "deliverySettingUpdate";

    public static final String DeliveryShippingOriginAssign = "deliveryShippingOriginAssign";

    public static final String DiscountAutomaticActivate = "discountAutomaticActivate";

    public static final String DiscountAutomaticAppCreate = "discountAutomaticAppCreate";

    public static final String DiscountAutomaticAppUpdate = "discountAutomaticAppUpdate";

    public static final String DiscountAutomaticBasicCreate = "discountAutomaticBasicCreate";

    public static final String DiscountAutomaticBasicUpdate = "discountAutomaticBasicUpdate";

    public static final String DiscountAutomaticBulkDelete = "discountAutomaticBulkDelete";

    public static final String DiscountAutomaticBxgyCreate = "discountAutomaticBxgyCreate";

    public static final String DiscountAutomaticBxgyUpdate = "discountAutomaticBxgyUpdate";

    public static final String DiscountAutomaticDeactivate = "discountAutomaticDeactivate";

    public static final String DiscountAutomaticDelete = "discountAutomaticDelete";

    public static final String DiscountAutomaticFreeShippingCreate = "discountAutomaticFreeShippingCreate";

    public static final String DiscountAutomaticFreeShippingUpdate = "discountAutomaticFreeShippingUpdate";

    public static final String DiscountCodeActivate = "discountCodeActivate";

    public static final String DiscountCodeAppCreate = "discountCodeAppCreate";

    public static final String DiscountCodeAppUpdate = "discountCodeAppUpdate";

    public static final String DiscountCodeBasicCreate = "discountCodeBasicCreate";

    public static final String DiscountCodeBasicUpdate = "discountCodeBasicUpdate";

    public static final String DiscountCodeBulkActivate = "discountCodeBulkActivate";

    public static final String DiscountCodeBulkDeactivate = "discountCodeBulkDeactivate";

    public static final String DiscountCodeBulkDelete = "discountCodeBulkDelete";

    public static final String DiscountCodeBxgyCreate = "discountCodeBxgyCreate";

    public static final String DiscountCodeBxgyUpdate = "discountCodeBxgyUpdate";

    public static final String DiscountCodeDeactivate = "discountCodeDeactivate";

    public static final String DiscountCodeDelete = "discountCodeDelete";

    public static final String DiscountCodeFreeShippingCreate = "discountCodeFreeShippingCreate";

    public static final String DiscountCodeFreeShippingUpdate = "discountCodeFreeShippingUpdate";

    public static final String DiscountCodeRedeemCodeBulkDelete = "discountCodeRedeemCodeBulkDelete";

    public static final String DiscountRedeemCodeBulkAdd = "discountRedeemCodeBulkAdd";

    public static final String DisputeEvidenceUpdate = "disputeEvidenceUpdate";

    public static final String DraftOrderBulkAddTags = "draftOrderBulkAddTags";

    public static final String DraftOrderBulkDelete = "draftOrderBulkDelete";

    public static final String DraftOrderBulkRemoveTags = "draftOrderBulkRemoveTags";

    public static final String DraftOrderCalculate = "draftOrderCalculate";

    public static final String DraftOrderComplete = "draftOrderComplete";

    public static final String DraftOrderCreate = "draftOrderCreate";

    public static final String DraftOrderCreateFromOrder = "draftOrderCreateFromOrder";

    public static final String DraftOrderCreateMerchantCheckout = "draftOrderCreateMerchantCheckout";

    public static final String DraftOrderDelete = "draftOrderDelete";

    public static final String DraftOrderDuplicate = "draftOrderDuplicate";

    public static final String DraftOrderInvoicePreview = "draftOrderInvoicePreview";

    public static final String DraftOrderInvoiceSend = "draftOrderInvoiceSend";

    public static final String DraftOrderUpdate = "draftOrderUpdate";

    public static final String EventBridgeServerPixelUpdate = "eventBridgeServerPixelUpdate";

    public static final String EventBridgeWebhookSubscriptionCreate = "eventBridgeWebhookSubscriptionCreate";

    public static final String EventBridgeWebhookSubscriptionUpdate = "eventBridgeWebhookSubscriptionUpdate";

    public static final String FileAcknowledgeUpdateFailed = "fileAcknowledgeUpdateFailed";

    public static final String FileCreate = "fileCreate";

    public static final String FileDelete = "fileDelete";

    public static final String FileUpdate = "fileUpdate";

    public static final String FlowGenerateSignature = "flowGenerateSignature";

    public static final String FlowTriggerReceive = "flowTriggerReceive";

    public static final String FulfillmentCancel = "fulfillmentCancel";

    public static final String FulfillmentConstraintRuleCreate = "fulfillmentConstraintRuleCreate";

    public static final String FulfillmentConstraintRuleDelete = "fulfillmentConstraintRuleDelete";

    public static final String FulfillmentCreateV2 = "fulfillmentCreateV2";

    public static final String FulfillmentEventCreate = "fulfillmentEventCreate";

    public static final String FulfillmentOrderAcceptCancellationRequest = "fulfillmentOrderAcceptCancellationRequest";

    public static final String FulfillmentOrderAcceptFulfillmentRequest = "fulfillmentOrderAcceptFulfillmentRequest";

    public static final String FulfillmentOrderCancel = "fulfillmentOrderCancel";

    public static final String FulfillmentOrderClose = "fulfillmentOrderClose";

    public static final String FulfillmentOrderHold = "fulfillmentOrderHold";

    public static final String FulfillmentOrderLineItemsPreparedForPickup = "fulfillmentOrderLineItemsPreparedForPickup";

    public static final String FulfillmentOrderMerge = "fulfillmentOrderMerge";

    public static final String FulfillmentOrderMove = "fulfillmentOrderMove";

    public static final String FulfillmentOrderOpen = "fulfillmentOrderOpen";

    public static final String FulfillmentOrderRejectCancellationRequest = "fulfillmentOrderRejectCancellationRequest";

    public static final String FulfillmentOrderRejectFulfillmentRequest = "fulfillmentOrderRejectFulfillmentRequest";

    public static final String FulfillmentOrderReleaseHold = "fulfillmentOrderReleaseHold";

    public static final String FulfillmentOrderReschedule = "fulfillmentOrderReschedule";

    public static final String FulfillmentOrderSplit = "fulfillmentOrderSplit";

    public static final String FulfillmentOrderSubmitCancellationRequest = "fulfillmentOrderSubmitCancellationRequest";

    public static final String FulfillmentOrderSubmitFulfillmentRequest = "fulfillmentOrderSubmitFulfillmentRequest";

    public static final String FulfillmentOrdersReleaseHolds = "fulfillmentOrdersReleaseHolds";

    public static final String FulfillmentOrdersSetFulfillmentDeadline = "fulfillmentOrdersSetFulfillmentDeadline";

    public static final String FulfillmentServiceCreate = "fulfillmentServiceCreate";

    public static final String FulfillmentServiceDelete = "fulfillmentServiceDelete";

    public static final String FulfillmentServiceUpdate = "fulfillmentServiceUpdate";

    public static final String FulfillmentTrackingInfoUpdateV2 = "fulfillmentTrackingInfoUpdateV2";

    public static final String GiftCardCreate = "giftCardCreate";

    public static final String GiftCardDisable = "giftCardDisable";

    public static final String GiftCardUpdate = "giftCardUpdate";

    public static final String InventoryActivate = "inventoryActivate";

    public static final String InventoryAdjustQuantities = "inventoryAdjustQuantities";

    public static final String InventoryAdjustQuantity = "inventoryAdjustQuantity";

    public static final String InventoryBulkAdjustQuantityAtLocation = "inventoryBulkAdjustQuantityAtLocation";

    public static final String InventoryBulkToggleActivation = "inventoryBulkToggleActivation";

    public static final String InventoryDeactivate = "inventoryDeactivate";

    public static final String InventoryItemUpdate = "inventoryItemUpdate";

    public static final String InventoryMoveQuantities = "inventoryMoveQuantities";

    public static final String InventorySetOnHandQuantities = "inventorySetOnHandQuantities";

    public static final String InventorySetScheduledChanges = "inventorySetScheduledChanges";

    public static final String LocationActivate = "locationActivate";

    public static final String LocationAdd = "locationAdd";

    public static final String LocationDeactivate = "locationDeactivate";

    public static final String LocationDelete = "locationDelete";

    public static final String LocationEdit = "locationEdit";

    public static final String LocationLocalPickupDisable = "locationLocalPickupDisable";

    public static final String LocationLocalPickupEnable = "locationLocalPickupEnable";

    public static final String MarketCreate = "marketCreate";

    public static final String MarketCurrencySettingsUpdate = "marketCurrencySettingsUpdate";

    public static final String MarketDelete = "marketDelete";

    public static final String MarketLocalizationsRegister = "marketLocalizationsRegister";

    public static final String MarketLocalizationsRemove = "marketLocalizationsRemove";

    public static final String MarketRegionDelete = "marketRegionDelete";

    public static final String MarketRegionsCreate = "marketRegionsCreate";

    public static final String MarketRegionsDelete = "marketRegionsDelete";

    public static final String MarketUpdate = "marketUpdate";

    public static final String MarketWebPresenceCreate = "marketWebPresenceCreate";

    public static final String MarketWebPresenceDelete = "marketWebPresenceDelete";

    public static final String MarketWebPresenceUpdate = "marketWebPresenceUpdate";

    public static final String MarketingActivitiesDeleteAllExternal = "marketingActivitiesDeleteAllExternal";

    public static final String MarketingActivityCreate = "marketingActivityCreate";

    public static final String MarketingActivityCreateExternal = "marketingActivityCreateExternal";

    public static final String MarketingActivityDeleteExternal = "marketingActivityDeleteExternal";

    public static final String MarketingActivityUpdate = "marketingActivityUpdate";

    public static final String MarketingActivityUpdateExternal = "marketingActivityUpdateExternal";

    public static final String MarketingActivityUpsertExternal = "marketingActivityUpsertExternal";

    public static final String MarketingEngagementCreate = "marketingEngagementCreate";

    public static final String MarketingEngagementsDelete = "marketingEngagementsDelete";

    public static final String MetafieldDefinitionCreate = "metafieldDefinitionCreate";

    public static final String MetafieldDefinitionDelete = "metafieldDefinitionDelete";

    public static final String MetafieldDefinitionPin = "metafieldDefinitionPin";

    public static final String MetafieldDefinitionUnpin = "metafieldDefinitionUnpin";

    public static final String MetafieldDefinitionUpdate = "metafieldDefinitionUpdate";

    public static final String MetafieldDelete = "metafieldDelete";

    public static final String MetafieldStorefrontVisibilityCreate = "metafieldStorefrontVisibilityCreate";

    public static final String MetafieldStorefrontVisibilityDelete = "metafieldStorefrontVisibilityDelete";

    public static final String MetafieldsSet = "metafieldsSet";

    public static final String MetaobjectBulkDelete = "metaobjectBulkDelete";

    public static final String MetaobjectCreate = "metaobjectCreate";

    public static final String MetaobjectDefinitionCreate = "metaobjectDefinitionCreate";

    public static final String MetaobjectDefinitionDelete = "metaobjectDefinitionDelete";

    public static final String MetaobjectDefinitionUpdate = "metaobjectDefinitionUpdate";

    public static final String MetaobjectDelete = "metaobjectDelete";

    public static final String MetaobjectUpdate = "metaobjectUpdate";

    public static final String MetaobjectUpsert = "metaobjectUpsert";

    public static final String OrderCancel = "orderCancel";

    public static final String OrderCapture = "orderCapture";

    public static final String OrderClose = "orderClose";

    public static final String OrderCreateMandatePayment = "orderCreateMandatePayment";

    public static final String OrderEditAddCustomItem = "orderEditAddCustomItem";

    public static final String OrderEditAddLineItemDiscount = "orderEditAddLineItemDiscount";

    public static final String OrderEditAddVariant = "orderEditAddVariant";

    public static final String OrderEditBegin = "orderEditBegin";

    public static final String OrderEditCommit = "orderEditCommit";

    public static final String OrderEditRemoveDiscount = "orderEditRemoveDiscount";

    public static final String OrderEditRemoveLineItemDiscount = "orderEditRemoveLineItemDiscount";

    public static final String OrderEditSetQuantity = "orderEditSetQuantity";

    public static final String OrderEditUpdateDiscount = "orderEditUpdateDiscount";

    public static final String OrderInvoiceSend = "orderInvoiceSend";

    public static final String OrderMarkAsPaid = "orderMarkAsPaid";

    public static final String OrderOpen = "orderOpen";

    public static final String OrderUpdate = "orderUpdate";

    public static final String PaymentCustomizationActivation = "paymentCustomizationActivation";

    public static final String PaymentCustomizationCreate = "paymentCustomizationCreate";

    public static final String PaymentCustomizationDelete = "paymentCustomizationDelete";

    public static final String PaymentCustomizationUpdate = "paymentCustomizationUpdate";

    public static final String PaymentReminderSend = "paymentReminderSend";

    public static final String PaymentTermsCreate = "paymentTermsCreate";

    public static final String PaymentTermsDelete = "paymentTermsDelete";

    public static final String PaymentTermsUpdate = "paymentTermsUpdate";

    public static final String PriceListCreate = "priceListCreate";

    public static final String PriceListDelete = "priceListDelete";

    public static final String PriceListFixedPricesAdd = "priceListFixedPricesAdd";

    public static final String PriceListFixedPricesByProductUpdate = "priceListFixedPricesByProductUpdate";

    public static final String PriceListFixedPricesDelete = "priceListFixedPricesDelete";

    public static final String PriceListFixedPricesUpdate = "priceListFixedPricesUpdate";

    public static final String PriceListUpdate = "priceListUpdate";

    public static final String PriceRuleActivate = "priceRuleActivate";

    public static final String PriceRuleCreate = "priceRuleCreate";

    public static final String PriceRuleDeactivate = "priceRuleDeactivate";

    public static final String PriceRuleDelete = "priceRuleDelete";

    public static final String PriceRuleDiscountCodeCreate = "priceRuleDiscountCodeCreate";

    public static final String PriceRuleDiscountCodeUpdate = "priceRuleDiscountCodeUpdate";

    public static final String PriceRuleUpdate = "priceRuleUpdate";

    public static final String PrivateMetafieldDelete = "privateMetafieldDelete";

    public static final String PrivateMetafieldUpsert = "privateMetafieldUpsert";

    public static final String ProductAppendImages = "productAppendImages";

    public static final String ProductChangeStatus = "productChangeStatus";

    public static final String ProductCreate = "productCreate";

    public static final String ProductCreateMedia = "productCreateMedia";

    public static final String ProductDelete = "productDelete";

    public static final String ProductDeleteAsync = "productDeleteAsync";

    public static final String ProductDeleteImages = "productDeleteImages";

    public static final String ProductDeleteMedia = "productDeleteMedia";

    public static final String ProductDuplicate = "productDuplicate";

    public static final String ProductDuplicateAsync = "productDuplicateAsync";

    public static final String ProductDuplicateAsyncV2 = "productDuplicateAsyncV2";

    public static final String ProductFeedCreate = "productFeedCreate";

    public static final String ProductFeedDelete = "productFeedDelete";

    public static final String ProductFullSync = "productFullSync";

    public static final String ProductImageUpdate = "productImageUpdate";

    public static final String ProductJoinSellingPlanGroups = "productJoinSellingPlanGroups";

    public static final String ProductLeaveSellingPlanGroups = "productLeaveSellingPlanGroups";

    public static final String ProductPublish = "productPublish";

    public static final String ProductReorderImages = "productReorderImages";

    public static final String ProductReorderMedia = "productReorderMedia";

    public static final String ProductUnpublish = "productUnpublish";

    public static final String ProductUpdate = "productUpdate";

    public static final String ProductUpdateMedia = "productUpdateMedia";

    public static final String ProductVariantAppendMedia = "productVariantAppendMedia";

    public static final String ProductVariantCreate = "productVariantCreate";

    public static final String ProductVariantDelete = "productVariantDelete";

    public static final String ProductVariantDetachMedia = "productVariantDetachMedia";

    public static final String ProductVariantJoinSellingPlanGroups = "productVariantJoinSellingPlanGroups";

    public static final String ProductVariantLeaveSellingPlanGroups = "productVariantLeaveSellingPlanGroups";

    public static final String ProductVariantRelationshipBulkUpdate = "productVariantRelationshipBulkUpdate";

    public static final String ProductVariantUpdate = "productVariantUpdate";

    public static final String ProductVariantsBulkCreate = "productVariantsBulkCreate";

    public static final String ProductVariantsBulkDelete = "productVariantsBulkDelete";

    public static final String ProductVariantsBulkReorder = "productVariantsBulkReorder";

    public static final String ProductVariantsBulkUpdate = "productVariantsBulkUpdate";

    public static final String PubSubServerPixelUpdate = "pubSubServerPixelUpdate";

    public static final String PubSubWebhookSubscriptionCreate = "pubSubWebhookSubscriptionCreate";

    public static final String PubSubWebhookSubscriptionUpdate = "pubSubWebhookSubscriptionUpdate";

    public static final String PublicationCreate = "publicationCreate";

    public static final String PublicationDelete = "publicationDelete";

    public static final String PublicationUpdate = "publicationUpdate";

    public static final String PublishablePublish = "publishablePublish";

    public static final String PublishablePublishToCurrentChannel = "publishablePublishToCurrentChannel";

    public static final String PublishableUnpublish = "publishableUnpublish";

    public static final String PublishableUnpublishToCurrentChannel = "publishableUnpublishToCurrentChannel";

    public static final String QuantityPricingByVariantUpdate = "quantityPricingByVariantUpdate";

    public static final String QuantityRulesAdd = "quantityRulesAdd";

    public static final String QuantityRulesDelete = "quantityRulesDelete";

    public static final String RefundCreate = "refundCreate";

    public static final String ReturnApproveRequest = "returnApproveRequest";

    public static final String ReturnCancel = "returnCancel";

    public static final String ReturnClose = "returnClose";

    public static final String ReturnCreate = "returnCreate";

    public static final String ReturnDeclineRequest = "returnDeclineRequest";

    public static final String ReturnRefund = "returnRefund";

    public static final String ReturnReopen = "returnReopen";

    public static final String ReturnRequest = "returnRequest";

    public static final String ReverseDeliveryCreateWithShipping = "reverseDeliveryCreateWithShipping";

    public static final String ReverseDeliveryDispose = "reverseDeliveryDispose";

    public static final String ReverseDeliveryShippingUpdate = "reverseDeliveryShippingUpdate";

    public static final String ReverseFulfillmentOrderDispose = "reverseFulfillmentOrderDispose";

    public static final String SavedSearchCreate = "savedSearchCreate";

    public static final String SavedSearchDelete = "savedSearchDelete";

    public static final String SavedSearchUpdate = "savedSearchUpdate";

    public static final String ScriptTagCreate = "scriptTagCreate";

    public static final String ScriptTagDelete = "scriptTagDelete";

    public static final String ScriptTagUpdate = "scriptTagUpdate";

    public static final String SegmentCreate = "segmentCreate";

    public static final String SegmentDelete = "segmentDelete";

    public static final String SegmentUpdate = "segmentUpdate";

    public static final String SellingPlanGroupAddProductVariants = "sellingPlanGroupAddProductVariants";

    public static final String SellingPlanGroupAddProducts = "sellingPlanGroupAddProducts";

    public static final String SellingPlanGroupCreate = "sellingPlanGroupCreate";

    public static final String SellingPlanGroupDelete = "sellingPlanGroupDelete";

    public static final String SellingPlanGroupRemoveProductVariants = "sellingPlanGroupRemoveProductVariants";

    public static final String SellingPlanGroupRemoveProducts = "sellingPlanGroupRemoveProducts";

    public static final String SellingPlanGroupUpdate = "sellingPlanGroupUpdate";

    public static final String ServerPixelCreate = "serverPixelCreate";

    public static final String ServerPixelDelete = "serverPixelDelete";

    public static final String ShippingPackageDelete = "shippingPackageDelete";

    public static final String ShippingPackageMakeDefault = "shippingPackageMakeDefault";

    public static final String ShippingPackageUpdate = "shippingPackageUpdate";

    public static final String ShopLocaleDisable = "shopLocaleDisable";

    public static final String ShopLocaleEnable = "shopLocaleEnable";

    public static final String ShopLocaleUpdate = "shopLocaleUpdate";

    public static final String ShopPolicyUpdate = "shopPolicyUpdate";

    public static final String ShopResourceFeedbackCreate = "shopResourceFeedbackCreate";

    public static final String StagedUploadTargetGenerate = "stagedUploadTargetGenerate";

    public static final String StagedUploadTargetsGenerate = "stagedUploadTargetsGenerate";

    public static final String StagedUploadsCreate = "stagedUploadsCreate";

    public static final String StandardMetafieldDefinitionEnable = "standardMetafieldDefinitionEnable";

    public static final String StandardMetaobjectDefinitionEnable = "standardMetaobjectDefinitionEnable";

    public static final String StorefrontAccessTokenCreate = "storefrontAccessTokenCreate";

    public static final String StorefrontAccessTokenDelete = "storefrontAccessTokenDelete";

    public static final String SubscriptionBillingAttemptCreate = "subscriptionBillingAttemptCreate";

    public static final String SubscriptionBillingCycleContractDraftCommit = "subscriptionBillingCycleContractDraftCommit";

    public static final String SubscriptionBillingCycleContractDraftConcatenate = "subscriptionBillingCycleContractDraftConcatenate";

    public static final String SubscriptionBillingCycleContractEdit = "subscriptionBillingCycleContractEdit";

    public static final String SubscriptionBillingCycleEditDelete = "subscriptionBillingCycleEditDelete";

    public static final String SubscriptionBillingCycleEditsDelete = "subscriptionBillingCycleEditsDelete";

    public static final String SubscriptionBillingCycleScheduleEdit = "subscriptionBillingCycleScheduleEdit";

    public static final String SubscriptionBillingCycleSkip = "subscriptionBillingCycleSkip";

    public static final String SubscriptionBillingCycleUnskip = "subscriptionBillingCycleUnskip";

    public static final String SubscriptionContractActivate = "subscriptionContractActivate";

    public static final String SubscriptionContractAtomicCreate = "subscriptionContractAtomicCreate";

    public static final String SubscriptionContractCancel = "subscriptionContractCancel";

    public static final String SubscriptionContractCreate = "subscriptionContractCreate";

    public static final String SubscriptionContractExpire = "subscriptionContractExpire";

    public static final String SubscriptionContractFail = "subscriptionContractFail";

    public static final String SubscriptionContractPause = "subscriptionContractPause";

    public static final String SubscriptionContractProductChange = "subscriptionContractProductChange";

    public static final String SubscriptionContractSetNextBillingDate = "subscriptionContractSetNextBillingDate";

    public static final String SubscriptionContractUpdate = "subscriptionContractUpdate";

    public static final String SubscriptionDraftCommit = "subscriptionDraftCommit";

    public static final String SubscriptionDraftDiscountAdd = "subscriptionDraftDiscountAdd";

    public static final String SubscriptionDraftDiscountCodeApply = "subscriptionDraftDiscountCodeApply";

    public static final String SubscriptionDraftDiscountRemove = "subscriptionDraftDiscountRemove";

    public static final String SubscriptionDraftDiscountUpdate = "subscriptionDraftDiscountUpdate";

    public static final String SubscriptionDraftFreeShippingDiscountAdd = "subscriptionDraftFreeShippingDiscountAdd";

    public static final String SubscriptionDraftFreeShippingDiscountUpdate = "subscriptionDraftFreeShippingDiscountUpdate";

    public static final String SubscriptionDraftLineAdd = "subscriptionDraftLineAdd";

    public static final String SubscriptionDraftLineRemove = "subscriptionDraftLineRemove";

    public static final String SubscriptionDraftLineUpdate = "subscriptionDraftLineUpdate";

    public static final String SubscriptionDraftUpdate = "subscriptionDraftUpdate";

    public static final String TagsAdd = "tagsAdd";

    public static final String TagsRemove = "tagsRemove";

    public static final String TaxAppConfigure = "taxAppConfigure";

    public static final String TranslationsRegister = "translationsRegister";

    public static final String TranslationsRemove = "translationsRemove";

    public static final String UrlRedirectBulkDeleteAll = "urlRedirectBulkDeleteAll";

    public static final String UrlRedirectBulkDeleteByIds = "urlRedirectBulkDeleteByIds";

    public static final String UrlRedirectBulkDeleteBySavedSearch = "urlRedirectBulkDeleteBySavedSearch";

    public static final String UrlRedirectBulkDeleteBySearch = "urlRedirectBulkDeleteBySearch";

    public static final String UrlRedirectCreate = "urlRedirectCreate";

    public static final String UrlRedirectDelete = "urlRedirectDelete";

    public static final String UrlRedirectImportCreate = "urlRedirectImportCreate";

    public static final String UrlRedirectImportSubmit = "urlRedirectImportSubmit";

    public static final String UrlRedirectUpdate = "urlRedirectUpdate";

    public static final String ValidationCreate = "validationCreate";

    public static final String ValidationDelete = "validationDelete";

    public static final String ValidationUpdate = "validationUpdate";

    public static final String WebPixelCreate = "webPixelCreate";

    public static final String WebPixelDelete = "webPixelDelete";

    public static final String WebPixelUpdate = "webPixelUpdate";

    public static final String WebhookSubscriptionCreate = "webhookSubscriptionCreate";

    public static final String WebhookSubscriptionDelete = "webhookSubscriptionDelete";

    public static final String WebhookSubscriptionUpdate = "webhookSubscriptionUpdate";

    public static class ABANDONMENTEMAILSTATEUPDATE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String EmailState = "emailState";

      public static final String EmailSentAt = "emailSentAt";

      public static final String EmailStateChangeReason = "emailStateChangeReason";
    }

    public static class ABANDONMENTUPDATEACTIVITIESDELIVERYSTATUSES_INPUT_ARGUMENT {
      public static final String AbandonmentId = "abandonmentId";

      public static final String MarketingActivityId = "marketingActivityId";

      public static final String DeliveryStatus = "deliveryStatus";

      public static final String DeliveredAt = "deliveredAt";

      public static final String DeliveryStatusChangeReason = "deliveryStatusChangeReason";
    }

    public static class APPPURCHASEONETIMECREATE_INPUT_ARGUMENT {
      public static final String Name = "name";

      public static final String Price = "price";

      public static final String ReturnUrl = "returnUrl";

      public static final String Test = "test";
    }

    public static class APPSUBSCRIPTIONCANCEL_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Prorate = "prorate";
    }

    public static class APPSUBSCRIPTIONCREATE_INPUT_ARGUMENT {
      public static final String Name = "name";

      public static final String LineItems = "lineItems";

      public static final String Test = "test";

      public static final String TrialDays = "trialDays";

      public static final String ReturnUrl = "returnUrl";

      public static final String ReplacementBehavior = "replacementBehavior";
    }

    public static class APPSUBSCRIPTIONLINEITEMUPDATE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String CappedAmount = "cappedAmount";
    }

    public static class APPSUBSCRIPTIONTRIALEXTEND_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Days = "days";
    }

    public static class APPUSAGERECORDCREATE_INPUT_ARGUMENT {
      public static final String SubscriptionLineItemId = "subscriptionLineItemId";

      public static final String Price = "price";

      public static final String Description = "description";

      public static final String IdempotencyKey = "idempotencyKey";
    }

    public static class BULKOPERATIONCANCEL_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class BULKOPERATIONRUNMUTATION_INPUT_ARGUMENT {
      public static final String Mutation = "mutation";

      public static final String StagedUploadPath = "stagedUploadPath";

      public static final String ClientIdentifier = "clientIdentifier";
    }

    public static class BULKOPERATIONRUNQUERY_INPUT_ARGUMENT {
      public static final String Query = "query";
    }

    public static class BULKPRODUCTRESOURCEFEEDBACKCREATE_INPUT_ARGUMENT {
      public static final String FeedbackInput = "feedbackInput";
    }

    public static class CARTTRANSFORMCREATE_INPUT_ARGUMENT {
      public static final String FunctionId = "functionId";

      public static final String BlockOnFailure = "blockOnFailure";
    }

    public static class CARTTRANSFORMDELETE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class CATALOGCONTEXTUPDATE_INPUT_ARGUMENT {
      public static final String CatalogId = "catalogId";

      public static final String ContextsToAdd = "contextsToAdd";

      public static final String ContextsToRemove = "contextsToRemove";
    }

    public static class CATALOGCREATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class CATALOGDELETE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String DeleteDependentResources = "deleteDependentResources";
    }

    public static class CATALOGUPDATE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Input = "input";
    }

    public static class CHECKOUTBRANDINGUPSERT_INPUT_ARGUMENT {
      public static final String CheckoutProfileId = "checkoutProfileId";

      public static final String CheckoutBrandingInput = "checkoutBrandingInput";
    }

    public static class COLLECTIONADDPRODUCTS_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String ProductIds = "productIds";
    }

    public static class COLLECTIONADDPRODUCTSV2_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String ProductIds = "productIds";
    }

    public static class COLLECTIONCREATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class COLLECTIONDELETE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class COLLECTIONPUBLISH_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class COLLECTIONREMOVEPRODUCTS_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String ProductIds = "productIds";
    }

    public static class COLLECTIONREORDERPRODUCTS_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Moves = "moves";
    }

    public static class COLLECTIONUNPUBLISH_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class COLLECTIONUPDATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class COMPANIESDELETE_INPUT_ARGUMENT {
      public static final String CompanyIds = "companyIds";
    }

    public static class COMPANYADDRESSDELETE_INPUT_ARGUMENT {
      public static final String AddressId = "addressId";
    }

    public static class COMPANYASSIGNCUSTOMERASCONTACT_INPUT_ARGUMENT {
      public static final String CompanyId = "companyId";

      public static final String CustomerId = "customerId";
    }

    public static class COMPANYASSIGNMAINCONTACT_INPUT_ARGUMENT {
      public static final String CompanyId = "companyId";

      public static final String CompanyContactId = "companyContactId";
    }

    public static class COMPANYCONTACTASSIGNROLE_INPUT_ARGUMENT {
      public static final String CompanyContactId = "companyContactId";

      public static final String CompanyContactRoleId = "companyContactRoleId";

      public static final String CompanyLocationId = "companyLocationId";
    }

    public static class COMPANYCONTACTASSIGNROLES_INPUT_ARGUMENT {
      public static final String CompanyContactId = "companyContactId";

      public static final String RolesToAssign = "rolesToAssign";
    }

    public static class COMPANYCONTACTCREATE_INPUT_ARGUMENT {
      public static final String CompanyId = "companyId";

      public static final String Input = "input";
    }

    public static class COMPANYCONTACTDELETE_INPUT_ARGUMENT {
      public static final String CompanyContactId = "companyContactId";
    }

    public static class COMPANYCONTACTREMOVEFROMCOMPANY_INPUT_ARGUMENT {
      public static final String CompanyContactId = "companyContactId";
    }

    public static class COMPANYCONTACTREVOKEROLE_INPUT_ARGUMENT {
      public static final String CompanyContactId = "companyContactId";

      public static final String CompanyContactRoleAssignmentId = "companyContactRoleAssignmentId";
    }

    public static class COMPANYCONTACTREVOKEROLES_INPUT_ARGUMENT {
      public static final String CompanyContactId = "companyContactId";

      public static final String RoleAssignmentIds = "roleAssignmentIds";

      public static final String RevokeAll = "revokeAll";
    }

    public static class COMPANYCONTACTSENDWELCOMEEMAIL_INPUT_ARGUMENT {
      public static final String CompanyContactId = "companyContactId";

      public static final String Email = "email";
    }

    public static class COMPANYCONTACTUPDATE_INPUT_ARGUMENT {
      public static final String CompanyContactId = "companyContactId";

      public static final String Input = "input";
    }

    public static class COMPANYCONTACTSDELETE_INPUT_ARGUMENT {
      public static final String CompanyContactIds = "companyContactIds";
    }

    public static class COMPANYCREATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class COMPANYDELETE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class COMPANYLOCATIONASSIGNADDRESS_INPUT_ARGUMENT {
      public static final String LocationId = "locationId";

      public static final String Address = "address";

      public static final String AddressTypes = "addressTypes";
    }

    public static class COMPANYLOCATIONASSIGNROLES_INPUT_ARGUMENT {
      public static final String CompanyLocationId = "companyLocationId";

      public static final String RolesToAssign = "rolesToAssign";
    }

    public static class COMPANYLOCATIONASSIGNTAXEXEMPTIONS_INPUT_ARGUMENT {
      public static final String CompanyLocationId = "companyLocationId";

      public static final String TaxExemptions = "taxExemptions";
    }

    public static class COMPANYLOCATIONCREATE_INPUT_ARGUMENT {
      public static final String CompanyId = "companyId";

      public static final String Input = "input";
    }

    public static class COMPANYLOCATIONCREATETAXREGISTRATION_INPUT_ARGUMENT {
      public static final String LocationId = "locationId";

      public static final String TaxId = "taxId";
    }

    public static class COMPANYLOCATIONDELETE_INPUT_ARGUMENT {
      public static final String CompanyLocationId = "companyLocationId";
    }

    public static class COMPANYLOCATIONREVOKEROLES_INPUT_ARGUMENT {
      public static final String CompanyLocationId = "companyLocationId";

      public static final String RolesToRevoke = "rolesToRevoke";
    }

    public static class COMPANYLOCATIONREVOKETAXEXEMPTIONS_INPUT_ARGUMENT {
      public static final String CompanyLocationId = "companyLocationId";

      public static final String TaxExemptions = "taxExemptions";
    }

    public static class COMPANYLOCATIONREVOKETAXREGISTRATION_INPUT_ARGUMENT {
      public static final String CompanyLocationId = "companyLocationId";
    }

    public static class COMPANYLOCATIONUPDATE_INPUT_ARGUMENT {
      public static final String CompanyLocationId = "companyLocationId";

      public static final String Input = "input";
    }

    public static class COMPANYLOCATIONSDELETE_INPUT_ARGUMENT {
      public static final String CompanyLocationIds = "companyLocationIds";
    }

    public static class COMPANYREVOKEMAINCONTACT_INPUT_ARGUMENT {
      public static final String CompanyId = "companyId";
    }

    public static class COMPANYUPDATE_INPUT_ARGUMENT {
      public static final String CompanyId = "companyId";

      public static final String Input = "input";
    }

    public static class CUSTOMERADDTAXEXEMPTIONS_INPUT_ARGUMENT {
      public static final String CustomerId = "customerId";

      public static final String TaxExemptions = "taxExemptions";
    }

    public static class CUSTOMERCANCELDATAERASURE_INPUT_ARGUMENT {
      public static final String CustomerId = "customerId";
    }

    public static class CUSTOMERCREATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class CUSTOMERDELETE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class CUSTOMEREMAILMARKETINGCONSENTUPDATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class CUSTOMERGENERATEACCOUNTACTIVATIONURL_INPUT_ARGUMENT {
      public static final String CustomerId = "customerId";
    }

    public static class CUSTOMERMERGE_INPUT_ARGUMENT {
      public static final String CustomerOneId = "customerOneId";

      public static final String CustomerTwoId = "customerTwoId";

      public static final String OverrideFields = "overrideFields";
    }

    public static class CUSTOMERPAYMENTMETHODCREATEFROMDUPLICATIONDATA_INPUT_ARGUMENT {
      public static final String CustomerId = "customerId";

      public static final String BillingAddress = "billingAddress";

      public static final String EncryptedDuplicationData = "encryptedDuplicationData";
    }

    public static class CUSTOMERPAYMENTMETHODCREDITCARDCREATE_INPUT_ARGUMENT {
      public static final String CustomerId = "customerId";

      public static final String BillingAddress = "billingAddress";

      public static final String SessionId = "sessionId";
    }

    public static class CUSTOMERPAYMENTMETHODCREDITCARDUPDATE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String BillingAddress = "billingAddress";

      public static final String SessionId = "sessionId";
    }

    public static class CUSTOMERPAYMENTMETHODGETDUPLICATIONDATA_INPUT_ARGUMENT {
      public static final String CustomerPaymentMethodId = "customerPaymentMethodId";

      public static final String TargetShopId = "targetShopId";

      public static final String TargetCustomerId = "targetCustomerId";
    }

    public static class CUSTOMERPAYMENTMETHODGETUPDATEURL_INPUT_ARGUMENT {
      public static final String CustomerPaymentMethodId = "customerPaymentMethodId";
    }

    public static class CUSTOMERPAYMENTMETHODPAYPALBILLINGAGREEMENTCREATE_INPUT_ARGUMENT {
      public static final String CustomerId = "customerId";

      public static final String BillingAddress = "billingAddress";

      public static final String BillingAgreementId = "billingAgreementId";

      public static final String Inactive = "inactive";
    }

    public static class CUSTOMERPAYMENTMETHODPAYPALBILLINGAGREEMENTUPDATE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String BillingAddress = "billingAddress";
    }

    public static class CUSTOMERPAYMENTMETHODREMOTECREATE_INPUT_ARGUMENT {
      public static final String CustomerId = "customerId";

      public static final String RemoteReference = "remoteReference";
    }

    public static class CUSTOMERPAYMENTMETHODREMOTECREDITCARDCREATE_INPUT_ARGUMENT {
      public static final String CustomerId = "customerId";

      public static final String StripeCustomerId = "stripeCustomerId";

      public static final String StripePaymentMethodId = "stripePaymentMethodId";
    }

    public static class CUSTOMERPAYMENTMETHODREVOKE_INPUT_ARGUMENT {
      public static final String CustomerPaymentMethodId = "customerPaymentMethodId";
    }

    public static class CUSTOMERPAYMENTMETHODSENDUPDATEEMAIL_INPUT_ARGUMENT {
      public static final String CustomerPaymentMethodId = "customerPaymentMethodId";

      public static final String Email = "email";
    }

    public static class CUSTOMERREMOVETAXEXEMPTIONS_INPUT_ARGUMENT {
      public static final String CustomerId = "customerId";

      public static final String TaxExemptions = "taxExemptions";
    }

    public static class CUSTOMERREPLACETAXEXEMPTIONS_INPUT_ARGUMENT {
      public static final String CustomerId = "customerId";

      public static final String TaxExemptions = "taxExemptions";
    }

    public static class CUSTOMERREQUESTDATAERASURE_INPUT_ARGUMENT {
      public static final String CustomerId = "customerId";
    }

    public static class CUSTOMERSEGMENTMEMBERSQUERYCREATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class CUSTOMERSMSMARKETINGCONSENTUPDATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class CUSTOMERUPDATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class CUSTOMERUPDATEDEFAULTADDRESS_INPUT_ARGUMENT {
      public static final String CustomerId = "customerId";

      public static final String AddressId = "addressId";
    }

    public static class DELEGATEACCESSTOKENCREATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class DELEGATEACCESSTOKENDESTROY_INPUT_ARGUMENT {
      public static final String AccessToken = "accessToken";
    }

    public static class DELIVERYCUSTOMIZATIONACTIVATION_INPUT_ARGUMENT {
      public static final String Ids = "ids";

      public static final String Enabled = "enabled";
    }

    public static class DELIVERYCUSTOMIZATIONCREATE_INPUT_ARGUMENT {
      public static final String DeliveryCustomization = "deliveryCustomization";
    }

    public static class DELIVERYCUSTOMIZATIONDELETE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class DELIVERYCUSTOMIZATIONUPDATE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String DeliveryCustomization = "deliveryCustomization";
    }

    public static class DELIVERYPROFILECREATE_INPUT_ARGUMENT {
      public static final String Profile = "profile";
    }

    public static class DELIVERYPROFILEREMOVE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class DELIVERYPROFILEUPDATE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Profile = "profile";

      public static final String LeaveLegacyModeProfiles = "leaveLegacyModeProfiles";
    }

    public static class DELIVERYSETTINGUPDATE_INPUT_ARGUMENT {
      public static final String Setting = "setting";
    }

    public static class DELIVERYSHIPPINGORIGINASSIGN_INPUT_ARGUMENT {
      public static final String LocationId = "locationId";
    }

    public static class DISCOUNTAUTOMATICACTIVATE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class DISCOUNTAUTOMATICAPPCREATE_INPUT_ARGUMENT {
      public static final String AutomaticAppDiscount = "automaticAppDiscount";
    }

    public static class DISCOUNTAUTOMATICAPPUPDATE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String AutomaticAppDiscount = "automaticAppDiscount";
    }

    public static class DISCOUNTAUTOMATICBASICCREATE_INPUT_ARGUMENT {
      public static final String AutomaticBasicDiscount = "automaticBasicDiscount";
    }

    public static class DISCOUNTAUTOMATICBASICUPDATE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String AutomaticBasicDiscount = "automaticBasicDiscount";
    }

    public static class DISCOUNTAUTOMATICBULKDELETE_INPUT_ARGUMENT {
      public static final String Search = "search";

      public static final String SavedSearchId = "savedSearchId";

      public static final String Ids = "ids";
    }

    public static class DISCOUNTAUTOMATICBXGYCREATE_INPUT_ARGUMENT {
      public static final String AutomaticBxgyDiscount = "automaticBxgyDiscount";
    }

    public static class DISCOUNTAUTOMATICBXGYUPDATE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String AutomaticBxgyDiscount = "automaticBxgyDiscount";
    }

    public static class DISCOUNTAUTOMATICDEACTIVATE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class DISCOUNTAUTOMATICDELETE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class DISCOUNTAUTOMATICFREESHIPPINGCREATE_INPUT_ARGUMENT {
      public static final String FreeShippingAutomaticDiscount = "freeShippingAutomaticDiscount";
    }

    public static class DISCOUNTAUTOMATICFREESHIPPINGUPDATE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String FreeShippingAutomaticDiscount = "freeShippingAutomaticDiscount";
    }

    public static class DISCOUNTCODEACTIVATE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class DISCOUNTCODEAPPCREATE_INPUT_ARGUMENT {
      public static final String CodeAppDiscount = "codeAppDiscount";
    }

    public static class DISCOUNTCODEAPPUPDATE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String CodeAppDiscount = "codeAppDiscount";
    }

    public static class DISCOUNTCODEBASICCREATE_INPUT_ARGUMENT {
      public static final String BasicCodeDiscount = "basicCodeDiscount";
    }

    public static class DISCOUNTCODEBASICUPDATE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String BasicCodeDiscount = "basicCodeDiscount";
    }

    public static class DISCOUNTCODEBULKACTIVATE_INPUT_ARGUMENT {
      public static final String Search = "search";

      public static final String SavedSearchId = "savedSearchId";

      public static final String Ids = "ids";
    }

    public static class DISCOUNTCODEBULKDEACTIVATE_INPUT_ARGUMENT {
      public static final String Search = "search";

      public static final String SavedSearchId = "savedSearchId";

      public static final String Ids = "ids";
    }

    public static class DISCOUNTCODEBULKDELETE_INPUT_ARGUMENT {
      public static final String Search = "search";

      public static final String SavedSearchId = "savedSearchId";

      public static final String Ids = "ids";
    }

    public static class DISCOUNTCODEBXGYCREATE_INPUT_ARGUMENT {
      public static final String BxgyCodeDiscount = "bxgyCodeDiscount";
    }

    public static class DISCOUNTCODEBXGYUPDATE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String BxgyCodeDiscount = "bxgyCodeDiscount";
    }

    public static class DISCOUNTCODEDEACTIVATE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class DISCOUNTCODEDELETE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class DISCOUNTCODEFREESHIPPINGCREATE_INPUT_ARGUMENT {
      public static final String FreeShippingCodeDiscount = "freeShippingCodeDiscount";
    }

    public static class DISCOUNTCODEFREESHIPPINGUPDATE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String FreeShippingCodeDiscount = "freeShippingCodeDiscount";
    }

    public static class DISCOUNTCODEREDEEMCODEBULKDELETE_INPUT_ARGUMENT {
      public static final String DiscountId = "discountId";

      public static final String Search = "search";

      public static final String SavedSearchId = "savedSearchId";

      public static final String Ids = "ids";
    }

    public static class DISCOUNTREDEEMCODEBULKADD_INPUT_ARGUMENT {
      public static final String DiscountId = "discountId";

      public static final String Codes = "codes";
    }

    public static class DISPUTEEVIDENCEUPDATE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Input = "input";
    }

    public static class DRAFTORDERBULKADDTAGS_INPUT_ARGUMENT {
      public static final String Search = "search";

      public static final String SavedSearchId = "savedSearchId";

      public static final String Ids = "ids";

      public static final String Tags = "tags";
    }

    public static class DRAFTORDERBULKDELETE_INPUT_ARGUMENT {
      public static final String Search = "search";

      public static final String SavedSearchId = "savedSearchId";

      public static final String Ids = "ids";
    }

    public static class DRAFTORDERBULKREMOVETAGS_INPUT_ARGUMENT {
      public static final String Search = "search";

      public static final String SavedSearchId = "savedSearchId";

      public static final String Ids = "ids";

      public static final String Tags = "tags";
    }

    public static class DRAFTORDERCALCULATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class DRAFTORDERCOMPLETE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String PaymentGatewayId = "paymentGatewayId";

      public static final String SourceName = "sourceName";
    }

    public static class DRAFTORDERCREATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class DRAFTORDERCREATEFROMORDER_INPUT_ARGUMENT {
      public static final String OrderId = "orderId";
    }

    public static class DRAFTORDERCREATEMERCHANTCHECKOUT_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class DRAFTORDERDELETE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class DRAFTORDERDUPLICATE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class DRAFTORDERINVOICEPREVIEW_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Email = "email";
    }

    public static class DRAFTORDERINVOICESEND_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Email = "email";
    }

    public static class DRAFTORDERUPDATE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Input = "input";
    }

    public static class EVENTBRIDGESERVERPIXELUPDATE_INPUT_ARGUMENT {
      public static final String Arn = "arn";
    }

    public static class EVENTBRIDGEWEBHOOKSUBSCRIPTIONCREATE_INPUT_ARGUMENT {
      public static final String Topic = "topic";

      public static final String WebhookSubscription = "webhookSubscription";
    }

    public static class EVENTBRIDGEWEBHOOKSUBSCRIPTIONUPDATE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String WebhookSubscription = "webhookSubscription";
    }

    public static class FILEACKNOWLEDGEUPDATEFAILED_INPUT_ARGUMENT {
      public static final String FileIds = "fileIds";
    }

    public static class FILECREATE_INPUT_ARGUMENT {
      public static final String Files = "files";
    }

    public static class FILEDELETE_INPUT_ARGUMENT {
      public static final String FileIds = "fileIds";
    }

    public static class FILEUPDATE_INPUT_ARGUMENT {
      public static final String Files = "files";
    }

    public static class FLOWGENERATESIGNATURE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Payload = "payload";
    }

    public static class FLOWTRIGGERRECEIVE_INPUT_ARGUMENT {
      public static final String Handle = "handle";

      public static final String Payload = "payload";
    }

    public static class FULFILLMENTCANCEL_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class FULFILLMENTCONSTRAINTRULECREATE_INPUT_ARGUMENT {
      public static final String FunctionId = "functionId";

      public static final String Metafields = "metafields";
    }

    public static class FULFILLMENTCONSTRAINTRULEDELETE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class FULFILLMENTCREATEV2_INPUT_ARGUMENT {
      public static final String Fulfillment = "fulfillment";

      public static final String Message = "message";
    }

    public static class FULFILLMENTEVENTCREATE_INPUT_ARGUMENT {
      public static final String FulfillmentEvent = "fulfillmentEvent";
    }

    public static class FULFILLMENTORDERACCEPTCANCELLATIONREQUEST_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Message = "message";
    }

    public static class FULFILLMENTORDERACCEPTFULFILLMENTREQUEST_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Message = "message";
    }

    public static class FULFILLMENTORDERCANCEL_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class FULFILLMENTORDERCLOSE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Message = "message";
    }

    public static class FULFILLMENTORDERHOLD_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String FulfillmentHold = "fulfillmentHold";
    }

    public static class FULFILLMENTORDERLINEITEMSPREPAREDFORPICKUP_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class FULFILLMENTORDERMERGE_INPUT_ARGUMENT {
      public static final String FulfillmentOrderMergeInputs = "fulfillmentOrderMergeInputs";
    }

    public static class FULFILLMENTORDERMOVE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String NewLocationId = "newLocationId";

      public static final String FulfillmentOrderLineItems = "fulfillmentOrderLineItems";
    }

    public static class FULFILLMENTORDEROPEN_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class FULFILLMENTORDERREJECTCANCELLATIONREQUEST_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Message = "message";
    }

    public static class FULFILLMENTORDERREJECTFULFILLMENTREQUEST_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Reason = "reason";

      public static final String Message = "message";

      public static final String LineItems = "lineItems";
    }

    public static class FULFILLMENTORDERRELEASEHOLD_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String ExternalId = "externalId";
    }

    public static class FULFILLMENTORDERRESCHEDULE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String FulfillAt = "fulfillAt";
    }

    public static class FULFILLMENTORDERSPLIT_INPUT_ARGUMENT {
      public static final String FulfillmentOrderSplits = "fulfillmentOrderSplits";
    }

    public static class FULFILLMENTORDERSUBMITCANCELLATIONREQUEST_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Message = "message";
    }

    public static class FULFILLMENTORDERSUBMITFULFILLMENTREQUEST_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Message = "message";

      public static final String NotifyCustomer = "notifyCustomer";

      public static final String FulfillmentOrderLineItems = "fulfillmentOrderLineItems";
    }

    public static class FULFILLMENTORDERSRELEASEHOLDS_INPUT_ARGUMENT {
      public static final String Ids = "ids";

      public static final String ExternalId = "externalId";
    }

    public static class FULFILLMENTORDERSSETFULFILLMENTDEADLINE_INPUT_ARGUMENT {
      public static final String FulfillmentOrderIds = "fulfillmentOrderIds";

      public static final String FulfillmentDeadline = "fulfillmentDeadline";
    }

    public static class FULFILLMENTSERVICECREATE_INPUT_ARGUMENT {
      public static final String Name = "name";

      public static final String CallbackUrl = "callbackUrl";

      public static final String TrackingSupport = "trackingSupport";

      public static final String FulfillmentOrdersOptIn = "fulfillmentOrdersOptIn";

      public static final String InventoryManagement = "inventoryManagement";
    }

    public static class FULFILLMENTSERVICEDELETE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String DestinationLocationId = "destinationLocationId";
    }

    public static class FULFILLMENTSERVICEUPDATE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Name = "name";

      public static final String CallbackUrl = "callbackUrl";

      public static final String TrackingSupport = "trackingSupport";
    }

    public static class FULFILLMENTTRACKINGINFOUPDATEV2_INPUT_ARGUMENT {
      public static final String FulfillmentId = "fulfillmentId";

      public static final String TrackingInfoInput = "trackingInfoInput";

      public static final String NotifyCustomer = "notifyCustomer";
    }

    public static class GIFTCARDCREATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class GIFTCARDDISABLE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class GIFTCARDUPDATE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Input = "input";
    }

    public static class INVENTORYACTIVATE_INPUT_ARGUMENT {
      public static final String InventoryItemId = "inventoryItemId";

      public static final String LocationId = "locationId";

      public static final String Available = "available";

      public static final String OnHand = "onHand";
    }

    public static class INVENTORYADJUSTQUANTITIES_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class INVENTORYADJUSTQUANTITY_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class INVENTORYBULKADJUSTQUANTITYATLOCATION_INPUT_ARGUMENT {
      public static final String InventoryItemAdjustments = "inventoryItemAdjustments";

      public static final String LocationId = "locationId";
    }

    public static class INVENTORYBULKTOGGLEACTIVATION_INPUT_ARGUMENT {
      public static final String InventoryItemId = "inventoryItemId";

      public static final String InventoryItemUpdates = "inventoryItemUpdates";
    }

    public static class INVENTORYDEACTIVATE_INPUT_ARGUMENT {
      public static final String InventoryLevelId = "inventoryLevelId";
    }

    public static class INVENTORYITEMUPDATE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Input = "input";
    }

    public static class INVENTORYMOVEQUANTITIES_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class INVENTORYSETONHANDQUANTITIES_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class INVENTORYSETSCHEDULEDCHANGES_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class LOCATIONACTIVATE_INPUT_ARGUMENT {
      public static final String LocationId = "locationId";
    }

    public static class LOCATIONADD_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class LOCATIONDEACTIVATE_INPUT_ARGUMENT {
      public static final String LocationId = "locationId";

      public static final String DestinationLocationId = "destinationLocationId";
    }

    public static class LOCATIONDELETE_INPUT_ARGUMENT {
      public static final String LocationId = "locationId";
    }

    public static class LOCATIONEDIT_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Input = "input";
    }

    public static class LOCATIONLOCALPICKUPDISABLE_INPUT_ARGUMENT {
      public static final String LocationId = "locationId";
    }

    public static class LOCATIONLOCALPICKUPENABLE_INPUT_ARGUMENT {
      public static final String LocalPickupSettings = "localPickupSettings";
    }

    public static class MARKETCREATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class MARKETCURRENCYSETTINGSUPDATE_INPUT_ARGUMENT {
      public static final String MarketId = "marketId";

      public static final String Input = "input";
    }

    public static class MARKETDELETE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class MARKETLOCALIZATIONSREGISTER_INPUT_ARGUMENT {
      public static final String ResourceId = "resourceId";

      public static final String MarketLocalizations = "marketLocalizations";
    }

    public static class MARKETLOCALIZATIONSREMOVE_INPUT_ARGUMENT {
      public static final String ResourceId = "resourceId";

      public static final String MarketLocalizationKeys = "marketLocalizationKeys";

      public static final String MarketIds = "marketIds";
    }

    public static class MARKETREGIONDELETE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class MARKETREGIONSCREATE_INPUT_ARGUMENT {
      public static final String MarketId = "marketId";

      public static final String Regions = "regions";
    }

    public static class MARKETREGIONSDELETE_INPUT_ARGUMENT {
      public static final String Ids = "ids";
    }

    public static class MARKETUPDATE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Input = "input";
    }

    public static class MARKETWEBPRESENCECREATE_INPUT_ARGUMENT {
      public static final String MarketId = "marketId";

      public static final String WebPresence = "webPresence";
    }

    public static class MARKETWEBPRESENCEDELETE_INPUT_ARGUMENT {
      public static final String WebPresenceId = "webPresenceId";
    }

    public static class MARKETWEBPRESENCEUPDATE_INPUT_ARGUMENT {
      public static final String WebPresenceId = "webPresenceId";

      public static final String WebPresence = "webPresence";
    }

    public static class MARKETINGACTIVITYCREATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class MARKETINGACTIVITYCREATEEXTERNAL_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class MARKETINGACTIVITYDELETEEXTERNAL_INPUT_ARGUMENT {
      public static final String MarketingActivityId = "marketingActivityId";

      public static final String RemoteId = "remoteId";
    }

    public static class MARKETINGACTIVITYUPDATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class MARKETINGACTIVITYUPDATEEXTERNAL_INPUT_ARGUMENT {
      public static final String Input = "input";

      public static final String MarketingActivityId = "marketingActivityId";

      public static final String RemoteId = "remoteId";

      public static final String Utm = "utm";
    }

    public static class MARKETINGACTIVITYUPSERTEXTERNAL_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class MARKETINGENGAGEMENTCREATE_INPUT_ARGUMENT {
      public static final String MarketingActivityId = "marketingActivityId";

      public static final String RemoteId = "remoteId";

      public static final String ChannelHandle = "channelHandle";

      public static final String MarketingEngagement = "marketingEngagement";
    }

    public static class MARKETINGENGAGEMENTSDELETE_INPUT_ARGUMENT {
      public static final String ChannelHandle = "channelHandle";

      public static final String DeleteEngagementsForAllChannels = "deleteEngagementsForAllChannels";
    }

    public static class METAFIELDDEFINITIONCREATE_INPUT_ARGUMENT {
      public static final String Definition = "definition";
    }

    public static class METAFIELDDEFINITIONDELETE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String DeleteAllAssociatedMetafields = "deleteAllAssociatedMetafields";
    }

    public static class METAFIELDDEFINITIONPIN_INPUT_ARGUMENT {
      public static final String DefinitionId = "definitionId";
    }

    public static class METAFIELDDEFINITIONUNPIN_INPUT_ARGUMENT {
      public static final String DefinitionId = "definitionId";
    }

    public static class METAFIELDDEFINITIONUPDATE_INPUT_ARGUMENT {
      public static final String Definition = "definition";
    }

    public static class METAFIELDDELETE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class METAFIELDSTOREFRONTVISIBILITYCREATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class METAFIELDSTOREFRONTVISIBILITYDELETE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class METAFIELDSSET_INPUT_ARGUMENT {
      public static final String Metafields = "metafields";
    }

    public static class METAOBJECTBULKDELETE_INPUT_ARGUMENT {
      public static final String Where = "where";
    }

    public static class METAOBJECTCREATE_INPUT_ARGUMENT {
      public static final String Metaobject = "metaobject";
    }

    public static class METAOBJECTDEFINITIONCREATE_INPUT_ARGUMENT {
      public static final String Definition = "definition";
    }

    public static class METAOBJECTDEFINITIONDELETE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class METAOBJECTDEFINITIONUPDATE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Definition = "definition";
    }

    public static class METAOBJECTDELETE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class METAOBJECTUPDATE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Metaobject = "metaobject";
    }

    public static class METAOBJECTUPSERT_INPUT_ARGUMENT {
      public static final String Handle = "handle";

      public static final String Metaobject = "metaobject";
    }

    public static class ORDERCANCEL_INPUT_ARGUMENT {
      public static final String OrderId = "orderId";

      public static final String Refund = "refund";

      public static final String Restock = "restock";

      public static final String Reason = "reason";

      public static final String NotifyCustomer = "notifyCustomer";

      public static final String StaffNote = "staffNote";
    }

    public static class ORDERCAPTURE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class ORDERCLOSE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class ORDERCREATEMANDATEPAYMENT_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String PaymentScheduleId = "paymentScheduleId";

      public static final String IdempotencyKey = "idempotencyKey";

      public static final String MandateId = "mandateId";

      public static final String AutoCapture = "autoCapture";
    }

    public static class ORDEREDITADDCUSTOMITEM_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Title = "title";

      public static final String LocationId = "locationId";

      public static final String Price = "price";

      public static final String Quantity = "quantity";

      public static final String Taxable = "taxable";

      public static final String RequiresShipping = "requiresShipping";
    }

    public static class ORDEREDITADDLINEITEMDISCOUNT_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String LineItemId = "lineItemId";

      public static final String Discount = "discount";
    }

    public static class ORDEREDITADDVARIANT_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String VariantId = "variantId";

      public static final String LocationId = "locationId";

      public static final String Quantity = "quantity";

      public static final String AllowDuplicates = "allowDuplicates";
    }

    public static class ORDEREDITBEGIN_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class ORDEREDITCOMMIT_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String NotifyCustomer = "notifyCustomer";

      public static final String StaffNote = "staffNote";
    }

    public static class ORDEREDITREMOVEDISCOUNT_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String DiscountApplicationId = "discountApplicationId";
    }

    public static class ORDEREDITREMOVELINEITEMDISCOUNT_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String DiscountApplicationId = "discountApplicationId";
    }

    public static class ORDEREDITSETQUANTITY_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String LineItemId = "lineItemId";

      public static final String Quantity = "quantity";

      public static final String Restock = "restock";
    }

    public static class ORDEREDITUPDATEDISCOUNT_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Discount = "discount";

      public static final String DiscountApplicationId = "discountApplicationId";
    }

    public static class ORDERINVOICESEND_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Email = "email";
    }

    public static class ORDERMARKASPAID_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class ORDEROPEN_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class ORDERUPDATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class PAYMENTCUSTOMIZATIONACTIVATION_INPUT_ARGUMENT {
      public static final String Ids = "ids";

      public static final String Enabled = "enabled";
    }

    public static class PAYMENTCUSTOMIZATIONCREATE_INPUT_ARGUMENT {
      public static final String PaymentCustomization = "paymentCustomization";
    }

    public static class PAYMENTCUSTOMIZATIONDELETE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class PAYMENTCUSTOMIZATIONUPDATE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String PaymentCustomization = "paymentCustomization";
    }

    public static class PAYMENTREMINDERSEND_INPUT_ARGUMENT {
      public static final String PaymentScheduleId = "paymentScheduleId";
    }

    public static class PAYMENTTERMSCREATE_INPUT_ARGUMENT {
      public static final String ReferenceId = "referenceId";

      public static final String PaymentTermsAttributes = "paymentTermsAttributes";
    }

    public static class PAYMENTTERMSDELETE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class PAYMENTTERMSUPDATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class PRICELISTCREATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class PRICELISTDELETE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class PRICELISTFIXEDPRICESADD_INPUT_ARGUMENT {
      public static final String PriceListId = "priceListId";

      public static final String Prices = "prices";
    }

    public static class PRICELISTFIXEDPRICESBYPRODUCTUPDATE_INPUT_ARGUMENT {
      public static final String PricesToAdd = "pricesToAdd";

      public static final String PricesToDeleteByProductIds = "pricesToDeleteByProductIds";

      public static final String PriceListId = "priceListId";
    }

    public static class PRICELISTFIXEDPRICESDELETE_INPUT_ARGUMENT {
      public static final String PriceListId = "priceListId";

      public static final String VariantIds = "variantIds";
    }

    public static class PRICELISTFIXEDPRICESUPDATE_INPUT_ARGUMENT {
      public static final String PriceListId = "priceListId";

      public static final String PricesToAdd = "pricesToAdd";

      public static final String VariantIdsToDelete = "variantIdsToDelete";
    }

    public static class PRICELISTUPDATE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Input = "input";
    }

    public static class PRICERULEACTIVATE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class PRICERULECREATE_INPUT_ARGUMENT {
      public static final String PriceRule = "priceRule";

      public static final String PriceRuleDiscountCode = "priceRuleDiscountCode";
    }

    public static class PRICERULEDEACTIVATE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class PRICERULEDELETE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class PRICERULEDISCOUNTCODECREATE_INPUT_ARGUMENT {
      public static final String PriceRuleId = "priceRuleId";

      public static final String Code = "code";
    }

    public static class PRICERULEDISCOUNTCODEUPDATE_INPUT_ARGUMENT {
      public static final String PriceRuleId = "priceRuleId";

      public static final String Code = "code";
    }

    public static class PRICERULEUPDATE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String PriceRule = "priceRule";

      public static final String PriceRuleDiscountCode = "priceRuleDiscountCode";
    }

    public static class PRIVATEMETAFIELDDELETE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class PRIVATEMETAFIELDUPSERT_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class PRODUCTAPPENDIMAGES_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class PRODUCTCHANGESTATUS_INPUT_ARGUMENT {
      public static final String ProductId = "productId";

      public static final String Status = "status";
    }

    public static class PRODUCTCREATE_INPUT_ARGUMENT {
      public static final String Input = "input";

      public static final String Media = "media";
    }

    public static class PRODUCTCREATEMEDIA_INPUT_ARGUMENT {
      public static final String ProductId = "productId";

      public static final String Media = "media";
    }

    public static class PRODUCTDELETE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class PRODUCTDELETEASYNC_INPUT_ARGUMENT {
      public static final String ProductId = "productId";
    }

    public static class PRODUCTDELETEIMAGES_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String ImageIds = "imageIds";
    }

    public static class PRODUCTDELETEMEDIA_INPUT_ARGUMENT {
      public static final String ProductId = "productId";

      public static final String MediaIds = "mediaIds";
    }

    public static class PRODUCTDUPLICATE_INPUT_ARGUMENT {
      public static final String ProductId = "productId";

      public static final String NewTitle = "newTitle";

      public static final String NewStatus = "newStatus";

      public static final String IncludeImages = "includeImages";

      public static final String IncludeTranslations = "includeTranslations";
    }

    public static class PRODUCTDUPLICATEASYNC_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class PRODUCTDUPLICATEASYNCV2_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class PRODUCTFEEDCREATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class PRODUCTFEEDDELETE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class PRODUCTFULLSYNC_INPUT_ARGUMENT {
      public static final String BeforeUpdatedAt = "beforeUpdatedAt";

      public static final String Id = "id";

      public static final String UpdatedAtSince = "updatedAtSince";
    }

    public static class PRODUCTIMAGEUPDATE_INPUT_ARGUMENT {
      public static final String ProductId = "productId";

      public static final String Image = "image";
    }

    public static class PRODUCTJOINSELLINGPLANGROUPS_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String SellingPlanGroupIds = "sellingPlanGroupIds";
    }

    public static class PRODUCTLEAVESELLINGPLANGROUPS_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String SellingPlanGroupIds = "sellingPlanGroupIds";
    }

    public static class PRODUCTPUBLISH_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class PRODUCTREORDERIMAGES_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Moves = "moves";
    }

    public static class PRODUCTREORDERMEDIA_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Moves = "moves";
    }

    public static class PRODUCTUNPUBLISH_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class PRODUCTUPDATE_INPUT_ARGUMENT {
      public static final String Input = "input";

      public static final String Media = "media";
    }

    public static class PRODUCTUPDATEMEDIA_INPUT_ARGUMENT {
      public static final String ProductId = "productId";

      public static final String Media = "media";
    }

    public static class PRODUCTVARIANTAPPENDMEDIA_INPUT_ARGUMENT {
      public static final String ProductId = "productId";

      public static final String VariantMedia = "variantMedia";
    }

    public static class PRODUCTVARIANTCREATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class PRODUCTVARIANTDELETE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class PRODUCTVARIANTDETACHMEDIA_INPUT_ARGUMENT {
      public static final String ProductId = "productId";

      public static final String VariantMedia = "variantMedia";
    }

    public static class PRODUCTVARIANTJOINSELLINGPLANGROUPS_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String SellingPlanGroupIds = "sellingPlanGroupIds";
    }

    public static class PRODUCTVARIANTLEAVESELLINGPLANGROUPS_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String SellingPlanGroupIds = "sellingPlanGroupIds";
    }

    public static class PRODUCTVARIANTRELATIONSHIPBULKUPDATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class PRODUCTVARIANTUPDATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class PRODUCTVARIANTSBULKCREATE_INPUT_ARGUMENT {
      public static final String Variants = "variants";

      public static final String ProductId = "productId";

      public static final String Media = "media";
    }

    public static class PRODUCTVARIANTSBULKDELETE_INPUT_ARGUMENT {
      public static final String VariantsIds = "variantsIds";

      public static final String ProductId = "productId";
    }

    public static class PRODUCTVARIANTSBULKREORDER_INPUT_ARGUMENT {
      public static final String ProductId = "productId";

      public static final String Positions = "positions";
    }

    public static class PRODUCTVARIANTSBULKUPDATE_INPUT_ARGUMENT {
      public static final String Variants = "variants";

      public static final String ProductId = "productId";

      public static final String Media = "media";

      public static final String AllowPartialUpdates = "allowPartialUpdates";
    }

    public static class PUBSUBSERVERPIXELUPDATE_INPUT_ARGUMENT {
      public static final String PubSubProject = "pubSubProject";

      public static final String PubSubTopic = "pubSubTopic";
    }

    public static class PUBSUBWEBHOOKSUBSCRIPTIONCREATE_INPUT_ARGUMENT {
      public static final String Topic = "topic";

      public static final String WebhookSubscription = "webhookSubscription";
    }

    public static class PUBSUBWEBHOOKSUBSCRIPTIONUPDATE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String WebhookSubscription = "webhookSubscription";
    }

    public static class PUBLICATIONCREATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class PUBLICATIONDELETE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class PUBLICATIONUPDATE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Input = "input";
    }

    public static class PUBLISHABLEPUBLISH_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Input = "input";
    }

    public static class PUBLISHABLEPUBLISHTOCURRENTCHANNEL_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class PUBLISHABLEUNPUBLISH_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Input = "input";
    }

    public static class PUBLISHABLEUNPUBLISHTOCURRENTCHANNEL_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class QUANTITYPRICINGBYVARIANTUPDATE_INPUT_ARGUMENT {
      public static final String PriceListId = "priceListId";

      public static final String Input = "input";
    }

    public static class QUANTITYRULESADD_INPUT_ARGUMENT {
      public static final String PriceListId = "priceListId";

      public static final String QuantityRules = "quantityRules";
    }

    public static class QUANTITYRULESDELETE_INPUT_ARGUMENT {
      public static final String PriceListId = "priceListId";

      public static final String VariantIds = "variantIds";
    }

    public static class REFUNDCREATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class RETURNAPPROVEREQUEST_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class RETURNCANCEL_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class RETURNCLOSE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class RETURNCREATE_INPUT_ARGUMENT {
      public static final String ReturnInput = "returnInput";
    }

    public static class RETURNDECLINEREQUEST_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class RETURNREFUND_INPUT_ARGUMENT {
      public static final String ReturnRefundInput = "returnRefundInput";
    }

    public static class RETURNREOPEN_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class RETURNREQUEST_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class REVERSEDELIVERYCREATEWITHSHIPPING_INPUT_ARGUMENT {
      public static final String ReverseFulfillmentOrderId = "reverseFulfillmentOrderId";

      public static final String ReverseDeliveryLineItems = "reverseDeliveryLineItems";

      public static final String TrackingInput = "trackingInput";

      public static final String LabelInput = "labelInput";

      public static final String NotifyCustomer = "notifyCustomer";
    }

    public static class REVERSEDELIVERYDISPOSE_INPUT_ARGUMENT {
      public static final String DispositionInputs = "dispositionInputs";
    }

    public static class REVERSEDELIVERYSHIPPINGUPDATE_INPUT_ARGUMENT {
      public static final String ReverseDeliveryId = "reverseDeliveryId";

      public static final String TrackingInput = "trackingInput";

      public static final String LabelInput = "labelInput";

      public static final String NotifyCustomer = "notifyCustomer";
    }

    public static class REVERSEFULFILLMENTORDERDISPOSE_INPUT_ARGUMENT {
      public static final String DispositionInputs = "dispositionInputs";
    }

    public static class SAVEDSEARCHCREATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class SAVEDSEARCHDELETE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class SAVEDSEARCHUPDATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class SCRIPTTAGCREATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class SCRIPTTAGDELETE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class SCRIPTTAGUPDATE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Input = "input";
    }

    public static class SEGMENTCREATE_INPUT_ARGUMENT {
      public static final String Name = "name";

      public static final String Query = "query";
    }

    public static class SEGMENTDELETE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class SEGMENTUPDATE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Name = "name";

      public static final String Query = "query";
    }

    public static class SELLINGPLANGROUPADDPRODUCTVARIANTS_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String ProductVariantIds = "productVariantIds";
    }

    public static class SELLINGPLANGROUPADDPRODUCTS_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String ProductIds = "productIds";
    }

    public static class SELLINGPLANGROUPCREATE_INPUT_ARGUMENT {
      public static final String Input = "input";

      public static final String Resources = "resources";
    }

    public static class SELLINGPLANGROUPDELETE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class SELLINGPLANGROUPREMOVEPRODUCTVARIANTS_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String ProductVariantIds = "productVariantIds";
    }

    public static class SELLINGPLANGROUPREMOVEPRODUCTS_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String ProductIds = "productIds";
    }

    public static class SELLINGPLANGROUPUPDATE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Input = "input";
    }

    public static class SHIPPINGPACKAGEDELETE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class SHIPPINGPACKAGEMAKEDEFAULT_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class SHIPPINGPACKAGEUPDATE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String ShippingPackage = "shippingPackage";
    }

    public static class SHOPLOCALEDISABLE_INPUT_ARGUMENT {
      public static final String Locale = "locale";
    }

    public static class SHOPLOCALEENABLE_INPUT_ARGUMENT {
      public static final String Locale = "locale";

      public static final String MarketWebPresenceIds = "marketWebPresenceIds";
    }

    public static class SHOPLOCALEUPDATE_INPUT_ARGUMENT {
      public static final String Locale = "locale";

      public static final String ShopLocale = "shopLocale";
    }

    public static class SHOPPOLICYUPDATE_INPUT_ARGUMENT {
      public static final String ShopPolicy = "shopPolicy";
    }

    public static class SHOPRESOURCEFEEDBACKCREATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class STAGEDUPLOADTARGETGENERATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class STAGEDUPLOADTARGETSGENERATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class STAGEDUPLOADSCREATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class STANDARDMETAFIELDDEFINITIONENABLE_INPUT_ARGUMENT {
      public static final String OwnerType = "ownerType";

      public static final String Id = "id";

      public static final String Namespace = "namespace";

      public static final String Key = "key";

      public static final String Pin = "pin";

      public static final String VisibleToStorefrontApi = "visibleToStorefrontApi";

      public static final String UseAsCollectionCondition = "useAsCollectionCondition";
    }

    public static class STANDARDMETAOBJECTDEFINITIONENABLE_INPUT_ARGUMENT {
      public static final String Type = "type";
    }

    public static class STOREFRONTACCESSTOKENCREATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class STOREFRONTACCESSTOKENDELETE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class SUBSCRIPTIONBILLINGATTEMPTCREATE_INPUT_ARGUMENT {
      public static final String SubscriptionContractId = "subscriptionContractId";

      public static final String SubscriptionBillingAttemptInput = "subscriptionBillingAttemptInput";
    }

    public static class SUBSCRIPTIONBILLINGCYCLECONTRACTDRAFTCOMMIT_INPUT_ARGUMENT {
      public static final String DraftId = "draftId";
    }

    public static class SUBSCRIPTIONBILLINGCYCLECONTRACTDRAFTCONCATENATE_INPUT_ARGUMENT {
      public static final String DraftId = "draftId";

      public static final String ConcatenatedBillingCycleContracts = "concatenatedBillingCycleContracts";
    }

    public static class SUBSCRIPTIONBILLINGCYCLECONTRACTEDIT_INPUT_ARGUMENT {
      public static final String BillingCycleInput = "billingCycleInput";
    }

    public static class SUBSCRIPTIONBILLINGCYCLEEDITDELETE_INPUT_ARGUMENT {
      public static final String BillingCycleInput = "billingCycleInput";
    }

    public static class SUBSCRIPTIONBILLINGCYCLEEDITSDELETE_INPUT_ARGUMENT {
      public static final String ContractId = "contractId";

      public static final String TargetSelection = "targetSelection";
    }

    public static class SUBSCRIPTIONBILLINGCYCLESCHEDULEEDIT_INPUT_ARGUMENT {
      public static final String BillingCycleInput = "billingCycleInput";

      public static final String Input = "input";
    }

    public static class SUBSCRIPTIONBILLINGCYCLESKIP_INPUT_ARGUMENT {
      public static final String BillingCycleInput = "billingCycleInput";
    }

    public static class SUBSCRIPTIONBILLINGCYCLEUNSKIP_INPUT_ARGUMENT {
      public static final String BillingCycleInput = "billingCycleInput";
    }

    public static class SUBSCRIPTIONCONTRACTACTIVATE_INPUT_ARGUMENT {
      public static final String SubscriptionContractId = "subscriptionContractId";
    }

    public static class SUBSCRIPTIONCONTRACTATOMICCREATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class SUBSCRIPTIONCONTRACTCANCEL_INPUT_ARGUMENT {
      public static final String SubscriptionContractId = "subscriptionContractId";
    }

    public static class SUBSCRIPTIONCONTRACTCREATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class SUBSCRIPTIONCONTRACTEXPIRE_INPUT_ARGUMENT {
      public static final String SubscriptionContractId = "subscriptionContractId";
    }

    public static class SUBSCRIPTIONCONTRACTFAIL_INPUT_ARGUMENT {
      public static final String SubscriptionContractId = "subscriptionContractId";
    }

    public static class SUBSCRIPTIONCONTRACTPAUSE_INPUT_ARGUMENT {
      public static final String SubscriptionContractId = "subscriptionContractId";
    }

    public static class SUBSCRIPTIONCONTRACTPRODUCTCHANGE_INPUT_ARGUMENT {
      public static final String SubscriptionContractId = "subscriptionContractId";

      public static final String LineId = "lineId";

      public static final String Input = "input";
    }

    public static class SUBSCRIPTIONCONTRACTSETNEXTBILLINGDATE_INPUT_ARGUMENT {
      public static final String ContractId = "contractId";

      public static final String Date = "date";
    }

    public static class SUBSCRIPTIONCONTRACTUPDATE_INPUT_ARGUMENT {
      public static final String ContractId = "contractId";
    }

    public static class SUBSCRIPTIONDRAFTCOMMIT_INPUT_ARGUMENT {
      public static final String DraftId = "draftId";
    }

    public static class SUBSCRIPTIONDRAFTDISCOUNTADD_INPUT_ARGUMENT {
      public static final String DraftId = "draftId";

      public static final String Input = "input";
    }

    public static class SUBSCRIPTIONDRAFTDISCOUNTCODEAPPLY_INPUT_ARGUMENT {
      public static final String DraftId = "draftId";

      public static final String RedeemCode = "redeemCode";
    }

    public static class SUBSCRIPTIONDRAFTDISCOUNTREMOVE_INPUT_ARGUMENT {
      public static final String DraftId = "draftId";

      public static final String DiscountId = "discountId";
    }

    public static class SUBSCRIPTIONDRAFTDISCOUNTUPDATE_INPUT_ARGUMENT {
      public static final String DraftId = "draftId";

      public static final String DiscountId = "discountId";

      public static final String Input = "input";
    }

    public static class SUBSCRIPTIONDRAFTFREESHIPPINGDISCOUNTADD_INPUT_ARGUMENT {
      public static final String DraftId = "draftId";

      public static final String Input = "input";
    }

    public static class SUBSCRIPTIONDRAFTFREESHIPPINGDISCOUNTUPDATE_INPUT_ARGUMENT {
      public static final String DraftId = "draftId";

      public static final String DiscountId = "discountId";

      public static final String Input = "input";
    }

    public static class SUBSCRIPTIONDRAFTLINEADD_INPUT_ARGUMENT {
      public static final String DraftId = "draftId";

      public static final String Input = "input";
    }

    public static class SUBSCRIPTIONDRAFTLINEREMOVE_INPUT_ARGUMENT {
      public static final String DraftId = "draftId";

      public static final String LineId = "lineId";
    }

    public static class SUBSCRIPTIONDRAFTLINEUPDATE_INPUT_ARGUMENT {
      public static final String DraftId = "draftId";

      public static final String LineId = "lineId";

      public static final String Input = "input";
    }

    public static class SUBSCRIPTIONDRAFTUPDATE_INPUT_ARGUMENT {
      public static final String DraftId = "draftId";

      public static final String Input = "input";
    }

    public static class TAGSADD_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Tags = "tags";
    }

    public static class TAGSREMOVE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Tags = "tags";
    }

    public static class TAXAPPCONFIGURE_INPUT_ARGUMENT {
      public static final String Ready = "ready";
    }

    public static class TRANSLATIONSREGISTER_INPUT_ARGUMENT {
      public static final String ResourceId = "resourceId";

      public static final String Translations = "translations";
    }

    public static class TRANSLATIONSREMOVE_INPUT_ARGUMENT {
      public static final String ResourceId = "resourceId";

      public static final String TranslationKeys = "translationKeys";

      public static final String Locales = "locales";

      public static final String MarketIds = "marketIds";
    }

    public static class URLREDIRECTBULKDELETEBYIDS_INPUT_ARGUMENT {
      public static final String Ids = "ids";
    }

    public static class URLREDIRECTBULKDELETEBYSAVEDSEARCH_INPUT_ARGUMENT {
      public static final String SavedSearchId = "savedSearchId";
    }

    public static class URLREDIRECTBULKDELETEBYSEARCH_INPUT_ARGUMENT {
      public static final String Search = "search";
    }

    public static class URLREDIRECTCREATE_INPUT_ARGUMENT {
      public static final String UrlRedirect = "urlRedirect";
    }

    public static class URLREDIRECTDELETE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class URLREDIRECTIMPORTCREATE_INPUT_ARGUMENT {
      public static final String Url = "url";
    }

    public static class URLREDIRECTIMPORTSUBMIT_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class URLREDIRECTUPDATE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String UrlRedirect = "urlRedirect";
    }

    public static class VALIDATIONCREATE_INPUT_ARGUMENT {
      public static final String Validation = "validation";
    }

    public static class VALIDATIONDELETE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class VALIDATIONUPDATE_INPUT_ARGUMENT {
      public static final String Validation = "validation";

      public static final String Id = "id";
    }

    public static class WEBPIXELCREATE_INPUT_ARGUMENT {
      public static final String WebPixel = "webPixel";
    }

    public static class WEBPIXELDELETE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class WEBPIXELUPDATE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String WebPixel = "webPixel";
    }

    public static class WEBHOOKSUBSCRIPTIONCREATE_INPUT_ARGUMENT {
      public static final String Topic = "topic";

      public static final String WebhookSubscription = "webhookSubscription";
    }

    public static class WEBHOOKSUBSCRIPTIONDELETE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class WEBHOOKSUBSCRIPTIONUPDATE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String WebhookSubscription = "webhookSubscription";
    }
  }

  public static class MUTATIONSSTAGEDUPLOADTARGETGENERATEUPLOADPARAMETER {
    public static final String TYPE_NAME = "MutationsStagedUploadTargetGenerateUploadParameter";

    public static final String Name = "name";

    public static final String Value = "value";
  }

  public static class NAVIGATIONITEM {
    public static final String TYPE_NAME = "NavigationItem";

    public static final String Id = "id";

    public static final String Title = "title";

    public static final String Url = "url";
  }

  public static class ONLINESTOREARTICLE {
    public static final String TYPE_NAME = "OnlineStoreArticle";

    public static final String DefaultCursor = "defaultCursor";

    public static final String Id = "id";

    public static final String Translations = "translations";

    public static class TRANSLATIONS_INPUT_ARGUMENT {
      public static final String Locale = "locale";

      public static final String MarketId = "marketId";
    }
  }

  public static class ONLINESTOREBLOG {
    public static final String TYPE_NAME = "OnlineStoreBlog";

    public static final String Id = "id";

    public static final String Translations = "translations";

    public static class TRANSLATIONS_INPUT_ARGUMENT {
      public static final String Locale = "locale";

      public static final String MarketId = "marketId";
    }
  }

  public static class ONLINESTOREPAGE {
    public static final String TYPE_NAME = "OnlineStorePage";

    public static final String DefaultCursor = "defaultCursor";

    public static final String Id = "id";

    public static final String Translations = "translations";

    public static class TRANSLATIONS_INPUT_ARGUMENT {
      public static final String Locale = "locale";

      public static final String MarketId = "marketId";
    }
  }

  public static class ORDER {
    public static final String TYPE_NAME = "Order";

    public static final String AdditionalFees = "additionalFees";

    public static final String Agreements = "agreements";

    public static final String Alerts = "alerts";

    public static final String App = "app";

    public static final String BillingAddress = "billingAddress";

    public static final String BillingAddressMatchesShippingAddress = "billingAddressMatchesShippingAddress";

    public static final String CanMarkAsPaid = "canMarkAsPaid";

    public static final String CanNotifyCustomer = "canNotifyCustomer";

    public static final String CancelReason = "cancelReason";

    public static final String Cancellation = "cancellation";

    public static final String CancelledAt = "cancelledAt";

    public static final String Capturable = "capturable";

    public static final String CartDiscountAmount = "cartDiscountAmount";

    public static final String CartDiscountAmountSet = "cartDiscountAmountSet";

    public static final String Channel = "channel";

    public static final String ChannelInformation = "channelInformation";

    public static final String ClientIp = "clientIp";

    public static final String Closed = "closed";

    public static final String ClosedAt = "closedAt";

    public static final String ConfirmationNumber = "confirmationNumber";

    public static final String Confirmed = "confirmed";

    public static final String CreatedAt = "createdAt";

    public static final String CurrencyCode = "currencyCode";

    public static final String CurrentCartDiscountAmountSet = "currentCartDiscountAmountSet";

    public static final String CurrentSubtotalLineItemsQuantity = "currentSubtotalLineItemsQuantity";

    public static final String CurrentSubtotalPriceSet = "currentSubtotalPriceSet";

    public static final String CurrentTaxLines = "currentTaxLines";

    public static final String CurrentTotalAdditionalFeesSet = "currentTotalAdditionalFeesSet";

    public static final String CurrentTotalDiscountsSet = "currentTotalDiscountsSet";

    public static final String CurrentTotalDutiesSet = "currentTotalDutiesSet";

    public static final String CurrentTotalPriceSet = "currentTotalPriceSet";

    public static final String CurrentTotalTaxSet = "currentTotalTaxSet";

    public static final String CurrentTotalWeight = "currentTotalWeight";

    public static final String CustomAttributes = "customAttributes";

    public static final String Customer = "customer";

    public static final String CustomerAcceptsMarketing = "customerAcceptsMarketing";

    public static final String CustomerJourney = "customerJourney";

    public static final String CustomerJourneySummary = "customerJourneySummary";

    public static final String CustomerLocale = "customerLocale";

    public static final String DiscountApplications = "discountApplications";

    public static final String DiscountCode = "discountCode";

    public static final String DiscountCodes = "discountCodes";

    public static final String DisplayAddress = "displayAddress";

    public static final String DisplayFinancialStatus = "displayFinancialStatus";

    public static final String DisplayFulfillmentStatus = "displayFulfillmentStatus";

    public static final String Disputes = "disputes";

    public static final String Edited = "edited";

    public static final String Email = "email";

    public static final String EstimatedTaxes = "estimatedTaxes";

    public static final String Events = "events";

    public static final String ExchangeV2s = "exchangeV2s";

    public static final String Fulfillable = "fulfillable";

    public static final String FulfillmentOrders = "fulfillmentOrders";

    public static final String Fulfillments = "fulfillments";

    public static final String FullyPaid = "fullyPaid";

    public static final String HasTimelineComment = "hasTimelineComment";

    public static final String Id = "id";

    public static final String LandingPageDisplayText = "landingPageDisplayText";

    public static final String LandingPageUrl = "landingPageUrl";

    public static final String LegacyResourceId = "legacyResourceId";

    public static final String LineItems = "lineItems";

    public static final String LineItemsMutable = "lineItemsMutable";

    public static final String LocalizationExtensions = "localizationExtensions";

    public static final String Location = "location";

    public static final String MerchantEditable = "merchantEditable";

    public static final String MerchantEditableErrors = "merchantEditableErrors";

    public static final String MerchantOfRecordApp = "merchantOfRecordApp";

    public static final String Metafield = "metafield";

    public static final String MetafieldDefinitions = "metafieldDefinitions";

    public static final String Metafields = "metafields";

    public static final String Name = "name";

    public static final String NetPayment = "netPayment";

    public static final String NetPaymentSet = "netPaymentSet";

    public static final String NonFulfillableLineItems = "nonFulfillableLineItems";

    public static final String Note = "note";

    public static final String OriginalTotalAdditionalFeesSet = "originalTotalAdditionalFeesSet";

    public static final String OriginalTotalDutiesSet = "originalTotalDutiesSet";

    public static final String OriginalTotalPriceSet = "originalTotalPriceSet";

    public static final String PaymentCollectionDetails = "paymentCollectionDetails";

    public static final String PaymentGatewayNames = "paymentGatewayNames";

    public static final String PaymentTerms = "paymentTerms";

    public static final String Phone = "phone";

    public static final String PhysicalLocation = "physicalLocation";

    public static final String PoNumber = "poNumber";

    public static final String PresentmentCurrencyCode = "presentmentCurrencyCode";

    public static final String PrivateMetafield = "privateMetafield";

    public static final String PrivateMetafields = "privateMetafields";

    public static final String ProcessedAt = "processedAt";

    public static final String Publication = "publication";

    public static final String PurchasingEntity = "purchasingEntity";

    public static final String ReferralCode = "referralCode";

    public static final String ReferrerDisplayText = "referrerDisplayText";

    public static final String ReferrerUrl = "referrerUrl";

    public static final String RefundDiscrepancySet = "refundDiscrepancySet";

    public static final String Refundable = "refundable";

    public static final String Refunds = "refunds";

    public static final String RegisteredSourceUrl = "registeredSourceUrl";

    public static final String RequiresShipping = "requiresShipping";

    public static final String Restockable = "restockable";

    public static final String ReturnStatus = "returnStatus";

    public static final String Returns = "returns";

    public static final String RiskLevel = "riskLevel";

    public static final String Risks = "risks";

    public static final String ShippingAddress = "shippingAddress";

    public static final String ShippingLine = "shippingLine";

    public static final String ShippingLines = "shippingLines";

    public static final String ShopifyProtect = "shopifyProtect";

    public static final String SourceIdentifier = "sourceIdentifier";

    public static final String SubtotalLineItemsQuantity = "subtotalLineItemsQuantity";

    public static final String SubtotalPrice = "subtotalPrice";

    public static final String SubtotalPriceSet = "subtotalPriceSet";

    public static final String SuggestedRefund = "suggestedRefund";

    public static final String Tags = "tags";

    public static final String TaxExempt = "taxExempt";

    public static final String TaxLines = "taxLines";

    public static final String TaxesIncluded = "taxesIncluded";

    public static final String Test = "test";

    public static final String TotalCapturable = "totalCapturable";

    public static final String TotalCapturableSet = "totalCapturableSet";

    public static final String TotalDiscounts = "totalDiscounts";

    public static final String TotalDiscountsSet = "totalDiscountsSet";

    public static final String TotalOutstandingSet = "totalOutstandingSet";

    public static final String TotalPrice = "totalPrice";

    public static final String TotalPriceSet = "totalPriceSet";

    public static final String TotalReceived = "totalReceived";

    public static final String TotalReceivedSet = "totalReceivedSet";

    public static final String TotalRefunded = "totalRefunded";

    public static final String TotalRefundedSet = "totalRefundedSet";

    public static final String TotalRefundedShippingSet = "totalRefundedShippingSet";

    public static final String TotalShippingPrice = "totalShippingPrice";

    public static final String TotalShippingPriceSet = "totalShippingPriceSet";

    public static final String TotalTax = "totalTax";

    public static final String TotalTaxSet = "totalTaxSet";

    public static final String TotalTipReceived = "totalTipReceived";

    public static final String TotalTipReceivedSet = "totalTipReceivedSet";

    public static final String TotalWeight = "totalWeight";

    public static final String Transactions = "transactions";

    public static final String Unpaid = "unpaid";

    public static final String UpdatedAt = "updatedAt";

    public static class AGREEMENTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String Query = "query";
    }

    public static class DISCOUNTAPPLICATIONS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class EVENTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class EXCHANGEV2S_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String Query = "query";
    }

    public static class FULFILLMENTORDERS_INPUT_ARGUMENT {
      public static final String Displayable = "displayable";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String Query = "query";
    }

    public static class FULFILLMENTS_INPUT_ARGUMENT {
      public static final String First = "first";
    }

    public static class LINEITEMS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class LINEITEMSMUTABLE_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class LOCALIZATIONEXTENSIONS_INPUT_ARGUMENT {
      public static final String CountryCodes = "countryCodes";

      public static final String Purposes = "purposes";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class METAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class METAFIELDDEFINITIONS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String PinnedStatus = "pinnedStatus";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class METAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Keys = "keys";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class NONFULFILLABLELINEITEMS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PRIVATEMETAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class PRIVATEMETAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class REFUNDS_INPUT_ARGUMENT {
      public static final String First = "first";
    }

    public static class RETURNS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String Query = "query";
    }

    public static class RISKS_INPUT_ARGUMENT {
      public static final String First = "first";
    }

    public static class SHIPPINGLINES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class SUGGESTEDREFUND_INPUT_ARGUMENT {
      public static final String ShippingAmount = "shippingAmount";

      public static final String RefundShipping = "refundShipping";

      public static final String RefundLineItems = "refundLineItems";

      public static final String RefundDuties = "refundDuties";

      public static final String SuggestFullRefund = "suggestFullRefund";
    }

    public static class TRANSACTIONS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String Capturable = "capturable";

      public static final String ManuallyResolvable = "manuallyResolvable";
    }
  }

  public static class ORDERAGREEMENT {
    public static final String TYPE_NAME = "OrderAgreement";

    public static final String App = "app";

    public static final String HappenedAt = "happenedAt";

    public static final String Id = "id";

    public static final String Order = "order";

    public static final String Reason = "reason";

    public static final String Sales = "sales";

    public static final String User = "user";

    public static class SALES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class ORDERAPP {
    public static final String TYPE_NAME = "OrderApp";

    public static final String Icon = "icon";

    public static final String Id = "id";

    public static final String Name = "name";
  }

  public static class ORDERCANCELLATION {
    public static final String TYPE_NAME = "OrderCancellation";

    public static final String StaffNote = "staffNote";
  }

  public static class ORDERCANCELPAYLOAD {
    public static final String TYPE_NAME = "OrderCancelPayload";

    public static final String Job = "job";

    public static final String OrderCancelUserErrors = "orderCancelUserErrors";

    public static final String UserErrors = "userErrors";
  }

  public static class ORDERCANCELUSERERROR {
    public static final String TYPE_NAME = "OrderCancelUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class ORDERCAPTUREPAYLOAD {
    public static final String TYPE_NAME = "OrderCapturePayload";

    public static final String Transaction = "transaction";

    public static final String UserErrors = "userErrors";
  }

  public static class ORDERCLOSEPAYLOAD {
    public static final String TYPE_NAME = "OrderClosePayload";

    public static final String Order = "order";

    public static final String UserErrors = "userErrors";
  }

  public static class ORDERCONNECTION {
    public static final String TYPE_NAME = "OrderConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class ORDERCREATEMANDATEPAYMENTPAYLOAD {
    public static final String TYPE_NAME = "OrderCreateMandatePaymentPayload";

    public static final String Job = "job";

    public static final String PaymentReferenceId = "paymentReferenceId";

    public static final String UserErrors = "userErrors";
  }

  public static class ORDERCREATEMANDATEPAYMENTUSERERROR {
    public static final String TYPE_NAME = "OrderCreateMandatePaymentUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class ORDERDISPUTESUMMARY {
    public static final String TYPE_NAME = "OrderDisputeSummary";

    public static final String Id = "id";

    public static final String InitiatedAs = "initiatedAs";

    public static final String Status = "status";
  }

  public static class ORDEREDGE {
    public static final String TYPE_NAME = "OrderEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class ORDEREDITADDCUSTOMITEMPAYLOAD {
    public static final String TYPE_NAME = "OrderEditAddCustomItemPayload";

    public static final String CalculatedLineItem = "calculatedLineItem";

    public static final String CalculatedOrder = "calculatedOrder";

    public static final String UserErrors = "userErrors";
  }

  public static class ORDEREDITADDLINEITEMDISCOUNTPAYLOAD {
    public static final String TYPE_NAME = "OrderEditAddLineItemDiscountPayload";

    public static final String AddedDiscountStagedChange = "addedDiscountStagedChange";

    public static final String CalculatedLineItem = "calculatedLineItem";

    public static final String CalculatedOrder = "calculatedOrder";

    public static final String UserErrors = "userErrors";
  }

  public static class ORDEREDITADDVARIANTPAYLOAD {
    public static final String TYPE_NAME = "OrderEditAddVariantPayload";

    public static final String CalculatedLineItem = "calculatedLineItem";

    public static final String CalculatedOrder = "calculatedOrder";

    public static final String UserErrors = "userErrors";
  }

  public static class ORDEREDITAGREEMENT {
    public static final String TYPE_NAME = "OrderEditAgreement";

    public static final String App = "app";

    public static final String HappenedAt = "happenedAt";

    public static final String Id = "id";

    public static final String Reason = "reason";

    public static final String Sales = "sales";

    public static final String User = "user";

    public static class SALES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class ORDEREDITBEGINPAYLOAD {
    public static final String TYPE_NAME = "OrderEditBeginPayload";

    public static final String CalculatedOrder = "calculatedOrder";

    public static final String UserErrors = "userErrors";
  }

  public static class ORDEREDITCOMMITPAYLOAD {
    public static final String TYPE_NAME = "OrderEditCommitPayload";

    public static final String Order = "order";

    public static final String UserErrors = "userErrors";
  }

  public static class ORDEREDITREMOVEDISCOUNTPAYLOAD {
    public static final String TYPE_NAME = "OrderEditRemoveDiscountPayload";

    public static final String CalculatedOrder = "calculatedOrder";

    public static final String UserErrors = "userErrors";
  }

  public static class ORDEREDITREMOVEDISCOUNTUSERERROR {
    public static final String TYPE_NAME = "OrderEditRemoveDiscountUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class ORDEREDITREMOVELINEITEMDISCOUNTPAYLOAD {
    public static final String TYPE_NAME = "OrderEditRemoveLineItemDiscountPayload";

    public static final String CalculatedLineItem = "calculatedLineItem";

    public static final String CalculatedOrder = "calculatedOrder";

    public static final String UserErrors = "userErrors";
  }

  public static class ORDEREDITSETQUANTITYPAYLOAD {
    public static final String TYPE_NAME = "OrderEditSetQuantityPayload";

    public static final String CalculatedLineItem = "calculatedLineItem";

    public static final String CalculatedOrder = "calculatedOrder";

    public static final String UserErrors = "userErrors";
  }

  public static class ORDEREDITUPDATEDISCOUNTPAYLOAD {
    public static final String TYPE_NAME = "OrderEditUpdateDiscountPayload";

    public static final String CalculatedOrder = "calculatedOrder";

    public static final String UserErrors = "userErrors";
  }

  public static class ORDEREDITUPDATEDISCOUNTUSERERROR {
    public static final String TYPE_NAME = "OrderEditUpdateDiscountUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class ORDERINVOICESENDPAYLOAD {
    public static final String TYPE_NAME = "OrderInvoiceSendPayload";

    public static final String Order = "order";

    public static final String UserErrors = "userErrors";
  }

  public static class ORDERINVOICESENDUSERERROR {
    public static final String TYPE_NAME = "OrderInvoiceSendUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class ORDERMARKASPAIDPAYLOAD {
    public static final String TYPE_NAME = "OrderMarkAsPaidPayload";

    public static final String Order = "order";

    public static final String UserErrors = "userErrors";
  }

  public static class ORDEROPENPAYLOAD {
    public static final String TYPE_NAME = "OrderOpenPayload";

    public static final String Order = "order";

    public static final String UserErrors = "userErrors";
  }

  public static class ORDERPAYMENTCOLLECTIONDETAILS {
    public static final String TYPE_NAME = "OrderPaymentCollectionDetails";

    public static final String AdditionalPaymentCollectionUrl = "additionalPaymentCollectionUrl";

    public static final String VaultedPaymentMethods = "vaultedPaymentMethods";
  }

  public static class ORDERPAYMENTSTATUS {
    public static final String TYPE_NAME = "OrderPaymentStatus";

    public static final String ErrorMessage = "errorMessage";

    public static final String PaymentReferenceId = "paymentReferenceId";

    public static final String Status = "status";

    public static final String TranslatedErrorMessage = "translatedErrorMessage";
  }

  public static class ORDERRISK {
    public static final String TYPE_NAME = "OrderRisk";

    public static final String Display = "display";

    public static final String Level = "level";

    public static final String Message = "message";
  }

  public static class ORDERSTAGEDCHANGEADDCUSTOMITEM {
    public static final String TYPE_NAME = "OrderStagedChangeAddCustomItem";

    public static final String OriginalUnitPrice = "originalUnitPrice";

    public static final String Quantity = "quantity";

    public static final String Title = "title";
  }

  public static class ORDERSTAGEDCHANGEADDLINEITEMDISCOUNT {
    public static final String TYPE_NAME = "OrderStagedChangeAddLineItemDiscount";

    public static final String Description = "description";

    public static final String Id = "id";

    public static final String Value = "value";
  }

  public static class ORDERSTAGEDCHANGEADDSHIPPINGLINE {
    public static final String TYPE_NAME = "OrderStagedChangeAddShippingLine";

    public static final String Phone = "phone";

    public static final String PresentmentTitle = "presentmentTitle";

    public static final String Price = "price";

    public static final String Title = "title";
  }

  public static class ORDERSTAGEDCHANGEADDVARIANT {
    public static final String TYPE_NAME = "OrderStagedChangeAddVariant";

    public static final String Quantity = "quantity";

    public static final String Variant = "variant";
  }

  public static class ORDERSTAGEDCHANGECONNECTION {
    public static final String TYPE_NAME = "OrderStagedChangeConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class ORDERSTAGEDCHANGEDECREMENTITEM {
    public static final String TYPE_NAME = "OrderStagedChangeDecrementItem";

    public static final String Delta = "delta";

    public static final String LineItem = "lineItem";

    public static final String Restock = "restock";
  }

  public static class ORDERSTAGEDCHANGEEDGE {
    public static final String TYPE_NAME = "OrderStagedChangeEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class ORDERSTAGEDCHANGEINCREMENTITEM {
    public static final String TYPE_NAME = "OrderStagedChangeIncrementItem";

    public static final String Delta = "delta";

    public static final String LineItem = "lineItem";
  }

  public static class ORDERTRANSACTION {
    public static final String TYPE_NAME = "OrderTransaction";

    public static final String AccountNumber = "accountNumber";

    public static final String Amount = "amount";

    public static final String AmountSet = "amountSet";

    public static final String AmountV2 = "amountV2";

    public static final String AuthorizationCode = "authorizationCode";

    public static final String AuthorizationExpiresAt = "authorizationExpiresAt";

    public static final String CreatedAt = "createdAt";

    public static final String ErrorCode = "errorCode";

    public static final String Fees = "fees";

    public static final String FormattedGateway = "formattedGateway";

    public static final String Gateway = "gateway";

    public static final String Id = "id";

    public static final String Kind = "kind";

    public static final String ManuallyCapturable = "manuallyCapturable";

    public static final String MaximumRefundable = "maximumRefundable";

    public static final String MaximumRefundableV2 = "maximumRefundableV2";

    public static final String MultiCapturable = "multiCapturable";

    public static final String Order = "order";

    public static final String ParentTransaction = "parentTransaction";

    public static final String PaymentDetails = "paymentDetails";

    public static final String PaymentIcon = "paymentIcon";

    public static final String PaymentId = "paymentId";

    public static final String PaymentMethod = "paymentMethod";

    public static final String ProcessedAt = "processedAt";

    public static final String Receipt = "receipt";

    public static final String ReceiptJson = "receiptJson";

    public static final String SettlementCurrency = "settlementCurrency";

    public static final String SettlementCurrencyRate = "settlementCurrencyRate";

    public static final String ShopifyPaymentsSet = "shopifyPaymentsSet";

    public static final String Status = "status";

    public static final String Test = "test";

    public static final String TotalUnsettled = "totalUnsettled";

    public static final String TotalUnsettledSet = "totalUnsettledSet";

    public static final String TotalUnsettledV2 = "totalUnsettledV2";

    public static final String User = "user";
  }

  public static class ORDERTRANSACTIONCONNECTION {
    public static final String TYPE_NAME = "OrderTransactionConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class ORDERTRANSACTIONEDGE {
    public static final String TYPE_NAME = "OrderTransactionEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class ORDERUPDATEPAYLOAD {
    public static final String TYPE_NAME = "OrderUpdatePayload";

    public static final String Order = "order";

    public static final String UserErrors = "userErrors";
  }

  public static class PAGEINFO {
    public static final String TYPE_NAME = "PageInfo";

    public static final String EndCursor = "endCursor";

    public static final String HasNextPage = "hasNextPage";

    public static final String HasPreviousPage = "hasPreviousPage";

    public static final String StartCursor = "startCursor";
  }

  public static class PARSEERROR {
    public static final String TYPE_NAME = "ParseError";

    public static final String Code = "code";

    public static final String Message = "message";

    public static final String Range = "range";
  }

  public static class PARSEERRORRANGE {
    public static final String TYPE_NAME = "ParseErrorRange";

    public static final String End = "end";

    public static final String Start = "start";
  }

  public static class PAYMENTCUSTOMIZATION {
    public static final String TYPE_NAME = "PaymentCustomization";

    public static final String Enabled = "enabled";

    public static final String ErrorHistory = "errorHistory";

    public static final String FunctionId = "functionId";

    public static final String Id = "id";

    public static final String Metafield = "metafield";

    public static final String MetafieldDefinitions = "metafieldDefinitions";

    public static final String Metafields = "metafields";

    public static final String PrivateMetafield = "privateMetafield";

    public static final String PrivateMetafields = "privateMetafields";

    public static final String ShopifyFunction = "shopifyFunction";

    public static final String Title = "title";

    public static class METAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class METAFIELDDEFINITIONS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String PinnedStatus = "pinnedStatus";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class METAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Keys = "keys";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PRIVATEMETAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class PRIVATEMETAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class PAYMENTCUSTOMIZATIONACTIVATIONPAYLOAD {
    public static final String TYPE_NAME = "PaymentCustomizationActivationPayload";

    public static final String Ids = "ids";

    public static final String UserErrors = "userErrors";
  }

  public static class PAYMENTCUSTOMIZATIONCONNECTION {
    public static final String TYPE_NAME = "PaymentCustomizationConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class PAYMENTCUSTOMIZATIONCREATEPAYLOAD {
    public static final String TYPE_NAME = "PaymentCustomizationCreatePayload";

    public static final String PaymentCustomization = "paymentCustomization";

    public static final String UserErrors = "userErrors";
  }

  public static class PAYMENTCUSTOMIZATIONDELETEPAYLOAD {
    public static final String TYPE_NAME = "PaymentCustomizationDeletePayload";

    public static final String DeletedId = "deletedId";

    public static final String UserErrors = "userErrors";
  }

  public static class PAYMENTCUSTOMIZATIONEDGE {
    public static final String TYPE_NAME = "PaymentCustomizationEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class PAYMENTCUSTOMIZATIONERROR {
    public static final String TYPE_NAME = "PaymentCustomizationError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class PAYMENTCUSTOMIZATIONUPDATEPAYLOAD {
    public static final String TYPE_NAME = "PaymentCustomizationUpdatePayload";

    public static final String PaymentCustomization = "paymentCustomization";

    public static final String UserErrors = "userErrors";
  }

  public static class PAYMENTMANDATE {
    public static final String TYPE_NAME = "PaymentMandate";

    public static final String Id = "id";

    public static final String PaymentInstrument = "paymentInstrument";
  }

  public static class PAYMENTREMINDERSENDPAYLOAD {
    public static final String TYPE_NAME = "PaymentReminderSendPayload";

    public static final String Success = "success";

    public static final String UserErrors = "userErrors";
  }

  public static class PAYMENTREMINDERSENDUSERERROR {
    public static final String TYPE_NAME = "PaymentReminderSendUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class PAYMENTSCHEDULE {
    public static final String TYPE_NAME = "PaymentSchedule";

    public static final String Amount = "amount";

    public static final String CompletedAt = "completedAt";

    public static final String DueAt = "dueAt";

    public static final String Id = "id";

    public static final String IssuedAt = "issuedAt";

    public static final String PaymentTerms = "paymentTerms";
  }

  public static class PAYMENTSCHEDULECONNECTION {
    public static final String TYPE_NAME = "PaymentScheduleConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class PAYMENTSCHEDULEEDGE {
    public static final String TYPE_NAME = "PaymentScheduleEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class PAYMENTSETTINGS {
    public static final String TYPE_NAME = "PaymentSettings";

    public static final String SupportedDigitalWallets = "supportedDigitalWallets";
  }

  public static class PAYMENTTERMS {
    public static final String TYPE_NAME = "PaymentTerms";

    public static final String DraftOrder = "draftOrder";

    public static final String DueInDays = "dueInDays";

    public static final String Id = "id";

    public static final String Order = "order";

    public static final String Overdue = "overdue";

    public static final String PaymentSchedules = "paymentSchedules";

    public static final String PaymentTermsName = "paymentTermsName";

    public static final String PaymentTermsType = "paymentTermsType";

    public static final String TranslatedName = "translatedName";

    public static class PAYMENTSCHEDULES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class PAYMENTTERMSCREATEPAYLOAD {
    public static final String TYPE_NAME = "PaymentTermsCreatePayload";

    public static final String PaymentTerms = "paymentTerms";

    public static final String UserErrors = "userErrors";
  }

  public static class PAYMENTTERMSCREATEUSERERROR {
    public static final String TYPE_NAME = "PaymentTermsCreateUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class PAYMENTTERMSDELETEPAYLOAD {
    public static final String TYPE_NAME = "PaymentTermsDeletePayload";

    public static final String DeletedId = "deletedId";

    public static final String UserErrors = "userErrors";
  }

  public static class PAYMENTTERMSDELETEUSERERROR {
    public static final String TYPE_NAME = "PaymentTermsDeleteUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class PAYMENTTERMSTEMPLATE {
    public static final String TYPE_NAME = "PaymentTermsTemplate";

    public static final String Description = "description";

    public static final String DueInDays = "dueInDays";

    public static final String Id = "id";

    public static final String Name = "name";

    public static final String PaymentTermsType = "paymentTermsType";

    public static final String TranslatedName = "translatedName";
  }

  public static class PAYMENTTERMSUPDATEPAYLOAD {
    public static final String TYPE_NAME = "PaymentTermsUpdatePayload";

    public static final String PaymentTerms = "paymentTerms";

    public static final String UserErrors = "userErrors";
  }

  public static class PAYMENTTERMSUPDATEUSERERROR {
    public static final String TYPE_NAME = "PaymentTermsUpdateUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class POLARISVIZDATAPOINT {
    public static final String TYPE_NAME = "PolarisVizDataPoint";

    public static final String Key = "key";

    public static final String Value = "value";
  }

  public static class POLARISVIZDATASERIES {
    public static final String TYPE_NAME = "PolarisVizDataSeries";

    public static final String Data = "data";

    public static final String IsComparison = "isComparison";

    public static final String Name = "name";
  }

  public static class POLARISVIZRESPONSE {
    public static final String TYPE_NAME = "PolarisVizResponse";

    public static final String Data = "data";

    public static final String ParseErrors = "parseErrors";

    public static final String TableData = "tableData";

    public static final String VizType = "vizType";
  }

  public static class PRICELIST {
    public static final String TYPE_NAME = "PriceList";

    public static final String Catalog = "catalog";

    public static final String Currency = "currency";

    public static final String FixedPricesCount = "fixedPricesCount";

    public static final String Id = "id";

    public static final String Name = "name";

    public static final String Parent = "parent";

    public static final String Prices = "prices";

    public static final String QuantityRules = "quantityRules";

    public static class PRICES_INPUT_ARGUMENT {
      public static final String OriginType = "originType";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String Query = "query";
    }

    public static class QUANTITYRULES_INPUT_ARGUMENT {
      public static final String OriginType = "originType";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class PRICELISTADJUSTMENT {
    public static final String TYPE_NAME = "PriceListAdjustment";

    public static final String Type = "type";

    public static final String Value = "value";
  }

  public static class PRICELISTADJUSTMENTSETTINGS {
    public static final String TYPE_NAME = "PriceListAdjustmentSettings";

    public static final String CompareAtMode = "compareAtMode";
  }

  public static class PRICELISTCONNECTION {
    public static final String TYPE_NAME = "PriceListConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class PRICELISTCREATEPAYLOAD {
    public static final String TYPE_NAME = "PriceListCreatePayload";

    public static final String PriceList = "priceList";

    public static final String UserErrors = "userErrors";
  }

  public static class PRICELISTDELETEPAYLOAD {
    public static final String TYPE_NAME = "PriceListDeletePayload";

    public static final String DeletedId = "deletedId";

    public static final String UserErrors = "userErrors";
  }

  public static class PRICELISTEDGE {
    public static final String TYPE_NAME = "PriceListEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class PRICELISTFIXEDPRICESADDPAYLOAD {
    public static final String TYPE_NAME = "PriceListFixedPricesAddPayload";

    public static final String Prices = "prices";

    public static final String UserErrors = "userErrors";
  }

  public static class PRICELISTFIXEDPRICESBYPRODUCTBULKUPDATEUSERERROR {
    public static final String TYPE_NAME = "PriceListFixedPricesByProductBulkUpdateUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class PRICELISTFIXEDPRICESBYPRODUCTUPDATEPAYLOAD {
    public static final String TYPE_NAME = "PriceListFixedPricesByProductUpdatePayload";

    public static final String PriceList = "priceList";

    public static final String PricesToAddProducts = "pricesToAddProducts";

    public static final String PricesToDeleteProducts = "pricesToDeleteProducts";

    public static final String UserErrors = "userErrors";
  }

  public static class PRICELISTFIXEDPRICESDELETEPAYLOAD {
    public static final String TYPE_NAME = "PriceListFixedPricesDeletePayload";

    public static final String DeletedFixedPriceVariantIds = "deletedFixedPriceVariantIds";

    public static final String UserErrors = "userErrors";
  }

  public static class PRICELISTFIXEDPRICESUPDATEPAYLOAD {
    public static final String TYPE_NAME = "PriceListFixedPricesUpdatePayload";

    public static final String DeletedFixedPriceVariantIds = "deletedFixedPriceVariantIds";

    public static final String PriceList = "priceList";

    public static final String PricesAdded = "pricesAdded";

    public static final String UserErrors = "userErrors";
  }

  public static class PRICELISTPARENT {
    public static final String TYPE_NAME = "PriceListParent";

    public static final String Adjustment = "adjustment";

    public static final String Settings = "settings";
  }

  public static class PRICELISTPRICE {
    public static final String TYPE_NAME = "PriceListPrice";

    public static final String CompareAtPrice = "compareAtPrice";

    public static final String OriginType = "originType";

    public static final String Price = "price";

    public static final String QuantityPriceBreaks = "quantityPriceBreaks";

    public static final String Variant = "variant";

    public static class QUANTITYPRICEBREAKS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";
    }
  }

  public static class PRICELISTPRICECONNECTION {
    public static final String TYPE_NAME = "PriceListPriceConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class PRICELISTPRICEEDGE {
    public static final String TYPE_NAME = "PriceListPriceEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class PRICELISTPRICEUSERERROR {
    public static final String TYPE_NAME = "PriceListPriceUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class PRICELISTUPDATEPAYLOAD {
    public static final String TYPE_NAME = "PriceListUpdatePayload";

    public static final String PriceList = "priceList";

    public static final String UserErrors = "userErrors";
  }

  public static class PRICELISTUSERERROR {
    public static final String TYPE_NAME = "PriceListUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class PRICERULE {
    public static final String TYPE_NAME = "PriceRule";

    public static final String AllocationLimit = "allocationLimit";

    public static final String AllocationMethod = "allocationMethod";

    public static final String App = "app";

    public static final String CombinesWith = "combinesWith";

    public static final String CreatedAt = "createdAt";

    public static final String CustomerSelection = "customerSelection";

    public static final String DiscountClass = "discountClass";

    public static final String DiscountCodes = "discountCodes";

    public static final String DiscountCodesCount = "discountCodesCount";

    public static final String EndsAt = "endsAt";

    public static final String EntitlementToPrerequisiteQuantityRatio = "entitlementToPrerequisiteQuantityRatio";

    public static final String Events = "events";

    public static final String Features = "features";

    public static final String HasTimelineComment = "hasTimelineComment";

    public static final String Id = "id";

    public static final String ItemEntitlements = "itemEntitlements";

    public static final String ItemPrerequisites = "itemPrerequisites";

    public static final String LegacyResourceId = "legacyResourceId";

    public static final String OncePerCustomer = "oncePerCustomer";

    public static final String PrerequisiteQuantityRange = "prerequisiteQuantityRange";

    public static final String PrerequisiteShippingPriceRange = "prerequisiteShippingPriceRange";

    public static final String PrerequisiteSubtotalRange = "prerequisiteSubtotalRange";

    public static final String PrerequisiteToEntitlementQuantityRatio = "prerequisiteToEntitlementQuantityRatio";

    public static final String ShareableUrls = "shareableUrls";

    public static final String ShippingEntitlements = "shippingEntitlements";

    public static final String StartsAt = "startsAt";

    public static final String Status = "status";

    public static final String Summary = "summary";

    public static final String Target = "target";

    public static final String Title = "title";

    public static final String TotalSales = "totalSales";

    public static final String Traits = "traits";

    public static final String UsageCount = "usageCount";

    public static final String UsageLimit = "usageLimit";

    public static final String ValidityPeriod = "validityPeriod";

    public static final String Value = "value";

    public static final String ValueV2 = "valueV2";

    public static class DISCOUNTCODES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";

      public static final String SavedSearchId = "savedSearchId";
    }

    public static class EVENTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }
  }

  public static class PRICERULEACTIVATEPAYLOAD {
    public static final String TYPE_NAME = "PriceRuleActivatePayload";

    public static final String PriceRule = "priceRule";

    public static final String PriceRuleUserErrors = "priceRuleUserErrors";

    public static final String UserErrors = "userErrors";
  }

  public static class PRICERULECONNECTION {
    public static final String TYPE_NAME = "PriceRuleConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class PRICERULECREATEPAYLOAD {
    public static final String TYPE_NAME = "PriceRuleCreatePayload";

    public static final String PriceRule = "priceRule";

    public static final String PriceRuleDiscountCode = "priceRuleDiscountCode";

    public static final String PriceRuleUserErrors = "priceRuleUserErrors";

    public static final String UserErrors = "userErrors";
  }

  public static class PRICERULECUSTOMERSELECTION {
    public static final String TYPE_NAME = "PriceRuleCustomerSelection";

    public static final String Customers = "customers";

    public static final String ForAllCustomers = "forAllCustomers";

    public static final String Segments = "segments";

    public static class CUSTOMERS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";

      public static final String SavedSearchId = "savedSearchId";
    }
  }

  public static class PRICERULEDEACTIVATEPAYLOAD {
    public static final String TYPE_NAME = "PriceRuleDeactivatePayload";

    public static final String PriceRule = "priceRule";

    public static final String PriceRuleUserErrors = "priceRuleUserErrors";

    public static final String UserErrors = "userErrors";
  }

  public static class PRICERULEDELETEPAYLOAD {
    public static final String TYPE_NAME = "PriceRuleDeletePayload";

    public static final String DeletedPriceRuleId = "deletedPriceRuleId";

    public static final String PriceRuleUserErrors = "priceRuleUserErrors";

    public static final String Shop = "shop";

    public static final String UserErrors = "userErrors";
  }

  public static class PRICERULEDISCOUNTCODE {
    public static final String TYPE_NAME = "PriceRuleDiscountCode";

    public static final String App = "app";

    public static final String Code = "code";

    public static final String Id = "id";

    public static final String UsageCount = "usageCount";
  }

  public static class PRICERULEDISCOUNTCODECONNECTION {
    public static final String TYPE_NAME = "PriceRuleDiscountCodeConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class PRICERULEDISCOUNTCODECREATEPAYLOAD {
    public static final String TYPE_NAME = "PriceRuleDiscountCodeCreatePayload";

    public static final String PriceRule = "priceRule";

    public static final String PriceRuleDiscountCode = "priceRuleDiscountCode";

    public static final String PriceRuleUserErrors = "priceRuleUserErrors";

    public static final String UserErrors = "userErrors";
  }

  public static class PRICERULEDISCOUNTCODEEDGE {
    public static final String TYPE_NAME = "PriceRuleDiscountCodeEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class PRICERULEDISCOUNTCODEUPDATEPAYLOAD {
    public static final String TYPE_NAME = "PriceRuleDiscountCodeUpdatePayload";

    public static final String PriceRule = "priceRule";

    public static final String PriceRuleDiscountCode = "priceRuleDiscountCode";

    public static final String PriceRuleUserErrors = "priceRuleUserErrors";

    public static final String UserErrors = "userErrors";
  }

  public static class PRICERULEEDGE {
    public static final String TYPE_NAME = "PriceRuleEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class PRICERULEENTITLEMENTTOPREREQUISITEQUANTITYRATIO {
    public static final String TYPE_NAME = "PriceRuleEntitlementToPrerequisiteQuantityRatio";

    public static final String EntitlementQuantity = "entitlementQuantity";

    public static final String PrerequisiteQuantity = "prerequisiteQuantity";
  }

  public static class PRICERULEFIXEDAMOUNTVALUE {
    public static final String TYPE_NAME = "PriceRuleFixedAmountValue";

    public static final String Amount = "amount";
  }

  public static class PRICERULEITEMENTITLEMENTS {
    public static final String TYPE_NAME = "PriceRuleItemEntitlements";

    public static final String Collections = "collections";

    public static final String ProductVariants = "productVariants";

    public static final String Products = "products";

    public static final String TargetAllLineItems = "targetAllLineItems";

    public static class COLLECTIONS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PRODUCTVARIANTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PRODUCTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class PRICERULELINEITEMPREREQUISITES {
    public static final String TYPE_NAME = "PriceRuleLineItemPrerequisites";

    public static final String Collections = "collections";

    public static final String ProductVariants = "productVariants";

    public static final String Products = "products";

    public static class COLLECTIONS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PRODUCTVARIANTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PRODUCTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class PRICERULEMONEYRANGE {
    public static final String TYPE_NAME = "PriceRuleMoneyRange";

    public static final String GreaterThan = "greaterThan";

    public static final String GreaterThanOrEqualTo = "greaterThanOrEqualTo";

    public static final String LessThan = "lessThan";

    public static final String LessThanOrEqualTo = "lessThanOrEqualTo";
  }

  public static class PRICERULEPERCENTVALUE {
    public static final String TYPE_NAME = "PriceRulePercentValue";

    public static final String Percentage = "percentage";
  }

  public static class PRICERULEPREREQUISITETOENTITLEMENTQUANTITYRATIO {
    public static final String TYPE_NAME = "PriceRulePrerequisiteToEntitlementQuantityRatio";

    public static final String EntitlementQuantity = "entitlementQuantity";

    public static final String PrerequisiteQuantity = "prerequisiteQuantity";
  }

  public static class PRICERULEQUANTITYRANGE {
    public static final String TYPE_NAME = "PriceRuleQuantityRange";

    public static final String GreaterThan = "greaterThan";

    public static final String GreaterThanOrEqualTo = "greaterThanOrEqualTo";

    public static final String LessThan = "lessThan";

    public static final String LessThanOrEqualTo = "lessThanOrEqualTo";
  }

  public static class PRICERULESHAREABLEURL {
    public static final String TYPE_NAME = "PriceRuleShareableUrl";

    public static final String TargetItemImage = "targetItemImage";

    public static final String TargetType = "targetType";

    public static final String Title = "title";

    public static final String Url = "url";
  }

  public static class PRICERULESHIPPINGLINEENTITLEMENTS {
    public static final String TYPE_NAME = "PriceRuleShippingLineEntitlements";

    public static final String CountryCodes = "countryCodes";

    public static final String IncludeRestOfWorld = "includeRestOfWorld";

    public static final String TargetAllShippingLines = "targetAllShippingLines";
  }

  public static class PRICERULEUPDATEPAYLOAD {
    public static final String TYPE_NAME = "PriceRuleUpdatePayload";

    public static final String PriceRule = "priceRule";

    public static final String PriceRuleDiscountCode = "priceRuleDiscountCode";

    public static final String PriceRuleUserErrors = "priceRuleUserErrors";

    public static final String UserErrors = "userErrors";
  }

  public static class PRICERULEUSERERROR {
    public static final String TYPE_NAME = "PriceRuleUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class PRICERULEVALIDITYPERIOD {
    public static final String TYPE_NAME = "PriceRuleValidityPeriod";

    public static final String End = "end";

    public static final String Start = "start";
  }

  public static class PRICINGPERCENTAGEVALUE {
    public static final String TYPE_NAME = "PricingPercentageValue";

    public static final String Percentage = "percentage";
  }

  public static class PRIVATEMETAFIELD {
    public static final String TYPE_NAME = "PrivateMetafield";

    public static final String CreatedAt = "createdAt";

    public static final String Id = "id";

    public static final String Key = "key";

    public static final String Namespace = "namespace";

    public static final String UpdatedAt = "updatedAt";

    public static final String Value = "value";

    public static final String ValueType = "valueType";
  }

  public static class PRIVATEMETAFIELDCONNECTION {
    public static final String TYPE_NAME = "PrivateMetafieldConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class PRIVATEMETAFIELDDELETEPAYLOAD {
    public static final String TYPE_NAME = "PrivateMetafieldDeletePayload";

    public static final String DeletedPrivateMetafieldId = "deletedPrivateMetafieldId";

    public static final String UserErrors = "userErrors";
  }

  public static class PRIVATEMETAFIELDEDGE {
    public static final String TYPE_NAME = "PrivateMetafieldEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class PRIVATEMETAFIELDUPSERTPAYLOAD {
    public static final String TYPE_NAME = "PrivateMetafieldUpsertPayload";

    public static final String PrivateMetafield = "privateMetafield";

    public static final String UserErrors = "userErrors";
  }

  public static class PRODUCT {
    public static final String TYPE_NAME = "Product";

    public static final String AvailablePublicationCount = "availablePublicationCount";

    public static final String BodyHtml = "bodyHtml";

    public static final String Collections = "collections";

    public static final String CompareAtPriceRange = "compareAtPriceRange";

    public static final String ContextualPricing = "contextualPricing";

    public static final String CreatedAt = "createdAt";

    public static final String CustomProductType = "customProductType";

    public static final String DefaultCursor = "defaultCursor";

    public static final String Description = "description";

    public static final String DescriptionHtml = "descriptionHtml";

    public static final String DescriptionPlainSummary = "descriptionPlainSummary";

    public static final String FeaturedImage = "featuredImage";

    public static final String FeaturedMedia = "featuredMedia";

    public static final String Feedback = "feedback";

    public static final String GiftCardTemplateSuffix = "giftCardTemplateSuffix";

    public static final String Handle = "handle";

    public static final String HasOnlyDefaultVariant = "hasOnlyDefaultVariant";

    public static final String HasOutOfStockVariants = "hasOutOfStockVariants";

    public static final String HasVariantsThatRequiresComponents = "hasVariantsThatRequiresComponents";

    public static final String Id = "id";

    public static final String Images = "images";

    public static final String InCollection = "inCollection";

    public static final String IsGiftCard = "isGiftCard";

    public static final String LegacyResourceId = "legacyResourceId";

    public static final String Media = "media";

    public static final String MediaCount = "mediaCount";

    public static final String Metafield = "metafield";

    public static final String MetafieldDefinitions = "metafieldDefinitions";

    public static final String Metafields = "metafields";

    public static final String OnlineStorePreviewUrl = "onlineStorePreviewUrl";

    public static final String OnlineStoreUrl = "onlineStoreUrl";

    public static final String Options = "options";

    public static final String PriceRange = "priceRange";

    public static final String PriceRangeV2 = "priceRangeV2";

    public static final String PrivateMetafield = "privateMetafield";

    public static final String PrivateMetafields = "privateMetafields";

    public static final String ProductCategory = "productCategory";

    public static final String ProductPublications = "productPublications";

    public static final String ProductType = "productType";

    public static final String PublicationCount = "publicationCount";

    public static final String Publications = "publications";

    public static final String PublishedAt = "publishedAt";

    public static final String PublishedInContext = "publishedInContext";

    public static final String PublishedOnChannel = "publishedOnChannel";

    public static final String PublishedOnCurrentChannel = "publishedOnCurrentChannel";

    public static final String PublishedOnCurrentPublication = "publishedOnCurrentPublication";

    public static final String PublishedOnPublication = "publishedOnPublication";

    public static final String RequiresSellingPlan = "requiresSellingPlan";

    public static final String ResourcePublicationOnCurrentPublication = "resourcePublicationOnCurrentPublication";

    public static final String ResourcePublications = "resourcePublications";

    public static final String ResourcePublicationsV2 = "resourcePublicationsV2";

    public static final String SellingPlanGroupCount = "sellingPlanGroupCount";

    public static final String SellingPlanGroups = "sellingPlanGroups";

    public static final String Seo = "seo";

    public static final String StandardizedProductType = "standardizedProductType";

    public static final String Status = "status";

    public static final String StorefrontId = "storefrontId";

    public static final String Tags = "tags";

    public static final String TemplateSuffix = "templateSuffix";

    public static final String Title = "title";

    public static final String TotalInventory = "totalInventory";

    public static final String TotalVariants = "totalVariants";

    public static final String TracksInventory = "tracksInventory";

    public static final String Translations = "translations";

    public static final String UnpublishedChannels = "unpublishedChannels";

    public static final String UnpublishedPublications = "unpublishedPublications";

    public static final String UpdatedAt = "updatedAt";

    public static final String Variants = "variants";

    public static final String Vendor = "vendor";

    public static class COLLECTIONS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class CONTEXTUALPRICING_INPUT_ARGUMENT {
      public static final String Context = "context";
    }

    public static class DESCRIPTION_INPUT_ARGUMENT {
      public static final String TruncateAt = "truncateAt";
    }

    public static class IMAGES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";
    }

    public static class INCOLLECTION_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class MEDIA_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";
    }

    public static class METAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class METAFIELDDEFINITIONS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String PinnedStatus = "pinnedStatus";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class METAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Keys = "keys";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class OPTIONS_INPUT_ARGUMENT {
      public static final String First = "first";
    }

    public static class PRIVATEMETAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class PRIVATEMETAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PRODUCTPUBLICATIONS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PUBLICATIONCOUNT_INPUT_ARGUMENT {
      public static final String OnlyPublished = "onlyPublished";
    }

    public static class PUBLICATIONS_INPUT_ARGUMENT {
      public static final String OnlyPublished = "onlyPublished";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PUBLISHEDINCONTEXT_INPUT_ARGUMENT {
      public static final String Context = "context";
    }

    public static class PUBLISHEDONCHANNEL_INPUT_ARGUMENT {
      public static final String ChannelId = "channelId";
    }

    public static class PUBLISHEDONPUBLICATION_INPUT_ARGUMENT {
      public static final String PublicationId = "publicationId";
    }

    public static class RESOURCEPUBLICATIONS_INPUT_ARGUMENT {
      public static final String OnlyPublished = "onlyPublished";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class RESOURCEPUBLICATIONSV2_INPUT_ARGUMENT {
      public static final String OnlyPublished = "onlyPublished";

      public static final String CatalogType = "catalogType";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class SELLINGPLANGROUPS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class TRANSLATIONS_INPUT_ARGUMENT {
      public static final String Locale = "locale";

      public static final String MarketId = "marketId";
    }

    public static class UNPUBLISHEDCHANNELS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class UNPUBLISHEDPUBLICATIONS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class VARIANTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";
    }
  }

  public static class PRODUCTAPPENDIMAGESPAYLOAD {
    public static final String TYPE_NAME = "ProductAppendImagesPayload";

    public static final String NewImages = "newImages";

    public static final String Product = "product";

    public static final String UserErrors = "userErrors";
  }

  public static class PRODUCTCATEGORY {
    public static final String TYPE_NAME = "ProductCategory";

    public static final String ProductTaxonomyNode = "productTaxonomyNode";
  }

  public static class PRODUCTCHANGESTATUSPAYLOAD {
    public static final String TYPE_NAME = "ProductChangeStatusPayload";

    public static final String Product = "product";

    public static final String UserErrors = "userErrors";
  }

  public static class PRODUCTCHANGESTATUSUSERERROR {
    public static final String TYPE_NAME = "ProductChangeStatusUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class PRODUCTCOMPAREATPRICERANGE {
    public static final String TYPE_NAME = "ProductCompareAtPriceRange";

    public static final String MaxVariantCompareAtPrice = "maxVariantCompareAtPrice";

    public static final String MinVariantCompareAtPrice = "minVariantCompareAtPrice";
  }

  public static class PRODUCTCONNECTION {
    public static final String TYPE_NAME = "ProductConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class PRODUCTCONTEXTUALPRICING {
    public static final String TYPE_NAME = "ProductContextualPricing";

    public static final String FixedQuantityRulesCount = "fixedQuantityRulesCount";

    public static final String MaxVariantPricing = "maxVariantPricing";

    public static final String MinVariantPricing = "minVariantPricing";

    public static final String PriceRange = "priceRange";
  }

  public static class PRODUCTCREATEMEDIAPAYLOAD {
    public static final String TYPE_NAME = "ProductCreateMediaPayload";

    public static final String Media = "media";

    public static final String MediaUserErrors = "mediaUserErrors";

    public static final String Product = "product";

    public static final String UserErrors = "userErrors";
  }

  public static class PRODUCTCREATEPAYLOAD {
    public static final String TYPE_NAME = "ProductCreatePayload";

    public static final String Product = "product";

    public static final String Shop = "shop";

    public static final String UserErrors = "userErrors";
  }

  public static class PRODUCTDELETEASYNCPAYLOAD {
    public static final String TYPE_NAME = "ProductDeleteAsyncPayload";

    public static final String DeleteProductId = "deleteProductId";

    public static final String Job = "job";

    public static final String UserErrors = "userErrors";
  }

  public static class PRODUCTDELETEIMAGESPAYLOAD {
    public static final String TYPE_NAME = "ProductDeleteImagesPayload";

    public static final String DeletedImageIds = "deletedImageIds";

    public static final String Product = "product";

    public static final String UserErrors = "userErrors";
  }

  public static class PRODUCTDELETEMEDIAPAYLOAD {
    public static final String TYPE_NAME = "ProductDeleteMediaPayload";

    public static final String DeletedMediaIds = "deletedMediaIds";

    public static final String DeletedProductImageIds = "deletedProductImageIds";

    public static final String MediaUserErrors = "mediaUserErrors";

    public static final String Product = "product";

    public static final String UserErrors = "userErrors";
  }

  public static class PRODUCTDELETEPAYLOAD {
    public static final String TYPE_NAME = "ProductDeletePayload";

    public static final String DeletedProductId = "deletedProductId";

    public static final String Shop = "shop";

    public static final String UserErrors = "userErrors";
  }

  public static class PRODUCTDELETEUSERERROR {
    public static final String TYPE_NAME = "ProductDeleteUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class PRODUCTDUPLICATEASYNCPAYLOAD {
    public static final String TYPE_NAME = "ProductDuplicateAsyncPayload";

    public static final String DuplicatedProductId = "duplicatedProductId";

    public static final String Job = "job";

    public static final String UserErrors = "userErrors";
  }

  public static class PRODUCTDUPLICATEASYNCV2PAYLOAD {
    public static final String TYPE_NAME = "ProductDuplicateAsyncV2Payload";

    public static final String DuplicatedProductId = "duplicatedProductId";

    public static final String ProductDuplicateJobId = "productDuplicateJobId";

    public static final String UserErrors = "userErrors";
  }

  public static class PRODUCTDUPLICATEJOB {
    public static final String TYPE_NAME = "ProductDuplicateJob";

    public static final String Done = "done";

    public static final String Id = "id";
  }

  public static class PRODUCTDUPLICATEPAYLOAD {
    public static final String TYPE_NAME = "ProductDuplicatePayload";

    public static final String ImageJob = "imageJob";

    public static final String NewProduct = "newProduct";

    public static final String Shop = "shop";

    public static final String UserErrors = "userErrors";
  }

  public static class PRODUCTDUPLICATEUSERERROR {
    public static final String TYPE_NAME = "ProductDuplicateUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class PRODUCTEDGE {
    public static final String TYPE_NAME = "ProductEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class PRODUCTFEED {
    public static final String TYPE_NAME = "ProductFeed";

    public static final String Country = "country";

    public static final String Id = "id";

    public static final String Language = "language";

    public static final String Status = "status";
  }

  public static class PRODUCTFEEDCONNECTION {
    public static final String TYPE_NAME = "ProductFeedConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class PRODUCTFEEDCREATEPAYLOAD {
    public static final String TYPE_NAME = "ProductFeedCreatePayload";

    public static final String ProductFeed = "productFeed";

    public static final String UserErrors = "userErrors";
  }

  public static class PRODUCTFEEDCREATEUSERERROR {
    public static final String TYPE_NAME = "ProductFeedCreateUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class PRODUCTFEEDDELETEPAYLOAD {
    public static final String TYPE_NAME = "ProductFeedDeletePayload";

    public static final String DeletedId = "deletedId";

    public static final String UserErrors = "userErrors";
  }

  public static class PRODUCTFEEDDELETEUSERERROR {
    public static final String TYPE_NAME = "ProductFeedDeleteUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class PRODUCTFEEDEDGE {
    public static final String TYPE_NAME = "ProductFeedEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class PRODUCTFULLSYNCPAYLOAD {
    public static final String TYPE_NAME = "ProductFullSyncPayload";

    public static final String UserErrors = "userErrors";
  }

  public static class PRODUCTFULLSYNCUSERERROR {
    public static final String TYPE_NAME = "ProductFullSyncUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class PRODUCTIMAGEUPDATEPAYLOAD {
    public static final String TYPE_NAME = "ProductImageUpdatePayload";

    public static final String Image = "image";

    public static final String UserErrors = "userErrors";
  }

  public static class PRODUCTJOINSELLINGPLANGROUPSPAYLOAD {
    public static final String TYPE_NAME = "ProductJoinSellingPlanGroupsPayload";

    public static final String Product = "product";

    public static final String UserErrors = "userErrors";
  }

  public static class PRODUCTLEAVESELLINGPLANGROUPSPAYLOAD {
    public static final String TYPE_NAME = "ProductLeaveSellingPlanGroupsPayload";

    public static final String Product = "product";

    public static final String UserErrors = "userErrors";
  }

  public static class PRODUCTOPTION {
    public static final String TYPE_NAME = "ProductOption";

    public static final String Id = "id";

    public static final String Name = "name";

    public static final String Position = "position";

    public static final String Translations = "translations";

    public static final String Values = "values";

    public static class TRANSLATIONS_INPUT_ARGUMENT {
      public static final String Locale = "locale";

      public static final String MarketId = "marketId";
    }
  }

  public static class PRODUCTPRICERANGE {
    public static final String TYPE_NAME = "ProductPriceRange";

    public static final String MaxVariantPrice = "maxVariantPrice";

    public static final String MinVariantPrice = "minVariantPrice";
  }

  public static class PRODUCTPRICERANGEV2 {
    public static final String TYPE_NAME = "ProductPriceRangeV2";

    public static final String MaxVariantPrice = "maxVariantPrice";

    public static final String MinVariantPrice = "minVariantPrice";
  }

  public static class PRODUCTPUBLICATION {
    public static final String TYPE_NAME = "ProductPublication";

    public static final String Channel = "channel";

    public static final String IsPublished = "isPublished";

    public static final String Product = "product";

    public static final String PublishDate = "publishDate";
  }

  public static class PRODUCTPUBLICATIONCONNECTION {
    public static final String TYPE_NAME = "ProductPublicationConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class PRODUCTPUBLICATIONEDGE {
    public static final String TYPE_NAME = "ProductPublicationEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class PRODUCTPUBLISHPAYLOAD {
    public static final String TYPE_NAME = "ProductPublishPayload";

    public static final String Product = "product";

    public static final String ProductPublications = "productPublications";

    public static final String Shop = "shop";

    public static final String UserErrors = "userErrors";
  }

  public static class PRODUCTREORDERIMAGESPAYLOAD {
    public static final String TYPE_NAME = "ProductReorderImagesPayload";

    public static final String Job = "job";

    public static final String UserErrors = "userErrors";
  }

  public static class PRODUCTREORDERMEDIAPAYLOAD {
    public static final String TYPE_NAME = "ProductReorderMediaPayload";

    public static final String Job = "job";

    public static final String MediaUserErrors = "mediaUserErrors";

    public static final String UserErrors = "userErrors";
  }

  public static class PRODUCTRESOURCEFEEDBACK {
    public static final String TYPE_NAME = "ProductResourceFeedback";

    public static final String FeedbackGeneratedAt = "feedbackGeneratedAt";

    public static final String Messages = "messages";

    public static final String ProductId = "productId";

    public static final String ProductUpdatedAt = "productUpdatedAt";

    public static final String State = "state";
  }

  public static class PRODUCTSALE {
    public static final String TYPE_NAME = "ProductSale";

    public static final String ActionType = "actionType";

    public static final String Id = "id";

    public static final String LineItem = "lineItem";

    public static final String LineType = "lineType";

    public static final String Quantity = "quantity";

    public static final String Taxes = "taxes";

    public static final String TotalAmount = "totalAmount";

    public static final String TotalDiscountAmountAfterTaxes = "totalDiscountAmountAfterTaxes";

    public static final String TotalDiscountAmountBeforeTaxes = "totalDiscountAmountBeforeTaxes";

    public static final String TotalTaxAmount = "totalTaxAmount";
  }

  public static class PRODUCTTAXONOMYNODE {
    public static final String TYPE_NAME = "ProductTaxonomyNode";

    public static final String FullName = "fullName";

    public static final String Id = "id";

    public static final String IsLeaf = "isLeaf";

    public static final String IsRoot = "isRoot";

    public static final String Name = "name";
  }

  public static class PRODUCTUNPUBLISHPAYLOAD {
    public static final String TYPE_NAME = "ProductUnpublishPayload";

    public static final String Product = "product";

    public static final String Shop = "shop";

    public static final String UserErrors = "userErrors";
  }

  public static class PRODUCTUPDATEMEDIAPAYLOAD {
    public static final String TYPE_NAME = "ProductUpdateMediaPayload";

    public static final String Media = "media";

    public static final String MediaUserErrors = "mediaUserErrors";

    public static final String Product = "product";

    public static final String UserErrors = "userErrors";
  }

  public static class PRODUCTUPDATEPAYLOAD {
    public static final String TYPE_NAME = "ProductUpdatePayload";

    public static final String Product = "product";

    public static final String UserErrors = "userErrors";
  }

  public static class PRODUCTVARIANT {
    public static final String TYPE_NAME = "ProductVariant";

    public static final String AvailableForSale = "availableForSale";

    public static final String Barcode = "barcode";

    public static final String CompareAtPrice = "compareAtPrice";

    public static final String ContextualPricing = "contextualPricing";

    public static final String CreatedAt = "createdAt";

    public static final String DefaultCursor = "defaultCursor";

    public static final String DeliveryProfile = "deliveryProfile";

    public static final String DisplayName = "displayName";

    public static final String FulfillmentService = "fulfillmentService";

    public static final String FulfillmentServiceEditable = "fulfillmentServiceEditable";

    public static final String HarmonizedSystemCode = "harmonizedSystemCode";

    public static final String Id = "id";

    public static final String Image = "image";

    public static final String InventoryItem = "inventoryItem";

    public static final String InventoryManagement = "inventoryManagement";

    public static final String InventoryPolicy = "inventoryPolicy";

    public static final String InventoryQuantity = "inventoryQuantity";

    public static final String LegacyResourceId = "legacyResourceId";

    public static final String Media = "media";

    public static final String Metafield = "metafield";

    public static final String MetafieldDefinitions = "metafieldDefinitions";

    public static final String Metafields = "metafields";

    public static final String Position = "position";

    public static final String PresentmentPrices = "presentmentPrices";

    public static final String Price = "price";

    public static final String PrivateMetafield = "privateMetafield";

    public static final String PrivateMetafields = "privateMetafields";

    public static final String Product = "product";

    public static final String ProductVariantComponents = "productVariantComponents";

    public static final String RequiresComponents = "requiresComponents";

    public static final String RequiresShipping = "requiresShipping";

    public static final String SelectedOptions = "selectedOptions";

    public static final String SellableOnlineQuantity = "sellableOnlineQuantity";

    public static final String SellingPlanGroupCount = "sellingPlanGroupCount";

    public static final String SellingPlanGroups = "sellingPlanGroups";

    public static final String Sku = "sku";

    public static final String StorefrontId = "storefrontId";

    public static final String TaxCode = "taxCode";

    public static final String Taxable = "taxable";

    public static final String Title = "title";

    public static final String Translations = "translations";

    public static final String UpdatedAt = "updatedAt";

    public static final String Weight = "weight";

    public static final String WeightUnit = "weightUnit";

    public static class CONTEXTUALPRICING_INPUT_ARGUMENT {
      public static final String Context = "context";
    }

    public static class MEDIA_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class METAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class METAFIELDDEFINITIONS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String PinnedStatus = "pinnedStatus";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class METAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Keys = "keys";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PRESENTMENTPRICES_INPUT_ARGUMENT {
      public static final String PresentmentCurrencies = "presentmentCurrencies";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PRIVATEMETAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class PRIVATEMETAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PRODUCTVARIANTCOMPONENTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class SELLINGPLANGROUPS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class TRANSLATIONS_INPUT_ARGUMENT {
      public static final String Locale = "locale";

      public static final String MarketId = "marketId";
    }
  }

  public static class PRODUCTVARIANTAPPENDMEDIAPAYLOAD {
    public static final String TYPE_NAME = "ProductVariantAppendMediaPayload";

    public static final String Product = "product";

    public static final String ProductVariants = "productVariants";

    public static final String UserErrors = "userErrors";
  }

  public static class PRODUCTVARIANTCOMPONENT {
    public static final String TYPE_NAME = "ProductVariantComponent";

    public static final String Id = "id";

    public static final String ProductVariant = "productVariant";

    public static final String Quantity = "quantity";
  }

  public static class PRODUCTVARIANTCOMPONENTCONNECTION {
    public static final String TYPE_NAME = "ProductVariantComponentConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class PRODUCTVARIANTCOMPONENTEDGE {
    public static final String TYPE_NAME = "ProductVariantComponentEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class PRODUCTVARIANTCONNECTION {
    public static final String TYPE_NAME = "ProductVariantConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class PRODUCTVARIANTCONTEXTUALPRICING {
    public static final String TYPE_NAME = "ProductVariantContextualPricing";

    public static final String CompareAtPrice = "compareAtPrice";

    public static final String Price = "price";

    public static final String QuantityPriceBreaks = "quantityPriceBreaks";

    public static final String QuantityRule = "quantityRule";

    public static class QUANTITYPRICEBREAKS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";
    }
  }

  public static class PRODUCTVARIANTCREATEPAYLOAD {
    public static final String TYPE_NAME = "ProductVariantCreatePayload";

    public static final String Product = "product";

    public static final String ProductVariant = "productVariant";

    public static final String UserErrors = "userErrors";
  }

  public static class PRODUCTVARIANTDELETEPAYLOAD {
    public static final String TYPE_NAME = "ProductVariantDeletePayload";

    public static final String DeletedProductVariantId = "deletedProductVariantId";

    public static final String Product = "product";

    public static final String UserErrors = "userErrors";
  }

  public static class PRODUCTVARIANTDETACHMEDIAPAYLOAD {
    public static final String TYPE_NAME = "ProductVariantDetachMediaPayload";

    public static final String Product = "product";

    public static final String ProductVariants = "productVariants";

    public static final String UserErrors = "userErrors";
  }

  public static class PRODUCTVARIANTEDGE {
    public static final String TYPE_NAME = "ProductVariantEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class PRODUCTVARIANTJOINSELLINGPLANGROUPSPAYLOAD {
    public static final String TYPE_NAME = "ProductVariantJoinSellingPlanGroupsPayload";

    public static final String ProductVariant = "productVariant";

    public static final String UserErrors = "userErrors";
  }

  public static class PRODUCTVARIANTLEAVESELLINGPLANGROUPSPAYLOAD {
    public static final String TYPE_NAME = "ProductVariantLeaveSellingPlanGroupsPayload";

    public static final String ProductVariant = "productVariant";

    public static final String UserErrors = "userErrors";
  }

  public static class PRODUCTVARIANTPRICEPAIR {
    public static final String TYPE_NAME = "ProductVariantPricePair";

    public static final String CompareAtPrice = "compareAtPrice";

    public static final String Price = "price";
  }

  public static class PRODUCTVARIANTPRICEPAIRCONNECTION {
    public static final String TYPE_NAME = "ProductVariantPricePairConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class PRODUCTVARIANTPRICEPAIREDGE {
    public static final String TYPE_NAME = "ProductVariantPricePairEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class PRODUCTVARIANTRELATIONSHIPBULKUPDATEPAYLOAD {
    public static final String TYPE_NAME = "ProductVariantRelationshipBulkUpdatePayload";

    public static final String ParentProductVariants = "parentProductVariants";

    public static final String UserErrors = "userErrors";
  }

  public static class PRODUCTVARIANTRELATIONSHIPBULKUPDATEUSERERROR {
    public static final String TYPE_NAME = "ProductVariantRelationshipBulkUpdateUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class PRODUCTVARIANTSBULKCREATEPAYLOAD {
    public static final String TYPE_NAME = "ProductVariantsBulkCreatePayload";

    public static final String Product = "product";

    public static final String ProductVariants = "productVariants";

    public static final String UserErrors = "userErrors";
  }

  public static class PRODUCTVARIANTSBULKCREATEUSERERROR {
    public static final String TYPE_NAME = "ProductVariantsBulkCreateUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class PRODUCTVARIANTSBULKDELETEPAYLOAD {
    public static final String TYPE_NAME = "ProductVariantsBulkDeletePayload";

    public static final String Product = "product";

    public static final String UserErrors = "userErrors";
  }

  public static class PRODUCTVARIANTSBULKDELETEUSERERROR {
    public static final String TYPE_NAME = "ProductVariantsBulkDeleteUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class PRODUCTVARIANTSBULKREORDERPAYLOAD {
    public static final String TYPE_NAME = "ProductVariantsBulkReorderPayload";

    public static final String Product = "product";

    public static final String UserErrors = "userErrors";
  }

  public static class PRODUCTVARIANTSBULKREORDERUSERERROR {
    public static final String TYPE_NAME = "ProductVariantsBulkReorderUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class PRODUCTVARIANTSBULKUPDATEPAYLOAD {
    public static final String TYPE_NAME = "ProductVariantsBulkUpdatePayload";

    public static final String Product = "product";

    public static final String ProductVariants = "productVariants";

    public static final String UserErrors = "userErrors";
  }

  public static class PRODUCTVARIANTSBULKUPDATEUSERERROR {
    public static final String TYPE_NAME = "ProductVariantsBulkUpdateUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class PRODUCTVARIANTUPDATEPAYLOAD {
    public static final String TYPE_NAME = "ProductVariantUpdatePayload";

    public static final String Product = "product";

    public static final String ProductVariant = "productVariant";

    public static final String UserErrors = "userErrors";
  }

  public static class PUBLICATION {
    public static final String TYPE_NAME = "Publication";

    public static final String App = "app";

    public static final String AutoPublish = "autoPublish";

    public static final String Catalog = "catalog";

    public static final String CollectionPublicationsV3 = "collectionPublicationsV3";

    public static final String Collections = "collections";

    public static final String HasCollection = "hasCollection";

    public static final String Id = "id";

    public static final String Name = "name";

    public static final String Operation = "operation";

    public static final String ProductPublicationsV3 = "productPublicationsV3";

    public static final String Products = "products";

    public static final String SupportsFuturePublishing = "supportsFuturePublishing";

    public static class COLLECTIONPUBLICATIONSV3_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class COLLECTIONS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class HASCOLLECTION_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class PRODUCTPUBLICATIONSV3_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PRODUCTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class PUBLICATIONCONNECTION {
    public static final String TYPE_NAME = "PublicationConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class PUBLICATIONCREATEPAYLOAD {
    public static final String TYPE_NAME = "PublicationCreatePayload";

    public static final String Publication = "publication";

    public static final String UserErrors = "userErrors";
  }

  public static class PUBLICATIONDELETEPAYLOAD {
    public static final String TYPE_NAME = "PublicationDeletePayload";

    public static final String DeletedId = "deletedId";

    public static final String UserErrors = "userErrors";
  }

  public static class PUBLICATIONEDGE {
    public static final String TYPE_NAME = "PublicationEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class PUBLICATIONRESOURCEOPERATION {
    public static final String TYPE_NAME = "PublicationResourceOperation";

    public static final String Id = "id";

    public static final String ProcessedRowCount = "processedRowCount";

    public static final String RowCount = "rowCount";

    public static final String Status = "status";
  }

  public static class PUBLICATIONUPDATEPAYLOAD {
    public static final String TYPE_NAME = "PublicationUpdatePayload";

    public static final String Publication = "publication";

    public static final String UserErrors = "userErrors";
  }

  public static class PUBLICATIONUSERERROR {
    public static final String TYPE_NAME = "PublicationUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class PUBLISHABLEPUBLISHPAYLOAD {
    public static final String TYPE_NAME = "PublishablePublishPayload";

    public static final String Publishable = "publishable";

    public static final String Shop = "shop";

    public static final String UserErrors = "userErrors";
  }

  public static class PUBLISHABLEPUBLISHTOCURRENTCHANNELPAYLOAD {
    public static final String TYPE_NAME = "PublishablePublishToCurrentChannelPayload";

    public static final String Publishable = "publishable";

    public static final String Shop = "shop";

    public static final String UserErrors = "userErrors";
  }

  public static class PUBLISHABLEUNPUBLISHPAYLOAD {
    public static final String TYPE_NAME = "PublishableUnpublishPayload";

    public static final String Publishable = "publishable";

    public static final String Shop = "shop";

    public static final String UserErrors = "userErrors";
  }

  public static class PUBLISHABLEUNPUBLISHTOCURRENTCHANNELPAYLOAD {
    public static final String TYPE_NAME = "PublishableUnpublishToCurrentChannelPayload";

    public static final String Publishable = "publishable";

    public static final String Shop = "shop";

    public static final String UserErrors = "userErrors";
  }

  public static class PUBSUBSERVERPIXELUPDATEPAYLOAD {
    public static final String TYPE_NAME = "PubSubServerPixelUpdatePayload";

    public static final String ServerPixel = "serverPixel";

    public static final String UserErrors = "userErrors";
  }

  public static class PUBSUBWEBHOOKSUBSCRIPTIONCREATEPAYLOAD {
    public static final String TYPE_NAME = "PubSubWebhookSubscriptionCreatePayload";

    public static final String UserErrors = "userErrors";

    public static final String WebhookSubscription = "webhookSubscription";
  }

  public static class PUBSUBWEBHOOKSUBSCRIPTIONCREATEUSERERROR {
    public static final String TYPE_NAME = "PubSubWebhookSubscriptionCreateUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class PUBSUBWEBHOOKSUBSCRIPTIONUPDATEPAYLOAD {
    public static final String TYPE_NAME = "PubSubWebhookSubscriptionUpdatePayload";

    public static final String UserErrors = "userErrors";

    public static final String WebhookSubscription = "webhookSubscription";
  }

  public static class PUBSUBWEBHOOKSUBSCRIPTIONUPDATEUSERERROR {
    public static final String TYPE_NAME = "PubSubWebhookSubscriptionUpdateUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class PURCHASINGCOMPANY {
    public static final String TYPE_NAME = "PurchasingCompany";

    public static final String Company = "company";

    public static final String Contact = "contact";

    public static final String Location = "location";
  }

  public static class QUANTITYPRICEBREAK {
    public static final String TYPE_NAME = "QuantityPriceBreak";

    public static final String Id = "id";

    public static final String MinimumQuantity = "minimumQuantity";

    public static final String Price = "price";

    public static final String PriceList = "priceList";

    public static final String Variant = "variant";
  }

  public static class QUANTITYPRICEBREAKCONNECTION {
    public static final String TYPE_NAME = "QuantityPriceBreakConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class QUANTITYPRICEBREAKEDGE {
    public static final String TYPE_NAME = "QuantityPriceBreakEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class QUANTITYPRICINGBYVARIANTUPDATEPAYLOAD {
    public static final String TYPE_NAME = "QuantityPricingByVariantUpdatePayload";

    public static final String ProductVariants = "productVariants";

    public static final String UserErrors = "userErrors";
  }

  public static class QUANTITYPRICINGBYVARIANTUSERERROR {
    public static final String TYPE_NAME = "QuantityPricingByVariantUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class QUANTITYRULE {
    public static final String TYPE_NAME = "QuantityRule";

    public static final String Increment = "increment";

    public static final String IsDefault = "isDefault";

    public static final String Maximum = "maximum";

    public static final String Minimum = "minimum";

    public static final String OriginType = "originType";

    public static final String ProductVariant = "productVariant";
  }

  public static class QUANTITYRULECONNECTION {
    public static final String TYPE_NAME = "QuantityRuleConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class QUANTITYRULEEDGE {
    public static final String TYPE_NAME = "QuantityRuleEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class QUANTITYRULESADDPAYLOAD {
    public static final String TYPE_NAME = "QuantityRulesAddPayload";

    public static final String QuantityRules = "quantityRules";

    public static final String UserErrors = "userErrors";
  }

  public static class QUANTITYRULESDELETEPAYLOAD {
    public static final String TYPE_NAME = "QuantityRulesDeletePayload";

    public static final String DeletedQuantityRulesVariantIds = "deletedQuantityRulesVariantIds";

    public static final String UserErrors = "userErrors";
  }

  public static class QUANTITYRULEUSERERROR {
    public static final String TYPE_NAME = "QuantityRuleUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class QUERYROOT {
    public static final String TYPE_NAME = "QueryRoot";

    public static final String Abandonment = "abandonment";

    public static final String AbandonmentByAbandonedCheckoutId = "abandonmentByAbandonedCheckoutId";

    public static final String App = "app";

    public static final String AppByHandle = "appByHandle";

    public static final String AppByKey = "appByKey";

    public static final String AppDiscountType = "appDiscountType";

    public static final String AppDiscountTypes = "appDiscountTypes";

    public static final String AppInstallation = "appInstallation";

    public static final String AppInstallations = "appInstallations";

    public static final String AutomaticDiscount = "automaticDiscount";

    public static final String AutomaticDiscountNode = "automaticDiscountNode";

    public static final String AutomaticDiscountNodes = "automaticDiscountNodes";

    public static final String AutomaticDiscountSavedSearches = "automaticDiscountSavedSearches";

    public static final String AutomaticDiscounts = "automaticDiscounts";

    public static final String AvailableCarrierServices = "availableCarrierServices";

    public static final String AvailableLocales = "availableLocales";

    public static final String CarrierService = "carrierService";

    public static final String CartTransforms = "cartTransforms";

    public static final String Catalog = "catalog";

    public static final String CatalogOperations = "catalogOperations";

    public static final String Catalogs = "catalogs";

    public static final String Channel = "channel";

    public static final String Channels = "channels";

    public static final String CheckoutBranding = "checkoutBranding";

    public static final String CheckoutProfile = "checkoutProfile";

    public static final String CheckoutProfiles = "checkoutProfiles";

    public static final String CodeDiscountNode = "codeDiscountNode";

    public static final String CodeDiscountNodeByCode = "codeDiscountNodeByCode";

    public static final String CodeDiscountNodes = "codeDiscountNodes";

    public static final String CodeDiscountSavedSearches = "codeDiscountSavedSearches";

    public static final String Collection = "collection";

    public static final String CollectionByHandle = "collectionByHandle";

    public static final String CollectionRulesConditions = "collectionRulesConditions";

    public static final String CollectionSavedSearches = "collectionSavedSearches";

    public static final String Collections = "collections";

    public static final String Companies = "companies";

    public static final String Company = "company";

    public static final String CompanyContact = "companyContact";

    public static final String CompanyContactRole = "companyContactRole";

    public static final String CompanyCount = "companyCount";

    public static final String CompanyLocation = "companyLocation";

    public static final String CompanyLocations = "companyLocations";

    public static final String CurrentAppInstallation = "currentAppInstallation";

    public static final String CurrentBulkOperation = "currentBulkOperation";

    public static final String Customer = "customer";

    public static final String CustomerMergeJobStatus = "customerMergeJobStatus";

    public static final String CustomerMergePreview = "customerMergePreview";

    public static final String CustomerPaymentMethod = "customerPaymentMethod";

    public static final String CustomerSegmentMembers = "customerSegmentMembers";

    public static final String CustomerSegmentMembersQuery = "customerSegmentMembersQuery";

    public static final String CustomerSegmentMembership = "customerSegmentMembership";

    public static final String Customers = "customers";

    public static final String DeletionEvents = "deletionEvents";

    public static final String DeliveryCustomization = "deliveryCustomization";

    public static final String DeliveryCustomizations = "deliveryCustomizations";

    public static final String DeliveryProfile = "deliveryProfile";

    public static final String DeliveryProfiles = "deliveryProfiles";

    public static final String DeliverySettings = "deliverySettings";

    public static final String DiscountCodeCount = "discountCodeCount";

    public static final String DiscountNode = "discountNode";

    public static final String DiscountNodes = "discountNodes";

    public static final String DiscountRedeemCodeBulkCreation = "discountRedeemCodeBulkCreation";

    public static final String DiscountRedeemCodeSavedSearches = "discountRedeemCodeSavedSearches";

    public static final String Dispute = "dispute";

    public static final String DisputeEvidence = "disputeEvidence";

    public static final String Domain = "domain";

    public static final String DraftOrder = "draftOrder";

    public static final String DraftOrderSavedSearches = "draftOrderSavedSearches";

    public static final String DraftOrderTag = "draftOrderTag";

    public static final String DraftOrders = "draftOrders";

    public static final String FileSavedSearches = "fileSavedSearches";

    public static final String Files = "files";

    public static final String Fulfillment = "fulfillment";

    public static final String FulfillmentConstraintRules = "fulfillmentConstraintRules";

    public static final String FulfillmentOrder = "fulfillmentOrder";

    public static final String FulfillmentOrders = "fulfillmentOrders";

    public static final String FulfillmentService = "fulfillmentService";

    public static final String GiftCard = "giftCard";

    public static final String GiftCards = "giftCards";

    public static final String GiftCardsCount = "giftCardsCount";

    public static final String InventoryItem = "inventoryItem";

    public static final String InventoryItems = "inventoryItems";

    public static final String InventoryLevel = "inventoryLevel";

    public static final String InventoryProperties = "inventoryProperties";

    public static final String Job = "job";

    public static final String Location = "location";

    public static final String Locations = "locations";

    public static final String LocationsAvailableForDeliveryProfiles = "locationsAvailableForDeliveryProfiles";

    public static final String LocationsAvailableForDeliveryProfilesConnection = "locationsAvailableForDeliveryProfilesConnection";

    public static final String ManualHoldsFulfillmentOrders = "manualHoldsFulfillmentOrders";

    public static final String Market = "market";

    public static final String MarketByGeography = "marketByGeography";

    public static final String MarketLocalizableResource = "marketLocalizableResource";

    public static final String MarketLocalizableResources = "marketLocalizableResources";

    public static final String MarketLocalizableResourcesByIds = "marketLocalizableResourcesByIds";

    public static final String MarketingActivities = "marketingActivities";

    public static final String MarketingActivity = "marketingActivity";

    public static final String MarketingEvent = "marketingEvent";

    public static final String MarketingEvents = "marketingEvents";

    public static final String Markets = "markets";

    public static final String MetafieldDefinition = "metafieldDefinition";

    public static final String MetafieldDefinitionTypes = "metafieldDefinitionTypes";

    public static final String MetafieldDefinitions = "metafieldDefinitions";

    public static final String MetafieldStorefrontVisibilities = "metafieldStorefrontVisibilities";

    public static final String MetafieldStorefrontVisibility = "metafieldStorefrontVisibility";

    public static final String Metaobject = "metaobject";

    public static final String MetaobjectByHandle = "metaobjectByHandle";

    public static final String MetaobjectDefinition = "metaobjectDefinition";

    public static final String MetaobjectDefinitionByType = "metaobjectDefinitionByType";

    public static final String MetaobjectDefinitions = "metaobjectDefinitions";

    public static final String Metaobjects = "metaobjects";

    public static final String Node = "node";

    public static final String Nodes = "nodes";

    public static final String Order = "order";

    public static final String OrderPaymentStatus = "orderPaymentStatus";

    public static final String OrderSavedSearches = "orderSavedSearches";

    public static final String Orders = "orders";

    public static final String PaymentCustomization = "paymentCustomization";

    public static final String PaymentCustomizations = "paymentCustomizations";

    public static final String PaymentTermsTemplates = "paymentTermsTemplates";

    public static final String PriceList = "priceList";

    public static final String PriceLists = "priceLists";

    public static final String PriceRule = "priceRule";

    public static final String PriceRuleSavedSearches = "priceRuleSavedSearches";

    public static final String PriceRules = "priceRules";

    public static final String PrimaryMarket = "primaryMarket";

    public static final String PrivateMetafield = "privateMetafield";

    public static final String PrivateMetafields = "privateMetafields";

    public static final String Product = "product";

    public static final String ProductByHandle = "productByHandle";

    public static final String ProductDuplicateJob = "productDuplicateJob";

    public static final String ProductFeed = "productFeed";

    public static final String ProductFeeds = "productFeeds";

    public static final String ProductResourceFeedback = "productResourceFeedback";

    public static final String ProductSavedSearches = "productSavedSearches";

    public static final String ProductVariant = "productVariant";

    public static final String ProductVariants = "productVariants";

    public static final String Products = "products";

    public static final String PublicApiVersions = "publicApiVersions";

    public static final String Publication = "publication";

    public static final String Publications = "publications";

    public static final String Refund = "refund";

    public static final String Return = "return";

    public static final String ReturnableFulfillment = "returnableFulfillment";

    public static final String ReturnableFulfillments = "returnableFulfillments";

    public static final String ReverseDelivery = "reverseDelivery";

    public static final String ReverseFulfillmentOrder = "reverseFulfillmentOrder";

    public static final String ScriptTag = "scriptTag";

    public static final String ScriptTags = "scriptTags";

    public static final String Segment = "segment";

    public static final String SegmentCount = "segmentCount";

    public static final String SegmentFilterSuggestions = "segmentFilterSuggestions";

    public static final String SegmentFilters = "segmentFilters";

    public static final String SegmentMigrations = "segmentMigrations";

    public static final String SegmentValueSuggestions = "segmentValueSuggestions";

    public static final String Segments = "segments";

    public static final String SellingPlanGroup = "sellingPlanGroup";

    public static final String SellingPlanGroups = "sellingPlanGroups";

    public static final String ServerPixel = "serverPixel";

    public static final String Shop = "shop";

    public static final String ShopBillingPreferences = "shopBillingPreferences";

    public static final String ShopLocales = "shopLocales";

    public static final String ShopifyFunction = "shopifyFunction";

    public static final String ShopifyFunctions = "shopifyFunctions";

    public static final String ShopifyPaymentsAccount = "shopifyPaymentsAccount";

    public static final String ShopifyqlQuery = "shopifyqlQuery";

    public static final String StaffMember = "staffMember";

    public static final String StandardMetafieldDefinitionTemplates = "standardMetafieldDefinitionTemplates";

    public static final String SubscriptionBillingAttempt = "subscriptionBillingAttempt";

    public static final String SubscriptionBillingAttempts = "subscriptionBillingAttempts";

    public static final String SubscriptionBillingCycle = "subscriptionBillingCycle";

    public static final String SubscriptionBillingCycles = "subscriptionBillingCycles";

    public static final String SubscriptionContract = "subscriptionContract";

    public static final String SubscriptionContracts = "subscriptionContracts";

    public static final String SubscriptionDraft = "subscriptionDraft";

    public static final String TenderTransactions = "tenderTransactions";

    public static final String TranslatableResource = "translatableResource";

    public static final String TranslatableResources = "translatableResources";

    public static final String TranslatableResourcesByIds = "translatableResourcesByIds";

    public static final String UrlRedirect = "urlRedirect";

    public static final String UrlRedirectImport = "urlRedirectImport";

    public static final String UrlRedirectSavedSearches = "urlRedirectSavedSearches";

    public static final String UrlRedirects = "urlRedirects";

    public static final String Validation = "validation";

    public static final String Validations = "validations";

    public static final String WebPixel = "webPixel";

    public static final String WebhookSubscription = "webhookSubscription";

    public static final String WebhookSubscriptions = "webhookSubscriptions";

    public static class ABANDONMENT_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class ABANDONMENTBYABANDONEDCHECKOUTID_INPUT_ARGUMENT {
      public static final String AbandonedCheckoutId = "abandonedCheckoutId";
    }

    public static class APP_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class APPBYHANDLE_INPUT_ARGUMENT {
      public static final String Handle = "handle";
    }

    public static class APPBYKEY_INPUT_ARGUMENT {
      public static final String ApiKey = "apiKey";
    }

    public static class APPDISCOUNTTYPE_INPUT_ARGUMENT {
      public static final String FunctionId = "functionId";
    }

    public static class APPINSTALLATION_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class APPINSTALLATIONS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Category = "category";

      public static final String Privacy = "privacy";
    }

    public static class AUTOMATICDISCOUNT_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class AUTOMATICDISCOUNTNODE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class AUTOMATICDISCOUNTNODES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";

      public static final String SavedSearchId = "savedSearchId";
    }

    public static class AUTOMATICDISCOUNTSAVEDSEARCHES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class AUTOMATICDISCOUNTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";

      public static final String SavedSearchId = "savedSearchId";
    }

    public static class CARRIERSERVICE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class CARTTRANSFORMS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class CATALOG_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class CATALOGS_INPUT_ARGUMENT {
      public static final String Type = "type";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class CHANNEL_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class CHANNELS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class CHECKOUTBRANDING_INPUT_ARGUMENT {
      public static final String CheckoutProfileId = "checkoutProfileId";
    }

    public static class CHECKOUTPROFILE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class CHECKOUTPROFILES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class CODEDISCOUNTNODE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class CODEDISCOUNTNODEBYCODE_INPUT_ARGUMENT {
      public static final String Code = "code";
    }

    public static class CODEDISCOUNTNODES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";

      public static final String SavedSearchId = "savedSearchId";
    }

    public static class CODEDISCOUNTSAVEDSEARCHES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class COLLECTION_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class COLLECTIONBYHANDLE_INPUT_ARGUMENT {
      public static final String Handle = "handle";
    }

    public static class COLLECTIONSAVEDSEARCHES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class COLLECTIONS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";

      public static final String SavedSearchId = "savedSearchId";
    }

    public static class COMPANIES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class COMPANY_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class COMPANYCONTACT_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class COMPANYCONTACTROLE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class COMPANYLOCATION_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class COMPANYLOCATIONS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class CURRENTBULKOPERATION_INPUT_ARGUMENT {
      public static final String Type = "type";
    }

    public static class CUSTOMER_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class CUSTOMERMERGEJOBSTATUS_INPUT_ARGUMENT {
      public static final String JobId = "jobId";
    }

    public static class CUSTOMERMERGEPREVIEW_INPUT_ARGUMENT {
      public static final String CustomerOneId = "customerOneId";

      public static final String CustomerTwoId = "customerTwoId";

      public static final String OverrideFields = "overrideFields";
    }

    public static class CUSTOMERPAYMENTMETHOD_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String ShowRevoked = "showRevoked";
    }

    public static class CUSTOMERSEGMENTMEMBERS_INPUT_ARGUMENT {
      public static final String SegmentId = "segmentId";

      public static final String Query = "query";

      public static final String QueryId = "queryId";

      public static final String Timezone = "timezone";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";
    }

    public static class CUSTOMERSEGMENTMEMBERSQUERY_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class CUSTOMERSEGMENTMEMBERSHIP_INPUT_ARGUMENT {
      public static final String SegmentIds = "segmentIds";

      public static final String CustomerId = "customerId";
    }

    public static class CUSTOMERS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class DELETIONEVENTS_INPUT_ARGUMENT {
      public static final String SubjectTypes = "subjectTypes";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class DELIVERYCUSTOMIZATION_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class DELIVERYCUSTOMIZATIONS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String Query = "query";
    }

    public static class DELIVERYPROFILE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class DELIVERYPROFILES_INPUT_ARGUMENT {
      public static final String MerchantOwnedOnly = "merchantOwnedOnly";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class DISCOUNTCODECOUNT_INPUT_ARGUMENT {
      public static final String Query = "query";
    }

    public static class DISCOUNTNODE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class DISCOUNTNODES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";

      public static final String SavedSearchId = "savedSearchId";
    }

    public static class DISCOUNTREDEEMCODEBULKCREATION_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class DISCOUNTREDEEMCODESAVEDSEARCHES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class DISPUTE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class DISPUTEEVIDENCE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class DOMAIN_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class DRAFTORDER_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class DRAFTORDERSAVEDSEARCHES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class DRAFTORDERTAG_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class DRAFTORDERS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";

      public static final String SavedSearchId = "savedSearchId";
    }

    public static class FILESAVEDSEARCHES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class FILES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";

      public static final String SavedSearchId = "savedSearchId";
    }

    public static class FULFILLMENT_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class FULFILLMENTORDER_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class FULFILLMENTORDERS_INPUT_ARGUMENT {
      public static final String IncludeClosed = "includeClosed";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class FULFILLMENTSERVICE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class GIFTCARD_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class GIFTCARDS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";

      public static final String SavedSearchId = "savedSearchId";
    }

    public static class GIFTCARDSCOUNT_INPUT_ARGUMENT {
      public static final String Enabled = "enabled";
    }

    public static class INVENTORYITEM_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class INVENTORYITEMS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String Query = "query";
    }

    public static class INVENTORYLEVEL_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class JOB_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class LOCATION_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class LOCATIONS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";

      public static final String IncludeLegacy = "includeLegacy";

      public static final String IncludeInactive = "includeInactive";
    }

    public static class LOCATIONSAVAILABLEFORDELIVERYPROFILESCONNECTION_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class MANUALHOLDSFULFILLMENTORDERS_INPUT_ARGUMENT {
      public static final String Query = "query";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class MARKET_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class MARKETBYGEOGRAPHY_INPUT_ARGUMENT {
      public static final String CountryCode = "countryCode";
    }

    public static class MARKETLOCALIZABLERESOURCE_INPUT_ARGUMENT {
      public static final String ResourceId = "resourceId";
    }

    public static class MARKETLOCALIZABLERESOURCES_INPUT_ARGUMENT {
      public static final String ResourceType = "resourceType";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class MARKETLOCALIZABLERESOURCESBYIDS_INPUT_ARGUMENT {
      public static final String ResourceIds = "resourceIds";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class MARKETINGACTIVITIES_INPUT_ARGUMENT {
      public static final String MarketingActivityIds = "marketingActivityIds";

      public static final String RemoteIds = "remoteIds";

      public static final String Utm = "utm";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";

      public static final String SavedSearchId = "savedSearchId";
    }

    public static class MARKETINGACTIVITY_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class MARKETINGEVENT_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class MARKETINGEVENTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class MARKETS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class METAFIELDDEFINITION_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class METAFIELDDEFINITIONS_INPUT_ARGUMENT {
      public static final String Key = "key";

      public static final String Namespace = "namespace";

      public static final String OwnerType = "ownerType";

      public static final String PinnedStatus = "pinnedStatus";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class METAFIELDSTOREFRONTVISIBILITIES_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class METAFIELDSTOREFRONTVISIBILITY_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class METAOBJECT_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class METAOBJECTBYHANDLE_INPUT_ARGUMENT {
      public static final String Handle = "handle";
    }

    public static class METAOBJECTDEFINITION_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class METAOBJECTDEFINITIONBYTYPE_INPUT_ARGUMENT {
      public static final String Type = "type";
    }

    public static class METAOBJECTDEFINITIONS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class METAOBJECTS_INPUT_ARGUMENT {
      public static final String Type = "type";

      public static final String SortKey = "sortKey";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String Query = "query";
    }

    public static class NODE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class NODES_INPUT_ARGUMENT {
      public static final String Ids = "ids";
    }

    public static class ORDER_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class ORDERPAYMENTSTATUS_INPUT_ARGUMENT {
      public static final String PaymentReferenceId = "paymentReferenceId";

      public static final String OrderId = "orderId";
    }

    public static class ORDERSAVEDSEARCHES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class ORDERS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";

      public static final String SavedSearchId = "savedSearchId";
    }

    public static class PAYMENTCUSTOMIZATION_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class PAYMENTCUSTOMIZATIONS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String Query = "query";
    }

    public static class PAYMENTTERMSTEMPLATES_INPUT_ARGUMENT {
      public static final String PaymentTermsType = "paymentTermsType";
    }

    public static class PRICELIST_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class PRICELISTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";
    }

    public static class PRICERULE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class PRICERULESAVEDSEARCHES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PRICERULES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";

      public static final String SavedSearchId = "savedSearchId";
    }

    public static class PRIVATEMETAFIELD_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class PRIVATEMETAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Owner = "owner";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PRODUCT_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class PRODUCTBYHANDLE_INPUT_ARGUMENT {
      public static final String Handle = "handle";
    }

    public static class PRODUCTDUPLICATEJOB_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class PRODUCTFEED_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class PRODUCTFEEDS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PRODUCTRESOURCEFEEDBACK_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class PRODUCTSAVEDSEARCHES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PRODUCTVARIANT_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class PRODUCTVARIANTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";

      public static final String SavedSearchId = "savedSearchId";
    }

    public static class PRODUCTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";

      public static final String SavedSearchId = "savedSearchId";
    }

    public static class PUBLICATION_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class PUBLICATIONS_INPUT_ARGUMENT {
      public static final String CatalogType = "catalogType";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class REFUND_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class RETURN_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class RETURNABLEFULFILLMENT_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class RETURNABLEFULFILLMENTS_INPUT_ARGUMENT {
      public static final String OrderId = "orderId";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class REVERSEDELIVERY_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class REVERSEFULFILLMENTORDER_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class SCRIPTTAG_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class SCRIPTTAGS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String Src = "src";
    }

    public static class SEGMENT_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class SEGMENTFILTERSUGGESTIONS_INPUT_ARGUMENT {
      public static final String Search = "search";

      public static final String First = "first";

      public static final String After = "after";
    }

    public static class SEGMENTFILTERS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";
    }

    public static class SEGMENTMIGRATIONS_INPUT_ARGUMENT {
      public static final String SavedSearchId = "savedSearchId";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";
    }

    public static class SEGMENTVALUESUGGESTIONS_INPUT_ARGUMENT {
      public static final String Search = "search";

      public static final String FilterQueryName = "filterQueryName";

      public static final String FunctionParameterQueryName = "functionParameterQueryName";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";
    }

    public static class SEGMENTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class SELLINGPLANGROUP_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class SELLINGPLANGROUPS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class SHOPLOCALES_INPUT_ARGUMENT {
      public static final String Published = "published";
    }

    public static class SHOPIFYFUNCTION_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class SHOPIFYFUNCTIONS_INPUT_ARGUMENT {
      public static final String ApiType = "apiType";

      public static final String UseCreationUi = "useCreationUi";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class SHOPIFYQLQUERY_INPUT_ARGUMENT {
      public static final String Query = "query";
    }

    public static class STAFFMEMBER_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class STANDARDMETAFIELDDEFINITIONTEMPLATES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class SUBSCRIPTIONBILLINGATTEMPT_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class SUBSCRIPTIONBILLINGATTEMPTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class SUBSCRIPTIONBILLINGCYCLE_INPUT_ARGUMENT {
      public static final String BillingCycleInput = "billingCycleInput";
    }

    public static class SUBSCRIPTIONBILLINGCYCLES_INPUT_ARGUMENT {
      public static final String ContractId = "contractId";

      public static final String BillingCyclesDateRangeSelector = "billingCyclesDateRangeSelector";

      public static final String BillingCyclesIndexRangeSelector = "billingCyclesIndexRangeSelector";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";
    }

    public static class SUBSCRIPTIONCONTRACT_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class SUBSCRIPTIONCONTRACTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String Query = "query";
    }

    public static class SUBSCRIPTIONDRAFT_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class TENDERTRANSACTIONS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String Query = "query";
    }

    public static class TRANSLATABLERESOURCE_INPUT_ARGUMENT {
      public static final String ResourceId = "resourceId";
    }

    public static class TRANSLATABLERESOURCES_INPUT_ARGUMENT {
      public static final String ResourceType = "resourceType";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class TRANSLATABLERESOURCESBYIDS_INPUT_ARGUMENT {
      public static final String ResourceIds = "resourceIds";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class URLREDIRECT_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class URLREDIRECTIMPORT_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class URLREDIRECTSAVEDSEARCHES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class URLREDIRECTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";

      public static final String SavedSearchId = "savedSearchId";
    }

    public static class VALIDATION_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class VALIDATIONS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";
    }

    public static class WEBPIXEL_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class WEBHOOKSUBSCRIPTION_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class WEBHOOKSUBSCRIPTIONS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";

      public static final String CallbackUrl = "callbackUrl";

      public static final String Format = "format";

      public static final String Topics = "topics";
    }
  }

  public static class REFUND {
    public static final String TYPE_NAME = "Refund";

    public static final String CreatedAt = "createdAt";

    public static final String Duties = "duties";

    public static final String Id = "id";

    public static final String LegacyResourceId = "legacyResourceId";

    public static final String Note = "note";

    public static final String Order = "order";

    public static final String RefundLineItems = "refundLineItems";

    public static final String Return = "return";

    public static final String StaffMember = "staffMember";

    public static final String TotalRefunded = "totalRefunded";

    public static final String TotalRefundedSet = "totalRefundedSet";

    public static final String Transactions = "transactions";

    public static final String UpdatedAt = "updatedAt";

    public static class REFUNDLINEITEMS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class TRANSACTIONS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class REFUNDAGREEMENT {
    public static final String TYPE_NAME = "RefundAgreement";

    public static final String App = "app";

    public static final String HappenedAt = "happenedAt";

    public static final String Id = "id";

    public static final String Reason = "reason";

    public static final String Refund = "refund";

    public static final String Sales = "sales";

    public static final String User = "user";

    public static class SALES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class REFUNDCONNECTION {
    public static final String TYPE_NAME = "RefundConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class REFUNDCREATEPAYLOAD {
    public static final String TYPE_NAME = "RefundCreatePayload";

    public static final String Order = "order";

    public static final String Refund = "refund";

    public static final String UserErrors = "userErrors";
  }

  public static class REFUNDDUTY {
    public static final String TYPE_NAME = "RefundDuty";

    public static final String AmountSet = "amountSet";

    public static final String OriginalDuty = "originalDuty";
  }

  public static class REFUNDEDGE {
    public static final String TYPE_NAME = "RefundEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class REFUNDLINEITEM {
    public static final String TYPE_NAME = "RefundLineItem";

    public static final String LineItem = "lineItem";

    public static final String Location = "location";

    public static final String Price = "price";

    public static final String PriceSet = "priceSet";

    public static final String Quantity = "quantity";

    public static final String RestockType = "restockType";

    public static final String Restocked = "restocked";

    public static final String Subtotal = "subtotal";

    public static final String SubtotalSet = "subtotalSet";

    public static final String TotalTax = "totalTax";

    public static final String TotalTaxSet = "totalTaxSet";
  }

  public static class REFUNDLINEITEMCONNECTION {
    public static final String TYPE_NAME = "RefundLineItemConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class REFUNDLINEITEMEDGE {
    public static final String TYPE_NAME = "RefundLineItemEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class RESOURCEALERT {
    public static final String TYPE_NAME = "ResourceAlert";

    public static final String Actions = "actions";

    public static final String Content = "content";

    public static final String DismissibleHandle = "dismissibleHandle";

    public static final String Icon = "icon";

    public static final String Severity = "severity";

    public static final String Title = "title";
  }

  public static class RESOURCEALERTACTION {
    public static final String TYPE_NAME = "ResourceAlertAction";

    public static final String Primary = "primary";

    public static final String Show = "show";

    public static final String Title = "title";

    public static final String Url = "url";
  }

  public static class RESOURCEFEEDBACK {
    public static final String TYPE_NAME = "ResourceFeedback";

    public static final String AppFeedback = "appFeedback";

    public static final String Details = "details";

    public static final String Summary = "summary";
  }

  public static class RESOURCEPUBLICATION {
    public static final String TYPE_NAME = "ResourcePublication";

    public static final String Channel = "channel";

    public static final String IsPublished = "isPublished";

    public static final String Publication = "publication";

    public static final String PublishDate = "publishDate";

    public static final String Publishable = "publishable";
  }

  public static class RESOURCEPUBLICATIONCONNECTION {
    public static final String TYPE_NAME = "ResourcePublicationConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class RESOURCEPUBLICATIONEDGE {
    public static final String TYPE_NAME = "ResourcePublicationEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class RESOURCEPUBLICATIONV2 {
    public static final String TYPE_NAME = "ResourcePublicationV2";

    public static final String IsPublished = "isPublished";

    public static final String Publication = "publication";

    public static final String PublishDate = "publishDate";

    public static final String Publishable = "publishable";
  }

  public static class RESOURCEPUBLICATIONV2CONNECTION {
    public static final String TYPE_NAME = "ResourcePublicationV2Connection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class RESOURCEPUBLICATIONV2EDGE {
    public static final String TYPE_NAME = "ResourcePublicationV2Edge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class RETURN {
    public static final String TYPE_NAME = "Return";

    public static final String Decline = "decline";

    public static final String Id = "id";

    public static final String Name = "name";

    public static final String Order = "order";

    public static final String Refunds = "refunds";

    public static final String ReturnLineItems = "returnLineItems";

    public static final String ReverseFulfillmentOrders = "reverseFulfillmentOrders";

    public static final String Status = "status";

    public static final String SuggestedRefund = "suggestedRefund";

    public static final String TotalQuantity = "totalQuantity";

    public static class REFUNDS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class RETURNLINEITEMS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class REVERSEFULFILLMENTORDERS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class SUGGESTEDREFUND_INPUT_ARGUMENT {
      public static final String ReturnRefundLineItems = "returnRefundLineItems";

      public static final String RefundShipping = "refundShipping";

      public static final String RefundDuties = "refundDuties";
    }
  }

  public static class RETURNABLEFULFILLMENT {
    public static final String TYPE_NAME = "ReturnableFulfillment";

    public static final String Fulfillment = "fulfillment";

    public static final String Id = "id";

    public static final String ReturnableFulfillmentLineItems = "returnableFulfillmentLineItems";

    public static class RETURNABLEFULFILLMENTLINEITEMS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class RETURNABLEFULFILLMENTCONNECTION {
    public static final String TYPE_NAME = "ReturnableFulfillmentConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class RETURNABLEFULFILLMENTEDGE {
    public static final String TYPE_NAME = "ReturnableFulfillmentEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class RETURNABLEFULFILLMENTLINEITEM {
    public static final String TYPE_NAME = "ReturnableFulfillmentLineItem";

    public static final String FulfillmentLineItem = "fulfillmentLineItem";

    public static final String Quantity = "quantity";
  }

  public static class RETURNABLEFULFILLMENTLINEITEMCONNECTION {
    public static final String TYPE_NAME = "ReturnableFulfillmentLineItemConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class RETURNABLEFULFILLMENTLINEITEMEDGE {
    public static final String TYPE_NAME = "ReturnableFulfillmentLineItemEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class RETURNAPPROVEREQUESTPAYLOAD {
    public static final String TYPE_NAME = "ReturnApproveRequestPayload";

    public static final String Return = "return";

    public static final String UserErrors = "userErrors";
  }

  public static class RETURNCANCELPAYLOAD {
    public static final String TYPE_NAME = "ReturnCancelPayload";

    public static final String Return = "return";

    public static final String UserErrors = "userErrors";
  }

  public static class RETURNCLOSEPAYLOAD {
    public static final String TYPE_NAME = "ReturnClosePayload";

    public static final String Return = "return";

    public static final String UserErrors = "userErrors";
  }

  public static class RETURNCONNECTION {
    public static final String TYPE_NAME = "ReturnConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class RETURNCREATEPAYLOAD {
    public static final String TYPE_NAME = "ReturnCreatePayload";

    public static final String Return = "return";

    public static final String UserErrors = "userErrors";
  }

  public static class RETURNDECLINE {
    public static final String TYPE_NAME = "ReturnDecline";

    public static final String Note = "note";

    public static final String Reason = "reason";
  }

  public static class RETURNDECLINEREQUESTPAYLOAD {
    public static final String TYPE_NAME = "ReturnDeclineRequestPayload";

    public static final String Return = "return";

    public static final String UserErrors = "userErrors";
  }

  public static class RETURNEDGE {
    public static final String TYPE_NAME = "ReturnEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class RETURNLINEITEM {
    public static final String TYPE_NAME = "ReturnLineItem";

    public static final String CustomerNote = "customerNote";

    public static final String FulfillmentLineItem = "fulfillmentLineItem";

    public static final String Id = "id";

    public static final String Quantity = "quantity";

    public static final String RefundableQuantity = "refundableQuantity";

    public static final String RefundedQuantity = "refundedQuantity";

    public static final String ReturnReason = "returnReason";

    public static final String ReturnReasonNote = "returnReasonNote";

    public static final String TotalWeight = "totalWeight";

    public static final String WithCodeDiscountedTotalPriceSet = "withCodeDiscountedTotalPriceSet";
  }

  public static class RETURNLINEITEMCONNECTION {
    public static final String TYPE_NAME = "ReturnLineItemConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class RETURNLINEITEMEDGE {
    public static final String TYPE_NAME = "ReturnLineItemEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class RETURNREFUNDPAYLOAD {
    public static final String TYPE_NAME = "ReturnRefundPayload";

    public static final String Refund = "refund";

    public static final String UserErrors = "userErrors";
  }

  public static class RETURNREOPENPAYLOAD {
    public static final String TYPE_NAME = "ReturnReopenPayload";

    public static final String Return = "return";

    public static final String UserErrors = "userErrors";
  }

  public static class RETURNREQUESTPAYLOAD {
    public static final String TYPE_NAME = "ReturnRequestPayload";

    public static final String Return = "return";

    public static final String UserErrors = "userErrors";
  }

  public static class RETURNUSERERROR {
    public static final String TYPE_NAME = "ReturnUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class REVERSEDELIVERY {
    public static final String TYPE_NAME = "ReverseDelivery";

    public static final String Deliverable = "deliverable";

    public static final String Id = "id";

    public static final String ReverseDeliveryLineItems = "reverseDeliveryLineItems";

    public static final String ReverseFulfillmentOrder = "reverseFulfillmentOrder";

    public static class REVERSEDELIVERYLINEITEMS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class REVERSEDELIVERYCONNECTION {
    public static final String TYPE_NAME = "ReverseDeliveryConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class REVERSEDELIVERYCREATEWITHSHIPPINGPAYLOAD {
    public static final String TYPE_NAME = "ReverseDeliveryCreateWithShippingPayload";

    public static final String ReverseDelivery = "reverseDelivery";

    public static final String UserErrors = "userErrors";
  }

  public static class REVERSEDELIVERYDISPOSEPAYLOAD {
    public static final String TYPE_NAME = "ReverseDeliveryDisposePayload";

    public static final String ReverseDeliveryLineItems = "reverseDeliveryLineItems";

    public static final String UserErrors = "userErrors";
  }

  public static class REVERSEDELIVERYEDGE {
    public static final String TYPE_NAME = "ReverseDeliveryEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class REVERSEDELIVERYLABELV2 {
    public static final String TYPE_NAME = "ReverseDeliveryLabelV2";

    public static final String CreatedAt = "createdAt";

    public static final String PublicFileUrl = "publicFileUrl";

    public static final String UpdatedAt = "updatedAt";
  }

  public static class REVERSEDELIVERYLINEITEM {
    public static final String TYPE_NAME = "ReverseDeliveryLineItem";

    public static final String Dispositions = "dispositions";

    public static final String Id = "id";

    public static final String Quantity = "quantity";

    public static final String ReverseFulfillmentOrderLineItem = "reverseFulfillmentOrderLineItem";
  }

  public static class REVERSEDELIVERYLINEITEMCONNECTION {
    public static final String TYPE_NAME = "ReverseDeliveryLineItemConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class REVERSEDELIVERYLINEITEMEDGE {
    public static final String TYPE_NAME = "ReverseDeliveryLineItemEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class REVERSEDELIVERYSHIPPINGDELIVERABLE {
    public static final String TYPE_NAME = "ReverseDeliveryShippingDeliverable";

    public static final String Label = "label";

    public static final String Tracking = "tracking";
  }

  public static class REVERSEDELIVERYSHIPPINGUPDATEPAYLOAD {
    public static final String TYPE_NAME = "ReverseDeliveryShippingUpdatePayload";

    public static final String ReverseDelivery = "reverseDelivery";

    public static final String UserErrors = "userErrors";
  }

  public static class REVERSEDELIVERYTRACKINGV2 {
    public static final String TYPE_NAME = "ReverseDeliveryTrackingV2";

    public static final String CarrierName = "carrierName";

    public static final String Number = "number";

    public static final String Url = "url";
  }

  public static class REVERSEFULFILLMENTORDER {
    public static final String TYPE_NAME = "ReverseFulfillmentOrder";

    public static final String Id = "id";

    public static final String LineItems = "lineItems";

    public static final String Order = "order";

    public static final String ReverseDeliveries = "reverseDeliveries";

    public static final String Status = "status";

    public static final String ThirdPartyConfirmation = "thirdPartyConfirmation";

    public static class LINEITEMS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class REVERSEDELIVERIES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class REVERSEFULFILLMENTORDERCONNECTION {
    public static final String TYPE_NAME = "ReverseFulfillmentOrderConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class REVERSEFULFILLMENTORDERDISPOSEPAYLOAD {
    public static final String TYPE_NAME = "ReverseFulfillmentOrderDisposePayload";

    public static final String ReverseFulfillmentOrderLineItems = "reverseFulfillmentOrderLineItems";

    public static final String UserErrors = "userErrors";
  }

  public static class REVERSEFULFILLMENTORDERDISPOSITION {
    public static final String TYPE_NAME = "ReverseFulfillmentOrderDisposition";

    public static final String Id = "id";

    public static final String Location = "location";

    public static final String Quantity = "quantity";

    public static final String Type = "type";
  }

  public static class REVERSEFULFILLMENTORDEREDGE {
    public static final String TYPE_NAME = "ReverseFulfillmentOrderEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class REVERSEFULFILLMENTORDERLINEITEM {
    public static final String TYPE_NAME = "ReverseFulfillmentOrderLineItem";

    public static final String Dispositions = "dispositions";

    public static final String FulfillmentLineItem = "fulfillmentLineItem";

    public static final String Id = "id";

    public static final String TotalQuantity = "totalQuantity";
  }

  public static class REVERSEFULFILLMENTORDERLINEITEMCONNECTION {
    public static final String TYPE_NAME = "ReverseFulfillmentOrderLineItemConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class REVERSEFULFILLMENTORDERLINEITEMEDGE {
    public static final String TYPE_NAME = "ReverseFulfillmentOrderLineItemEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class REVERSEFULFILLMENTORDERTHIRDPARTYCONFIRMATION {
    public static final String TYPE_NAME = "ReverseFulfillmentOrderThirdPartyConfirmation";

    public static final String Status = "status";
  }

  public static class ROWCOUNT {
    public static final String TYPE_NAME = "RowCount";

    public static final String Count = "count";

    public static final String ExceedsMax = "exceedsMax";
  }

  public static class SALEADDITIONALFEE {
    public static final String TYPE_NAME = "SaleAdditionalFee";

    public static final String Id = "id";

    public static final String Name = "name";

    public static final String Price = "price";

    public static final String TaxLines = "taxLines";
  }

  public static class SALECONNECTION {
    public static final String TYPE_NAME = "SaleConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class SALEEDGE {
    public static final String TYPE_NAME = "SaleEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class SALESAGREEMENTCONNECTION {
    public static final String TYPE_NAME = "SalesAgreementConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class SALESAGREEMENTEDGE {
    public static final String TYPE_NAME = "SalesAgreementEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class SALETAX {
    public static final String TYPE_NAME = "SaleTax";

    public static final String Amount = "amount";

    public static final String Id = "id";

    public static final String TaxLine = "taxLine";
  }

  public static class SAVEDSEARCH {
    public static final String TYPE_NAME = "SavedSearch";

    public static final String Filters = "filters";

    public static final String Id = "id";

    public static final String LegacyResourceId = "legacyResourceId";

    public static final String Name = "name";

    public static final String Query = "query";

    public static final String ResourceType = "resourceType";

    public static final String SearchTerms = "searchTerms";
  }

  public static class SAVEDSEARCHCONNECTION {
    public static final String TYPE_NAME = "SavedSearchConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class SAVEDSEARCHCREATEPAYLOAD {
    public static final String TYPE_NAME = "SavedSearchCreatePayload";

    public static final String SavedSearch = "savedSearch";

    public static final String UserErrors = "userErrors";
  }

  public static class SAVEDSEARCHDELETEPAYLOAD {
    public static final String TYPE_NAME = "SavedSearchDeletePayload";

    public static final String DeletedSavedSearchId = "deletedSavedSearchId";

    public static final String Shop = "shop";

    public static final String UserErrors = "userErrors";
  }

  public static class SAVEDSEARCHEDGE {
    public static final String TYPE_NAME = "SavedSearchEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class SAVEDSEARCHUPDATEPAYLOAD {
    public static final String TYPE_NAME = "SavedSearchUpdatePayload";

    public static final String SavedSearch = "savedSearch";

    public static final String UserErrors = "userErrors";
  }

  public static class SCRIPTDISCOUNTAPPLICATION {
    public static final String TYPE_NAME = "ScriptDiscountApplication";

    public static final String AllocationMethod = "allocationMethod";

    public static final String Description = "description";

    public static final String Index = "index";

    public static final String TargetSelection = "targetSelection";

    public static final String TargetType = "targetType";

    public static final String Title = "title";

    public static final String Value = "value";
  }

  public static class SCRIPTTAG {
    public static final String TYPE_NAME = "ScriptTag";

    public static final String Cache = "cache";

    public static final String CreatedAt = "createdAt";

    public static final String DisplayScope = "displayScope";

    public static final String Id = "id";

    public static final String LegacyResourceId = "legacyResourceId";

    public static final String Src = "src";

    public static final String UpdatedAt = "updatedAt";
  }

  public static class SCRIPTTAGCONNECTION {
    public static final String TYPE_NAME = "ScriptTagConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class SCRIPTTAGCREATEPAYLOAD {
    public static final String TYPE_NAME = "ScriptTagCreatePayload";

    public static final String ScriptTag = "scriptTag";

    public static final String UserErrors = "userErrors";
  }

  public static class SCRIPTTAGDELETEPAYLOAD {
    public static final String TYPE_NAME = "ScriptTagDeletePayload";

    public static final String DeletedScriptTagId = "deletedScriptTagId";

    public static final String UserErrors = "userErrors";
  }

  public static class SCRIPTTAGEDGE {
    public static final String TYPE_NAME = "ScriptTagEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class SCRIPTTAGUPDATEPAYLOAD {
    public static final String TYPE_NAME = "ScriptTagUpdatePayload";

    public static final String ScriptTag = "scriptTag";

    public static final String UserErrors = "userErrors";
  }

  public static class SEARCHFILTER {
    public static final String TYPE_NAME = "SearchFilter";

    public static final String Key = "key";

    public static final String Value = "value";
  }

  public static class SEARCHFILTEROPTIONS {
    public static final String TYPE_NAME = "SearchFilterOptions";

    public static final String ProductAvailability = "productAvailability";
  }

  public static class SEARCHRESULT {
    public static final String TYPE_NAME = "SearchResult";

    public static final String Description = "description";

    public static final String Image = "image";

    public static final String Reference = "reference";

    public static final String Title = "title";

    public static final String Url = "url";
  }

  public static class SEARCHRESULTCONNECTION {
    public static final String TYPE_NAME = "SearchResultConnection";

    public static final String Edges = "edges";

    public static final String PageInfo = "pageInfo";

    public static final String ResultsAfterCount = "resultsAfterCount";
  }

  public static class SEARCHRESULTEDGE {
    public static final String TYPE_NAME = "SearchResultEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class SEGMENT {
    public static final String TYPE_NAME = "Segment";

    public static final String CreationDate = "creationDate";

    public static final String Id = "id";

    public static final String LastEditDate = "lastEditDate";

    public static final String Name = "name";

    public static final String Query = "query";
  }

  public static class SEGMENTASSOCIATIONFILTER {
    public static final String TYPE_NAME = "SegmentAssociationFilter";

    public static final String LocalizedName = "localizedName";

    public static final String MultiValue = "multiValue";

    public static final String QueryName = "queryName";
  }

  public static class SEGMENTATTRIBUTESTATISTICS {
    public static final String TYPE_NAME = "SegmentAttributeStatistics";

    public static final String Average = "average";

    public static final String Sum = "sum";
  }

  public static class SEGMENTBOOLEANFILTER {
    public static final String TYPE_NAME = "SegmentBooleanFilter";

    public static final String LocalizedName = "localizedName";

    public static final String MultiValue = "multiValue";

    public static final String QueryName = "queryName";
  }

  public static class SEGMENTCONNECTION {
    public static final String TYPE_NAME = "SegmentConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class SEGMENTCREATEPAYLOAD {
    public static final String TYPE_NAME = "SegmentCreatePayload";

    public static final String Segment = "segment";

    public static final String UserErrors = "userErrors";
  }

  public static class SEGMENTDATEFILTER {
    public static final String TYPE_NAME = "SegmentDateFilter";

    public static final String LocalizedName = "localizedName";

    public static final String MultiValue = "multiValue";

    public static final String QueryName = "queryName";
  }

  public static class SEGMENTDELETEPAYLOAD {
    public static final String TYPE_NAME = "SegmentDeletePayload";

    public static final String DeletedSegmentId = "deletedSegmentId";

    public static final String UserErrors = "userErrors";
  }

  public static class SEGMENTEDGE {
    public static final String TYPE_NAME = "SegmentEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class SEGMENTENUMFILTER {
    public static final String TYPE_NAME = "SegmentEnumFilter";

    public static final String LocalizedName = "localizedName";

    public static final String MultiValue = "multiValue";

    public static final String QueryName = "queryName";
  }

  public static class SEGMENTEVENTFILTER {
    public static final String TYPE_NAME = "SegmentEventFilter";

    public static final String LocalizedName = "localizedName";

    public static final String MultiValue = "multiValue";

    public static final String Parameters = "parameters";

    public static final String QueryName = "queryName";

    public static final String ReturnValueType = "returnValueType";
  }

  public static class SEGMENTEVENTFILTERPARAMETER {
    public static final String TYPE_NAME = "SegmentEventFilterParameter";

    public static final String AcceptsMultipleValues = "acceptsMultipleValues";

    public static final String LocalizedDescription = "localizedDescription";

    public static final String LocalizedName = "localizedName";

    public static final String Optional = "optional";

    public static final String ParameterType = "parameterType";

    public static final String QueryName = "queryName";
  }

  public static class SEGMENTFILTERCONNECTION {
    public static final String TYPE_NAME = "SegmentFilterConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class SEGMENTFILTEREDGE {
    public static final String TYPE_NAME = "SegmentFilterEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class SEGMENTFLOATFILTER {
    public static final String TYPE_NAME = "SegmentFloatFilter";

    public static final String LocalizedName = "localizedName";

    public static final String MultiValue = "multiValue";

    public static final String QueryName = "queryName";
  }

  public static class SEGMENTINTEGERFILTER {
    public static final String TYPE_NAME = "SegmentIntegerFilter";

    public static final String LocalizedName = "localizedName";

    public static final String MultiValue = "multiValue";

    public static final String QueryName = "queryName";
  }

  public static class SEGMENTMEMBERSHIP {
    public static final String TYPE_NAME = "SegmentMembership";

    public static final String IsMember = "isMember";

    public static final String SegmentId = "segmentId";
  }

  public static class SEGMENTMEMBERSHIPRESPONSE {
    public static final String TYPE_NAME = "SegmentMembershipResponse";

    public static final String Memberships = "memberships";
  }

  public static class SEGMENTMIGRATION {
    public static final String TYPE_NAME = "SegmentMigration";

    public static final String Id = "id";

    public static final String SavedSearchId = "savedSearchId";

    public static final String SegmentId = "segmentId";
  }

  public static class SEGMENTMIGRATIONCONNECTION {
    public static final String TYPE_NAME = "SegmentMigrationConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class SEGMENTMIGRATIONEDGE {
    public static final String TYPE_NAME = "SegmentMigrationEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class SEGMENTSTATISTICS {
    public static final String TYPE_NAME = "SegmentStatistics";

    public static final String AttributeStatistics = "attributeStatistics";

    public static class ATTRIBUTESTATISTICS_INPUT_ARGUMENT {
      public static final String AttributeName = "attributeName";
    }
  }

  public static class SEGMENTSTRINGFILTER {
    public static final String TYPE_NAME = "SegmentStringFilter";

    public static final String LocalizedName = "localizedName";

    public static final String MultiValue = "multiValue";

    public static final String QueryName = "queryName";
  }

  public static class SEGMENTUPDATEPAYLOAD {
    public static final String TYPE_NAME = "SegmentUpdatePayload";

    public static final String Segment = "segment";

    public static final String UserErrors = "userErrors";
  }

  public static class SEGMENTVALUE {
    public static final String TYPE_NAME = "SegmentValue";

    public static final String LocalizedValue = "localizedValue";

    public static final String QueryName = "queryName";
  }

  public static class SEGMENTVALUECONNECTION {
    public static final String TYPE_NAME = "SegmentValueConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class SEGMENTVALUEEDGE {
    public static final String TYPE_NAME = "SegmentValueEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class SELECTEDOPTION {
    public static final String TYPE_NAME = "SelectedOption";

    public static final String Name = "name";

    public static final String Value = "value";
  }

  public static class SELLINGPLAN {
    public static final String TYPE_NAME = "SellingPlan";

    public static final String BillingPolicy = "billingPolicy";

    public static final String Category = "category";

    public static final String CreatedAt = "createdAt";

    public static final String DeliveryPolicy = "deliveryPolicy";

    public static final String Description = "description";

    public static final String Id = "id";

    public static final String InventoryPolicy = "inventoryPolicy";

    public static final String Name = "name";

    public static final String Options = "options";

    public static final String Position = "position";

    public static final String PricingPolicies = "pricingPolicies";

    public static final String Translations = "translations";

    public static class TRANSLATIONS_INPUT_ARGUMENT {
      public static final String Locale = "locale";

      public static final String MarketId = "marketId";
    }
  }

  public static class SELLINGPLANANCHOR {
    public static final String TYPE_NAME = "SellingPlanAnchor";

    public static final String CutoffDay = "cutoffDay";

    public static final String Day = "day";

    public static final String Month = "month";

    public static final String Type = "type";
  }

  public static class SELLINGPLANCHECKOUTCHARGE {
    public static final String TYPE_NAME = "SellingPlanCheckoutCharge";

    public static final String Type = "type";

    public static final String Value = "value";
  }

  public static class SELLINGPLANCHECKOUTCHARGEPERCENTAGEVALUE {
    public static final String TYPE_NAME = "SellingPlanCheckoutChargePercentageValue";

    public static final String Percentage = "percentage";
  }

  public static class SELLINGPLANCONNECTION {
    public static final String TYPE_NAME = "SellingPlanConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class SELLINGPLANEDGE {
    public static final String TYPE_NAME = "SellingPlanEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class SELLINGPLANFIXEDBILLINGPOLICY {
    public static final String TYPE_NAME = "SellingPlanFixedBillingPolicy";

    public static final String CheckoutCharge = "checkoutCharge";

    public static final String RemainingBalanceChargeExactTime = "remainingBalanceChargeExactTime";

    public static final String RemainingBalanceChargeTimeAfterCheckout = "remainingBalanceChargeTimeAfterCheckout";

    public static final String RemainingBalanceChargeTrigger = "remainingBalanceChargeTrigger";
  }

  public static class SELLINGPLANFIXEDDELIVERYPOLICY {
    public static final String TYPE_NAME = "SellingPlanFixedDeliveryPolicy";

    public static final String Anchors = "anchors";

    public static final String Cutoff = "cutoff";

    public static final String FulfillmentExactTime = "fulfillmentExactTime";

    public static final String FulfillmentTrigger = "fulfillmentTrigger";

    public static final String Intent = "intent";

    public static final String PreAnchorBehavior = "preAnchorBehavior";
  }

  public static class SELLINGPLANFIXEDPRICINGPOLICY {
    public static final String TYPE_NAME = "SellingPlanFixedPricingPolicy";

    public static final String AdjustmentType = "adjustmentType";

    public static final String AdjustmentValue = "adjustmentValue";

    public static final String CreatedAt = "createdAt";
  }

  public static class SELLINGPLANGROUP {
    public static final String TYPE_NAME = "SellingPlanGroup";

    public static final String AppId = "appId";

    public static final String AppliesToProduct = "appliesToProduct";

    public static final String AppliesToProductVariant = "appliesToProductVariant";

    public static final String AppliesToProductVariants = "appliesToProductVariants";

    public static final String CreatedAt = "createdAt";

    public static final String Description = "description";

    public static final String Id = "id";

    public static final String MerchantCode = "merchantCode";

    public static final String Name = "name";

    public static final String Options = "options";

    public static final String Position = "position";

    public static final String ProductCount = "productCount";

    public static final String ProductVariantCount = "productVariantCount";

    public static final String ProductVariants = "productVariants";

    public static final String Products = "products";

    public static final String SellingPlans = "sellingPlans";

    public static final String Summary = "summary";

    public static final String Translations = "translations";

    public static class APPLIESTOPRODUCT_INPUT_ARGUMENT {
      public static final String ProductId = "productId";
    }

    public static class APPLIESTOPRODUCTVARIANT_INPUT_ARGUMENT {
      public static final String ProductVariantId = "productVariantId";
    }

    public static class APPLIESTOPRODUCTVARIANTS_INPUT_ARGUMENT {
      public static final String ProductId = "productId";
    }

    public static class PRODUCTVARIANTCOUNT_INPUT_ARGUMENT {
      public static final String ProductId = "productId";
    }

    public static class PRODUCTVARIANTS_INPUT_ARGUMENT {
      public static final String ProductId = "productId";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PRODUCTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class SELLINGPLANS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class TRANSLATIONS_INPUT_ARGUMENT {
      public static final String Locale = "locale";

      public static final String MarketId = "marketId";
    }
  }

  public static class SELLINGPLANGROUPADDPRODUCTSPAYLOAD {
    public static final String TYPE_NAME = "SellingPlanGroupAddProductsPayload";

    public static final String SellingPlanGroup = "sellingPlanGroup";

    public static final String UserErrors = "userErrors";
  }

  public static class SELLINGPLANGROUPADDPRODUCTVARIANTSPAYLOAD {
    public static final String TYPE_NAME = "SellingPlanGroupAddProductVariantsPayload";

    public static final String SellingPlanGroup = "sellingPlanGroup";

    public static final String UserErrors = "userErrors";
  }

  public static class SELLINGPLANGROUPCONNECTION {
    public static final String TYPE_NAME = "SellingPlanGroupConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class SELLINGPLANGROUPCREATEPAYLOAD {
    public static final String TYPE_NAME = "SellingPlanGroupCreatePayload";

    public static final String SellingPlanGroup = "sellingPlanGroup";

    public static final String UserErrors = "userErrors";
  }

  public static class SELLINGPLANGROUPDELETEPAYLOAD {
    public static final String TYPE_NAME = "SellingPlanGroupDeletePayload";

    public static final String DeletedSellingPlanGroupId = "deletedSellingPlanGroupId";

    public static final String UserErrors = "userErrors";
  }

  public static class SELLINGPLANGROUPEDGE {
    public static final String TYPE_NAME = "SellingPlanGroupEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class SELLINGPLANGROUPREMOVEPRODUCTSPAYLOAD {
    public static final String TYPE_NAME = "SellingPlanGroupRemoveProductsPayload";

    public static final String RemovedProductIds = "removedProductIds";

    public static final String UserErrors = "userErrors";
  }

  public static class SELLINGPLANGROUPREMOVEPRODUCTVARIANTSPAYLOAD {
    public static final String TYPE_NAME = "SellingPlanGroupRemoveProductVariantsPayload";

    public static final String RemovedProductVariantIds = "removedProductVariantIds";

    public static final String UserErrors = "userErrors";
  }

  public static class SELLINGPLANGROUPUPDATEPAYLOAD {
    public static final String TYPE_NAME = "SellingPlanGroupUpdatePayload";

    public static final String DeletedSellingPlanIds = "deletedSellingPlanIds";

    public static final String SellingPlanGroup = "sellingPlanGroup";

    public static final String UserErrors = "userErrors";
  }

  public static class SELLINGPLANGROUPUSERERROR {
    public static final String TYPE_NAME = "SellingPlanGroupUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class SELLINGPLANINVENTORYPOLICY {
    public static final String TYPE_NAME = "SellingPlanInventoryPolicy";

    public static final String Reserve = "reserve";
  }

  public static class SELLINGPLANPRICINGPOLICYPERCENTAGEVALUE {
    public static final String TYPE_NAME = "SellingPlanPricingPolicyPercentageValue";

    public static final String Percentage = "percentage";
  }

  public static class SELLINGPLANRECURRINGBILLINGPOLICY {
    public static final String TYPE_NAME = "SellingPlanRecurringBillingPolicy";

    public static final String Anchors = "anchors";

    public static final String CreatedAt = "createdAt";

    public static final String Interval = "interval";

    public static final String IntervalCount = "intervalCount";

    public static final String MaxCycles = "maxCycles";

    public static final String MinCycles = "minCycles";
  }

  public static class SELLINGPLANRECURRINGDELIVERYPOLICY {
    public static final String TYPE_NAME = "SellingPlanRecurringDeliveryPolicy";

    public static final String Anchors = "anchors";

    public static final String CreatedAt = "createdAt";

    public static final String Cutoff = "cutoff";

    public static final String Intent = "intent";

    public static final String Interval = "interval";

    public static final String IntervalCount = "intervalCount";

    public static final String PreAnchorBehavior = "preAnchorBehavior";
  }

  public static class SELLINGPLANRECURRINGPRICINGPOLICY {
    public static final String TYPE_NAME = "SellingPlanRecurringPricingPolicy";

    public static final String AdjustmentType = "adjustmentType";

    public static final String AdjustmentValue = "adjustmentValue";

    public static final String AfterCycle = "afterCycle";

    public static final String CreatedAt = "createdAt";
  }

  public static class SEO {
    public static final String TYPE_NAME = "SEO";

    public static final String Description = "description";

    public static final String Title = "title";
  }

  public static class SERVERPIXEL {
    public static final String TYPE_NAME = "ServerPixel";

    public static final String Id = "id";

    public static final String Status = "status";

    public static final String WebhookEndpointAddress = "webhookEndpointAddress";
  }

  public static class SERVERPIXELCREATEPAYLOAD {
    public static final String TYPE_NAME = "ServerPixelCreatePayload";

    public static final String ServerPixel = "serverPixel";

    public static final String UserErrors = "userErrors";
  }

  public static class SERVERPIXELDELETEPAYLOAD {
    public static final String TYPE_NAME = "ServerPixelDeletePayload";

    public static final String DeletedServerPixelId = "deletedServerPixelId";

    public static final String UserErrors = "userErrors";
  }

  public static class SHIPPINGLABEL {
    public static final String TYPE_NAME = "ShippingLabel";

    public static final String Cancellable = "cancellable";

    public static final String Id = "id";

    public static final String Location = "location";

    public static final String Printed = "printed";
  }

  public static class SHIPPINGLINE {
    public static final String TYPE_NAME = "ShippingLine";

    public static final String CarrierIdentifier = "carrierIdentifier";

    public static final String Code = "code";

    public static final String Custom = "custom";

    public static final String DeliveryCategory = "deliveryCategory";

    public static final String DiscountAllocations = "discountAllocations";

    public static final String DiscountedPrice = "discountedPrice";

    public static final String DiscountedPriceSet = "discountedPriceSet";

    public static final String Id = "id";

    public static final String OriginalPrice = "originalPrice";

    public static final String OriginalPriceSet = "originalPriceSet";

    public static final String Phone = "phone";

    public static final String Price = "price";

    public static final String RequestedFulfillmentService = "requestedFulfillmentService";

    public static final String ShippingRateHandle = "shippingRateHandle";

    public static final String Source = "source";

    public static final String TaxLines = "taxLines";

    public static final String Title = "title";
  }

  public static class SHIPPINGLINECONNECTION {
    public static final String TYPE_NAME = "ShippingLineConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class SHIPPINGLINEEDGE {
    public static final String TYPE_NAME = "ShippingLineEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class SHIPPINGLINESALE {
    public static final String TYPE_NAME = "ShippingLineSale";

    public static final String ActionType = "actionType";

    public static final String Id = "id";

    public static final String LineType = "lineType";

    public static final String Quantity = "quantity";

    public static final String ShippingLine = "shippingLine";

    public static final String Taxes = "taxes";

    public static final String TotalAmount = "totalAmount";

    public static final String TotalDiscountAmountAfterTaxes = "totalDiscountAmountAfterTaxes";

    public static final String TotalDiscountAmountBeforeTaxes = "totalDiscountAmountBeforeTaxes";

    public static final String TotalTaxAmount = "totalTaxAmount";
  }

  public static class SHIPPINGMETHOD {
    public static final String TYPE_NAME = "ShippingMethod";

    public static final String Code = "code";

    public static final String Label = "label";
  }

  public static class SHIPPINGPACKAGEDELETEPAYLOAD {
    public static final String TYPE_NAME = "ShippingPackageDeletePayload";

    public static final String DeletedId = "deletedId";

    public static final String UserErrors = "userErrors";
  }

  public static class SHIPPINGPACKAGEMAKEDEFAULTPAYLOAD {
    public static final String TYPE_NAME = "ShippingPackageMakeDefaultPayload";

    public static final String UserErrors = "userErrors";
  }

  public static class SHIPPINGPACKAGEUPDATEPAYLOAD {
    public static final String TYPE_NAME = "ShippingPackageUpdatePayload";

    public static final String UserErrors = "userErrors";
  }

  public static class SHIPPINGRATE {
    public static final String TYPE_NAME = "ShippingRate";

    public static final String Handle = "handle";

    public static final String Price = "price";

    public static final String Title = "title";
  }

  public static class SHIPPINGREFUND {
    public static final String TYPE_NAME = "ShippingRefund";

    public static final String Amount = "amount";

    public static final String AmountSet = "amountSet";

    public static final String MaximumRefundable = "maximumRefundable";

    public static final String MaximumRefundableSet = "maximumRefundableSet";

    public static final String Tax = "tax";

    public static final String TaxSet = "taxSet";
  }

  public static class SHOP {
    public static final String TYPE_NAME = "Shop";

    public static final String Alerts = "alerts";

    public static final String AllProductCategories = "allProductCategories";

    public static final String AnalyticsToken = "analyticsToken";

    public static final String AssignedFulfillmentOrders = "assignedFulfillmentOrders";

    public static final String AvailableChannelApps = "availableChannelApps";

    public static final String BillingAddress = "billingAddress";

    public static final String ChannelCount = "channelCount";

    public static final String ChannelDefinitionsForInstalledChannels = "channelDefinitionsForInstalledChannels";

    public static final String Channels = "channels";

    public static final String CheckoutApiSupported = "checkoutApiSupported";

    public static final String CollectionByHandle = "collectionByHandle";

    public static final String CollectionSavedSearches = "collectionSavedSearches";

    public static final String Collections = "collections";

    public static final String ContactEmail = "contactEmail";

    public static final String CountriesInShippingZones = "countriesInShippingZones";

    public static final String CurrencyCode = "currencyCode";

    public static final String CurrencyFormats = "currencyFormats";

    public static final String CurrencySettings = "currencySettings";

    public static final String CustomerAccounts = "customerAccounts";

    public static final String CustomerAccountsV2 = "customerAccountsV2";

    public static final String CustomerSavedSearches = "customerSavedSearches";

    public static final String CustomerTags = "customerTags";

    public static final String Customers = "customers";

    public static final String Description = "description";

    public static final String Domains = "domains";

    public static final String DraftOrderSavedSearches = "draftOrderSavedSearches";

    public static final String DraftOrderTags = "draftOrderTags";

    public static final String DraftOrders = "draftOrders";

    public static final String Email = "email";

    public static final String EnabledPresentmentCurrencies = "enabledPresentmentCurrencies";

    public static final String Features = "features";

    public static final String FulfillmentOrders = "fulfillmentOrders";

    public static final String FulfillmentServices = "fulfillmentServices";

    public static final String IanaTimezone = "ianaTimezone";

    public static final String Id = "id";

    public static final String InventoryItems = "inventoryItems";

    public static final String LimitedPendingOrderCount = "limitedPendingOrderCount";

    public static final String Locations = "locations";

    public static final String MarketingEvents = "marketingEvents";

    public static final String MerchantApprovalSignals = "merchantApprovalSignals";

    public static final String Metafield = "metafield";

    public static final String Metafields = "metafields";

    public static final String MyshopifyDomain = "myshopifyDomain";

    public static final String Name = "name";

    public static final String NavigationSettings = "navigationSettings";

    public static final String OrderNumberFormatPrefix = "orderNumberFormatPrefix";

    public static final String OrderNumberFormatSuffix = "orderNumberFormatSuffix";

    public static final String OrderSavedSearches = "orderSavedSearches";

    public static final String OrderTags = "orderTags";

    public static final String Orders = "orders";

    public static final String PaymentSettings = "paymentSettings";

    public static final String PendingOrderCount = "pendingOrderCount";

    public static final String Plan = "plan";

    public static final String PriceRuleSavedSearches = "priceRuleSavedSearches";

    public static final String PriceRules = "priceRules";

    public static final String PrimaryDomain = "primaryDomain";

    public static final String PrivateMetafield = "privateMetafield";

    public static final String PrivateMetafields = "privateMetafields";

    public static final String ProductByHandle = "productByHandle";

    public static final String ProductImages = "productImages";

    public static final String ProductSavedSearches = "productSavedSearches";

    public static final String ProductTags = "productTags";

    public static final String ProductTypes = "productTypes";

    public static final String ProductVariants = "productVariants";

    public static final String ProductVendors = "productVendors";

    public static final String Products = "products";

    public static final String PublicationCount = "publicationCount";

    public static final String ResourceLimits = "resourceLimits";

    public static final String RichTextEditorUrl = "richTextEditorUrl";

    public static final String Search = "search";

    public static final String SearchFilters = "searchFilters";

    public static final String SetupRequired = "setupRequired";

    public static final String ShipsToCountries = "shipsToCountries";

    public static final String ShopPolicies = "shopPolicies";

    public static final String StaffMembers = "staffMembers";

    public static final String StorefrontAccessTokens = "storefrontAccessTokens";

    public static final String StorefrontUrl = "storefrontUrl";

    public static final String TaxShipping = "taxShipping";

    public static final String TaxesIncluded = "taxesIncluded";

    public static final String TimezoneAbbreviation = "timezoneAbbreviation";

    public static final String TimezoneOffset = "timezoneOffset";

    public static final String TimezoneOffsetMinutes = "timezoneOffsetMinutes";

    public static final String TransactionalSmsDisabled = "transactionalSmsDisabled";

    public static final String Translations = "translations";

    public static final String UnitSystem = "unitSystem";

    public static final String UploadedImagesByIds = "uploadedImagesByIds";

    public static final String Url = "url";

    public static final String WeightUnit = "weightUnit";

    public static class ASSIGNEDFULFILLMENTORDERS_INPUT_ARGUMENT {
      public static final String AssignmentStatus = "assignmentStatus";

      public static final String LocationIds = "locationIds";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";
    }

    public static class AVAILABLECHANNELAPPS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class CHANNELS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class COLLECTIONBYHANDLE_INPUT_ARGUMENT {
      public static final String Handle = "handle";
    }

    public static class COLLECTIONSAVEDSEARCHES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class COLLECTIONS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";

      public static final String SavedSearchId = "savedSearchId";
    }

    public static class CURRENCYSETTINGS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class CUSTOMERSAVEDSEARCHES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class CUSTOMERTAGS_INPUT_ARGUMENT {
      public static final String First = "first";
    }

    public static class CUSTOMERS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class DRAFTORDERSAVEDSEARCHES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class DRAFTORDERTAGS_INPUT_ARGUMENT {
      public static final String First = "first";
    }

    public static class DRAFTORDERS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class FULFILLMENTORDERS_INPUT_ARGUMENT {
      public static final String IncludeClosed = "includeClosed";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class INVENTORYITEMS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String Query = "query";
    }

    public static class LOCATIONS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";

      public static final String IncludeLegacy = "includeLegacy";

      public static final String IncludeInactive = "includeInactive";
    }

    public static class MARKETINGEVENTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class METAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class METAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Keys = "keys";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class ORDERSAVEDSEARCHES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class ORDERTAGS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String Sort = "sort";
    }

    public static class ORDERS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class PRICERULESAVEDSEARCHES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PRICERULES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";

      public static final String SavedSearchId = "savedSearchId";
    }

    public static class PRIVATEMETAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class PRIVATEMETAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PRODUCTBYHANDLE_INPUT_ARGUMENT {
      public static final String Handle = "handle";
    }

    public static class PRODUCTIMAGES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";
    }

    public static class PRODUCTSAVEDSEARCHES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PRODUCTTAGS_INPUT_ARGUMENT {
      public static final String First = "first";
    }

    public static class PRODUCTTYPES_INPUT_ARGUMENT {
      public static final String First = "first";
    }

    public static class PRODUCTVARIANTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class PRODUCTVENDORS_INPUT_ARGUMENT {
      public static final String First = "first";
    }

    public static class PRODUCTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";

      public static final String SavedSearchId = "savedSearchId";
    }

    public static class SEARCH_INPUT_ARGUMENT {
      public static final String Query = "query";

      public static final String Types = "types";

      public static final String First = "first";

      public static final String After = "after";
    }

    public static class STAFFMEMBERS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class STOREFRONTACCESSTOKENS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class TRANSLATIONS_INPUT_ARGUMENT {
      public static final String Locale = "locale";

      public static final String MarketId = "marketId";
    }

    public static class UPLOADEDIMAGESBYIDS_INPUT_ARGUMENT {
      public static final String ImageIds = "imageIds";
    }
  }

  public static class SHOPADDRESS {
    public static final String TYPE_NAME = "ShopAddress";

    public static final String Address1 = "address1";

    public static final String Address2 = "address2";

    public static final String City = "city";

    public static final String Company = "company";

    public static final String CoordinatesValidated = "coordinatesValidated";

    public static final String Country = "country";

    public static final String CountryCode = "countryCode";

    public static final String CountryCodeV2 = "countryCodeV2";

    public static final String FirstName = "firstName";

    public static final String Formatted = "formatted";

    public static final String FormattedArea = "formattedArea";

    public static final String Id = "id";

    public static final String LastName = "lastName";

    public static final String Latitude = "latitude";

    public static final String Longitude = "longitude";

    public static final String Name = "name";

    public static final String Phone = "phone";

    public static final String Province = "province";

    public static final String ProvinceCode = "provinceCode";

    public static final String Zip = "zip";

    public static class FORMATTED_INPUT_ARGUMENT {
      public static final String WithCompany = "withCompany";
    }
  }

  public static class SHOPALERT {
    public static final String TYPE_NAME = "ShopAlert";

    public static final String Action = "action";

    public static final String Description = "description";
  }

  public static class SHOPALERTACTION {
    public static final String TYPE_NAME = "ShopAlertAction";

    public static final String Title = "title";

    public static final String Url = "url";
  }

  public static class SHOPBILLINGPREFERENCES {
    public static final String TYPE_NAME = "ShopBillingPreferences";

    public static final String Currency = "currency";
  }

  public static class SHOPFEATURES {
    public static final String TYPE_NAME = "ShopFeatures";

    public static final String AvalaraAvatax = "avalaraAvatax";

    public static final String Branding = "branding";

    public static final String Bundles = "bundles";

    public static final String Captcha = "captcha";

    public static final String CaptchaExternalDomains = "captchaExternalDomains";

    public static final String CartTransform = "cartTransform";

    public static final String DeliveryProfiles = "deliveryProfiles";

    public static final String DynamicRemarketing = "dynamicRemarketing";

    public static final String EligibleForSubscriptionMigration = "eligibleForSubscriptionMigration";

    public static final String EligibleForSubscriptions = "eligibleForSubscriptions";

    public static final String GiftCards = "giftCards";

    public static final String HarmonizedSystemCode = "harmonizedSystemCode";

    public static final String InternationalDomains = "internationalDomains";

    public static final String InternationalPriceOverrides = "internationalPriceOverrides";

    public static final String InternationalPriceRules = "internationalPriceRules";

    public static final String LegacySubscriptionGatewayEnabled = "legacySubscriptionGatewayEnabled";

    public static final String LiveView = "liveView";

    public static final String MultiLocation = "multiLocation";

    public static final String OnboardingVisual = "onboardingVisual";

    public static final String PaypalExpressSubscriptionGatewayStatus = "paypalExpressSubscriptionGatewayStatus";

    public static final String Reports = "reports";

    public static final String SellsSubscriptions = "sellsSubscriptions";

    public static final String ShopifyPlus = "shopifyPlus";

    public static final String ShowMetrics = "showMetrics";

    public static final String Storefront = "storefront";

    public static final String UsingShopifyBalance = "usingShopifyBalance";
  }

  public static class SHOPIFYFUNCTION {
    public static final String TYPE_NAME = "ShopifyFunction";

    public static final String ApiType = "apiType";

    public static final String ApiVersion = "apiVersion";

    public static final String App = "app";

    public static final String AppBridge = "appBridge";

    public static final String AppKey = "appKey";

    public static final String Description = "description";

    public static final String Id = "id";

    public static final String InputQuery = "inputQuery";

    public static final String Title = "title";

    public static final String UseCreationUi = "useCreationUi";
  }

  public static class SHOPIFYFUNCTIONCONNECTION {
    public static final String TYPE_NAME = "ShopifyFunctionConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class SHOPIFYFUNCTIONEDGE {
    public static final String TYPE_NAME = "ShopifyFunctionEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class SHOPIFYPAYMENTSACCOUNT {
    public static final String TYPE_NAME = "ShopifyPaymentsAccount";

    public static final String Activated = "activated";

    public static final String Balance = "balance";

    public static final String BalanceTransactions = "balanceTransactions";

    public static final String BankAccounts = "bankAccounts";

    public static final String ChargeStatementDescriptor = "chargeStatementDescriptor";

    public static final String ChargeStatementDescriptors = "chargeStatementDescriptors";

    public static final String Country = "country";

    public static final String DefaultCurrency = "defaultCurrency";

    public static final String Disputes = "disputes";

    public static final String FraudSettings = "fraudSettings";

    public static final String Id = "id";

    public static final String NotificationSettings = "notificationSettings";

    public static final String Onboardable = "onboardable";

    public static final String PayoutSchedule = "payoutSchedule";

    public static final String PayoutStatementDescriptor = "payoutStatementDescriptor";

    public static final String Payouts = "payouts";

    public static final String PermittedVerificationDocuments = "permittedVerificationDocuments";

    public static final String Verifications = "verifications";

    public static class BALANCETRANSACTIONS_INPUT_ARGUMENT {
      public static final String HideTransfers = "hideTransfers";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";

      public static final String SavedSearchId = "savedSearchId";
    }

    public static class BANKACCOUNTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class DISPUTES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String Query = "query";
    }

    public static class PAYOUTS_INPUT_ARGUMENT {
      public static final String TransactionType = "transactionType";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class SHOPIFYPAYMENTSADJUSTMENTORDER {
    public static final String TYPE_NAME = "ShopifyPaymentsAdjustmentOrder";

    public static final String Amount = "amount";

    public static final String Link = "link";

    public static final String Name = "name";
  }

  public static class SHOPIFYPAYMENTSBALANCETRANSACTION {
    public static final String TYPE_NAME = "ShopifyPaymentsBalanceTransaction";

    public static final String AdjustmentsOrders = "adjustmentsOrders";

    public static final String Id = "id";

    public static final String Net = "net";

    public static final String TransactionDate = "transactionDate";
  }

  public static class SHOPIFYPAYMENTSBALANCETRANSACTIONCONNECTION {
    public static final String TYPE_NAME = "ShopifyPaymentsBalanceTransactionConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class SHOPIFYPAYMENTSBALANCETRANSACTIONEDGE {
    public static final String TYPE_NAME = "ShopifyPaymentsBalanceTransactionEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class SHOPIFYPAYMENTSBANKACCOUNT {
    public static final String TYPE_NAME = "ShopifyPaymentsBankAccount";

    public static final String AccountNumber = "accountNumber";

    public static final String AccountNumberLastDigits = "accountNumberLastDigits";

    public static final String BankName = "bankName";

    public static final String Country = "country";

    public static final String CreatedAt = "createdAt";

    public static final String Currency = "currency";

    public static final String Id = "id";

    public static final String Payouts = "payouts";

    public static final String RoutingNumber = "routingNumber";

    public static final String Status = "status";

    public static class PAYOUTS_INPUT_ARGUMENT {
      public static final String TransactionType = "transactionType";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class SHOPIFYPAYMENTSBANKACCOUNTCONNECTION {
    public static final String TYPE_NAME = "ShopifyPaymentsBankAccountConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class SHOPIFYPAYMENTSBANKACCOUNTEDGE {
    public static final String TYPE_NAME = "ShopifyPaymentsBankAccountEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class SHOPIFYPAYMENTSDEFAULTCHARGESTATEMENTDESCRIPTOR {
    public static final String TYPE_NAME = "ShopifyPaymentsDefaultChargeStatementDescriptor";

    public static final String Default = "default";

    public static final String Prefix = "prefix";
  }

  public static class SHOPIFYPAYMENTSDISPUTE {
    public static final String TYPE_NAME = "ShopifyPaymentsDispute";

    public static final String Amount = "amount";

    public static final String EvidenceDueBy = "evidenceDueBy";

    public static final String EvidenceSentOn = "evidenceSentOn";

    public static final String FinalizedOn = "finalizedOn";

    public static final String Id = "id";

    public static final String InitiatedAt = "initiatedAt";

    public static final String LegacyResourceId = "legacyResourceId";

    public static final String Order = "order";

    public static final String ReasonDetails = "reasonDetails";

    public static final String Status = "status";

    public static final String Type = "type";
  }

  public static class SHOPIFYPAYMENTSDISPUTECONNECTION {
    public static final String TYPE_NAME = "ShopifyPaymentsDisputeConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class SHOPIFYPAYMENTSDISPUTEEDGE {
    public static final String TYPE_NAME = "ShopifyPaymentsDisputeEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class SHOPIFYPAYMENTSDISPUTEEVIDENCE {
    public static final String TYPE_NAME = "ShopifyPaymentsDisputeEvidence";

    public static final String AccessActivityLog = "accessActivityLog";

    public static final String BillingAddress = "billingAddress";

    public static final String CancellationPolicyDisclosure = "cancellationPolicyDisclosure";

    public static final String CancellationPolicyFile = "cancellationPolicyFile";

    public static final String CancellationRebuttal = "cancellationRebuttal";

    public static final String CustomerCommunicationFile = "customerCommunicationFile";

    public static final String CustomerEmailAddress = "customerEmailAddress";

    public static final String CustomerFirstName = "customerFirstName";

    public static final String CustomerLastName = "customerLastName";

    public static final String CustomerPurchaseIp = "customerPurchaseIp";

    public static final String Dispute = "dispute";

    public static final String DisputeFileUploads = "disputeFileUploads";

    public static final String Fulfillments = "fulfillments";

    public static final String Id = "id";

    public static final String ProductDescription = "productDescription";

    public static final String RefundPolicyDisclosure = "refundPolicyDisclosure";

    public static final String RefundPolicyFile = "refundPolicyFile";

    public static final String RefundRefusalExplanation = "refundRefusalExplanation";

    public static final String ServiceDocumentationFile = "serviceDocumentationFile";

    public static final String ShippingAddress = "shippingAddress";

    public static final String ShippingDocumentationFile = "shippingDocumentationFile";

    public static final String Submitted = "submitted";

    public static final String UncategorizedFile = "uncategorizedFile";

    public static final String UncategorizedText = "uncategorizedText";
  }

  public static class SHOPIFYPAYMENTSDISPUTEFILEUPLOAD {
    public static final String TYPE_NAME = "ShopifyPaymentsDisputeFileUpload";

    public static final String DisputeEvidenceType = "disputeEvidenceType";

    public static final String FileSize = "fileSize";

    public static final String FileType = "fileType";

    public static final String Id = "id";

    public static final String OriginalFileName = "originalFileName";

    public static final String Url = "url";
  }

  public static class SHOPIFYPAYMENTSDISPUTEFULFILLMENT {
    public static final String TYPE_NAME = "ShopifyPaymentsDisputeFulfillment";

    public static final String Id = "id";

    public static final String ShippingCarrier = "shippingCarrier";

    public static final String ShippingDate = "shippingDate";

    public static final String ShippingTrackingNumber = "shippingTrackingNumber";
  }

  public static class SHOPIFYPAYMENTSDISPUTEREASONDETAILS {
    public static final String TYPE_NAME = "ShopifyPaymentsDisputeReasonDetails";

    public static final String NetworkReasonCode = "networkReasonCode";

    public static final String Reason = "reason";
  }

  public static class SHOPIFYPAYMENTSEXTENDEDAUTHORIZATION {
    public static final String TYPE_NAME = "ShopifyPaymentsExtendedAuthorization";

    public static final String ExtendedAuthorizationExpiresAt = "extendedAuthorizationExpiresAt";

    public static final String StandardAuthorizationExpiresAt = "standardAuthorizationExpiresAt";
  }

  public static class SHOPIFYPAYMENTSFRAUDSETTINGS {
    public static final String TYPE_NAME = "ShopifyPaymentsFraudSettings";

    public static final String DeclineChargeOnAvsFailure = "declineChargeOnAvsFailure";

    public static final String DeclineChargeOnCvcFailure = "declineChargeOnCvcFailure";
  }

  public static class SHOPIFYPAYMENTSJPCHARGESTATEMENTDESCRIPTOR {
    public static final String TYPE_NAME = "ShopifyPaymentsJpChargeStatementDescriptor";

    public static final String Default = "default";

    public static final String Kana = "kana";

    public static final String Kanji = "kanji";

    public static final String Prefix = "prefix";
  }

  public static class SHOPIFYPAYMENTSNOTIFICATIONSETTINGS {
    public static final String TYPE_NAME = "ShopifyPaymentsNotificationSettings";

    public static final String Payouts = "payouts";
  }

  public static class SHOPIFYPAYMENTSPAYOUT {
    public static final String TYPE_NAME = "ShopifyPaymentsPayout";

    public static final String BankAccount = "bankAccount";

    public static final String Gross = "gross";

    public static final String Id = "id";

    public static final String IssuedAt = "issuedAt";

    public static final String LegacyResourceId = "legacyResourceId";

    public static final String Net = "net";

    public static final String Status = "status";

    public static final String Summary = "summary";

    public static final String TransactionType = "transactionType";
  }

  public static class SHOPIFYPAYMENTSPAYOUTCONNECTION {
    public static final String TYPE_NAME = "ShopifyPaymentsPayoutConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class SHOPIFYPAYMENTSPAYOUTEDGE {
    public static final String TYPE_NAME = "ShopifyPaymentsPayoutEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class SHOPIFYPAYMENTSPAYOUTSCHEDULE {
    public static final String TYPE_NAME = "ShopifyPaymentsPayoutSchedule";

    public static final String Interval = "interval";

    public static final String MonthlyAnchor = "monthlyAnchor";

    public static final String WeeklyAnchor = "weeklyAnchor";
  }

  public static class SHOPIFYPAYMENTSPAYOUTSUMMARY {
    public static final String TYPE_NAME = "ShopifyPaymentsPayoutSummary";

    public static final String AdjustmentsFee = "adjustmentsFee";

    public static final String AdjustmentsGross = "adjustmentsGross";

    public static final String ChargesFee = "chargesFee";

    public static final String ChargesGross = "chargesGross";

    public static final String RefundsFee = "refundsFee";

    public static final String RefundsFeeGross = "refundsFeeGross";

    public static final String ReservedFundsFee = "reservedFundsFee";

    public static final String ReservedFundsGross = "reservedFundsGross";

    public static final String RetriedPayoutsFee = "retriedPayoutsFee";

    public static final String RetriedPayoutsGross = "retriedPayoutsGross";
  }

  public static class SHOPIFYPAYMENTSREFUNDSET {
    public static final String TYPE_NAME = "ShopifyPaymentsRefundSet";

    public static final String AcquirerReferenceNumber = "acquirerReferenceNumber";
  }

  public static class SHOPIFYPAYMENTSTRANSACTIONSET {
    public static final String TYPE_NAME = "ShopifyPaymentsTransactionSet";

    public static final String ExtendedAuthorizationSet = "extendedAuthorizationSet";

    public static final String RefundSet = "refundSet";
  }

  public static class SHOPIFYPAYMENTSVERIFICATION {
    public static final String TYPE_NAME = "ShopifyPaymentsVerification";

    public static final String Id = "id";

    public static final String Status = "status";

    public static final String Subject = "subject";
  }

  public static class SHOPIFYPAYMENTSVERIFICATIONDOCUMENT {
    public static final String TYPE_NAME = "ShopifyPaymentsVerificationDocument";

    public static final String BackRequired = "backRequired";

    public static final String FrontRequired = "frontRequired";

    public static final String Type = "type";
  }

  public static class SHOPIFYPAYMENTSVERIFICATIONSUBJECT {
    public static final String TYPE_NAME = "ShopifyPaymentsVerificationSubject";

    public static final String FamilyName = "familyName";

    public static final String GivenName = "givenName";
  }

  public static class SHOPIFYPROTECTORDERELIGIBILITY {
    public static final String TYPE_NAME = "ShopifyProtectOrderEligibility";

    public static final String Status = "status";
  }

  public static class SHOPIFYPROTECTORDERSUMMARY {
    public static final String TYPE_NAME = "ShopifyProtectOrderSummary";

    public static final String Eligibility = "eligibility";

    public static final String Status = "status";
  }

  public static class SHOPLOCALE {
    public static final String TYPE_NAME = "ShopLocale";

    public static final String Locale = "locale";

    public static final String MarketWebPresences = "marketWebPresences";

    public static final String Name = "name";

    public static final String Primary = "primary";

    public static final String Published = "published";
  }

  public static class SHOPLOCALEDISABLEPAYLOAD {
    public static final String TYPE_NAME = "ShopLocaleDisablePayload";

    public static final String Locale = "locale";

    public static final String UserErrors = "userErrors";
  }

  public static class SHOPLOCALEENABLEPAYLOAD {
    public static final String TYPE_NAME = "ShopLocaleEnablePayload";

    public static final String ShopLocale = "shopLocale";

    public static final String UserErrors = "userErrors";
  }

  public static class SHOPLOCALEUPDATEPAYLOAD {
    public static final String TYPE_NAME = "ShopLocaleUpdatePayload";

    public static final String ShopLocale = "shopLocale";

    public static final String UserErrors = "userErrors";
  }

  public static class SHOPPAYINSTALLMENTSPAYMENTDETAILS {
    public static final String TYPE_NAME = "ShopPayInstallmentsPaymentDetails";

    public static final String PaymentMethodName = "paymentMethodName";
  }

  public static class SHOPPLAN {
    public static final String TYPE_NAME = "ShopPlan";

    public static final String DisplayName = "displayName";

    public static final String PartnerDevelopment = "partnerDevelopment";

    public static final String ShopifyPlus = "shopifyPlus";
  }

  public static class SHOPPOLICY {
    public static final String TYPE_NAME = "ShopPolicy";

    public static final String Body = "body";

    public static final String Id = "id";

    public static final String Translations = "translations";

    public static final String Type = "type";

    public static final String Url = "url";

    public static class TRANSLATIONS_INPUT_ARGUMENT {
      public static final String Locale = "locale";

      public static final String MarketId = "marketId";
    }
  }

  public static class SHOPPOLICYUPDATEPAYLOAD {
    public static final String TYPE_NAME = "ShopPolicyUpdatePayload";

    public static final String ShopPolicy = "shopPolicy";

    public static final String UserErrors = "userErrors";
  }

  public static class SHOPPOLICYUSERERROR {
    public static final String TYPE_NAME = "ShopPolicyUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class SHOPRESOURCEFEEDBACKCREATEPAYLOAD {
    public static final String TYPE_NAME = "ShopResourceFeedbackCreatePayload";

    public static final String Feedback = "feedback";

    public static final String UserErrors = "userErrors";
  }

  public static class SHOPRESOURCEFEEDBACKCREATEUSERERROR {
    public static final String TYPE_NAME = "ShopResourceFeedbackCreateUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class SHOPRESOURCELIMITS {
    public static final String TYPE_NAME = "ShopResourceLimits";

    public static final String LocationLimit = "locationLimit";

    public static final String MaxProductOptions = "maxProductOptions";

    public static final String MaxProductVariants = "maxProductVariants";

    public static final String RedirectLimitReached = "redirectLimitReached";
  }

  public static class STAFFMEMBER {
    public static final String TYPE_NAME = "StaffMember";

    public static final String Active = "active";

    public static final String Avatar = "avatar";

    public static final String Email = "email";

    public static final String Exists = "exists";

    public static final String FirstName = "firstName";

    public static final String Id = "id";

    public static final String Initials = "initials";

    public static final String IsShopOwner = "isShopOwner";

    public static final String LastName = "lastName";

    public static final String Locale = "locale";

    public static final String Name = "name";

    public static final String Phone = "phone";

    public static final String PrivateData = "privateData";

    public static class AVATAR_INPUT_ARGUMENT {
      public static final String Fallback = "fallback";
    }
  }

  public static class STAFFMEMBERCONNECTION {
    public static final String TYPE_NAME = "StaffMemberConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class STAFFMEMBEREDGE {
    public static final String TYPE_NAME = "StaffMemberEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class STAFFMEMBERPRIVATEDATA {
    public static final String TYPE_NAME = "StaffMemberPrivateData";

    public static final String AccountSettingsUrl = "accountSettingsUrl";

    public static final String CreatedAt = "createdAt";

    public static final String Permissions = "permissions";
  }

  public static class STAGEDMEDIAUPLOADTARGET {
    public static final String TYPE_NAME = "StagedMediaUploadTarget";

    public static final String Parameters = "parameters";

    public static final String ResourceUrl = "resourceUrl";

    public static final String Url = "url";
  }

  public static class STAGEDUPLOADPARAMETER {
    public static final String TYPE_NAME = "StagedUploadParameter";

    public static final String Name = "name";

    public static final String Value = "value";
  }

  public static class STAGEDUPLOADSCREATEPAYLOAD {
    public static final String TYPE_NAME = "StagedUploadsCreatePayload";

    public static final String StagedTargets = "stagedTargets";

    public static final String UserErrors = "userErrors";
  }

  public static class STAGEDUPLOADTARGET {
    public static final String TYPE_NAME = "StagedUploadTarget";

    public static final String Parameters = "parameters";

    public static final String Url = "url";
  }

  public static class STAGEDUPLOADTARGETGENERATEPAYLOAD {
    public static final String TYPE_NAME = "StagedUploadTargetGeneratePayload";

    public static final String Parameters = "parameters";

    public static final String Url = "url";

    public static final String UserErrors = "userErrors";
  }

  public static class STAGEDUPLOADTARGETSGENERATEPAYLOAD {
    public static final String TYPE_NAME = "StagedUploadTargetsGeneratePayload";

    public static final String Urls = "urls";

    public static final String UserErrors = "userErrors";
  }

  public static class STANDARDIZEDPRODUCTTYPE {
    public static final String TYPE_NAME = "StandardizedProductType";

    public static final String ProductTaxonomyNode = "productTaxonomyNode";
  }

  public static class STANDARDMETAFIELDDEFINITIONENABLEPAYLOAD {
    public static final String TYPE_NAME = "StandardMetafieldDefinitionEnablePayload";

    public static final String CreatedDefinition = "createdDefinition";

    public static final String UserErrors = "userErrors";
  }

  public static class STANDARDMETAFIELDDEFINITIONENABLEUSERERROR {
    public static final String TYPE_NAME = "StandardMetafieldDefinitionEnableUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class STANDARDMETAFIELDDEFINITIONTEMPLATE {
    public static final String TYPE_NAME = "StandardMetafieldDefinitionTemplate";

    public static final String Description = "description";

    public static final String Id = "id";

    public static final String Key = "key";

    public static final String Name = "name";

    public static final String Namespace = "namespace";

    public static final String OwnerTypes = "ownerTypes";

    public static final String Type = "type";

    public static final String Validations = "validations";

    public static final String VisibleToStorefrontApi = "visibleToStorefrontApi";
  }

  public static class STANDARDMETAFIELDDEFINITIONTEMPLATECONNECTION {
    public static final String TYPE_NAME = "StandardMetafieldDefinitionTemplateConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class STANDARDMETAFIELDDEFINITIONTEMPLATEEDGE {
    public static final String TYPE_NAME = "StandardMetafieldDefinitionTemplateEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class STANDARDMETAOBJECTDEFINITIONENABLEPAYLOAD {
    public static final String TYPE_NAME = "StandardMetaobjectDefinitionEnablePayload";

    public static final String MetaobjectDefinition = "metaobjectDefinition";

    public static final String UserErrors = "userErrors";
  }

  public static class STOREFRONTACCESSTOKEN {
    public static final String TYPE_NAME = "StorefrontAccessToken";

    public static final String AccessScopes = "accessScopes";

    public static final String AccessToken = "accessToken";

    public static final String CreatedAt = "createdAt";

    public static final String Id = "id";

    public static final String Title = "title";

    public static final String UpdatedAt = "updatedAt";
  }

  public static class STOREFRONTACCESSTOKENCONNECTION {
    public static final String TYPE_NAME = "StorefrontAccessTokenConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class STOREFRONTACCESSTOKENCREATEPAYLOAD {
    public static final String TYPE_NAME = "StorefrontAccessTokenCreatePayload";

    public static final String Shop = "shop";

    public static final String StorefrontAccessToken = "storefrontAccessToken";

    public static final String UserErrors = "userErrors";
  }

  public static class STOREFRONTACCESSTOKENDELETEPAYLOAD {
    public static final String TYPE_NAME = "StorefrontAccessTokenDeletePayload";

    public static final String DeletedStorefrontAccessTokenId = "deletedStorefrontAccessTokenId";

    public static final String UserErrors = "userErrors";
  }

  public static class STOREFRONTACCESSTOKENEDGE {
    public static final String TYPE_NAME = "StorefrontAccessTokenEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class STRINGCONNECTION {
    public static final String TYPE_NAME = "StringConnection";

    public static final String Edges = "edges";

    public static final String PageInfo = "pageInfo";
  }

  public static class STRINGEDGE {
    public static final String TYPE_NAME = "StringEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class SUBSCRIPTIONAPPLIEDCODEDISCOUNT {
    public static final String TYPE_NAME = "SubscriptionAppliedCodeDiscount";

    public static final String Id = "id";

    public static final String RedeemCode = "redeemCode";

    public static final String RejectionReason = "rejectionReason";
  }

  public static class SUBSCRIPTIONBILLINGATTEMPT {
    public static final String TYPE_NAME = "SubscriptionBillingAttempt";

    public static final String CompletedAt = "completedAt";

    public static final String CreatedAt = "createdAt";

    public static final String ErrorCode = "errorCode";

    public static final String ErrorMessage = "errorMessage";

    public static final String Id = "id";

    public static final String IdempotencyKey = "idempotencyKey";

    public static final String NextActionUrl = "nextActionUrl";

    public static final String Order = "order";

    public static final String OriginTime = "originTime";

    public static final String Ready = "ready";

    public static final String SubscriptionContract = "subscriptionContract";
  }

  public static class SUBSCRIPTIONBILLINGATTEMPTCONNECTION {
    public static final String TYPE_NAME = "SubscriptionBillingAttemptConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class SUBSCRIPTIONBILLINGATTEMPTCREATEPAYLOAD {
    public static final String TYPE_NAME = "SubscriptionBillingAttemptCreatePayload";

    public static final String SubscriptionBillingAttempt = "subscriptionBillingAttempt";

    public static final String UserErrors = "userErrors";
  }

  public static class SUBSCRIPTIONBILLINGATTEMPTEDGE {
    public static final String TYPE_NAME = "SubscriptionBillingAttemptEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class SUBSCRIPTIONBILLINGCYCLE {
    public static final String TYPE_NAME = "SubscriptionBillingCycle";

    public static final String BillingAttemptExpectedDate = "billingAttemptExpectedDate";

    public static final String BillingAttempts = "billingAttempts";

    public static final String CycleEndAt = "cycleEndAt";

    public static final String CycleIndex = "cycleIndex";

    public static final String CycleStartAt = "cycleStartAt";

    public static final String Edited = "edited";

    public static final String EditedContract = "editedContract";

    public static final String Skipped = "skipped";

    public static final String SourceContract = "sourceContract";

    public static final String Status = "status";

    public static class BILLINGATTEMPTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class SUBSCRIPTIONBILLINGCYCLECONNECTION {
    public static final String TYPE_NAME = "SubscriptionBillingCycleConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class SUBSCRIPTIONBILLINGCYCLECONTRACTDRAFTCOMMITPAYLOAD {
    public static final String TYPE_NAME = "SubscriptionBillingCycleContractDraftCommitPayload";

    public static final String Contract = "contract";

    public static final String UserErrors = "userErrors";
  }

  public static class SUBSCRIPTIONBILLINGCYCLECONTRACTDRAFTCONCATENATEPAYLOAD {
    public static final String TYPE_NAME = "SubscriptionBillingCycleContractDraftConcatenatePayload";

    public static final String Draft = "draft";

    public static final String UserErrors = "userErrors";
  }

  public static class SUBSCRIPTIONBILLINGCYCLECONTRACTEDITPAYLOAD {
    public static final String TYPE_NAME = "SubscriptionBillingCycleContractEditPayload";

    public static final String Draft = "draft";

    public static final String UserErrors = "userErrors";
  }

  public static class SUBSCRIPTIONBILLINGCYCLEEDGE {
    public static final String TYPE_NAME = "SubscriptionBillingCycleEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class SUBSCRIPTIONBILLINGCYCLEEDITDELETEPAYLOAD {
    public static final String TYPE_NAME = "SubscriptionBillingCycleEditDeletePayload";

    public static final String BillingCycles = "billingCycles";

    public static final String UserErrors = "userErrors";
  }

  public static class SUBSCRIPTIONBILLINGCYCLEEDITEDCONTRACT {
    public static final String TYPE_NAME = "SubscriptionBillingCycleEditedContract";

    public static final String App = "app";

    public static final String AppAdminUrl = "appAdminUrl";

    public static final String BillingCycles = "billingCycles";

    public static final String CreatedAt = "createdAt";

    public static final String CurrencyCode = "currencyCode";

    public static final String CustomAttributes = "customAttributes";

    public static final String Customer = "customer";

    public static final String CustomerPaymentMethod = "customerPaymentMethod";

    public static final String DeliveryMethod = "deliveryMethod";

    public static final String DeliveryPrice = "deliveryPrice";

    public static final String Discounts = "discounts";

    public static final String LineCount = "lineCount";

    public static final String Lines = "lines";

    public static final String Note = "note";

    public static final String Orders = "orders";

    public static final String UpdatedAt = "updatedAt";

    public static class BILLINGCYCLES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";
    }

    public static class CUSTOMERPAYMENTMETHOD_INPUT_ARGUMENT {
      public static final String ShowRevoked = "showRevoked";
    }

    public static class DISCOUNTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class LINES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class ORDERS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class SUBSCRIPTIONBILLINGCYCLEEDITSDELETEPAYLOAD {
    public static final String TYPE_NAME = "SubscriptionBillingCycleEditsDeletePayload";

    public static final String BillingCycles = "billingCycles";

    public static final String UserErrors = "userErrors";
  }

  public static class SUBSCRIPTIONBILLINGCYCLESCHEDULEEDITPAYLOAD {
    public static final String TYPE_NAME = "SubscriptionBillingCycleScheduleEditPayload";

    public static final String BillingCycle = "billingCycle";

    public static final String UserErrors = "userErrors";
  }

  public static class SUBSCRIPTIONBILLINGCYCLESKIPPAYLOAD {
    public static final String TYPE_NAME = "SubscriptionBillingCycleSkipPayload";

    public static final String BillingCycle = "billingCycle";

    public static final String UserErrors = "userErrors";
  }

  public static class SUBSCRIPTIONBILLINGCYCLESKIPUSERERROR {
    public static final String TYPE_NAME = "SubscriptionBillingCycleSkipUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class SUBSCRIPTIONBILLINGCYCLEUNSKIPPAYLOAD {
    public static final String TYPE_NAME = "SubscriptionBillingCycleUnskipPayload";

    public static final String BillingCycle = "billingCycle";

    public static final String UserErrors = "userErrors";
  }

  public static class SUBSCRIPTIONBILLINGCYCLEUNSKIPUSERERROR {
    public static final String TYPE_NAME = "SubscriptionBillingCycleUnskipUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class SUBSCRIPTIONBILLINGCYCLEUSERERROR {
    public static final String TYPE_NAME = "SubscriptionBillingCycleUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class SUBSCRIPTIONBILLINGPOLICY {
    public static final String TYPE_NAME = "SubscriptionBillingPolicy";

    public static final String Anchors = "anchors";

    public static final String Interval = "interval";

    public static final String IntervalCount = "intervalCount";

    public static final String MaxCycles = "maxCycles";

    public static final String MinCycles = "minCycles";
  }

  public static class SUBSCRIPTIONCONTRACT {
    public static final String TYPE_NAME = "SubscriptionContract";

    public static final String App = "app";

    public static final String AppAdminUrl = "appAdminUrl";

    public static final String BillingAttempts = "billingAttempts";

    public static final String BillingPolicy = "billingPolicy";

    public static final String CreatedAt = "createdAt";

    public static final String CurrencyCode = "currencyCode";

    public static final String CustomAttributes = "customAttributes";

    public static final String Customer = "customer";

    public static final String CustomerPaymentMethod = "customerPaymentMethod";

    public static final String DeliveryMethod = "deliveryMethod";

    public static final String DeliveryPolicy = "deliveryPolicy";

    public static final String DeliveryPrice = "deliveryPrice";

    public static final String Discounts = "discounts";

    public static final String Id = "id";

    public static final String LastPaymentStatus = "lastPaymentStatus";

    public static final String LineCount = "lineCount";

    public static final String Lines = "lines";

    public static final String NextBillingDate = "nextBillingDate";

    public static final String Note = "note";

    public static final String Orders = "orders";

    public static final String OriginOrder = "originOrder";

    public static final String RevisionId = "revisionId";

    public static final String Status = "status";

    public static final String UpdatedAt = "updatedAt";

    public static class BILLINGATTEMPTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class CUSTOMERPAYMENTMETHOD_INPUT_ARGUMENT {
      public static final String ShowRevoked = "showRevoked";
    }

    public static class DISCOUNTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class LINES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class ORDERS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class SUBSCRIPTIONCONTRACTACTIVATEPAYLOAD {
    public static final String TYPE_NAME = "SubscriptionContractActivatePayload";

    public static final String Contract = "contract";

    public static final String UserErrors = "userErrors";
  }

  public static class SUBSCRIPTIONCONTRACTATOMICCREATEPAYLOAD {
    public static final String TYPE_NAME = "SubscriptionContractAtomicCreatePayload";

    public static final String Contract = "contract";

    public static final String UserErrors = "userErrors";
  }

  public static class SUBSCRIPTIONCONTRACTCANCELPAYLOAD {
    public static final String TYPE_NAME = "SubscriptionContractCancelPayload";

    public static final String Contract = "contract";

    public static final String UserErrors = "userErrors";
  }

  public static class SUBSCRIPTIONCONTRACTCONNECTION {
    public static final String TYPE_NAME = "SubscriptionContractConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class SUBSCRIPTIONCONTRACTCREATEPAYLOAD {
    public static final String TYPE_NAME = "SubscriptionContractCreatePayload";

    public static final String Draft = "draft";

    public static final String UserErrors = "userErrors";
  }

  public static class SUBSCRIPTIONCONTRACTEDGE {
    public static final String TYPE_NAME = "SubscriptionContractEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class SUBSCRIPTIONCONTRACTEXPIREPAYLOAD {
    public static final String TYPE_NAME = "SubscriptionContractExpirePayload";

    public static final String Contract = "contract";

    public static final String UserErrors = "userErrors";
  }

  public static class SUBSCRIPTIONCONTRACTFAILPAYLOAD {
    public static final String TYPE_NAME = "SubscriptionContractFailPayload";

    public static final String Contract = "contract";

    public static final String UserErrors = "userErrors";
  }

  public static class SUBSCRIPTIONCONTRACTPAUSEPAYLOAD {
    public static final String TYPE_NAME = "SubscriptionContractPausePayload";

    public static final String Contract = "contract";

    public static final String UserErrors = "userErrors";
  }

  public static class SUBSCRIPTIONCONTRACTPRODUCTCHANGEPAYLOAD {
    public static final String TYPE_NAME = "SubscriptionContractProductChangePayload";

    public static final String Contract = "contract";

    public static final String LineUpdated = "lineUpdated";

    public static final String UserErrors = "userErrors";
  }

  public static class SUBSCRIPTIONCONTRACTSETNEXTBILLINGDATEPAYLOAD {
    public static final String TYPE_NAME = "SubscriptionContractSetNextBillingDatePayload";

    public static final String Contract = "contract";

    public static final String UserErrors = "userErrors";
  }

  public static class SUBSCRIPTIONCONTRACTSTATUSUPDATEUSERERROR {
    public static final String TYPE_NAME = "SubscriptionContractStatusUpdateUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class SUBSCRIPTIONCONTRACTUPDATEPAYLOAD {
    public static final String TYPE_NAME = "SubscriptionContractUpdatePayload";

    public static final String Draft = "draft";

    public static final String UserErrors = "userErrors";
  }

  public static class SUBSCRIPTIONCONTRACTUSERERROR {
    public static final String TYPE_NAME = "SubscriptionContractUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class SUBSCRIPTIONCYCLEPRICEADJUSTMENT {
    public static final String TYPE_NAME = "SubscriptionCyclePriceAdjustment";

    public static final String AdjustmentType = "adjustmentType";

    public static final String AdjustmentValue = "adjustmentValue";

    public static final String AfterCycle = "afterCycle";

    public static final String ComputedPrice = "computedPrice";
  }

  public static class SUBSCRIPTIONDELIVERYMETHODLOCALDELIVERY {
    public static final String TYPE_NAME = "SubscriptionDeliveryMethodLocalDelivery";

    public static final String Address = "address";

    public static final String LocalDeliveryOption = "localDeliveryOption";
  }

  public static class SUBSCRIPTIONDELIVERYMETHODLOCALDELIVERYOPTION {
    public static final String TYPE_NAME = "SubscriptionDeliveryMethodLocalDeliveryOption";

    public static final String Code = "code";

    public static final String Description = "description";

    public static final String Instructions = "instructions";

    public static final String Phone = "phone";

    public static final String PresentmentTitle = "presentmentTitle";

    public static final String Title = "title";
  }

  public static class SUBSCRIPTIONDELIVERYMETHODPICKUP {
    public static final String TYPE_NAME = "SubscriptionDeliveryMethodPickup";

    public static final String PickupOption = "pickupOption";
  }

  public static class SUBSCRIPTIONDELIVERYMETHODPICKUPOPTION {
    public static final String TYPE_NAME = "SubscriptionDeliveryMethodPickupOption";

    public static final String Code = "code";

    public static final String Description = "description";

    public static final String Location = "location";

    public static final String PresentmentTitle = "presentmentTitle";

    public static final String Title = "title";
  }

  public static class SUBSCRIPTIONDELIVERYMETHODSHIPPING {
    public static final String TYPE_NAME = "SubscriptionDeliveryMethodShipping";

    public static final String Address = "address";

    public static final String ShippingOption = "shippingOption";
  }

  public static class SUBSCRIPTIONDELIVERYMETHODSHIPPINGOPTION {
    public static final String TYPE_NAME = "SubscriptionDeliveryMethodShippingOption";

    public static final String CarrierService = "carrierService";

    public static final String Code = "code";

    public static final String Description = "description";

    public static final String PresentmentTitle = "presentmentTitle";

    public static final String Title = "title";
  }

  public static class SUBSCRIPTIONDELIVERYOPTIONRESULTFAILURE {
    public static final String TYPE_NAME = "SubscriptionDeliveryOptionResultFailure";

    public static final String Message = "message";
  }

  public static class SUBSCRIPTIONDELIVERYOPTIONRESULTSUCCESS {
    public static final String TYPE_NAME = "SubscriptionDeliveryOptionResultSuccess";

    public static final String DeliveryOptions = "deliveryOptions";
  }

  public static class SUBSCRIPTIONDELIVERYPOLICY {
    public static final String TYPE_NAME = "SubscriptionDeliveryPolicy";

    public static final String Anchors = "anchors";

    public static final String Interval = "interval";

    public static final String IntervalCount = "intervalCount";
  }

  public static class SUBSCRIPTIONDISCOUNTALLOCATION {
    public static final String TYPE_NAME = "SubscriptionDiscountAllocation";

    public static final String Amount = "amount";

    public static final String Discount = "discount";
  }

  public static class SUBSCRIPTIONDISCOUNTCONNECTION {
    public static final String TYPE_NAME = "SubscriptionDiscountConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class SUBSCRIPTIONDISCOUNTEDGE {
    public static final String TYPE_NAME = "SubscriptionDiscountEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class SUBSCRIPTIONDISCOUNTENTITLEDLINES {
    public static final String TYPE_NAME = "SubscriptionDiscountEntitledLines";

    public static final String All = "all";

    public static final String Lines = "lines";

    public static class LINES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class SUBSCRIPTIONDISCOUNTFIXEDAMOUNTVALUE {
    public static final String TYPE_NAME = "SubscriptionDiscountFixedAmountValue";

    public static final String Amount = "amount";

    public static final String AppliesOnEachItem = "appliesOnEachItem";
  }

  public static class SUBSCRIPTIONDISCOUNTPERCENTAGEVALUE {
    public static final String TYPE_NAME = "SubscriptionDiscountPercentageValue";

    public static final String Percentage = "percentage";
  }

  public static class SUBSCRIPTIONDRAFT {
    public static final String TYPE_NAME = "SubscriptionDraft";

    public static final String BillingCycle = "billingCycle";

    public static final String BillingPolicy = "billingPolicy";

    public static final String ConcatenatedBillingCycles = "concatenatedBillingCycles";

    public static final String CurrencyCode = "currencyCode";

    public static final String CustomAttributes = "customAttributes";

    public static final String Customer = "customer";

    public static final String CustomerPaymentMethod = "customerPaymentMethod";

    public static final String DeliveryMethod = "deliveryMethod";

    public static final String DeliveryOptions = "deliveryOptions";

    public static final String DeliveryPolicy = "deliveryPolicy";

    public static final String DeliveryPrice = "deliveryPrice";

    public static final String Discounts = "discounts";

    public static final String DiscountsAdded = "discountsAdded";

    public static final String DiscountsRemoved = "discountsRemoved";

    public static final String DiscountsUpdated = "discountsUpdated";

    public static final String Id = "id";

    public static final String Lines = "lines";

    public static final String LinesAdded = "linesAdded";

    public static final String LinesRemoved = "linesRemoved";

    public static final String NextBillingDate = "nextBillingDate";

    public static final String Note = "note";

    public static final String OriginalContract = "originalContract";

    public static final String ShippingOptions = "shippingOptions";

    public static final String Status = "status";

    public static class CONCATENATEDBILLINGCYCLES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";
    }

    public static class CUSTOMERPAYMENTMETHOD_INPUT_ARGUMENT {
      public static final String ShowRevoked = "showRevoked";
    }

    public static class DELIVERYOPTIONS_INPUT_ARGUMENT {
      public static final String DeliveryAddress = "deliveryAddress";
    }

    public static class DISCOUNTS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class DISCOUNTSADDED_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class DISCOUNTSREMOVED_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class DISCOUNTSUPDATED_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class LINES_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class LINESADDED_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class LINESREMOVED_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class SHIPPINGOPTIONS_INPUT_ARGUMENT {
      public static final String DeliveryAddress = "deliveryAddress";
    }
  }

  public static class SUBSCRIPTIONDRAFTCOMMITPAYLOAD {
    public static final String TYPE_NAME = "SubscriptionDraftCommitPayload";

    public static final String Contract = "contract";

    public static final String UserErrors = "userErrors";
  }

  public static class SUBSCRIPTIONDRAFTDISCOUNTADDPAYLOAD {
    public static final String TYPE_NAME = "SubscriptionDraftDiscountAddPayload";

    public static final String DiscountAdded = "discountAdded";

    public static final String Draft = "draft";

    public static final String UserErrors = "userErrors";
  }

  public static class SUBSCRIPTIONDRAFTDISCOUNTCODEAPPLYPAYLOAD {
    public static final String TYPE_NAME = "SubscriptionDraftDiscountCodeApplyPayload";

    public static final String AppliedDiscount = "appliedDiscount";

    public static final String Draft = "draft";

    public static final String UserErrors = "userErrors";
  }

  public static class SUBSCRIPTIONDRAFTDISCOUNTREMOVEPAYLOAD {
    public static final String TYPE_NAME = "SubscriptionDraftDiscountRemovePayload";

    public static final String DiscountRemoved = "discountRemoved";

    public static final String Draft = "draft";

    public static final String UserErrors = "userErrors";
  }

  public static class SUBSCRIPTIONDRAFTDISCOUNTUPDATEPAYLOAD {
    public static final String TYPE_NAME = "SubscriptionDraftDiscountUpdatePayload";

    public static final String DiscountUpdated = "discountUpdated";

    public static final String Draft = "draft";

    public static final String UserErrors = "userErrors";
  }

  public static class SUBSCRIPTIONDRAFTFREESHIPPINGDISCOUNTADDPAYLOAD {
    public static final String TYPE_NAME = "SubscriptionDraftFreeShippingDiscountAddPayload";

    public static final String DiscountAdded = "discountAdded";

    public static final String Draft = "draft";

    public static final String UserErrors = "userErrors";
  }

  public static class SUBSCRIPTIONDRAFTFREESHIPPINGDISCOUNTUPDATEPAYLOAD {
    public static final String TYPE_NAME = "SubscriptionDraftFreeShippingDiscountUpdatePayload";

    public static final String DiscountUpdated = "discountUpdated";

    public static final String Draft = "draft";

    public static final String UserErrors = "userErrors";
  }

  public static class SUBSCRIPTIONDRAFTLINEADDPAYLOAD {
    public static final String TYPE_NAME = "SubscriptionDraftLineAddPayload";

    public static final String Draft = "draft";

    public static final String LineAdded = "lineAdded";

    public static final String UserErrors = "userErrors";
  }

  public static class SUBSCRIPTIONDRAFTLINEREMOVEPAYLOAD {
    public static final String TYPE_NAME = "SubscriptionDraftLineRemovePayload";

    public static final String DiscountsUpdated = "discountsUpdated";

    public static final String Draft = "draft";

    public static final String LineRemoved = "lineRemoved";

    public static final String UserErrors = "userErrors";
  }

  public static class SUBSCRIPTIONDRAFTLINEUPDATEPAYLOAD {
    public static final String TYPE_NAME = "SubscriptionDraftLineUpdatePayload";

    public static final String Draft = "draft";

    public static final String LineUpdated = "lineUpdated";

    public static final String UserErrors = "userErrors";
  }

  public static class SUBSCRIPTIONDRAFTUPDATEPAYLOAD {
    public static final String TYPE_NAME = "SubscriptionDraftUpdatePayload";

    public static final String Draft = "draft";

    public static final String UserErrors = "userErrors";
  }

  public static class SUBSCRIPTIONDRAFTUSERERROR {
    public static final String TYPE_NAME = "SubscriptionDraftUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class SUBSCRIPTIONLINE {
    public static final String TYPE_NAME = "SubscriptionLine";

    public static final String CurrentPrice = "currentPrice";

    public static final String CustomAttributes = "customAttributes";

    public static final String DiscountAllocations = "discountAllocations";

    public static final String Id = "id";

    public static final String LineDiscountedPrice = "lineDiscountedPrice";

    public static final String PricingPolicy = "pricingPolicy";

    public static final String ProductId = "productId";

    public static final String Quantity = "quantity";

    public static final String RequiresShipping = "requiresShipping";

    public static final String SellingPlanId = "sellingPlanId";

    public static final String SellingPlanName = "sellingPlanName";

    public static final String Sku = "sku";

    public static final String Taxable = "taxable";

    public static final String Title = "title";

    public static final String VariantId = "variantId";

    public static final String VariantImage = "variantImage";

    public static final String VariantTitle = "variantTitle";
  }

  public static class SUBSCRIPTIONLINECONNECTION {
    public static final String TYPE_NAME = "SubscriptionLineConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class SUBSCRIPTIONLINEEDGE {
    public static final String TYPE_NAME = "SubscriptionLineEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class SUBSCRIPTIONLOCALDELIVERYOPTION {
    public static final String TYPE_NAME = "SubscriptionLocalDeliveryOption";

    public static final String Code = "code";

    public static final String Description = "description";

    public static final String PhoneRequired = "phoneRequired";

    public static final String PresentmentTitle = "presentmentTitle";

    public static final String Price = "price";

    public static final String Title = "title";
  }

  public static class SUBSCRIPTIONMAILINGADDRESS {
    public static final String TYPE_NAME = "SubscriptionMailingAddress";

    public static final String Address1 = "address1";

    public static final String Address2 = "address2";

    public static final String City = "city";

    public static final String Company = "company";

    public static final String Country = "country";

    public static final String CountryCode = "countryCode";

    public static final String FirstName = "firstName";

    public static final String LastName = "lastName";

    public static final String Name = "name";

    public static final String Phone = "phone";

    public static final String Province = "province";

    public static final String ProvinceCode = "provinceCode";

    public static final String Zip = "zip";
  }

  public static class SUBSCRIPTIONMANUALDISCOUNT {
    public static final String TYPE_NAME = "SubscriptionManualDiscount";

    public static final String EntitledLines = "entitledLines";

    public static final String Id = "id";

    public static final String RecurringCycleLimit = "recurringCycleLimit";

    public static final String RejectionReason = "rejectionReason";

    public static final String TargetType = "targetType";

    public static final String Title = "title";

    public static final String Type = "type";

    public static final String UsageCount = "usageCount";

    public static final String Value = "value";
  }

  public static class SUBSCRIPTIONMANUALDISCOUNTCONNECTION {
    public static final String TYPE_NAME = "SubscriptionManualDiscountConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class SUBSCRIPTIONMANUALDISCOUNTEDGE {
    public static final String TYPE_NAME = "SubscriptionManualDiscountEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class SUBSCRIPTIONPICKUPOPTION {
    public static final String TYPE_NAME = "SubscriptionPickupOption";

    public static final String Code = "code";

    public static final String Description = "description";

    public static final String Location = "location";

    public static final String PhoneRequired = "phoneRequired";

    public static final String PickupTime = "pickupTime";

    public static final String PresentmentTitle = "presentmentTitle";

    public static final String Price = "price";

    public static final String Title = "title";
  }

  public static class SUBSCRIPTIONPRICINGPOLICY {
    public static final String TYPE_NAME = "SubscriptionPricingPolicy";

    public static final String BasePrice = "basePrice";

    public static final String CycleDiscounts = "cycleDiscounts";
  }

  public static class SUBSCRIPTIONSHIPPINGOPTION {
    public static final String TYPE_NAME = "SubscriptionShippingOption";

    public static final String CarrierService = "carrierService";

    public static final String Code = "code";

    public static final String Description = "description";

    public static final String PhoneRequired = "phoneRequired";

    public static final String PresentmentTitle = "presentmentTitle";

    public static final String Price = "price";

    public static final String Title = "title";
  }

  public static class SUBSCRIPTIONSHIPPINGOPTIONRESULTFAILURE {
    public static final String TYPE_NAME = "SubscriptionShippingOptionResultFailure";

    public static final String Message = "message";
  }

  public static class SUBSCRIPTIONSHIPPINGOPTIONRESULTSUCCESS {
    public static final String TYPE_NAME = "SubscriptionShippingOptionResultSuccess";

    public static final String ShippingOptions = "shippingOptions";
  }

  public static class SUGGESTEDORDERTRANSACTION {
    public static final String TYPE_NAME = "SuggestedOrderTransaction";

    public static final String AccountNumber = "accountNumber";

    public static final String Amount = "amount";

    public static final String AmountSet = "amountSet";

    public static final String FormattedGateway = "formattedGateway";

    public static final String Gateway = "gateway";

    public static final String Kind = "kind";

    public static final String MaximumRefundable = "maximumRefundable";

    public static final String MaximumRefundableSet = "maximumRefundableSet";

    public static final String ParentTransaction = "parentTransaction";

    public static final String PaymentDetails = "paymentDetails";
  }

  public static class SUGGESTEDREFUND {
    public static final String TYPE_NAME = "SuggestedRefund";

    public static final String Amount = "amount";

    public static final String AmountSet = "amountSet";

    public static final String DiscountedSubtotalSet = "discountedSubtotalSet";

    public static final String MaximumRefundable = "maximumRefundable";

    public static final String MaximumRefundableSet = "maximumRefundableSet";

    public static final String RefundDuties = "refundDuties";

    public static final String RefundLineItems = "refundLineItems";

    public static final String Shipping = "shipping";

    public static final String Subtotal = "subtotal";

    public static final String SubtotalSet = "subtotalSet";

    public static final String SuggestedTransactions = "suggestedTransactions";

    public static final String TotalCartDiscountAmountSet = "totalCartDiscountAmountSet";

    public static final String TotalDutiesSet = "totalDutiesSet";

    public static final String TotalTaxSet = "totalTaxSet";

    public static final String TotalTaxes = "totalTaxes";
  }

  public static class SUGGESTEDRETURNREFUND {
    public static final String TYPE_NAME = "SuggestedReturnRefund";

    public static final String Amount = "amount";

    public static final String DiscountedSubtotal = "discountedSubtotal";

    public static final String MaximumRefundable = "maximumRefundable";

    public static final String RefundDuties = "refundDuties";

    public static final String Shipping = "shipping";

    public static final String Subtotal = "subtotal";

    public static final String SuggestedTransactions = "suggestedTransactions";

    public static final String TotalCartDiscountAmount = "totalCartDiscountAmount";

    public static final String TotalDuties = "totalDuties";

    public static final String TotalTax = "totalTax";
  }

  public static class TABLEDATA {
    public static final String TYPE_NAME = "TableData";

    public static final String Columns = "columns";

    public static final String RowData = "rowData";

    public static final String UnformattedData = "unformattedData";
  }

  public static class TABLEDATACOLUMN {
    public static final String TYPE_NAME = "TableDataColumn";

    public static final String ComparedTo = "comparedTo";

    public static final String DataType = "dataType";

    public static final String DisplayName = "displayName";

    public static final String Name = "name";
  }

  public static class TABLERESPONSE {
    public static final String TYPE_NAME = "TableResponse";

    public static final String ParseErrors = "parseErrors";

    public static final String TableData = "tableData";
  }

  public static class TAGSADDPAYLOAD {
    public static final String TYPE_NAME = "TagsAddPayload";

    public static final String Node = "node";

    public static final String UserErrors = "userErrors";
  }

  public static class TAGSREMOVEPAYLOAD {
    public static final String TYPE_NAME = "TagsRemovePayload";

    public static final String Node = "node";

    public static final String UserErrors = "userErrors";
  }

  public static class TAXAPPCONFIGURATION {
    public static final String TYPE_NAME = "TaxAppConfiguration";

    public static final String State = "state";
  }

  public static class TAXAPPCONFIGUREPAYLOAD {
    public static final String TYPE_NAME = "TaxAppConfigurePayload";

    public static final String TaxAppConfiguration = "taxAppConfiguration";

    public static final String UserErrors = "userErrors";
  }

  public static class TAXAPPCONFIGUREUSERERROR {
    public static final String TYPE_NAME = "TaxAppConfigureUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class TAXLINE {
    public static final String TYPE_NAME = "TaxLine";

    public static final String ChannelLiable = "channelLiable";

    public static final String Price = "price";

    public static final String PriceSet = "priceSet";

    public static final String Rate = "rate";

    public static final String RatePercentage = "ratePercentage";

    public static final String Title = "title";
  }

  public static class TENDERTRANSACTION {
    public static final String TYPE_NAME = "TenderTransaction";

    public static final String Amount = "amount";

    public static final String Id = "id";

    public static final String PaymentMethod = "paymentMethod";

    public static final String ProcessedAt = "processedAt";

    public static final String RemoteReference = "remoteReference";

    public static final String Test = "test";

    public static final String TransactionDetails = "transactionDetails";

    public static final String User = "user";
  }

  public static class TENDERTRANSACTIONCONNECTION {
    public static final String TYPE_NAME = "TenderTransactionConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class TENDERTRANSACTIONCREDITCARDDETAILS {
    public static final String TYPE_NAME = "TenderTransactionCreditCardDetails";

    public static final String CreditCardCompany = "creditCardCompany";

    public static final String CreditCardNumber = "creditCardNumber";
  }

  public static class TENDERTRANSACTIONEDGE {
    public static final String TYPE_NAME = "TenderTransactionEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class TIPSALE {
    public static final String TYPE_NAME = "TipSale";

    public static final String ActionType = "actionType";

    public static final String Id = "id";

    public static final String LineItem = "lineItem";

    public static final String LineType = "lineType";

    public static final String Quantity = "quantity";

    public static final String Taxes = "taxes";

    public static final String TotalAmount = "totalAmount";

    public static final String TotalDiscountAmountAfterTaxes = "totalDiscountAmountAfterTaxes";

    public static final String TotalDiscountAmountBeforeTaxes = "totalDiscountAmountBeforeTaxes";

    public static final String TotalTaxAmount = "totalTaxAmount";
  }

  public static class TRANSACTIONFEE {
    public static final String TYPE_NAME = "TransactionFee";

    public static final String Amount = "amount";

    public static final String FlatFee = "flatFee";

    public static final String FlatFeeName = "flatFeeName";

    public static final String Id = "id";

    public static final String Rate = "rate";

    public static final String RateName = "rateName";

    public static final String TaxAmount = "taxAmount";

    public static final String Type = "type";
  }

  public static class TRANSLATABLECONTENT {
    public static final String TYPE_NAME = "TranslatableContent";

    public static final String Digest = "digest";

    public static final String Key = "key";

    public static final String Locale = "locale";

    public static final String Type = "type";

    public static final String Value = "value";
  }

  public static class TRANSLATABLERESOURCE {
    public static final String TYPE_NAME = "TranslatableResource";

    public static final String ResourceId = "resourceId";

    public static final String TranslatableContent = "translatableContent";

    public static final String Translations = "translations";

    public static class TRANSLATIONS_INPUT_ARGUMENT {
      public static final String Locale = "locale";

      public static final String Outdated = "outdated";

      public static final String MarketId = "marketId";
    }
  }

  public static class TRANSLATABLERESOURCECONNECTION {
    public static final String TYPE_NAME = "TranslatableResourceConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class TRANSLATABLERESOURCEEDGE {
    public static final String TYPE_NAME = "TranslatableResourceEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class TRANSLATION {
    public static final String TYPE_NAME = "Translation";

    public static final String Key = "key";

    public static final String Locale = "locale";

    public static final String Market = "market";

    public static final String Outdated = "outdated";

    public static final String UpdatedAt = "updatedAt";

    public static final String Value = "value";
  }

  public static class TRANSLATIONSREGISTERPAYLOAD {
    public static final String TYPE_NAME = "TranslationsRegisterPayload";

    public static final String Translations = "translations";

    public static final String UserErrors = "userErrors";
  }

  public static class TRANSLATIONSREMOVEPAYLOAD {
    public static final String TYPE_NAME = "TranslationsRemovePayload";

    public static final String Translations = "translations";

    public static final String UserErrors = "userErrors";
  }

  public static class TRANSLATIONUSERERROR {
    public static final String TYPE_NAME = "TranslationUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class TYPEDATTRIBUTE {
    public static final String TYPE_NAME = "TypedAttribute";

    public static final String Key = "key";

    public static final String Value = "value";
  }

  public static class UNKNOWNSALE {
    public static final String TYPE_NAME = "UnknownSale";

    public static final String ActionType = "actionType";

    public static final String Id = "id";

    public static final String LineType = "lineType";

    public static final String Quantity = "quantity";

    public static final String Taxes = "taxes";

    public static final String TotalAmount = "totalAmount";

    public static final String TotalDiscountAmountAfterTaxes = "totalDiscountAmountAfterTaxes";

    public static final String TotalDiscountAmountBeforeTaxes = "totalDiscountAmountBeforeTaxes";

    public static final String TotalTaxAmount = "totalTaxAmount";
  }

  public static class URLREDIRECT {
    public static final String TYPE_NAME = "UrlRedirect";

    public static final String Id = "id";

    public static final String Path = "path";

    public static final String Target = "target";
  }

  public static class URLREDIRECTBULKDELETEALLPAYLOAD {
    public static final String TYPE_NAME = "UrlRedirectBulkDeleteAllPayload";

    public static final String Job = "job";

    public static final String UserErrors = "userErrors";
  }

  public static class URLREDIRECTBULKDELETEBYIDSPAYLOAD {
    public static final String TYPE_NAME = "UrlRedirectBulkDeleteByIdsPayload";

    public static final String Job = "job";

    public static final String UserErrors = "userErrors";
  }

  public static class URLREDIRECTBULKDELETEBYIDSUSERERROR {
    public static final String TYPE_NAME = "UrlRedirectBulkDeleteByIdsUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class URLREDIRECTBULKDELETEBYSAVEDSEARCHPAYLOAD {
    public static final String TYPE_NAME = "UrlRedirectBulkDeleteBySavedSearchPayload";

    public static final String Job = "job";

    public static final String UserErrors = "userErrors";
  }

  public static class URLREDIRECTBULKDELETEBYSAVEDSEARCHUSERERROR {
    public static final String TYPE_NAME = "UrlRedirectBulkDeleteBySavedSearchUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class URLREDIRECTBULKDELETEBYSEARCHPAYLOAD {
    public static final String TYPE_NAME = "UrlRedirectBulkDeleteBySearchPayload";

    public static final String Job = "job";

    public static final String UserErrors = "userErrors";
  }

  public static class URLREDIRECTBULKDELETEBYSEARCHUSERERROR {
    public static final String TYPE_NAME = "UrlRedirectBulkDeleteBySearchUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class URLREDIRECTCONNECTION {
    public static final String TYPE_NAME = "UrlRedirectConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class URLREDIRECTCREATEPAYLOAD {
    public static final String TYPE_NAME = "UrlRedirectCreatePayload";

    public static final String UrlRedirect = "urlRedirect";

    public static final String UserErrors = "userErrors";
  }

  public static class URLREDIRECTDELETEPAYLOAD {
    public static final String TYPE_NAME = "UrlRedirectDeletePayload";

    public static final String DeletedUrlRedirectId = "deletedUrlRedirectId";

    public static final String UserErrors = "userErrors";
  }

  public static class URLREDIRECTEDGE {
    public static final String TYPE_NAME = "UrlRedirectEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class URLREDIRECTIMPORT {
    public static final String TYPE_NAME = "UrlRedirectImport";

    public static final String Count = "count";

    public static final String CreatedCount = "createdCount";

    public static final String FailedCount = "failedCount";

    public static final String Finished = "finished";

    public static final String FinishedAt = "finishedAt";

    public static final String Id = "id";

    public static final String PreviewRedirects = "previewRedirects";

    public static final String UpdatedCount = "updatedCount";
  }

  public static class URLREDIRECTIMPORTCREATEPAYLOAD {
    public static final String TYPE_NAME = "UrlRedirectImportCreatePayload";

    public static final String UrlRedirectImport = "urlRedirectImport";

    public static final String UserErrors = "userErrors";
  }

  public static class URLREDIRECTIMPORTPREVIEW {
    public static final String TYPE_NAME = "UrlRedirectImportPreview";

    public static final String Path = "path";

    public static final String Target = "target";
  }

  public static class URLREDIRECTIMPORTSUBMITPAYLOAD {
    public static final String TYPE_NAME = "UrlRedirectImportSubmitPayload";

    public static final String Job = "job";

    public static final String UserErrors = "userErrors";
  }

  public static class URLREDIRECTIMPORTUSERERROR {
    public static final String TYPE_NAME = "UrlRedirectImportUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class URLREDIRECTUPDATEPAYLOAD {
    public static final String TYPE_NAME = "UrlRedirectUpdatePayload";

    public static final String UrlRedirect = "urlRedirect";

    public static final String UserErrors = "userErrors";
  }

  public static class URLREDIRECTUSERERROR {
    public static final String TYPE_NAME = "UrlRedirectUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class USERERROR {
    public static final String TYPE_NAME = "UserError";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class UTMPARAMETERS {
    public static final String TYPE_NAME = "UTMParameters";

    public static final String Campaign = "campaign";

    public static final String Content = "content";

    public static final String Medium = "medium";

    public static final String Source = "source";

    public static final String Term = "term";
  }

  public static class VALIDATION {
    public static final String TYPE_NAME = "Validation";

    public static final String BlockOnFailure = "blockOnFailure";

    public static final String Enabled = "enabled";

    public static final String ErrorHistory = "errorHistory";

    public static final String Id = "id";

    public static final String Metafield = "metafield";

    public static final String MetafieldDefinitions = "metafieldDefinitions";

    public static final String Metafields = "metafields";

    public static final String PrivateMetafield = "privateMetafield";

    public static final String PrivateMetafields = "privateMetafields";

    public static final String ShopifyFunction = "shopifyFunction";

    public static final String Title = "title";

    public static class METAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class METAFIELDDEFINITIONS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String PinnedStatus = "pinnedStatus";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";

      public static final String SortKey = "sortKey";

      public static final String Query = "query";
    }

    public static class METAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Keys = "keys";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }

    public static class PRIVATEMETAFIELD_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String Key = "key";
    }

    public static class PRIVATEMETAFIELDS_INPUT_ARGUMENT {
      public static final String Namespace = "namespace";

      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";

      public static final String Reverse = "reverse";
    }
  }

  public static class VALIDATIONCONNECTION {
    public static final String TYPE_NAME = "ValidationConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class VALIDATIONCREATEPAYLOAD {
    public static final String TYPE_NAME = "ValidationCreatePayload";

    public static final String UserErrors = "userErrors";

    public static final String Validation = "validation";
  }

  public static class VALIDATIONDELETEPAYLOAD {
    public static final String TYPE_NAME = "ValidationDeletePayload";

    public static final String DeletedId = "deletedId";

    public static final String UserErrors = "userErrors";
  }

  public static class VALIDATIONEDGE {
    public static final String TYPE_NAME = "ValidationEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class VALIDATIONUPDATEPAYLOAD {
    public static final String TYPE_NAME = "ValidationUpdatePayload";

    public static final String UserErrors = "userErrors";

    public static final String Validation = "validation";
  }

  public static class VALIDATIONUSERERROR {
    public static final String TYPE_NAME = "ValidationUserError";

    public static final String Code = "code";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class VAULTCREDITCARD {
    public static final String TYPE_NAME = "VaultCreditCard";

    public static final String BillingAddress = "billingAddress";

    public static final String Brand = "brand";

    public static final String Expired = "expired";

    public static final String ExpiryMonth = "expiryMonth";

    public static final String ExpiryYear = "expiryYear";

    public static final String LastDigits = "lastDigits";

    public static final String Name = "name";
  }

  public static class VAULTPAYPALBILLINGAGREEMENT {
    public static final String TYPE_NAME = "VaultPaypalBillingAgreement";

    public static final String Inactive = "inactive";

    public static final String Name = "name";

    public static final String PaypalAccountEmail = "paypalAccountEmail";
  }

  public static class VECTOR3 {
    public static final String TYPE_NAME = "Vector3";

    public static final String X = "x";

    public static final String Y = "y";

    public static final String Z = "z";
  }

  public static class VIDEO {
    public static final String TYPE_NAME = "Video";

    public static final String Alt = "alt";

    public static final String CreatedAt = "createdAt";

    public static final String Duration = "duration";

    public static final String FileErrors = "fileErrors";

    public static final String FileStatus = "fileStatus";

    public static final String Filename = "filename";

    public static final String Id = "id";

    public static final String MediaContentType = "mediaContentType";

    public static final String MediaErrors = "mediaErrors";

    public static final String MediaWarnings = "mediaWarnings";

    public static final String OriginalSource = "originalSource";

    public static final String Preview = "preview";

    public static final String Sources = "sources";

    public static final String Status = "status";

    public static final String UpdatedAt = "updatedAt";
  }

  public static class VIDEOSOURCE {
    public static final String TYPE_NAME = "VideoSource";

    public static final String FileSize = "fileSize";

    public static final String Format = "format";

    public static final String Height = "height";

    public static final String MimeType = "mimeType";

    public static final String Url = "url";

    public static final String Width = "width";
  }

  public static class WEBHOOKEVENTBRIDGEENDPOINT {
    public static final String TYPE_NAME = "WebhookEventBridgeEndpoint";

    public static final String Arn = "arn";
  }

  public static class WEBHOOKHTTPENDPOINT {
    public static final String TYPE_NAME = "WebhookHttpEndpoint";

    public static final String CallbackUrl = "callbackUrl";
  }

  public static class WEBHOOKPUBSUBENDPOINT {
    public static final String TYPE_NAME = "WebhookPubSubEndpoint";

    public static final String PubSubProject = "pubSubProject";

    public static final String PubSubTopic = "pubSubTopic";
  }

  public static class WEBHOOKSUBSCRIPTION {
    public static final String TYPE_NAME = "WebhookSubscription";

    public static final String ApiVersion = "apiVersion";

    public static final String CallbackUrl = "callbackUrl";

    public static final String CreatedAt = "createdAt";

    public static final String Endpoint = "endpoint";

    public static final String Format = "format";

    public static final String Id = "id";

    public static final String IncludeFields = "includeFields";

    public static final String LegacyResourceId = "legacyResourceId";

    public static final String MetafieldNamespaces = "metafieldNamespaces";

    public static final String PrivateMetafieldNamespaces = "privateMetafieldNamespaces";

    public static final String SubTopic = "subTopic";

    public static final String Topic = "topic";

    public static final String UpdatedAt = "updatedAt";
  }

  public static class WEBHOOKSUBSCRIPTIONCONNECTION {
    public static final String TYPE_NAME = "WebhookSubscriptionConnection";

    public static final String Edges = "edges";

    public static final String Nodes = "nodes";

    public static final String PageInfo = "pageInfo";
  }

  public static class WEBHOOKSUBSCRIPTIONCREATEPAYLOAD {
    public static final String TYPE_NAME = "WebhookSubscriptionCreatePayload";

    public static final String UserErrors = "userErrors";

    public static final String WebhookSubscription = "webhookSubscription";
  }

  public static class WEBHOOKSUBSCRIPTIONDELETEPAYLOAD {
    public static final String TYPE_NAME = "WebhookSubscriptionDeletePayload";

    public static final String DeletedWebhookSubscriptionId = "deletedWebhookSubscriptionId";

    public static final String UserErrors = "userErrors";
  }

  public static class WEBHOOKSUBSCRIPTIONEDGE {
    public static final String TYPE_NAME = "WebhookSubscriptionEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class WEBHOOKSUBSCRIPTIONUPDATEPAYLOAD {
    public static final String TYPE_NAME = "WebhookSubscriptionUpdatePayload";

    public static final String UserErrors = "userErrors";

    public static final String WebhookSubscription = "webhookSubscription";
  }

  public static class WEBPIXEL {
    public static final String TYPE_NAME = "WebPixel";

    public static final String Id = "id";

    public static final String Settings = "settings";
  }

  public static class WEBPIXELCREATEPAYLOAD {
    public static final String TYPE_NAME = "WebPixelCreatePayload";

    public static final String UserErrors = "userErrors";

    public static final String WebPixel = "webPixel";
  }

  public static class WEBPIXELDELETEPAYLOAD {
    public static final String TYPE_NAME = "WebPixelDeletePayload";

    public static final String DeletedWebPixelId = "deletedWebPixelId";

    public static final String UserErrors = "userErrors";
  }

  public static class WEBPIXELUPDATEPAYLOAD {
    public static final String TYPE_NAME = "WebPixelUpdatePayload";

    public static final String UserErrors = "userErrors";

    public static final String WebPixel = "webPixel";
  }

  public static class WEIGHT {
    public static final String TYPE_NAME = "Weight";

    public static final String Unit = "unit";

    public static final String Value = "value";
  }

  public static class APPPLANINPUT {
    public static final String TYPE_NAME = "AppPlanInput";

    public static final String AppUsagePricingDetails = "appUsagePricingDetails";

    public static final String AppRecurringPricingDetails = "appRecurringPricingDetails";
  }

  public static class APPRECURRINGPRICINGINPUT {
    public static final String TYPE_NAME = "AppRecurringPricingInput";

    public static final String Interval = "interval";

    public static final String Price = "price";

    public static final String Discount = "discount";
  }

  public static class APPSUBSCRIPTIONDISCOUNTINPUT {
    public static final String TYPE_NAME = "AppSubscriptionDiscountInput";

    public static final String Value = "value";

    public static final String DurationLimitInIntervals = "durationLimitInIntervals";
  }

  public static class APPSUBSCRIPTIONDISCOUNTVALUEINPUT {
    public static final String TYPE_NAME = "AppSubscriptionDiscountValueInput";

    public static final String Percentage = "percentage";

    public static final String Amount = "amount";
  }

  public static class APPSUBSCRIPTIONLINEITEMINPUT {
    public static final String TYPE_NAME = "AppSubscriptionLineItemInput";

    public static final String Plan = "plan";
  }

  public static class APPUSAGEPRICINGINPUT {
    public static final String TYPE_NAME = "AppUsagePricingInput";

    public static final String CappedAmount = "cappedAmount";

    public static final String Terms = "terms";
  }

  public static class ATTRIBUTEINPUT {
    public static final String TYPE_NAME = "AttributeInput";

    public static final String Key = "key";

    public static final String Value = "value";
  }

  public static class BUYEREXPERIENCECONFIGURATIONINPUT {
    public static final String TYPE_NAME = "BuyerExperienceConfigurationInput";

    public static final String CheckoutToDraft = "checkoutToDraft";

    public static final String PaymentTermsTemplateId = "paymentTermsTemplateId";

    public static final String EditableShippingAddress = "editableShippingAddress";
  }

  public static class CATALOGCONTEXTINPUT {
    public static final String TYPE_NAME = "CatalogContextInput";

    public static final String CompanyLocationIds = "companyLocationIds";
  }

  public static class CATALOGCREATEINPUT {
    public static final String TYPE_NAME = "CatalogCreateInput";

    public static final String Title = "title";

    public static final String Status = "status";

    public static final String Context = "context";

    public static final String PriceListId = "priceListId";

    public static final String PublicationId = "publicationId";
  }

  public static class CATALOGUPDATEINPUT {
    public static final String TYPE_NAME = "CatalogUpdateInput";

    public static final String Title = "title";

    public static final String Status = "status";

    public static final String Context = "context";

    public static final String PriceListId = "priceListId";

    public static final String PublicationId = "publicationId";
  }

  public static class CHECKOUTBRANDINGBUTTONCOLORROLESINPUT {
    public static final String TYPE_NAME = "CheckoutBrandingButtonColorRolesInput";

    public static final String Background = "background";

    public static final String Text = "text";

    public static final String Border = "border";

    public static final String Icon = "icon";

    public static final String Accent = "accent";

    public static final String Decorative = "decorative";

    public static final String Hover = "hover";
  }

  public static class CHECKOUTBRANDINGBUTTONINPUT {
    public static final String TYPE_NAME = "CheckoutBrandingButtonInput";

    public static final String Background = "background";

    public static final String Border = "border";

    public static final String CornerRadius = "cornerRadius";

    public static final String BlockPadding = "blockPadding";

    public static final String InlinePadding = "inlinePadding";

    public static final String Typography = "typography";
  }

  public static class CHECKOUTBRANDINGCHECKBOXINPUT {
    public static final String TYPE_NAME = "CheckoutBrandingCheckboxInput";

    public static final String CornerRadius = "cornerRadius";
  }

  public static class CHECKOUTBRANDINGCHOICELISTGROUPINPUT {
    public static final String TYPE_NAME = "CheckoutBrandingChoiceListGroupInput";

    public static final String Spacing = "spacing";
  }

  public static class CHECKOUTBRANDINGCHOICELISTINPUT {
    public static final String TYPE_NAME = "CheckoutBrandingChoiceListInput";

    public static final String Group = "group";
  }

  public static class CHECKOUTBRANDINGCOLORGLOBALINPUT {
    public static final String TYPE_NAME = "CheckoutBrandingColorGlobalInput";

    public static final String Info = "info";

    public static final String Success = "success";

    public static final String Warning = "warning";

    public static final String Critical = "critical";

    public static final String Brand = "brand";

    public static final String Accent = "accent";

    public static final String Decorative = "decorative";
  }

  public static class CHECKOUTBRANDINGCOLORROLESINPUT {
    public static final String TYPE_NAME = "CheckoutBrandingColorRolesInput";

    public static final String Background = "background";

    public static final String Text = "text";

    public static final String Border = "border";

    public static final String Icon = "icon";

    public static final String Accent = "accent";

    public static final String Decorative = "decorative";
  }

  public static class CHECKOUTBRANDINGCOLORSCHEMEINPUT {
    public static final String TYPE_NAME = "CheckoutBrandingColorSchemeInput";

    public static final String Base = "base";

    public static final String Control = "control";

    public static final String PrimaryButton = "primaryButton";

    public static final String SecondaryButton = "secondaryButton";
  }

  public static class CHECKOUTBRANDINGCOLORSCHEMESINPUT {
    public static final String TYPE_NAME = "CheckoutBrandingColorSchemesInput";

    public static final String Scheme1 = "scheme1";

    public static final String Scheme2 = "scheme2";
  }

  public static class CHECKOUTBRANDINGCOLORSINPUT {
    public static final String TYPE_NAME = "CheckoutBrandingColorsInput";

    public static final String Global = "global";

    public static final String Schemes = "schemes";
  }

  public static class CHECKOUTBRANDINGCONTROLCOLORROLESINPUT {
    public static final String TYPE_NAME = "CheckoutBrandingControlColorRolesInput";

    public static final String Background = "background";

    public static final String Text = "text";

    public static final String Border = "border";

    public static final String Icon = "icon";

    public static final String Accent = "accent";

    public static final String Decorative = "decorative";

    public static final String Selected = "selected";
  }

  public static class CHECKOUTBRANDINGCONTROLINPUT {
    public static final String TYPE_NAME = "CheckoutBrandingControlInput";

    public static final String Color = "color";

    public static final String CornerRadius = "cornerRadius";

    public static final String Border = "border";

    public static final String LabelPosition = "labelPosition";
  }

  public static class CHECKOUTBRANDINGCORNERRADIUSVARIABLESINPUT {
    public static final String TYPE_NAME = "CheckoutBrandingCornerRadiusVariablesInput";

    public static final String Small = "small";

    public static final String Base = "base";

    public static final String Large = "large";
  }

  public static class CHECKOUTBRANDINGCUSTOMFONTGROUPINPUT {
    public static final String TYPE_NAME = "CheckoutBrandingCustomFontGroupInput";

    public static final String Base = "base";

    public static final String Bold = "bold";

    public static final String LoadingStrategy = "loadingStrategy";
  }

  public static class CHECKOUTBRANDINGCUSTOMFONTINPUT {
    public static final String TYPE_NAME = "CheckoutBrandingCustomFontInput";

    public static final String Weight = "weight";

    public static final String GenericFileId = "genericFileId";
  }

  public static class CHECKOUTBRANDINGCUSTOMIZATIONSINPUT {
    public static final String TYPE_NAME = "CheckoutBrandingCustomizationsInput";

    public static final String Global = "global";

    public static final String Header = "header";

    public static final String HeadingLevel1 = "headingLevel1";

    public static final String HeadingLevel2 = "headingLevel2";

    public static final String HeadingLevel3 = "headingLevel3";

    public static final String Main = "main";

    public static final String OrderSummary = "orderSummary";

    public static final String Control = "control";

    public static final String TextField = "textField";

    public static final String Checkbox = "checkbox";

    public static final String Select = "select";

    public static final String PrimaryButton = "primaryButton";

    public static final String SecondaryButton = "secondaryButton";

    public static final String Favicon = "favicon";

    public static final String ChoiceList = "choiceList";

    public static final String MerchandiseThumbnail = "merchandiseThumbnail";
  }

  public static class CHECKOUTBRANDINGDESIGNSYSTEMINPUT {
    public static final String TYPE_NAME = "CheckoutBrandingDesignSystemInput";

    public static final String Colors = "colors";

    public static final String Typography = "typography";

    public static final String CornerRadius = "cornerRadius";
  }

  public static class CHECKOUTBRANDINGFONTGROUPINPUT {
    public static final String TYPE_NAME = "CheckoutBrandingFontGroupInput";

    public static final String ShopifyFontGroup = "shopifyFontGroup";

    public static final String CustomFontGroup = "customFontGroup";
  }

  public static class CHECKOUTBRANDINGFONTSIZEINPUT {
    public static final String TYPE_NAME = "CheckoutBrandingFontSizeInput";

    public static final String Base = "base";

    public static final String Ratio = "ratio";
  }

  public static class CHECKOUTBRANDINGGLOBALINPUT {
    public static final String TYPE_NAME = "CheckoutBrandingGlobalInput";

    public static final String CornerRadius = "cornerRadius";

    public static final String Typography = "typography";
  }

  public static class CHECKOUTBRANDINGHEADERINPUT {
    public static final String TYPE_NAME = "CheckoutBrandingHeaderInput";

    public static final String Alignment = "alignment";

    public static final String Position = "position";

    public static final String Logo = "logo";

    public static final String Banner = "banner";
  }

  public static class CHECKOUTBRANDINGHEADINGLEVELINPUT {
    public static final String TYPE_NAME = "CheckoutBrandingHeadingLevelInput";

    public static final String Typography = "typography";
  }

  public static class CHECKOUTBRANDINGIMAGEINPUT {
    public static final String TYPE_NAME = "CheckoutBrandingImageInput";

    public static final String MediaImageId = "mediaImageId";
  }

  public static class CHECKOUTBRANDINGINPUT {
    public static final String TYPE_NAME = "CheckoutBrandingInput";

    public static final String DesignSystem = "designSystem";

    public static final String Customizations = "customizations";
  }

  public static class CHECKOUTBRANDINGLOGOINPUT {
    public static final String TYPE_NAME = "CheckoutBrandingLogoInput";

    public static final String Image = "image";

    public static final String MaxWidth = "maxWidth";
  }

  public static class CHECKOUTBRANDINGMAININPUT {
    public static final String TYPE_NAME = "CheckoutBrandingMainInput";

    public static final String ColorScheme = "colorScheme";

    public static final String BackgroundImage = "backgroundImage";
  }

  public static class CHECKOUTBRANDINGMERCHANDISETHUMBNAILINPUT {
    public static final String TYPE_NAME = "CheckoutBrandingMerchandiseThumbnailInput";

    public static final String Border = "border";

    public static final String CornerRadius = "cornerRadius";
  }

  public static class CHECKOUTBRANDINGORDERSUMMARYINPUT {
    public static final String TYPE_NAME = "CheckoutBrandingOrderSummaryInput";

    public static final String ColorScheme = "colorScheme";

    public static final String BackgroundImage = "backgroundImage";
  }

  public static class CHECKOUTBRANDINGSELECTINPUT {
    public static final String TYPE_NAME = "CheckoutBrandingSelectInput";

    public static final String Border = "border";

    public static final String Typography = "typography";
  }

  public static class CHECKOUTBRANDINGSHOPIFYFONTGROUPINPUT {
    public static final String TYPE_NAME = "CheckoutBrandingShopifyFontGroupInput";

    public static final String Name = "name";

    public static final String BaseWeight = "baseWeight";

    public static final String BoldWeight = "boldWeight";

    public static final String LoadingStrategy = "loadingStrategy";
  }

  public static class CHECKOUTBRANDINGTEXTFIELDINPUT {
    public static final String TYPE_NAME = "CheckoutBrandingTextFieldInput";

    public static final String Border = "border";

    public static final String Typography = "typography";
  }

  public static class CHECKOUTBRANDINGTYPOGRAPHYINPUT {
    public static final String TYPE_NAME = "CheckoutBrandingTypographyInput";

    public static final String Size = "size";

    public static final String Primary = "primary";

    public static final String Secondary = "secondary";
  }

  public static class CHECKOUTBRANDINGTYPOGRAPHYSTYLEGLOBALINPUT {
    public static final String TYPE_NAME = "CheckoutBrandingTypographyStyleGlobalInput";

    public static final String LetterCase = "letterCase";

    public static final String Kerning = "kerning";
  }

  public static class CHECKOUTBRANDINGTYPOGRAPHYSTYLEINPUT {
    public static final String TYPE_NAME = "CheckoutBrandingTypographyStyleInput";

    public static final String Font = "font";

    public static final String Size = "size";

    public static final String Weight = "weight";

    public static final String LetterCase = "letterCase";

    public static final String Kerning = "kerning";
  }

  public static class COLLECTIONDELETEINPUT {
    public static final String TYPE_NAME = "CollectionDeleteInput";

    public static final String Id = "id";
  }

  public static class COLLECTIONINPUT {
    public static final String TYPE_NAME = "CollectionInput";

    public static final String DescriptionHtml = "descriptionHtml";

    public static final String Handle = "handle";

    public static final String Id = "id";

    public static final String Image = "image";

    public static final String Products = "products";

    public static final String RuleSet = "ruleSet";

    public static final String TemplateSuffix = "templateSuffix";

    public static final String SortOrder = "sortOrder";

    public static final String Title = "title";

    public static final String Metafields = "metafields";

    public static final String Seo = "seo";

    public static final String RedirectNewHandle = "redirectNewHandle";
  }

  public static class COLLECTIONPUBLICATIONINPUT {
    public static final String TYPE_NAME = "CollectionPublicationInput";

    public static final String PublicationId = "publicationId";
  }

  public static class COLLECTIONPUBLISHINPUT {
    public static final String TYPE_NAME = "CollectionPublishInput";

    public static final String Id = "id";

    public static final String CollectionPublications = "collectionPublications";
  }

  public static class COLLECTIONRULEINPUT {
    public static final String TYPE_NAME = "CollectionRuleInput";

    public static final String Column = "column";

    public static final String Relation = "relation";

    public static final String Condition = "condition";

    public static final String ConditionObjectId = "conditionObjectId";
  }

  public static class COLLECTIONRULESETINPUT {
    public static final String TYPE_NAME = "CollectionRuleSetInput";

    public static final String AppliedDisjunctively = "appliedDisjunctively";

    public static final String Rules = "rules";
  }

  public static class COLLECTIONUNPUBLISHINPUT {
    public static final String TYPE_NAME = "CollectionUnpublishInput";

    public static final String Id = "id";

    public static final String CollectionPublications = "collectionPublications";
  }

  public static class COMPANYADDRESSINPUT {
    public static final String TYPE_NAME = "CompanyAddressInput";

    public static final String Address1 = "address1";

    public static final String Address2 = "address2";

    public static final String City = "city";

    public static final String Zip = "zip";

    public static final String Recipient = "recipient";

    public static final String FirstName = "firstName";

    public static final String LastName = "lastName";

    public static final String Phone = "phone";

    public static final String ZoneCode = "zoneCode";

    public static final String CountryCode = "countryCode";
  }

  public static class COMPANYCONTACTINPUT {
    public static final String TYPE_NAME = "CompanyContactInput";

    public static final String FirstName = "firstName";

    public static final String LastName = "lastName";

    public static final String Email = "email";

    public static final String Title = "title";

    public static final String Locale = "locale";

    public static final String Phone = "phone";
  }

  public static class COMPANYCONTACTROLEASSIGN {
    public static final String TYPE_NAME = "CompanyContactRoleAssign";

    public static final String CompanyContactRoleId = "companyContactRoleId";

    public static final String CompanyLocationId = "companyLocationId";
  }

  public static class COMPANYCREATEINPUT {
    public static final String TYPE_NAME = "CompanyCreateInput";

    public static final String Company = "company";

    public static final String CompanyContact = "companyContact";

    public static final String CompanyLocation = "companyLocation";
  }

  public static class COMPANYINPUT {
    public static final String TYPE_NAME = "CompanyInput";

    public static final String Name = "name";

    public static final String Note = "note";

    public static final String ExternalId = "externalId";

    public static final String CustomerSince = "customerSince";
  }

  public static class COMPANYLOCATIONINPUT {
    public static final String TYPE_NAME = "CompanyLocationInput";

    public static final String Name = "name";

    public static final String Phone = "phone";

    public static final String Locale = "locale";

    public static final String ExternalId = "externalId";

    public static final String Note = "note";

    public static final String BuyerExperienceConfiguration = "buyerExperienceConfiguration";

    public static final String BillingAddress = "billingAddress";

    public static final String ShippingAddress = "shippingAddress";

    public static final String BillingSameAsShipping = "billingSameAsShipping";

    public static final String TaxRegistrationId = "taxRegistrationId";

    public static final String TaxExemptions = "taxExemptions";
  }

  public static class COMPANYLOCATIONROLEASSIGN {
    public static final String TYPE_NAME = "CompanyLocationRoleAssign";

    public static final String CompanyContactRoleId = "companyContactRoleId";

    public static final String CompanyContactId = "companyContactId";
  }

  public static class COMPANYLOCATIONUPDATEINPUT {
    public static final String TYPE_NAME = "CompanyLocationUpdateInput";

    public static final String Name = "name";

    public static final String Phone = "phone";

    public static final String Locale = "locale";

    public static final String ExternalId = "externalId";

    public static final String Note = "note";

    public static final String BuyerExperienceConfiguration = "buyerExperienceConfiguration";
  }

  public static class CONTEXTUALPRICINGCONTEXT {
    public static final String TYPE_NAME = "ContextualPricingContext";

    public static final String Country = "country";

    public static final String CompanyLocationId = "companyLocationId";
  }

  public static class CONTEXTUALPUBLICATIONCONTEXT {
    public static final String TYPE_NAME = "ContextualPublicationContext";

    public static final String Country = "country";

    public static final String CompanyLocationId = "companyLocationId";
  }

  public static class COUNTRYHARMONIZEDSYSTEMCODEINPUT {
    public static final String TYPE_NAME = "CountryHarmonizedSystemCodeInput";

    public static final String HarmonizedSystemCode = "harmonizedSystemCode";

    public static final String CountryCode = "countryCode";
  }

  public static class CREATEMEDIAINPUT {
    public static final String TYPE_NAME = "CreateMediaInput";

    public static final String OriginalSource = "originalSource";

    public static final String Alt = "alt";

    public static final String MediaContentType = "mediaContentType";
  }

  public static class CUSTOMERDELETEINPUT {
    public static final String TYPE_NAME = "CustomerDeleteInput";

    public static final String Id = "id";
  }

  public static class CUSTOMEREMAILMARKETINGCONSENTINPUT {
    public static final String TYPE_NAME = "CustomerEmailMarketingConsentInput";

    public static final String MarketingOptInLevel = "marketingOptInLevel";

    public static final String MarketingState = "marketingState";

    public static final String ConsentUpdatedAt = "consentUpdatedAt";
  }

  public static class CUSTOMEREMAILMARKETINGCONSENTUPDATEINPUT {
    public static final String TYPE_NAME = "CustomerEmailMarketingConsentUpdateInput";

    public static final String CustomerId = "customerId";

    public static final String EmailMarketingConsent = "emailMarketingConsent";
  }

  public static class CUSTOMERINPUT {
    public static final String TYPE_NAME = "CustomerInput";

    public static final String Addresses = "addresses";

    public static final String Email = "email";

    public static final String FirstName = "firstName";

    public static final String Id = "id";

    public static final String LastName = "lastName";

    public static final String Locale = "locale";

    public static final String Metafields = "metafields";

    public static final String Note = "note";

    public static final String Phone = "phone";

    public static final String Tags = "tags";

    public static final String EmailMarketingConsent = "emailMarketingConsent";

    public static final String SmsMarketingConsent = "smsMarketingConsent";

    public static final String TaxExempt = "taxExempt";

    public static final String TaxExemptions = "taxExemptions";
  }

  public static class CUSTOMERMERGEOVERRIDEFIELDS {
    public static final String TYPE_NAME = "CustomerMergeOverrideFields";

    public static final String CustomerIdOfFirstNameToKeep = "customerIdOfFirstNameToKeep";

    public static final String CustomerIdOfLastNameToKeep = "customerIdOfLastNameToKeep";

    public static final String CustomerIdOfEmailToKeep = "customerIdOfEmailToKeep";

    public static final String CustomerIdOfPhoneNumberToKeep = "customerIdOfPhoneNumberToKeep";

    public static final String CustomerIdOfDefaultAddressToKeep = "customerIdOfDefaultAddressToKeep";

    public static final String Note = "note";

    public static final String Tags = "tags";
  }

  public static class CUSTOMERPAYMENTMETHODREMOTEINPUT {
    public static final String TYPE_NAME = "CustomerPaymentMethodRemoteInput";

    public static final String StripePaymentMethod = "stripePaymentMethod";

    public static final String AuthorizeNetCustomerPaymentProfile = "authorizeNetCustomerPaymentProfile";

    public static final String BraintreePaymentMethod = "braintreePaymentMethod";
  }

  public static class CUSTOMERSEGMENTMEMBERSQUERYINPUT {
    public static final String TYPE_NAME = "CustomerSegmentMembersQueryInput";

    public static final String SegmentId = "segmentId";

    public static final String Query = "query";

    public static final String Reverse = "reverse";

    public static final String SortKey = "sortKey";
  }

  public static class CUSTOMERSMSMARKETINGCONSENTINPUT {
    public static final String TYPE_NAME = "CustomerSmsMarketingConsentInput";

    public static final String MarketingOptInLevel = "marketingOptInLevel";

    public static final String MarketingState = "marketingState";

    public static final String ConsentUpdatedAt = "consentUpdatedAt";
  }

  public static class CUSTOMERSMSMARKETINGCONSENTUPDATEINPUT {
    public static final String TYPE_NAME = "CustomerSmsMarketingConsentUpdateInput";

    public static final String CustomerId = "customerId";

    public static final String SmsMarketingConsent = "smsMarketingConsent";
  }

  public static class CUSTOMSHIPPINGPACKAGEINPUT {
    public static final String TYPE_NAME = "CustomShippingPackageInput";

    public static final String Weight = "weight";

    public static final String Dimensions = "dimensions";

    public static final String Default = "default";

    public static final String Name = "name";

    public static final String Type = "type";
  }

  public static class DELEGATEACCESSTOKENINPUT {
    public static final String TYPE_NAME = "DelegateAccessTokenInput";

    public static final String DelegateAccessScope = "delegateAccessScope";

    public static final String ExpiresIn = "expiresIn";
  }

  public static class DELIVERYCOUNTRYINPUT {
    public static final String TYPE_NAME = "DeliveryCountryInput";

    public static final String Code = "code";

    public static final String RestOfWorld = "restOfWorld";

    public static final String Provinces = "provinces";

    public static final String IncludeAllProvinces = "includeAllProvinces";
  }

  public static class DELIVERYCUSTOMIZATIONINPUT {
    public static final String TYPE_NAME = "DeliveryCustomizationInput";

    public static final String FunctionId = "functionId";

    public static final String Title = "title";

    public static final String Enabled = "enabled";

    public static final String Metafields = "metafields";
  }

  public static class DELIVERYLOCATIONGROUPZONEINPUT {
    public static final String TYPE_NAME = "DeliveryLocationGroupZoneInput";

    public static final String Id = "id";

    public static final String Name = "name";

    public static final String Countries = "countries";

    public static final String MethodDefinitionsToCreate = "methodDefinitionsToCreate";

    public static final String MethodDefinitionsToUpdate = "methodDefinitionsToUpdate";
  }

  public static class DELIVERYLOCATIONLOCALPICKUPENABLEINPUT {
    public static final String TYPE_NAME = "DeliveryLocationLocalPickupEnableInput";

    public static final String LocationId = "locationId";

    public static final String PickupTime = "pickupTime";

    public static final String Instructions = "instructions";
  }

  public static class DELIVERYMETHODDEFINITIONINPUT {
    public static final String TYPE_NAME = "DeliveryMethodDefinitionInput";

    public static final String Id = "id";

    public static final String Name = "name";

    public static final String Description = "description";

    public static final String Active = "active";

    public static final String RateDefinition = "rateDefinition";

    public static final String Participant = "participant";

    public static final String WeightConditionsToCreate = "weightConditionsToCreate";

    public static final String PriceConditionsToCreate = "priceConditionsToCreate";

    public static final String ConditionsToUpdate = "conditionsToUpdate";
  }

  public static class DELIVERYPARTICIPANTINPUT {
    public static final String TYPE_NAME = "DeliveryParticipantInput";

    public static final String Id = "id";

    public static final String CarrierServiceId = "carrierServiceId";

    public static final String FixedFee = "fixedFee";

    public static final String PercentageOfRateFee = "percentageOfRateFee";

    public static final String ParticipantServices = "participantServices";

    public static final String AdaptToNewServices = "adaptToNewServices";
  }

  public static class DELIVERYPARTICIPANTSERVICEINPUT {
    public static final String TYPE_NAME = "DeliveryParticipantServiceInput";

    public static final String Name = "name";

    public static final String Active = "active";
  }

  public static class DELIVERYPRICECONDITIONINPUT {
    public static final String TYPE_NAME = "DeliveryPriceConditionInput";

    public static final String Criteria = "criteria";

    public static final String Operator = "operator";
  }

  public static class DELIVERYPROFILEINPUT {
    public static final String TYPE_NAME = "DeliveryProfileInput";

    public static final String Name = "name";

    public static final String ProfileLocationGroups = "profileLocationGroups";

    public static final String LocationGroupsToCreate = "locationGroupsToCreate";

    public static final String LocationGroupsToUpdate = "locationGroupsToUpdate";

    public static final String LocationGroupsToDelete = "locationGroupsToDelete";

    public static final String VariantsToAssociate = "variantsToAssociate";

    public static final String VariantsToDissociate = "variantsToDissociate";

    public static final String ZonesToDelete = "zonesToDelete";

    public static final String MethodDefinitionsToDelete = "methodDefinitionsToDelete";

    public static final String ConditionsToDelete = "conditionsToDelete";

    public static final String SellingPlanGroupsToAssociate = "sellingPlanGroupsToAssociate";

    public static final String SellingPlanGroupsToDissociate = "sellingPlanGroupsToDissociate";
  }

  public static class DELIVERYPROFILELOCATIONGROUPINPUT {
    public static final String TYPE_NAME = "DeliveryProfileLocationGroupInput";

    public static final String Id = "id";

    public static final String Locations = "locations";

    public static final String LocationsToAdd = "locationsToAdd";

    public static final String LocationsToRemove = "locationsToRemove";

    public static final String ZonesToCreate = "zonesToCreate";

    public static final String ZonesToUpdate = "zonesToUpdate";
  }

  public static class DELIVERYPROVINCEINPUT {
    public static final String TYPE_NAME = "DeliveryProvinceInput";

    public static final String Code = "code";
  }

  public static class DELIVERYRATEDEFINITIONINPUT {
    public static final String TYPE_NAME = "DeliveryRateDefinitionInput";

    public static final String Id = "id";

    public static final String Price = "price";
  }

  public static class DELIVERYSETTINGINPUT {
    public static final String TYPE_NAME = "DeliverySettingInput";

    public static final String LegacyModeProfiles = "legacyModeProfiles";
  }

  public static class DELIVERYUPDATECONDITIONINPUT {
    public static final String TYPE_NAME = "DeliveryUpdateConditionInput";

    public static final String Id = "id";

    public static final String Criteria = "criteria";

    public static final String CriteriaUnit = "criteriaUnit";

    public static final String Field = "field";

    public static final String Operator = "operator";
  }

  public static class DELIVERYWEIGHTCONDITIONINPUT {
    public static final String TYPE_NAME = "DeliveryWeightConditionInput";

    public static final String Criteria = "criteria";

    public static final String Operator = "operator";
  }

  public static class DISCOUNTAMOUNTINPUT {
    public static final String TYPE_NAME = "DiscountAmountInput";

    public static final String Amount = "amount";

    public static final String AppliesOnEachItem = "appliesOnEachItem";
  }

  public static class DISCOUNTAUTOMATICAPPINPUT {
    public static final String TYPE_NAME = "DiscountAutomaticAppInput";

    public static final String CombinesWith = "combinesWith";

    public static final String FunctionId = "functionId";

    public static final String Title = "title";

    public static final String StartsAt = "startsAt";

    public static final String EndsAt = "endsAt";

    public static final String Metafields = "metafields";
  }

  public static class DISCOUNTAUTOMATICBASICINPUT {
    public static final String TYPE_NAME = "DiscountAutomaticBasicInput";

    public static final String CombinesWith = "combinesWith";

    public static final String Title = "title";

    public static final String StartsAt = "startsAt";

    public static final String EndsAt = "endsAt";

    public static final String MinimumRequirement = "minimumRequirement";

    public static final String CustomerGets = "customerGets";

    public static final String RecurringCycleLimit = "recurringCycleLimit";
  }

  public static class DISCOUNTAUTOMATICBXGYINPUT {
    public static final String TYPE_NAME = "DiscountAutomaticBxgyInput";

    public static final String CombinesWith = "combinesWith";

    public static final String StartsAt = "startsAt";

    public static final String EndsAt = "endsAt";

    public static final String Title = "title";

    public static final String UsesPerOrderLimit = "usesPerOrderLimit";

    public static final String CustomerBuys = "customerBuys";

    public static final String CustomerGets = "customerGets";
  }

  public static class DISCOUNTAUTOMATICFREESHIPPINGINPUT {
    public static final String TYPE_NAME = "DiscountAutomaticFreeShippingInput";

    public static final String CombinesWith = "combinesWith";

    public static final String Title = "title";

    public static final String StartsAt = "startsAt";

    public static final String EndsAt = "endsAt";

    public static final String MinimumRequirement = "minimumRequirement";

    public static final String Destination = "destination";

    public static final String MaximumShippingPrice = "maximumShippingPrice";

    public static final String AppliesOnOneTimePurchase = "appliesOnOneTimePurchase";

    public static final String AppliesOnSubscription = "appliesOnSubscription";

    public static final String RecurringCycleLimit = "recurringCycleLimit";
  }

  public static class DISCOUNTCODEAPPINPUT {
    public static final String TYPE_NAME = "DiscountCodeAppInput";

    public static final String CombinesWith = "combinesWith";

    public static final String FunctionId = "functionId";

    public static final String Title = "title";

    public static final String StartsAt = "startsAt";

    public static final String EndsAt = "endsAt";

    public static final String UsageLimit = "usageLimit";

    public static final String AppliesOncePerCustomer = "appliesOncePerCustomer";

    public static final String CustomerSelection = "customerSelection";

    public static final String Code = "code";

    public static final String Metafields = "metafields";
  }

  public static class DISCOUNTCODEBASICINPUT {
    public static final String TYPE_NAME = "DiscountCodeBasicInput";

    public static final String CombinesWith = "combinesWith";

    public static final String Title = "title";

    public static final String StartsAt = "startsAt";

    public static final String EndsAt = "endsAt";

    public static final String UsageLimit = "usageLimit";

    public static final String AppliesOncePerCustomer = "appliesOncePerCustomer";

    public static final String MinimumRequirement = "minimumRequirement";

    public static final String CustomerGets = "customerGets";

    public static final String CustomerSelection = "customerSelection";

    public static final String Code = "code";

    public static final String RecurringCycleLimit = "recurringCycleLimit";
  }

  public static class DISCOUNTCODEBXGYINPUT {
    public static final String TYPE_NAME = "DiscountCodeBxgyInput";

    public static final String CombinesWith = "combinesWith";

    public static final String Title = "title";

    public static final String StartsAt = "startsAt";

    public static final String EndsAt = "endsAt";

    public static final String CustomerBuys = "customerBuys";

    public static final String CustomerGets = "customerGets";

    public static final String CustomerSelection = "customerSelection";

    public static final String Code = "code";

    public static final String UsageLimit = "usageLimit";

    public static final String UsesPerOrderLimit = "usesPerOrderLimit";

    public static final String AppliesOncePerCustomer = "appliesOncePerCustomer";
  }

  public static class DISCOUNTCODEFREESHIPPINGINPUT {
    public static final String TYPE_NAME = "DiscountCodeFreeShippingInput";

    public static final String CombinesWith = "combinesWith";

    public static final String Title = "title";

    public static final String StartsAt = "startsAt";

    public static final String EndsAt = "endsAt";

    public static final String Code = "code";

    public static final String UsageLimit = "usageLimit";

    public static final String AppliesOncePerCustomer = "appliesOncePerCustomer";

    public static final String MinimumRequirement = "minimumRequirement";

    public static final String CustomerSelection = "customerSelection";

    public static final String Destination = "destination";

    public static final String MaximumShippingPrice = "maximumShippingPrice";

    public static final String RecurringCycleLimit = "recurringCycleLimit";

    public static final String AppliesOnOneTimePurchase = "appliesOnOneTimePurchase";

    public static final String AppliesOnSubscription = "appliesOnSubscription";
  }

  public static class DISCOUNTCOLLECTIONSINPUT {
    public static final String TYPE_NAME = "DiscountCollectionsInput";

    public static final String Add = "add";

    public static final String Remove = "remove";
  }

  public static class DISCOUNTCOMBINESWITHINPUT {
    public static final String TYPE_NAME = "DiscountCombinesWithInput";

    public static final String ProductDiscounts = "productDiscounts";

    public static final String OrderDiscounts = "orderDiscounts";

    public static final String ShippingDiscounts = "shippingDiscounts";
  }

  public static class DISCOUNTCOUNTRIESINPUT {
    public static final String TYPE_NAME = "DiscountCountriesInput";

    public static final String Add = "add";

    public static final String Remove = "remove";

    public static final String IncludeRestOfWorld = "includeRestOfWorld";
  }

  public static class DISCOUNTCUSTOMERBUYSINPUT {
    public static final String TYPE_NAME = "DiscountCustomerBuysInput";

    public static final String Value = "value";

    public static final String Items = "items";
  }

  public static class DISCOUNTCUSTOMERBUYSVALUEINPUT {
    public static final String TYPE_NAME = "DiscountCustomerBuysValueInput";

    public static final String Quantity = "quantity";

    public static final String Amount = "amount";
  }

  public static class DISCOUNTCUSTOMERGETSINPUT {
    public static final String TYPE_NAME = "DiscountCustomerGetsInput";

    public static final String Value = "value";

    public static final String Items = "items";

    public static final String AppliesOnOneTimePurchase = "appliesOnOneTimePurchase";

    public static final String AppliesOnSubscription = "appliesOnSubscription";
  }

  public static class DISCOUNTCUSTOMERGETSVALUEINPUT {
    public static final String TYPE_NAME = "DiscountCustomerGetsValueInput";

    public static final String DiscountOnQuantity = "discountOnQuantity";

    public static final String Percentage = "percentage";

    public static final String DiscountAmount = "discountAmount";
  }

  public static class DISCOUNTCUSTOMERSEGMENTSINPUT {
    public static final String TYPE_NAME = "DiscountCustomerSegmentsInput";

    public static final String Add = "add";

    public static final String Remove = "remove";
  }

  public static class DISCOUNTCUSTOMERSELECTIONINPUT {
    public static final String TYPE_NAME = "DiscountCustomerSelectionInput";

    public static final String All = "all";

    public static final String Customers = "customers";

    public static final String CustomerSegments = "customerSegments";
  }

  public static class DISCOUNTCUSTOMERSINPUT {
    public static final String TYPE_NAME = "DiscountCustomersInput";

    public static final String Add = "add";

    public static final String Remove = "remove";
  }

  public static class DISCOUNTEFFECTINPUT {
    public static final String TYPE_NAME = "DiscountEffectInput";

    public static final String Percentage = "percentage";

    public static final String Amount = "amount";
  }

  public static class DISCOUNTITEMSINPUT {
    public static final String TYPE_NAME = "DiscountItemsInput";

    public static final String Products = "products";

    public static final String Collections = "collections";

    public static final String All = "all";
  }

  public static class DISCOUNTMINIMUMQUANTITYINPUT {
    public static final String TYPE_NAME = "DiscountMinimumQuantityInput";

    public static final String GreaterThanOrEqualToQuantity = "greaterThanOrEqualToQuantity";
  }

  public static class DISCOUNTMINIMUMREQUIREMENTINPUT {
    public static final String TYPE_NAME = "DiscountMinimumRequirementInput";

    public static final String Quantity = "quantity";

    public static final String Subtotal = "subtotal";
  }

  public static class DISCOUNTMINIMUMSUBTOTALINPUT {
    public static final String TYPE_NAME = "DiscountMinimumSubtotalInput";

    public static final String GreaterThanOrEqualToSubtotal = "greaterThanOrEqualToSubtotal";
  }

  public static class DISCOUNTONQUANTITYINPUT {
    public static final String TYPE_NAME = "DiscountOnQuantityInput";

    public static final String Quantity = "quantity";

    public static final String Effect = "effect";
  }

  public static class DISCOUNTPRODUCTSINPUT {
    public static final String TYPE_NAME = "DiscountProductsInput";

    public static final String ProductsToAdd = "productsToAdd";

    public static final String ProductsToRemove = "productsToRemove";

    public static final String ProductVariantsToAdd = "productVariantsToAdd";

    public static final String ProductVariantsToRemove = "productVariantsToRemove";
  }

  public static class DISCOUNTREDEEMCODEINPUT {
    public static final String TYPE_NAME = "DiscountRedeemCodeInput";

    public static final String Code = "code";
  }

  public static class DISCOUNTSHIPPINGDESTINATIONSELECTIONINPUT {
    public static final String TYPE_NAME = "DiscountShippingDestinationSelectionInput";

    public static final String All = "all";

    public static final String Countries = "countries";
  }

  public static class DRAFTORDERAPPLIEDDISCOUNTINPUT {
    public static final String TYPE_NAME = "DraftOrderAppliedDiscountInput";

    public static final String Description = "description";

    public static final String Title = "title";

    public static final String Value = "value";

    public static final String ValueType = "valueType";
  }

  public static class DRAFTORDERDELETEINPUT {
    public static final String TYPE_NAME = "DraftOrderDeleteInput";

    public static final String Id = "id";
  }

  public static class DRAFTORDERINPUT {
    public static final String TYPE_NAME = "DraftOrderInput";

    public static final String AppliedDiscount = "appliedDiscount";

    public static final String BillingAddress = "billingAddress";

    public static final String CustomAttributes = "customAttributes";

    public static final String Email = "email";

    public static final String LineItems = "lineItems";

    public static final String Metafields = "metafields";

    public static final String LocalizationExtensions = "localizationExtensions";

    public static final String Note = "note";

    public static final String ShippingAddress = "shippingAddress";

    public static final String ShippingLine = "shippingLine";

    public static final String Tags = "tags";

    public static final String TaxExempt = "taxExempt";

    public static final String UseCustomerDefaultAddress = "useCustomerDefaultAddress";

    public static final String VisibleToCustomer = "visibleToCustomer";

    public static final String ReserveInventoryUntil = "reserveInventoryUntil";

    public static final String PresentmentCurrencyCode = "presentmentCurrencyCode";

    public static final String Phone = "phone";

    public static final String PaymentTerms = "paymentTerms";

    public static final String PurchasingEntity = "purchasingEntity";

    public static final String SourceName = "sourceName";

    public static final String PoNumber = "poNumber";
  }

  public static class DRAFTORDERLINEITEMINPUT {
    public static final String TYPE_NAME = "DraftOrderLineItemInput";

    public static final String AppliedDiscount = "appliedDiscount";

    public static final String CustomAttributes = "customAttributes";

    public static final String OriginalUnitPrice = "originalUnitPrice";

    public static final String Quantity = "quantity";

    public static final String RequiresShipping = "requiresShipping";

    public static final String Sku = "sku";

    public static final String Taxable = "taxable";

    public static final String Title = "title";

    public static final String VariantId = "variantId";

    public static final String Weight = "weight";
  }

  public static class EMAILINPUT {
    public static final String TYPE_NAME = "EmailInput";

    public static final String Subject = "subject";

    public static final String To = "to";

    public static final String From = "from";

    public static final String Body = "body";

    public static final String Bcc = "bcc";

    public static final String CustomMessage = "customMessage";
  }

  public static class EVENTBRIDGEWEBHOOKSUBSCRIPTIONINPUT {
    public static final String TYPE_NAME = "EventBridgeWebhookSubscriptionInput";

    public static final String Arn = "arn";

    public static final String Format = "format";

    public static final String IncludeFields = "includeFields";

    public static final String MetafieldNamespaces = "metafieldNamespaces";
  }

  public static class FILECREATEINPUT {
    public static final String TYPE_NAME = "FileCreateInput";

    public static final String Filename = "filename";

    public static final String ContentType = "contentType";

    public static final String Alt = "alt";

    public static final String DuplicateResolutionMode = "duplicateResolutionMode";

    public static final String OriginalSource = "originalSource";
  }

  public static class FILEUPDATEINPUT {
    public static final String TYPE_NAME = "FileUpdateInput";

    public static final String Id = "id";

    public static final String Alt = "alt";

    public static final String OriginalSource = "originalSource";

    public static final String PreviewImageSource = "previewImageSource";

    public static final String Filename = "filename";
  }

  public static class FULFILLMENTEVENTINPUT {
    public static final String TYPE_NAME = "FulfillmentEventInput";

    public static final String Address1 = "address1";

    public static final String City = "city";

    public static final String Country = "country";

    public static final String EstimatedDeliveryAt = "estimatedDeliveryAt";

    public static final String HappenedAt = "happenedAt";

    public static final String FulfillmentId = "fulfillmentId";

    public static final String Latitude = "latitude";

    public static final String Longitude = "longitude";

    public static final String Message = "message";

    public static final String Province = "province";

    public static final String Status = "status";

    public static final String Zip = "zip";
  }

  public static class FULFILLMENTORDERHOLDINPUT {
    public static final String TYPE_NAME = "FulfillmentOrderHoldInput";

    public static final String Reason = "reason";

    public static final String ReasonNotes = "reasonNotes";

    public static final String NotifyMerchant = "notifyMerchant";

    public static final String ExternalId = "externalId";

    public static final String FulfillmentOrderLineItems = "fulfillmentOrderLineItems";
  }

  public static class FULFILLMENTORDERLINEITEMINPUT {
    public static final String TYPE_NAME = "FulfillmentOrderLineItemInput";

    public static final String Id = "id";

    public static final String Quantity = "quantity";
  }

  public static class FULFILLMENTORDERLINEITEMSINPUT {
    public static final String TYPE_NAME = "FulfillmentOrderLineItemsInput";

    public static final String FulfillmentOrderId = "fulfillmentOrderId";

    public static final String FulfillmentOrderLineItems = "fulfillmentOrderLineItems";
  }

  public static class FULFILLMENTORDERLINEITEMSPREPAREDFORPICKUPINPUT {
    public static final String TYPE_NAME = "FulfillmentOrderLineItemsPreparedForPickupInput";

    public static final String LineItemsByFulfillmentOrder = "lineItemsByFulfillmentOrder";
  }

  public static class FULFILLMENTORDERMERGEINPUT {
    public static final String TYPE_NAME = "FulfillmentOrderMergeInput";

    public static final String MergeIntents = "mergeIntents";
  }

  public static class FULFILLMENTORDERMERGEINPUTMERGEINTENT {
    public static final String TYPE_NAME = "FulfillmentOrderMergeInputMergeIntent";

    public static final String FulfillmentOrderLineItems = "fulfillmentOrderLineItems";

    public static final String FulfillmentOrderId = "fulfillmentOrderId";
  }

  public static class FULFILLMENTORDERSPLITINPUT {
    public static final String TYPE_NAME = "FulfillmentOrderSplitInput";

    public static final String FulfillmentOrderLineItems = "fulfillmentOrderLineItems";

    public static final String FulfillmentOrderId = "fulfillmentOrderId";
  }

  public static class FULFILLMENTORIGINADDRESSINPUT {
    public static final String TYPE_NAME = "FulfillmentOriginAddressInput";

    public static final String Address1 = "address1";

    public static final String Address2 = "address2";

    public static final String City = "city";

    public static final String Zip = "zip";

    public static final String ProvinceCode = "provinceCode";

    public static final String CountryCode = "countryCode";
  }

  public static class FULFILLMENTTRACKINGINPUT {
    public static final String TYPE_NAME = "FulfillmentTrackingInput";

    public static final String Number = "number";

    public static final String Url = "url";

    public static final String Company = "company";

    public static final String Numbers = "numbers";

    public static final String Urls = "urls";
  }

  public static class FULFILLMENTV2INPUT {
    public static final String TYPE_NAME = "FulfillmentV2Input";

    public static final String TrackingInfo = "trackingInfo";

    public static final String NotifyCustomer = "notifyCustomer";

    public static final String LineItemsByFulfillmentOrder = "lineItemsByFulfillmentOrder";

    public static final String OriginAddress = "originAddress";
  }

  public static class GIFTCARDCREATEINPUT {
    public static final String TYPE_NAME = "GiftCardCreateInput";

    public static final String InitialValue = "initialValue";

    public static final String Code = "code";

    public static final String CustomerId = "customerId";

    public static final String ExpiresOn = "expiresOn";

    public static final String Note = "note";

    public static final String TemplateSuffix = "templateSuffix";
  }

  public static class GIFTCARDUPDATEINPUT {
    public static final String TYPE_NAME = "GiftCardUpdateInput";

    public static final String Note = "note";

    public static final String ExpiresOn = "expiresOn";

    public static final String CustomerId = "customerId";

    public static final String TemplateSuffix = "templateSuffix";
  }

  public static class IMAGEINPUT {
    public static final String TYPE_NAME = "ImageInput";

    public static final String Id = "id";

    public static final String AltText = "altText";

    public static final String Src = "src";
  }

  public static class IMAGETRANSFORMINPUT {
    public static final String TYPE_NAME = "ImageTransformInput";

    public static final String Crop = "crop";

    public static final String MaxWidth = "maxWidth";

    public static final String MaxHeight = "maxHeight";

    public static final String Scale = "scale";

    public static final String PreferredContentType = "preferredContentType";
  }

  public static class INCOMINGREQUESTLINEITEMINPUT {
    public static final String TYPE_NAME = "IncomingRequestLineItemInput";

    public static final String FulfillmentOrderLineItemId = "fulfillmentOrderLineItemId";

    public static final String Message = "message";
  }

  public static class INVENTORYADJUSTITEMINPUT {
    public static final String TYPE_NAME = "InventoryAdjustItemInput";

    public static final String InventoryItemId = "inventoryItemId";

    public static final String AvailableDelta = "availableDelta";
  }

  public static class INVENTORYADJUSTQUANTITIESINPUT {
    public static final String TYPE_NAME = "InventoryAdjustQuantitiesInput";

    public static final String Reason = "reason";

    public static final String Name = "name";

    public static final String ReferenceDocumentUri = "referenceDocumentUri";

    public static final String Changes = "changes";
  }

  public static class INVENTORYADJUSTQUANTITYINPUT {
    public static final String TYPE_NAME = "InventoryAdjustQuantityInput";

    public static final String InventoryLevelId = "inventoryLevelId";

    public static final String AvailableDelta = "availableDelta";
  }

  public static class INVENTORYBULKTOGGLEACTIVATIONINPUT {
    public static final String TYPE_NAME = "InventoryBulkToggleActivationInput";

    public static final String LocationId = "locationId";

    public static final String Activate = "activate";
  }

  public static class INVENTORYCHANGEINPUT {
    public static final String TYPE_NAME = "InventoryChangeInput";

    public static final String Delta = "delta";

    public static final String InventoryItemId = "inventoryItemId";

    public static final String LocationId = "locationId";

    public static final String LedgerDocumentUri = "ledgerDocumentUri";
  }

  public static class INVENTORYITEMINPUT {
    public static final String TYPE_NAME = "InventoryItemInput";

    public static final String Cost = "cost";

    public static final String Tracked = "tracked";
  }

  public static class INVENTORYITEMUPDATEINPUT {
    public static final String TYPE_NAME = "InventoryItemUpdateInput";

    public static final String Cost = "cost";

    public static final String Tracked = "tracked";

    public static final String CountryCodeOfOrigin = "countryCodeOfOrigin";

    public static final String ProvinceCodeOfOrigin = "provinceCodeOfOrigin";

    public static final String HarmonizedSystemCode = "harmonizedSystemCode";

    public static final String CountryHarmonizedSystemCodes = "countryHarmonizedSystemCodes";
  }

  public static class INVENTORYLEVELINPUT {
    public static final String TYPE_NAME = "InventoryLevelInput";

    public static final String AvailableQuantity = "availableQuantity";

    public static final String LocationId = "locationId";
  }

  public static class INVENTORYMOVEQUANTITIESINPUT {
    public static final String TYPE_NAME = "InventoryMoveQuantitiesInput";

    public static final String Reason = "reason";

    public static final String ReferenceDocumentUri = "referenceDocumentUri";

    public static final String Changes = "changes";
  }

  public static class INVENTORYMOVEQUANTITYCHANGE {
    public static final String TYPE_NAME = "InventoryMoveQuantityChange";

    public static final String InventoryItemId = "inventoryItemId";

    public static final String Quantity = "quantity";

    public static final String From = "from";

    public static final String To = "to";
  }

  public static class INVENTORYMOVEQUANTITYTERMINALINPUT {
    public static final String TYPE_NAME = "InventoryMoveQuantityTerminalInput";

    public static final String LocationId = "locationId";

    public static final String Name = "name";

    public static final String LedgerDocumentUri = "ledgerDocumentUri";
  }

  public static class INVENTORYSCHEDULEDCHANGEINPUT {
    public static final String TYPE_NAME = "InventoryScheduledChangeInput";

    public static final String ExpectedAt = "expectedAt";

    public static final String FromName = "fromName";

    public static final String ToName = "toName";
  }

  public static class INVENTORYSCHEDULEDCHANGEITEMINPUT {
    public static final String TYPE_NAME = "InventoryScheduledChangeItemInput";

    public static final String InventoryItemId = "inventoryItemId";

    public static final String LocationId = "locationId";

    public static final String LedgerDocumentUri = "ledgerDocumentUri";

    public static final String ScheduledChanges = "scheduledChanges";
  }

  public static class INVENTORYSETONHANDQUANTITIESINPUT {
    public static final String TYPE_NAME = "InventorySetOnHandQuantitiesInput";

    public static final String Reason = "reason";

    public static final String ReferenceDocumentUri = "referenceDocumentUri";

    public static final String SetQuantities = "setQuantities";
  }

  public static class INVENTORYSETQUANTITYINPUT {
    public static final String TYPE_NAME = "InventorySetQuantityInput";

    public static final String InventoryItemId = "inventoryItemId";

    public static final String LocationId = "locationId";

    public static final String Quantity = "quantity";
  }

  public static class INVENTORYSETSCHEDULEDCHANGESINPUT {
    public static final String TYPE_NAME = "InventorySetScheduledChangesInput";

    public static final String Reason = "reason";

    public static final String Items = "items";

    public static final String ReferenceDocumentUri = "referenceDocumentUri";
  }

  public static class LOCALIZATIONEXTENSIONINPUT {
    public static final String TYPE_NAME = "LocalizationExtensionInput";

    public static final String Key = "key";

    public static final String Value = "value";
  }

  public static class LOCATIONADDADDRESSINPUT {
    public static final String TYPE_NAME = "LocationAddAddressInput";

    public static final String Address1 = "address1";

    public static final String Address2 = "address2";

    public static final String City = "city";

    public static final String Phone = "phone";

    public static final String Zip = "zip";

    public static final String CountryCode = "countryCode";

    public static final String ProvinceCode = "provinceCode";
  }

  public static class LOCATIONADDINPUT {
    public static final String TYPE_NAME = "LocationAddInput";

    public static final String Name = "name";

    public static final String Address = "address";

    public static final String FulfillsOnlineOrders = "fulfillsOnlineOrders";

    public static final String Metafields = "metafields";
  }

  public static class LOCATIONEDITADDRESSINPUT {
    public static final String TYPE_NAME = "LocationEditAddressInput";

    public static final String Address1 = "address1";

    public static final String Address2 = "address2";

    public static final String City = "city";

    public static final String Phone = "phone";

    public static final String Zip = "zip";

    public static final String CountryCode = "countryCode";

    public static final String ProvinceCode = "provinceCode";
  }

  public static class LOCATIONEDITINPUT {
    public static final String TYPE_NAME = "LocationEditInput";

    public static final String Name = "name";

    public static final String Address = "address";

    public static final String FulfillsOnlineOrders = "fulfillsOnlineOrders";

    public static final String Metafields = "metafields";
  }

  public static class MAILINGADDRESSINPUT {
    public static final String TYPE_NAME = "MailingAddressInput";

    public static final String Address1 = "address1";

    public static final String Address2 = "address2";

    public static final String City = "city";

    public static final String Company = "company";

    public static final String CountryCode = "countryCode";

    public static final String FirstName = "firstName";

    public static final String LastName = "lastName";

    public static final String Phone = "phone";

    public static final String ProvinceCode = "provinceCode";

    public static final String Zip = "zip";
  }

  public static class MARKETCREATEINPUT {
    public static final String TYPE_NAME = "MarketCreateInput";

    public static final String Name = "name";

    public static final String Handle = "handle";

    public static final String Enabled = "enabled";

    public static final String Regions = "regions";
  }

  public static class MARKETCURRENCYSETTINGSUPDATEINPUT {
    public static final String TYPE_NAME = "MarketCurrencySettingsUpdateInput";

    public static final String BaseCurrency = "baseCurrency";

    public static final String LocalCurrencies = "localCurrencies";
  }

  public static class MARKETINGACTIVITYBUDGETINPUT {
    public static final String TYPE_NAME = "MarketingActivityBudgetInput";

    public static final String BudgetType = "budgetType";

    public static final String Total = "total";
  }

  public static class MARKETINGACTIVITYCREATEEXTERNALINPUT {
    public static final String TYPE_NAME = "MarketingActivityCreateExternalInput";

    public static final String Title = "title";

    public static final String Utm = "utm";

    public static final String UrlParameterValue = "urlParameterValue";

    public static final String Budget = "budget";

    public static final String AdSpend = "adSpend";

    public static final String RemoteId = "remoteId";

    public static final String Status = "status";

    public static final String RemoteUrl = "remoteUrl";

    public static final String RemotePreviewImageUrl = "remotePreviewImageUrl";

    public static final String Tactic = "tactic";

    public static final String MarketingChannelType = "marketingChannelType";

    public static final String ReferringDomain = "referringDomain";

    public static final String ChannelHandle = "channelHandle";

    public static final String ScheduledStart = "scheduledStart";

    public static final String ScheduledEnd = "scheduledEnd";

    public static final String Start = "start";

    public static final String End = "end";

    public static final String ParentActivityId = "parentActivityId";

    public static final String ParentRemoteId = "parentRemoteId";

    public static final String HierarchyLevel = "hierarchyLevel";
  }

  public static class MARKETINGACTIVITYCREATEINPUT {
    public static final String TYPE_NAME = "MarketingActivityCreateInput";

    public static final String MarketingActivityTitle = "marketingActivityTitle";

    public static final String FormData = "formData";

    public static final String MarketingActivityExtensionId = "marketingActivityExtensionId";

    public static final String Context = "context";

    public static final String Utm = "utm";

    public static final String Status = "status";

    public static final String Budget = "budget";
  }

  public static class MARKETINGACTIVITYUPDATEEXTERNALINPUT {
    public static final String TYPE_NAME = "MarketingActivityUpdateExternalInput";

    public static final String Title = "title";

    public static final String Budget = "budget";

    public static final String AdSpend = "adSpend";

    public static final String RemoteUrl = "remoteUrl";

    public static final String RemotePreviewImageUrl = "remotePreviewImageUrl";

    public static final String Tactic = "tactic";

    public static final String MarketingChannelType = "marketingChannelType";

    public static final String ReferringDomain = "referringDomain";

    public static final String ScheduledStart = "scheduledStart";

    public static final String ScheduledEnd = "scheduledEnd";

    public static final String Start = "start";

    public static final String End = "end";

    public static final String Status = "status";
  }

  public static class MARKETINGACTIVITYUPDATEINPUT {
    public static final String TYPE_NAME = "MarketingActivityUpdateInput";

    public static final String Id = "id";

    public static final String MarketingRecommendationId = "marketingRecommendationId";

    public static final String Title = "title";

    public static final String Budget = "budget";

    public static final String Status = "status";

    public static final String TargetStatus = "targetStatus";

    public static final String FormData = "formData";

    public static final String Utm = "utm";

    public static final String MarketedResources = "marketedResources";

    public static final String Errors = "errors";
  }

  public static class MARKETINGACTIVITYUPSERTEXTERNALINPUT {
    public static final String TYPE_NAME = "MarketingActivityUpsertExternalInput";

    public static final String Title = "title";

    public static final String Utm = "utm";

    public static final String Budget = "budget";

    public static final String AdSpend = "adSpend";

    public static final String RemoteId = "remoteId";

    public static final String Status = "status";

    public static final String RemoteUrl = "remoteUrl";

    public static final String RemotePreviewImageUrl = "remotePreviewImageUrl";

    public static final String Tactic = "tactic";

    public static final String MarketingChannelType = "marketingChannelType";

    public static final String ReferringDomain = "referringDomain";

    public static final String ChannelHandle = "channelHandle";

    public static final String ScheduledStart = "scheduledStart";

    public static final String ScheduledEnd = "scheduledEnd";

    public static final String Start = "start";

    public static final String End = "end";

    public static final String UrlParameterValue = "urlParameterValue";

    public static final String ParentRemoteId = "parentRemoteId";

    public static final String HierarchyLevel = "hierarchyLevel";
  }

  public static class MARKETINGENGAGEMENTINPUT {
    public static final String TYPE_NAME = "MarketingEngagementInput";

    public static final String OccurredOn = "occurredOn";

    public static final String ImpressionsCount = "impressionsCount";

    public static final String ViewsCount = "viewsCount";

    public static final String ClicksCount = "clicksCount";

    public static final String SharesCount = "sharesCount";

    public static final String FavoritesCount = "favoritesCount";

    public static final String CommentsCount = "commentsCount";

    public static final String UnsubscribesCount = "unsubscribesCount";

    public static final String ComplaintsCount = "complaintsCount";

    public static final String FailsCount = "failsCount";

    public static final String SendsCount = "sendsCount";

    public static final String UniqueViewsCount = "uniqueViewsCount";

    public static final String UniqueClicksCount = "uniqueClicksCount";

    public static final String AdSpend = "adSpend";

    public static final String IsCumulative = "isCumulative";

    public static final String UtcOffset = "utcOffset";

    public static final String Sales = "sales";

    public static final String SessionsCount = "sessionsCount";

    public static final String Orders = "orders";

    public static final String FirstTimeCustomers = "firstTimeCustomers";

    public static final String ReturningCustomers = "returningCustomers";
  }

  public static class MARKETLOCALIZATIONREGISTERINPUT {
    public static final String TYPE_NAME = "MarketLocalizationRegisterInput";

    public static final String MarketId = "marketId";

    public static final String Key = "key";

    public static final String Value = "value";

    public static final String MarketLocalizableContentDigest = "marketLocalizableContentDigest";
  }

  public static class MARKETREGIONCREATEINPUT {
    public static final String TYPE_NAME = "MarketRegionCreateInput";

    public static final String CountryCode = "countryCode";
  }

  public static class MARKETUPDATEINPUT {
    public static final String TYPE_NAME = "MarketUpdateInput";

    public static final String Name = "name";

    public static final String Handle = "handle";

    public static final String Enabled = "enabled";
  }

  public static class MARKETWEBPRESENCECREATEINPUT {
    public static final String TYPE_NAME = "MarketWebPresenceCreateInput";

    public static final String DomainId = "domainId";

    public static final String DefaultLocale = "defaultLocale";

    public static final String AlternateLocales = "alternateLocales";

    public static final String SubfolderSuffix = "subfolderSuffix";
  }

  public static class MARKETWEBPRESENCEUPDATEINPUT {
    public static final String TYPE_NAME = "MarketWebPresenceUpdateInput";

    public static final String DomainId = "domainId";

    public static final String DefaultLocale = "defaultLocale";

    public static final String AlternateLocales = "alternateLocales";

    public static final String SubfolderSuffix = "subfolderSuffix";
  }

  public static class METAFIELDACCESSGRANTDELETEINPUT {
    public static final String TYPE_NAME = "MetafieldAccessGrantDeleteInput";

    public static final String Grantee = "grantee";
  }

  public static class METAFIELDACCESSGRANTINPUT {
    public static final String TYPE_NAME = "MetafieldAccessGrantInput";

    public static final String Grantee = "grantee";

    public static final String Access = "access";
  }

  public static class METAFIELDACCESSGRANTOPERATIONINPUT {
    public static final String TYPE_NAME = "MetafieldAccessGrantOperationInput";

    public static final String Create = "create";

    public static final String Update = "update";

    public static final String Delete = "delete";
  }

  public static class METAFIELDACCESSINPUT {
    public static final String TYPE_NAME = "MetafieldAccessInput";

    public static final String Admin = "admin";

    public static final String Storefront = "storefront";
  }

  public static class METAFIELDACCESSUPDATEINPUT {
    public static final String TYPE_NAME = "MetafieldAccessUpdateInput";

    public static final String Admin = "admin";

    public static final String Storefront = "storefront";
  }

  public static class METAFIELDDEFINITIONINPUT {
    public static final String TYPE_NAME = "MetafieldDefinitionInput";

    public static final String Namespace = "namespace";

    public static final String Key = "key";

    public static final String Name = "name";

    public static final String Description = "description";

    public static final String OwnerType = "ownerType";

    public static final String Type = "type";

    public static final String Validations = "validations";

    public static final String Pin = "pin";

    public static final String Access = "access";
  }

  public static class METAFIELDDEFINITIONUPDATEINPUT {
    public static final String TYPE_NAME = "MetafieldDefinitionUpdateInput";

    public static final String Namespace = "namespace";

    public static final String Key = "key";

    public static final String Name = "name";

    public static final String Description = "description";

    public static final String OwnerType = "ownerType";

    public static final String Validations = "validations";

    public static final String Pin = "pin";

    public static final String Access = "access";
  }

  public static class METAFIELDDEFINITIONVALIDATIONINPUT {
    public static final String TYPE_NAME = "MetafieldDefinitionValidationInput";

    public static final String Name = "name";

    public static final String Value = "value";
  }

  public static class METAFIELDDELETEINPUT {
    public static final String TYPE_NAME = "MetafieldDeleteInput";

    public static final String Id = "id";
  }

  public static class METAFIELDINPUT {
    public static final String TYPE_NAME = "MetafieldInput";

    public static final String Id = "id";

    public static final String Namespace = "namespace";

    public static final String Key = "key";

    public static final String Value = "value";

    public static final String Type = "type";
  }

  public static class METAFIELDSSETINPUT {
    public static final String TYPE_NAME = "MetafieldsSetInput";

    public static final String OwnerId = "ownerId";

    public static final String Namespace = "namespace";

    public static final String Key = "key";

    public static final String Value = "value";

    public static final String Type = "type";
  }

  public static class METAFIELDSTOREFRONTVISIBILITYINPUT {
    public static final String TYPE_NAME = "MetafieldStorefrontVisibilityInput";

    public static final String Namespace = "namespace";

    public static final String Key = "key";

    public static final String OwnerType = "ownerType";
  }

  public static class METAOBJECTACCESSINPUT {
    public static final String TYPE_NAME = "MetaobjectAccessInput";

    public static final String Admin = "admin";

    public static final String Storefront = "storefront";
  }

  public static class METAOBJECTBULKDELETEWHERECONDITION {
    public static final String TYPE_NAME = "MetaobjectBulkDeleteWhereCondition";

    public static final String Type = "type";

    public static final String Ids = "ids";
  }

  public static class METAOBJECTCAPABILITYCREATEINPUT {
    public static final String TYPE_NAME = "MetaobjectCapabilityCreateInput";

    public static final String Publishable = "publishable";

    public static final String Translatable = "translatable";

    public static final String Renderable = "renderable";

    public static final String OnlineStore = "onlineStore";
  }

  public static class METAOBJECTCAPABILITYDATAINPUT {
    public static final String TYPE_NAME = "MetaobjectCapabilityDataInput";

    public static final String Publishable = "publishable";

    public static final String OnlineStore = "onlineStore";
  }

  public static class METAOBJECTCAPABILITYDATAONLINESTOREINPUT {
    public static final String TYPE_NAME = "MetaobjectCapabilityDataOnlineStoreInput";

    public static final String TemplateSuffix = "templateSuffix";
  }

  public static class METAOBJECTCAPABILITYDATAPUBLISHABLEINPUT {
    public static final String TYPE_NAME = "MetaobjectCapabilityDataPublishableInput";

    public static final String Status = "status";
  }

  public static class METAOBJECTCAPABILITYDEFINITIONDATAONLINESTOREINPUT {
    public static final String TYPE_NAME = "MetaobjectCapabilityDefinitionDataOnlineStoreInput";

    public static final String UrlHandle = "urlHandle";

    public static final String CreateRedirects = "createRedirects";
  }

  public static class METAOBJECTCAPABILITYDEFINITIONDATARENDERABLEINPUT {
    public static final String TYPE_NAME = "MetaobjectCapabilityDefinitionDataRenderableInput";

    public static final String MetaTitleKey = "metaTitleKey";

    public static final String MetaDescriptionKey = "metaDescriptionKey";
  }

  public static class METAOBJECTCAPABILITYONLINESTOREINPUT {
    public static final String TYPE_NAME = "MetaobjectCapabilityOnlineStoreInput";

    public static final String Enabled = "enabled";

    public static final String Data = "data";
  }

  public static class METAOBJECTCAPABILITYPUBLISHABLEINPUT {
    public static final String TYPE_NAME = "MetaobjectCapabilityPublishableInput";

    public static final String Enabled = "enabled";
  }

  public static class METAOBJECTCAPABILITYRENDERABLEINPUT {
    public static final String TYPE_NAME = "MetaobjectCapabilityRenderableInput";

    public static final String Enabled = "enabled";

    public static final String Data = "data";
  }

  public static class METAOBJECTCAPABILITYTRANSLATABLEINPUT {
    public static final String TYPE_NAME = "MetaobjectCapabilityTranslatableInput";

    public static final String Enabled = "enabled";
  }

  public static class METAOBJECTCAPABILITYUPDATEINPUT {
    public static final String TYPE_NAME = "MetaobjectCapabilityUpdateInput";

    public static final String Publishable = "publishable";

    public static final String Translatable = "translatable";

    public static final String Renderable = "renderable";

    public static final String OnlineStore = "onlineStore";
  }

  public static class METAOBJECTCREATEINPUT {
    public static final String TYPE_NAME = "MetaobjectCreateInput";

    public static final String Type = "type";

    public static final String Handle = "handle";

    public static final String Fields = "fields";

    public static final String Capabilities = "capabilities";
  }

  public static class METAOBJECTDEFINITIONCREATEINPUT {
    public static final String TYPE_NAME = "MetaobjectDefinitionCreateInput";

    public static final String Name = "name";

    public static final String Description = "description";

    public static final String Type = "type";

    public static final String FieldDefinitions = "fieldDefinitions";

    public static final String Access = "access";

    public static final String DisplayNameKey = "displayNameKey";

    public static final String Capabilities = "capabilities";
  }

  public static class METAOBJECTDEFINITIONUPDATEINPUT {
    public static final String TYPE_NAME = "MetaobjectDefinitionUpdateInput";

    public static final String Name = "name";

    public static final String Description = "description";

    public static final String FieldDefinitions = "fieldDefinitions";

    public static final String Access = "access";

    public static final String DisplayNameKey = "displayNameKey";

    public static final String ResetFieldOrder = "resetFieldOrder";

    public static final String Capabilities = "capabilities";
  }

  public static class METAOBJECTFIELDDEFINITIONCREATEINPUT {
    public static final String TYPE_NAME = "MetaobjectFieldDefinitionCreateInput";

    public static final String Key = "key";

    public static final String Type = "type";

    public static final String Name = "name";

    public static final String Description = "description";

    public static final String Required = "required";

    public static final String Validations = "validations";
  }

  public static class METAOBJECTFIELDDEFINITIONDELETEINPUT {
    public static final String TYPE_NAME = "MetaobjectFieldDefinitionDeleteInput";

    public static final String Key = "key";
  }

  public static class METAOBJECTFIELDDEFINITIONOPERATIONINPUT {
    public static final String TYPE_NAME = "MetaobjectFieldDefinitionOperationInput";

    public static final String Create = "create";

    public static final String Update = "update";

    public static final String Delete = "delete";
  }

  public static class METAOBJECTFIELDDEFINITIONUPDATEINPUT {
    public static final String TYPE_NAME = "MetaobjectFieldDefinitionUpdateInput";

    public static final String Key = "key";

    public static final String Name = "name";

    public static final String Description = "description";

    public static final String Required = "required";

    public static final String Validations = "validations";
  }

  public static class METAOBJECTFIELDINPUT {
    public static final String TYPE_NAME = "MetaobjectFieldInput";

    public static final String Key = "key";

    public static final String Value = "value";
  }

  public static class METAOBJECTHANDLEINPUT {
    public static final String TYPE_NAME = "MetaobjectHandleInput";

    public static final String Type = "type";

    public static final String Handle = "handle";
  }

  public static class METAOBJECTUPDATEINPUT {
    public static final String TYPE_NAME = "MetaobjectUpdateInput";

    public static final String Handle = "handle";

    public static final String Fields = "fields";

    public static final String Capabilities = "capabilities";

    public static final String RedirectNewHandle = "redirectNewHandle";
  }

  public static class METAOBJECTUPSERTINPUT {
    public static final String TYPE_NAME = "MetaobjectUpsertInput";

    public static final String Handle = "handle";

    public static final String Fields = "fields";

    public static final String Capabilities = "capabilities";
  }

  public static class MONEYINPUT {
    public static final String TYPE_NAME = "MoneyInput";

    public static final String Amount = "amount";

    public static final String CurrencyCode = "currencyCode";
  }

  public static class MOVEINPUT {
    public static final String TYPE_NAME = "MoveInput";

    public static final String Id = "id";

    public static final String NewPosition = "newPosition";
  }

  public static class OBJECTDIMENSIONSINPUT {
    public static final String TYPE_NAME = "ObjectDimensionsInput";

    public static final String Length = "length";

    public static final String Width = "width";

    public static final String Height = "height";

    public static final String Unit = "unit";
  }

  public static class ORDERCAPTUREINPUT {
    public static final String TYPE_NAME = "OrderCaptureInput";

    public static final String Id = "id";

    public static final String ParentTransactionId = "parentTransactionId";

    public static final String Amount = "amount";

    public static final String Currency = "currency";
  }

  public static class ORDERCLOSEINPUT {
    public static final String TYPE_NAME = "OrderCloseInput";

    public static final String Id = "id";
  }

  public static class ORDEREDITAPPLIEDDISCOUNTINPUT {
    public static final String TYPE_NAME = "OrderEditAppliedDiscountInput";

    public static final String Description = "description";

    public static final String FixedValue = "fixedValue";

    public static final String PercentValue = "percentValue";
  }

  public static class ORDERINPUT {
    public static final String TYPE_NAME = "OrderInput";

    public static final String Id = "id";

    public static final String Email = "email";

    public static final String Note = "note";

    public static final String Tags = "tags";

    public static final String ShippingAddress = "shippingAddress";

    public static final String CustomAttributes = "customAttributes";

    public static final String Metafields = "metafields";

    public static final String LocalizationExtensions = "localizationExtensions";

    public static final String PoNumber = "poNumber";
  }

  public static class ORDERMARKASPAIDINPUT {
    public static final String TYPE_NAME = "OrderMarkAsPaidInput";

    public static final String Id = "id";
  }

  public static class ORDEROPENINPUT {
    public static final String TYPE_NAME = "OrderOpenInput";

    public static final String Id = "id";
  }

  public static class ORDERTRANSACTIONINPUT {
    public static final String TYPE_NAME = "OrderTransactionInput";

    public static final String Amount = "amount";

    public static final String Gateway = "gateway";

    public static final String Kind = "kind";

    public static final String OrderId = "orderId";

    public static final String ParentId = "parentId";
  }

  public static class PAYMENTCUSTOMIZATIONINPUT {
    public static final String TYPE_NAME = "PaymentCustomizationInput";

    public static final String FunctionId = "functionId";

    public static final String Title = "title";

    public static final String Enabled = "enabled";

    public static final String Metafields = "metafields";
  }

  public static class PAYMENTSCHEDULEINPUT {
    public static final String TYPE_NAME = "PaymentScheduleInput";

    public static final String IssuedAt = "issuedAt";

    public static final String DueAt = "dueAt";
  }

  public static class PAYMENTTERMSCREATEINPUT {
    public static final String TYPE_NAME = "PaymentTermsCreateInput";

    public static final String PaymentTermsTemplateId = "paymentTermsTemplateId";

    public static final String PaymentSchedules = "paymentSchedules";
  }

  public static class PAYMENTTERMSDELETEINPUT {
    public static final String TYPE_NAME = "PaymentTermsDeleteInput";

    public static final String PaymentTermsId = "paymentTermsId";
  }

  public static class PAYMENTTERMSINPUT {
    public static final String TYPE_NAME = "PaymentTermsInput";

    public static final String PaymentTermsTemplateId = "paymentTermsTemplateId";

    public static final String PaymentSchedules = "paymentSchedules";
  }

  public static class PAYMENTTERMSUPDATEINPUT {
    public static final String TYPE_NAME = "PaymentTermsUpdateInput";

    public static final String PaymentTermsId = "paymentTermsId";

    public static final String PaymentTermsAttributes = "paymentTermsAttributes";
  }

  public static class PREPAREDFULFILLMENTORDERLINEITEMSINPUT {
    public static final String TYPE_NAME = "PreparedFulfillmentOrderLineItemsInput";

    public static final String FulfillmentOrderId = "fulfillmentOrderId";
  }

  public static class PRICEINPUT {
    public static final String TYPE_NAME = "PriceInput";

    public static final String Calculation = "calculation";

    public static final String Price = "price";
  }

  public static class PRICELISTADJUSTMENTINPUT {
    public static final String TYPE_NAME = "PriceListAdjustmentInput";

    public static final String Value = "value";

    public static final String Type = "type";
  }

  public static class PRICELISTADJUSTMENTSETTINGSINPUT {
    public static final String TYPE_NAME = "PriceListAdjustmentSettingsInput";

    public static final String CompareAtMode = "compareAtMode";
  }

  public static class PRICELISTCREATEINPUT {
    public static final String TYPE_NAME = "PriceListCreateInput";

    public static final String Name = "name";

    public static final String Currency = "currency";

    public static final String Parent = "parent";

    public static final String CatalogId = "catalogId";
  }

  public static class PRICELISTPARENTCREATEINPUT {
    public static final String TYPE_NAME = "PriceListParentCreateInput";

    public static final String Adjustment = "adjustment";

    public static final String Settings = "settings";
  }

  public static class PRICELISTPARENTUPDATEINPUT {
    public static final String TYPE_NAME = "PriceListParentUpdateInput";

    public static final String Adjustment = "adjustment";

    public static final String Settings = "settings";
  }

  public static class PRICELISTPRICEINPUT {
    public static final String TYPE_NAME = "PriceListPriceInput";

    public static final String VariantId = "variantId";

    public static final String Price = "price";

    public static final String CompareAtPrice = "compareAtPrice";
  }

  public static class PRICELISTPRODUCTPRICEINPUT {
    public static final String TYPE_NAME = "PriceListProductPriceInput";

    public static final String ProductId = "productId";

    public static final String Price = "price";
  }

  public static class PRICELISTUPDATEINPUT {
    public static final String TYPE_NAME = "PriceListUpdateInput";

    public static final String Name = "name";

    public static final String Currency = "currency";

    public static final String Parent = "parent";

    public static final String CatalogId = "catalogId";
  }

  public static class PRICERULECUSTOMERSELECTIONINPUT {
    public static final String TYPE_NAME = "PriceRuleCustomerSelectionInput";

    public static final String ForAllCustomers = "forAllCustomers";

    public static final String SegmentIds = "segmentIds";

    public static final String CustomerIdsToAdd = "customerIdsToAdd";

    public static final String CustomerIdsToRemove = "customerIdsToRemove";
  }

  public static class PRICERULEDISCOUNTCODEINPUT {
    public static final String TYPE_NAME = "PriceRuleDiscountCodeInput";

    public static final String Code = "code";
  }

  public static class PRICERULEENTITLEMENTTOPREREQUISITEQUANTITYRATIOINPUT {
    public static final String TYPE_NAME = "PriceRuleEntitlementToPrerequisiteQuantityRatioInput";

    public static final String EntitlementQuantity = "entitlementQuantity";

    public static final String PrerequisiteQuantity = "prerequisiteQuantity";
  }

  public static class PRICERULEINPUT {
    public static final String TYPE_NAME = "PriceRuleInput";

    public static final String CombinesWith = "combinesWith";

    public static final String ValidityPeriod = "validityPeriod";

    public static final String OncePerCustomer = "oncePerCustomer";

    public static final String CustomerSelection = "customerSelection";

    public static final String UsageLimit = "usageLimit";

    public static final String Title = "title";

    public static final String AllocationLimit = "allocationLimit";

    public static final String AllocationMethod = "allocationMethod";

    public static final String Value = "value";

    public static final String Target = "target";

    public static final String PrerequisiteSubtotalRange = "prerequisiteSubtotalRange";

    public static final String PrerequisiteQuantityRange = "prerequisiteQuantityRange";

    public static final String PrerequisiteShippingPriceRange = "prerequisiteShippingPriceRange";

    public static final String ItemEntitlements = "itemEntitlements";

    public static final String ItemPrerequisites = "itemPrerequisites";

    public static final String ShippingEntitlements = "shippingEntitlements";

    public static final String PrerequisiteToEntitlementQuantityRatio = "prerequisiteToEntitlementQuantityRatio";
  }

  public static class PRICERULEITEMENTITLEMENTSINPUT {
    public static final String TYPE_NAME = "PriceRuleItemEntitlementsInput";

    public static final String TargetAllLineItems = "targetAllLineItems";

    public static final String ProductIds = "productIds";

    public static final String ProductVariantIds = "productVariantIds";

    public static final String CollectionIds = "collectionIds";
  }

  public static class PRICERULEITEMPREREQUISITESINPUT {
    public static final String TYPE_NAME = "PriceRuleItemPrerequisitesInput";

    public static final String ProductIds = "productIds";

    public static final String ProductVariantIds = "productVariantIds";

    public static final String CollectionIds = "collectionIds";
  }

  public static class PRICERULEMONEYRANGEINPUT {
    public static final String TYPE_NAME = "PriceRuleMoneyRangeInput";

    public static final String LessThan = "lessThan";

    public static final String LessThanOrEqualTo = "lessThanOrEqualTo";

    public static final String GreaterThan = "greaterThan";

    public static final String GreaterThanOrEqualTo = "greaterThanOrEqualTo";
  }

  public static class PRICERULEPREREQUISITETOENTITLEMENTQUANTITYRATIOINPUT {
    public static final String TYPE_NAME = "PriceRulePrerequisiteToEntitlementQuantityRatioInput";

    public static final String EntitlementQuantity = "entitlementQuantity";

    public static final String PrerequisiteQuantity = "prerequisiteQuantity";
  }

  public static class PRICERULEQUANTITYRANGEINPUT {
    public static final String TYPE_NAME = "PriceRuleQuantityRangeInput";

    public static final String LessThan = "lessThan";

    public static final String LessThanOrEqualTo = "lessThanOrEqualTo";

    public static final String GreaterThan = "greaterThan";

    public static final String GreaterThanOrEqualTo = "greaterThanOrEqualTo";
  }

  public static class PRICERULESHIPPINGENTITLEMENTSINPUT {
    public static final String TYPE_NAME = "PriceRuleShippingEntitlementsInput";

    public static final String TargetAllShippingLines = "targetAllShippingLines";

    public static final String CountryCodes = "countryCodes";

    public static final String IncludeRestOfWorld = "includeRestOfWorld";
  }

  public static class PRICERULEVALIDITYPERIODINPUT {
    public static final String TYPE_NAME = "PriceRuleValidityPeriodInput";

    public static final String Start = "start";

    public static final String End = "end";
  }

  public static class PRICERULEVALUEINPUT {
    public static final String TYPE_NAME = "PriceRuleValueInput";

    public static final String PercentageValue = "percentageValue";

    public static final String FixedAmountValue = "fixedAmountValue";
  }

  public static class PRIVATEMETAFIELDDELETEINPUT {
    public static final String TYPE_NAME = "PrivateMetafieldDeleteInput";

    public static final String Owner = "owner";

    public static final String Namespace = "namespace";

    public static final String Key = "key";
  }

  public static class PRIVATEMETAFIELDINPUT {
    public static final String TYPE_NAME = "PrivateMetafieldInput";

    public static final String Owner = "owner";

    public static final String Namespace = "namespace";

    public static final String Key = "key";

    public static final String ValueInput = "valueInput";
  }

  public static class PRIVATEMETAFIELDVALUEINPUT {
    public static final String TYPE_NAME = "PrivateMetafieldValueInput";

    public static final String Value = "value";

    public static final String ValueType = "valueType";
  }

  public static class PRODUCTAPPENDIMAGESINPUT {
    public static final String TYPE_NAME = "ProductAppendImagesInput";

    public static final String Id = "id";

    public static final String Images = "images";
  }

  public static class PRODUCTCATEGORYINPUT {
    public static final String TYPE_NAME = "ProductCategoryInput";

    public static final String ProductTaxonomyNodeId = "productTaxonomyNodeId";
  }

  public static class PRODUCTCLAIMOWNERSHIPINPUT {
    public static final String TYPE_NAME = "ProductClaimOwnershipInput";

    public static final String Bundles = "bundles";
  }

  public static class PRODUCTDELETEINPUT {
    public static final String TYPE_NAME = "ProductDeleteInput";

    public static final String Id = "id";
  }

  public static class PRODUCTDUPLICATEASYNCINPUT {
    public static final String TYPE_NAME = "ProductDuplicateAsyncInput";

    public static final String ProductId = "productId";

    public static final String NewTitle = "newTitle";

    public static final String NewStatus = "newStatus";

    public static final String IncludeImages = "includeImages";
  }

  public static class PRODUCTFEEDINPUT {
    public static final String TYPE_NAME = "ProductFeedInput";

    public static final String Language = "language";

    public static final String Country = "country";
  }

  public static class PRODUCTINPUT {
    public static final String TYPE_NAME = "ProductInput";

    public static final String DescriptionHtml = "descriptionHtml";

    public static final String Handle = "handle";

    public static final String Seo = "seo";

    public static final String ProductType = "productType";

    public static final String CustomProductType = "customProductType";

    public static final String Tags = "tags";

    public static final String TemplateSuffix = "templateSuffix";

    public static final String GiftCardTemplateSuffix = "giftCardTemplateSuffix";

    public static final String Title = "title";

    public static final String Vendor = "vendor";

    public static final String GiftCard = "giftCard";

    public static final String RedirectNewHandle = "redirectNewHandle";

    public static final String CollectionsToJoin = "collectionsToJoin";

    public static final String CollectionsToLeave = "collectionsToLeave";

    public static final String Id = "id";

    public static final String Metafields = "metafields";

    public static final String Status = "status";

    public static final String RequiresSellingPlan = "requiresSellingPlan";

    public static final String ClaimOwnership = "claimOwnership";
  }

  public static class PRODUCTPUBLICATIONINPUT {
    public static final String TYPE_NAME = "ProductPublicationInput";

    public static final String PublicationId = "publicationId";

    public static final String PublishDate = "publishDate";
  }

  public static class PRODUCTPUBLISHINPUT {
    public static final String TYPE_NAME = "ProductPublishInput";

    public static final String Id = "id";

    public static final String ProductPublications = "productPublications";
  }

  public static class PRODUCTRESOURCEFEEDBACKINPUT {
    public static final String TYPE_NAME = "ProductResourceFeedbackInput";

    public static final String ProductId = "productId";

    public static final String State = "state";

    public static final String FeedbackGeneratedAt = "feedbackGeneratedAt";

    public static final String ProductUpdatedAt = "productUpdatedAt";

    public static final String Messages = "messages";
  }

  public static class PRODUCTUNPUBLISHINPUT {
    public static final String TYPE_NAME = "ProductUnpublishInput";

    public static final String Id = "id";

    public static final String ProductPublications = "productPublications";
  }

  public static class PRODUCTVARIANTAPPENDMEDIAINPUT {
    public static final String TYPE_NAME = "ProductVariantAppendMediaInput";

    public static final String VariantId = "variantId";

    public static final String MediaIds = "mediaIds";
  }

  public static class PRODUCTVARIANTDETACHMEDIAINPUT {
    public static final String TYPE_NAME = "ProductVariantDetachMediaInput";

    public static final String VariantId = "variantId";

    public static final String MediaIds = "mediaIds";
  }

  public static class PRODUCTVARIANTGROUPRELATIONSHIPINPUT {
    public static final String TYPE_NAME = "ProductVariantGroupRelationshipInput";

    public static final String Id = "id";

    public static final String Quantity = "quantity";
  }

  public static class PRODUCTVARIANTINPUT {
    public static final String TYPE_NAME = "ProductVariantInput";

    public static final String RequiresComponents = "requiresComponents";

    public static final String Barcode = "barcode";

    public static final String CompareAtPrice = "compareAtPrice";

    public static final String Id = "id";

    public static final String MediaId = "mediaId";

    public static final String MediaSrc = "mediaSrc";

    public static final String InventoryPolicy = "inventoryPolicy";

    public static final String InventoryQuantities = "inventoryQuantities";

    public static final String InventoryItem = "inventoryItem";

    public static final String Metafields = "metafields";

    public static final String Options = "options";

    public static final String Position = "position";

    public static final String Price = "price";

    public static final String ProductId = "productId";

    public static final String Taxable = "taxable";

    public static final String TaxCode = "taxCode";
  }

  public static class PRODUCTVARIANTPOSITIONINPUT {
    public static final String TYPE_NAME = "ProductVariantPositionInput";

    public static final String Id = "id";

    public static final String Position = "position";
  }

  public static class PRODUCTVARIANTRELATIONSHIPUPDATEINPUT {
    public static final String TYPE_NAME = "ProductVariantRelationshipUpdateInput";

    public static final String ParentProductVariantId = "parentProductVariantId";

    public static final String ParentProductId = "parentProductId";

    public static final String ProductVariantRelationshipsToCreate = "productVariantRelationshipsToCreate";

    public static final String ProductVariantRelationshipsToUpdate = "productVariantRelationshipsToUpdate";

    public static final String ProductVariantRelationshipsToRemove = "productVariantRelationshipsToRemove";

    public static final String RemoveAllProductVariantRelationships = "removeAllProductVariantRelationships";

    public static final String PriceInput = "priceInput";
  }

  public static class PRODUCTVARIANTSBULKINPUT {
    public static final String TYPE_NAME = "ProductVariantsBulkInput";

    public static final String Barcode = "barcode";

    public static final String CompareAtPrice = "compareAtPrice";

    public static final String Id = "id";

    public static final String MediaSrc = "mediaSrc";

    public static final String InventoryPolicy = "inventoryPolicy";

    public static final String InventoryQuantities = "inventoryQuantities";

    public static final String InventoryItem = "inventoryItem";

    public static final String MediaId = "mediaId";

    public static final String Metafields = "metafields";

    public static final String Price = "price";

    public static final String Taxable = "taxable";

    public static final String TaxCode = "taxCode";
  }

  public static class PUBLICATIONCREATEINPUT {
    public static final String TYPE_NAME = "PublicationCreateInput";

    public static final String CatalogId = "catalogId";

    public static final String DefaultState = "defaultState";

    public static final String AutoPublish = "autoPublish";
  }

  public static class PUBLICATIONINPUT {
    public static final String TYPE_NAME = "PublicationInput";

    public static final String PublicationId = "publicationId";

    public static final String PublishDate = "publishDate";
  }

  public static class PUBLICATIONUPDATEINPUT {
    public static final String TYPE_NAME = "PublicationUpdateInput";

    public static final String PublishablesToAdd = "publishablesToAdd";

    public static final String PublishablesToRemove = "publishablesToRemove";

    public static final String AutoPublish = "autoPublish";
  }

  public static class PUBSUBWEBHOOKSUBSCRIPTIONINPUT {
    public static final String TYPE_NAME = "PubSubWebhookSubscriptionInput";

    public static final String PubSubProject = "pubSubProject";

    public static final String PubSubTopic = "pubSubTopic";

    public static final String Format = "format";

    public static final String IncludeFields = "includeFields";

    public static final String MetafieldNamespaces = "metafieldNamespaces";
  }

  public static class PURCHASINGCOMPANYINPUT {
    public static final String TYPE_NAME = "PurchasingCompanyInput";

    public static final String CompanyId = "companyId";

    public static final String CompanyContactId = "companyContactId";

    public static final String CompanyLocationId = "companyLocationId";
  }

  public static class PURCHASINGENTITYINPUT {
    public static final String TYPE_NAME = "PurchasingEntityInput";

    public static final String CustomerId = "customerId";

    public static final String PurchasingCompany = "purchasingCompany";
  }

  public static class QUANTITYPRICEBREAKINPUT {
    public static final String TYPE_NAME = "QuantityPriceBreakInput";

    public static final String VariantId = "variantId";

    public static final String Price = "price";

    public static final String MinimumQuantity = "minimumQuantity";
  }

  public static class QUANTITYPRICINGBYVARIANTUPDATEINPUT {
    public static final String TYPE_NAME = "QuantityPricingByVariantUpdateInput";

    public static final String QuantityPriceBreaksToAdd = "quantityPriceBreaksToAdd";

    public static final String QuantityPriceBreaksToDelete = "quantityPriceBreaksToDelete";

    public static final String QuantityRulesToAdd = "quantityRulesToAdd";

    public static final String QuantityRulesToDeleteByVariantId = "quantityRulesToDeleteByVariantId";

    public static final String PricesToAdd = "pricesToAdd";

    public static final String PricesToDeleteByVariantId = "pricesToDeleteByVariantId";
  }

  public static class QUANTITYRULEINPUT {
    public static final String TYPE_NAME = "QuantityRuleInput";

    public static final String Increment = "increment";

    public static final String Maximum = "maximum";

    public static final String Minimum = "minimum";

    public static final String VariantId = "variantId";
  }

  public static class REFUNDDUTYINPUT {
    public static final String TYPE_NAME = "RefundDutyInput";

    public static final String DutyId = "dutyId";

    public static final String RefundType = "refundType";
  }

  public static class REFUNDINPUT {
    public static final String TYPE_NAME = "RefundInput";

    public static final String Currency = "currency";

    public static final String OrderId = "orderId";

    public static final String Note = "note";

    public static final String Notify = "notify";

    public static final String Shipping = "shipping";

    public static final String RefundLineItems = "refundLineItems";

    public static final String RefundDuties = "refundDuties";

    public static final String Transactions = "transactions";
  }

  public static class REFUNDLINEITEMINPUT {
    public static final String TYPE_NAME = "RefundLineItemInput";

    public static final String LineItemId = "lineItemId";

    public static final String Quantity = "quantity";

    public static final String RestockType = "restockType";

    public static final String LocationId = "locationId";
  }

  public static class REFUNDSHIPPINGINPUT {
    public static final String TYPE_NAME = "RefundShippingInput";

    public static final String ShippingRefundAmount = "shippingRefundAmount";

    public static final String FullRefund = "fullRefund";
  }

  public static class REMOTEAUTHORIZENETCUSTOMERPAYMENTPROFILEINPUT {
    public static final String TYPE_NAME = "RemoteAuthorizeNetCustomerPaymentProfileInput";

    public static final String CustomerProfileId = "customerProfileId";

    public static final String CustomerPaymentProfileId = "customerPaymentProfileId";
  }

  public static class REMOTEBRAINTREEPAYMENTMETHODINPUT {
    public static final String TYPE_NAME = "RemoteBraintreePaymentMethodInput";

    public static final String CustomerId = "customerId";

    public static final String PaymentMethodToken = "paymentMethodToken";
  }

  public static class REMOTESTRIPEPAYMENTMETHODINPUT {
    public static final String TYPE_NAME = "RemoteStripePaymentMethodInput";

    public static final String CustomerId = "customerId";

    public static final String PaymentMethodId = "paymentMethodId";
  }

  public static class RESOURCEFEEDBACKCREATEINPUT {
    public static final String TYPE_NAME = "ResourceFeedbackCreateInput";

    public static final String FeedbackGeneratedAt = "feedbackGeneratedAt";

    public static final String Messages = "messages";

    public static final String State = "state";
  }

  public static class RETURNAPPROVEREQUESTINPUT {
    public static final String TYPE_NAME = "ReturnApproveRequestInput";

    public static final String Id = "id";
  }

  public static class RETURNDECLINEREQUESTINPUT {
    public static final String TYPE_NAME = "ReturnDeclineRequestInput";

    public static final String Id = "id";

    public static final String DeclineReason = "declineReason";
  }

  public static class RETURNINPUT {
    public static final String TYPE_NAME = "ReturnInput";

    public static final String RequestedAt = "requestedAt";

    public static final String OrderId = "orderId";

    public static final String ReturnLineItems = "returnLineItems";

    public static final String NotifyCustomer = "notifyCustomer";
  }

  public static class RETURNLINEITEMINPUT {
    public static final String TYPE_NAME = "ReturnLineItemInput";

    public static final String Quantity = "quantity";

    public static final String ReturnReason = "returnReason";

    public static final String ReturnReasonNote = "returnReasonNote";

    public static final String FulfillmentLineItemId = "fulfillmentLineItemId";
  }

  public static class RETURNREFUNDINPUT {
    public static final String TYPE_NAME = "ReturnRefundInput";

    public static final String ReturnId = "returnId";

    public static final String ReturnRefundLineItems = "returnRefundLineItems";

    public static final String RefundShipping = "refundShipping";

    public static final String RefundDuties = "refundDuties";

    public static final String OrderTransactions = "orderTransactions";

    public static final String NotifyCustomer = "notifyCustomer";
  }

  public static class RETURNREFUNDLINEITEMINPUT {
    public static final String TYPE_NAME = "ReturnRefundLineItemInput";

    public static final String ReturnLineItemId = "returnLineItemId";

    public static final String Quantity = "quantity";
  }

  public static class RETURNREFUNDORDERTRANSACTIONINPUT {
    public static final String TYPE_NAME = "ReturnRefundOrderTransactionInput";

    public static final String TransactionAmount = "transactionAmount";

    public static final String ParentId = "parentId";
  }

  public static class RETURNREQUESTINPUT {
    public static final String TYPE_NAME = "ReturnRequestInput";

    public static final String OrderId = "orderId";

    public static final String ReturnLineItems = "returnLineItems";
  }

  public static class RETURNREQUESTLINEITEMINPUT {
    public static final String TYPE_NAME = "ReturnRequestLineItemInput";

    public static final String FulfillmentLineItemId = "fulfillmentLineItemId";

    public static final String Quantity = "quantity";

    public static final String ReturnReason = "returnReason";

    public static final String CustomerNote = "customerNote";
  }

  public static class REVERSEDELIVERYDISPOSEINPUT {
    public static final String TYPE_NAME = "ReverseDeliveryDisposeInput";

    public static final String ReverseDeliveryLineItemId = "reverseDeliveryLineItemId";

    public static final String Quantity = "quantity";

    public static final String DispositionType = "dispositionType";

    public static final String LocationId = "locationId";
  }

  public static class REVERSEDELIVERYLABELINPUT {
    public static final String TYPE_NAME = "ReverseDeliveryLabelInput";

    public static final String FileUrl = "fileUrl";
  }

  public static class REVERSEDELIVERYLINEITEMINPUT {
    public static final String TYPE_NAME = "ReverseDeliveryLineItemInput";

    public static final String ReverseFulfillmentOrderLineItemId = "reverseFulfillmentOrderLineItemId";

    public static final String Quantity = "quantity";
  }

  public static class REVERSEDELIVERYTRACKINGINPUT {
    public static final String TYPE_NAME = "ReverseDeliveryTrackingInput";

    public static final String Number = "number";

    public static final String Url = "url";
  }

  public static class REVERSEFULFILLMENTORDERDISPOSEINPUT {
    public static final String TYPE_NAME = "ReverseFulfillmentOrderDisposeInput";

    public static final String ReverseFulfillmentOrderLineItemId = "reverseFulfillmentOrderLineItemId";

    public static final String Quantity = "quantity";

    public static final String LocationId = "locationId";

    public static final String DispositionType = "dispositionType";
  }

  public static class SAVEDSEARCHCREATEINPUT {
    public static final String TYPE_NAME = "SavedSearchCreateInput";

    public static final String ResourceType = "resourceType";

    public static final String Name = "name";

    public static final String Query = "query";
  }

  public static class SAVEDSEARCHDELETEINPUT {
    public static final String TYPE_NAME = "SavedSearchDeleteInput";

    public static final String Id = "id";
  }

  public static class SAVEDSEARCHUPDATEINPUT {
    public static final String TYPE_NAME = "SavedSearchUpdateInput";

    public static final String Id = "id";

    public static final String Name = "name";

    public static final String Query = "query";
  }

  public static class SCRIPTTAGINPUT {
    public static final String TYPE_NAME = "ScriptTagInput";

    public static final String Src = "src";

    public static final String DisplayScope = "displayScope";

    public static final String Cache = "cache";
  }

  public static class SELLINGPLANANCHORINPUT {
    public static final String TYPE_NAME = "SellingPlanAnchorInput";

    public static final String Type = "type";

    public static final String Day = "day";

    public static final String Month = "month";

    public static final String CutoffDay = "cutoffDay";
  }

  public static class SELLINGPLANBILLINGPOLICYINPUT {
    public static final String TYPE_NAME = "SellingPlanBillingPolicyInput";

    public static final String Fixed = "fixed";

    public static final String Recurring = "recurring";
  }

  public static class SELLINGPLANCHECKOUTCHARGEINPUT {
    public static final String TYPE_NAME = "SellingPlanCheckoutChargeInput";

    public static final String Type = "type";

    public static final String Value = "value";
  }

  public static class SELLINGPLANCHECKOUTCHARGEVALUEINPUT {
    public static final String TYPE_NAME = "SellingPlanCheckoutChargeValueInput";

    public static final String Percentage = "percentage";

    public static final String FixedValue = "fixedValue";
  }

  public static class SELLINGPLANDELIVERYPOLICYINPUT {
    public static final String TYPE_NAME = "SellingPlanDeliveryPolicyInput";

    public static final String Fixed = "fixed";

    public static final String Recurring = "recurring";
  }

  public static class SELLINGPLANFIXEDBILLINGPOLICYINPUT {
    public static final String TYPE_NAME = "SellingPlanFixedBillingPolicyInput";

    public static final String RemainingBalanceChargeTrigger = "remainingBalanceChargeTrigger";

    public static final String RemainingBalanceChargeExactTime = "remainingBalanceChargeExactTime";

    public static final String RemainingBalanceChargeTimeAfterCheckout = "remainingBalanceChargeTimeAfterCheckout";

    public static final String CheckoutCharge = "checkoutCharge";
  }

  public static class SELLINGPLANFIXEDDELIVERYPOLICYINPUT {
    public static final String TYPE_NAME = "SellingPlanFixedDeliveryPolicyInput";

    public static final String Anchors = "anchors";

    public static final String FulfillmentTrigger = "fulfillmentTrigger";

    public static final String FulfillmentExactTime = "fulfillmentExactTime";

    public static final String Cutoff = "cutoff";

    public static final String Intent = "intent";

    public static final String PreAnchorBehavior = "preAnchorBehavior";
  }

  public static class SELLINGPLANFIXEDPRICINGPOLICYINPUT {
    public static final String TYPE_NAME = "SellingPlanFixedPricingPolicyInput";

    public static final String Id = "id";

    public static final String AdjustmentType = "adjustmentType";

    public static final String AdjustmentValue = "adjustmentValue";
  }

  public static class SELLINGPLANGROUPINPUT {
    public static final String TYPE_NAME = "SellingPlanGroupInput";

    public static final String Name = "name";

    public static final String AppId = "appId";

    public static final String MerchantCode = "merchantCode";

    public static final String Description = "description";

    public static final String SellingPlansToCreate = "sellingPlansToCreate";

    public static final String SellingPlansToUpdate = "sellingPlansToUpdate";

    public static final String SellingPlansToDelete = "sellingPlansToDelete";

    public static final String Options = "options";

    public static final String Position = "position";
  }

  public static class SELLINGPLANGROUPRESOURCEINPUT {
    public static final String TYPE_NAME = "SellingPlanGroupResourceInput";

    public static final String ProductVariantIds = "productVariantIds";

    public static final String ProductIds = "productIds";
  }

  public static class SELLINGPLANINPUT {
    public static final String TYPE_NAME = "SellingPlanInput";

    public static final String Id = "id";

    public static final String Name = "name";

    public static final String Description = "description";

    public static final String BillingPolicy = "billingPolicy";

    public static final String DeliveryPolicy = "deliveryPolicy";

    public static final String InventoryPolicy = "inventoryPolicy";

    public static final String PricingPolicies = "pricingPolicies";

    public static final String Options = "options";

    public static final String Position = "position";

    public static final String Category = "category";
  }

  public static class SELLINGPLANINVENTORYPOLICYINPUT {
    public static final String TYPE_NAME = "SellingPlanInventoryPolicyInput";

    public static final String Reserve = "reserve";
  }

  public static class SELLINGPLANPRICINGPOLICYINPUT {
    public static final String TYPE_NAME = "SellingPlanPricingPolicyInput";

    public static final String Recurring = "recurring";

    public static final String Fixed = "fixed";
  }

  public static class SELLINGPLANPRICINGPOLICYVALUEINPUT {
    public static final String TYPE_NAME = "SellingPlanPricingPolicyValueInput";

    public static final String Percentage = "percentage";

    public static final String FixedValue = "fixedValue";
  }

  public static class SELLINGPLANRECURRINGBILLINGPOLICYINPUT {
    public static final String TYPE_NAME = "SellingPlanRecurringBillingPolicyInput";

    public static final String Interval = "interval";

    public static final String IntervalCount = "intervalCount";

    public static final String Anchors = "anchors";

    public static final String MinCycles = "minCycles";

    public static final String MaxCycles = "maxCycles";
  }

  public static class SELLINGPLANRECURRINGDELIVERYPOLICYINPUT {
    public static final String TYPE_NAME = "SellingPlanRecurringDeliveryPolicyInput";

    public static final String Interval = "interval";

    public static final String IntervalCount = "intervalCount";

    public static final String Anchors = "anchors";

    public static final String Cutoff = "cutoff";

    public static final String Intent = "intent";

    public static final String PreAnchorBehavior = "preAnchorBehavior";
  }

  public static class SELLINGPLANRECURRINGPRICINGPOLICYINPUT {
    public static final String TYPE_NAME = "SellingPlanRecurringPricingPolicyInput";

    public static final String Id = "id";

    public static final String AdjustmentType = "adjustmentType";

    public static final String AdjustmentValue = "adjustmentValue";

    public static final String AfterCycle = "afterCycle";
  }

  public static class SEOINPUT {
    public static final String TYPE_NAME = "SEOInput";

    public static final String Title = "title";

    public static final String Description = "description";
  }

  public static class SHIPPINGLINEINPUT {
    public static final String TYPE_NAME = "ShippingLineInput";

    public static final String Price = "price";

    public static final String ShippingRateHandle = "shippingRateHandle";

    public static final String Title = "title";
  }

  public static class SHIPPINGREFUNDINPUT {
    public static final String TYPE_NAME = "ShippingRefundInput";

    public static final String Amount = "amount";

    public static final String FullRefund = "fullRefund";
  }

  public static class SHOPIFYPAYMENTSDISPUTEEVIDENCEUPDATEINPUT {
    public static final String TYPE_NAME = "ShopifyPaymentsDisputeEvidenceUpdateInput";

    public static final String CustomerEmailAddress = "customerEmailAddress";

    public static final String CustomerLastName = "customerLastName";

    public static final String CustomerFirstName = "customerFirstName";

    public static final String ShippingAddress = "shippingAddress";

    public static final String UncategorizedText = "uncategorizedText";

    public static final String AccessActivityLog = "accessActivityLog";

    public static final String CancellationPolicyDisclosure = "cancellationPolicyDisclosure";

    public static final String CancellationRebuttal = "cancellationRebuttal";

    public static final String RefundPolicyDisclosure = "refundPolicyDisclosure";

    public static final String RefundRefusalExplanation = "refundRefusalExplanation";

    public static final String CancellationPolicyFile = "cancellationPolicyFile";

    public static final String CustomerCommunicationFile = "customerCommunicationFile";

    public static final String RefundPolicyFile = "refundPolicyFile";

    public static final String ShippingDocumentationFile = "shippingDocumentationFile";

    public static final String UncategorizedFile = "uncategorizedFile";

    public static final String ServiceDocumentationFile = "serviceDocumentationFile";

    public static final String SubmitEvidence = "submitEvidence";
  }

  public static class SHOPIFYPAYMENTSDISPUTEFILEUPLOADUPDATEINPUT {
    public static final String TYPE_NAME = "ShopifyPaymentsDisputeFileUploadUpdateInput";

    public static final String Id = "id";

    public static final String Destroy = "destroy";
  }

  public static class SHOPLOCALEINPUT {
    public static final String TYPE_NAME = "ShopLocaleInput";

    public static final String Published = "published";

    public static final String MarketWebPresenceIds = "marketWebPresenceIds";
  }

  public static class SHOPPOLICYINPUT {
    public static final String TYPE_NAME = "ShopPolicyInput";

    public static final String Type = "type";

    public static final String Body = "body";
  }

  public static class STAGEDUPLOADINPUT {
    public static final String TYPE_NAME = "StagedUploadInput";

    public static final String Resource = "resource";

    public static final String Filename = "filename";

    public static final String MimeType = "mimeType";

    public static final String HttpMethod = "httpMethod";

    public static final String FileSize = "fileSize";
  }

  public static class STAGEDUPLOADTARGETGENERATEINPUT {
    public static final String TYPE_NAME = "StagedUploadTargetGenerateInput";

    public static final String Resource = "resource";

    public static final String Filename = "filename";

    public static final String MimeType = "mimeType";

    public static final String HttpMethod = "httpMethod";

    public static final String FileSize = "fileSize";
  }

  public static class STAGEIMAGEINPUT {
    public static final String TYPE_NAME = "StageImageInput";

    public static final String Resource = "resource";

    public static final String Filename = "filename";

    public static final String MimeType = "mimeType";

    public static final String HttpMethod = "httpMethod";
  }

  public static class STANDARDIZEDPRODUCTTYPEINPUT {
    public static final String TYPE_NAME = "StandardizedProductTypeInput";

    public static final String ProductTaxonomyNodeId = "productTaxonomyNodeId";
  }

  public static class STOREFRONTACCESSTOKENDELETEINPUT {
    public static final String TYPE_NAME = "StorefrontAccessTokenDeleteInput";

    public static final String Id = "id";
  }

  public static class STOREFRONTACCESSTOKENINPUT {
    public static final String TYPE_NAME = "StorefrontAccessTokenInput";

    public static final String Title = "title";
  }

  public static class SUBSCRIPTIONATOMICLINEINPUT {
    public static final String TYPE_NAME = "SubscriptionAtomicLineInput";

    public static final String Line = "line";

    public static final String Discounts = "discounts";
  }

  public static class SUBSCRIPTIONATOMICMANUALDISCOUNTINPUT {
    public static final String TYPE_NAME = "SubscriptionAtomicManualDiscountInput";

    public static final String Title = "title";

    public static final String Value = "value";

    public static final String RecurringCycleLimit = "recurringCycleLimit";
  }

  public static class SUBSCRIPTIONBILLINGATTEMPTINPUT {
    public static final String TYPE_NAME = "SubscriptionBillingAttemptInput";

    public static final String IdempotencyKey = "idempotencyKey";

    public static final String OriginTime = "originTime";

    public static final String BillingCycleSelector = "billingCycleSelector";
  }

  public static class SUBSCRIPTIONBILLINGCYCLEINPUT {
    public static final String TYPE_NAME = "SubscriptionBillingCycleInput";

    public static final String ContractId = "contractId";

    public static final String Selector = "selector";
  }

  public static class SUBSCRIPTIONBILLINGCYCLESCHEDULEEDITINPUT {
    public static final String TYPE_NAME = "SubscriptionBillingCycleScheduleEditInput";

    public static final String Skip = "skip";

    public static final String BillingDate = "billingDate";

    public static final String Reason = "reason";
  }

  public static class SUBSCRIPTIONBILLINGCYCLESDATERANGESELECTOR {
    public static final String TYPE_NAME = "SubscriptionBillingCyclesDateRangeSelector";

    public static final String StartDate = "startDate";

    public static final String EndDate = "endDate";
  }

  public static class SUBSCRIPTIONBILLINGCYCLESELECTOR {
    public static final String TYPE_NAME = "SubscriptionBillingCycleSelector";

    public static final String Index = "index";

    public static final String Date = "date";
  }

  public static class SUBSCRIPTIONBILLINGCYCLESINDEXRANGESELECTOR {
    public static final String TYPE_NAME = "SubscriptionBillingCyclesIndexRangeSelector";

    public static final String StartIndex = "startIndex";

    public static final String EndIndex = "endIndex";
  }

  public static class SUBSCRIPTIONBILLINGPOLICYINPUT {
    public static final String TYPE_NAME = "SubscriptionBillingPolicyInput";

    public static final String Interval = "interval";

    public static final String IntervalCount = "intervalCount";

    public static final String MinCycles = "minCycles";

    public static final String MaxCycles = "maxCycles";

    public static final String Anchors = "anchors";
  }

  public static class SUBSCRIPTIONCONTRACTATOMICCREATEINPUT {
    public static final String TYPE_NAME = "SubscriptionContractAtomicCreateInput";

    public static final String CustomerId = "customerId";

    public static final String NextBillingDate = "nextBillingDate";

    public static final String CurrencyCode = "currencyCode";

    public static final String Contract = "contract";

    public static final String Lines = "lines";

    public static final String DiscountCodes = "discountCodes";
  }

  public static class SUBSCRIPTIONCONTRACTCREATEINPUT {
    public static final String TYPE_NAME = "SubscriptionContractCreateInput";

    public static final String CustomerId = "customerId";

    public static final String NextBillingDate = "nextBillingDate";

    public static final String CurrencyCode = "currencyCode";

    public static final String Contract = "contract";
  }

  public static class SUBSCRIPTIONCONTRACTPRODUCTCHANGEINPUT {
    public static final String TYPE_NAME = "SubscriptionContractProductChangeInput";

    public static final String ProductVariantId = "productVariantId";

    public static final String CurrentPrice = "currentPrice";
  }

  public static class SUBSCRIPTIONDELIVERYMETHODINPUT {
    public static final String TYPE_NAME = "SubscriptionDeliveryMethodInput";

    public static final String Shipping = "shipping";

    public static final String LocalDelivery = "localDelivery";

    public static final String Pickup = "pickup";
  }

  public static class SUBSCRIPTIONDELIVERYMETHODLOCALDELIVERYINPUT {
    public static final String TYPE_NAME = "SubscriptionDeliveryMethodLocalDeliveryInput";

    public static final String Address = "address";

    public static final String LocalDeliveryOption = "localDeliveryOption";
  }

  public static class SUBSCRIPTIONDELIVERYMETHODLOCALDELIVERYOPTIONINPUT {
    public static final String TYPE_NAME = "SubscriptionDeliveryMethodLocalDeliveryOptionInput";

    public static final String Title = "title";

    public static final String PresentmentTitle = "presentmentTitle";

    public static final String Description = "description";

    public static final String Code = "code";

    public static final String Phone = "phone";

    public static final String Instructions = "instructions";
  }

  public static class SUBSCRIPTIONDELIVERYMETHODPICKUPINPUT {
    public static final String TYPE_NAME = "SubscriptionDeliveryMethodPickupInput";

    public static final String PickupOption = "pickupOption";
  }

  public static class SUBSCRIPTIONDELIVERYMETHODPICKUPOPTIONINPUT {
    public static final String TYPE_NAME = "SubscriptionDeliveryMethodPickupOptionInput";

    public static final String Title = "title";

    public static final String PresentmentTitle = "presentmentTitle";

    public static final String Description = "description";

    public static final String Code = "code";

    public static final String LocationId = "locationId";
  }

  public static class SUBSCRIPTIONDELIVERYMETHODSHIPPINGINPUT {
    public static final String TYPE_NAME = "SubscriptionDeliveryMethodShippingInput";

    public static final String Address = "address";

    public static final String ShippingOption = "shippingOption";
  }

  public static class SUBSCRIPTIONDELIVERYMETHODSHIPPINGOPTIONINPUT {
    public static final String TYPE_NAME = "SubscriptionDeliveryMethodShippingOptionInput";

    public static final String Title = "title";

    public static final String PresentmentTitle = "presentmentTitle";

    public static final String Description = "description";

    public static final String Code = "code";

    public static final String CarrierServiceId = "carrierServiceId";
  }

  public static class SUBSCRIPTIONDELIVERYPOLICYINPUT {
    public static final String TYPE_NAME = "SubscriptionDeliveryPolicyInput";

    public static final String Interval = "interval";

    public static final String IntervalCount = "intervalCount";

    public static final String Anchors = "anchors";
  }

  public static class SUBSCRIPTIONDRAFTINPUT {
    public static final String TYPE_NAME = "SubscriptionDraftInput";

    public static final String Status = "status";

    public static final String PaymentMethodId = "paymentMethodId";

    public static final String NextBillingDate = "nextBillingDate";

    public static final String BillingPolicy = "billingPolicy";

    public static final String DeliveryPolicy = "deliveryPolicy";

    public static final String DeliveryPrice = "deliveryPrice";

    public static final String DeliveryMethod = "deliveryMethod";

    public static final String Note = "note";

    public static final String CustomAttributes = "customAttributes";
  }

  public static class SUBSCRIPTIONFREESHIPPINGDISCOUNTINPUT {
    public static final String TYPE_NAME = "SubscriptionFreeShippingDiscountInput";

    public static final String Title = "title";

    public static final String RecurringCycleLimit = "recurringCycleLimit";
  }

  public static class SUBSCRIPTIONLINEINPUT {
    public static final String TYPE_NAME = "SubscriptionLineInput";

    public static final String ProductVariantId = "productVariantId";

    public static final String Quantity = "quantity";

    public static final String CurrentPrice = "currentPrice";

    public static final String CustomAttributes = "customAttributes";

    public static final String SellingPlanId = "sellingPlanId";

    public static final String SellingPlanName = "sellingPlanName";

    public static final String PricingPolicy = "pricingPolicy";
  }

  public static class SUBSCRIPTIONLINEUPDATEINPUT {
    public static final String TYPE_NAME = "SubscriptionLineUpdateInput";

    public static final String ProductVariantId = "productVariantId";

    public static final String Quantity = "quantity";

    public static final String SellingPlanId = "sellingPlanId";

    public static final String SellingPlanName = "sellingPlanName";

    public static final String CurrentPrice = "currentPrice";

    public static final String CustomAttributes = "customAttributes";

    public static final String PricingPolicy = "pricingPolicy";
  }

  public static class SUBSCRIPTIONMANUALDISCOUNTENTITLEDLINESINPUT {
    public static final String TYPE_NAME = "SubscriptionManualDiscountEntitledLinesInput";

    public static final String All = "all";

    public static final String Lines = "lines";
  }

  public static class SUBSCRIPTIONMANUALDISCOUNTFIXEDAMOUNTINPUT {
    public static final String TYPE_NAME = "SubscriptionManualDiscountFixedAmountInput";

    public static final String Amount = "amount";

    public static final String AppliesOnEachItem = "appliesOnEachItem";
  }

  public static class SUBSCRIPTIONMANUALDISCOUNTINPUT {
    public static final String TYPE_NAME = "SubscriptionManualDiscountInput";

    public static final String Title = "title";

    public static final String Value = "value";

    public static final String RecurringCycleLimit = "recurringCycleLimit";

    public static final String EntitledLines = "entitledLines";
  }

  public static class SUBSCRIPTIONMANUALDISCOUNTLINESINPUT {
    public static final String TYPE_NAME = "SubscriptionManualDiscountLinesInput";

    public static final String Add = "add";

    public static final String Remove = "remove";
  }

  public static class SUBSCRIPTIONMANUALDISCOUNTVALUEINPUT {
    public static final String TYPE_NAME = "SubscriptionManualDiscountValueInput";

    public static final String Percentage = "percentage";

    public static final String FixedAmount = "fixedAmount";
  }

  public static class SUBSCRIPTIONPRICINGPOLICYCYCLEDISCOUNTSINPUT {
    public static final String TYPE_NAME = "SubscriptionPricingPolicyCycleDiscountsInput";

    public static final String AfterCycle = "afterCycle";

    public static final String AdjustmentType = "adjustmentType";

    public static final String AdjustmentValue = "adjustmentValue";

    public static final String ComputedPrice = "computedPrice";
  }

  public static class SUBSCRIPTIONPRICINGPOLICYINPUT {
    public static final String TYPE_NAME = "SubscriptionPricingPolicyInput";

    public static final String BasePrice = "basePrice";

    public static final String CycleDiscounts = "cycleDiscounts";
  }

  public static class TRANSLATIONINPUT {
    public static final String TYPE_NAME = "TranslationInput";

    public static final String Locale = "locale";

    public static final String Key = "key";

    public static final String Value = "value";

    public static final String TranslatableContentDigest = "translatableContentDigest";

    public static final String MarketId = "marketId";
  }

  public static class UPDATEMEDIAINPUT {
    public static final String TYPE_NAME = "UpdateMediaInput";

    public static final String Id = "id";

    public static final String PreviewImageSource = "previewImageSource";

    public static final String Alt = "alt";
  }

  public static class URLREDIRECTINPUT {
    public static final String TYPE_NAME = "UrlRedirectInput";

    public static final String Path = "path";

    public static final String Target = "target";
  }

  public static class UTMINPUT {
    public static final String TYPE_NAME = "UTMInput";

    public static final String Campaign = "campaign";

    public static final String Source = "source";

    public static final String Medium = "medium";
  }

  public static class VALIDATIONCREATEINPUT {
    public static final String TYPE_NAME = "ValidationCreateInput";

    public static final String FunctionId = "functionId";

    public static final String Enable = "enable";

    public static final String BlockOnFailure = "blockOnFailure";

    public static final String Metafields = "metafields";
  }

  public static class VALIDATIONUPDATEINPUT {
    public static final String TYPE_NAME = "ValidationUpdateInput";

    public static final String Enable = "enable";

    public static final String BlockOnFailure = "blockOnFailure";

    public static final String Metafields = "metafields";
  }

  public static class WEBHOOKSUBSCRIPTIONINPUT {
    public static final String TYPE_NAME = "WebhookSubscriptionInput";

    public static final String CallbackUrl = "callbackUrl";

    public static final String Format = "format";

    public static final String IncludeFields = "includeFields";

    public static final String MetafieldNamespaces = "metafieldNamespaces";
  }

  public static class WEBPIXELINPUT {
    public static final String TYPE_NAME = "WebPixelInput";

    public static final String Settings = "settings";
  }

  public static class WEIGHTINPUT {
    public static final String TYPE_NAME = "WeightInput";

    public static final String Value = "value";

    public static final String Unit = "unit";
  }

  public static class APPPURCHASE {
    public static final String TYPE_NAME = "AppPurchase";

    public static final String CreatedAt = "createdAt";

    public static final String Name = "name";

    public static final String Price = "price";

    public static final String Status = "status";

    public static final String Test = "test";
  }

  public static class BASEPAYMENTDETAILS {
    public static final String TYPE_NAME = "BasePaymentDetails";

    public static final String PaymentMethodName = "paymentMethodName";
  }

  public static class CALCULATEDDISCOUNTAPPLICATION {
    public static final String TYPE_NAME = "CalculatedDiscountApplication";

    public static final String AllocationMethod = "allocationMethod";

    public static final String AppliedTo = "appliedTo";

    public static final String Description = "description";

    public static final String Id = "id";

    public static final String TargetSelection = "targetSelection";

    public static final String TargetType = "targetType";

    public static final String Value = "value";
  }

  public static class CATALOG {
    public static final String TYPE_NAME = "Catalog";

    public static final String Id = "id";

    public static final String Operations = "operations";

    public static final String PriceList = "priceList";

    public static final String Publication = "publication";

    public static final String Status = "status";

    public static final String Title = "title";
  }

  public static class CHECKOUTBRANDINGFONT {
    public static final String TYPE_NAME = "CheckoutBrandingFont";

    public static final String Sources = "sources";

    public static final String Weight = "weight";
  }

  public static class COMMENTEVENTSUBJECT {
    public static final String TYPE_NAME = "CommentEventSubject";

    public static final String HasTimelineComment = "hasTimelineComment";

    public static final String Id = "id";
  }

  public static class CUSTOMERMOMENT {
    public static final String TYPE_NAME = "CustomerMoment";

    public static final String OccurredAt = "occurredAt";
  }

  public static class DISCOUNTAPPLICATION {
    public static final String TYPE_NAME = "DiscountApplication";

    public static final String AllocationMethod = "allocationMethod";

    public static final String Index = "index";

    public static final String TargetSelection = "targetSelection";

    public static final String TargetType = "targetType";

    public static final String Value = "value";
  }

  public static class DISPLAYABLEERROR {
    public static final String TYPE_NAME = "DisplayableError";

    public static final String Field = "field";

    public static final String Message = "message";
  }

  public static class EVENT {
    public static final String TYPE_NAME = "Event";

    public static final String AppTitle = "appTitle";

    public static final String AttributeToApp = "attributeToApp";

    public static final String AttributeToUser = "attributeToUser";

    public static final String CreatedAt = "createdAt";

    public static final String CriticalAlert = "criticalAlert";

    public static final String Id = "id";

    public static final String Message = "message";
  }

  public static class FILE {
    public static final String TYPE_NAME = "File";

    public static final String Alt = "alt";

    public static final String CreatedAt = "createdAt";

    public static final String FileErrors = "fileErrors";

    public static final String FileStatus = "fileStatus";

    public static final String Id = "id";

    public static final String Preview = "preview";

    public static final String UpdatedAt = "updatedAt";
  }

  public static class HASEVENTS {
    public static final String TYPE_NAME = "HasEvents";

    public static final String Events = "events";
  }

  public static class HASLOCALIZATIONEXTENSIONS {
    public static final String TYPE_NAME = "HasLocalizationExtensions";

    public static final String LocalizationExtensions = "localizationExtensions";
  }

  public static class HASMETAFIELDDEFINITIONS {
    public static final String TYPE_NAME = "HasMetafieldDefinitions";

    public static final String MetafieldDefinitions = "metafieldDefinitions";
  }

  public static class HASMETAFIELDS {
    public static final String TYPE_NAME = "HasMetafields";

    public static final String Metafield = "metafield";

    public static final String Metafields = "metafields";

    public static final String PrivateMetafield = "privateMetafield";

    public static final String PrivateMetafields = "privateMetafields";
  }

  public static class HASPUBLISHEDTRANSLATIONS {
    public static final String TYPE_NAME = "HasPublishedTranslations";

    public static final String Translations = "translations";
  }

  public static class JOBRESULT {
    public static final String TYPE_NAME = "JobResult";

    public static final String Done = "done";

    public static final String Id = "id";
  }

  public static class LEGACYINTEROPERABILITY {
    public static final String TYPE_NAME = "LegacyInteroperability";

    public static final String LegacyResourceId = "legacyResourceId";
  }

  public static class MARKETREGION {
    public static final String TYPE_NAME = "MarketRegion";

    public static final String Id = "id";

    public static final String Name = "name";
  }

  public static class MEDIA {
    public static final String TYPE_NAME = "Media";

    public static final String Alt = "alt";

    public static final String Id = "id";

    public static final String MediaContentType = "mediaContentType";

    public static final String MediaErrors = "mediaErrors";

    public static final String MediaWarnings = "mediaWarnings";

    public static final String Preview = "preview";

    public static final String Status = "status";
  }

  public static class NAVIGABLE {
    public static final String TYPE_NAME = "Navigable";

    public static final String DefaultCursor = "defaultCursor";
  }

  public static class NODE {
    public static final String TYPE_NAME = "Node";

    public static final String Id = "id";
  }

  public static class ONLINESTOREPREVIEWABLE {
    public static final String TYPE_NAME = "OnlineStorePreviewable";

    public static final String OnlineStorePreviewUrl = "onlineStorePreviewUrl";
  }

  public static class PUBLISHABLE {
    public static final String TYPE_NAME = "Publishable";

    public static final String AvailablePublicationCount = "availablePublicationCount";

    public static final String PublicationCount = "publicationCount";

    public static final String PublishedOnChannel = "publishedOnChannel";

    public static final String PublishedOnCurrentChannel = "publishedOnCurrentChannel";

    public static final String PublishedOnCurrentPublication = "publishedOnCurrentPublication";

    public static final String PublishedOnPublication = "publishedOnPublication";

    public static final String ResourcePublications = "resourcePublications";

    public static final String ResourcePublicationsV2 = "resourcePublicationsV2";

    public static final String UnpublishedChannels = "unpublishedChannels";

    public static final String UnpublishedPublications = "unpublishedPublications";
  }

  public static class RESOURCEOPERATION {
    public static final String TYPE_NAME = "ResourceOperation";

    public static final String Id = "id";

    public static final String ProcessedRowCount = "processedRowCount";

    public static final String RowCount = "rowCount";

    public static final String Status = "status";
  }

  public static class SALE {
    public static final String TYPE_NAME = "Sale";

    public static final String ActionType = "actionType";

    public static final String Id = "id";

    public static final String LineType = "lineType";

    public static final String Quantity = "quantity";

    public static final String Taxes = "taxes";

    public static final String TotalAmount = "totalAmount";

    public static final String TotalDiscountAmountAfterTaxes = "totalDiscountAmountAfterTaxes";

    public static final String TotalDiscountAmountBeforeTaxes = "totalDiscountAmountBeforeTaxes";

    public static final String TotalTaxAmount = "totalTaxAmount";
  }

  public static class SALESAGREEMENT {
    public static final String TYPE_NAME = "SalesAgreement";

    public static final String App = "app";

    public static final String HappenedAt = "happenedAt";

    public static final String Id = "id";

    public static final String Reason = "reason";

    public static final String Sales = "sales";

    public static final String User = "user";
  }

  public static class SEGMENTFILTER {
    public static final String TYPE_NAME = "SegmentFilter";

    public static final String LocalizedName = "localizedName";

    public static final String MultiValue = "multiValue";

    public static final String QueryName = "queryName";
  }

  public static class SELLINGPLANPRICINGPOLICYBASE {
    public static final String TYPE_NAME = "SellingPlanPricingPolicyBase";

    public static final String AdjustmentType = "adjustmentType";

    public static final String AdjustmentValue = "adjustmentValue";
  }

  public static class SHOPIFYPAYMENTSCHARGESTATEMENTDESCRIPTOR {
    public static final String TYPE_NAME = "ShopifyPaymentsChargeStatementDescriptor";

    public static final String Default = "default";

    public static final String Prefix = "prefix";
  }

  public static class SHOPIFYQLRESPONSE {
    public static final String TYPE_NAME = "ShopifyqlResponse";

    public static final String ParseErrors = "parseErrors";

    public static final String TableData = "tableData";
  }

  public static class SUBSCRIPTIONCONTRACTBASE {
    public static final String TYPE_NAME = "SubscriptionContractBase";

    public static final String App = "app";

    public static final String AppAdminUrl = "appAdminUrl";

    public static final String CurrencyCode = "currencyCode";

    public static final String CustomAttributes = "customAttributes";

    public static final String Customer = "customer";

    public static final String CustomerPaymentMethod = "customerPaymentMethod";

    public static final String DeliveryMethod = "deliveryMethod";

    public static final String DeliveryPrice = "deliveryPrice";

    public static final String Discounts = "discounts";

    public static final String LineCount = "lineCount";

    public static final String Lines = "lines";

    public static final String Note = "note";

    public static final String Orders = "orders";

    public static final String UpdatedAt = "updatedAt";
  }
}
