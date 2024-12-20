package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.test.shopify.generated.types.AppInstallationCategory;
import com.test.shopify.generated.types.AppInstallationPrivacy;
import com.test.shopify.generated.types.AppInstallationSortKeys;
import com.test.shopify.generated.types.AutomaticDiscountSortKeys;
import com.test.shopify.generated.types.BulkOperationType;
import com.test.shopify.generated.types.CatalogSortKeys;
import com.test.shopify.generated.types.CatalogType;
import com.test.shopify.generated.types.CheckoutProfileSortKeys;
import com.test.shopify.generated.types.CodeDiscountSortKeys;
import com.test.shopify.generated.types.CollectionSortKeys;
import com.test.shopify.generated.types.CompanyLocationSortKeys;
import com.test.shopify.generated.types.CompanySortKeys;
import com.test.shopify.generated.types.CountryCode;
import com.test.shopify.generated.types.CustomerMergeOverrideFields;
import com.test.shopify.generated.types.CustomerSortKeys;
import com.test.shopify.generated.types.DeletionEventSortKeys;
import com.test.shopify.generated.types.DeletionEventSubjectType;
import com.test.shopify.generated.types.DiscountCodeSortKeys;
import com.test.shopify.generated.types.DiscountSortKeys;
import com.test.shopify.generated.types.DraftOrderSortKeys;
import com.test.shopify.generated.types.FileSortKeys;
import com.test.shopify.generated.types.FulfillmentOrderSortKeys;
import com.test.shopify.generated.types.GiftCardSortKeys;
import com.test.shopify.generated.types.LocationSortKeys;
import com.test.shopify.generated.types.MarketLocalizableResourceType;
import com.test.shopify.generated.types.MarketingActivitySortKeys;
import com.test.shopify.generated.types.MarketingEventSortKeys;
import com.test.shopify.generated.types.MetafieldDefinitionPinnedStatus;
import com.test.shopify.generated.types.MetafieldDefinitionSortKeys;
import com.test.shopify.generated.types.MetafieldOwnerType;
import com.test.shopify.generated.types.MetaobjectHandleInput;
import com.test.shopify.generated.types.OrderSortKeys;
import com.test.shopify.generated.types.PaymentTermsType;
import com.test.shopify.generated.types.PriceListSortKeys;
import com.test.shopify.generated.types.PriceRuleSortKeys;
import com.test.shopify.generated.types.ProductSortKeys;
import com.test.shopify.generated.types.ProductVariantSortKeys;
import com.test.shopify.generated.types.SegmentSortKeys;
import com.test.shopify.generated.types.SellingPlanGroupSortKeys;
import com.test.shopify.generated.types.SubscriptionBillingAttemptsSortKeys;
import com.test.shopify.generated.types.SubscriptionBillingCycleInput;
import com.test.shopify.generated.types.SubscriptionBillingCyclesDateRangeSelector;
import com.test.shopify.generated.types.SubscriptionBillingCyclesIndexRangeSelector;
import com.test.shopify.generated.types.SubscriptionBillingCyclesSortKeys;
import com.test.shopify.generated.types.TranslatableResourceType;
import com.test.shopify.generated.types.UTMInput;
import com.test.shopify.generated.types.UrlRedirectSortKeys;
import com.test.shopify.generated.types.ValidationSortKeys;
import com.test.shopify.generated.types.WebhookSubscriptionFormat;
import com.test.shopify.generated.types.WebhookSubscriptionSortKeys;
import com.test.shopify.generated.types.WebhookSubscriptionTopic;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class QueryRootProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public QueryRootProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("QueryRoot"));
  }

  public QueryRootProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AbandonmentProjection<QueryRootProjection<PARENT, ROOT>, ROOT> abandonment() {
     AbandonmentProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new AbandonmentProjection<>(this, getRoot());
     getFields().put("abandonment", projection);
     return projection;
  }

  public AbandonmentProjection<QueryRootProjection<PARENT, ROOT>, ROOT> abandonment(String id) {
    AbandonmentProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new AbandonmentProjection<>(this, getRoot());    
    getFields().put("abandonment", projection);
    getInputArguments().computeIfAbsent("abandonment", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("abandonment").add(idArg);
    return projection;
  }

  public AbandonmentProjection<QueryRootProjection<PARENT, ROOT>, ROOT> abandonmentByAbandonedCheckoutId(
      ) {
     AbandonmentProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new AbandonmentProjection<>(this, getRoot());
     getFields().put("abandonmentByAbandonedCheckoutId", projection);
     return projection;
  }

  public AbandonmentProjection<QueryRootProjection<PARENT, ROOT>, ROOT> abandonmentByAbandonedCheckoutId(
      String abandonedCheckoutId) {
    AbandonmentProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new AbandonmentProjection<>(this, getRoot());    
    getFields().put("abandonmentByAbandonedCheckoutId", projection);
    getInputArguments().computeIfAbsent("abandonmentByAbandonedCheckoutId", k -> new ArrayList<>());                      
    InputArgument abandonedCheckoutIdArg = new InputArgument("abandonedCheckoutId", abandonedCheckoutId);
    getInputArguments().get("abandonmentByAbandonedCheckoutId").add(abandonedCheckoutIdArg);
    return projection;
  }

  public AppProjection<QueryRootProjection<PARENT, ROOT>, ROOT> app() {
     AppProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("app", projection);
     return projection;
  }

  public AppProjection<QueryRootProjection<PARENT, ROOT>, ROOT> app(String id) {
    AppProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());    
    getFields().put("app", projection);
    getInputArguments().computeIfAbsent("app", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("app").add(idArg);
    return projection;
  }

  public AppProjection<QueryRootProjection<PARENT, ROOT>, ROOT> appByHandle() {
     AppProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("appByHandle", projection);
     return projection;
  }

  public AppProjection<QueryRootProjection<PARENT, ROOT>, ROOT> appByHandle(String handle) {
    AppProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());    
    getFields().put("appByHandle", projection);
    getInputArguments().computeIfAbsent("appByHandle", k -> new ArrayList<>());                      
    InputArgument handleArg = new InputArgument("handle", handle);
    getInputArguments().get("appByHandle").add(handleArg);
    return projection;
  }

  public AppProjection<QueryRootProjection<PARENT, ROOT>, ROOT> appByKey() {
     AppProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("appByKey", projection);
     return projection;
  }

  public AppProjection<QueryRootProjection<PARENT, ROOT>, ROOT> appByKey(String apiKey) {
    AppProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());    
    getFields().put("appByKey", projection);
    getInputArguments().computeIfAbsent("appByKey", k -> new ArrayList<>());                      
    InputArgument apiKeyArg = new InputArgument("apiKey", apiKey);
    getInputArguments().get("appByKey").add(apiKeyArg);
    return projection;
  }

  public AppDiscountTypeProjection<QueryRootProjection<PARENT, ROOT>, ROOT> appDiscountType() {
     AppDiscountTypeProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new AppDiscountTypeProjection<>(this, getRoot());
     getFields().put("appDiscountType", projection);
     return projection;
  }

  public AppDiscountTypeProjection<QueryRootProjection<PARENT, ROOT>, ROOT> appDiscountType(
      String functionId) {
    AppDiscountTypeProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new AppDiscountTypeProjection<>(this, getRoot());    
    getFields().put("appDiscountType", projection);
    getInputArguments().computeIfAbsent("appDiscountType", k -> new ArrayList<>());                      
    InputArgument functionIdArg = new InputArgument("functionId", functionId);
    getInputArguments().get("appDiscountType").add(functionIdArg);
    return projection;
  }

  public AppDiscountTypeProjection<QueryRootProjection<PARENT, ROOT>, ROOT> appDiscountTypes() {
     AppDiscountTypeProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new AppDiscountTypeProjection<>(this, getRoot());
     getFields().put("appDiscountTypes", projection);
     return projection;
  }

  public AppInstallationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> appInstallation() {
     AppInstallationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new AppInstallationProjection<>(this, getRoot());
     getFields().put("appInstallation", projection);
     return projection;
  }

  public AppInstallationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> appInstallation(
      String id) {
    AppInstallationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new AppInstallationProjection<>(this, getRoot());    
    getFields().put("appInstallation", projection);
    getInputArguments().computeIfAbsent("appInstallation", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("appInstallation").add(idArg);
    return projection;
  }

  public AppInstallationConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> appInstallations(
      ) {
     AppInstallationConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new AppInstallationConnectionProjection<>(this, getRoot());
     getFields().put("appInstallations", projection);
     return projection;
  }

  public AppInstallationConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> appInstallations(
      Integer first, String after, Integer last, String before, Boolean reverse,
      AppInstallationSortKeys sortKey, AppInstallationCategory category,
      AppInstallationPrivacy privacy) {
    AppInstallationConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new AppInstallationConnectionProjection<>(this, getRoot());    
    getFields().put("appInstallations", projection);
    getInputArguments().computeIfAbsent("appInstallations", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("appInstallations").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("appInstallations").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("appInstallations").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("appInstallations").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("appInstallations").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("appInstallations").add(sortKeyArg);
    InputArgument categoryArg = new InputArgument("category", category);
    getInputArguments().get("appInstallations").add(categoryArg);
    InputArgument privacyArg = new InputArgument("privacy", privacy);
    getInputArguments().get("appInstallations").add(privacyArg);
    return projection;
  }

  public DiscountAutomaticProjection<QueryRootProjection<PARENT, ROOT>, ROOT> automaticDiscount() {
     DiscountAutomaticProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DiscountAutomaticProjection<>(this, getRoot());
     getFields().put("automaticDiscount", projection);
     return projection;
  }

  public DiscountAutomaticProjection<QueryRootProjection<PARENT, ROOT>, ROOT> automaticDiscount(
      String id) {
    DiscountAutomaticProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DiscountAutomaticProjection<>(this, getRoot());    
    getFields().put("automaticDiscount", projection);
    getInputArguments().computeIfAbsent("automaticDiscount", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("automaticDiscount").add(idArg);
    return projection;
  }

  public DiscountAutomaticNodeProjection<QueryRootProjection<PARENT, ROOT>, ROOT> automaticDiscountNode(
      ) {
     DiscountAutomaticNodeProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DiscountAutomaticNodeProjection<>(this, getRoot());
     getFields().put("automaticDiscountNode", projection);
     return projection;
  }

  public DiscountAutomaticNodeProjection<QueryRootProjection<PARENT, ROOT>, ROOT> automaticDiscountNode(
      String id) {
    DiscountAutomaticNodeProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DiscountAutomaticNodeProjection<>(this, getRoot());    
    getFields().put("automaticDiscountNode", projection);
    getInputArguments().computeIfAbsent("automaticDiscountNode", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("automaticDiscountNode").add(idArg);
    return projection;
  }

  public DiscountAutomaticNodeConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> automaticDiscountNodes(
      ) {
     DiscountAutomaticNodeConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DiscountAutomaticNodeConnectionProjection<>(this, getRoot());
     getFields().put("automaticDiscountNodes", projection);
     return projection;
  }

  public DiscountAutomaticNodeConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> automaticDiscountNodes(
      Integer first, String after, Integer last, String before, Boolean reverse,
      AutomaticDiscountSortKeys sortKey, String query, String savedSearchId) {
    DiscountAutomaticNodeConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DiscountAutomaticNodeConnectionProjection<>(this, getRoot());    
    getFields().put("automaticDiscountNodes", projection);
    getInputArguments().computeIfAbsent("automaticDiscountNodes", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("automaticDiscountNodes").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("automaticDiscountNodes").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("automaticDiscountNodes").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("automaticDiscountNodes").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("automaticDiscountNodes").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("automaticDiscountNodes").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("automaticDiscountNodes").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("automaticDiscountNodes").add(savedSearchIdArg);
    return projection;
  }

  public SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> automaticDiscountSavedSearches(
      ) {
     SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());
     getFields().put("automaticDiscountSavedSearches", projection);
     return projection;
  }

  public SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> automaticDiscountSavedSearches(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());    
    getFields().put("automaticDiscountSavedSearches", projection);
    getInputArguments().computeIfAbsent("automaticDiscountSavedSearches", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("automaticDiscountSavedSearches").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("automaticDiscountSavedSearches").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("automaticDiscountSavedSearches").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("automaticDiscountSavedSearches").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("automaticDiscountSavedSearches").add(reverseArg);
    return projection;
  }

  public DiscountAutomaticConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> automaticDiscounts(
      ) {
     DiscountAutomaticConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DiscountAutomaticConnectionProjection<>(this, getRoot());
     getFields().put("automaticDiscounts", projection);
     return projection;
  }

  public DiscountAutomaticConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> automaticDiscounts(
      Integer first, String after, Integer last, String before, Boolean reverse,
      AutomaticDiscountSortKeys sortKey, String query, String savedSearchId) {
    DiscountAutomaticConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DiscountAutomaticConnectionProjection<>(this, getRoot());    
    getFields().put("automaticDiscounts", projection);
    getInputArguments().computeIfAbsent("automaticDiscounts", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("automaticDiscounts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("automaticDiscounts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("automaticDiscounts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("automaticDiscounts").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("automaticDiscounts").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("automaticDiscounts").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("automaticDiscounts").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("automaticDiscounts").add(savedSearchIdArg);
    return projection;
  }

  public DeliveryCarrierServiceAndLocationsProjection<QueryRootProjection<PARENT, ROOT>, ROOT> availableCarrierServices(
      ) {
     DeliveryCarrierServiceAndLocationsProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DeliveryCarrierServiceAndLocationsProjection<>(this, getRoot());
     getFields().put("availableCarrierServices", projection);
     return projection;
  }

  public LocaleProjection<QueryRootProjection<PARENT, ROOT>, ROOT> availableLocales() {
     LocaleProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new LocaleProjection<>(this, getRoot());
     getFields().put("availableLocales", projection);
     return projection;
  }

  public DeliveryCarrierServiceProjection<QueryRootProjection<PARENT, ROOT>, ROOT> carrierService(
      ) {
     DeliveryCarrierServiceProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DeliveryCarrierServiceProjection<>(this, getRoot());
     getFields().put("carrierService", projection);
     return projection;
  }

  public DeliveryCarrierServiceProjection<QueryRootProjection<PARENT, ROOT>, ROOT> carrierService(
      String id) {
    DeliveryCarrierServiceProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DeliveryCarrierServiceProjection<>(this, getRoot());    
    getFields().put("carrierService", projection);
    getInputArguments().computeIfAbsent("carrierService", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("carrierService").add(idArg);
    return projection;
  }

  public CartTransformConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> cartTransforms(
      ) {
     CartTransformConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CartTransformConnectionProjection<>(this, getRoot());
     getFields().put("cartTransforms", projection);
     return projection;
  }

  public CartTransformConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> cartTransforms(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    CartTransformConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CartTransformConnectionProjection<>(this, getRoot());    
    getFields().put("cartTransforms", projection);
    getInputArguments().computeIfAbsent("cartTransforms", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("cartTransforms").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("cartTransforms").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("cartTransforms").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("cartTransforms").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("cartTransforms").add(reverseArg);
    return projection;
  }

  public CatalogProjection<QueryRootProjection<PARENT, ROOT>, ROOT> catalog() {
     CatalogProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CatalogProjection<>(this, getRoot());
     getFields().put("catalog", projection);
     return projection;
  }

  public CatalogProjection<QueryRootProjection<PARENT, ROOT>, ROOT> catalog(String id) {
    CatalogProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CatalogProjection<>(this, getRoot());    
    getFields().put("catalog", projection);
    getInputArguments().computeIfAbsent("catalog", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("catalog").add(idArg);
    return projection;
  }

  public ResourceOperationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> catalogOperations() {
     ResourceOperationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ResourceOperationProjection<>(this, getRoot());
     getFields().put("catalogOperations", projection);
     return projection;
  }

  public CatalogConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> catalogs() {
     CatalogConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CatalogConnectionProjection<>(this, getRoot());
     getFields().put("catalogs", projection);
     return projection;
  }

  public CatalogConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> catalogs(
      CatalogType type, Integer first, String after, Integer last, String before, Boolean reverse,
      CatalogSortKeys sortKey, String query) {
    CatalogConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CatalogConnectionProjection<>(this, getRoot());    
    getFields().put("catalogs", projection);
    getInputArguments().computeIfAbsent("catalogs", k -> new ArrayList<>());                      
    InputArgument typeArg = new InputArgument("type", type);
    getInputArguments().get("catalogs").add(typeArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("catalogs").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("catalogs").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("catalogs").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("catalogs").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("catalogs").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("catalogs").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("catalogs").add(queryArg);
    return projection;
  }

  public ChannelProjection<QueryRootProjection<PARENT, ROOT>, ROOT> channel() {
     ChannelProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ChannelProjection<>(this, getRoot());
     getFields().put("channel", projection);
     return projection;
  }

  public ChannelProjection<QueryRootProjection<PARENT, ROOT>, ROOT> channel(String id) {
    ChannelProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ChannelProjection<>(this, getRoot());    
    getFields().put("channel", projection);
    getInputArguments().computeIfAbsent("channel", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("channel").add(idArg);
    return projection;
  }

  public ChannelConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> channels() {
     ChannelConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ChannelConnectionProjection<>(this, getRoot());
     getFields().put("channels", projection);
     return projection;
  }

  public ChannelConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> channels(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ChannelConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ChannelConnectionProjection<>(this, getRoot());    
    getFields().put("channels", projection);
    getInputArguments().computeIfAbsent("channels", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("channels").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("channels").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("channels").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("channels").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("channels").add(reverseArg);
    return projection;
  }

  public CheckoutBrandingProjection<QueryRootProjection<PARENT, ROOT>, ROOT> checkoutBranding() {
     CheckoutBrandingProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingProjection<>(this, getRoot());
     getFields().put("checkoutBranding", projection);
     return projection;
  }

  public CheckoutBrandingProjection<QueryRootProjection<PARENT, ROOT>, ROOT> checkoutBranding(
      String checkoutProfileId) {
    CheckoutBrandingProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingProjection<>(this, getRoot());    
    getFields().put("checkoutBranding", projection);
    getInputArguments().computeIfAbsent("checkoutBranding", k -> new ArrayList<>());                      
    InputArgument checkoutProfileIdArg = new InputArgument("checkoutProfileId", checkoutProfileId);
    getInputArguments().get("checkoutBranding").add(checkoutProfileIdArg);
    return projection;
  }

  public CheckoutProfileProjection<QueryRootProjection<PARENT, ROOT>, ROOT> checkoutProfile() {
     CheckoutProfileProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CheckoutProfileProjection<>(this, getRoot());
     getFields().put("checkoutProfile", projection);
     return projection;
  }

  public CheckoutProfileProjection<QueryRootProjection<PARENT, ROOT>, ROOT> checkoutProfile(
      String id) {
    CheckoutProfileProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CheckoutProfileProjection<>(this, getRoot());    
    getFields().put("checkoutProfile", projection);
    getInputArguments().computeIfAbsent("checkoutProfile", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("checkoutProfile").add(idArg);
    return projection;
  }

  public CheckoutProfileConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> checkoutProfiles(
      ) {
     CheckoutProfileConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CheckoutProfileConnectionProjection<>(this, getRoot());
     getFields().put("checkoutProfiles", projection);
     return projection;
  }

  public CheckoutProfileConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> checkoutProfiles(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CheckoutProfileSortKeys sortKey, String query) {
    CheckoutProfileConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CheckoutProfileConnectionProjection<>(this, getRoot());    
    getFields().put("checkoutProfiles", projection);
    getInputArguments().computeIfAbsent("checkoutProfiles", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("checkoutProfiles").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("checkoutProfiles").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("checkoutProfiles").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("checkoutProfiles").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("checkoutProfiles").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("checkoutProfiles").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("checkoutProfiles").add(queryArg);
    return projection;
  }

  public DiscountCodeNodeProjection<QueryRootProjection<PARENT, ROOT>, ROOT> codeDiscountNode() {
     DiscountCodeNodeProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DiscountCodeNodeProjection<>(this, getRoot());
     getFields().put("codeDiscountNode", projection);
     return projection;
  }

  public DiscountCodeNodeProjection<QueryRootProjection<PARENT, ROOT>, ROOT> codeDiscountNode(
      String id) {
    DiscountCodeNodeProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DiscountCodeNodeProjection<>(this, getRoot());    
    getFields().put("codeDiscountNode", projection);
    getInputArguments().computeIfAbsent("codeDiscountNode", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("codeDiscountNode").add(idArg);
    return projection;
  }

  public DiscountCodeNodeProjection<QueryRootProjection<PARENT, ROOT>, ROOT> codeDiscountNodeByCode(
      ) {
     DiscountCodeNodeProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DiscountCodeNodeProjection<>(this, getRoot());
     getFields().put("codeDiscountNodeByCode", projection);
     return projection;
  }

  public DiscountCodeNodeProjection<QueryRootProjection<PARENT, ROOT>, ROOT> codeDiscountNodeByCode(
      String code) {
    DiscountCodeNodeProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DiscountCodeNodeProjection<>(this, getRoot());    
    getFields().put("codeDiscountNodeByCode", projection);
    getInputArguments().computeIfAbsent("codeDiscountNodeByCode", k -> new ArrayList<>());                      
    InputArgument codeArg = new InputArgument("code", code);
    getInputArguments().get("codeDiscountNodeByCode").add(codeArg);
    return projection;
  }

  public DiscountCodeNodeConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> codeDiscountNodes(
      ) {
     DiscountCodeNodeConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DiscountCodeNodeConnectionProjection<>(this, getRoot());
     getFields().put("codeDiscountNodes", projection);
     return projection;
  }

  public DiscountCodeNodeConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> codeDiscountNodes(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CodeDiscountSortKeys sortKey, String query, String savedSearchId) {
    DiscountCodeNodeConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DiscountCodeNodeConnectionProjection<>(this, getRoot());    
    getFields().put("codeDiscountNodes", projection);
    getInputArguments().computeIfAbsent("codeDiscountNodes", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("codeDiscountNodes").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("codeDiscountNodes").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("codeDiscountNodes").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("codeDiscountNodes").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("codeDiscountNodes").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("codeDiscountNodes").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("codeDiscountNodes").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("codeDiscountNodes").add(savedSearchIdArg);
    return projection;
  }

  public SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> codeDiscountSavedSearches(
      ) {
     SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());
     getFields().put("codeDiscountSavedSearches", projection);
     return projection;
  }

  public SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> codeDiscountSavedSearches(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());    
    getFields().put("codeDiscountSavedSearches", projection);
    getInputArguments().computeIfAbsent("codeDiscountSavedSearches", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("codeDiscountSavedSearches").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("codeDiscountSavedSearches").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("codeDiscountSavedSearches").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("codeDiscountSavedSearches").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("codeDiscountSavedSearches").add(reverseArg);
    return projection;
  }

  public CollectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> collection() {
     CollectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CollectionProjection<>(this, getRoot());
     getFields().put("collection", projection);
     return projection;
  }

  public CollectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> collection(String id) {
    CollectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CollectionProjection<>(this, getRoot());    
    getFields().put("collection", projection);
    getInputArguments().computeIfAbsent("collection", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("collection").add(idArg);
    return projection;
  }

  public CollectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> collectionByHandle() {
     CollectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CollectionProjection<>(this, getRoot());
     getFields().put("collectionByHandle", projection);
     return projection;
  }

  public CollectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> collectionByHandle(
      String handle) {
    CollectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CollectionProjection<>(this, getRoot());    
    getFields().put("collectionByHandle", projection);
    getInputArguments().computeIfAbsent("collectionByHandle", k -> new ArrayList<>());                      
    InputArgument handleArg = new InputArgument("handle", handle);
    getInputArguments().get("collectionByHandle").add(handleArg);
    return projection;
  }

  public CollectionRuleConditionsProjection<QueryRootProjection<PARENT, ROOT>, ROOT> collectionRulesConditions(
      ) {
     CollectionRuleConditionsProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CollectionRuleConditionsProjection<>(this, getRoot());
     getFields().put("collectionRulesConditions", projection);
     return projection;
  }

  public SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> collectionSavedSearches(
      ) {
     SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());
     getFields().put("collectionSavedSearches", projection);
     return projection;
  }

  public SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> collectionSavedSearches(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());    
    getFields().put("collectionSavedSearches", projection);
    getInputArguments().computeIfAbsent("collectionSavedSearches", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("collectionSavedSearches").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("collectionSavedSearches").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("collectionSavedSearches").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("collectionSavedSearches").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("collectionSavedSearches").add(reverseArg);
    return projection;
  }

  public CollectionConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> collections() {
     CollectionConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CollectionConnectionProjection<>(this, getRoot());
     getFields().put("collections", projection);
     return projection;
  }

  public CollectionConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> collections(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CollectionSortKeys sortKey, String query, String savedSearchId) {
    CollectionConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CollectionConnectionProjection<>(this, getRoot());    
    getFields().put("collections", projection);
    getInputArguments().computeIfAbsent("collections", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("collections").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("collections").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("collections").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("collections").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("collections").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("collections").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("collections").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("collections").add(savedSearchIdArg);
    return projection;
  }

  public CompanyConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> companies() {
     CompanyConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CompanyConnectionProjection<>(this, getRoot());
     getFields().put("companies", projection);
     return projection;
  }

  public CompanyConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> companies(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CompanySortKeys sortKey, String query) {
    CompanyConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CompanyConnectionProjection<>(this, getRoot());    
    getFields().put("companies", projection);
    getInputArguments().computeIfAbsent("companies", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("companies").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("companies").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("companies").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("companies").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("companies").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("companies").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("companies").add(queryArg);
    return projection;
  }

  public CompanyProjection<QueryRootProjection<PARENT, ROOT>, ROOT> company() {
     CompanyProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CompanyProjection<>(this, getRoot());
     getFields().put("company", projection);
     return projection;
  }

  public CompanyProjection<QueryRootProjection<PARENT, ROOT>, ROOT> company(String id) {
    CompanyProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CompanyProjection<>(this, getRoot());    
    getFields().put("company", projection);
    getInputArguments().computeIfAbsent("company", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("company").add(idArg);
    return projection;
  }

  public CompanyContactProjection<QueryRootProjection<PARENT, ROOT>, ROOT> companyContact() {
     CompanyContactProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CompanyContactProjection<>(this, getRoot());
     getFields().put("companyContact", projection);
     return projection;
  }

  public CompanyContactProjection<QueryRootProjection<PARENT, ROOT>, ROOT> companyContact(
      String id) {
    CompanyContactProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CompanyContactProjection<>(this, getRoot());    
    getFields().put("companyContact", projection);
    getInputArguments().computeIfAbsent("companyContact", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("companyContact").add(idArg);
    return projection;
  }

  public CompanyContactRoleProjection<QueryRootProjection<PARENT, ROOT>, ROOT> companyContactRole(
      ) {
     CompanyContactRoleProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CompanyContactRoleProjection<>(this, getRoot());
     getFields().put("companyContactRole", projection);
     return projection;
  }

  public CompanyContactRoleProjection<QueryRootProjection<PARENT, ROOT>, ROOT> companyContactRole(
      String id) {
    CompanyContactRoleProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CompanyContactRoleProjection<>(this, getRoot());    
    getFields().put("companyContactRole", projection);
    getInputArguments().computeIfAbsent("companyContactRole", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("companyContactRole").add(idArg);
    return projection;
  }

  public CompanyLocationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> companyLocation() {
     CompanyLocationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CompanyLocationProjection<>(this, getRoot());
     getFields().put("companyLocation", projection);
     return projection;
  }

  public CompanyLocationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> companyLocation(
      String id) {
    CompanyLocationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CompanyLocationProjection<>(this, getRoot());    
    getFields().put("companyLocation", projection);
    getInputArguments().computeIfAbsent("companyLocation", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("companyLocation").add(idArg);
    return projection;
  }

  public CompanyLocationConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> companyLocations(
      ) {
     CompanyLocationConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CompanyLocationConnectionProjection<>(this, getRoot());
     getFields().put("companyLocations", projection);
     return projection;
  }

  public CompanyLocationConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> companyLocations(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CompanyLocationSortKeys sortKey, String query) {
    CompanyLocationConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CompanyLocationConnectionProjection<>(this, getRoot());    
    getFields().put("companyLocations", projection);
    getInputArguments().computeIfAbsent("companyLocations", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("companyLocations").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("companyLocations").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("companyLocations").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("companyLocations").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("companyLocations").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("companyLocations").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("companyLocations").add(queryArg);
    return projection;
  }

  public AppInstallationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> currentAppInstallation(
      ) {
     AppInstallationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new AppInstallationProjection<>(this, getRoot());
     getFields().put("currentAppInstallation", projection);
     return projection;
  }

  public BulkOperationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> currentBulkOperation() {
     BulkOperationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new BulkOperationProjection<>(this, getRoot());
     getFields().put("currentBulkOperation", projection);
     return projection;
  }

  public BulkOperationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> currentBulkOperation(
      BulkOperationType type) {
    BulkOperationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new BulkOperationProjection<>(this, getRoot());    
    getFields().put("currentBulkOperation", projection);
    getInputArguments().computeIfAbsent("currentBulkOperation", k -> new ArrayList<>());                      
    InputArgument typeArg = new InputArgument("type", type);
    getInputArguments().get("currentBulkOperation").add(typeArg);
    return projection;
  }

  public CustomerProjection<QueryRootProjection<PARENT, ROOT>, ROOT> customer() {
     CustomerProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CustomerProjection<>(this, getRoot());
     getFields().put("customer", projection);
     return projection;
  }

  public CustomerProjection<QueryRootProjection<PARENT, ROOT>, ROOT> customer(String id) {
    CustomerProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CustomerProjection<>(this, getRoot());    
    getFields().put("customer", projection);
    getInputArguments().computeIfAbsent("customer", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("customer").add(idArg);
    return projection;
  }

  public CustomerMergeRequestProjection<QueryRootProjection<PARENT, ROOT>, ROOT> customerMergeJobStatus(
      ) {
     CustomerMergeRequestProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CustomerMergeRequestProjection<>(this, getRoot());
     getFields().put("customerMergeJobStatus", projection);
     return projection;
  }

  public CustomerMergeRequestProjection<QueryRootProjection<PARENT, ROOT>, ROOT> customerMergeJobStatus(
      String jobId) {
    CustomerMergeRequestProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CustomerMergeRequestProjection<>(this, getRoot());    
    getFields().put("customerMergeJobStatus", projection);
    getInputArguments().computeIfAbsent("customerMergeJobStatus", k -> new ArrayList<>());                      
    InputArgument jobIdArg = new InputArgument("jobId", jobId);
    getInputArguments().get("customerMergeJobStatus").add(jobIdArg);
    return projection;
  }

  public CustomerMergePreviewProjection<QueryRootProjection<PARENT, ROOT>, ROOT> customerMergePreview(
      ) {
     CustomerMergePreviewProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CustomerMergePreviewProjection<>(this, getRoot());
     getFields().put("customerMergePreview", projection);
     return projection;
  }

  public CustomerMergePreviewProjection<QueryRootProjection<PARENT, ROOT>, ROOT> customerMergePreview(
      String customerOneId, String customerTwoId, CustomerMergeOverrideFields overrideFields) {
    CustomerMergePreviewProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CustomerMergePreviewProjection<>(this, getRoot());    
    getFields().put("customerMergePreview", projection);
    getInputArguments().computeIfAbsent("customerMergePreview", k -> new ArrayList<>());                      
    InputArgument customerOneIdArg = new InputArgument("customerOneId", customerOneId);
    getInputArguments().get("customerMergePreview").add(customerOneIdArg);
    InputArgument customerTwoIdArg = new InputArgument("customerTwoId", customerTwoId);
    getInputArguments().get("customerMergePreview").add(customerTwoIdArg);
    InputArgument overrideFieldsArg = new InputArgument("overrideFields", overrideFields);
    getInputArguments().get("customerMergePreview").add(overrideFieldsArg);
    return projection;
  }

  public CustomerPaymentMethodProjection<QueryRootProjection<PARENT, ROOT>, ROOT> customerPaymentMethod(
      ) {
     CustomerPaymentMethodProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CustomerPaymentMethodProjection<>(this, getRoot());
     getFields().put("customerPaymentMethod", projection);
     return projection;
  }

  public CustomerPaymentMethodProjection<QueryRootProjection<PARENT, ROOT>, ROOT> customerPaymentMethod(
      String id, Boolean showRevoked) {
    CustomerPaymentMethodProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CustomerPaymentMethodProjection<>(this, getRoot());    
    getFields().put("customerPaymentMethod", projection);
    getInputArguments().computeIfAbsent("customerPaymentMethod", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("customerPaymentMethod").add(idArg);
    InputArgument showRevokedArg = new InputArgument("showRevoked", showRevoked);
    getInputArguments().get("customerPaymentMethod").add(showRevokedArg);
    return projection;
  }

  public CustomerSegmentMemberConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> customerSegmentMembers(
      ) {
     CustomerSegmentMemberConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CustomerSegmentMemberConnectionProjection<>(this, getRoot());
     getFields().put("customerSegmentMembers", projection);
     return projection;
  }

  public CustomerSegmentMemberConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> customerSegmentMembers(
      String segmentId, String query, String queryId, String timezone, Boolean reverse,
      String sortKey, Integer first, String after, Integer last, String before) {
    CustomerSegmentMemberConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CustomerSegmentMemberConnectionProjection<>(this, getRoot());    
    getFields().put("customerSegmentMembers", projection);
    getInputArguments().computeIfAbsent("customerSegmentMembers", k -> new ArrayList<>());                      
    InputArgument segmentIdArg = new InputArgument("segmentId", segmentId);
    getInputArguments().get("customerSegmentMembers").add(segmentIdArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("customerSegmentMembers").add(queryArg);
    InputArgument queryIdArg = new InputArgument("queryId", queryId);
    getInputArguments().get("customerSegmentMembers").add(queryIdArg);
    InputArgument timezoneArg = new InputArgument("timezone", timezone);
    getInputArguments().get("customerSegmentMembers").add(timezoneArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("customerSegmentMembers").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("customerSegmentMembers").add(sortKeyArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("customerSegmentMembers").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("customerSegmentMembers").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("customerSegmentMembers").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("customerSegmentMembers").add(beforeArg);
    return projection;
  }

  public CustomerSegmentMembersQueryProjection<QueryRootProjection<PARENT, ROOT>, ROOT> customerSegmentMembersQuery(
      ) {
     CustomerSegmentMembersQueryProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CustomerSegmentMembersQueryProjection<>(this, getRoot());
     getFields().put("customerSegmentMembersQuery", projection);
     return projection;
  }

  public CustomerSegmentMembersQueryProjection<QueryRootProjection<PARENT, ROOT>, ROOT> customerSegmentMembersQuery(
      String id) {
    CustomerSegmentMembersQueryProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CustomerSegmentMembersQueryProjection<>(this, getRoot());    
    getFields().put("customerSegmentMembersQuery", projection);
    getInputArguments().computeIfAbsent("customerSegmentMembersQuery", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("customerSegmentMembersQuery").add(idArg);
    return projection;
  }

  public SegmentMembershipResponseProjection<QueryRootProjection<PARENT, ROOT>, ROOT> customerSegmentMembership(
      ) {
     SegmentMembershipResponseProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SegmentMembershipResponseProjection<>(this, getRoot());
     getFields().put("customerSegmentMembership", projection);
     return projection;
  }

  public SegmentMembershipResponseProjection<QueryRootProjection<PARENT, ROOT>, ROOT> customerSegmentMembership(
      List<String> segmentIds, String customerId) {
    SegmentMembershipResponseProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SegmentMembershipResponseProjection<>(this, getRoot());    
    getFields().put("customerSegmentMembership", projection);
    getInputArguments().computeIfAbsent("customerSegmentMembership", k -> new ArrayList<>());                      
    InputArgument segmentIdsArg = new InputArgument("segmentIds", segmentIds);
    getInputArguments().get("customerSegmentMembership").add(segmentIdsArg);
    InputArgument customerIdArg = new InputArgument("customerId", customerId);
    getInputArguments().get("customerSegmentMembership").add(customerIdArg);
    return projection;
  }

  public CustomerConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> customers() {
     CustomerConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CustomerConnectionProjection<>(this, getRoot());
     getFields().put("customers", projection);
     return projection;
  }

  public CustomerConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> customers(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CustomerSortKeys sortKey, String query) {
    CustomerConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new CustomerConnectionProjection<>(this, getRoot());    
    getFields().put("customers", projection);
    getInputArguments().computeIfAbsent("customers", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("customers").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("customers").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("customers").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("customers").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("customers").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("customers").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("customers").add(queryArg);
    return projection;
  }

  public DeletionEventConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> deletionEvents(
      ) {
     DeletionEventConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DeletionEventConnectionProjection<>(this, getRoot());
     getFields().put("deletionEvents", projection);
     return projection;
  }

  public DeletionEventConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> deletionEvents(
      List<DeletionEventSubjectType> subjectTypes, Integer first, String after, Integer last,
      String before, Boolean reverse, DeletionEventSortKeys sortKey, String query) {
    DeletionEventConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DeletionEventConnectionProjection<>(this, getRoot());    
    getFields().put("deletionEvents", projection);
    getInputArguments().computeIfAbsent("deletionEvents", k -> new ArrayList<>());                      
    InputArgument subjectTypesArg = new InputArgument("subjectTypes", subjectTypes);
    getInputArguments().get("deletionEvents").add(subjectTypesArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("deletionEvents").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("deletionEvents").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("deletionEvents").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("deletionEvents").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("deletionEvents").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("deletionEvents").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("deletionEvents").add(queryArg);
    return projection;
  }

  public DeliveryCustomizationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> deliveryCustomization(
      ) {
     DeliveryCustomizationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DeliveryCustomizationProjection<>(this, getRoot());
     getFields().put("deliveryCustomization", projection);
     return projection;
  }

  public DeliveryCustomizationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> deliveryCustomization(
      String id) {
    DeliveryCustomizationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DeliveryCustomizationProjection<>(this, getRoot());    
    getFields().put("deliveryCustomization", projection);
    getInputArguments().computeIfAbsent("deliveryCustomization", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("deliveryCustomization").add(idArg);
    return projection;
  }

  public DeliveryCustomizationConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> deliveryCustomizations(
      ) {
     DeliveryCustomizationConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DeliveryCustomizationConnectionProjection<>(this, getRoot());
     getFields().put("deliveryCustomizations", projection);
     return projection;
  }

  public DeliveryCustomizationConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> deliveryCustomizations(
      Integer first, String after, Integer last, String before, Boolean reverse, String query) {
    DeliveryCustomizationConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DeliveryCustomizationConnectionProjection<>(this, getRoot());    
    getFields().put("deliveryCustomizations", projection);
    getInputArguments().computeIfAbsent("deliveryCustomizations", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("deliveryCustomizations").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("deliveryCustomizations").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("deliveryCustomizations").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("deliveryCustomizations").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("deliveryCustomizations").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("deliveryCustomizations").add(queryArg);
    return projection;
  }

  public DeliveryProfileProjection<QueryRootProjection<PARENT, ROOT>, ROOT> deliveryProfile() {
     DeliveryProfileProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DeliveryProfileProjection<>(this, getRoot());
     getFields().put("deliveryProfile", projection);
     return projection;
  }

  public DeliveryProfileProjection<QueryRootProjection<PARENT, ROOT>, ROOT> deliveryProfile(
      String id) {
    DeliveryProfileProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DeliveryProfileProjection<>(this, getRoot());    
    getFields().put("deliveryProfile", projection);
    getInputArguments().computeIfAbsent("deliveryProfile", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("deliveryProfile").add(idArg);
    return projection;
  }

  public DeliveryProfileConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> deliveryProfiles(
      ) {
     DeliveryProfileConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DeliveryProfileConnectionProjection<>(this, getRoot());
     getFields().put("deliveryProfiles", projection);
     return projection;
  }

  public DeliveryProfileConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> deliveryProfiles(
      Boolean merchantOwnedOnly, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    DeliveryProfileConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DeliveryProfileConnectionProjection<>(this, getRoot());    
    getFields().put("deliveryProfiles", projection);
    getInputArguments().computeIfAbsent("deliveryProfiles", k -> new ArrayList<>());                      
    InputArgument merchantOwnedOnlyArg = new InputArgument("merchantOwnedOnly", merchantOwnedOnly);
    getInputArguments().get("deliveryProfiles").add(merchantOwnedOnlyArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("deliveryProfiles").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("deliveryProfiles").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("deliveryProfiles").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("deliveryProfiles").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("deliveryProfiles").add(reverseArg);
    return projection;
  }

  public DeliverySettingProjection<QueryRootProjection<PARENT, ROOT>, ROOT> deliverySettings() {
     DeliverySettingProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DeliverySettingProjection<>(this, getRoot());
     getFields().put("deliverySettings", projection);
     return projection;
  }

  public DiscountNodeProjection<QueryRootProjection<PARENT, ROOT>, ROOT> discountNode() {
     DiscountNodeProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DiscountNodeProjection<>(this, getRoot());
     getFields().put("discountNode", projection);
     return projection;
  }

  public DiscountNodeProjection<QueryRootProjection<PARENT, ROOT>, ROOT> discountNode(String id) {
    DiscountNodeProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DiscountNodeProjection<>(this, getRoot());    
    getFields().put("discountNode", projection);
    getInputArguments().computeIfAbsent("discountNode", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("discountNode").add(idArg);
    return projection;
  }

  public DiscountNodeConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> discountNodes() {
     DiscountNodeConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DiscountNodeConnectionProjection<>(this, getRoot());
     getFields().put("discountNodes", projection);
     return projection;
  }

  public DiscountNodeConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> discountNodes(
      Integer first, String after, Integer last, String before, Boolean reverse,
      DiscountSortKeys sortKey, String query, String savedSearchId) {
    DiscountNodeConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DiscountNodeConnectionProjection<>(this, getRoot());    
    getFields().put("discountNodes", projection);
    getInputArguments().computeIfAbsent("discountNodes", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("discountNodes").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("discountNodes").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("discountNodes").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("discountNodes").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("discountNodes").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("discountNodes").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("discountNodes").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("discountNodes").add(savedSearchIdArg);
    return projection;
  }

  public DiscountRedeemCodeBulkCreationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> discountRedeemCodeBulkCreation(
      ) {
     DiscountRedeemCodeBulkCreationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DiscountRedeemCodeBulkCreationProjection<>(this, getRoot());
     getFields().put("discountRedeemCodeBulkCreation", projection);
     return projection;
  }

  public DiscountRedeemCodeBulkCreationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> discountRedeemCodeBulkCreation(
      String id) {
    DiscountRedeemCodeBulkCreationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DiscountRedeemCodeBulkCreationProjection<>(this, getRoot());    
    getFields().put("discountRedeemCodeBulkCreation", projection);
    getInputArguments().computeIfAbsent("discountRedeemCodeBulkCreation", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("discountRedeemCodeBulkCreation").add(idArg);
    return projection;
  }

  public SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> discountRedeemCodeSavedSearches(
      ) {
     SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());
     getFields().put("discountRedeemCodeSavedSearches", projection);
     return projection;
  }

  public SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> discountRedeemCodeSavedSearches(
      Integer first, String after, Integer last, String before, Boolean reverse,
      DiscountCodeSortKeys sortKey, String query) {
    SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());    
    getFields().put("discountRedeemCodeSavedSearches", projection);
    getInputArguments().computeIfAbsent("discountRedeemCodeSavedSearches", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("discountRedeemCodeSavedSearches").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("discountRedeemCodeSavedSearches").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("discountRedeemCodeSavedSearches").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("discountRedeemCodeSavedSearches").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("discountRedeemCodeSavedSearches").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("discountRedeemCodeSavedSearches").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("discountRedeemCodeSavedSearches").add(queryArg);
    return projection;
  }

  public ShopifyPaymentsDisputeProjection<QueryRootProjection<PARENT, ROOT>, ROOT> dispute() {
     ShopifyPaymentsDisputeProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeProjection<>(this, getRoot());
     getFields().put("dispute", projection);
     return projection;
  }

  public ShopifyPaymentsDisputeProjection<QueryRootProjection<PARENT, ROOT>, ROOT> dispute(
      String id) {
    ShopifyPaymentsDisputeProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeProjection<>(this, getRoot());    
    getFields().put("dispute", projection);
    getInputArguments().computeIfAbsent("dispute", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("dispute").add(idArg);
    return projection;
  }

  public ShopifyPaymentsDisputeEvidenceProjection<QueryRootProjection<PARENT, ROOT>, ROOT> disputeEvidence(
      ) {
     ShopifyPaymentsDisputeEvidenceProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeEvidenceProjection<>(this, getRoot());
     getFields().put("disputeEvidence", projection);
     return projection;
  }

  public ShopifyPaymentsDisputeEvidenceProjection<QueryRootProjection<PARENT, ROOT>, ROOT> disputeEvidence(
      String id) {
    ShopifyPaymentsDisputeEvidenceProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeEvidenceProjection<>(this, getRoot());    
    getFields().put("disputeEvidence", projection);
    getInputArguments().computeIfAbsent("disputeEvidence", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("disputeEvidence").add(idArg);
    return projection;
  }

  public DomainProjection<QueryRootProjection<PARENT, ROOT>, ROOT> domain() {
     DomainProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DomainProjection<>(this, getRoot());
     getFields().put("domain", projection);
     return projection;
  }

  public DomainProjection<QueryRootProjection<PARENT, ROOT>, ROOT> domain(String id) {
    DomainProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DomainProjection<>(this, getRoot());    
    getFields().put("domain", projection);
    getInputArguments().computeIfAbsent("domain", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("domain").add(idArg);
    return projection;
  }

  public DraftOrderProjection<QueryRootProjection<PARENT, ROOT>, ROOT> draftOrder() {
     DraftOrderProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderProjection<>(this, getRoot());
     getFields().put("draftOrder", projection);
     return projection;
  }

  public DraftOrderProjection<QueryRootProjection<PARENT, ROOT>, ROOT> draftOrder(String id) {
    DraftOrderProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderProjection<>(this, getRoot());    
    getFields().put("draftOrder", projection);
    getInputArguments().computeIfAbsent("draftOrder", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("draftOrder").add(idArg);
    return projection;
  }

  public SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> draftOrderSavedSearches(
      ) {
     SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());
     getFields().put("draftOrderSavedSearches", projection);
     return projection;
  }

  public SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> draftOrderSavedSearches(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());    
    getFields().put("draftOrderSavedSearches", projection);
    getInputArguments().computeIfAbsent("draftOrderSavedSearches", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("draftOrderSavedSearches").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("draftOrderSavedSearches").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("draftOrderSavedSearches").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("draftOrderSavedSearches").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("draftOrderSavedSearches").add(reverseArg);
    return projection;
  }

  public DraftOrderTagProjection<QueryRootProjection<PARENT, ROOT>, ROOT> draftOrderTag() {
     DraftOrderTagProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderTagProjection<>(this, getRoot());
     getFields().put("draftOrderTag", projection);
     return projection;
  }

  public DraftOrderTagProjection<QueryRootProjection<PARENT, ROOT>, ROOT> draftOrderTag(String id) {
    DraftOrderTagProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderTagProjection<>(this, getRoot());    
    getFields().put("draftOrderTag", projection);
    getInputArguments().computeIfAbsent("draftOrderTag", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("draftOrderTag").add(idArg);
    return projection;
  }

  public DraftOrderConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> draftOrders() {
     DraftOrderConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderConnectionProjection<>(this, getRoot());
     getFields().put("draftOrders", projection);
     return projection;
  }

  public DraftOrderConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> draftOrders(
      Integer first, String after, Integer last, String before, Boolean reverse,
      DraftOrderSortKeys sortKey, String query, String savedSearchId) {
    DraftOrderConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderConnectionProjection<>(this, getRoot());    
    getFields().put("draftOrders", projection);
    getInputArguments().computeIfAbsent("draftOrders", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("draftOrders").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("draftOrders").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("draftOrders").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("draftOrders").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("draftOrders").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("draftOrders").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("draftOrders").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("draftOrders").add(savedSearchIdArg);
    return projection;
  }

  public SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> fileSavedSearches(
      ) {
     SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());
     getFields().put("fileSavedSearches", projection);
     return projection;
  }

  public SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> fileSavedSearches(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());    
    getFields().put("fileSavedSearches", projection);
    getInputArguments().computeIfAbsent("fileSavedSearches", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("fileSavedSearches").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("fileSavedSearches").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("fileSavedSearches").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("fileSavedSearches").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("fileSavedSearches").add(reverseArg);
    return projection;
  }

  public FileConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> files() {
     FileConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new FileConnectionProjection<>(this, getRoot());
     getFields().put("files", projection);
     return projection;
  }

  public FileConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> files(Integer first,
      String after, Integer last, String before, Boolean reverse, FileSortKeys sortKey,
      String query, String savedSearchId) {
    FileConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new FileConnectionProjection<>(this, getRoot());    
    getFields().put("files", projection);
    getInputArguments().computeIfAbsent("files", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("files").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("files").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("files").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("files").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("files").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("files").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("files").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("files").add(savedSearchIdArg);
    return projection;
  }

  public FulfillmentProjection<QueryRootProjection<PARENT, ROOT>, ROOT> fulfillment() {
     FulfillmentProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentProjection<>(this, getRoot());
     getFields().put("fulfillment", projection);
     return projection;
  }

  public FulfillmentProjection<QueryRootProjection<PARENT, ROOT>, ROOT> fulfillment(String id) {
    FulfillmentProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentProjection<>(this, getRoot());    
    getFields().put("fulfillment", projection);
    getInputArguments().computeIfAbsent("fulfillment", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("fulfillment").add(idArg);
    return projection;
  }

  public FulfillmentConstraintRuleProjection<QueryRootProjection<PARENT, ROOT>, ROOT> fulfillmentConstraintRules(
      ) {
     FulfillmentConstraintRuleProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentConstraintRuleProjection<>(this, getRoot());
     getFields().put("fulfillmentConstraintRules", projection);
     return projection;
  }

  public FulfillmentOrderProjection<QueryRootProjection<PARENT, ROOT>, ROOT> fulfillmentOrder() {
     FulfillmentOrderProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderProjection<>(this, getRoot());
     getFields().put("fulfillmentOrder", projection);
     return projection;
  }

  public FulfillmentOrderProjection<QueryRootProjection<PARENT, ROOT>, ROOT> fulfillmentOrder(
      String id) {
    FulfillmentOrderProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderProjection<>(this, getRoot());    
    getFields().put("fulfillmentOrder", projection);
    getInputArguments().computeIfAbsent("fulfillmentOrder", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("fulfillmentOrder").add(idArg);
    return projection;
  }

  public FulfillmentOrderConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> fulfillmentOrders(
      ) {
     FulfillmentOrderConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderConnectionProjection<>(this, getRoot());
     getFields().put("fulfillmentOrders", projection);
     return projection;
  }

  public FulfillmentOrderConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> fulfillmentOrders(
      Boolean includeClosed, Integer first, String after, Integer last, String before,
      Boolean reverse, FulfillmentOrderSortKeys sortKey, String query) {
    FulfillmentOrderConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderConnectionProjection<>(this, getRoot());    
    getFields().put("fulfillmentOrders", projection);
    getInputArguments().computeIfAbsent("fulfillmentOrders", k -> new ArrayList<>());                      
    InputArgument includeClosedArg = new InputArgument("includeClosed", includeClosed);
    getInputArguments().get("fulfillmentOrders").add(includeClosedArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("fulfillmentOrders").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("fulfillmentOrders").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("fulfillmentOrders").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("fulfillmentOrders").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("fulfillmentOrders").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("fulfillmentOrders").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("fulfillmentOrders").add(queryArg);
    return projection;
  }

  public FulfillmentServiceProjection<QueryRootProjection<PARENT, ROOT>, ROOT> fulfillmentService(
      ) {
     FulfillmentServiceProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentServiceProjection<>(this, getRoot());
     getFields().put("fulfillmentService", projection);
     return projection;
  }

  public FulfillmentServiceProjection<QueryRootProjection<PARENT, ROOT>, ROOT> fulfillmentService(
      String id) {
    FulfillmentServiceProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentServiceProjection<>(this, getRoot());    
    getFields().put("fulfillmentService", projection);
    getInputArguments().computeIfAbsent("fulfillmentService", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("fulfillmentService").add(idArg);
    return projection;
  }

  public GiftCardProjection<QueryRootProjection<PARENT, ROOT>, ROOT> giftCard() {
     GiftCardProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new GiftCardProjection<>(this, getRoot());
     getFields().put("giftCard", projection);
     return projection;
  }

  public GiftCardProjection<QueryRootProjection<PARENT, ROOT>, ROOT> giftCard(String id) {
    GiftCardProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new GiftCardProjection<>(this, getRoot());    
    getFields().put("giftCard", projection);
    getInputArguments().computeIfAbsent("giftCard", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("giftCard").add(idArg);
    return projection;
  }

  public GiftCardConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> giftCards() {
     GiftCardConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new GiftCardConnectionProjection<>(this, getRoot());
     getFields().put("giftCards", projection);
     return projection;
  }

  public GiftCardConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> giftCards(
      Integer first, String after, Integer last, String before, Boolean reverse,
      GiftCardSortKeys sortKey, String query, String savedSearchId) {
    GiftCardConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new GiftCardConnectionProjection<>(this, getRoot());    
    getFields().put("giftCards", projection);
    getInputArguments().computeIfAbsent("giftCards", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("giftCards").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("giftCards").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("giftCards").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("giftCards").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("giftCards").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("giftCards").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("giftCards").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("giftCards").add(savedSearchIdArg);
    return projection;
  }

  public InventoryItemProjection<QueryRootProjection<PARENT, ROOT>, ROOT> inventoryItem() {
     InventoryItemProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new InventoryItemProjection<>(this, getRoot());
     getFields().put("inventoryItem", projection);
     return projection;
  }

  public InventoryItemProjection<QueryRootProjection<PARENT, ROOT>, ROOT> inventoryItem(String id) {
    InventoryItemProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new InventoryItemProjection<>(this, getRoot());    
    getFields().put("inventoryItem", projection);
    getInputArguments().computeIfAbsent("inventoryItem", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("inventoryItem").add(idArg);
    return projection;
  }

  public InventoryItemConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> inventoryItems(
      ) {
     InventoryItemConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new InventoryItemConnectionProjection<>(this, getRoot());
     getFields().put("inventoryItems", projection);
     return projection;
  }

  public InventoryItemConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> inventoryItems(
      Integer first, String after, Integer last, String before, Boolean reverse, String query) {
    InventoryItemConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new InventoryItemConnectionProjection<>(this, getRoot());    
    getFields().put("inventoryItems", projection);
    getInputArguments().computeIfAbsent("inventoryItems", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("inventoryItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("inventoryItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("inventoryItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("inventoryItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("inventoryItems").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("inventoryItems").add(queryArg);
    return projection;
  }

  public InventoryLevelProjection<QueryRootProjection<PARENT, ROOT>, ROOT> inventoryLevel() {
     InventoryLevelProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new InventoryLevelProjection<>(this, getRoot());
     getFields().put("inventoryLevel", projection);
     return projection;
  }

  public InventoryLevelProjection<QueryRootProjection<PARENT, ROOT>, ROOT> inventoryLevel(
      String id) {
    InventoryLevelProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new InventoryLevelProjection<>(this, getRoot());    
    getFields().put("inventoryLevel", projection);
    getInputArguments().computeIfAbsent("inventoryLevel", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("inventoryLevel").add(idArg);
    return projection;
  }

  public InventoryPropertiesProjection<QueryRootProjection<PARENT, ROOT>, ROOT> inventoryProperties(
      ) {
     InventoryPropertiesProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new InventoryPropertiesProjection<>(this, getRoot());
     getFields().put("inventoryProperties", projection);
     return projection;
  }

  public JobProjection<QueryRootProjection<PARENT, ROOT>, ROOT> job() {
     JobProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new JobProjection<>(this, getRoot());
     getFields().put("job", projection);
     return projection;
  }

  public JobProjection<QueryRootProjection<PARENT, ROOT>, ROOT> job(String id) {
    JobProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new JobProjection<>(this, getRoot());    
    getFields().put("job", projection);
    getInputArguments().computeIfAbsent("job", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("job").add(idArg);
    return projection;
  }

  public LocationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> location() {
     LocationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("location", projection);
     return projection;
  }

  public LocationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> location(String id) {
    LocationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());    
    getFields().put("location", projection);
    getInputArguments().computeIfAbsent("location", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("location").add(idArg);
    return projection;
  }

  public LocationConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> locations() {
     LocationConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new LocationConnectionProjection<>(this, getRoot());
     getFields().put("locations", projection);
     return projection;
  }

  public LocationConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> locations(
      Integer first, String after, Integer last, String before, Boolean reverse,
      LocationSortKeys sortKey, String query, Boolean includeLegacy, Boolean includeInactive) {
    LocationConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new LocationConnectionProjection<>(this, getRoot());    
    getFields().put("locations", projection);
    getInputArguments().computeIfAbsent("locations", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("locations").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("locations").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("locations").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("locations").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("locations").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("locations").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("locations").add(queryArg);
    InputArgument includeLegacyArg = new InputArgument("includeLegacy", includeLegacy);
    getInputArguments().get("locations").add(includeLegacyArg);
    InputArgument includeInactiveArg = new InputArgument("includeInactive", includeInactive);
    getInputArguments().get("locations").add(includeInactiveArg);
    return projection;
  }

  public LocationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> locationsAvailableForDeliveryProfiles(
      ) {
     LocationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("locationsAvailableForDeliveryProfiles", projection);
     return projection;
  }

  public LocationConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> locationsAvailableForDeliveryProfilesConnection(
      ) {
     LocationConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new LocationConnectionProjection<>(this, getRoot());
     getFields().put("locationsAvailableForDeliveryProfilesConnection", projection);
     return projection;
  }

  public LocationConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> locationsAvailableForDeliveryProfilesConnection(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    LocationConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new LocationConnectionProjection<>(this, getRoot());    
    getFields().put("locationsAvailableForDeliveryProfilesConnection", projection);
    getInputArguments().computeIfAbsent("locationsAvailableForDeliveryProfilesConnection", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("locationsAvailableForDeliveryProfilesConnection").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("locationsAvailableForDeliveryProfilesConnection").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("locationsAvailableForDeliveryProfilesConnection").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("locationsAvailableForDeliveryProfilesConnection").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("locationsAvailableForDeliveryProfilesConnection").add(reverseArg);
    return projection;
  }

  public FulfillmentOrderConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> manualHoldsFulfillmentOrders(
      ) {
     FulfillmentOrderConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderConnectionProjection<>(this, getRoot());
     getFields().put("manualHoldsFulfillmentOrders", projection);
     return projection;
  }

  public FulfillmentOrderConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> manualHoldsFulfillmentOrders(
      String query, Integer first, String after, Integer last, String before, Boolean reverse) {
    FulfillmentOrderConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderConnectionProjection<>(this, getRoot());    
    getFields().put("manualHoldsFulfillmentOrders", projection);
    getInputArguments().computeIfAbsent("manualHoldsFulfillmentOrders", k -> new ArrayList<>());                      
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("manualHoldsFulfillmentOrders").add(queryArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("manualHoldsFulfillmentOrders").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("manualHoldsFulfillmentOrders").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("manualHoldsFulfillmentOrders").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("manualHoldsFulfillmentOrders").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("manualHoldsFulfillmentOrders").add(reverseArg);
    return projection;
  }

  public MarketProjection<QueryRootProjection<PARENT, ROOT>, ROOT> market() {
     MarketProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MarketProjection<>(this, getRoot());
     getFields().put("market", projection);
     return projection;
  }

  public MarketProjection<QueryRootProjection<PARENT, ROOT>, ROOT> market(String id) {
    MarketProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MarketProjection<>(this, getRoot());    
    getFields().put("market", projection);
    getInputArguments().computeIfAbsent("market", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("market").add(idArg);
    return projection;
  }

  public MarketProjection<QueryRootProjection<PARENT, ROOT>, ROOT> marketByGeography() {
     MarketProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MarketProjection<>(this, getRoot());
     getFields().put("marketByGeography", projection);
     return projection;
  }

  public MarketProjection<QueryRootProjection<PARENT, ROOT>, ROOT> marketByGeography(
      CountryCode countryCode) {
    MarketProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MarketProjection<>(this, getRoot());    
    getFields().put("marketByGeography", projection);
    getInputArguments().computeIfAbsent("marketByGeography", k -> new ArrayList<>());                      
    InputArgument countryCodeArg = new InputArgument("countryCode", countryCode);
    getInputArguments().get("marketByGeography").add(countryCodeArg);
    return projection;
  }

  public MarketLocalizableResourceProjection<QueryRootProjection<PARENT, ROOT>, ROOT> marketLocalizableResource(
      ) {
     MarketLocalizableResourceProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MarketLocalizableResourceProjection<>(this, getRoot());
     getFields().put("marketLocalizableResource", projection);
     return projection;
  }

  public MarketLocalizableResourceProjection<QueryRootProjection<PARENT, ROOT>, ROOT> marketLocalizableResource(
      String resourceId) {
    MarketLocalizableResourceProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MarketLocalizableResourceProjection<>(this, getRoot());    
    getFields().put("marketLocalizableResource", projection);
    getInputArguments().computeIfAbsent("marketLocalizableResource", k -> new ArrayList<>());                      
    InputArgument resourceIdArg = new InputArgument("resourceId", resourceId);
    getInputArguments().get("marketLocalizableResource").add(resourceIdArg);
    return projection;
  }

  public MarketLocalizableResourceConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> marketLocalizableResources(
      ) {
     MarketLocalizableResourceConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MarketLocalizableResourceConnectionProjection<>(this, getRoot());
     getFields().put("marketLocalizableResources", projection);
     return projection;
  }

  public MarketLocalizableResourceConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> marketLocalizableResources(
      MarketLocalizableResourceType resourceType, Integer first, String after, Integer last,
      String before, Boolean reverse) {
    MarketLocalizableResourceConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MarketLocalizableResourceConnectionProjection<>(this, getRoot());    
    getFields().put("marketLocalizableResources", projection);
    getInputArguments().computeIfAbsent("marketLocalizableResources", k -> new ArrayList<>());                      
    InputArgument resourceTypeArg = new InputArgument("resourceType", resourceType);
    getInputArguments().get("marketLocalizableResources").add(resourceTypeArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("marketLocalizableResources").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("marketLocalizableResources").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("marketLocalizableResources").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("marketLocalizableResources").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("marketLocalizableResources").add(reverseArg);
    return projection;
  }

  public MarketLocalizableResourceConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> marketLocalizableResourcesByIds(
      ) {
     MarketLocalizableResourceConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MarketLocalizableResourceConnectionProjection<>(this, getRoot());
     getFields().put("marketLocalizableResourcesByIds", projection);
     return projection;
  }

  public MarketLocalizableResourceConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> marketLocalizableResourcesByIds(
      List<String> resourceIds, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MarketLocalizableResourceConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MarketLocalizableResourceConnectionProjection<>(this, getRoot());    
    getFields().put("marketLocalizableResourcesByIds", projection);
    getInputArguments().computeIfAbsent("marketLocalizableResourcesByIds", k -> new ArrayList<>());                      
    InputArgument resourceIdsArg = new InputArgument("resourceIds", resourceIds);
    getInputArguments().get("marketLocalizableResourcesByIds").add(resourceIdsArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("marketLocalizableResourcesByIds").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("marketLocalizableResourcesByIds").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("marketLocalizableResourcesByIds").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("marketLocalizableResourcesByIds").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("marketLocalizableResourcesByIds").add(reverseArg);
    return projection;
  }

  public MarketingActivityConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> marketingActivities(
      ) {
     MarketingActivityConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MarketingActivityConnectionProjection<>(this, getRoot());
     getFields().put("marketingActivities", projection);
     return projection;
  }

  public MarketingActivityConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> marketingActivities(
      List<String> marketingActivityIds, List<String> remoteIds, UTMInput utm, Integer first,
      String after, Integer last, String before, Boolean reverse, MarketingActivitySortKeys sortKey,
      String query, String savedSearchId) {
    MarketingActivityConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MarketingActivityConnectionProjection<>(this, getRoot());    
    getFields().put("marketingActivities", projection);
    getInputArguments().computeIfAbsent("marketingActivities", k -> new ArrayList<>());                      
    InputArgument marketingActivityIdsArg = new InputArgument("marketingActivityIds", marketingActivityIds);
    getInputArguments().get("marketingActivities").add(marketingActivityIdsArg);
    InputArgument remoteIdsArg = new InputArgument("remoteIds", remoteIds);
    getInputArguments().get("marketingActivities").add(remoteIdsArg);
    InputArgument utmArg = new InputArgument("utm", utm);
    getInputArguments().get("marketingActivities").add(utmArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("marketingActivities").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("marketingActivities").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("marketingActivities").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("marketingActivities").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("marketingActivities").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("marketingActivities").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("marketingActivities").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("marketingActivities").add(savedSearchIdArg);
    return projection;
  }

  public MarketingActivityProjection<QueryRootProjection<PARENT, ROOT>, ROOT> marketingActivity() {
     MarketingActivityProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MarketingActivityProjection<>(this, getRoot());
     getFields().put("marketingActivity", projection);
     return projection;
  }

  public MarketingActivityProjection<QueryRootProjection<PARENT, ROOT>, ROOT> marketingActivity(
      String id) {
    MarketingActivityProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MarketingActivityProjection<>(this, getRoot());    
    getFields().put("marketingActivity", projection);
    getInputArguments().computeIfAbsent("marketingActivity", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("marketingActivity").add(idArg);
    return projection;
  }

  public MarketingEventProjection<QueryRootProjection<PARENT, ROOT>, ROOT> marketingEvent() {
     MarketingEventProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MarketingEventProjection<>(this, getRoot());
     getFields().put("marketingEvent", projection);
     return projection;
  }

  public MarketingEventProjection<QueryRootProjection<PARENT, ROOT>, ROOT> marketingEvent(
      String id) {
    MarketingEventProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MarketingEventProjection<>(this, getRoot());    
    getFields().put("marketingEvent", projection);
    getInputArguments().computeIfAbsent("marketingEvent", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("marketingEvent").add(idArg);
    return projection;
  }

  public MarketingEventConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> marketingEvents(
      ) {
     MarketingEventConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MarketingEventConnectionProjection<>(this, getRoot());
     getFields().put("marketingEvents", projection);
     return projection;
  }

  public MarketingEventConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> marketingEvents(
      Integer first, String after, Integer last, String before, Boolean reverse,
      MarketingEventSortKeys sortKey, String query) {
    MarketingEventConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MarketingEventConnectionProjection<>(this, getRoot());    
    getFields().put("marketingEvents", projection);
    getInputArguments().computeIfAbsent("marketingEvents", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("marketingEvents").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("marketingEvents").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("marketingEvents").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("marketingEvents").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("marketingEvents").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("marketingEvents").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("marketingEvents").add(queryArg);
    return projection;
  }

  public MarketConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> markets() {
     MarketConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MarketConnectionProjection<>(this, getRoot());
     getFields().put("markets", projection);
     return projection;
  }

  public MarketConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> markets(Integer first,
      String after, Integer last, String before, Boolean reverse) {
    MarketConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MarketConnectionProjection<>(this, getRoot());    
    getFields().put("markets", projection);
    getInputArguments().computeIfAbsent("markets", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("markets").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("markets").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("markets").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("markets").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("markets").add(reverseArg);
    return projection;
  }

  public MetafieldDefinitionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> metafieldDefinition(
      ) {
     MetafieldDefinitionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionProjection<>(this, getRoot());
     getFields().put("metafieldDefinition", projection);
     return projection;
  }

  public MetafieldDefinitionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> metafieldDefinition(
      String id) {
    MetafieldDefinitionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionProjection<>(this, getRoot());    
    getFields().put("metafieldDefinition", projection);
    getInputArguments().computeIfAbsent("metafieldDefinition", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("metafieldDefinition").add(idArg);
    return projection;
  }

  public MetafieldDefinitionTypeProjection<QueryRootProjection<PARENT, ROOT>, ROOT> metafieldDefinitionTypes(
      ) {
     MetafieldDefinitionTypeProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionTypeProjection<>(this, getRoot());
     getFields().put("metafieldDefinitionTypes", projection);
     return projection;
  }

  public MetafieldDefinitionConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> metafieldDefinitions(
      ) {
     MetafieldDefinitionConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConnectionProjection<>(this, getRoot());
     getFields().put("metafieldDefinitions", projection);
     return projection;
  }

  public MetafieldDefinitionConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> metafieldDefinitions(
      String key, String namespace, MetafieldOwnerType ownerType,
      MetafieldDefinitionPinnedStatus pinnedStatus, Integer first, String after, Integer last,
      String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey, String query) {
    MetafieldDefinitionConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConnectionProjection<>(this, getRoot());    
    getFields().put("metafieldDefinitions", projection);
    getInputArguments().computeIfAbsent("metafieldDefinitions", k -> new ArrayList<>());                      
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafieldDefinitions").add(keyArg);
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafieldDefinitions").add(namespaceArg);
    InputArgument ownerTypeArg = new InputArgument("ownerType", ownerType);
    getInputArguments().get("metafieldDefinitions").add(ownerTypeArg);
    InputArgument pinnedStatusArg = new InputArgument("pinnedStatus", pinnedStatus);
    getInputArguments().get("metafieldDefinitions").add(pinnedStatusArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("metafieldDefinitions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("metafieldDefinitions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("metafieldDefinitions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("metafieldDefinitions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("metafieldDefinitions").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("metafieldDefinitions").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("metafieldDefinitions").add(queryArg);
    return projection;
  }

  public MetafieldStorefrontVisibilityConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> metafieldStorefrontVisibilities(
      ) {
     MetafieldStorefrontVisibilityConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MetafieldStorefrontVisibilityConnectionProjection<>(this, getRoot());
     getFields().put("metafieldStorefrontVisibilities", projection);
     return projection;
  }

  public MetafieldStorefrontVisibilityConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> metafieldStorefrontVisibilities(
      String namespace, Integer first, String after, Integer last, String before, Boolean reverse) {
    MetafieldStorefrontVisibilityConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MetafieldStorefrontVisibilityConnectionProjection<>(this, getRoot());    
    getFields().put("metafieldStorefrontVisibilities", projection);
    getInputArguments().computeIfAbsent("metafieldStorefrontVisibilities", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafieldStorefrontVisibilities").add(namespaceArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("metafieldStorefrontVisibilities").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("metafieldStorefrontVisibilities").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("metafieldStorefrontVisibilities").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("metafieldStorefrontVisibilities").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("metafieldStorefrontVisibilities").add(reverseArg);
    return projection;
  }

  public MetafieldStorefrontVisibilityProjection<QueryRootProjection<PARENT, ROOT>, ROOT> metafieldStorefrontVisibility(
      ) {
     MetafieldStorefrontVisibilityProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MetafieldStorefrontVisibilityProjection<>(this, getRoot());
     getFields().put("metafieldStorefrontVisibility", projection);
     return projection;
  }

  public MetafieldStorefrontVisibilityProjection<QueryRootProjection<PARENT, ROOT>, ROOT> metafieldStorefrontVisibility(
      String id) {
    MetafieldStorefrontVisibilityProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MetafieldStorefrontVisibilityProjection<>(this, getRoot());    
    getFields().put("metafieldStorefrontVisibility", projection);
    getInputArguments().computeIfAbsent("metafieldStorefrontVisibility", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("metafieldStorefrontVisibility").add(idArg);
    return projection;
  }

  public MetaobjectProjection<QueryRootProjection<PARENT, ROOT>, ROOT> metaobject() {
     MetaobjectProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectProjection<>(this, getRoot());
     getFields().put("metaobject", projection);
     return projection;
  }

  public MetaobjectProjection<QueryRootProjection<PARENT, ROOT>, ROOT> metaobject(String id) {
    MetaobjectProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectProjection<>(this, getRoot());    
    getFields().put("metaobject", projection);
    getInputArguments().computeIfAbsent("metaobject", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("metaobject").add(idArg);
    return projection;
  }

  public MetaobjectProjection<QueryRootProjection<PARENT, ROOT>, ROOT> metaobjectByHandle() {
     MetaobjectProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectProjection<>(this, getRoot());
     getFields().put("metaobjectByHandle", projection);
     return projection;
  }

  public MetaobjectProjection<QueryRootProjection<PARENT, ROOT>, ROOT> metaobjectByHandle(
      MetaobjectHandleInput handle) {
    MetaobjectProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectProjection<>(this, getRoot());    
    getFields().put("metaobjectByHandle", projection);
    getInputArguments().computeIfAbsent("metaobjectByHandle", k -> new ArrayList<>());                      
    InputArgument handleArg = new InputArgument("handle", handle);
    getInputArguments().get("metaobjectByHandle").add(handleArg);
    return projection;
  }

  public MetaobjectDefinitionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> metaobjectDefinition(
      ) {
     MetaobjectDefinitionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectDefinitionProjection<>(this, getRoot());
     getFields().put("metaobjectDefinition", projection);
     return projection;
  }

  public MetaobjectDefinitionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> metaobjectDefinition(
      String id) {
    MetaobjectDefinitionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectDefinitionProjection<>(this, getRoot());    
    getFields().put("metaobjectDefinition", projection);
    getInputArguments().computeIfAbsent("metaobjectDefinition", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("metaobjectDefinition").add(idArg);
    return projection;
  }

  public MetaobjectDefinitionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> metaobjectDefinitionByType(
      ) {
     MetaobjectDefinitionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectDefinitionProjection<>(this, getRoot());
     getFields().put("metaobjectDefinitionByType", projection);
     return projection;
  }

  public MetaobjectDefinitionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> metaobjectDefinitionByType(
      String type) {
    MetaobjectDefinitionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectDefinitionProjection<>(this, getRoot());    
    getFields().put("metaobjectDefinitionByType", projection);
    getInputArguments().computeIfAbsent("metaobjectDefinitionByType", k -> new ArrayList<>());                      
    InputArgument typeArg = new InputArgument("type", type);
    getInputArguments().get("metaobjectDefinitionByType").add(typeArg);
    return projection;
  }

  public MetaobjectDefinitionConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> metaobjectDefinitions(
      ) {
     MetaobjectDefinitionConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectDefinitionConnectionProjection<>(this, getRoot());
     getFields().put("metaobjectDefinitions", projection);
     return projection;
  }

  public MetaobjectDefinitionConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> metaobjectDefinitions(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MetaobjectDefinitionConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectDefinitionConnectionProjection<>(this, getRoot());    
    getFields().put("metaobjectDefinitions", projection);
    getInputArguments().computeIfAbsent("metaobjectDefinitions", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("metaobjectDefinitions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("metaobjectDefinitions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("metaobjectDefinitions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("metaobjectDefinitions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("metaobjectDefinitions").add(reverseArg);
    return projection;
  }

  public MetaobjectConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> metaobjects() {
     MetaobjectConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectConnectionProjection<>(this, getRoot());
     getFields().put("metaobjects", projection);
     return projection;
  }

  public MetaobjectConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> metaobjects(
      String type, String sortKey, Integer first, String after, Integer last, String before,
      Boolean reverse, String query) {
    MetaobjectConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectConnectionProjection<>(this, getRoot());    
    getFields().put("metaobjects", projection);
    getInputArguments().computeIfAbsent("metaobjects", k -> new ArrayList<>());                      
    InputArgument typeArg = new InputArgument("type", type);
    getInputArguments().get("metaobjects").add(typeArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("metaobjects").add(sortKeyArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("metaobjects").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("metaobjects").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("metaobjects").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("metaobjects").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("metaobjects").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("metaobjects").add(queryArg);
    return projection;
  }

  public NodeProjection<QueryRootProjection<PARENT, ROOT>, ROOT> node() {
     NodeProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new NodeProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public NodeProjection<QueryRootProjection<PARENT, ROOT>, ROOT> node(String id) {
    NodeProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new NodeProjection<>(this, getRoot());    
    getFields().put("node", projection);
    getInputArguments().computeIfAbsent("node", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("node").add(idArg);
    return projection;
  }

  public NodeProjection<QueryRootProjection<PARENT, ROOT>, ROOT> nodes() {
     NodeProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new NodeProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public NodeProjection<QueryRootProjection<PARENT, ROOT>, ROOT> nodes(List<String> ids) {
    NodeProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new NodeProjection<>(this, getRoot());    
    getFields().put("nodes", projection);
    getInputArguments().computeIfAbsent("nodes", k -> new ArrayList<>());                      
    InputArgument idsArg = new InputArgument("ids", ids);
    getInputArguments().get("nodes").add(idsArg);
    return projection;
  }

  public OrderProjection<QueryRootProjection<PARENT, ROOT>, ROOT> order() {
     OrderProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("order", projection);
     return projection;
  }

  public OrderProjection<QueryRootProjection<PARENT, ROOT>, ROOT> order(String id) {
    OrderProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());    
    getFields().put("order", projection);
    getInputArguments().computeIfAbsent("order", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("order").add(idArg);
    return projection;
  }

  public OrderPaymentStatusProjection<QueryRootProjection<PARENT, ROOT>, ROOT> orderPaymentStatus(
      ) {
     OrderPaymentStatusProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new OrderPaymentStatusProjection<>(this, getRoot());
     getFields().put("orderPaymentStatus", projection);
     return projection;
  }

  public OrderPaymentStatusProjection<QueryRootProjection<PARENT, ROOT>, ROOT> orderPaymentStatus(
      String paymentReferenceId, String orderId) {
    OrderPaymentStatusProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new OrderPaymentStatusProjection<>(this, getRoot());    
    getFields().put("orderPaymentStatus", projection);
    getInputArguments().computeIfAbsent("orderPaymentStatus", k -> new ArrayList<>());                      
    InputArgument paymentReferenceIdArg = new InputArgument("paymentReferenceId", paymentReferenceId);
    getInputArguments().get("orderPaymentStatus").add(paymentReferenceIdArg);
    InputArgument orderIdArg = new InputArgument("orderId", orderId);
    getInputArguments().get("orderPaymentStatus").add(orderIdArg);
    return projection;
  }

  public SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> orderSavedSearches(
      ) {
     SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());
     getFields().put("orderSavedSearches", projection);
     return projection;
  }

  public SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> orderSavedSearches(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());    
    getFields().put("orderSavedSearches", projection);
    getInputArguments().computeIfAbsent("orderSavedSearches", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("orderSavedSearches").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("orderSavedSearches").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("orderSavedSearches").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("orderSavedSearches").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("orderSavedSearches").add(reverseArg);
    return projection;
  }

  public OrderConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> orders() {
     OrderConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new OrderConnectionProjection<>(this, getRoot());
     getFields().put("orders", projection);
     return projection;
  }

  public OrderConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> orders(Integer first,
      String after, Integer last, String before, Boolean reverse, OrderSortKeys sortKey,
      String query, String savedSearchId) {
    OrderConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new OrderConnectionProjection<>(this, getRoot());    
    getFields().put("orders", projection);
    getInputArguments().computeIfAbsent("orders", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("orders").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("orders").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("orders").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("orders").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("orders").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("orders").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("orders").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("orders").add(savedSearchIdArg);
    return projection;
  }

  public PaymentCustomizationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> paymentCustomization(
      ) {
     PaymentCustomizationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new PaymentCustomizationProjection<>(this, getRoot());
     getFields().put("paymentCustomization", projection);
     return projection;
  }

  public PaymentCustomizationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> paymentCustomization(
      String id) {
    PaymentCustomizationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new PaymentCustomizationProjection<>(this, getRoot());    
    getFields().put("paymentCustomization", projection);
    getInputArguments().computeIfAbsent("paymentCustomization", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("paymentCustomization").add(idArg);
    return projection;
  }

  public PaymentCustomizationConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> paymentCustomizations(
      ) {
     PaymentCustomizationConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new PaymentCustomizationConnectionProjection<>(this, getRoot());
     getFields().put("paymentCustomizations", projection);
     return projection;
  }

  public PaymentCustomizationConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> paymentCustomizations(
      Integer first, String after, Integer last, String before, Boolean reverse, String query) {
    PaymentCustomizationConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new PaymentCustomizationConnectionProjection<>(this, getRoot());    
    getFields().put("paymentCustomizations", projection);
    getInputArguments().computeIfAbsent("paymentCustomizations", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("paymentCustomizations").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("paymentCustomizations").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("paymentCustomizations").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("paymentCustomizations").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("paymentCustomizations").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("paymentCustomizations").add(queryArg);
    return projection;
  }

  public PaymentTermsTemplateProjection<QueryRootProjection<PARENT, ROOT>, ROOT> paymentTermsTemplates(
      ) {
     PaymentTermsTemplateProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new PaymentTermsTemplateProjection<>(this, getRoot());
     getFields().put("paymentTermsTemplates", projection);
     return projection;
  }

  public PaymentTermsTemplateProjection<QueryRootProjection<PARENT, ROOT>, ROOT> paymentTermsTemplates(
      PaymentTermsType paymentTermsType) {
    PaymentTermsTemplateProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new PaymentTermsTemplateProjection<>(this, getRoot());    
    getFields().put("paymentTermsTemplates", projection);
    getInputArguments().computeIfAbsent("paymentTermsTemplates", k -> new ArrayList<>());                      
    InputArgument paymentTermsTypeArg = new InputArgument("paymentTermsType", paymentTermsType);
    getInputArguments().get("paymentTermsTemplates").add(paymentTermsTypeArg);
    return projection;
  }

  public PriceListProjection<QueryRootProjection<PARENT, ROOT>, ROOT> priceList() {
     PriceListProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new PriceListProjection<>(this, getRoot());
     getFields().put("priceList", projection);
     return projection;
  }

  public PriceListProjection<QueryRootProjection<PARENT, ROOT>, ROOT> priceList(String id) {
    PriceListProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new PriceListProjection<>(this, getRoot());    
    getFields().put("priceList", projection);
    getInputArguments().computeIfAbsent("priceList", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("priceList").add(idArg);
    return projection;
  }

  public PriceListConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> priceLists() {
     PriceListConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new PriceListConnectionProjection<>(this, getRoot());
     getFields().put("priceLists", projection);
     return projection;
  }

  public PriceListConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> priceLists(
      Integer first, String after, Integer last, String before, Boolean reverse,
      PriceListSortKeys sortKey) {
    PriceListConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new PriceListConnectionProjection<>(this, getRoot());    
    getFields().put("priceLists", projection);
    getInputArguments().computeIfAbsent("priceLists", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("priceLists").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("priceLists").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("priceLists").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("priceLists").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("priceLists").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("priceLists").add(sortKeyArg);
    return projection;
  }

  public PriceRuleProjection<QueryRootProjection<PARENT, ROOT>, ROOT> priceRule() {
     PriceRuleProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleProjection<>(this, getRoot());
     getFields().put("priceRule", projection);
     return projection;
  }

  public PriceRuleProjection<QueryRootProjection<PARENT, ROOT>, ROOT> priceRule(String id) {
    PriceRuleProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleProjection<>(this, getRoot());    
    getFields().put("priceRule", projection);
    getInputArguments().computeIfAbsent("priceRule", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("priceRule").add(idArg);
    return projection;
  }

  public SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> priceRuleSavedSearches(
      ) {
     SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());
     getFields().put("priceRuleSavedSearches", projection);
     return projection;
  }

  public SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> priceRuleSavedSearches(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());    
    getFields().put("priceRuleSavedSearches", projection);
    getInputArguments().computeIfAbsent("priceRuleSavedSearches", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("priceRuleSavedSearches").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("priceRuleSavedSearches").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("priceRuleSavedSearches").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("priceRuleSavedSearches").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("priceRuleSavedSearches").add(reverseArg);
    return projection;
  }

  public PriceRuleConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> priceRules() {
     PriceRuleConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleConnectionProjection<>(this, getRoot());
     getFields().put("priceRules", projection);
     return projection;
  }

  public PriceRuleConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> priceRules(
      Integer first, String after, Integer last, String before, Boolean reverse,
      PriceRuleSortKeys sortKey, String query, String savedSearchId) {
    PriceRuleConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleConnectionProjection<>(this, getRoot());    
    getFields().put("priceRules", projection);
    getInputArguments().computeIfAbsent("priceRules", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("priceRules").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("priceRules").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("priceRules").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("priceRules").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("priceRules").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("priceRules").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("priceRules").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("priceRules").add(savedSearchIdArg);
    return projection;
  }

  public MarketProjection<QueryRootProjection<PARENT, ROOT>, ROOT> primaryMarket() {
     MarketProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new MarketProjection<>(this, getRoot());
     getFields().put("primaryMarket", projection);
     return projection;
  }

  public PrivateMetafieldProjection<QueryRootProjection<PARENT, ROOT>, ROOT> privateMetafield() {
     PrivateMetafieldProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new PrivateMetafieldProjection<>(this, getRoot());
     getFields().put("privateMetafield", projection);
     return projection;
  }

  public PrivateMetafieldProjection<QueryRootProjection<PARENT, ROOT>, ROOT> privateMetafield(
      String id) {
    PrivateMetafieldProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new PrivateMetafieldProjection<>(this, getRoot());    
    getFields().put("privateMetafield", projection);
    getInputArguments().computeIfAbsent("privateMetafield", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("privateMetafield").add(idArg);
    return projection;
  }

  public PrivateMetafieldConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> privateMetafields(
      ) {
     PrivateMetafieldConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new PrivateMetafieldConnectionProjection<>(this, getRoot());
     getFields().put("privateMetafields", projection);
     return projection;
  }

  public PrivateMetafieldConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> privateMetafields(
      String namespace, String owner, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    PrivateMetafieldConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new PrivateMetafieldConnectionProjection<>(this, getRoot());    
    getFields().put("privateMetafields", projection);
    getInputArguments().computeIfAbsent("privateMetafields", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("privateMetafields").add(namespaceArg);
    InputArgument ownerArg = new InputArgument("owner", owner);
    getInputArguments().get("privateMetafields").add(ownerArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("privateMetafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("privateMetafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("privateMetafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("privateMetafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("privateMetafields").add(reverseArg);
    return projection;
  }

  public ProductProjection<QueryRootProjection<PARENT, ROOT>, ROOT> product() {
     ProductProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("product", projection);
     return projection;
  }

  public ProductProjection<QueryRootProjection<PARENT, ROOT>, ROOT> product(String id) {
    ProductProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());    
    getFields().put("product", projection);
    getInputArguments().computeIfAbsent("product", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("product").add(idArg);
    return projection;
  }

  public ProductProjection<QueryRootProjection<PARENT, ROOT>, ROOT> productByHandle() {
     ProductProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("productByHandle", projection);
     return projection;
  }

  public ProductProjection<QueryRootProjection<PARENT, ROOT>, ROOT> productByHandle(String handle) {
    ProductProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());    
    getFields().put("productByHandle", projection);
    getInputArguments().computeIfAbsent("productByHandle", k -> new ArrayList<>());                      
    InputArgument handleArg = new InputArgument("handle", handle);
    getInputArguments().get("productByHandle").add(handleArg);
    return projection;
  }

  public ProductDuplicateJobProjection<QueryRootProjection<PARENT, ROOT>, ROOT> productDuplicateJob(
      ) {
     ProductDuplicateJobProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ProductDuplicateJobProjection<>(this, getRoot());
     getFields().put("productDuplicateJob", projection);
     return projection;
  }

  public ProductDuplicateJobProjection<QueryRootProjection<PARENT, ROOT>, ROOT> productDuplicateJob(
      String id) {
    ProductDuplicateJobProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ProductDuplicateJobProjection<>(this, getRoot());    
    getFields().put("productDuplicateJob", projection);
    getInputArguments().computeIfAbsent("productDuplicateJob", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("productDuplicateJob").add(idArg);
    return projection;
  }

  public ProductFeedProjection<QueryRootProjection<PARENT, ROOT>, ROOT> productFeed() {
     ProductFeedProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ProductFeedProjection<>(this, getRoot());
     getFields().put("productFeed", projection);
     return projection;
  }

  public ProductFeedProjection<QueryRootProjection<PARENT, ROOT>, ROOT> productFeed(String id) {
    ProductFeedProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ProductFeedProjection<>(this, getRoot());    
    getFields().put("productFeed", projection);
    getInputArguments().computeIfAbsent("productFeed", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("productFeed").add(idArg);
    return projection;
  }

  public ProductFeedConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> productFeeds() {
     ProductFeedConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ProductFeedConnectionProjection<>(this, getRoot());
     getFields().put("productFeeds", projection);
     return projection;
  }

  public ProductFeedConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> productFeeds(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductFeedConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ProductFeedConnectionProjection<>(this, getRoot());    
    getFields().put("productFeeds", projection);
    getInputArguments().computeIfAbsent("productFeeds", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("productFeeds").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("productFeeds").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("productFeeds").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("productFeeds").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("productFeeds").add(reverseArg);
    return projection;
  }

  public ProductResourceFeedbackProjection<QueryRootProjection<PARENT, ROOT>, ROOT> productResourceFeedback(
      ) {
     ProductResourceFeedbackProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ProductResourceFeedbackProjection<>(this, getRoot());
     getFields().put("productResourceFeedback", projection);
     return projection;
  }

  public ProductResourceFeedbackProjection<QueryRootProjection<PARENT, ROOT>, ROOT> productResourceFeedback(
      String id) {
    ProductResourceFeedbackProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ProductResourceFeedbackProjection<>(this, getRoot());    
    getFields().put("productResourceFeedback", projection);
    getInputArguments().computeIfAbsent("productResourceFeedback", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("productResourceFeedback").add(idArg);
    return projection;
  }

  public SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> productSavedSearches(
      ) {
     SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());
     getFields().put("productSavedSearches", projection);
     return projection;
  }

  public SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> productSavedSearches(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());    
    getFields().put("productSavedSearches", projection);
    getInputArguments().computeIfAbsent("productSavedSearches", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("productSavedSearches").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("productSavedSearches").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("productSavedSearches").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("productSavedSearches").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("productSavedSearches").add(reverseArg);
    return projection;
  }

  public ProductVariantProjection<QueryRootProjection<PARENT, ROOT>, ROOT> productVariant() {
     ProductVariantProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());
     getFields().put("productVariant", projection);
     return projection;
  }

  public ProductVariantProjection<QueryRootProjection<PARENT, ROOT>, ROOT> productVariant(
      String id) {
    ProductVariantProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());    
    getFields().put("productVariant", projection);
    getInputArguments().computeIfAbsent("productVariant", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("productVariant").add(idArg);
    return projection;
  }

  public ProductVariantConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> productVariants(
      ) {
     ProductVariantConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantConnectionProjection<>(this, getRoot());
     getFields().put("productVariants", projection);
     return projection;
  }

  public ProductVariantConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> productVariants(
      Integer first, String after, Integer last, String before, Boolean reverse,
      ProductVariantSortKeys sortKey, String query, String savedSearchId) {
    ProductVariantConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantConnectionProjection<>(this, getRoot());    
    getFields().put("productVariants", projection);
    getInputArguments().computeIfAbsent("productVariants", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("productVariants").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("productVariants").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("productVariants").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("productVariants").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("productVariants").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("productVariants").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("productVariants").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("productVariants").add(savedSearchIdArg);
    return projection;
  }

  public ProductConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> products() {
     ProductConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ProductConnectionProjection<>(this, getRoot());
     getFields().put("products", projection);
     return projection;
  }

  public ProductConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> products(
      Integer first, String after, Integer last, String before, Boolean reverse,
      ProductSortKeys sortKey, String query, String savedSearchId) {
    ProductConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ProductConnectionProjection<>(this, getRoot());    
    getFields().put("products", projection);
    getInputArguments().computeIfAbsent("products", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("products").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("products").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("products").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("products").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("products").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("products").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("products").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("products").add(savedSearchIdArg);
    return projection;
  }

  public ApiVersionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> publicApiVersions() {
     ApiVersionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ApiVersionProjection<>(this, getRoot());
     getFields().put("publicApiVersions", projection);
     return projection;
  }

  public PublicationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> publication() {
     PublicationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new PublicationProjection<>(this, getRoot());
     getFields().put("publication", projection);
     return projection;
  }

  public PublicationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> publication(String id) {
    PublicationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new PublicationProjection<>(this, getRoot());    
    getFields().put("publication", projection);
    getInputArguments().computeIfAbsent("publication", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("publication").add(idArg);
    return projection;
  }

  public PublicationConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> publications() {
     PublicationConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new PublicationConnectionProjection<>(this, getRoot());
     getFields().put("publications", projection);
     return projection;
  }

  public PublicationConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> publications(
      CatalogType catalogType, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    PublicationConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new PublicationConnectionProjection<>(this, getRoot());    
    getFields().put("publications", projection);
    getInputArguments().computeIfAbsent("publications", k -> new ArrayList<>());                      
    InputArgument catalogTypeArg = new InputArgument("catalogType", catalogType);
    getInputArguments().get("publications").add(catalogTypeArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("publications").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("publications").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("publications").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("publications").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("publications").add(reverseArg);
    return projection;
  }

  public RefundProjection<QueryRootProjection<PARENT, ROOT>, ROOT> refund() {
     RefundProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new RefundProjection<>(this, getRoot());
     getFields().put("refund", projection);
     return projection;
  }

  public RefundProjection<QueryRootProjection<PARENT, ROOT>, ROOT> refund(String id) {
    RefundProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new RefundProjection<>(this, getRoot());    
    getFields().put("refund", projection);
    getInputArguments().computeIfAbsent("refund", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("refund").add(idArg);
    return projection;
  }

  public ReturnProjection<QueryRootProjection<PARENT, ROOT>, ROOT> _return() {
     ReturnProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ReturnProjection<>(this, getRoot());
     getFields().put("return", projection);
     return projection;
  }

  public ReturnProjection<QueryRootProjection<PARENT, ROOT>, ROOT> _return(String id) {
    ReturnProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ReturnProjection<>(this, getRoot());    
    getFields().put("return", projection);
    getInputArguments().computeIfAbsent("return", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("return").add(idArg);
    return projection;
  }

  public ReturnableFulfillmentProjection<QueryRootProjection<PARENT, ROOT>, ROOT> returnableFulfillment(
      ) {
     ReturnableFulfillmentProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ReturnableFulfillmentProjection<>(this, getRoot());
     getFields().put("returnableFulfillment", projection);
     return projection;
  }

  public ReturnableFulfillmentProjection<QueryRootProjection<PARENT, ROOT>, ROOT> returnableFulfillment(
      String id) {
    ReturnableFulfillmentProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ReturnableFulfillmentProjection<>(this, getRoot());    
    getFields().put("returnableFulfillment", projection);
    getInputArguments().computeIfAbsent("returnableFulfillment", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("returnableFulfillment").add(idArg);
    return projection;
  }

  public ReturnableFulfillmentConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> returnableFulfillments(
      ) {
     ReturnableFulfillmentConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ReturnableFulfillmentConnectionProjection<>(this, getRoot());
     getFields().put("returnableFulfillments", projection);
     return projection;
  }

  public ReturnableFulfillmentConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> returnableFulfillments(
      String orderId, Integer first, String after, Integer last, String before, Boolean reverse) {
    ReturnableFulfillmentConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ReturnableFulfillmentConnectionProjection<>(this, getRoot());    
    getFields().put("returnableFulfillments", projection);
    getInputArguments().computeIfAbsent("returnableFulfillments", k -> new ArrayList<>());                      
    InputArgument orderIdArg = new InputArgument("orderId", orderId);
    getInputArguments().get("returnableFulfillments").add(orderIdArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("returnableFulfillments").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("returnableFulfillments").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("returnableFulfillments").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("returnableFulfillments").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("returnableFulfillments").add(reverseArg);
    return projection;
  }

  public ReverseDeliveryProjection<QueryRootProjection<PARENT, ROOT>, ROOT> reverseDelivery() {
     ReverseDeliveryProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ReverseDeliveryProjection<>(this, getRoot());
     getFields().put("reverseDelivery", projection);
     return projection;
  }

  public ReverseDeliveryProjection<QueryRootProjection<PARENT, ROOT>, ROOT> reverseDelivery(
      String id) {
    ReverseDeliveryProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ReverseDeliveryProjection<>(this, getRoot());    
    getFields().put("reverseDelivery", projection);
    getInputArguments().computeIfAbsent("reverseDelivery", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("reverseDelivery").add(idArg);
    return projection;
  }

  public ReverseFulfillmentOrderProjection<QueryRootProjection<PARENT, ROOT>, ROOT> reverseFulfillmentOrder(
      ) {
     ReverseFulfillmentOrderProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ReverseFulfillmentOrderProjection<>(this, getRoot());
     getFields().put("reverseFulfillmentOrder", projection);
     return projection;
  }

  public ReverseFulfillmentOrderProjection<QueryRootProjection<PARENT, ROOT>, ROOT> reverseFulfillmentOrder(
      String id) {
    ReverseFulfillmentOrderProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ReverseFulfillmentOrderProjection<>(this, getRoot());    
    getFields().put("reverseFulfillmentOrder", projection);
    getInputArguments().computeIfAbsent("reverseFulfillmentOrder", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("reverseFulfillmentOrder").add(idArg);
    return projection;
  }

  public ScriptTagProjection<QueryRootProjection<PARENT, ROOT>, ROOT> scriptTag() {
     ScriptTagProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ScriptTagProjection<>(this, getRoot());
     getFields().put("scriptTag", projection);
     return projection;
  }

  public ScriptTagProjection<QueryRootProjection<PARENT, ROOT>, ROOT> scriptTag(String id) {
    ScriptTagProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ScriptTagProjection<>(this, getRoot());    
    getFields().put("scriptTag", projection);
    getInputArguments().computeIfAbsent("scriptTag", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("scriptTag").add(idArg);
    return projection;
  }

  public ScriptTagConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> scriptTags() {
     ScriptTagConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ScriptTagConnectionProjection<>(this, getRoot());
     getFields().put("scriptTags", projection);
     return projection;
  }

  public ScriptTagConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> scriptTags(
      Integer first, String after, Integer last, String before, Boolean reverse, String src) {
    ScriptTagConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ScriptTagConnectionProjection<>(this, getRoot());    
    getFields().put("scriptTags", projection);
    getInputArguments().computeIfAbsent("scriptTags", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("scriptTags").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("scriptTags").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("scriptTags").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("scriptTags").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("scriptTags").add(reverseArg);
    InputArgument srcArg = new InputArgument("src", src);
    getInputArguments().get("scriptTags").add(srcArg);
    return projection;
  }

  public SegmentProjection<QueryRootProjection<PARENT, ROOT>, ROOT> segment() {
     SegmentProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SegmentProjection<>(this, getRoot());
     getFields().put("segment", projection);
     return projection;
  }

  public SegmentProjection<QueryRootProjection<PARENT, ROOT>, ROOT> segment(String id) {
    SegmentProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SegmentProjection<>(this, getRoot());    
    getFields().put("segment", projection);
    getInputArguments().computeIfAbsent("segment", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("segment").add(idArg);
    return projection;
  }

  public SegmentFilterConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> segmentFilterSuggestions(
      ) {
     SegmentFilterConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SegmentFilterConnectionProjection<>(this, getRoot());
     getFields().put("segmentFilterSuggestions", projection);
     return projection;
  }

  public SegmentFilterConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> segmentFilterSuggestions(
      String search, int first, String after) {
    SegmentFilterConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SegmentFilterConnectionProjection<>(this, getRoot());    
    getFields().put("segmentFilterSuggestions", projection);
    getInputArguments().computeIfAbsent("segmentFilterSuggestions", k -> new ArrayList<>());                      
    InputArgument searchArg = new InputArgument("search", search);
    getInputArguments().get("segmentFilterSuggestions").add(searchArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("segmentFilterSuggestions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("segmentFilterSuggestions").add(afterArg);
    return projection;
  }

  public SegmentFilterConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> segmentFilters(
      ) {
     SegmentFilterConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SegmentFilterConnectionProjection<>(this, getRoot());
     getFields().put("segmentFilters", projection);
     return projection;
  }

  public SegmentFilterConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> segmentFilters(
      Integer first, String after, Integer last, String before) {
    SegmentFilterConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SegmentFilterConnectionProjection<>(this, getRoot());    
    getFields().put("segmentFilters", projection);
    getInputArguments().computeIfAbsent("segmentFilters", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("segmentFilters").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("segmentFilters").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("segmentFilters").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("segmentFilters").add(beforeArg);
    return projection;
  }

  public SegmentMigrationConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> segmentMigrations(
      ) {
     SegmentMigrationConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SegmentMigrationConnectionProjection<>(this, getRoot());
     getFields().put("segmentMigrations", projection);
     return projection;
  }

  public SegmentMigrationConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> segmentMigrations(
      String savedSearchId, Integer first, String after, Integer last, String before) {
    SegmentMigrationConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SegmentMigrationConnectionProjection<>(this, getRoot());    
    getFields().put("segmentMigrations", projection);
    getInputArguments().computeIfAbsent("segmentMigrations", k -> new ArrayList<>());                      
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("segmentMigrations").add(savedSearchIdArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("segmentMigrations").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("segmentMigrations").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("segmentMigrations").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("segmentMigrations").add(beforeArg);
    return projection;
  }

  public SegmentValueConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> segmentValueSuggestions(
      ) {
     SegmentValueConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SegmentValueConnectionProjection<>(this, getRoot());
     getFields().put("segmentValueSuggestions", projection);
     return projection;
  }

  public SegmentValueConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> segmentValueSuggestions(
      String search, String filterQueryName, String functionParameterQueryName, Integer first,
      String after, Integer last, String before) {
    SegmentValueConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SegmentValueConnectionProjection<>(this, getRoot());    
    getFields().put("segmentValueSuggestions", projection);
    getInputArguments().computeIfAbsent("segmentValueSuggestions", k -> new ArrayList<>());                      
    InputArgument searchArg = new InputArgument("search", search);
    getInputArguments().get("segmentValueSuggestions").add(searchArg);
    InputArgument filterQueryNameArg = new InputArgument("filterQueryName", filterQueryName);
    getInputArguments().get("segmentValueSuggestions").add(filterQueryNameArg);
    InputArgument functionParameterQueryNameArg = new InputArgument("functionParameterQueryName", functionParameterQueryName);
    getInputArguments().get("segmentValueSuggestions").add(functionParameterQueryNameArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("segmentValueSuggestions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("segmentValueSuggestions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("segmentValueSuggestions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("segmentValueSuggestions").add(beforeArg);
    return projection;
  }

  public SegmentConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> segments() {
     SegmentConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SegmentConnectionProjection<>(this, getRoot());
     getFields().put("segments", projection);
     return projection;
  }

  public SegmentConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> segments(
      Integer first, String after, Integer last, String before, Boolean reverse,
      SegmentSortKeys sortKey, String query) {
    SegmentConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SegmentConnectionProjection<>(this, getRoot());    
    getFields().put("segments", projection);
    getInputArguments().computeIfAbsent("segments", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("segments").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("segments").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("segments").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("segments").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("segments").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("segments").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("segments").add(queryArg);
    return projection;
  }

  public SellingPlanGroupProjection<QueryRootProjection<PARENT, ROOT>, ROOT> sellingPlanGroup() {
     SellingPlanGroupProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanGroupProjection<>(this, getRoot());
     getFields().put("sellingPlanGroup", projection);
     return projection;
  }

  public SellingPlanGroupProjection<QueryRootProjection<PARENT, ROOT>, ROOT> sellingPlanGroup(
      String id) {
    SellingPlanGroupProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanGroupProjection<>(this, getRoot());    
    getFields().put("sellingPlanGroup", projection);
    getInputArguments().computeIfAbsent("sellingPlanGroup", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("sellingPlanGroup").add(idArg);
    return projection;
  }

  public SellingPlanGroupConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> sellingPlanGroups(
      ) {
     SellingPlanGroupConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanGroupConnectionProjection<>(this, getRoot());
     getFields().put("sellingPlanGroups", projection);
     return projection;
  }

  public SellingPlanGroupConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> sellingPlanGroups(
      Integer first, String after, Integer last, String before, Boolean reverse,
      SellingPlanGroupSortKeys sortKey, String query) {
    SellingPlanGroupConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanGroupConnectionProjection<>(this, getRoot());    
    getFields().put("sellingPlanGroups", projection);
    getInputArguments().computeIfAbsent("sellingPlanGroups", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("sellingPlanGroups").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("sellingPlanGroups").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("sellingPlanGroups").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("sellingPlanGroups").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("sellingPlanGroups").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("sellingPlanGroups").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("sellingPlanGroups").add(queryArg);
    return projection;
  }

  public ServerPixelProjection<QueryRootProjection<PARENT, ROOT>, ROOT> serverPixel() {
     ServerPixelProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ServerPixelProjection<>(this, getRoot());
     getFields().put("serverPixel", projection);
     return projection;
  }

  public ShopProjection<QueryRootProjection<PARENT, ROOT>, ROOT> shop() {
     ShopProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ShopProjection<>(this, getRoot());
     getFields().put("shop", projection);
     return projection;
  }

  public ShopBillingPreferencesProjection<QueryRootProjection<PARENT, ROOT>, ROOT> shopBillingPreferences(
      ) {
     ShopBillingPreferencesProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ShopBillingPreferencesProjection<>(this, getRoot());
     getFields().put("shopBillingPreferences", projection);
     return projection;
  }

  public ShopLocaleProjection<QueryRootProjection<PARENT, ROOT>, ROOT> shopLocales() {
     ShopLocaleProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ShopLocaleProjection<>(this, getRoot());
     getFields().put("shopLocales", projection);
     return projection;
  }

  public ShopLocaleProjection<QueryRootProjection<PARENT, ROOT>, ROOT> shopLocales(
      Boolean published) {
    ShopLocaleProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ShopLocaleProjection<>(this, getRoot());    
    getFields().put("shopLocales", projection);
    getInputArguments().computeIfAbsent("shopLocales", k -> new ArrayList<>());                      
    InputArgument publishedArg = new InputArgument("published", published);
    getInputArguments().get("shopLocales").add(publishedArg);
    return projection;
  }

  public ShopifyFunctionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> shopifyFunction() {
     ShopifyFunctionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ShopifyFunctionProjection<>(this, getRoot());
     getFields().put("shopifyFunction", projection);
     return projection;
  }

  public ShopifyFunctionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> shopifyFunction(
      String id) {
    ShopifyFunctionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ShopifyFunctionProjection<>(this, getRoot());    
    getFields().put("shopifyFunction", projection);
    getInputArguments().computeIfAbsent("shopifyFunction", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("shopifyFunction").add(idArg);
    return projection;
  }

  public ShopifyFunctionConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> shopifyFunctions(
      ) {
     ShopifyFunctionConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ShopifyFunctionConnectionProjection<>(this, getRoot());
     getFields().put("shopifyFunctions", projection);
     return projection;
  }

  public ShopifyFunctionConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> shopifyFunctions(
      String apiType, Boolean useCreationUi, Integer first, String after, Integer last,
      String before, Boolean reverse) {
    ShopifyFunctionConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ShopifyFunctionConnectionProjection<>(this, getRoot());    
    getFields().put("shopifyFunctions", projection);
    getInputArguments().computeIfAbsent("shopifyFunctions", k -> new ArrayList<>());                      
    InputArgument apiTypeArg = new InputArgument("apiType", apiType);
    getInputArguments().get("shopifyFunctions").add(apiTypeArg);
    InputArgument useCreationUiArg = new InputArgument("useCreationUi", useCreationUi);
    getInputArguments().get("shopifyFunctions").add(useCreationUiArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("shopifyFunctions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("shopifyFunctions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("shopifyFunctions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("shopifyFunctions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("shopifyFunctions").add(reverseArg);
    return projection;
  }

  public ShopifyPaymentsAccountProjection<QueryRootProjection<PARENT, ROOT>, ROOT> shopifyPaymentsAccount(
      ) {
     ShopifyPaymentsAccountProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsAccountProjection<>(this, getRoot());
     getFields().put("shopifyPaymentsAccount", projection);
     return projection;
  }

  public ShopifyqlResponseProjection<QueryRootProjection<PARENT, ROOT>, ROOT> shopifyqlQuery() {
     ShopifyqlResponseProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ShopifyqlResponseProjection<>(this, getRoot());
     getFields().put("shopifyqlQuery", projection);
     return projection;
  }

  public ShopifyqlResponseProjection<QueryRootProjection<PARENT, ROOT>, ROOT> shopifyqlQuery(
      String query) {
    ShopifyqlResponseProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ShopifyqlResponseProjection<>(this, getRoot());    
    getFields().put("shopifyqlQuery", projection);
    getInputArguments().computeIfAbsent("shopifyqlQuery", k -> new ArrayList<>());                      
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("shopifyqlQuery").add(queryArg);
    return projection;
  }

  public StaffMemberProjection<QueryRootProjection<PARENT, ROOT>, ROOT> staffMember() {
     StaffMemberProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("staffMember", projection);
     return projection;
  }

  public StaffMemberProjection<QueryRootProjection<PARENT, ROOT>, ROOT> staffMember(String id) {
    StaffMemberProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());    
    getFields().put("staffMember", projection);
    getInputArguments().computeIfAbsent("staffMember", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("staffMember").add(idArg);
    return projection;
  }

  public StandardMetafieldDefinitionTemplateConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> standardMetafieldDefinitionTemplates(
      ) {
     StandardMetafieldDefinitionTemplateConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new StandardMetafieldDefinitionTemplateConnectionProjection<>(this, getRoot());
     getFields().put("standardMetafieldDefinitionTemplates", projection);
     return projection;
  }

  public StandardMetafieldDefinitionTemplateConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> standardMetafieldDefinitionTemplates(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    StandardMetafieldDefinitionTemplateConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new StandardMetafieldDefinitionTemplateConnectionProjection<>(this, getRoot());    
    getFields().put("standardMetafieldDefinitionTemplates", projection);
    getInputArguments().computeIfAbsent("standardMetafieldDefinitionTemplates", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("standardMetafieldDefinitionTemplates").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("standardMetafieldDefinitionTemplates").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("standardMetafieldDefinitionTemplates").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("standardMetafieldDefinitionTemplates").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("standardMetafieldDefinitionTemplates").add(reverseArg);
    return projection;
  }

  public SubscriptionBillingAttemptProjection<QueryRootProjection<PARENT, ROOT>, ROOT> subscriptionBillingAttempt(
      ) {
     SubscriptionBillingAttemptProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingAttemptProjection<>(this, getRoot());
     getFields().put("subscriptionBillingAttempt", projection);
     return projection;
  }

  public SubscriptionBillingAttemptProjection<QueryRootProjection<PARENT, ROOT>, ROOT> subscriptionBillingAttempt(
      String id) {
    SubscriptionBillingAttemptProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingAttemptProjection<>(this, getRoot());    
    getFields().put("subscriptionBillingAttempt", projection);
    getInputArguments().computeIfAbsent("subscriptionBillingAttempt", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("subscriptionBillingAttempt").add(idArg);
    return projection;
  }

  public SubscriptionBillingAttemptConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> subscriptionBillingAttempts(
      ) {
     SubscriptionBillingAttemptConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingAttemptConnectionProjection<>(this, getRoot());
     getFields().put("subscriptionBillingAttempts", projection);
     return projection;
  }

  public SubscriptionBillingAttemptConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> subscriptionBillingAttempts(
      Integer first, String after, Integer last, String before, Boolean reverse,
      SubscriptionBillingAttemptsSortKeys sortKey, String query) {
    SubscriptionBillingAttemptConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingAttemptConnectionProjection<>(this, getRoot());    
    getFields().put("subscriptionBillingAttempts", projection);
    getInputArguments().computeIfAbsent("subscriptionBillingAttempts", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("subscriptionBillingAttempts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("subscriptionBillingAttempts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("subscriptionBillingAttempts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("subscriptionBillingAttempts").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("subscriptionBillingAttempts").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("subscriptionBillingAttempts").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("subscriptionBillingAttempts").add(queryArg);
    return projection;
  }

  public SubscriptionBillingCycleProjection<QueryRootProjection<PARENT, ROOT>, ROOT> subscriptionBillingCycle(
      ) {
     SubscriptionBillingCycleProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingCycleProjection<>(this, getRoot());
     getFields().put("subscriptionBillingCycle", projection);
     return projection;
  }

  public SubscriptionBillingCycleProjection<QueryRootProjection<PARENT, ROOT>, ROOT> subscriptionBillingCycle(
      SubscriptionBillingCycleInput billingCycleInput) {
    SubscriptionBillingCycleProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingCycleProjection<>(this, getRoot());    
    getFields().put("subscriptionBillingCycle", projection);
    getInputArguments().computeIfAbsent("subscriptionBillingCycle", k -> new ArrayList<>());                      
    InputArgument billingCycleInputArg = new InputArgument("billingCycleInput", billingCycleInput);
    getInputArguments().get("subscriptionBillingCycle").add(billingCycleInputArg);
    return projection;
  }

  public SubscriptionBillingCycleConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> subscriptionBillingCycles(
      ) {
     SubscriptionBillingCycleConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingCycleConnectionProjection<>(this, getRoot());
     getFields().put("subscriptionBillingCycles", projection);
     return projection;
  }

  public SubscriptionBillingCycleConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> subscriptionBillingCycles(
      String contractId, SubscriptionBillingCyclesDateRangeSelector billingCyclesDateRangeSelector,
      SubscriptionBillingCyclesIndexRangeSelector billingCyclesIndexRangeSelector, Integer first,
      String after, Integer last, String before, Boolean reverse,
      SubscriptionBillingCyclesSortKeys sortKey) {
    SubscriptionBillingCycleConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingCycleConnectionProjection<>(this, getRoot());    
    getFields().put("subscriptionBillingCycles", projection);
    getInputArguments().computeIfAbsent("subscriptionBillingCycles", k -> new ArrayList<>());                      
    InputArgument contractIdArg = new InputArgument("contractId", contractId);
    getInputArguments().get("subscriptionBillingCycles").add(contractIdArg);
    InputArgument billingCyclesDateRangeSelectorArg = new InputArgument("billingCyclesDateRangeSelector", billingCyclesDateRangeSelector);
    getInputArguments().get("subscriptionBillingCycles").add(billingCyclesDateRangeSelectorArg);
    InputArgument billingCyclesIndexRangeSelectorArg = new InputArgument("billingCyclesIndexRangeSelector", billingCyclesIndexRangeSelector);
    getInputArguments().get("subscriptionBillingCycles").add(billingCyclesIndexRangeSelectorArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("subscriptionBillingCycles").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("subscriptionBillingCycles").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("subscriptionBillingCycles").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("subscriptionBillingCycles").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("subscriptionBillingCycles").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("subscriptionBillingCycles").add(sortKeyArg);
    return projection;
  }

  public SubscriptionContractProjection<QueryRootProjection<PARENT, ROOT>, ROOT> subscriptionContract(
      ) {
     SubscriptionContractProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractProjection<>(this, getRoot());
     getFields().put("subscriptionContract", projection);
     return projection;
  }

  public SubscriptionContractProjection<QueryRootProjection<PARENT, ROOT>, ROOT> subscriptionContract(
      String id) {
    SubscriptionContractProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractProjection<>(this, getRoot());    
    getFields().put("subscriptionContract", projection);
    getInputArguments().computeIfAbsent("subscriptionContract", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("subscriptionContract").add(idArg);
    return projection;
  }

  public SubscriptionContractConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> subscriptionContracts(
      ) {
     SubscriptionContractConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractConnectionProjection<>(this, getRoot());
     getFields().put("subscriptionContracts", projection);
     return projection;
  }

  public SubscriptionContractConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> subscriptionContracts(
      Integer first, String after, Integer last, String before, Boolean reverse, String query) {
    SubscriptionContractConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractConnectionProjection<>(this, getRoot());    
    getFields().put("subscriptionContracts", projection);
    getInputArguments().computeIfAbsent("subscriptionContracts", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("subscriptionContracts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("subscriptionContracts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("subscriptionContracts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("subscriptionContracts").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("subscriptionContracts").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("subscriptionContracts").add(queryArg);
    return projection;
  }

  public SubscriptionDraftProjection<QueryRootProjection<PARENT, ROOT>, ROOT> subscriptionDraft() {
     SubscriptionDraftProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDraftProjection<>(this, getRoot());
     getFields().put("subscriptionDraft", projection);
     return projection;
  }

  public SubscriptionDraftProjection<QueryRootProjection<PARENT, ROOT>, ROOT> subscriptionDraft(
      String id) {
    SubscriptionDraftProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDraftProjection<>(this, getRoot());    
    getFields().put("subscriptionDraft", projection);
    getInputArguments().computeIfAbsent("subscriptionDraft", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("subscriptionDraft").add(idArg);
    return projection;
  }

  public TenderTransactionConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> tenderTransactions(
      ) {
     TenderTransactionConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new TenderTransactionConnectionProjection<>(this, getRoot());
     getFields().put("tenderTransactions", projection);
     return projection;
  }

  public TenderTransactionConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> tenderTransactions(
      Integer first, String after, Integer last, String before, Boolean reverse, String query) {
    TenderTransactionConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new TenderTransactionConnectionProjection<>(this, getRoot());    
    getFields().put("tenderTransactions", projection);
    getInputArguments().computeIfAbsent("tenderTransactions", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("tenderTransactions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("tenderTransactions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("tenderTransactions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("tenderTransactions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("tenderTransactions").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("tenderTransactions").add(queryArg);
    return projection;
  }

  public TranslatableResourceProjection<QueryRootProjection<PARENT, ROOT>, ROOT> translatableResource(
      ) {
     TranslatableResourceProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new TranslatableResourceProjection<>(this, getRoot());
     getFields().put("translatableResource", projection);
     return projection;
  }

  public TranslatableResourceProjection<QueryRootProjection<PARENT, ROOT>, ROOT> translatableResource(
      String resourceId) {
    TranslatableResourceProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new TranslatableResourceProjection<>(this, getRoot());    
    getFields().put("translatableResource", projection);
    getInputArguments().computeIfAbsent("translatableResource", k -> new ArrayList<>());                      
    InputArgument resourceIdArg = new InputArgument("resourceId", resourceId);
    getInputArguments().get("translatableResource").add(resourceIdArg);
    return projection;
  }

  public TranslatableResourceConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> translatableResources(
      ) {
     TranslatableResourceConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new TranslatableResourceConnectionProjection<>(this, getRoot());
     getFields().put("translatableResources", projection);
     return projection;
  }

  public TranslatableResourceConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> translatableResources(
      TranslatableResourceType resourceType, Integer first, String after, Integer last,
      String before, Boolean reverse) {
    TranslatableResourceConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new TranslatableResourceConnectionProjection<>(this, getRoot());    
    getFields().put("translatableResources", projection);
    getInputArguments().computeIfAbsent("translatableResources", k -> new ArrayList<>());                      
    InputArgument resourceTypeArg = new InputArgument("resourceType", resourceType);
    getInputArguments().get("translatableResources").add(resourceTypeArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("translatableResources").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("translatableResources").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("translatableResources").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("translatableResources").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("translatableResources").add(reverseArg);
    return projection;
  }

  public TranslatableResourceConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> translatableResourcesByIds(
      ) {
     TranslatableResourceConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new TranslatableResourceConnectionProjection<>(this, getRoot());
     getFields().put("translatableResourcesByIds", projection);
     return projection;
  }

  public TranslatableResourceConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> translatableResourcesByIds(
      List<String> resourceIds, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    TranslatableResourceConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new TranslatableResourceConnectionProjection<>(this, getRoot());    
    getFields().put("translatableResourcesByIds", projection);
    getInputArguments().computeIfAbsent("translatableResourcesByIds", k -> new ArrayList<>());                      
    InputArgument resourceIdsArg = new InputArgument("resourceIds", resourceIds);
    getInputArguments().get("translatableResourcesByIds").add(resourceIdsArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("translatableResourcesByIds").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("translatableResourcesByIds").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("translatableResourcesByIds").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("translatableResourcesByIds").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("translatableResourcesByIds").add(reverseArg);
    return projection;
  }

  public UrlRedirectProjection<QueryRootProjection<PARENT, ROOT>, ROOT> urlRedirect() {
     UrlRedirectProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new UrlRedirectProjection<>(this, getRoot());
     getFields().put("urlRedirect", projection);
     return projection;
  }

  public UrlRedirectProjection<QueryRootProjection<PARENT, ROOT>, ROOT> urlRedirect(String id) {
    UrlRedirectProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new UrlRedirectProjection<>(this, getRoot());    
    getFields().put("urlRedirect", projection);
    getInputArguments().computeIfAbsent("urlRedirect", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("urlRedirect").add(idArg);
    return projection;
  }

  public UrlRedirectImportProjection<QueryRootProjection<PARENT, ROOT>, ROOT> urlRedirectImport() {
     UrlRedirectImportProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new UrlRedirectImportProjection<>(this, getRoot());
     getFields().put("urlRedirectImport", projection);
     return projection;
  }

  public UrlRedirectImportProjection<QueryRootProjection<PARENT, ROOT>, ROOT> urlRedirectImport(
      String id) {
    UrlRedirectImportProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new UrlRedirectImportProjection<>(this, getRoot());    
    getFields().put("urlRedirectImport", projection);
    getInputArguments().computeIfAbsent("urlRedirectImport", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("urlRedirectImport").add(idArg);
    return projection;
  }

  public SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> urlRedirectSavedSearches(
      ) {
     SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());
     getFields().put("urlRedirectSavedSearches", projection);
     return projection;
  }

  public SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> urlRedirectSavedSearches(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SavedSearchConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());    
    getFields().put("urlRedirectSavedSearches", projection);
    getInputArguments().computeIfAbsent("urlRedirectSavedSearches", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("urlRedirectSavedSearches").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("urlRedirectSavedSearches").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("urlRedirectSavedSearches").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("urlRedirectSavedSearches").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("urlRedirectSavedSearches").add(reverseArg);
    return projection;
  }

  public UrlRedirectConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> urlRedirects() {
     UrlRedirectConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new UrlRedirectConnectionProjection<>(this, getRoot());
     getFields().put("urlRedirects", projection);
     return projection;
  }

  public UrlRedirectConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> urlRedirects(
      Integer first, String after, Integer last, String before, Boolean reverse,
      UrlRedirectSortKeys sortKey, String query, String savedSearchId) {
    UrlRedirectConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new UrlRedirectConnectionProjection<>(this, getRoot());    
    getFields().put("urlRedirects", projection);
    getInputArguments().computeIfAbsent("urlRedirects", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("urlRedirects").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("urlRedirects").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("urlRedirects").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("urlRedirects").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("urlRedirects").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("urlRedirects").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("urlRedirects").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("urlRedirects").add(savedSearchIdArg);
    return projection;
  }

  public ValidationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> validation() {
     ValidationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ValidationProjection<>(this, getRoot());
     getFields().put("validation", projection);
     return projection;
  }

  public ValidationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> validation(String id) {
    ValidationProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ValidationProjection<>(this, getRoot());    
    getFields().put("validation", projection);
    getInputArguments().computeIfAbsent("validation", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("validation").add(idArg);
    return projection;
  }

  public ValidationConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> validations() {
     ValidationConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ValidationConnectionProjection<>(this, getRoot());
     getFields().put("validations", projection);
     return projection;
  }

  public ValidationConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> validations(
      Integer first, String after, Integer last, String before, Boolean reverse,
      ValidationSortKeys sortKey) {
    ValidationConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new ValidationConnectionProjection<>(this, getRoot());    
    getFields().put("validations", projection);
    getInputArguments().computeIfAbsent("validations", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("validations").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("validations").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("validations").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("validations").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("validations").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("validations").add(sortKeyArg);
    return projection;
  }

  public WebPixelProjection<QueryRootProjection<PARENT, ROOT>, ROOT> webPixel() {
     WebPixelProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new WebPixelProjection<>(this, getRoot());
     getFields().put("webPixel", projection);
     return projection;
  }

  public WebPixelProjection<QueryRootProjection<PARENT, ROOT>, ROOT> webPixel(String id) {
    WebPixelProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new WebPixelProjection<>(this, getRoot());    
    getFields().put("webPixel", projection);
    getInputArguments().computeIfAbsent("webPixel", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("webPixel").add(idArg);
    return projection;
  }

  public WebhookSubscriptionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> webhookSubscription(
      ) {
     WebhookSubscriptionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new WebhookSubscriptionProjection<>(this, getRoot());
     getFields().put("webhookSubscription", projection);
     return projection;
  }

  public WebhookSubscriptionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> webhookSubscription(
      String id) {
    WebhookSubscriptionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new WebhookSubscriptionProjection<>(this, getRoot());    
    getFields().put("webhookSubscription", projection);
    getInputArguments().computeIfAbsent("webhookSubscription", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("webhookSubscription").add(idArg);
    return projection;
  }

  public WebhookSubscriptionConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> webhookSubscriptions(
      ) {
     WebhookSubscriptionConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new WebhookSubscriptionConnectionProjection<>(this, getRoot());
     getFields().put("webhookSubscriptions", projection);
     return projection;
  }

  public WebhookSubscriptionConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> webhookSubscriptions(
      Integer first, String after, Integer last, String before, Boolean reverse,
      WebhookSubscriptionSortKeys sortKey, String query, String callbackUrl,
      WebhookSubscriptionFormat format, List<WebhookSubscriptionTopic> topics) {
    WebhookSubscriptionConnectionProjection<QueryRootProjection<PARENT, ROOT>, ROOT> projection = new WebhookSubscriptionConnectionProjection<>(this, getRoot());    
    getFields().put("webhookSubscriptions", projection);
    getInputArguments().computeIfAbsent("webhookSubscriptions", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("webhookSubscriptions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("webhookSubscriptions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("webhookSubscriptions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("webhookSubscriptions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("webhookSubscriptions").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("webhookSubscriptions").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("webhookSubscriptions").add(queryArg);
    InputArgument callbackUrlArg = new InputArgument("callbackUrl", callbackUrl);
    getInputArguments().get("webhookSubscriptions").add(callbackUrlArg);
    InputArgument formatArg = new InputArgument("format", format);
    getInputArguments().get("webhookSubscriptions").add(formatArg);
    InputArgument topicsArg = new InputArgument("topics", topics);
    getInputArguments().get("webhookSubscriptions").add(topicsArg);
    return projection;
  }

  public QueryRootProjection<PARENT, ROOT> companyCount() {
    getFields().put("companyCount", null);
    return this;
  }

  public QueryRootProjection<PARENT, ROOT> discountCodeCount() {
    getFields().put("discountCodeCount", null);
    return this;
  }

  public QueryRootProjection discountCodeCount(String query) {
    getFields().put("discountCodeCount", null);
    getInputArguments().computeIfAbsent("discountCodeCount", k -> new ArrayList<>());
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("discountCodeCount").add(queryArg);
    return this;
  }

  public QueryRootProjection<PARENT, ROOT> giftCardsCount() {
    getFields().put("giftCardsCount", null);
    return this;
  }

  public QueryRootProjection giftCardsCount(Boolean enabled) {
    getFields().put("giftCardsCount", null);
    getInputArguments().computeIfAbsent("giftCardsCount", k -> new ArrayList<>());
    InputArgument enabledArg = new InputArgument("enabled", enabled);
    getInputArguments().get("giftCardsCount").add(enabledArg);
    return this;
  }

  public QueryRootProjection<PARENT, ROOT> segmentCount() {
    getFields().put("segmentCount", null);
    return this;
  }
}
