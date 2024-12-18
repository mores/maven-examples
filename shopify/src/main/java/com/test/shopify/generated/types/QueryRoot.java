package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The schema's entry-point for queries. This acts as the public, top-level API from which all queries must start.
 */
public class QueryRoot {
  /**
   * Returns an abandonment by ID.
   */
  private Abandonment abandonment;

  /**
   * Returns an Abandonment by the Abandoned Checkout ID.
   */
  private Abandonment abandonmentByAbandonedCheckoutId;

  /**
   * Lookup an App by ID or return the currently authenticated App.
   */
  private App app;

  /**
   * Fetches app by handle.
   * Returns null if the app doesn't exist.
   */
  private App appByHandle;

  /**
   * Fetches an app by its client ID.
   * Returns null if the app doesn't exist.
   */
  private App appByKey;

  /**
   * An app discount type.
   */
  private AppDiscountType appDiscountType;

  /**
   * A list of app discount types installed by apps.
   */
  private List<AppDiscountType> appDiscountTypes;

  /**
   * Lookup an AppInstallation by ID or return the AppInstallation for the currently authenticated App.
   */
  private AppInstallation appInstallation;

  /**
   * A list of app installations. To use this query, you need to contact [Shopify
   * Support](https://partners.shopify.com/current/support/) to grant your custom
   * app the `read_apps` access scope. Public apps can't be granted this access scope.
   */
  private AppInstallationConnection appInstallations;

  /**
   * Returns an automatic discount resource by ID.
   */
  private DiscountAutomatic automaticDiscount;

  /**
   * Returns an automatic discount resource by ID.
   */
  private DiscountAutomaticNode automaticDiscountNode;

  /**
   * List of automatic discounts.
   */
  private DiscountAutomaticNodeConnection automaticDiscountNodes;

  /**
   * List of the shop's automatic discount saved searches.
   */
  private SavedSearchConnection automaticDiscountSavedSearches;

  /**
   * List of automatic discounts.
   */
  private DiscountAutomaticConnection automaticDiscounts;

  /**
   * Returns a list of activated carrier services and associated shop locations that support them.
   */
  private List<DeliveryCarrierServiceAndLocations> availableCarrierServices;

  /**
   * A list of available locales.
   */
  private List<Locale> availableLocales;

  /**
   * Returns a `DeliveryCarrierService` object by ID.
   */
  private DeliveryCarrierService carrierService;

  /**
   * List of Cart transform objects owned by the current API client.
   */
  private CartTransformConnection cartTransforms;

  /**
   * Returns a Catalog resource by ID.
   */
  private Catalog catalog;

  /**
   * Returns the most recent catalog operations for the shop.
   */
  private List<ResourceOperation> catalogOperations;

  /**
   * The catalogs belonging to the shop.
   */
  private CatalogConnection catalogs;

  /**
   * Lookup a channel by ID.
   */
  private Channel channel;

  /**
   * List of the active sales channels.
   */
  private ChannelConnection channels;

  /**
   * Returns the visual customizations for checkout for a given checkout profile.
   *   
   * To learn more about updating checkout branding settings, refer to the
   * [checkoutBrandingUpsert](https://shopify.dev/api/admin-graphql/unstable/mutations/checkoutBrandingUpsert)
   * mutation and the checkout branding [tutorial](https://shopify.dev/docs/apps/checkout/styling).
   */
  private CheckoutBranding checkoutBranding;

  /**
   * A checkout profile on a shop.
   */
  private CheckoutProfile checkoutProfile;

  /**
   * List of checkout profiles on a shop.
   */
  private CheckoutProfileConnection checkoutProfiles;

  /**
   * Returns a [code discount](https://help.shopify.com/manual/discounts/discount-types#discount-codes) resource by ID.
   */
  private DiscountCodeNode codeDiscountNode;

  /**
   * Returns a code discount identified by its discount code.
   */
  private DiscountCodeNode codeDiscountNodeByCode;

  /**
   * Returns a list of [code-based discounts](https://help.shopify.com/manual/discounts/discount-types#discount-codes).
   */
  private DiscountCodeNodeConnection codeDiscountNodes;

  /**
   * List of the shop's code discount saved searches.
   */
  private SavedSearchConnection codeDiscountSavedSearches;

  /**
   * Returns a Collection resource by ID.
   */
  private Collection collection;

  /**
   * Return a collection by its handle.
   */
  private Collection collectionByHandle;

  /**
   * Lists all rules that can be used to create smart collections.
   */
  private List<CollectionRuleConditions> collectionRulesConditions;

  /**
   * Returns a list of the shop's collection saved searches.
   */
  private SavedSearchConnection collectionSavedSearches;

  /**
   * Returns a list of collections.
   */
  private CollectionConnection collections;

  /**
   * Returns the list of companies in the shop.
   */
  private CompanyConnection companies;

  /**
   * Returns a `Company` object by ID.
   */
  private Company company;

  /**
   * Returns a `CompanyContact` object by ID.
   */
  private CompanyContact companyContact;

  /**
   * Returns a `CompanyContactRole` object by ID.
   */
  private CompanyContactRole companyContactRole;

  /**
   * The number of companies for a shop.
   */
  private int companyCount;

  /**
   * Returns a `CompanyLocation` object by ID.
   */
  private CompanyLocation companyLocation;

  /**
   * Returns the list of company locations in the shop.
   */
  private CompanyLocationConnection companyLocations;

  /**
   * Return the AppInstallation for the currently authenticated App.
   */
  private AppInstallation currentAppInstallation;

  /**
   * Returns the current app's most recent BulkOperation. Apps can run one bulk
   * query and one bulk mutation operation at a time, by shop.
   */
  private BulkOperation currentBulkOperation;

  /**
   * Returns a Customer resource by ID.
   */
  private Customer customer;

  /**
   * Returns the status of a customer merge request job.
   */
  private CustomerMergeRequest customerMergeJobStatus;

  /**
   * Returns a preview of a customer merge request.
   */
  private CustomerMergePreview customerMergePreview;

  /**
   * Returns a CustomerPaymentMethod resource by its ID.
   */
  private CustomerPaymentMethod customerPaymentMethod;

  /**
   * The list of members, such as customers, that's associated with an individual segment.
   * The maximum page size is 1000.
   */
  private CustomerSegmentMemberConnection customerSegmentMembers;

  /**
   * Returns a segment members query resource by ID.
   */
  private CustomerSegmentMembersQuery customerSegmentMembersQuery;

  /**
   * Whether a member, which is a customer, belongs to a segment.
   */
  private SegmentMembershipResponse customerSegmentMembership;

  /**
   * Returns a list of customers.
   */
  private CustomerConnection customers;

  /**
   * The paginated list of deletion events.
   */
  private DeletionEventConnection deletionEvents;

  /**
   * The delivery customization.
   */
  private DeliveryCustomization deliveryCustomization;

  /**
   * The delivery customizations.
   */
  private DeliveryCustomizationConnection deliveryCustomizations;

  /**
   * Returns a Delivery Profile resource by ID.
   */
  private DeliveryProfile deliveryProfile;

  /**
   * Returns a list of saved delivery profiles.
   */
  private DeliveryProfileConnection deliveryProfiles;

  /**
   * Returns the shop-wide shipping settings.
   */
  private DeliverySetting deliverySettings;

  /**
   * The total number of discount codes for the shop.
   */
  private int discountCodeCount;

  /**
   * Returns a discount resource by ID.
   */
  private DiscountNode discountNode;

  /**
   * Returns a list of discounts.
   */
  private DiscountNodeConnection discountNodes;

  /**
   * Returns a bulk code creation resource by ID.
   */
  private DiscountRedeemCodeBulkCreation discountRedeemCodeBulkCreation;

  /**
   * List of the shop's redeemed discount code saved searches.
   */
  private SavedSearchConnection discountRedeemCodeSavedSearches;

  /**
   * Returns dispute details based on ID.
   */
  private ShopifyPaymentsDispute dispute;

  /**
   * Returns dispute evidence details based on ID.
   */
  private ShopifyPaymentsDisputeEvidence disputeEvidence;

  /**
   * Lookup a Domain by ID.
   */
  private Domain domain;

  /**
   * Returns a DraftOrder resource by ID.
   */
  private DraftOrder draftOrder;

  /**
   * List of the shop's draft order saved searches.
   */
  private SavedSearchConnection draftOrderSavedSearches;

  /**
   * Returns a DraftOrderTag resource by ID.
   */
  private DraftOrderTag draftOrderTag;

  /**
   * List of saved draft orders.
   */
  private DraftOrderConnection draftOrders;

  /**
   * A list of the shop's file saved searches.
   */
  private SavedSearchConnection fileSavedSearches;

  /**
   * Returns a paginated list of files that have been uploaded to Shopify.
   */
  private FileConnection files;

  /**
   * Returns a Fulfillment resource by ID.
   */
  private Fulfillment fulfillment;

  /**
   * The fulfillment constraint rules that belong to a shop.
   */
  private List<FulfillmentConstraintRule> fulfillmentConstraintRules;

  /**
   * Returns a Fulfillment order resource by ID.
   */
  private FulfillmentOrder fulfillmentOrder;

  /**
   * The paginated list of all fulfillment orders.
   * The returned fulfillment orders are filtered according to the
   * [fulfillment order access scopes](https://shopify.dev/api/admin-graphql/latest/objects/fulfillmentorder#api-access-scopes)
   * granted to the app.
   *   
   * Use this query to retrieve fulfillment orders assigned to merchant-managed locations,
   * third-party fulfillment service locations, or all kinds of locations together.
   *   
   * For fetching only the fulfillment orders assigned to the app's locations, use the
   * [assignedFulfillmentOrders](https://shopify.dev/api/admin-graphql/2024-07/objects/queryroot#connection-assignedfulfillmentorders)
   * connection.
   */
  private FulfillmentOrderConnection fulfillmentOrders;

  /**
   * Returns a FulfillmentService resource by ID.
   */
  private FulfillmentService fulfillmentService;

  /**
   * Returns a gift card resource by ID.
   */
  private GiftCard giftCard;

  /**
   * Returns a list of gift cards.
   */
  private GiftCardConnection giftCards;

  /**
   * The total number of gift cards issued for the shop.
   */
  private String giftCardsCount;

  /**
   * Returns an
   * [InventoryItem](https://shopify.dev/docs/api/admin-graphql/latest/objects/InventoryItem)
   * object by ID.
   */
  private InventoryItem inventoryItem;

  /**
   * Returns a list of inventory items.
   */
  private InventoryItemConnection inventoryItems;

  /**
   * Returns an
   * [InventoryLevel](https://shopify.dev/docs/api/admin-graphql/latest/objects/InventoryLevel)
   * object by ID.
   */
  private InventoryLevel inventoryLevel;

  /**
   * General inventory properties for the shop.
   */
  private InventoryProperties inventoryProperties;

  /**
   * Returns a Job resource by ID. Used to check the status of internal jobs and any applicable changes.
   */
  private Job job;

  /**
   * Returns an inventory Location resource by ID.
   */
  private Location location;

  /**
   * Returns a list of active inventory locations.
   */
  private LocationConnection locations;

  /**
   * Returns a list of all origin locations available for a delivery profile.
   */
  private List<Location> locationsAvailableForDeliveryProfiles;

  /**
   * Returns a list of all origin locations available for a delivery profile.
   */
  private LocationConnection locationsAvailableForDeliveryProfilesConnection;

  /**
   * Returns a list of fulfillment orders that are on hold.
   */
  private FulfillmentOrderConnection manualHoldsFulfillmentOrders;

  /**
   * Returns a market resource by ID.
   */
  private Market market;

  /**
   * Returns the applicable market for a customer based on where they are in the world.
   */
  private Market marketByGeography;

  /**
   * A resource that can have localized values for different markets.
   */
  private MarketLocalizableResource marketLocalizableResource;

  /**
   * Resources that can have localized values for different markets.
   */
  private MarketLocalizableResourceConnection marketLocalizableResources;

  /**
   * Resources that can have localized values for different markets.
   */
  private MarketLocalizableResourceConnection marketLocalizableResourcesByIds;

  /**
   * A list of marketing activities associated with the marketing app.
   */
  private MarketingActivityConnection marketingActivities;

  /**
   * Returns a MarketingActivity resource by ID.
   */
  private MarketingActivity marketingActivity;

  /**
   * Returns a MarketingEvent resource by ID.
   */
  private MarketingEvent marketingEvent;

  /**
   * A list of marketing events associated with the marketing app.
   */
  private MarketingEventConnection marketingEvents;

  /**
   * The markets configured for the shop.
   */
  private MarketConnection markets;

  /**
   * Returns a metafield definition by identifier.
   */
  private MetafieldDefinition metafieldDefinition;

  /**
   * Each metafield definition has a type, which defines the type of information that it can store.
   * This type is enforced across every instance of the resource that owns the metafield definition.
   *   
   * Refer to the [list of supported metafield types](https://shopify.dev/apps/metafields/types).
   */
  private List<MetafieldDefinitionType> metafieldDefinitionTypes;

  /**
   * Returns a list of metafield definitions.
   */
  private MetafieldDefinitionConnection metafieldDefinitions;

  /**
   * List of the `MetafieldStorefrontVisibility` records.
   */
  private MetafieldStorefrontVisibilityConnection metafieldStorefrontVisibilities;

  /**
   * Returns a `MetafieldStorefrontVisibility` record by ID. A `MetafieldStorefrontVisibility` record lists the
   * metafields to make visible in the Storefront API.
   */
  private MetafieldStorefrontVisibility metafieldStorefrontVisibility;

  /**
   * Retrieves a metaobject by ID.
   */
  private Metaobject metaobject;

  /**
   * Retrieves a metaobject by handle.
   */
  private Metaobject metaobjectByHandle;

  /**
   * Retrieves a metaobject definition by ID.
   */
  private MetaobjectDefinition metaobjectDefinition;

  /**
   * Finds a metaobject definition by type.
   */
  private MetaobjectDefinition metaobjectDefinitionByType;

  /**
   * All metaobject definitions.
   */
  private MetaobjectDefinitionConnection metaobjectDefinitions;

  /**
   * All metaobjects for the shop.
   */
  private MetaobjectConnection metaobjects;

  /**
   * Returns a specific node (any object that implements the
   * [Node](https://shopify.dev/api/admin-graphql/latest/interfaces/Node)
   * interface) by ID, in accordance with the
   * [Relay specification](https://relay.dev/docs/guides/graphql-server-specification/#object-identification).
   * This field is commonly used for refetching an object.
   */
  private Node node;

  /**
   * Returns the list of nodes (any objects that implement the
   * [Node](https://shopify.dev/api/admin-graphql/latest/interfaces/Node)
   * interface) with the given IDs, in accordance with the
   * [Relay specification](https://relay.dev/docs/guides/graphql-server-specification/#object-identification).
   */
  private List<Node> nodes;

  /**
   * Returns an Order resource by ID.
   */
  private Order order;

  /**
   * Returns a payment status by payment reference ID. Used to check the status of a deferred payment.
   */
  private OrderPaymentStatus orderPaymentStatus;

  /**
   * List of the shop's order saved searches.
   */
  private SavedSearchConnection orderSavedSearches;

  /**
   * Returns a list of orders placed in the store.
   */
  private OrderConnection orders;

  /**
   * The payment customization.
   */
  private PaymentCustomization paymentCustomization;

  /**
   * The payment customizations.
   */
  private PaymentCustomizationConnection paymentCustomizations;

  /**
   * The list of payment terms templates eligible for all shops and users.
   */
  private List<PaymentTermsTemplate> paymentTermsTemplates;

  /**
   * Returns a price list resource by ID.
   */
  private PriceList priceList;

  /**
   * All price lists for a shop.
   */
  private PriceListConnection priceLists;

  /**
   * Returns a code price rule resource by ID.
   */
  private PriceRule priceRule;

  /**
   * List of the shop's price rule saved searches.
   */
  private SavedSearchConnection priceRuleSavedSearches;

  /**
   * Returns a list of price rule resources that have at least one associated discount code.
   */
  private PriceRuleConnection priceRules;

  /**
   * The primary market of the shop.
   */
  private Market primaryMarket;

  /**
   * Returns a private metafield by ID.
   * Private metafields are accessible only by the application that created them.
   */
  private PrivateMetafield privateMetafield;

  /**
   * Returns a list of private metafields associated to a resource.
   */
  private PrivateMetafieldConnection privateMetafields;

  /**
   * Returns a Product resource by ID.
   */
  private Product product;

  /**
   * Return a product by its handle.
   */
  private Product productByHandle;

  /**
   * Returns the product duplicate job.
   */
  private ProductDuplicateJob productDuplicateJob;

  /**
   * Returns a ProductFeed resource by ID.
   */
  private ProductFeed productFeed;

  /**
   * The product feeds for the shop.
   */
  private ProductFeedConnection productFeeds;

  /**
   * Returns the product resource feedback for the currently authenticated app.
   */
  private ProductResourceFeedback productResourceFeedback;

  /**
   * Returns a list of the shop's product saved searches.
   */
  private SavedSearchConnection productSavedSearches;

  /**
   * Returns a ProductVariant resource by ID.
   */
  private ProductVariant productVariant;

  /**
   * Returns a list of product variants.
   */
  private ProductVariantConnection productVariants;

  /**
   * Returns a list of products.
   */
  private ProductConnection products;

  /**
   * The list of publicly-accessible Admin API versions, including supported
   * versions, the release candidate, and unstable versions.
   */
  private List<ApiVersion> publicApiVersions;

  /**
   * Lookup a publication by ID.
   */
  private Publication publication;

  /**
   * List of publications.
   */
  private PublicationConnection publications;

  /**
   * Returns a Refund resource by ID.
   */
  private Refund refund;

  /**
   * Returns a Return resource by ID.
   */
  private Return _return;

  /**
   * Lookup a returnable fulfillment by ID.
   */
  private ReturnableFulfillment returnableFulfillment;

  /**
   * List of returnable fulfillments.
   */
  private ReturnableFulfillmentConnection returnableFulfillments;

  /**
   * Lookup a reverse delivery by ID.
   */
  private ReverseDelivery reverseDelivery;

  /**
   * Lookup a reverse fulfillment order by ID.
   */
  private ReverseFulfillmentOrder reverseFulfillmentOrder;

  /**
   * <div class="note"><h4>Theme app extensions</h4>
   *   <p>Your app might not pass App Store review if it uses script tags instead of
   * theme app extensions. All new apps, and apps that integrate with Online Store
   * 2.0 themes, should use theme app extensions, such as app blocks or app embed
   * blocks. Script tags are an alternative you can use with only vintage themes.
   * <a href="/apps/online-store#what-integration-method-should-i-use"
   * target="_blank">Learn more</a>.</p></div>
   *   
   * <div class="note"><h4>Script tag deprecation</h4>
   *   <p>Script tags will be sunset for the <b>Order status</b> page on August 28, 2025. <a href="https://www.shopify.com/plus/upgrading-to-checkout-extensibility">Upgrade
   * to Checkout Extensibility</a> before this date. <a
   * href="/docs/api/liquid/objects#script">Shopify Scripts</a> will continue to
   * work alongside Checkout Extensibility until August 28, 2025.</p></div>
   *   
   *   
   * Lookup a script tag resource by ID.
   */
  private ScriptTag scriptTag;

  /**
   * <div class="note"><h4>Theme app extensions</h4>
   *   <p>Your app might not pass App Store review if it uses script tags instead of
   * theme app extensions. All new apps, and apps that integrate with Online Store
   * 2.0 themes, should use theme app extensions, such as app blocks or app embed
   * blocks. Script tags are an alternative you can use with only vintage themes.
   * <a href="/apps/online-store#what-integration-method-should-i-use"
   * target="_blank">Learn more</a>.</p></div>
   *   
   * <div class="note"><h4>Script tag deprecation</h4>
   *   <p>Script tags will be sunset for the <b>Order status</b> page on August 28, 2025. <a href="https://www.shopify.com/plus/upgrading-to-checkout-extensibility">Upgrade
   * to Checkout Extensibility</a> before this date. <a
   * href="/docs/api/liquid/objects#script">Shopify Scripts</a> will continue to
   * work alongside Checkout Extensibility until August 28, 2025.</p></div>
   *   
   *   
   * A list of script tags.
   */
  private ScriptTagConnection scriptTags;

  /**
   * The Customer Segment.
   */
  private Segment segment;

  /**
   * The number of segments for a shop.
   */
  private int segmentCount;

  /**
   * A list of filter suggestions associated with a segment. A segment is a group
   * of members (commonly customers) that meet specific criteria.
   */
  private SegmentFilterConnection segmentFilterSuggestions;

  /**
   * A list of filters.
   */
  private SegmentFilterConnection segmentFilters;

  /**
   * A list of a shop's segment migrations.
   */
  private SegmentMigrationConnection segmentMigrations;

  /**
   * The list of suggested values corresponding to a particular filter for a
   * segment. A segment is a group of members, such as customers, that meet
   * specific criteria.
   */
  private SegmentValueConnection segmentValueSuggestions;

  /**
   * A list of a shop's segments.
   */
  private SegmentConnection segments;

  /**
   * Returns a Selling Plan Group resource by ID.
   */
  private SellingPlanGroup sellingPlanGroup;

  /**
   * List Selling Plan Groups.
   */
  private SellingPlanGroupConnection sellingPlanGroups;

  /**
   * The server pixel configured by the app.
   */
  private ServerPixel serverPixel;

  /**
   * Returns the Shop resource corresponding to the access token used in the request. The Shop resource contains
   * business and store management settings for the shop.
   */
  private Shop shop;

  /**
   * The shop's billing preferences.
   */
  private ShopBillingPreferences shopBillingPreferences;

  /**
   * A list of locales available on a shop.
   */
  private List<ShopLocale> shopLocales;

  /**
   * The Shopify Function.
   */
  private ShopifyFunction shopifyFunction;

  /**
   * Returns the Shopify Functions for apps installed on the shop.
   */
  private ShopifyFunctionConnection shopifyFunctions;

  /**
   * Shopify Payments account information, including balances and payouts.
   */
  private ShopifyPaymentsAccount shopifyPaymentsAccount;

  /**
   * Returns the results of a ShopifyQL query. Refer to the [ShopifyQL
   * documentation](https://shopify.dev/api/shopifyql) for more information.
   */
  private ShopifyqlResponse shopifyqlQuery;

  /**
   * The StaffMember resource, by ID.
   */
  private StaffMember staffMember;

  /**
   * Standard metafield definitions are intended for specific, common use cases.
   * Their namespace and keys reflect these use cases and are reserved.
   *   
   * Refer to all available [`Standard Metafield Definition Templates`](https://shopify.dev/api/admin-graphql/latest/objects/StandardMetafieldDefinitionTemplate).
   */
  private StandardMetafieldDefinitionTemplateConnection standardMetafieldDefinitionTemplates;

  /**
   * Returns a SubscriptionBillingAttempt by ID.
   */
  private SubscriptionBillingAttempt subscriptionBillingAttempt;

  /**
   * Returns subscription billing attempts on a store.
   */
  private SubscriptionBillingAttemptConnection subscriptionBillingAttempts;

  /**
   * Returns a subscription billing cycle found either by cycle index or date.
   */
  private SubscriptionBillingCycle subscriptionBillingCycle;

  /**
   * Returns subscription billing cycles for a contract ID.
   */
  private SubscriptionBillingCycleConnection subscriptionBillingCycles;

  /**
   * Returns a Subscription Contract resource by ID.
   */
  private SubscriptionContract subscriptionContract;

  /**
   * List Subscription Contracts.
   */
  private SubscriptionContractConnection subscriptionContracts;

  /**
   * Returns a Subscription Draft resource by ID.
   */
  private SubscriptionDraft subscriptionDraft;

  /**
   * Returns a list of TenderTransactions associated with the shop.
   */
  private TenderTransactionConnection tenderTransactions;

  /**
   * A resource that can have localized values for different languages.
   */
  private TranslatableResource translatableResource;

  /**
   * Resources that can have localized values for different languages.
   */
  private TranslatableResourceConnection translatableResources;

  /**
   * Resources that can have localized values for different languages.
   */
  private TranslatableResourceConnection translatableResourcesByIds;

  /**
   * Returns a redirect resource by ID.
   */
  private UrlRedirect urlRedirect;

  /**
   * Returns a redirect import resource by ID.
   */
  private UrlRedirectImport urlRedirectImport;

  /**
   * A list of the shop's URL redirect saved searches.
   */
  private SavedSearchConnection urlRedirectSavedSearches;

  /**
   * A list of redirects for a shop.
   */
  private UrlRedirectConnection urlRedirects;

  /**
   * Validation available on the shop.
   */
  private Validation validation;

  /**
   * Validations available on the shop.
   */
  private ValidationConnection validations;

  /**
   * The web pixel configured by the app.
   */
  private WebPixel webPixel;

  /**
   * Returns a webhook subscription by ID.
   *   
   * Building an app? If you only use app-specific webhooks, you won't need this.
   * App-specific webhook subscriptions specified in your `shopify.app.toml` may be
   * easier. They are automatically kept up to date by Shopify & require less
   * maintenance. Please read [About managing webhook
   * subscriptions](https://shopify.dev/docs/apps/build/webhooks/subscribe).
   */
  private WebhookSubscription webhookSubscription;

  /**
   * Returns a list of webhook subscriptions.
   *   
   * Building an app? If you only use app-specific webhooks, you won't need this.
   * App-specific webhook subscriptions specified in your `shopify.app.toml` may be
   * easier. They are automatically kept up to date by Shopify & require less
   * maintenance. Please read [About managing webhook
   * subscriptions](https://shopify.dev/docs/apps/build/webhooks/subscribe).
   */
  private WebhookSubscriptionConnection webhookSubscriptions;

  public QueryRoot() {
  }

  /**
   * Returns an abandonment by ID.
   */
  public Abandonment getAbandonment() {
    return abandonment;
  }

  public void setAbandonment(Abandonment abandonment) {
    this.abandonment = abandonment;
  }

  /**
   * Returns an Abandonment by the Abandoned Checkout ID.
   */
  public Abandonment getAbandonmentByAbandonedCheckoutId() {
    return abandonmentByAbandonedCheckoutId;
  }

  public void setAbandonmentByAbandonedCheckoutId(Abandonment abandonmentByAbandonedCheckoutId) {
    this.abandonmentByAbandonedCheckoutId = abandonmentByAbandonedCheckoutId;
  }

  /**
   * Lookup an App by ID or return the currently authenticated App.
   */
  public App getApp() {
    return app;
  }

  public void setApp(App app) {
    this.app = app;
  }

  /**
   * Fetches app by handle.
   * Returns null if the app doesn't exist.
   */
  public App getAppByHandle() {
    return appByHandle;
  }

  public void setAppByHandle(App appByHandle) {
    this.appByHandle = appByHandle;
  }

  /**
   * Fetches an app by its client ID.
   * Returns null if the app doesn't exist.
   */
  public App getAppByKey() {
    return appByKey;
  }

  public void setAppByKey(App appByKey) {
    this.appByKey = appByKey;
  }

  /**
   * An app discount type.
   */
  public AppDiscountType getAppDiscountType() {
    return appDiscountType;
  }

  public void setAppDiscountType(AppDiscountType appDiscountType) {
    this.appDiscountType = appDiscountType;
  }

  /**
   * A list of app discount types installed by apps.
   */
  public List<AppDiscountType> getAppDiscountTypes() {
    return appDiscountTypes;
  }

  public void setAppDiscountTypes(List<AppDiscountType> appDiscountTypes) {
    this.appDiscountTypes = appDiscountTypes;
  }

  /**
   * Lookup an AppInstallation by ID or return the AppInstallation for the currently authenticated App.
   */
  public AppInstallation getAppInstallation() {
    return appInstallation;
  }

  public void setAppInstallation(AppInstallation appInstallation) {
    this.appInstallation = appInstallation;
  }

  /**
   * A list of app installations. To use this query, you need to contact [Shopify
   * Support](https://partners.shopify.com/current/support/) to grant your custom
   * app the `read_apps` access scope. Public apps can't be granted this access scope.
   */
  public AppInstallationConnection getAppInstallations() {
    return appInstallations;
  }

  public void setAppInstallations(AppInstallationConnection appInstallations) {
    this.appInstallations = appInstallations;
  }

  /**
   * Returns an automatic discount resource by ID.
   */
  public DiscountAutomatic getAutomaticDiscount() {
    return automaticDiscount;
  }

  public void setAutomaticDiscount(DiscountAutomatic automaticDiscount) {
    this.automaticDiscount = automaticDiscount;
  }

  /**
   * Returns an automatic discount resource by ID.
   */
  public DiscountAutomaticNode getAutomaticDiscountNode() {
    return automaticDiscountNode;
  }

  public void setAutomaticDiscountNode(DiscountAutomaticNode automaticDiscountNode) {
    this.automaticDiscountNode = automaticDiscountNode;
  }

  /**
   * List of automatic discounts.
   */
  public DiscountAutomaticNodeConnection getAutomaticDiscountNodes() {
    return automaticDiscountNodes;
  }

  public void setAutomaticDiscountNodes(DiscountAutomaticNodeConnection automaticDiscountNodes) {
    this.automaticDiscountNodes = automaticDiscountNodes;
  }

  /**
   * List of the shop's automatic discount saved searches.
   */
  public SavedSearchConnection getAutomaticDiscountSavedSearches() {
    return automaticDiscountSavedSearches;
  }

  public void setAutomaticDiscountSavedSearches(
      SavedSearchConnection automaticDiscountSavedSearches) {
    this.automaticDiscountSavedSearches = automaticDiscountSavedSearches;
  }

  /**
   * List of automatic discounts.
   */
  public DiscountAutomaticConnection getAutomaticDiscounts() {
    return automaticDiscounts;
  }

  public void setAutomaticDiscounts(DiscountAutomaticConnection automaticDiscounts) {
    this.automaticDiscounts = automaticDiscounts;
  }

  /**
   * Returns a list of activated carrier services and associated shop locations that support them.
   */
  public List<DeliveryCarrierServiceAndLocations> getAvailableCarrierServices() {
    return availableCarrierServices;
  }

  public void setAvailableCarrierServices(
      List<DeliveryCarrierServiceAndLocations> availableCarrierServices) {
    this.availableCarrierServices = availableCarrierServices;
  }

  /**
   * A list of available locales.
   */
  public List<Locale> getAvailableLocales() {
    return availableLocales;
  }

  public void setAvailableLocales(List<Locale> availableLocales) {
    this.availableLocales = availableLocales;
  }

  /**
   * Returns a `DeliveryCarrierService` object by ID.
   */
  public DeliveryCarrierService getCarrierService() {
    return carrierService;
  }

  public void setCarrierService(DeliveryCarrierService carrierService) {
    this.carrierService = carrierService;
  }

  /**
   * List of Cart transform objects owned by the current API client.
   */
  public CartTransformConnection getCartTransforms() {
    return cartTransforms;
  }

  public void setCartTransforms(CartTransformConnection cartTransforms) {
    this.cartTransforms = cartTransforms;
  }

  /**
   * Returns a Catalog resource by ID.
   */
  public Catalog getCatalog() {
    return catalog;
  }

  public void setCatalog(Catalog catalog) {
    this.catalog = catalog;
  }

  /**
   * Returns the most recent catalog operations for the shop.
   */
  public List<ResourceOperation> getCatalogOperations() {
    return catalogOperations;
  }

  public void setCatalogOperations(List<ResourceOperation> catalogOperations) {
    this.catalogOperations = catalogOperations;
  }

  /**
   * The catalogs belonging to the shop.
   */
  public CatalogConnection getCatalogs() {
    return catalogs;
  }

  public void setCatalogs(CatalogConnection catalogs) {
    this.catalogs = catalogs;
  }

  /**
   * Lookup a channel by ID.
   */
  public Channel getChannel() {
    return channel;
  }

  public void setChannel(Channel channel) {
    this.channel = channel;
  }

  /**
   * List of the active sales channels.
   */
  public ChannelConnection getChannels() {
    return channels;
  }

  public void setChannels(ChannelConnection channels) {
    this.channels = channels;
  }

  /**
   * Returns the visual customizations for checkout for a given checkout profile.
   *   
   * To learn more about updating checkout branding settings, refer to the
   * [checkoutBrandingUpsert](https://shopify.dev/api/admin-graphql/unstable/mutations/checkoutBrandingUpsert)
   * mutation and the checkout branding [tutorial](https://shopify.dev/docs/apps/checkout/styling).
   */
  public CheckoutBranding getCheckoutBranding() {
    return checkoutBranding;
  }

  public void setCheckoutBranding(CheckoutBranding checkoutBranding) {
    this.checkoutBranding = checkoutBranding;
  }

  /**
   * A checkout profile on a shop.
   */
  public CheckoutProfile getCheckoutProfile() {
    return checkoutProfile;
  }

  public void setCheckoutProfile(CheckoutProfile checkoutProfile) {
    this.checkoutProfile = checkoutProfile;
  }

  /**
   * List of checkout profiles on a shop.
   */
  public CheckoutProfileConnection getCheckoutProfiles() {
    return checkoutProfiles;
  }

  public void setCheckoutProfiles(CheckoutProfileConnection checkoutProfiles) {
    this.checkoutProfiles = checkoutProfiles;
  }

  /**
   * Returns a [code discount](https://help.shopify.com/manual/discounts/discount-types#discount-codes) resource by ID.
   */
  public DiscountCodeNode getCodeDiscountNode() {
    return codeDiscountNode;
  }

  public void setCodeDiscountNode(DiscountCodeNode codeDiscountNode) {
    this.codeDiscountNode = codeDiscountNode;
  }

  /**
   * Returns a code discount identified by its discount code.
   */
  public DiscountCodeNode getCodeDiscountNodeByCode() {
    return codeDiscountNodeByCode;
  }

  public void setCodeDiscountNodeByCode(DiscountCodeNode codeDiscountNodeByCode) {
    this.codeDiscountNodeByCode = codeDiscountNodeByCode;
  }

  /**
   * Returns a list of [code-based discounts](https://help.shopify.com/manual/discounts/discount-types#discount-codes).
   */
  public DiscountCodeNodeConnection getCodeDiscountNodes() {
    return codeDiscountNodes;
  }

  public void setCodeDiscountNodes(DiscountCodeNodeConnection codeDiscountNodes) {
    this.codeDiscountNodes = codeDiscountNodes;
  }

  /**
   * List of the shop's code discount saved searches.
   */
  public SavedSearchConnection getCodeDiscountSavedSearches() {
    return codeDiscountSavedSearches;
  }

  public void setCodeDiscountSavedSearches(SavedSearchConnection codeDiscountSavedSearches) {
    this.codeDiscountSavedSearches = codeDiscountSavedSearches;
  }

  /**
   * Returns a Collection resource by ID.
   */
  public Collection getCollection() {
    return collection;
  }

  public void setCollection(Collection collection) {
    this.collection = collection;
  }

  /**
   * Return a collection by its handle.
   */
  public Collection getCollectionByHandle() {
    return collectionByHandle;
  }

  public void setCollectionByHandle(Collection collectionByHandle) {
    this.collectionByHandle = collectionByHandle;
  }

  /**
   * Lists all rules that can be used to create smart collections.
   */
  public List<CollectionRuleConditions> getCollectionRulesConditions() {
    return collectionRulesConditions;
  }

  public void setCollectionRulesConditions(
      List<CollectionRuleConditions> collectionRulesConditions) {
    this.collectionRulesConditions = collectionRulesConditions;
  }

  /**
   * Returns a list of the shop's collection saved searches.
   */
  public SavedSearchConnection getCollectionSavedSearches() {
    return collectionSavedSearches;
  }

  public void setCollectionSavedSearches(SavedSearchConnection collectionSavedSearches) {
    this.collectionSavedSearches = collectionSavedSearches;
  }

  /**
   * Returns a list of collections.
   */
  public CollectionConnection getCollections() {
    return collections;
  }

  public void setCollections(CollectionConnection collections) {
    this.collections = collections;
  }

  /**
   * Returns the list of companies in the shop.
   */
  public CompanyConnection getCompanies() {
    return companies;
  }

  public void setCompanies(CompanyConnection companies) {
    this.companies = companies;
  }

  /**
   * Returns a `Company` object by ID.
   */
  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }

  /**
   * Returns a `CompanyContact` object by ID.
   */
  public CompanyContact getCompanyContact() {
    return companyContact;
  }

  public void setCompanyContact(CompanyContact companyContact) {
    this.companyContact = companyContact;
  }

  /**
   * Returns a `CompanyContactRole` object by ID.
   */
  public CompanyContactRole getCompanyContactRole() {
    return companyContactRole;
  }

  public void setCompanyContactRole(CompanyContactRole companyContactRole) {
    this.companyContactRole = companyContactRole;
  }

  /**
   * The number of companies for a shop.
   */
  public int getCompanyCount() {
    return companyCount;
  }

  public void setCompanyCount(int companyCount) {
    this.companyCount = companyCount;
  }

  /**
   * Returns a `CompanyLocation` object by ID.
   */
  public CompanyLocation getCompanyLocation() {
    return companyLocation;
  }

  public void setCompanyLocation(CompanyLocation companyLocation) {
    this.companyLocation = companyLocation;
  }

  /**
   * Returns the list of company locations in the shop.
   */
  public CompanyLocationConnection getCompanyLocations() {
    return companyLocations;
  }

  public void setCompanyLocations(CompanyLocationConnection companyLocations) {
    this.companyLocations = companyLocations;
  }

  /**
   * Return the AppInstallation for the currently authenticated App.
   */
  public AppInstallation getCurrentAppInstallation() {
    return currentAppInstallation;
  }

  public void setCurrentAppInstallation(AppInstallation currentAppInstallation) {
    this.currentAppInstallation = currentAppInstallation;
  }

  /**
   * Returns the current app's most recent BulkOperation. Apps can run one bulk
   * query and one bulk mutation operation at a time, by shop.
   */
  public BulkOperation getCurrentBulkOperation() {
    return currentBulkOperation;
  }

  public void setCurrentBulkOperation(BulkOperation currentBulkOperation) {
    this.currentBulkOperation = currentBulkOperation;
  }

  /**
   * Returns a Customer resource by ID.
   */
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  /**
   * Returns the status of a customer merge request job.
   */
  public CustomerMergeRequest getCustomerMergeJobStatus() {
    return customerMergeJobStatus;
  }

  public void setCustomerMergeJobStatus(CustomerMergeRequest customerMergeJobStatus) {
    this.customerMergeJobStatus = customerMergeJobStatus;
  }

  /**
   * Returns a preview of a customer merge request.
   */
  public CustomerMergePreview getCustomerMergePreview() {
    return customerMergePreview;
  }

  public void setCustomerMergePreview(CustomerMergePreview customerMergePreview) {
    this.customerMergePreview = customerMergePreview;
  }

  /**
   * Returns a CustomerPaymentMethod resource by its ID.
   */
  public CustomerPaymentMethod getCustomerPaymentMethod() {
    return customerPaymentMethod;
  }

  public void setCustomerPaymentMethod(CustomerPaymentMethod customerPaymentMethod) {
    this.customerPaymentMethod = customerPaymentMethod;
  }

  /**
   * The list of members, such as customers, that's associated with an individual segment.
   * The maximum page size is 1000.
   */
  public CustomerSegmentMemberConnection getCustomerSegmentMembers() {
    return customerSegmentMembers;
  }

  public void setCustomerSegmentMembers(CustomerSegmentMemberConnection customerSegmentMembers) {
    this.customerSegmentMembers = customerSegmentMembers;
  }

  /**
   * Returns a segment members query resource by ID.
   */
  public CustomerSegmentMembersQuery getCustomerSegmentMembersQuery() {
    return customerSegmentMembersQuery;
  }

  public void setCustomerSegmentMembersQuery(
      CustomerSegmentMembersQuery customerSegmentMembersQuery) {
    this.customerSegmentMembersQuery = customerSegmentMembersQuery;
  }

  /**
   * Whether a member, which is a customer, belongs to a segment.
   */
  public SegmentMembershipResponse getCustomerSegmentMembership() {
    return customerSegmentMembership;
  }

  public void setCustomerSegmentMembership(SegmentMembershipResponse customerSegmentMembership) {
    this.customerSegmentMembership = customerSegmentMembership;
  }

  /**
   * Returns a list of customers.
   */
  public CustomerConnection getCustomers() {
    return customers;
  }

  public void setCustomers(CustomerConnection customers) {
    this.customers = customers;
  }

  /**
   * The paginated list of deletion events.
   */
  public DeletionEventConnection getDeletionEvents() {
    return deletionEvents;
  }

  public void setDeletionEvents(DeletionEventConnection deletionEvents) {
    this.deletionEvents = deletionEvents;
  }

  /**
   * The delivery customization.
   */
  public DeliveryCustomization getDeliveryCustomization() {
    return deliveryCustomization;
  }

  public void setDeliveryCustomization(DeliveryCustomization deliveryCustomization) {
    this.deliveryCustomization = deliveryCustomization;
  }

  /**
   * The delivery customizations.
   */
  public DeliveryCustomizationConnection getDeliveryCustomizations() {
    return deliveryCustomizations;
  }

  public void setDeliveryCustomizations(DeliveryCustomizationConnection deliveryCustomizations) {
    this.deliveryCustomizations = deliveryCustomizations;
  }

  /**
   * Returns a Delivery Profile resource by ID.
   */
  public DeliveryProfile getDeliveryProfile() {
    return deliveryProfile;
  }

  public void setDeliveryProfile(DeliveryProfile deliveryProfile) {
    this.deliveryProfile = deliveryProfile;
  }

  /**
   * Returns a list of saved delivery profiles.
   */
  public DeliveryProfileConnection getDeliveryProfiles() {
    return deliveryProfiles;
  }

  public void setDeliveryProfiles(DeliveryProfileConnection deliveryProfiles) {
    this.deliveryProfiles = deliveryProfiles;
  }

  /**
   * Returns the shop-wide shipping settings.
   */
  public DeliverySetting getDeliverySettings() {
    return deliverySettings;
  }

  public void setDeliverySettings(DeliverySetting deliverySettings) {
    this.deliverySettings = deliverySettings;
  }

  /**
   * The total number of discount codes for the shop.
   */
  public int getDiscountCodeCount() {
    return discountCodeCount;
  }

  public void setDiscountCodeCount(int discountCodeCount) {
    this.discountCodeCount = discountCodeCount;
  }

  /**
   * Returns a discount resource by ID.
   */
  public DiscountNode getDiscountNode() {
    return discountNode;
  }

  public void setDiscountNode(DiscountNode discountNode) {
    this.discountNode = discountNode;
  }

  /**
   * Returns a list of discounts.
   */
  public DiscountNodeConnection getDiscountNodes() {
    return discountNodes;
  }

  public void setDiscountNodes(DiscountNodeConnection discountNodes) {
    this.discountNodes = discountNodes;
  }

  /**
   * Returns a bulk code creation resource by ID.
   */
  public DiscountRedeemCodeBulkCreation getDiscountRedeemCodeBulkCreation() {
    return discountRedeemCodeBulkCreation;
  }

  public void setDiscountRedeemCodeBulkCreation(
      DiscountRedeemCodeBulkCreation discountRedeemCodeBulkCreation) {
    this.discountRedeemCodeBulkCreation = discountRedeemCodeBulkCreation;
  }

  /**
   * List of the shop's redeemed discount code saved searches.
   */
  public SavedSearchConnection getDiscountRedeemCodeSavedSearches() {
    return discountRedeemCodeSavedSearches;
  }

  public void setDiscountRedeemCodeSavedSearches(
      SavedSearchConnection discountRedeemCodeSavedSearches) {
    this.discountRedeemCodeSavedSearches = discountRedeemCodeSavedSearches;
  }

  /**
   * Returns dispute details based on ID.
   */
  public ShopifyPaymentsDispute getDispute() {
    return dispute;
  }

  public void setDispute(ShopifyPaymentsDispute dispute) {
    this.dispute = dispute;
  }

  /**
   * Returns dispute evidence details based on ID.
   */
  public ShopifyPaymentsDisputeEvidence getDisputeEvidence() {
    return disputeEvidence;
  }

  public void setDisputeEvidence(ShopifyPaymentsDisputeEvidence disputeEvidence) {
    this.disputeEvidence = disputeEvidence;
  }

  /**
   * Lookup a Domain by ID.
   */
  public Domain getDomain() {
    return domain;
  }

  public void setDomain(Domain domain) {
    this.domain = domain;
  }

  /**
   * Returns a DraftOrder resource by ID.
   */
  public DraftOrder getDraftOrder() {
    return draftOrder;
  }

  public void setDraftOrder(DraftOrder draftOrder) {
    this.draftOrder = draftOrder;
  }

  /**
   * List of the shop's draft order saved searches.
   */
  public SavedSearchConnection getDraftOrderSavedSearches() {
    return draftOrderSavedSearches;
  }

  public void setDraftOrderSavedSearches(SavedSearchConnection draftOrderSavedSearches) {
    this.draftOrderSavedSearches = draftOrderSavedSearches;
  }

  /**
   * Returns a DraftOrderTag resource by ID.
   */
  public DraftOrderTag getDraftOrderTag() {
    return draftOrderTag;
  }

  public void setDraftOrderTag(DraftOrderTag draftOrderTag) {
    this.draftOrderTag = draftOrderTag;
  }

  /**
   * List of saved draft orders.
   */
  public DraftOrderConnection getDraftOrders() {
    return draftOrders;
  }

  public void setDraftOrders(DraftOrderConnection draftOrders) {
    this.draftOrders = draftOrders;
  }

  /**
   * A list of the shop's file saved searches.
   */
  public SavedSearchConnection getFileSavedSearches() {
    return fileSavedSearches;
  }

  public void setFileSavedSearches(SavedSearchConnection fileSavedSearches) {
    this.fileSavedSearches = fileSavedSearches;
  }

  /**
   * Returns a paginated list of files that have been uploaded to Shopify.
   */
  public FileConnection getFiles() {
    return files;
  }

  public void setFiles(FileConnection files) {
    this.files = files;
  }

  /**
   * Returns a Fulfillment resource by ID.
   */
  public Fulfillment getFulfillment() {
    return fulfillment;
  }

  public void setFulfillment(Fulfillment fulfillment) {
    this.fulfillment = fulfillment;
  }

  /**
   * The fulfillment constraint rules that belong to a shop.
   */
  public List<FulfillmentConstraintRule> getFulfillmentConstraintRules() {
    return fulfillmentConstraintRules;
  }

  public void setFulfillmentConstraintRules(
      List<FulfillmentConstraintRule> fulfillmentConstraintRules) {
    this.fulfillmentConstraintRules = fulfillmentConstraintRules;
  }

  /**
   * Returns a Fulfillment order resource by ID.
   */
  public FulfillmentOrder getFulfillmentOrder() {
    return fulfillmentOrder;
  }

  public void setFulfillmentOrder(FulfillmentOrder fulfillmentOrder) {
    this.fulfillmentOrder = fulfillmentOrder;
  }

  /**
   * The paginated list of all fulfillment orders.
   * The returned fulfillment orders are filtered according to the
   * [fulfillment order access scopes](https://shopify.dev/api/admin-graphql/latest/objects/fulfillmentorder#api-access-scopes)
   * granted to the app.
   *   
   * Use this query to retrieve fulfillment orders assigned to merchant-managed locations,
   * third-party fulfillment service locations, or all kinds of locations together.
   *   
   * For fetching only the fulfillment orders assigned to the app's locations, use the
   * [assignedFulfillmentOrders](https://shopify.dev/api/admin-graphql/2024-07/objects/queryroot#connection-assignedfulfillmentorders)
   * connection.
   */
  public FulfillmentOrderConnection getFulfillmentOrders() {
    return fulfillmentOrders;
  }

  public void setFulfillmentOrders(FulfillmentOrderConnection fulfillmentOrders) {
    this.fulfillmentOrders = fulfillmentOrders;
  }

  /**
   * Returns a FulfillmentService resource by ID.
   */
  public FulfillmentService getFulfillmentService() {
    return fulfillmentService;
  }

  public void setFulfillmentService(FulfillmentService fulfillmentService) {
    this.fulfillmentService = fulfillmentService;
  }

  /**
   * Returns a gift card resource by ID.
   */
  public GiftCard getGiftCard() {
    return giftCard;
  }

  public void setGiftCard(GiftCard giftCard) {
    this.giftCard = giftCard;
  }

  /**
   * Returns a list of gift cards.
   */
  public GiftCardConnection getGiftCards() {
    return giftCards;
  }

  public void setGiftCards(GiftCardConnection giftCards) {
    this.giftCards = giftCards;
  }

  /**
   * The total number of gift cards issued for the shop.
   */
  public String getGiftCardsCount() {
    return giftCardsCount;
  }

  public void setGiftCardsCount(String giftCardsCount) {
    this.giftCardsCount = giftCardsCount;
  }

  /**
   * Returns an
   * [InventoryItem](https://shopify.dev/docs/api/admin-graphql/latest/objects/InventoryItem)
   * object by ID.
   */
  public InventoryItem getInventoryItem() {
    return inventoryItem;
  }

  public void setInventoryItem(InventoryItem inventoryItem) {
    this.inventoryItem = inventoryItem;
  }

  /**
   * Returns a list of inventory items.
   */
  public InventoryItemConnection getInventoryItems() {
    return inventoryItems;
  }

  public void setInventoryItems(InventoryItemConnection inventoryItems) {
    this.inventoryItems = inventoryItems;
  }

  /**
   * Returns an
   * [InventoryLevel](https://shopify.dev/docs/api/admin-graphql/latest/objects/InventoryLevel)
   * object by ID.
   */
  public InventoryLevel getInventoryLevel() {
    return inventoryLevel;
  }

  public void setInventoryLevel(InventoryLevel inventoryLevel) {
    this.inventoryLevel = inventoryLevel;
  }

  /**
   * General inventory properties for the shop.
   */
  public InventoryProperties getInventoryProperties() {
    return inventoryProperties;
  }

  public void setInventoryProperties(InventoryProperties inventoryProperties) {
    this.inventoryProperties = inventoryProperties;
  }

  /**
   * Returns a Job resource by ID. Used to check the status of internal jobs and any applicable changes.
   */
  public Job getJob() {
    return job;
  }

  public void setJob(Job job) {
    this.job = job;
  }

  /**
   * Returns an inventory Location resource by ID.
   */
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  /**
   * Returns a list of active inventory locations.
   */
  public LocationConnection getLocations() {
    return locations;
  }

  public void setLocations(LocationConnection locations) {
    this.locations = locations;
  }

  /**
   * Returns a list of all origin locations available for a delivery profile.
   */
  public List<Location> getLocationsAvailableForDeliveryProfiles() {
    return locationsAvailableForDeliveryProfiles;
  }

  public void setLocationsAvailableForDeliveryProfiles(
      List<Location> locationsAvailableForDeliveryProfiles) {
    this.locationsAvailableForDeliveryProfiles = locationsAvailableForDeliveryProfiles;
  }

  /**
   * Returns a list of all origin locations available for a delivery profile.
   */
  public LocationConnection getLocationsAvailableForDeliveryProfilesConnection() {
    return locationsAvailableForDeliveryProfilesConnection;
  }

  public void setLocationsAvailableForDeliveryProfilesConnection(
      LocationConnection locationsAvailableForDeliveryProfilesConnection) {
    this.locationsAvailableForDeliveryProfilesConnection = locationsAvailableForDeliveryProfilesConnection;
  }

  /**
   * Returns a list of fulfillment orders that are on hold.
   */
  public FulfillmentOrderConnection getManualHoldsFulfillmentOrders() {
    return manualHoldsFulfillmentOrders;
  }

  public void setManualHoldsFulfillmentOrders(
      FulfillmentOrderConnection manualHoldsFulfillmentOrders) {
    this.manualHoldsFulfillmentOrders = manualHoldsFulfillmentOrders;
  }

  /**
   * Returns a market resource by ID.
   */
  public Market getMarket() {
    return market;
  }

  public void setMarket(Market market) {
    this.market = market;
  }

  /**
   * Returns the applicable market for a customer based on where they are in the world.
   */
  public Market getMarketByGeography() {
    return marketByGeography;
  }

  public void setMarketByGeography(Market marketByGeography) {
    this.marketByGeography = marketByGeography;
  }

  /**
   * A resource that can have localized values for different markets.
   */
  public MarketLocalizableResource getMarketLocalizableResource() {
    return marketLocalizableResource;
  }

  public void setMarketLocalizableResource(MarketLocalizableResource marketLocalizableResource) {
    this.marketLocalizableResource = marketLocalizableResource;
  }

  /**
   * Resources that can have localized values for different markets.
   */
  public MarketLocalizableResourceConnection getMarketLocalizableResources() {
    return marketLocalizableResources;
  }

  public void setMarketLocalizableResources(
      MarketLocalizableResourceConnection marketLocalizableResources) {
    this.marketLocalizableResources = marketLocalizableResources;
  }

  /**
   * Resources that can have localized values for different markets.
   */
  public MarketLocalizableResourceConnection getMarketLocalizableResourcesByIds() {
    return marketLocalizableResourcesByIds;
  }

  public void setMarketLocalizableResourcesByIds(
      MarketLocalizableResourceConnection marketLocalizableResourcesByIds) {
    this.marketLocalizableResourcesByIds = marketLocalizableResourcesByIds;
  }

  /**
   * A list of marketing activities associated with the marketing app.
   */
  public MarketingActivityConnection getMarketingActivities() {
    return marketingActivities;
  }

  public void setMarketingActivities(MarketingActivityConnection marketingActivities) {
    this.marketingActivities = marketingActivities;
  }

  /**
   * Returns a MarketingActivity resource by ID.
   */
  public MarketingActivity getMarketingActivity() {
    return marketingActivity;
  }

  public void setMarketingActivity(MarketingActivity marketingActivity) {
    this.marketingActivity = marketingActivity;
  }

  /**
   * Returns a MarketingEvent resource by ID.
   */
  public MarketingEvent getMarketingEvent() {
    return marketingEvent;
  }

  public void setMarketingEvent(MarketingEvent marketingEvent) {
    this.marketingEvent = marketingEvent;
  }

  /**
   * A list of marketing events associated with the marketing app.
   */
  public MarketingEventConnection getMarketingEvents() {
    return marketingEvents;
  }

  public void setMarketingEvents(MarketingEventConnection marketingEvents) {
    this.marketingEvents = marketingEvents;
  }

  /**
   * The markets configured for the shop.
   */
  public MarketConnection getMarkets() {
    return markets;
  }

  public void setMarkets(MarketConnection markets) {
    this.markets = markets;
  }

  /**
   * Returns a metafield definition by identifier.
   */
  public MetafieldDefinition getMetafieldDefinition() {
    return metafieldDefinition;
  }

  public void setMetafieldDefinition(MetafieldDefinition metafieldDefinition) {
    this.metafieldDefinition = metafieldDefinition;
  }

  /**
   * Each metafield definition has a type, which defines the type of information that it can store.
   * This type is enforced across every instance of the resource that owns the metafield definition.
   *   
   * Refer to the [list of supported metafield types](https://shopify.dev/apps/metafields/types).
   */
  public List<MetafieldDefinitionType> getMetafieldDefinitionTypes() {
    return metafieldDefinitionTypes;
  }

  public void setMetafieldDefinitionTypes(List<MetafieldDefinitionType> metafieldDefinitionTypes) {
    this.metafieldDefinitionTypes = metafieldDefinitionTypes;
  }

  /**
   * Returns a list of metafield definitions.
   */
  public MetafieldDefinitionConnection getMetafieldDefinitions() {
    return metafieldDefinitions;
  }

  public void setMetafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
    this.metafieldDefinitions = metafieldDefinitions;
  }

  /**
   * List of the `MetafieldStorefrontVisibility` records.
   */
  public MetafieldStorefrontVisibilityConnection getMetafieldStorefrontVisibilities() {
    return metafieldStorefrontVisibilities;
  }

  public void setMetafieldStorefrontVisibilities(
      MetafieldStorefrontVisibilityConnection metafieldStorefrontVisibilities) {
    this.metafieldStorefrontVisibilities = metafieldStorefrontVisibilities;
  }

  /**
   * Returns a `MetafieldStorefrontVisibility` record by ID. A `MetafieldStorefrontVisibility` record lists the
   * metafields to make visible in the Storefront API.
   */
  public MetafieldStorefrontVisibility getMetafieldStorefrontVisibility() {
    return metafieldStorefrontVisibility;
  }

  public void setMetafieldStorefrontVisibility(
      MetafieldStorefrontVisibility metafieldStorefrontVisibility) {
    this.metafieldStorefrontVisibility = metafieldStorefrontVisibility;
  }

  /**
   * Retrieves a metaobject by ID.
   */
  public Metaobject getMetaobject() {
    return metaobject;
  }

  public void setMetaobject(Metaobject metaobject) {
    this.metaobject = metaobject;
  }

  /**
   * Retrieves a metaobject by handle.
   */
  public Metaobject getMetaobjectByHandle() {
    return metaobjectByHandle;
  }

  public void setMetaobjectByHandle(Metaobject metaobjectByHandle) {
    this.metaobjectByHandle = metaobjectByHandle;
  }

  /**
   * Retrieves a metaobject definition by ID.
   */
  public MetaobjectDefinition getMetaobjectDefinition() {
    return metaobjectDefinition;
  }

  public void setMetaobjectDefinition(MetaobjectDefinition metaobjectDefinition) {
    this.metaobjectDefinition = metaobjectDefinition;
  }

  /**
   * Finds a metaobject definition by type.
   */
  public MetaobjectDefinition getMetaobjectDefinitionByType() {
    return metaobjectDefinitionByType;
  }

  public void setMetaobjectDefinitionByType(MetaobjectDefinition metaobjectDefinitionByType) {
    this.metaobjectDefinitionByType = metaobjectDefinitionByType;
  }

  /**
   * All metaobject definitions.
   */
  public MetaobjectDefinitionConnection getMetaobjectDefinitions() {
    return metaobjectDefinitions;
  }

  public void setMetaobjectDefinitions(MetaobjectDefinitionConnection metaobjectDefinitions) {
    this.metaobjectDefinitions = metaobjectDefinitions;
  }

  /**
   * All metaobjects for the shop.
   */
  public MetaobjectConnection getMetaobjects() {
    return metaobjects;
  }

  public void setMetaobjects(MetaobjectConnection metaobjects) {
    this.metaobjects = metaobjects;
  }

  /**
   * Returns a specific node (any object that implements the
   * [Node](https://shopify.dev/api/admin-graphql/latest/interfaces/Node)
   * interface) by ID, in accordance with the
   * [Relay specification](https://relay.dev/docs/guides/graphql-server-specification/#object-identification).
   * This field is commonly used for refetching an object.
   */
  public Node getNode() {
    return node;
  }

  public void setNode(Node node) {
    this.node = node;
  }

  /**
   * Returns the list of nodes (any objects that implement the
   * [Node](https://shopify.dev/api/admin-graphql/latest/interfaces/Node)
   * interface) with the given IDs, in accordance with the
   * [Relay specification](https://relay.dev/docs/guides/graphql-server-specification/#object-identification).
   */
  public List<Node> getNodes() {
    return nodes;
  }

  public void setNodes(List<Node> nodes) {
    this.nodes = nodes;
  }

  /**
   * Returns an Order resource by ID.
   */
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  /**
   * Returns a payment status by payment reference ID. Used to check the status of a deferred payment.
   */
  public OrderPaymentStatus getOrderPaymentStatus() {
    return orderPaymentStatus;
  }

  public void setOrderPaymentStatus(OrderPaymentStatus orderPaymentStatus) {
    this.orderPaymentStatus = orderPaymentStatus;
  }

  /**
   * List of the shop's order saved searches.
   */
  public SavedSearchConnection getOrderSavedSearches() {
    return orderSavedSearches;
  }

  public void setOrderSavedSearches(SavedSearchConnection orderSavedSearches) {
    this.orderSavedSearches = orderSavedSearches;
  }

  /**
   * Returns a list of orders placed in the store.
   */
  public OrderConnection getOrders() {
    return orders;
  }

  public void setOrders(OrderConnection orders) {
    this.orders = orders;
  }

  /**
   * The payment customization.
   */
  public PaymentCustomization getPaymentCustomization() {
    return paymentCustomization;
  }

  public void setPaymentCustomization(PaymentCustomization paymentCustomization) {
    this.paymentCustomization = paymentCustomization;
  }

  /**
   * The payment customizations.
   */
  public PaymentCustomizationConnection getPaymentCustomizations() {
    return paymentCustomizations;
  }

  public void setPaymentCustomizations(PaymentCustomizationConnection paymentCustomizations) {
    this.paymentCustomizations = paymentCustomizations;
  }

  /**
   * The list of payment terms templates eligible for all shops and users.
   */
  public List<PaymentTermsTemplate> getPaymentTermsTemplates() {
    return paymentTermsTemplates;
  }

  public void setPaymentTermsTemplates(List<PaymentTermsTemplate> paymentTermsTemplates) {
    this.paymentTermsTemplates = paymentTermsTemplates;
  }

  /**
   * Returns a price list resource by ID.
   */
  public PriceList getPriceList() {
    return priceList;
  }

  public void setPriceList(PriceList priceList) {
    this.priceList = priceList;
  }

  /**
   * All price lists for a shop.
   */
  public PriceListConnection getPriceLists() {
    return priceLists;
  }

  public void setPriceLists(PriceListConnection priceLists) {
    this.priceLists = priceLists;
  }

  /**
   * Returns a code price rule resource by ID.
   */
  public PriceRule getPriceRule() {
    return priceRule;
  }

  public void setPriceRule(PriceRule priceRule) {
    this.priceRule = priceRule;
  }

  /**
   * List of the shop's price rule saved searches.
   */
  public SavedSearchConnection getPriceRuleSavedSearches() {
    return priceRuleSavedSearches;
  }

  public void setPriceRuleSavedSearches(SavedSearchConnection priceRuleSavedSearches) {
    this.priceRuleSavedSearches = priceRuleSavedSearches;
  }

  /**
   * Returns a list of price rule resources that have at least one associated discount code.
   */
  public PriceRuleConnection getPriceRules() {
    return priceRules;
  }

  public void setPriceRules(PriceRuleConnection priceRules) {
    this.priceRules = priceRules;
  }

  /**
   * The primary market of the shop.
   */
  public Market getPrimaryMarket() {
    return primaryMarket;
  }

  public void setPrimaryMarket(Market primaryMarket) {
    this.primaryMarket = primaryMarket;
  }

  /**
   * Returns a private metafield by ID.
   * Private metafields are accessible only by the application that created them.
   */
  public PrivateMetafield getPrivateMetafield() {
    return privateMetafield;
  }

  public void setPrivateMetafield(PrivateMetafield privateMetafield) {
    this.privateMetafield = privateMetafield;
  }

  /**
   * Returns a list of private metafields associated to a resource.
   */
  public PrivateMetafieldConnection getPrivateMetafields() {
    return privateMetafields;
  }

  public void setPrivateMetafields(PrivateMetafieldConnection privateMetafields) {
    this.privateMetafields = privateMetafields;
  }

  /**
   * Returns a Product resource by ID.
   */
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  /**
   * Return a product by its handle.
   */
  public Product getProductByHandle() {
    return productByHandle;
  }

  public void setProductByHandle(Product productByHandle) {
    this.productByHandle = productByHandle;
  }

  /**
   * Returns the product duplicate job.
   */
  public ProductDuplicateJob getProductDuplicateJob() {
    return productDuplicateJob;
  }

  public void setProductDuplicateJob(ProductDuplicateJob productDuplicateJob) {
    this.productDuplicateJob = productDuplicateJob;
  }

  /**
   * Returns a ProductFeed resource by ID.
   */
  public ProductFeed getProductFeed() {
    return productFeed;
  }

  public void setProductFeed(ProductFeed productFeed) {
    this.productFeed = productFeed;
  }

  /**
   * The product feeds for the shop.
   */
  public ProductFeedConnection getProductFeeds() {
    return productFeeds;
  }

  public void setProductFeeds(ProductFeedConnection productFeeds) {
    this.productFeeds = productFeeds;
  }

  /**
   * Returns the product resource feedback for the currently authenticated app.
   */
  public ProductResourceFeedback getProductResourceFeedback() {
    return productResourceFeedback;
  }

  public void setProductResourceFeedback(ProductResourceFeedback productResourceFeedback) {
    this.productResourceFeedback = productResourceFeedback;
  }

  /**
   * Returns a list of the shop's product saved searches.
   */
  public SavedSearchConnection getProductSavedSearches() {
    return productSavedSearches;
  }

  public void setProductSavedSearches(SavedSearchConnection productSavedSearches) {
    this.productSavedSearches = productSavedSearches;
  }

  /**
   * Returns a ProductVariant resource by ID.
   */
  public ProductVariant getProductVariant() {
    return productVariant;
  }

  public void setProductVariant(ProductVariant productVariant) {
    this.productVariant = productVariant;
  }

  /**
   * Returns a list of product variants.
   */
  public ProductVariantConnection getProductVariants() {
    return productVariants;
  }

  public void setProductVariants(ProductVariantConnection productVariants) {
    this.productVariants = productVariants;
  }

  /**
   * Returns a list of products.
   */
  public ProductConnection getProducts() {
    return products;
  }

  public void setProducts(ProductConnection products) {
    this.products = products;
  }

  /**
   * The list of publicly-accessible Admin API versions, including supported
   * versions, the release candidate, and unstable versions.
   */
  public List<ApiVersion> getPublicApiVersions() {
    return publicApiVersions;
  }

  public void setPublicApiVersions(List<ApiVersion> publicApiVersions) {
    this.publicApiVersions = publicApiVersions;
  }

  /**
   * Lookup a publication by ID.
   */
  public Publication getPublication() {
    return publication;
  }

  public void setPublication(Publication publication) {
    this.publication = publication;
  }

  /**
   * List of publications.
   */
  public PublicationConnection getPublications() {
    return publications;
  }

  public void setPublications(PublicationConnection publications) {
    this.publications = publications;
  }

  /**
   * Returns a Refund resource by ID.
   */
  public Refund getRefund() {
    return refund;
  }

  public void setRefund(Refund refund) {
    this.refund = refund;
  }

  /**
   * Returns a Return resource by ID.
   */
  public Return getReturn() {
    return _return;
  }

  public void setReturn(Return _return) {
    this._return = _return;
  }

  /**
   * Lookup a returnable fulfillment by ID.
   */
  public ReturnableFulfillment getReturnableFulfillment() {
    return returnableFulfillment;
  }

  public void setReturnableFulfillment(ReturnableFulfillment returnableFulfillment) {
    this.returnableFulfillment = returnableFulfillment;
  }

  /**
   * List of returnable fulfillments.
   */
  public ReturnableFulfillmentConnection getReturnableFulfillments() {
    return returnableFulfillments;
  }

  public void setReturnableFulfillments(ReturnableFulfillmentConnection returnableFulfillments) {
    this.returnableFulfillments = returnableFulfillments;
  }

  /**
   * Lookup a reverse delivery by ID.
   */
  public ReverseDelivery getReverseDelivery() {
    return reverseDelivery;
  }

  public void setReverseDelivery(ReverseDelivery reverseDelivery) {
    this.reverseDelivery = reverseDelivery;
  }

  /**
   * Lookup a reverse fulfillment order by ID.
   */
  public ReverseFulfillmentOrder getReverseFulfillmentOrder() {
    return reverseFulfillmentOrder;
  }

  public void setReverseFulfillmentOrder(ReverseFulfillmentOrder reverseFulfillmentOrder) {
    this.reverseFulfillmentOrder = reverseFulfillmentOrder;
  }

  /**
   * <div class="note"><h4>Theme app extensions</h4>
   *   <p>Your app might not pass App Store review if it uses script tags instead of
   * theme app extensions. All new apps, and apps that integrate with Online Store
   * 2.0 themes, should use theme app extensions, such as app blocks or app embed
   * blocks. Script tags are an alternative you can use with only vintage themes.
   * <a href="/apps/online-store#what-integration-method-should-i-use"
   * target="_blank">Learn more</a>.</p></div>
   *   
   * <div class="note"><h4>Script tag deprecation</h4>
   *   <p>Script tags will be sunset for the <b>Order status</b> page on August 28, 2025. <a href="https://www.shopify.com/plus/upgrading-to-checkout-extensibility">Upgrade
   * to Checkout Extensibility</a> before this date. <a
   * href="/docs/api/liquid/objects#script">Shopify Scripts</a> will continue to
   * work alongside Checkout Extensibility until August 28, 2025.</p></div>
   *   
   *   
   * Lookup a script tag resource by ID.
   */
  public ScriptTag getScriptTag() {
    return scriptTag;
  }

  public void setScriptTag(ScriptTag scriptTag) {
    this.scriptTag = scriptTag;
  }

  /**
   * <div class="note"><h4>Theme app extensions</h4>
   *   <p>Your app might not pass App Store review if it uses script tags instead of
   * theme app extensions. All new apps, and apps that integrate with Online Store
   * 2.0 themes, should use theme app extensions, such as app blocks or app embed
   * blocks. Script tags are an alternative you can use with only vintage themes.
   * <a href="/apps/online-store#what-integration-method-should-i-use"
   * target="_blank">Learn more</a>.</p></div>
   *   
   * <div class="note"><h4>Script tag deprecation</h4>
   *   <p>Script tags will be sunset for the <b>Order status</b> page on August 28, 2025. <a href="https://www.shopify.com/plus/upgrading-to-checkout-extensibility">Upgrade
   * to Checkout Extensibility</a> before this date. <a
   * href="/docs/api/liquid/objects#script">Shopify Scripts</a> will continue to
   * work alongside Checkout Extensibility until August 28, 2025.</p></div>
   *   
   *   
   * A list of script tags.
   */
  public ScriptTagConnection getScriptTags() {
    return scriptTags;
  }

  public void setScriptTags(ScriptTagConnection scriptTags) {
    this.scriptTags = scriptTags;
  }

  /**
   * The Customer Segment.
   */
  public Segment getSegment() {
    return segment;
  }

  public void setSegment(Segment segment) {
    this.segment = segment;
  }

  /**
   * The number of segments for a shop.
   */
  public int getSegmentCount() {
    return segmentCount;
  }

  public void setSegmentCount(int segmentCount) {
    this.segmentCount = segmentCount;
  }

  /**
   * A list of filter suggestions associated with a segment. A segment is a group
   * of members (commonly customers) that meet specific criteria.
   */
  public SegmentFilterConnection getSegmentFilterSuggestions() {
    return segmentFilterSuggestions;
  }

  public void setSegmentFilterSuggestions(SegmentFilterConnection segmentFilterSuggestions) {
    this.segmentFilterSuggestions = segmentFilterSuggestions;
  }

  /**
   * A list of filters.
   */
  public SegmentFilterConnection getSegmentFilters() {
    return segmentFilters;
  }

  public void setSegmentFilters(SegmentFilterConnection segmentFilters) {
    this.segmentFilters = segmentFilters;
  }

  /**
   * A list of a shop's segment migrations.
   */
  public SegmentMigrationConnection getSegmentMigrations() {
    return segmentMigrations;
  }

  public void setSegmentMigrations(SegmentMigrationConnection segmentMigrations) {
    this.segmentMigrations = segmentMigrations;
  }

  /**
   * The list of suggested values corresponding to a particular filter for a
   * segment. A segment is a group of members, such as customers, that meet
   * specific criteria.
   */
  public SegmentValueConnection getSegmentValueSuggestions() {
    return segmentValueSuggestions;
  }

  public void setSegmentValueSuggestions(SegmentValueConnection segmentValueSuggestions) {
    this.segmentValueSuggestions = segmentValueSuggestions;
  }

  /**
   * A list of a shop's segments.
   */
  public SegmentConnection getSegments() {
    return segments;
  }

  public void setSegments(SegmentConnection segments) {
    this.segments = segments;
  }

  /**
   * Returns a Selling Plan Group resource by ID.
   */
  public SellingPlanGroup getSellingPlanGroup() {
    return sellingPlanGroup;
  }

  public void setSellingPlanGroup(SellingPlanGroup sellingPlanGroup) {
    this.sellingPlanGroup = sellingPlanGroup;
  }

  /**
   * List Selling Plan Groups.
   */
  public SellingPlanGroupConnection getSellingPlanGroups() {
    return sellingPlanGroups;
  }

  public void setSellingPlanGroups(SellingPlanGroupConnection sellingPlanGroups) {
    this.sellingPlanGroups = sellingPlanGroups;
  }

  /**
   * The server pixel configured by the app.
   */
  public ServerPixel getServerPixel() {
    return serverPixel;
  }

  public void setServerPixel(ServerPixel serverPixel) {
    this.serverPixel = serverPixel;
  }

  /**
   * Returns the Shop resource corresponding to the access token used in the request. The Shop resource contains
   * business and store management settings for the shop.
   */
  public Shop getShop() {
    return shop;
  }

  public void setShop(Shop shop) {
    this.shop = shop;
  }

  /**
   * The shop's billing preferences.
   */
  public ShopBillingPreferences getShopBillingPreferences() {
    return shopBillingPreferences;
  }

  public void setShopBillingPreferences(ShopBillingPreferences shopBillingPreferences) {
    this.shopBillingPreferences = shopBillingPreferences;
  }

  /**
   * A list of locales available on a shop.
   */
  public List<ShopLocale> getShopLocales() {
    return shopLocales;
  }

  public void setShopLocales(List<ShopLocale> shopLocales) {
    this.shopLocales = shopLocales;
  }

  /**
   * The Shopify Function.
   */
  public ShopifyFunction getShopifyFunction() {
    return shopifyFunction;
  }

  public void setShopifyFunction(ShopifyFunction shopifyFunction) {
    this.shopifyFunction = shopifyFunction;
  }

  /**
   * Returns the Shopify Functions for apps installed on the shop.
   */
  public ShopifyFunctionConnection getShopifyFunctions() {
    return shopifyFunctions;
  }

  public void setShopifyFunctions(ShopifyFunctionConnection shopifyFunctions) {
    this.shopifyFunctions = shopifyFunctions;
  }

  /**
   * Shopify Payments account information, including balances and payouts.
   */
  public ShopifyPaymentsAccount getShopifyPaymentsAccount() {
    return shopifyPaymentsAccount;
  }

  public void setShopifyPaymentsAccount(ShopifyPaymentsAccount shopifyPaymentsAccount) {
    this.shopifyPaymentsAccount = shopifyPaymentsAccount;
  }

  /**
   * Returns the results of a ShopifyQL query. Refer to the [ShopifyQL
   * documentation](https://shopify.dev/api/shopifyql) for more information.
   */
  public ShopifyqlResponse getShopifyqlQuery() {
    return shopifyqlQuery;
  }

  public void setShopifyqlQuery(ShopifyqlResponse shopifyqlQuery) {
    this.shopifyqlQuery = shopifyqlQuery;
  }

  /**
   * The StaffMember resource, by ID.
   */
  public StaffMember getStaffMember() {
    return staffMember;
  }

  public void setStaffMember(StaffMember staffMember) {
    this.staffMember = staffMember;
  }

  /**
   * Standard metafield definitions are intended for specific, common use cases.
   * Their namespace and keys reflect these use cases and are reserved.
   *   
   * Refer to all available [`Standard Metafield Definition Templates`](https://shopify.dev/api/admin-graphql/latest/objects/StandardMetafieldDefinitionTemplate).
   */
  public StandardMetafieldDefinitionTemplateConnection getStandardMetafieldDefinitionTemplates() {
    return standardMetafieldDefinitionTemplates;
  }

  public void setStandardMetafieldDefinitionTemplates(
      StandardMetafieldDefinitionTemplateConnection standardMetafieldDefinitionTemplates) {
    this.standardMetafieldDefinitionTemplates = standardMetafieldDefinitionTemplates;
  }

  /**
   * Returns a SubscriptionBillingAttempt by ID.
   */
  public SubscriptionBillingAttempt getSubscriptionBillingAttempt() {
    return subscriptionBillingAttempt;
  }

  public void setSubscriptionBillingAttempt(SubscriptionBillingAttempt subscriptionBillingAttempt) {
    this.subscriptionBillingAttempt = subscriptionBillingAttempt;
  }

  /**
   * Returns subscription billing attempts on a store.
   */
  public SubscriptionBillingAttemptConnection getSubscriptionBillingAttempts() {
    return subscriptionBillingAttempts;
  }

  public void setSubscriptionBillingAttempts(
      SubscriptionBillingAttemptConnection subscriptionBillingAttempts) {
    this.subscriptionBillingAttempts = subscriptionBillingAttempts;
  }

  /**
   * Returns a subscription billing cycle found either by cycle index or date.
   */
  public SubscriptionBillingCycle getSubscriptionBillingCycle() {
    return subscriptionBillingCycle;
  }

  public void setSubscriptionBillingCycle(SubscriptionBillingCycle subscriptionBillingCycle) {
    this.subscriptionBillingCycle = subscriptionBillingCycle;
  }

  /**
   * Returns subscription billing cycles for a contract ID.
   */
  public SubscriptionBillingCycleConnection getSubscriptionBillingCycles() {
    return subscriptionBillingCycles;
  }

  public void setSubscriptionBillingCycles(
      SubscriptionBillingCycleConnection subscriptionBillingCycles) {
    this.subscriptionBillingCycles = subscriptionBillingCycles;
  }

  /**
   * Returns a Subscription Contract resource by ID.
   */
  public SubscriptionContract getSubscriptionContract() {
    return subscriptionContract;
  }

  public void setSubscriptionContract(SubscriptionContract subscriptionContract) {
    this.subscriptionContract = subscriptionContract;
  }

  /**
   * List Subscription Contracts.
   */
  public SubscriptionContractConnection getSubscriptionContracts() {
    return subscriptionContracts;
  }

  public void setSubscriptionContracts(SubscriptionContractConnection subscriptionContracts) {
    this.subscriptionContracts = subscriptionContracts;
  }

  /**
   * Returns a Subscription Draft resource by ID.
   */
  public SubscriptionDraft getSubscriptionDraft() {
    return subscriptionDraft;
  }

  public void setSubscriptionDraft(SubscriptionDraft subscriptionDraft) {
    this.subscriptionDraft = subscriptionDraft;
  }

  /**
   * Returns a list of TenderTransactions associated with the shop.
   */
  public TenderTransactionConnection getTenderTransactions() {
    return tenderTransactions;
  }

  public void setTenderTransactions(TenderTransactionConnection tenderTransactions) {
    this.tenderTransactions = tenderTransactions;
  }

  /**
   * A resource that can have localized values for different languages.
   */
  public TranslatableResource getTranslatableResource() {
    return translatableResource;
  }

  public void setTranslatableResource(TranslatableResource translatableResource) {
    this.translatableResource = translatableResource;
  }

  /**
   * Resources that can have localized values for different languages.
   */
  public TranslatableResourceConnection getTranslatableResources() {
    return translatableResources;
  }

  public void setTranslatableResources(TranslatableResourceConnection translatableResources) {
    this.translatableResources = translatableResources;
  }

  /**
   * Resources that can have localized values for different languages.
   */
  public TranslatableResourceConnection getTranslatableResourcesByIds() {
    return translatableResourcesByIds;
  }

  public void setTranslatableResourcesByIds(
      TranslatableResourceConnection translatableResourcesByIds) {
    this.translatableResourcesByIds = translatableResourcesByIds;
  }

  /**
   * Returns a redirect resource by ID.
   */
  public UrlRedirect getUrlRedirect() {
    return urlRedirect;
  }

  public void setUrlRedirect(UrlRedirect urlRedirect) {
    this.urlRedirect = urlRedirect;
  }

  /**
   * Returns a redirect import resource by ID.
   */
  public UrlRedirectImport getUrlRedirectImport() {
    return urlRedirectImport;
  }

  public void setUrlRedirectImport(UrlRedirectImport urlRedirectImport) {
    this.urlRedirectImport = urlRedirectImport;
  }

  /**
   * A list of the shop's URL redirect saved searches.
   */
  public SavedSearchConnection getUrlRedirectSavedSearches() {
    return urlRedirectSavedSearches;
  }

  public void setUrlRedirectSavedSearches(SavedSearchConnection urlRedirectSavedSearches) {
    this.urlRedirectSavedSearches = urlRedirectSavedSearches;
  }

  /**
   * A list of redirects for a shop.
   */
  public UrlRedirectConnection getUrlRedirects() {
    return urlRedirects;
  }

  public void setUrlRedirects(UrlRedirectConnection urlRedirects) {
    this.urlRedirects = urlRedirects;
  }

  /**
   * Validation available on the shop.
   */
  public Validation getValidation() {
    return validation;
  }

  public void setValidation(Validation validation) {
    this.validation = validation;
  }

  /**
   * Validations available on the shop.
   */
  public ValidationConnection getValidations() {
    return validations;
  }

  public void setValidations(ValidationConnection validations) {
    this.validations = validations;
  }

  /**
   * The web pixel configured by the app.
   */
  public WebPixel getWebPixel() {
    return webPixel;
  }

  public void setWebPixel(WebPixel webPixel) {
    this.webPixel = webPixel;
  }

  /**
   * Returns a webhook subscription by ID.
   *   
   * Building an app? If you only use app-specific webhooks, you won't need this.
   * App-specific webhook subscriptions specified in your `shopify.app.toml` may be
   * easier. They are automatically kept up to date by Shopify & require less
   * maintenance. Please read [About managing webhook
   * subscriptions](https://shopify.dev/docs/apps/build/webhooks/subscribe).
   */
  public WebhookSubscription getWebhookSubscription() {
    return webhookSubscription;
  }

  public void setWebhookSubscription(WebhookSubscription webhookSubscription) {
    this.webhookSubscription = webhookSubscription;
  }

  /**
   * Returns a list of webhook subscriptions.
   *   
   * Building an app? If you only use app-specific webhooks, you won't need this.
   * App-specific webhook subscriptions specified in your `shopify.app.toml` may be
   * easier. They are automatically kept up to date by Shopify & require less
   * maintenance. Please read [About managing webhook
   * subscriptions](https://shopify.dev/docs/apps/build/webhooks/subscribe).
   */
  public WebhookSubscriptionConnection getWebhookSubscriptions() {
    return webhookSubscriptions;
  }

  public void setWebhookSubscriptions(WebhookSubscriptionConnection webhookSubscriptions) {
    this.webhookSubscriptions = webhookSubscriptions;
  }

  @Override
  public String toString() {
    return "QueryRoot{abandonment='" + abandonment + "', abandonmentByAbandonedCheckoutId='" + abandonmentByAbandonedCheckoutId + "', app='" + app + "', appByHandle='" + appByHandle + "', appByKey='" + appByKey + "', appDiscountType='" + appDiscountType + "', appDiscountTypes='" + appDiscountTypes + "', appInstallation='" + appInstallation + "', appInstallations='" + appInstallations + "', automaticDiscount='" + automaticDiscount + "', automaticDiscountNode='" + automaticDiscountNode + "', automaticDiscountNodes='" + automaticDiscountNodes + "', automaticDiscountSavedSearches='" + automaticDiscountSavedSearches + "', automaticDiscounts='" + automaticDiscounts + "', availableCarrierServices='" + availableCarrierServices + "', availableLocales='" + availableLocales + "', carrierService='" + carrierService + "', cartTransforms='" + cartTransforms + "', catalog='" + catalog + "', catalogOperations='" + catalogOperations + "', catalogs='" + catalogs + "', channel='" + channel + "', channels='" + channels + "', checkoutBranding='" + checkoutBranding + "', checkoutProfile='" + checkoutProfile + "', checkoutProfiles='" + checkoutProfiles + "', codeDiscountNode='" + codeDiscountNode + "', codeDiscountNodeByCode='" + codeDiscountNodeByCode + "', codeDiscountNodes='" + codeDiscountNodes + "', codeDiscountSavedSearches='" + codeDiscountSavedSearches + "', collection='" + collection + "', collectionByHandle='" + collectionByHandle + "', collectionRulesConditions='" + collectionRulesConditions + "', collectionSavedSearches='" + collectionSavedSearches + "', collections='" + collections + "', companies='" + companies + "', company='" + company + "', companyContact='" + companyContact + "', companyContactRole='" + companyContactRole + "', companyCount='" + companyCount + "', companyLocation='" + companyLocation + "', companyLocations='" + companyLocations + "', currentAppInstallation='" + currentAppInstallation + "', currentBulkOperation='" + currentBulkOperation + "', customer='" + customer + "', customerMergeJobStatus='" + customerMergeJobStatus + "', customerMergePreview='" + customerMergePreview + "', customerPaymentMethod='" + customerPaymentMethod + "', customerSegmentMembers='" + customerSegmentMembers + "', customerSegmentMembersQuery='" + customerSegmentMembersQuery + "', customerSegmentMembership='" + customerSegmentMembership + "', customers='" + customers + "', deletionEvents='" + deletionEvents + "', deliveryCustomization='" + deliveryCustomization + "', deliveryCustomizations='" + deliveryCustomizations + "', deliveryProfile='" + deliveryProfile + "', deliveryProfiles='" + deliveryProfiles + "', deliverySettings='" + deliverySettings + "', discountCodeCount='" + discountCodeCount + "', discountNode='" + discountNode + "', discountNodes='" + discountNodes + "', discountRedeemCodeBulkCreation='" + discountRedeemCodeBulkCreation + "', discountRedeemCodeSavedSearches='" + discountRedeemCodeSavedSearches + "', dispute='" + dispute + "', disputeEvidence='" + disputeEvidence + "', domain='" + domain + "', draftOrder='" + draftOrder + "', draftOrderSavedSearches='" + draftOrderSavedSearches + "', draftOrderTag='" + draftOrderTag + "', draftOrders='" + draftOrders + "', fileSavedSearches='" + fileSavedSearches + "', files='" + files + "', fulfillment='" + fulfillment + "', fulfillmentConstraintRules='" + fulfillmentConstraintRules + "', fulfillmentOrder='" + fulfillmentOrder + "', fulfillmentOrders='" + fulfillmentOrders + "', fulfillmentService='" + fulfillmentService + "', giftCard='" + giftCard + "', giftCards='" + giftCards + "', giftCardsCount='" + giftCardsCount + "', inventoryItem='" + inventoryItem + "', inventoryItems='" + inventoryItems + "', inventoryLevel='" + inventoryLevel + "', inventoryProperties='" + inventoryProperties + "', job='" + job + "', location='" + location + "', locations='" + locations + "', locationsAvailableForDeliveryProfiles='" + locationsAvailableForDeliveryProfiles + "', locationsAvailableForDeliveryProfilesConnection='" + locationsAvailableForDeliveryProfilesConnection + "', manualHoldsFulfillmentOrders='" + manualHoldsFulfillmentOrders + "', market='" + market + "', marketByGeography='" + marketByGeography + "', marketLocalizableResource='" + marketLocalizableResource + "', marketLocalizableResources='" + marketLocalizableResources + "', marketLocalizableResourcesByIds='" + marketLocalizableResourcesByIds + "', marketingActivities='" + marketingActivities + "', marketingActivity='" + marketingActivity + "', marketingEvent='" + marketingEvent + "', marketingEvents='" + marketingEvents + "', markets='" + markets + "', metafieldDefinition='" + metafieldDefinition + "', metafieldDefinitionTypes='" + metafieldDefinitionTypes + "', metafieldDefinitions='" + metafieldDefinitions + "', metafieldStorefrontVisibilities='" + metafieldStorefrontVisibilities + "', metafieldStorefrontVisibility='" + metafieldStorefrontVisibility + "', metaobject='" + metaobject + "', metaobjectByHandle='" + metaobjectByHandle + "', metaobjectDefinition='" + metaobjectDefinition + "', metaobjectDefinitionByType='" + metaobjectDefinitionByType + "', metaobjectDefinitions='" + metaobjectDefinitions + "', metaobjects='" + metaobjects + "', node='" + node + "', nodes='" + nodes + "', order='" + order + "', orderPaymentStatus='" + orderPaymentStatus + "', orderSavedSearches='" + orderSavedSearches + "', orders='" + orders + "', paymentCustomization='" + paymentCustomization + "', paymentCustomizations='" + paymentCustomizations + "', paymentTermsTemplates='" + paymentTermsTemplates + "', priceList='" + priceList + "', priceLists='" + priceLists + "', priceRule='" + priceRule + "', priceRuleSavedSearches='" + priceRuleSavedSearches + "', priceRules='" + priceRules + "', primaryMarket='" + primaryMarket + "', privateMetafield='" + privateMetafield + "', privateMetafields='" + privateMetafields + "', product='" + product + "', productByHandle='" + productByHandle + "', productDuplicateJob='" + productDuplicateJob + "', productFeed='" + productFeed + "', productFeeds='" + productFeeds + "', productResourceFeedback='" + productResourceFeedback + "', productSavedSearches='" + productSavedSearches + "', productVariant='" + productVariant + "', productVariants='" + productVariants + "', products='" + products + "', publicApiVersions='" + publicApiVersions + "', publication='" + publication + "', publications='" + publications + "', refund='" + refund + "', return='" + _return + "', returnableFulfillment='" + returnableFulfillment + "', returnableFulfillments='" + returnableFulfillments + "', reverseDelivery='" + reverseDelivery + "', reverseFulfillmentOrder='" + reverseFulfillmentOrder + "', scriptTag='" + scriptTag + "', scriptTags='" + scriptTags + "', segment='" + segment + "', segmentCount='" + segmentCount + "', segmentFilterSuggestions='" + segmentFilterSuggestions + "', segmentFilters='" + segmentFilters + "', segmentMigrations='" + segmentMigrations + "', segmentValueSuggestions='" + segmentValueSuggestions + "', segments='" + segments + "', sellingPlanGroup='" + sellingPlanGroup + "', sellingPlanGroups='" + sellingPlanGroups + "', serverPixel='" + serverPixel + "', shop='" + shop + "', shopBillingPreferences='" + shopBillingPreferences + "', shopLocales='" + shopLocales + "', shopifyFunction='" + shopifyFunction + "', shopifyFunctions='" + shopifyFunctions + "', shopifyPaymentsAccount='" + shopifyPaymentsAccount + "', shopifyqlQuery='" + shopifyqlQuery + "', staffMember='" + staffMember + "', standardMetafieldDefinitionTemplates='" + standardMetafieldDefinitionTemplates + "', subscriptionBillingAttempt='" + subscriptionBillingAttempt + "', subscriptionBillingAttempts='" + subscriptionBillingAttempts + "', subscriptionBillingCycle='" + subscriptionBillingCycle + "', subscriptionBillingCycles='" + subscriptionBillingCycles + "', subscriptionContract='" + subscriptionContract + "', subscriptionContracts='" + subscriptionContracts + "', subscriptionDraft='" + subscriptionDraft + "', tenderTransactions='" + tenderTransactions + "', translatableResource='" + translatableResource + "', translatableResources='" + translatableResources + "', translatableResourcesByIds='" + translatableResourcesByIds + "', urlRedirect='" + urlRedirect + "', urlRedirectImport='" + urlRedirectImport + "', urlRedirectSavedSearches='" + urlRedirectSavedSearches + "', urlRedirects='" + urlRedirects + "', validation='" + validation + "', validations='" + validations + "', webPixel='" + webPixel + "', webhookSubscription='" + webhookSubscription + "', webhookSubscriptions='" + webhookSubscriptions + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueryRoot that = (QueryRoot) o;
    return Objects.equals(abandonment, that.abandonment) &&
        Objects.equals(abandonmentByAbandonedCheckoutId, that.abandonmentByAbandonedCheckoutId) &&
        Objects.equals(app, that.app) &&
        Objects.equals(appByHandle, that.appByHandle) &&
        Objects.equals(appByKey, that.appByKey) &&
        Objects.equals(appDiscountType, that.appDiscountType) &&
        Objects.equals(appDiscountTypes, that.appDiscountTypes) &&
        Objects.equals(appInstallation, that.appInstallation) &&
        Objects.equals(appInstallations, that.appInstallations) &&
        Objects.equals(automaticDiscount, that.automaticDiscount) &&
        Objects.equals(automaticDiscountNode, that.automaticDiscountNode) &&
        Objects.equals(automaticDiscountNodes, that.automaticDiscountNodes) &&
        Objects.equals(automaticDiscountSavedSearches, that.automaticDiscountSavedSearches) &&
        Objects.equals(automaticDiscounts, that.automaticDiscounts) &&
        Objects.equals(availableCarrierServices, that.availableCarrierServices) &&
        Objects.equals(availableLocales, that.availableLocales) &&
        Objects.equals(carrierService, that.carrierService) &&
        Objects.equals(cartTransforms, that.cartTransforms) &&
        Objects.equals(catalog, that.catalog) &&
        Objects.equals(catalogOperations, that.catalogOperations) &&
        Objects.equals(catalogs, that.catalogs) &&
        Objects.equals(channel, that.channel) &&
        Objects.equals(channels, that.channels) &&
        Objects.equals(checkoutBranding, that.checkoutBranding) &&
        Objects.equals(checkoutProfile, that.checkoutProfile) &&
        Objects.equals(checkoutProfiles, that.checkoutProfiles) &&
        Objects.equals(codeDiscountNode, that.codeDiscountNode) &&
        Objects.equals(codeDiscountNodeByCode, that.codeDiscountNodeByCode) &&
        Objects.equals(codeDiscountNodes, that.codeDiscountNodes) &&
        Objects.equals(codeDiscountSavedSearches, that.codeDiscountSavedSearches) &&
        Objects.equals(collection, that.collection) &&
        Objects.equals(collectionByHandle, that.collectionByHandle) &&
        Objects.equals(collectionRulesConditions, that.collectionRulesConditions) &&
        Objects.equals(collectionSavedSearches, that.collectionSavedSearches) &&
        Objects.equals(collections, that.collections) &&
        Objects.equals(companies, that.companies) &&
        Objects.equals(company, that.company) &&
        Objects.equals(companyContact, that.companyContact) &&
        Objects.equals(companyContactRole, that.companyContactRole) &&
        companyCount == that.companyCount &&
        Objects.equals(companyLocation, that.companyLocation) &&
        Objects.equals(companyLocations, that.companyLocations) &&
        Objects.equals(currentAppInstallation, that.currentAppInstallation) &&
        Objects.equals(currentBulkOperation, that.currentBulkOperation) &&
        Objects.equals(customer, that.customer) &&
        Objects.equals(customerMergeJobStatus, that.customerMergeJobStatus) &&
        Objects.equals(customerMergePreview, that.customerMergePreview) &&
        Objects.equals(customerPaymentMethod, that.customerPaymentMethod) &&
        Objects.equals(customerSegmentMembers, that.customerSegmentMembers) &&
        Objects.equals(customerSegmentMembersQuery, that.customerSegmentMembersQuery) &&
        Objects.equals(customerSegmentMembership, that.customerSegmentMembership) &&
        Objects.equals(customers, that.customers) &&
        Objects.equals(deletionEvents, that.deletionEvents) &&
        Objects.equals(deliveryCustomization, that.deliveryCustomization) &&
        Objects.equals(deliveryCustomizations, that.deliveryCustomizations) &&
        Objects.equals(deliveryProfile, that.deliveryProfile) &&
        Objects.equals(deliveryProfiles, that.deliveryProfiles) &&
        Objects.equals(deliverySettings, that.deliverySettings) &&
        discountCodeCount == that.discountCodeCount &&
        Objects.equals(discountNode, that.discountNode) &&
        Objects.equals(discountNodes, that.discountNodes) &&
        Objects.equals(discountRedeemCodeBulkCreation, that.discountRedeemCodeBulkCreation) &&
        Objects.equals(discountRedeemCodeSavedSearches, that.discountRedeemCodeSavedSearches) &&
        Objects.equals(dispute, that.dispute) &&
        Objects.equals(disputeEvidence, that.disputeEvidence) &&
        Objects.equals(domain, that.domain) &&
        Objects.equals(draftOrder, that.draftOrder) &&
        Objects.equals(draftOrderSavedSearches, that.draftOrderSavedSearches) &&
        Objects.equals(draftOrderTag, that.draftOrderTag) &&
        Objects.equals(draftOrders, that.draftOrders) &&
        Objects.equals(fileSavedSearches, that.fileSavedSearches) &&
        Objects.equals(files, that.files) &&
        Objects.equals(fulfillment, that.fulfillment) &&
        Objects.equals(fulfillmentConstraintRules, that.fulfillmentConstraintRules) &&
        Objects.equals(fulfillmentOrder, that.fulfillmentOrder) &&
        Objects.equals(fulfillmentOrders, that.fulfillmentOrders) &&
        Objects.equals(fulfillmentService, that.fulfillmentService) &&
        Objects.equals(giftCard, that.giftCard) &&
        Objects.equals(giftCards, that.giftCards) &&
        Objects.equals(giftCardsCount, that.giftCardsCount) &&
        Objects.equals(inventoryItem, that.inventoryItem) &&
        Objects.equals(inventoryItems, that.inventoryItems) &&
        Objects.equals(inventoryLevel, that.inventoryLevel) &&
        Objects.equals(inventoryProperties, that.inventoryProperties) &&
        Objects.equals(job, that.job) &&
        Objects.equals(location, that.location) &&
        Objects.equals(locations, that.locations) &&
        Objects.equals(locationsAvailableForDeliveryProfiles, that.locationsAvailableForDeliveryProfiles) &&
        Objects.equals(locationsAvailableForDeliveryProfilesConnection, that.locationsAvailableForDeliveryProfilesConnection) &&
        Objects.equals(manualHoldsFulfillmentOrders, that.manualHoldsFulfillmentOrders) &&
        Objects.equals(market, that.market) &&
        Objects.equals(marketByGeography, that.marketByGeography) &&
        Objects.equals(marketLocalizableResource, that.marketLocalizableResource) &&
        Objects.equals(marketLocalizableResources, that.marketLocalizableResources) &&
        Objects.equals(marketLocalizableResourcesByIds, that.marketLocalizableResourcesByIds) &&
        Objects.equals(marketingActivities, that.marketingActivities) &&
        Objects.equals(marketingActivity, that.marketingActivity) &&
        Objects.equals(marketingEvent, that.marketingEvent) &&
        Objects.equals(marketingEvents, that.marketingEvents) &&
        Objects.equals(markets, that.markets) &&
        Objects.equals(metafieldDefinition, that.metafieldDefinition) &&
        Objects.equals(metafieldDefinitionTypes, that.metafieldDefinitionTypes) &&
        Objects.equals(metafieldDefinitions, that.metafieldDefinitions) &&
        Objects.equals(metafieldStorefrontVisibilities, that.metafieldStorefrontVisibilities) &&
        Objects.equals(metafieldStorefrontVisibility, that.metafieldStorefrontVisibility) &&
        Objects.equals(metaobject, that.metaobject) &&
        Objects.equals(metaobjectByHandle, that.metaobjectByHandle) &&
        Objects.equals(metaobjectDefinition, that.metaobjectDefinition) &&
        Objects.equals(metaobjectDefinitionByType, that.metaobjectDefinitionByType) &&
        Objects.equals(metaobjectDefinitions, that.metaobjectDefinitions) &&
        Objects.equals(metaobjects, that.metaobjects) &&
        Objects.equals(node, that.node) &&
        Objects.equals(nodes, that.nodes) &&
        Objects.equals(order, that.order) &&
        Objects.equals(orderPaymentStatus, that.orderPaymentStatus) &&
        Objects.equals(orderSavedSearches, that.orderSavedSearches) &&
        Objects.equals(orders, that.orders) &&
        Objects.equals(paymentCustomization, that.paymentCustomization) &&
        Objects.equals(paymentCustomizations, that.paymentCustomizations) &&
        Objects.equals(paymentTermsTemplates, that.paymentTermsTemplates) &&
        Objects.equals(priceList, that.priceList) &&
        Objects.equals(priceLists, that.priceLists) &&
        Objects.equals(priceRule, that.priceRule) &&
        Objects.equals(priceRuleSavedSearches, that.priceRuleSavedSearches) &&
        Objects.equals(priceRules, that.priceRules) &&
        Objects.equals(primaryMarket, that.primaryMarket) &&
        Objects.equals(privateMetafield, that.privateMetafield) &&
        Objects.equals(privateMetafields, that.privateMetafields) &&
        Objects.equals(product, that.product) &&
        Objects.equals(productByHandle, that.productByHandle) &&
        Objects.equals(productDuplicateJob, that.productDuplicateJob) &&
        Objects.equals(productFeed, that.productFeed) &&
        Objects.equals(productFeeds, that.productFeeds) &&
        Objects.equals(productResourceFeedback, that.productResourceFeedback) &&
        Objects.equals(productSavedSearches, that.productSavedSearches) &&
        Objects.equals(productVariant, that.productVariant) &&
        Objects.equals(productVariants, that.productVariants) &&
        Objects.equals(products, that.products) &&
        Objects.equals(publicApiVersions, that.publicApiVersions) &&
        Objects.equals(publication, that.publication) &&
        Objects.equals(publications, that.publications) &&
        Objects.equals(refund, that.refund) &&
        Objects.equals(_return, that._return) &&
        Objects.equals(returnableFulfillment, that.returnableFulfillment) &&
        Objects.equals(returnableFulfillments, that.returnableFulfillments) &&
        Objects.equals(reverseDelivery, that.reverseDelivery) &&
        Objects.equals(reverseFulfillmentOrder, that.reverseFulfillmentOrder) &&
        Objects.equals(scriptTag, that.scriptTag) &&
        Objects.equals(scriptTags, that.scriptTags) &&
        Objects.equals(segment, that.segment) &&
        segmentCount == that.segmentCount &&
        Objects.equals(segmentFilterSuggestions, that.segmentFilterSuggestions) &&
        Objects.equals(segmentFilters, that.segmentFilters) &&
        Objects.equals(segmentMigrations, that.segmentMigrations) &&
        Objects.equals(segmentValueSuggestions, that.segmentValueSuggestions) &&
        Objects.equals(segments, that.segments) &&
        Objects.equals(sellingPlanGroup, that.sellingPlanGroup) &&
        Objects.equals(sellingPlanGroups, that.sellingPlanGroups) &&
        Objects.equals(serverPixel, that.serverPixel) &&
        Objects.equals(shop, that.shop) &&
        Objects.equals(shopBillingPreferences, that.shopBillingPreferences) &&
        Objects.equals(shopLocales, that.shopLocales) &&
        Objects.equals(shopifyFunction, that.shopifyFunction) &&
        Objects.equals(shopifyFunctions, that.shopifyFunctions) &&
        Objects.equals(shopifyPaymentsAccount, that.shopifyPaymentsAccount) &&
        Objects.equals(shopifyqlQuery, that.shopifyqlQuery) &&
        Objects.equals(staffMember, that.staffMember) &&
        Objects.equals(standardMetafieldDefinitionTemplates, that.standardMetafieldDefinitionTemplates) &&
        Objects.equals(subscriptionBillingAttempt, that.subscriptionBillingAttempt) &&
        Objects.equals(subscriptionBillingAttempts, that.subscriptionBillingAttempts) &&
        Objects.equals(subscriptionBillingCycle, that.subscriptionBillingCycle) &&
        Objects.equals(subscriptionBillingCycles, that.subscriptionBillingCycles) &&
        Objects.equals(subscriptionContract, that.subscriptionContract) &&
        Objects.equals(subscriptionContracts, that.subscriptionContracts) &&
        Objects.equals(subscriptionDraft, that.subscriptionDraft) &&
        Objects.equals(tenderTransactions, that.tenderTransactions) &&
        Objects.equals(translatableResource, that.translatableResource) &&
        Objects.equals(translatableResources, that.translatableResources) &&
        Objects.equals(translatableResourcesByIds, that.translatableResourcesByIds) &&
        Objects.equals(urlRedirect, that.urlRedirect) &&
        Objects.equals(urlRedirectImport, that.urlRedirectImport) &&
        Objects.equals(urlRedirectSavedSearches, that.urlRedirectSavedSearches) &&
        Objects.equals(urlRedirects, that.urlRedirects) &&
        Objects.equals(validation, that.validation) &&
        Objects.equals(validations, that.validations) &&
        Objects.equals(webPixel, that.webPixel) &&
        Objects.equals(webhookSubscription, that.webhookSubscription) &&
        Objects.equals(webhookSubscriptions, that.webhookSubscriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abandonment, abandonmentByAbandonedCheckoutId, app, appByHandle, appByKey, appDiscountType, appDiscountTypes, appInstallation, appInstallations, automaticDiscount, automaticDiscountNode, automaticDiscountNodes, automaticDiscountSavedSearches, automaticDiscounts, availableCarrierServices, availableLocales, carrierService, cartTransforms, catalog, catalogOperations, catalogs, channel, channels, checkoutBranding, checkoutProfile, checkoutProfiles, codeDiscountNode, codeDiscountNodeByCode, codeDiscountNodes, codeDiscountSavedSearches, collection, collectionByHandle, collectionRulesConditions, collectionSavedSearches, collections, companies, company, companyContact, companyContactRole, companyCount, companyLocation, companyLocations, currentAppInstallation, currentBulkOperation, customer, customerMergeJobStatus, customerMergePreview, customerPaymentMethod, customerSegmentMembers, customerSegmentMembersQuery, customerSegmentMembership, customers, deletionEvents, deliveryCustomization, deliveryCustomizations, deliveryProfile, deliveryProfiles, deliverySettings, discountCodeCount, discountNode, discountNodes, discountRedeemCodeBulkCreation, discountRedeemCodeSavedSearches, dispute, disputeEvidence, domain, draftOrder, draftOrderSavedSearches, draftOrderTag, draftOrders, fileSavedSearches, files, fulfillment, fulfillmentConstraintRules, fulfillmentOrder, fulfillmentOrders, fulfillmentService, giftCard, giftCards, giftCardsCount, inventoryItem, inventoryItems, inventoryLevel, inventoryProperties, job, location, locations, locationsAvailableForDeliveryProfiles, locationsAvailableForDeliveryProfilesConnection, manualHoldsFulfillmentOrders, market, marketByGeography, marketLocalizableResource, marketLocalizableResources, marketLocalizableResourcesByIds, marketingActivities, marketingActivity, marketingEvent, marketingEvents, markets, metafieldDefinition, metafieldDefinitionTypes, metafieldDefinitions, metafieldStorefrontVisibilities, metafieldStorefrontVisibility, metaobject, metaobjectByHandle, metaobjectDefinition, metaobjectDefinitionByType, metaobjectDefinitions, metaobjects, node, nodes, order, orderPaymentStatus, orderSavedSearches, orders, paymentCustomization, paymentCustomizations, paymentTermsTemplates, priceList, priceLists, priceRule, priceRuleSavedSearches, priceRules, primaryMarket, privateMetafield, privateMetafields, product, productByHandle, productDuplicateJob, productFeed, productFeeds, productResourceFeedback, productSavedSearches, productVariant, productVariants, products, publicApiVersions, publication, publications, refund, _return, returnableFulfillment, returnableFulfillments, reverseDelivery, reverseFulfillmentOrder, scriptTag, scriptTags, segment, segmentCount, segmentFilterSuggestions, segmentFilters, segmentMigrations, segmentValueSuggestions, segments, sellingPlanGroup, sellingPlanGroups, serverPixel, shop, shopBillingPreferences, shopLocales, shopifyFunction, shopifyFunctions, shopifyPaymentsAccount, shopifyqlQuery, staffMember, standardMetafieldDefinitionTemplates, subscriptionBillingAttempt, subscriptionBillingAttempts, subscriptionBillingCycle, subscriptionBillingCycles, subscriptionContract, subscriptionContracts, subscriptionDraft, tenderTransactions, translatableResource, translatableResources, translatableResourcesByIds, urlRedirect, urlRedirectImport, urlRedirectSavedSearches, urlRedirects, validation, validations, webPixel, webhookSubscription, webhookSubscriptions);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Returns an abandonment by ID.
     */
    private Abandonment abandonment;

    /**
     * Returns an Abandonment by the Abandoned Checkout ID.
     */
    private Abandonment abandonmentByAbandonedCheckoutId;

    /**
     * Lookup an App by ID or return the currently authenticated App.
     */
    private App app;

    /**
     * Fetches app by handle.
     * Returns null if the app doesn't exist.
     */
    private App appByHandle;

    /**
     * Fetches an app by its client ID.
     * Returns null if the app doesn't exist.
     */
    private App appByKey;

    /**
     * An app discount type.
     */
    private AppDiscountType appDiscountType;

    /**
     * A list of app discount types installed by apps.
     */
    private List<AppDiscountType> appDiscountTypes;

    /**
     * Lookup an AppInstallation by ID or return the AppInstallation for the currently authenticated App.
     */
    private AppInstallation appInstallation;

    /**
     * A list of app installations. To use this query, you need to contact [Shopify
     * Support](https://partners.shopify.com/current/support/) to grant your custom
     * app the `read_apps` access scope. Public apps can't be granted this access scope.
     */
    private AppInstallationConnection appInstallations;

    /**
     * Returns an automatic discount resource by ID.
     */
    private DiscountAutomatic automaticDiscount;

    /**
     * Returns an automatic discount resource by ID.
     */
    private DiscountAutomaticNode automaticDiscountNode;

    /**
     * List of automatic discounts.
     */
    private DiscountAutomaticNodeConnection automaticDiscountNodes;

    /**
     * List of the shop's automatic discount saved searches.
     */
    private SavedSearchConnection automaticDiscountSavedSearches;

    /**
     * List of automatic discounts.
     */
    private DiscountAutomaticConnection automaticDiscounts;

    /**
     * Returns a list of activated carrier services and associated shop locations that support them.
     */
    private List<DeliveryCarrierServiceAndLocations> availableCarrierServices;

    /**
     * A list of available locales.
     */
    private List<Locale> availableLocales;

    /**
     * Returns a `DeliveryCarrierService` object by ID.
     */
    private DeliveryCarrierService carrierService;

    /**
     * List of Cart transform objects owned by the current API client.
     */
    private CartTransformConnection cartTransforms;

    /**
     * Returns a Catalog resource by ID.
     */
    private Catalog catalog;

    /**
     * Returns the most recent catalog operations for the shop.
     */
    private List<ResourceOperation> catalogOperations;

    /**
     * The catalogs belonging to the shop.
     */
    private CatalogConnection catalogs;

    /**
     * Lookup a channel by ID.
     */
    private Channel channel;

    /**
     * List of the active sales channels.
     */
    private ChannelConnection channels;

    /**
     * Returns the visual customizations for checkout for a given checkout profile.
     *   
     * To learn more about updating checkout branding settings, refer to the
     * [checkoutBrandingUpsert](https://shopify.dev/api/admin-graphql/unstable/mutations/checkoutBrandingUpsert)
     * mutation and the checkout branding [tutorial](https://shopify.dev/docs/apps/checkout/styling).
     */
    private CheckoutBranding checkoutBranding;

    /**
     * A checkout profile on a shop.
     */
    private CheckoutProfile checkoutProfile;

    /**
     * List of checkout profiles on a shop.
     */
    private CheckoutProfileConnection checkoutProfiles;

    /**
     * Returns a [code discount](https://help.shopify.com/manual/discounts/discount-types#discount-codes) resource by ID.
     */
    private DiscountCodeNode codeDiscountNode;

    /**
     * Returns a code discount identified by its discount code.
     */
    private DiscountCodeNode codeDiscountNodeByCode;

    /**
     * Returns a list of [code-based discounts](https://help.shopify.com/manual/discounts/discount-types#discount-codes).
     */
    private DiscountCodeNodeConnection codeDiscountNodes;

    /**
     * List of the shop's code discount saved searches.
     */
    private SavedSearchConnection codeDiscountSavedSearches;

    /**
     * Returns a Collection resource by ID.
     */
    private Collection collection;

    /**
     * Return a collection by its handle.
     */
    private Collection collectionByHandle;

    /**
     * Lists all rules that can be used to create smart collections.
     */
    private List<CollectionRuleConditions> collectionRulesConditions;

    /**
     * Returns a list of the shop's collection saved searches.
     */
    private SavedSearchConnection collectionSavedSearches;

    /**
     * Returns a list of collections.
     */
    private CollectionConnection collections;

    /**
     * Returns the list of companies in the shop.
     */
    private CompanyConnection companies;

    /**
     * Returns a `Company` object by ID.
     */
    private Company company;

    /**
     * Returns a `CompanyContact` object by ID.
     */
    private CompanyContact companyContact;

    /**
     * Returns a `CompanyContactRole` object by ID.
     */
    private CompanyContactRole companyContactRole;

    /**
     * The number of companies for a shop.
     */
    private int companyCount;

    /**
     * Returns a `CompanyLocation` object by ID.
     */
    private CompanyLocation companyLocation;

    /**
     * Returns the list of company locations in the shop.
     */
    private CompanyLocationConnection companyLocations;

    /**
     * Return the AppInstallation for the currently authenticated App.
     */
    private AppInstallation currentAppInstallation;

    /**
     * Returns the current app's most recent BulkOperation. Apps can run one bulk
     * query and one bulk mutation operation at a time, by shop.
     */
    private BulkOperation currentBulkOperation;

    /**
     * Returns a Customer resource by ID.
     */
    private Customer customer;

    /**
     * Returns the status of a customer merge request job.
     */
    private CustomerMergeRequest customerMergeJobStatus;

    /**
     * Returns a preview of a customer merge request.
     */
    private CustomerMergePreview customerMergePreview;

    /**
     * Returns a CustomerPaymentMethod resource by its ID.
     */
    private CustomerPaymentMethod customerPaymentMethod;

    /**
     * The list of members, such as customers, that's associated with an individual segment.
     * The maximum page size is 1000.
     */
    private CustomerSegmentMemberConnection customerSegmentMembers;

    /**
     * Returns a segment members query resource by ID.
     */
    private CustomerSegmentMembersQuery customerSegmentMembersQuery;

    /**
     * Whether a member, which is a customer, belongs to a segment.
     */
    private SegmentMembershipResponse customerSegmentMembership;

    /**
     * Returns a list of customers.
     */
    private CustomerConnection customers;

    /**
     * The paginated list of deletion events.
     */
    private DeletionEventConnection deletionEvents;

    /**
     * The delivery customization.
     */
    private DeliveryCustomization deliveryCustomization;

    /**
     * The delivery customizations.
     */
    private DeliveryCustomizationConnection deliveryCustomizations;

    /**
     * Returns a Delivery Profile resource by ID.
     */
    private DeliveryProfile deliveryProfile;

    /**
     * Returns a list of saved delivery profiles.
     */
    private DeliveryProfileConnection deliveryProfiles;

    /**
     * Returns the shop-wide shipping settings.
     */
    private DeliverySetting deliverySettings;

    /**
     * The total number of discount codes for the shop.
     */
    private int discountCodeCount;

    /**
     * Returns a discount resource by ID.
     */
    private DiscountNode discountNode;

    /**
     * Returns a list of discounts.
     */
    private DiscountNodeConnection discountNodes;

    /**
     * Returns a bulk code creation resource by ID.
     */
    private DiscountRedeemCodeBulkCreation discountRedeemCodeBulkCreation;

    /**
     * List of the shop's redeemed discount code saved searches.
     */
    private SavedSearchConnection discountRedeemCodeSavedSearches;

    /**
     * Returns dispute details based on ID.
     */
    private ShopifyPaymentsDispute dispute;

    /**
     * Returns dispute evidence details based on ID.
     */
    private ShopifyPaymentsDisputeEvidence disputeEvidence;

    /**
     * Lookup a Domain by ID.
     */
    private Domain domain;

    /**
     * Returns a DraftOrder resource by ID.
     */
    private DraftOrder draftOrder;

    /**
     * List of the shop's draft order saved searches.
     */
    private SavedSearchConnection draftOrderSavedSearches;

    /**
     * Returns a DraftOrderTag resource by ID.
     */
    private DraftOrderTag draftOrderTag;

    /**
     * List of saved draft orders.
     */
    private DraftOrderConnection draftOrders;

    /**
     * A list of the shop's file saved searches.
     */
    private SavedSearchConnection fileSavedSearches;

    /**
     * Returns a paginated list of files that have been uploaded to Shopify.
     */
    private FileConnection files;

    /**
     * Returns a Fulfillment resource by ID.
     */
    private Fulfillment fulfillment;

    /**
     * The fulfillment constraint rules that belong to a shop.
     */
    private List<FulfillmentConstraintRule> fulfillmentConstraintRules;

    /**
     * Returns a Fulfillment order resource by ID.
     */
    private FulfillmentOrder fulfillmentOrder;

    /**
     * The paginated list of all fulfillment orders.
     * The returned fulfillment orders are filtered according to the
     * [fulfillment order access scopes](https://shopify.dev/api/admin-graphql/latest/objects/fulfillmentorder#api-access-scopes)
     * granted to the app.
     *   
     * Use this query to retrieve fulfillment orders assigned to merchant-managed locations,
     * third-party fulfillment service locations, or all kinds of locations together.
     *   
     * For fetching only the fulfillment orders assigned to the app's locations, use the
     * [assignedFulfillmentOrders](https://shopify.dev/api/admin-graphql/2024-07/objects/queryroot#connection-assignedfulfillmentorders)
     * connection.
     */
    private FulfillmentOrderConnection fulfillmentOrders;

    /**
     * Returns a FulfillmentService resource by ID.
     */
    private FulfillmentService fulfillmentService;

    /**
     * Returns a gift card resource by ID.
     */
    private GiftCard giftCard;

    /**
     * Returns a list of gift cards.
     */
    private GiftCardConnection giftCards;

    /**
     * The total number of gift cards issued for the shop.
     */
    private String giftCardsCount;

    /**
     * Returns an
     * [InventoryItem](https://shopify.dev/docs/api/admin-graphql/latest/objects/InventoryItem)
     * object by ID.
     */
    private InventoryItem inventoryItem;

    /**
     * Returns a list of inventory items.
     */
    private InventoryItemConnection inventoryItems;

    /**
     * Returns an
     * [InventoryLevel](https://shopify.dev/docs/api/admin-graphql/latest/objects/InventoryLevel)
     * object by ID.
     */
    private InventoryLevel inventoryLevel;

    /**
     * General inventory properties for the shop.
     */
    private InventoryProperties inventoryProperties;

    /**
     * Returns a Job resource by ID. Used to check the status of internal jobs and any applicable changes.
     */
    private Job job;

    /**
     * Returns an inventory Location resource by ID.
     */
    private Location location;

    /**
     * Returns a list of active inventory locations.
     */
    private LocationConnection locations;

    /**
     * Returns a list of all origin locations available for a delivery profile.
     */
    private List<Location> locationsAvailableForDeliveryProfiles;

    /**
     * Returns a list of all origin locations available for a delivery profile.
     */
    private LocationConnection locationsAvailableForDeliveryProfilesConnection;

    /**
     * Returns a list of fulfillment orders that are on hold.
     */
    private FulfillmentOrderConnection manualHoldsFulfillmentOrders;

    /**
     * Returns a market resource by ID.
     */
    private Market market;

    /**
     * Returns the applicable market for a customer based on where they are in the world.
     */
    private Market marketByGeography;

    /**
     * A resource that can have localized values for different markets.
     */
    private MarketLocalizableResource marketLocalizableResource;

    /**
     * Resources that can have localized values for different markets.
     */
    private MarketLocalizableResourceConnection marketLocalizableResources;

    /**
     * Resources that can have localized values for different markets.
     */
    private MarketLocalizableResourceConnection marketLocalizableResourcesByIds;

    /**
     * A list of marketing activities associated with the marketing app.
     */
    private MarketingActivityConnection marketingActivities;

    /**
     * Returns a MarketingActivity resource by ID.
     */
    private MarketingActivity marketingActivity;

    /**
     * Returns a MarketingEvent resource by ID.
     */
    private MarketingEvent marketingEvent;

    /**
     * A list of marketing events associated with the marketing app.
     */
    private MarketingEventConnection marketingEvents;

    /**
     * The markets configured for the shop.
     */
    private MarketConnection markets;

    /**
     * Returns a metafield definition by identifier.
     */
    private MetafieldDefinition metafieldDefinition;

    /**
     * Each metafield definition has a type, which defines the type of information that it can store.
     * This type is enforced across every instance of the resource that owns the metafield definition.
     *   
     * Refer to the [list of supported metafield types](https://shopify.dev/apps/metafields/types).
     */
    private List<MetafieldDefinitionType> metafieldDefinitionTypes;

    /**
     * Returns a list of metafield definitions.
     */
    private MetafieldDefinitionConnection metafieldDefinitions;

    /**
     * List of the `MetafieldStorefrontVisibility` records.
     */
    private MetafieldStorefrontVisibilityConnection metafieldStorefrontVisibilities;

    /**
     * Returns a `MetafieldStorefrontVisibility` record by ID. A `MetafieldStorefrontVisibility` record lists the
     * metafields to make visible in the Storefront API.
     */
    private MetafieldStorefrontVisibility metafieldStorefrontVisibility;

    /**
     * Retrieves a metaobject by ID.
     */
    private Metaobject metaobject;

    /**
     * Retrieves a metaobject by handle.
     */
    private Metaobject metaobjectByHandle;

    /**
     * Retrieves a metaobject definition by ID.
     */
    private MetaobjectDefinition metaobjectDefinition;

    /**
     * Finds a metaobject definition by type.
     */
    private MetaobjectDefinition metaobjectDefinitionByType;

    /**
     * All metaobject definitions.
     */
    private MetaobjectDefinitionConnection metaobjectDefinitions;

    /**
     * All metaobjects for the shop.
     */
    private MetaobjectConnection metaobjects;

    /**
     * Returns a specific node (any object that implements the
     * [Node](https://shopify.dev/api/admin-graphql/latest/interfaces/Node)
     * interface) by ID, in accordance with the
     * [Relay specification](https://relay.dev/docs/guides/graphql-server-specification/#object-identification).
     * This field is commonly used for refetching an object.
     */
    private Node node;

    /**
     * Returns the list of nodes (any objects that implement the
     * [Node](https://shopify.dev/api/admin-graphql/latest/interfaces/Node)
     * interface) with the given IDs, in accordance with the
     * [Relay specification](https://relay.dev/docs/guides/graphql-server-specification/#object-identification).
     */
    private List<Node> nodes;

    /**
     * Returns an Order resource by ID.
     */
    private Order order;

    /**
     * Returns a payment status by payment reference ID. Used to check the status of a deferred payment.
     */
    private OrderPaymentStatus orderPaymentStatus;

    /**
     * List of the shop's order saved searches.
     */
    private SavedSearchConnection orderSavedSearches;

    /**
     * Returns a list of orders placed in the store.
     */
    private OrderConnection orders;

    /**
     * The payment customization.
     */
    private PaymentCustomization paymentCustomization;

    /**
     * The payment customizations.
     */
    private PaymentCustomizationConnection paymentCustomizations;

    /**
     * The list of payment terms templates eligible for all shops and users.
     */
    private List<PaymentTermsTemplate> paymentTermsTemplates;

    /**
     * Returns a price list resource by ID.
     */
    private PriceList priceList;

    /**
     * All price lists for a shop.
     */
    private PriceListConnection priceLists;

    /**
     * Returns a code price rule resource by ID.
     */
    private PriceRule priceRule;

    /**
     * List of the shop's price rule saved searches.
     */
    private SavedSearchConnection priceRuleSavedSearches;

    /**
     * Returns a list of price rule resources that have at least one associated discount code.
     */
    private PriceRuleConnection priceRules;

    /**
     * The primary market of the shop.
     */
    private Market primaryMarket;

    /**
     * Returns a private metafield by ID.
     * Private metafields are accessible only by the application that created them.
     */
    private PrivateMetafield privateMetafield;

    /**
     * Returns a list of private metafields associated to a resource.
     */
    private PrivateMetafieldConnection privateMetafields;

    /**
     * Returns a Product resource by ID.
     */
    private Product product;

    /**
     * Return a product by its handle.
     */
    private Product productByHandle;

    /**
     * Returns the product duplicate job.
     */
    private ProductDuplicateJob productDuplicateJob;

    /**
     * Returns a ProductFeed resource by ID.
     */
    private ProductFeed productFeed;

    /**
     * The product feeds for the shop.
     */
    private ProductFeedConnection productFeeds;

    /**
     * Returns the product resource feedback for the currently authenticated app.
     */
    private ProductResourceFeedback productResourceFeedback;

    /**
     * Returns a list of the shop's product saved searches.
     */
    private SavedSearchConnection productSavedSearches;

    /**
     * Returns a ProductVariant resource by ID.
     */
    private ProductVariant productVariant;

    /**
     * Returns a list of product variants.
     */
    private ProductVariantConnection productVariants;

    /**
     * Returns a list of products.
     */
    private ProductConnection products;

    /**
     * The list of publicly-accessible Admin API versions, including supported
     * versions, the release candidate, and unstable versions.
     */
    private List<ApiVersion> publicApiVersions;

    /**
     * Lookup a publication by ID.
     */
    private Publication publication;

    /**
     * List of publications.
     */
    private PublicationConnection publications;

    /**
     * Returns a Refund resource by ID.
     */
    private Refund refund;

    /**
     * Returns a Return resource by ID.
     */
    private Return _return;

    /**
     * Lookup a returnable fulfillment by ID.
     */
    private ReturnableFulfillment returnableFulfillment;

    /**
     * List of returnable fulfillments.
     */
    private ReturnableFulfillmentConnection returnableFulfillments;

    /**
     * Lookup a reverse delivery by ID.
     */
    private ReverseDelivery reverseDelivery;

    /**
     * Lookup a reverse fulfillment order by ID.
     */
    private ReverseFulfillmentOrder reverseFulfillmentOrder;

    /**
     * <div class="note"><h4>Theme app extensions</h4>
     *   <p>Your app might not pass App Store review if it uses script tags instead of
     * theme app extensions. All new apps, and apps that integrate with Online Store
     * 2.0 themes, should use theme app extensions, such as app blocks or app embed
     * blocks. Script tags are an alternative you can use with only vintage themes.
     * <a href="/apps/online-store#what-integration-method-should-i-use"
     * target="_blank">Learn more</a>.</p></div>
     *   
     * <div class="note"><h4>Script tag deprecation</h4>
     *   <p>Script tags will be sunset for the <b>Order status</b> page on August 28, 2025. <a href="https://www.shopify.com/plus/upgrading-to-checkout-extensibility">Upgrade
     * to Checkout Extensibility</a> before this date. <a
     * href="/docs/api/liquid/objects#script">Shopify Scripts</a> will continue to
     * work alongside Checkout Extensibility until August 28, 2025.</p></div>
     *   
     *   
     * Lookup a script tag resource by ID.
     */
    private ScriptTag scriptTag;

    /**
     * <div class="note"><h4>Theme app extensions</h4>
     *   <p>Your app might not pass App Store review if it uses script tags instead of
     * theme app extensions. All new apps, and apps that integrate with Online Store
     * 2.0 themes, should use theme app extensions, such as app blocks or app embed
     * blocks. Script tags are an alternative you can use with only vintage themes.
     * <a href="/apps/online-store#what-integration-method-should-i-use"
     * target="_blank">Learn more</a>.</p></div>
     *   
     * <div class="note"><h4>Script tag deprecation</h4>
     *   <p>Script tags will be sunset for the <b>Order status</b> page on August 28, 2025. <a href="https://www.shopify.com/plus/upgrading-to-checkout-extensibility">Upgrade
     * to Checkout Extensibility</a> before this date. <a
     * href="/docs/api/liquid/objects#script">Shopify Scripts</a> will continue to
     * work alongside Checkout Extensibility until August 28, 2025.</p></div>
     *   
     *   
     * A list of script tags.
     */
    private ScriptTagConnection scriptTags;

    /**
     * The Customer Segment.
     */
    private Segment segment;

    /**
     * The number of segments for a shop.
     */
    private int segmentCount;

    /**
     * A list of filter suggestions associated with a segment. A segment is a group
     * of members (commonly customers) that meet specific criteria.
     */
    private SegmentFilterConnection segmentFilterSuggestions;

    /**
     * A list of filters.
     */
    private SegmentFilterConnection segmentFilters;

    /**
     * A list of a shop's segment migrations.
     */
    private SegmentMigrationConnection segmentMigrations;

    /**
     * The list of suggested values corresponding to a particular filter for a
     * segment. A segment is a group of members, such as customers, that meet
     * specific criteria.
     */
    private SegmentValueConnection segmentValueSuggestions;

    /**
     * A list of a shop's segments.
     */
    private SegmentConnection segments;

    /**
     * Returns a Selling Plan Group resource by ID.
     */
    private SellingPlanGroup sellingPlanGroup;

    /**
     * List Selling Plan Groups.
     */
    private SellingPlanGroupConnection sellingPlanGroups;

    /**
     * The server pixel configured by the app.
     */
    private ServerPixel serverPixel;

    /**
     * Returns the Shop resource corresponding to the access token used in the request. The Shop resource contains
     * business and store management settings for the shop.
     */
    private Shop shop;

    /**
     * The shop's billing preferences.
     */
    private ShopBillingPreferences shopBillingPreferences;

    /**
     * A list of locales available on a shop.
     */
    private List<ShopLocale> shopLocales;

    /**
     * The Shopify Function.
     */
    private ShopifyFunction shopifyFunction;

    /**
     * Returns the Shopify Functions for apps installed on the shop.
     */
    private ShopifyFunctionConnection shopifyFunctions;

    /**
     * Shopify Payments account information, including balances and payouts.
     */
    private ShopifyPaymentsAccount shopifyPaymentsAccount;

    /**
     * Returns the results of a ShopifyQL query. Refer to the [ShopifyQL
     * documentation](https://shopify.dev/api/shopifyql) for more information.
     */
    private ShopifyqlResponse shopifyqlQuery;

    /**
     * The StaffMember resource, by ID.
     */
    private StaffMember staffMember;

    /**
     * Standard metafield definitions are intended for specific, common use cases.
     * Their namespace and keys reflect these use cases and are reserved.
     *   
     * Refer to all available [`Standard Metafield Definition Templates`](https://shopify.dev/api/admin-graphql/latest/objects/StandardMetafieldDefinitionTemplate).
     */
    private StandardMetafieldDefinitionTemplateConnection standardMetafieldDefinitionTemplates;

    /**
     * Returns a SubscriptionBillingAttempt by ID.
     */
    private SubscriptionBillingAttempt subscriptionBillingAttempt;

    /**
     * Returns subscription billing attempts on a store.
     */
    private SubscriptionBillingAttemptConnection subscriptionBillingAttempts;

    /**
     * Returns a subscription billing cycle found either by cycle index or date.
     */
    private SubscriptionBillingCycle subscriptionBillingCycle;

    /**
     * Returns subscription billing cycles for a contract ID.
     */
    private SubscriptionBillingCycleConnection subscriptionBillingCycles;

    /**
     * Returns a Subscription Contract resource by ID.
     */
    private SubscriptionContract subscriptionContract;

    /**
     * List Subscription Contracts.
     */
    private SubscriptionContractConnection subscriptionContracts;

    /**
     * Returns a Subscription Draft resource by ID.
     */
    private SubscriptionDraft subscriptionDraft;

    /**
     * Returns a list of TenderTransactions associated with the shop.
     */
    private TenderTransactionConnection tenderTransactions;

    /**
     * A resource that can have localized values for different languages.
     */
    private TranslatableResource translatableResource;

    /**
     * Resources that can have localized values for different languages.
     */
    private TranslatableResourceConnection translatableResources;

    /**
     * Resources that can have localized values for different languages.
     */
    private TranslatableResourceConnection translatableResourcesByIds;

    /**
     * Returns a redirect resource by ID.
     */
    private UrlRedirect urlRedirect;

    /**
     * Returns a redirect import resource by ID.
     */
    private UrlRedirectImport urlRedirectImport;

    /**
     * A list of the shop's URL redirect saved searches.
     */
    private SavedSearchConnection urlRedirectSavedSearches;

    /**
     * A list of redirects for a shop.
     */
    private UrlRedirectConnection urlRedirects;

    /**
     * Validation available on the shop.
     */
    private Validation validation;

    /**
     * Validations available on the shop.
     */
    private ValidationConnection validations;

    /**
     * The web pixel configured by the app.
     */
    private WebPixel webPixel;

    /**
     * Returns a webhook subscription by ID.
     *   
     * Building an app? If you only use app-specific webhooks, you won't need this.
     * App-specific webhook subscriptions specified in your `shopify.app.toml` may be
     * easier. They are automatically kept up to date by Shopify & require less
     * maintenance. Please read [About managing webhook
     * subscriptions](https://shopify.dev/docs/apps/build/webhooks/subscribe).
     */
    private WebhookSubscription webhookSubscription;

    /**
     * Returns a list of webhook subscriptions.
     *   
     * Building an app? If you only use app-specific webhooks, you won't need this.
     * App-specific webhook subscriptions specified in your `shopify.app.toml` may be
     * easier. They are automatically kept up to date by Shopify & require less
     * maintenance. Please read [About managing webhook
     * subscriptions](https://shopify.dev/docs/apps/build/webhooks/subscribe).
     */
    private WebhookSubscriptionConnection webhookSubscriptions;

    public QueryRoot build() {
      QueryRoot result = new QueryRoot();
      result.abandonment = this.abandonment;
      result.abandonmentByAbandonedCheckoutId = this.abandonmentByAbandonedCheckoutId;
      result.app = this.app;
      result.appByHandle = this.appByHandle;
      result.appByKey = this.appByKey;
      result.appDiscountType = this.appDiscountType;
      result.appDiscountTypes = this.appDiscountTypes;
      result.appInstallation = this.appInstallation;
      result.appInstallations = this.appInstallations;
      result.automaticDiscount = this.automaticDiscount;
      result.automaticDiscountNode = this.automaticDiscountNode;
      result.automaticDiscountNodes = this.automaticDiscountNodes;
      result.automaticDiscountSavedSearches = this.automaticDiscountSavedSearches;
      result.automaticDiscounts = this.automaticDiscounts;
      result.availableCarrierServices = this.availableCarrierServices;
      result.availableLocales = this.availableLocales;
      result.carrierService = this.carrierService;
      result.cartTransforms = this.cartTransforms;
      result.catalog = this.catalog;
      result.catalogOperations = this.catalogOperations;
      result.catalogs = this.catalogs;
      result.channel = this.channel;
      result.channels = this.channels;
      result.checkoutBranding = this.checkoutBranding;
      result.checkoutProfile = this.checkoutProfile;
      result.checkoutProfiles = this.checkoutProfiles;
      result.codeDiscountNode = this.codeDiscountNode;
      result.codeDiscountNodeByCode = this.codeDiscountNodeByCode;
      result.codeDiscountNodes = this.codeDiscountNodes;
      result.codeDiscountSavedSearches = this.codeDiscountSavedSearches;
      result.collection = this.collection;
      result.collectionByHandle = this.collectionByHandle;
      result.collectionRulesConditions = this.collectionRulesConditions;
      result.collectionSavedSearches = this.collectionSavedSearches;
      result.collections = this.collections;
      result.companies = this.companies;
      result.company = this.company;
      result.companyContact = this.companyContact;
      result.companyContactRole = this.companyContactRole;
      result.companyCount = this.companyCount;
      result.companyLocation = this.companyLocation;
      result.companyLocations = this.companyLocations;
      result.currentAppInstallation = this.currentAppInstallation;
      result.currentBulkOperation = this.currentBulkOperation;
      result.customer = this.customer;
      result.customerMergeJobStatus = this.customerMergeJobStatus;
      result.customerMergePreview = this.customerMergePreview;
      result.customerPaymentMethod = this.customerPaymentMethod;
      result.customerSegmentMembers = this.customerSegmentMembers;
      result.customerSegmentMembersQuery = this.customerSegmentMembersQuery;
      result.customerSegmentMembership = this.customerSegmentMembership;
      result.customers = this.customers;
      result.deletionEvents = this.deletionEvents;
      result.deliveryCustomization = this.deliveryCustomization;
      result.deliveryCustomizations = this.deliveryCustomizations;
      result.deliveryProfile = this.deliveryProfile;
      result.deliveryProfiles = this.deliveryProfiles;
      result.deliverySettings = this.deliverySettings;
      result.discountCodeCount = this.discountCodeCount;
      result.discountNode = this.discountNode;
      result.discountNodes = this.discountNodes;
      result.discountRedeemCodeBulkCreation = this.discountRedeemCodeBulkCreation;
      result.discountRedeemCodeSavedSearches = this.discountRedeemCodeSavedSearches;
      result.dispute = this.dispute;
      result.disputeEvidence = this.disputeEvidence;
      result.domain = this.domain;
      result.draftOrder = this.draftOrder;
      result.draftOrderSavedSearches = this.draftOrderSavedSearches;
      result.draftOrderTag = this.draftOrderTag;
      result.draftOrders = this.draftOrders;
      result.fileSavedSearches = this.fileSavedSearches;
      result.files = this.files;
      result.fulfillment = this.fulfillment;
      result.fulfillmentConstraintRules = this.fulfillmentConstraintRules;
      result.fulfillmentOrder = this.fulfillmentOrder;
      result.fulfillmentOrders = this.fulfillmentOrders;
      result.fulfillmentService = this.fulfillmentService;
      result.giftCard = this.giftCard;
      result.giftCards = this.giftCards;
      result.giftCardsCount = this.giftCardsCount;
      result.inventoryItem = this.inventoryItem;
      result.inventoryItems = this.inventoryItems;
      result.inventoryLevel = this.inventoryLevel;
      result.inventoryProperties = this.inventoryProperties;
      result.job = this.job;
      result.location = this.location;
      result.locations = this.locations;
      result.locationsAvailableForDeliveryProfiles = this.locationsAvailableForDeliveryProfiles;
      result.locationsAvailableForDeliveryProfilesConnection = this.locationsAvailableForDeliveryProfilesConnection;
      result.manualHoldsFulfillmentOrders = this.manualHoldsFulfillmentOrders;
      result.market = this.market;
      result.marketByGeography = this.marketByGeography;
      result.marketLocalizableResource = this.marketLocalizableResource;
      result.marketLocalizableResources = this.marketLocalizableResources;
      result.marketLocalizableResourcesByIds = this.marketLocalizableResourcesByIds;
      result.marketingActivities = this.marketingActivities;
      result.marketingActivity = this.marketingActivity;
      result.marketingEvent = this.marketingEvent;
      result.marketingEvents = this.marketingEvents;
      result.markets = this.markets;
      result.metafieldDefinition = this.metafieldDefinition;
      result.metafieldDefinitionTypes = this.metafieldDefinitionTypes;
      result.metafieldDefinitions = this.metafieldDefinitions;
      result.metafieldStorefrontVisibilities = this.metafieldStorefrontVisibilities;
      result.metafieldStorefrontVisibility = this.metafieldStorefrontVisibility;
      result.metaobject = this.metaobject;
      result.metaobjectByHandle = this.metaobjectByHandle;
      result.metaobjectDefinition = this.metaobjectDefinition;
      result.metaobjectDefinitionByType = this.metaobjectDefinitionByType;
      result.metaobjectDefinitions = this.metaobjectDefinitions;
      result.metaobjects = this.metaobjects;
      result.node = this.node;
      result.nodes = this.nodes;
      result.order = this.order;
      result.orderPaymentStatus = this.orderPaymentStatus;
      result.orderSavedSearches = this.orderSavedSearches;
      result.orders = this.orders;
      result.paymentCustomization = this.paymentCustomization;
      result.paymentCustomizations = this.paymentCustomizations;
      result.paymentTermsTemplates = this.paymentTermsTemplates;
      result.priceList = this.priceList;
      result.priceLists = this.priceLists;
      result.priceRule = this.priceRule;
      result.priceRuleSavedSearches = this.priceRuleSavedSearches;
      result.priceRules = this.priceRules;
      result.primaryMarket = this.primaryMarket;
      result.privateMetafield = this.privateMetafield;
      result.privateMetafields = this.privateMetafields;
      result.product = this.product;
      result.productByHandle = this.productByHandle;
      result.productDuplicateJob = this.productDuplicateJob;
      result.productFeed = this.productFeed;
      result.productFeeds = this.productFeeds;
      result.productResourceFeedback = this.productResourceFeedback;
      result.productSavedSearches = this.productSavedSearches;
      result.productVariant = this.productVariant;
      result.productVariants = this.productVariants;
      result.products = this.products;
      result.publicApiVersions = this.publicApiVersions;
      result.publication = this.publication;
      result.publications = this.publications;
      result.refund = this.refund;
      result._return = this._return;
      result.returnableFulfillment = this.returnableFulfillment;
      result.returnableFulfillments = this.returnableFulfillments;
      result.reverseDelivery = this.reverseDelivery;
      result.reverseFulfillmentOrder = this.reverseFulfillmentOrder;
      result.scriptTag = this.scriptTag;
      result.scriptTags = this.scriptTags;
      result.segment = this.segment;
      result.segmentCount = this.segmentCount;
      result.segmentFilterSuggestions = this.segmentFilterSuggestions;
      result.segmentFilters = this.segmentFilters;
      result.segmentMigrations = this.segmentMigrations;
      result.segmentValueSuggestions = this.segmentValueSuggestions;
      result.segments = this.segments;
      result.sellingPlanGroup = this.sellingPlanGroup;
      result.sellingPlanGroups = this.sellingPlanGroups;
      result.serverPixel = this.serverPixel;
      result.shop = this.shop;
      result.shopBillingPreferences = this.shopBillingPreferences;
      result.shopLocales = this.shopLocales;
      result.shopifyFunction = this.shopifyFunction;
      result.shopifyFunctions = this.shopifyFunctions;
      result.shopifyPaymentsAccount = this.shopifyPaymentsAccount;
      result.shopifyqlQuery = this.shopifyqlQuery;
      result.staffMember = this.staffMember;
      result.standardMetafieldDefinitionTemplates = this.standardMetafieldDefinitionTemplates;
      result.subscriptionBillingAttempt = this.subscriptionBillingAttempt;
      result.subscriptionBillingAttempts = this.subscriptionBillingAttempts;
      result.subscriptionBillingCycle = this.subscriptionBillingCycle;
      result.subscriptionBillingCycles = this.subscriptionBillingCycles;
      result.subscriptionContract = this.subscriptionContract;
      result.subscriptionContracts = this.subscriptionContracts;
      result.subscriptionDraft = this.subscriptionDraft;
      result.tenderTransactions = this.tenderTransactions;
      result.translatableResource = this.translatableResource;
      result.translatableResources = this.translatableResources;
      result.translatableResourcesByIds = this.translatableResourcesByIds;
      result.urlRedirect = this.urlRedirect;
      result.urlRedirectImport = this.urlRedirectImport;
      result.urlRedirectSavedSearches = this.urlRedirectSavedSearches;
      result.urlRedirects = this.urlRedirects;
      result.validation = this.validation;
      result.validations = this.validations;
      result.webPixel = this.webPixel;
      result.webhookSubscription = this.webhookSubscription;
      result.webhookSubscriptions = this.webhookSubscriptions;
      return result;
    }

    /**
     * Returns an abandonment by ID.
     */
    public Builder abandonment(Abandonment abandonment) {
      this.abandonment = abandonment;
      return this;
    }

    /**
     * Returns an Abandonment by the Abandoned Checkout ID.
     */
    public Builder abandonmentByAbandonedCheckoutId(Abandonment abandonmentByAbandonedCheckoutId) {
      this.abandonmentByAbandonedCheckoutId = abandonmentByAbandonedCheckoutId;
      return this;
    }

    /**
     * Lookup an App by ID or return the currently authenticated App.
     */
    public Builder app(App app) {
      this.app = app;
      return this;
    }

    /**
     * Fetches app by handle.
     * Returns null if the app doesn't exist.
     */
    public Builder appByHandle(App appByHandle) {
      this.appByHandle = appByHandle;
      return this;
    }

    /**
     * Fetches an app by its client ID.
     * Returns null if the app doesn't exist.
     */
    public Builder appByKey(App appByKey) {
      this.appByKey = appByKey;
      return this;
    }

    /**
     * An app discount type.
     */
    public Builder appDiscountType(AppDiscountType appDiscountType) {
      this.appDiscountType = appDiscountType;
      return this;
    }

    /**
     * A list of app discount types installed by apps.
     */
    public Builder appDiscountTypes(List<AppDiscountType> appDiscountTypes) {
      this.appDiscountTypes = appDiscountTypes;
      return this;
    }

    /**
     * Lookup an AppInstallation by ID or return the AppInstallation for the currently authenticated App.
     */
    public Builder appInstallation(AppInstallation appInstallation) {
      this.appInstallation = appInstallation;
      return this;
    }

    /**
     * A list of app installations. To use this query, you need to contact [Shopify
     * Support](https://partners.shopify.com/current/support/) to grant your custom
     * app the `read_apps` access scope. Public apps can't be granted this access scope.
     */
    public Builder appInstallations(AppInstallationConnection appInstallations) {
      this.appInstallations = appInstallations;
      return this;
    }

    /**
     * Returns an automatic discount resource by ID.
     */
    public Builder automaticDiscount(DiscountAutomatic automaticDiscount) {
      this.automaticDiscount = automaticDiscount;
      return this;
    }

    /**
     * Returns an automatic discount resource by ID.
     */
    public Builder automaticDiscountNode(DiscountAutomaticNode automaticDiscountNode) {
      this.automaticDiscountNode = automaticDiscountNode;
      return this;
    }

    /**
     * List of automatic discounts.
     */
    public Builder automaticDiscountNodes(DiscountAutomaticNodeConnection automaticDiscountNodes) {
      this.automaticDiscountNodes = automaticDiscountNodes;
      return this;
    }

    /**
     * List of the shop's automatic discount saved searches.
     */
    public Builder automaticDiscountSavedSearches(
        SavedSearchConnection automaticDiscountSavedSearches) {
      this.automaticDiscountSavedSearches = automaticDiscountSavedSearches;
      return this;
    }

    /**
     * List of automatic discounts.
     */
    public Builder automaticDiscounts(DiscountAutomaticConnection automaticDiscounts) {
      this.automaticDiscounts = automaticDiscounts;
      return this;
    }

    /**
     * Returns a list of activated carrier services and associated shop locations that support them.
     */
    public Builder availableCarrierServices(
        List<DeliveryCarrierServiceAndLocations> availableCarrierServices) {
      this.availableCarrierServices = availableCarrierServices;
      return this;
    }

    /**
     * A list of available locales.
     */
    public Builder availableLocales(List<Locale> availableLocales) {
      this.availableLocales = availableLocales;
      return this;
    }

    /**
     * Returns a `DeliveryCarrierService` object by ID.
     */
    public Builder carrierService(DeliveryCarrierService carrierService) {
      this.carrierService = carrierService;
      return this;
    }

    /**
     * List of Cart transform objects owned by the current API client.
     */
    public Builder cartTransforms(CartTransformConnection cartTransforms) {
      this.cartTransforms = cartTransforms;
      return this;
    }

    /**
     * Returns a Catalog resource by ID.
     */
    public Builder catalog(Catalog catalog) {
      this.catalog = catalog;
      return this;
    }

    /**
     * Returns the most recent catalog operations for the shop.
     */
    public Builder catalogOperations(List<ResourceOperation> catalogOperations) {
      this.catalogOperations = catalogOperations;
      return this;
    }

    /**
     * The catalogs belonging to the shop.
     */
    public Builder catalogs(CatalogConnection catalogs) {
      this.catalogs = catalogs;
      return this;
    }

    /**
     * Lookup a channel by ID.
     */
    public Builder channel(Channel channel) {
      this.channel = channel;
      return this;
    }

    /**
     * List of the active sales channels.
     */
    public Builder channels(ChannelConnection channels) {
      this.channels = channels;
      return this;
    }

    /**
     * Returns the visual customizations for checkout for a given checkout profile.
     *   
     * To learn more about updating checkout branding settings, refer to the
     * [checkoutBrandingUpsert](https://shopify.dev/api/admin-graphql/unstable/mutations/checkoutBrandingUpsert)
     * mutation and the checkout branding [tutorial](https://shopify.dev/docs/apps/checkout/styling).
     */
    public Builder checkoutBranding(CheckoutBranding checkoutBranding) {
      this.checkoutBranding = checkoutBranding;
      return this;
    }

    /**
     * A checkout profile on a shop.
     */
    public Builder checkoutProfile(CheckoutProfile checkoutProfile) {
      this.checkoutProfile = checkoutProfile;
      return this;
    }

    /**
     * List of checkout profiles on a shop.
     */
    public Builder checkoutProfiles(CheckoutProfileConnection checkoutProfiles) {
      this.checkoutProfiles = checkoutProfiles;
      return this;
    }

    /**
     * Returns a [code discount](https://help.shopify.com/manual/discounts/discount-types#discount-codes) resource by ID.
     */
    public Builder codeDiscountNode(DiscountCodeNode codeDiscountNode) {
      this.codeDiscountNode = codeDiscountNode;
      return this;
    }

    /**
     * Returns a code discount identified by its discount code.
     */
    public Builder codeDiscountNodeByCode(DiscountCodeNode codeDiscountNodeByCode) {
      this.codeDiscountNodeByCode = codeDiscountNodeByCode;
      return this;
    }

    /**
     * Returns a list of [code-based discounts](https://help.shopify.com/manual/discounts/discount-types#discount-codes).
     */
    public Builder codeDiscountNodes(DiscountCodeNodeConnection codeDiscountNodes) {
      this.codeDiscountNodes = codeDiscountNodes;
      return this;
    }

    /**
     * List of the shop's code discount saved searches.
     */
    public Builder codeDiscountSavedSearches(SavedSearchConnection codeDiscountSavedSearches) {
      this.codeDiscountSavedSearches = codeDiscountSavedSearches;
      return this;
    }

    /**
     * Returns a Collection resource by ID.
     */
    public Builder collection(Collection collection) {
      this.collection = collection;
      return this;
    }

    /**
     * Return a collection by its handle.
     */
    public Builder collectionByHandle(Collection collectionByHandle) {
      this.collectionByHandle = collectionByHandle;
      return this;
    }

    /**
     * Lists all rules that can be used to create smart collections.
     */
    public Builder collectionRulesConditions(
        List<CollectionRuleConditions> collectionRulesConditions) {
      this.collectionRulesConditions = collectionRulesConditions;
      return this;
    }

    /**
     * Returns a list of the shop's collection saved searches.
     */
    public Builder collectionSavedSearches(SavedSearchConnection collectionSavedSearches) {
      this.collectionSavedSearches = collectionSavedSearches;
      return this;
    }

    /**
     * Returns a list of collections.
     */
    public Builder collections(CollectionConnection collections) {
      this.collections = collections;
      return this;
    }

    /**
     * Returns the list of companies in the shop.
     */
    public Builder companies(CompanyConnection companies) {
      this.companies = companies;
      return this;
    }

    /**
     * Returns a `Company` object by ID.
     */
    public Builder company(Company company) {
      this.company = company;
      return this;
    }

    /**
     * Returns a `CompanyContact` object by ID.
     */
    public Builder companyContact(CompanyContact companyContact) {
      this.companyContact = companyContact;
      return this;
    }

    /**
     * Returns a `CompanyContactRole` object by ID.
     */
    public Builder companyContactRole(CompanyContactRole companyContactRole) {
      this.companyContactRole = companyContactRole;
      return this;
    }

    /**
     * The number of companies for a shop.
     */
    public Builder companyCount(int companyCount) {
      this.companyCount = companyCount;
      return this;
    }

    /**
     * Returns a `CompanyLocation` object by ID.
     */
    public Builder companyLocation(CompanyLocation companyLocation) {
      this.companyLocation = companyLocation;
      return this;
    }

    /**
     * Returns the list of company locations in the shop.
     */
    public Builder companyLocations(CompanyLocationConnection companyLocations) {
      this.companyLocations = companyLocations;
      return this;
    }

    /**
     * Return the AppInstallation for the currently authenticated App.
     */
    public Builder currentAppInstallation(AppInstallation currentAppInstallation) {
      this.currentAppInstallation = currentAppInstallation;
      return this;
    }

    /**
     * Returns the current app's most recent BulkOperation. Apps can run one bulk
     * query and one bulk mutation operation at a time, by shop.
     */
    public Builder currentBulkOperation(BulkOperation currentBulkOperation) {
      this.currentBulkOperation = currentBulkOperation;
      return this;
    }

    /**
     * Returns a Customer resource by ID.
     */
    public Builder customer(Customer customer) {
      this.customer = customer;
      return this;
    }

    /**
     * Returns the status of a customer merge request job.
     */
    public Builder customerMergeJobStatus(CustomerMergeRequest customerMergeJobStatus) {
      this.customerMergeJobStatus = customerMergeJobStatus;
      return this;
    }

    /**
     * Returns a preview of a customer merge request.
     */
    public Builder customerMergePreview(CustomerMergePreview customerMergePreview) {
      this.customerMergePreview = customerMergePreview;
      return this;
    }

    /**
     * Returns a CustomerPaymentMethod resource by its ID.
     */
    public Builder customerPaymentMethod(CustomerPaymentMethod customerPaymentMethod) {
      this.customerPaymentMethod = customerPaymentMethod;
      return this;
    }

    /**
     * The list of members, such as customers, that's associated with an individual segment.
     * The maximum page size is 1000.
     */
    public Builder customerSegmentMembers(CustomerSegmentMemberConnection customerSegmentMembers) {
      this.customerSegmentMembers = customerSegmentMembers;
      return this;
    }

    /**
     * Returns a segment members query resource by ID.
     */
    public Builder customerSegmentMembersQuery(
        CustomerSegmentMembersQuery customerSegmentMembersQuery) {
      this.customerSegmentMembersQuery = customerSegmentMembersQuery;
      return this;
    }

    /**
     * Whether a member, which is a customer, belongs to a segment.
     */
    public Builder customerSegmentMembership(SegmentMembershipResponse customerSegmentMembership) {
      this.customerSegmentMembership = customerSegmentMembership;
      return this;
    }

    /**
     * Returns a list of customers.
     */
    public Builder customers(CustomerConnection customers) {
      this.customers = customers;
      return this;
    }

    /**
     * The paginated list of deletion events.
     */
    public Builder deletionEvents(DeletionEventConnection deletionEvents) {
      this.deletionEvents = deletionEvents;
      return this;
    }

    /**
     * The delivery customization.
     */
    public Builder deliveryCustomization(DeliveryCustomization deliveryCustomization) {
      this.deliveryCustomization = deliveryCustomization;
      return this;
    }

    /**
     * The delivery customizations.
     */
    public Builder deliveryCustomizations(DeliveryCustomizationConnection deliveryCustomizations) {
      this.deliveryCustomizations = deliveryCustomizations;
      return this;
    }

    /**
     * Returns a Delivery Profile resource by ID.
     */
    public Builder deliveryProfile(DeliveryProfile deliveryProfile) {
      this.deliveryProfile = deliveryProfile;
      return this;
    }

    /**
     * Returns a list of saved delivery profiles.
     */
    public Builder deliveryProfiles(DeliveryProfileConnection deliveryProfiles) {
      this.deliveryProfiles = deliveryProfiles;
      return this;
    }

    /**
     * Returns the shop-wide shipping settings.
     */
    public Builder deliverySettings(DeliverySetting deliverySettings) {
      this.deliverySettings = deliverySettings;
      return this;
    }

    /**
     * The total number of discount codes for the shop.
     */
    public Builder discountCodeCount(int discountCodeCount) {
      this.discountCodeCount = discountCodeCount;
      return this;
    }

    /**
     * Returns a discount resource by ID.
     */
    public Builder discountNode(DiscountNode discountNode) {
      this.discountNode = discountNode;
      return this;
    }

    /**
     * Returns a list of discounts.
     */
    public Builder discountNodes(DiscountNodeConnection discountNodes) {
      this.discountNodes = discountNodes;
      return this;
    }

    /**
     * Returns a bulk code creation resource by ID.
     */
    public Builder discountRedeemCodeBulkCreation(
        DiscountRedeemCodeBulkCreation discountRedeemCodeBulkCreation) {
      this.discountRedeemCodeBulkCreation = discountRedeemCodeBulkCreation;
      return this;
    }

    /**
     * List of the shop's redeemed discount code saved searches.
     */
    public Builder discountRedeemCodeSavedSearches(
        SavedSearchConnection discountRedeemCodeSavedSearches) {
      this.discountRedeemCodeSavedSearches = discountRedeemCodeSavedSearches;
      return this;
    }

    /**
     * Returns dispute details based on ID.
     */
    public Builder dispute(ShopifyPaymentsDispute dispute) {
      this.dispute = dispute;
      return this;
    }

    /**
     * Returns dispute evidence details based on ID.
     */
    public Builder disputeEvidence(ShopifyPaymentsDisputeEvidence disputeEvidence) {
      this.disputeEvidence = disputeEvidence;
      return this;
    }

    /**
     * Lookup a Domain by ID.
     */
    public Builder domain(Domain domain) {
      this.domain = domain;
      return this;
    }

    /**
     * Returns a DraftOrder resource by ID.
     */
    public Builder draftOrder(DraftOrder draftOrder) {
      this.draftOrder = draftOrder;
      return this;
    }

    /**
     * List of the shop's draft order saved searches.
     */
    public Builder draftOrderSavedSearches(SavedSearchConnection draftOrderSavedSearches) {
      this.draftOrderSavedSearches = draftOrderSavedSearches;
      return this;
    }

    /**
     * Returns a DraftOrderTag resource by ID.
     */
    public Builder draftOrderTag(DraftOrderTag draftOrderTag) {
      this.draftOrderTag = draftOrderTag;
      return this;
    }

    /**
     * List of saved draft orders.
     */
    public Builder draftOrders(DraftOrderConnection draftOrders) {
      this.draftOrders = draftOrders;
      return this;
    }

    /**
     * A list of the shop's file saved searches.
     */
    public Builder fileSavedSearches(SavedSearchConnection fileSavedSearches) {
      this.fileSavedSearches = fileSavedSearches;
      return this;
    }

    /**
     * Returns a paginated list of files that have been uploaded to Shopify.
     */
    public Builder files(FileConnection files) {
      this.files = files;
      return this;
    }

    /**
     * Returns a Fulfillment resource by ID.
     */
    public Builder fulfillment(Fulfillment fulfillment) {
      this.fulfillment = fulfillment;
      return this;
    }

    /**
     * The fulfillment constraint rules that belong to a shop.
     */
    public Builder fulfillmentConstraintRules(
        List<FulfillmentConstraintRule> fulfillmentConstraintRules) {
      this.fulfillmentConstraintRules = fulfillmentConstraintRules;
      return this;
    }

    /**
     * Returns a Fulfillment order resource by ID.
     */
    public Builder fulfillmentOrder(FulfillmentOrder fulfillmentOrder) {
      this.fulfillmentOrder = fulfillmentOrder;
      return this;
    }

    /**
     * The paginated list of all fulfillment orders.
     * The returned fulfillment orders are filtered according to the
     * [fulfillment order access scopes](https://shopify.dev/api/admin-graphql/latest/objects/fulfillmentorder#api-access-scopes)
     * granted to the app.
     *   
     * Use this query to retrieve fulfillment orders assigned to merchant-managed locations,
     * third-party fulfillment service locations, or all kinds of locations together.
     *   
     * For fetching only the fulfillment orders assigned to the app's locations, use the
     * [assignedFulfillmentOrders](https://shopify.dev/api/admin-graphql/2024-07/objects/queryroot#connection-assignedfulfillmentorders)
     * connection.
     */
    public Builder fulfillmentOrders(FulfillmentOrderConnection fulfillmentOrders) {
      this.fulfillmentOrders = fulfillmentOrders;
      return this;
    }

    /**
     * Returns a FulfillmentService resource by ID.
     */
    public Builder fulfillmentService(FulfillmentService fulfillmentService) {
      this.fulfillmentService = fulfillmentService;
      return this;
    }

    /**
     * Returns a gift card resource by ID.
     */
    public Builder giftCard(GiftCard giftCard) {
      this.giftCard = giftCard;
      return this;
    }

    /**
     * Returns a list of gift cards.
     */
    public Builder giftCards(GiftCardConnection giftCards) {
      this.giftCards = giftCards;
      return this;
    }

    /**
     * The total number of gift cards issued for the shop.
     */
    public Builder giftCardsCount(String giftCardsCount) {
      this.giftCardsCount = giftCardsCount;
      return this;
    }

    /**
     * Returns an
     * [InventoryItem](https://shopify.dev/docs/api/admin-graphql/latest/objects/InventoryItem)
     * object by ID.
     */
    public Builder inventoryItem(InventoryItem inventoryItem) {
      this.inventoryItem = inventoryItem;
      return this;
    }

    /**
     * Returns a list of inventory items.
     */
    public Builder inventoryItems(InventoryItemConnection inventoryItems) {
      this.inventoryItems = inventoryItems;
      return this;
    }

    /**
     * Returns an
     * [InventoryLevel](https://shopify.dev/docs/api/admin-graphql/latest/objects/InventoryLevel)
     * object by ID.
     */
    public Builder inventoryLevel(InventoryLevel inventoryLevel) {
      this.inventoryLevel = inventoryLevel;
      return this;
    }

    /**
     * General inventory properties for the shop.
     */
    public Builder inventoryProperties(InventoryProperties inventoryProperties) {
      this.inventoryProperties = inventoryProperties;
      return this;
    }

    /**
     * Returns a Job resource by ID. Used to check the status of internal jobs and any applicable changes.
     */
    public Builder job(Job job) {
      this.job = job;
      return this;
    }

    /**
     * Returns an inventory Location resource by ID.
     */
    public Builder location(Location location) {
      this.location = location;
      return this;
    }

    /**
     * Returns a list of active inventory locations.
     */
    public Builder locations(LocationConnection locations) {
      this.locations = locations;
      return this;
    }

    /**
     * Returns a list of all origin locations available for a delivery profile.
     */
    public Builder locationsAvailableForDeliveryProfiles(
        List<Location> locationsAvailableForDeliveryProfiles) {
      this.locationsAvailableForDeliveryProfiles = locationsAvailableForDeliveryProfiles;
      return this;
    }

    /**
     * Returns a list of all origin locations available for a delivery profile.
     */
    public Builder locationsAvailableForDeliveryProfilesConnection(
        LocationConnection locationsAvailableForDeliveryProfilesConnection) {
      this.locationsAvailableForDeliveryProfilesConnection = locationsAvailableForDeliveryProfilesConnection;
      return this;
    }

    /**
     * Returns a list of fulfillment orders that are on hold.
     */
    public Builder manualHoldsFulfillmentOrders(
        FulfillmentOrderConnection manualHoldsFulfillmentOrders) {
      this.manualHoldsFulfillmentOrders = manualHoldsFulfillmentOrders;
      return this;
    }

    /**
     * Returns a market resource by ID.
     */
    public Builder market(Market market) {
      this.market = market;
      return this;
    }

    /**
     * Returns the applicable market for a customer based on where they are in the world.
     */
    public Builder marketByGeography(Market marketByGeography) {
      this.marketByGeography = marketByGeography;
      return this;
    }

    /**
     * A resource that can have localized values for different markets.
     */
    public Builder marketLocalizableResource(MarketLocalizableResource marketLocalizableResource) {
      this.marketLocalizableResource = marketLocalizableResource;
      return this;
    }

    /**
     * Resources that can have localized values for different markets.
     */
    public Builder marketLocalizableResources(
        MarketLocalizableResourceConnection marketLocalizableResources) {
      this.marketLocalizableResources = marketLocalizableResources;
      return this;
    }

    /**
     * Resources that can have localized values for different markets.
     */
    public Builder marketLocalizableResourcesByIds(
        MarketLocalizableResourceConnection marketLocalizableResourcesByIds) {
      this.marketLocalizableResourcesByIds = marketLocalizableResourcesByIds;
      return this;
    }

    /**
     * A list of marketing activities associated with the marketing app.
     */
    public Builder marketingActivities(MarketingActivityConnection marketingActivities) {
      this.marketingActivities = marketingActivities;
      return this;
    }

    /**
     * Returns a MarketingActivity resource by ID.
     */
    public Builder marketingActivity(MarketingActivity marketingActivity) {
      this.marketingActivity = marketingActivity;
      return this;
    }

    /**
     * Returns a MarketingEvent resource by ID.
     */
    public Builder marketingEvent(MarketingEvent marketingEvent) {
      this.marketingEvent = marketingEvent;
      return this;
    }

    /**
     * A list of marketing events associated with the marketing app.
     */
    public Builder marketingEvents(MarketingEventConnection marketingEvents) {
      this.marketingEvents = marketingEvents;
      return this;
    }

    /**
     * The markets configured for the shop.
     */
    public Builder markets(MarketConnection markets) {
      this.markets = markets;
      return this;
    }

    /**
     * Returns a metafield definition by identifier.
     */
    public Builder metafieldDefinition(MetafieldDefinition metafieldDefinition) {
      this.metafieldDefinition = metafieldDefinition;
      return this;
    }

    /**
     * Each metafield definition has a type, which defines the type of information that it can store.
     * This type is enforced across every instance of the resource that owns the metafield definition.
     *   
     * Refer to the [list of supported metafield types](https://shopify.dev/apps/metafields/types).
     */
    public Builder metafieldDefinitionTypes(
        List<MetafieldDefinitionType> metafieldDefinitionTypes) {
      this.metafieldDefinitionTypes = metafieldDefinitionTypes;
      return this;
    }

    /**
     * Returns a list of metafield definitions.
     */
    public Builder metafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
      this.metafieldDefinitions = metafieldDefinitions;
      return this;
    }

    /**
     * List of the `MetafieldStorefrontVisibility` records.
     */
    public Builder metafieldStorefrontVisibilities(
        MetafieldStorefrontVisibilityConnection metafieldStorefrontVisibilities) {
      this.metafieldStorefrontVisibilities = metafieldStorefrontVisibilities;
      return this;
    }

    /**
     * Returns a `MetafieldStorefrontVisibility` record by ID. A `MetafieldStorefrontVisibility` record lists the
     * metafields to make visible in the Storefront API.
     */
    public Builder metafieldStorefrontVisibility(
        MetafieldStorefrontVisibility metafieldStorefrontVisibility) {
      this.metafieldStorefrontVisibility = metafieldStorefrontVisibility;
      return this;
    }

    /**
     * Retrieves a metaobject by ID.
     */
    public Builder metaobject(Metaobject metaobject) {
      this.metaobject = metaobject;
      return this;
    }

    /**
     * Retrieves a metaobject by handle.
     */
    public Builder metaobjectByHandle(Metaobject metaobjectByHandle) {
      this.metaobjectByHandle = metaobjectByHandle;
      return this;
    }

    /**
     * Retrieves a metaobject definition by ID.
     */
    public Builder metaobjectDefinition(MetaobjectDefinition metaobjectDefinition) {
      this.metaobjectDefinition = metaobjectDefinition;
      return this;
    }

    /**
     * Finds a metaobject definition by type.
     */
    public Builder metaobjectDefinitionByType(MetaobjectDefinition metaobjectDefinitionByType) {
      this.metaobjectDefinitionByType = metaobjectDefinitionByType;
      return this;
    }

    /**
     * All metaobject definitions.
     */
    public Builder metaobjectDefinitions(MetaobjectDefinitionConnection metaobjectDefinitions) {
      this.metaobjectDefinitions = metaobjectDefinitions;
      return this;
    }

    /**
     * All metaobjects for the shop.
     */
    public Builder metaobjects(MetaobjectConnection metaobjects) {
      this.metaobjects = metaobjects;
      return this;
    }

    /**
     * Returns a specific node (any object that implements the
     * [Node](https://shopify.dev/api/admin-graphql/latest/interfaces/Node)
     * interface) by ID, in accordance with the
     * [Relay specification](https://relay.dev/docs/guides/graphql-server-specification/#object-identification).
     * This field is commonly used for refetching an object.
     */
    public Builder node(Node node) {
      this.node = node;
      return this;
    }

    /**
     * Returns the list of nodes (any objects that implement the
     * [Node](https://shopify.dev/api/admin-graphql/latest/interfaces/Node)
     * interface) with the given IDs, in accordance with the
     * [Relay specification](https://relay.dev/docs/guides/graphql-server-specification/#object-identification).
     */
    public Builder nodes(List<Node> nodes) {
      this.nodes = nodes;
      return this;
    }

    /**
     * Returns an Order resource by ID.
     */
    public Builder order(Order order) {
      this.order = order;
      return this;
    }

    /**
     * Returns a payment status by payment reference ID. Used to check the status of a deferred payment.
     */
    public Builder orderPaymentStatus(OrderPaymentStatus orderPaymentStatus) {
      this.orderPaymentStatus = orderPaymentStatus;
      return this;
    }

    /**
     * List of the shop's order saved searches.
     */
    public Builder orderSavedSearches(SavedSearchConnection orderSavedSearches) {
      this.orderSavedSearches = orderSavedSearches;
      return this;
    }

    /**
     * Returns a list of orders placed in the store.
     */
    public Builder orders(OrderConnection orders) {
      this.orders = orders;
      return this;
    }

    /**
     * The payment customization.
     */
    public Builder paymentCustomization(PaymentCustomization paymentCustomization) {
      this.paymentCustomization = paymentCustomization;
      return this;
    }

    /**
     * The payment customizations.
     */
    public Builder paymentCustomizations(PaymentCustomizationConnection paymentCustomizations) {
      this.paymentCustomizations = paymentCustomizations;
      return this;
    }

    /**
     * The list of payment terms templates eligible for all shops and users.
     */
    public Builder paymentTermsTemplates(List<PaymentTermsTemplate> paymentTermsTemplates) {
      this.paymentTermsTemplates = paymentTermsTemplates;
      return this;
    }

    /**
     * Returns a price list resource by ID.
     */
    public Builder priceList(PriceList priceList) {
      this.priceList = priceList;
      return this;
    }

    /**
     * All price lists for a shop.
     */
    public Builder priceLists(PriceListConnection priceLists) {
      this.priceLists = priceLists;
      return this;
    }

    /**
     * Returns a code price rule resource by ID.
     */
    public Builder priceRule(PriceRule priceRule) {
      this.priceRule = priceRule;
      return this;
    }

    /**
     * List of the shop's price rule saved searches.
     */
    public Builder priceRuleSavedSearches(SavedSearchConnection priceRuleSavedSearches) {
      this.priceRuleSavedSearches = priceRuleSavedSearches;
      return this;
    }

    /**
     * Returns a list of price rule resources that have at least one associated discount code.
     */
    public Builder priceRules(PriceRuleConnection priceRules) {
      this.priceRules = priceRules;
      return this;
    }

    /**
     * The primary market of the shop.
     */
    public Builder primaryMarket(Market primaryMarket) {
      this.primaryMarket = primaryMarket;
      return this;
    }

    /**
     * Returns a private metafield by ID.
     * Private metafields are accessible only by the application that created them.
     */
    public Builder privateMetafield(PrivateMetafield privateMetafield) {
      this.privateMetafield = privateMetafield;
      return this;
    }

    /**
     * Returns a list of private metafields associated to a resource.
     */
    public Builder privateMetafields(PrivateMetafieldConnection privateMetafields) {
      this.privateMetafields = privateMetafields;
      return this;
    }

    /**
     * Returns a Product resource by ID.
     */
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    /**
     * Return a product by its handle.
     */
    public Builder productByHandle(Product productByHandle) {
      this.productByHandle = productByHandle;
      return this;
    }

    /**
     * Returns the product duplicate job.
     */
    public Builder productDuplicateJob(ProductDuplicateJob productDuplicateJob) {
      this.productDuplicateJob = productDuplicateJob;
      return this;
    }

    /**
     * Returns a ProductFeed resource by ID.
     */
    public Builder productFeed(ProductFeed productFeed) {
      this.productFeed = productFeed;
      return this;
    }

    /**
     * The product feeds for the shop.
     */
    public Builder productFeeds(ProductFeedConnection productFeeds) {
      this.productFeeds = productFeeds;
      return this;
    }

    /**
     * Returns the product resource feedback for the currently authenticated app.
     */
    public Builder productResourceFeedback(ProductResourceFeedback productResourceFeedback) {
      this.productResourceFeedback = productResourceFeedback;
      return this;
    }

    /**
     * Returns a list of the shop's product saved searches.
     */
    public Builder productSavedSearches(SavedSearchConnection productSavedSearches) {
      this.productSavedSearches = productSavedSearches;
      return this;
    }

    /**
     * Returns a ProductVariant resource by ID.
     */
    public Builder productVariant(ProductVariant productVariant) {
      this.productVariant = productVariant;
      return this;
    }

    /**
     * Returns a list of product variants.
     */
    public Builder productVariants(ProductVariantConnection productVariants) {
      this.productVariants = productVariants;
      return this;
    }

    /**
     * Returns a list of products.
     */
    public Builder products(ProductConnection products) {
      this.products = products;
      return this;
    }

    /**
     * The list of publicly-accessible Admin API versions, including supported
     * versions, the release candidate, and unstable versions.
     */
    public Builder publicApiVersions(List<ApiVersion> publicApiVersions) {
      this.publicApiVersions = publicApiVersions;
      return this;
    }

    /**
     * Lookup a publication by ID.
     */
    public Builder publication(Publication publication) {
      this.publication = publication;
      return this;
    }

    /**
     * List of publications.
     */
    public Builder publications(PublicationConnection publications) {
      this.publications = publications;
      return this;
    }

    /**
     * Returns a Refund resource by ID.
     */
    public Builder refund(Refund refund) {
      this.refund = refund;
      return this;
    }

    /**
     * Returns a Return resource by ID.
     */
    public Builder _return(Return _return) {
      this._return = _return;
      return this;
    }

    /**
     * Lookup a returnable fulfillment by ID.
     */
    public Builder returnableFulfillment(ReturnableFulfillment returnableFulfillment) {
      this.returnableFulfillment = returnableFulfillment;
      return this;
    }

    /**
     * List of returnable fulfillments.
     */
    public Builder returnableFulfillments(ReturnableFulfillmentConnection returnableFulfillments) {
      this.returnableFulfillments = returnableFulfillments;
      return this;
    }

    /**
     * Lookup a reverse delivery by ID.
     */
    public Builder reverseDelivery(ReverseDelivery reverseDelivery) {
      this.reverseDelivery = reverseDelivery;
      return this;
    }

    /**
     * Lookup a reverse fulfillment order by ID.
     */
    public Builder reverseFulfillmentOrder(ReverseFulfillmentOrder reverseFulfillmentOrder) {
      this.reverseFulfillmentOrder = reverseFulfillmentOrder;
      return this;
    }

    /**
     * <div class="note"><h4>Theme app extensions</h4>
     *   <p>Your app might not pass App Store review if it uses script tags instead of
     * theme app extensions. All new apps, and apps that integrate with Online Store
     * 2.0 themes, should use theme app extensions, such as app blocks or app embed
     * blocks. Script tags are an alternative you can use with only vintage themes.
     * <a href="/apps/online-store#what-integration-method-should-i-use"
     * target="_blank">Learn more</a>.</p></div>
     *   
     * <div class="note"><h4>Script tag deprecation</h4>
     *   <p>Script tags will be sunset for the <b>Order status</b> page on August 28, 2025. <a href="https://www.shopify.com/plus/upgrading-to-checkout-extensibility">Upgrade
     * to Checkout Extensibility</a> before this date. <a
     * href="/docs/api/liquid/objects#script">Shopify Scripts</a> will continue to
     * work alongside Checkout Extensibility until August 28, 2025.</p></div>
     *   
     *   
     * Lookup a script tag resource by ID.
     */
    public Builder scriptTag(ScriptTag scriptTag) {
      this.scriptTag = scriptTag;
      return this;
    }

    /**
     * <div class="note"><h4>Theme app extensions</h4>
     *   <p>Your app might not pass App Store review if it uses script tags instead of
     * theme app extensions. All new apps, and apps that integrate with Online Store
     * 2.0 themes, should use theme app extensions, such as app blocks or app embed
     * blocks. Script tags are an alternative you can use with only vintage themes.
     * <a href="/apps/online-store#what-integration-method-should-i-use"
     * target="_blank">Learn more</a>.</p></div>
     *   
     * <div class="note"><h4>Script tag deprecation</h4>
     *   <p>Script tags will be sunset for the <b>Order status</b> page on August 28, 2025. <a href="https://www.shopify.com/plus/upgrading-to-checkout-extensibility">Upgrade
     * to Checkout Extensibility</a> before this date. <a
     * href="/docs/api/liquid/objects#script">Shopify Scripts</a> will continue to
     * work alongside Checkout Extensibility until August 28, 2025.</p></div>
     *   
     *   
     * A list of script tags.
     */
    public Builder scriptTags(ScriptTagConnection scriptTags) {
      this.scriptTags = scriptTags;
      return this;
    }

    /**
     * The Customer Segment.
     */
    public Builder segment(Segment segment) {
      this.segment = segment;
      return this;
    }

    /**
     * The number of segments for a shop.
     */
    public Builder segmentCount(int segmentCount) {
      this.segmentCount = segmentCount;
      return this;
    }

    /**
     * A list of filter suggestions associated with a segment. A segment is a group
     * of members (commonly customers) that meet specific criteria.
     */
    public Builder segmentFilterSuggestions(SegmentFilterConnection segmentFilterSuggestions) {
      this.segmentFilterSuggestions = segmentFilterSuggestions;
      return this;
    }

    /**
     * A list of filters.
     */
    public Builder segmentFilters(SegmentFilterConnection segmentFilters) {
      this.segmentFilters = segmentFilters;
      return this;
    }

    /**
     * A list of a shop's segment migrations.
     */
    public Builder segmentMigrations(SegmentMigrationConnection segmentMigrations) {
      this.segmentMigrations = segmentMigrations;
      return this;
    }

    /**
     * The list of suggested values corresponding to a particular filter for a
     * segment. A segment is a group of members, such as customers, that meet
     * specific criteria.
     */
    public Builder segmentValueSuggestions(SegmentValueConnection segmentValueSuggestions) {
      this.segmentValueSuggestions = segmentValueSuggestions;
      return this;
    }

    /**
     * A list of a shop's segments.
     */
    public Builder segments(SegmentConnection segments) {
      this.segments = segments;
      return this;
    }

    /**
     * Returns a Selling Plan Group resource by ID.
     */
    public Builder sellingPlanGroup(SellingPlanGroup sellingPlanGroup) {
      this.sellingPlanGroup = sellingPlanGroup;
      return this;
    }

    /**
     * List Selling Plan Groups.
     */
    public Builder sellingPlanGroups(SellingPlanGroupConnection sellingPlanGroups) {
      this.sellingPlanGroups = sellingPlanGroups;
      return this;
    }

    /**
     * The server pixel configured by the app.
     */
    public Builder serverPixel(ServerPixel serverPixel) {
      this.serverPixel = serverPixel;
      return this;
    }

    /**
     * Returns the Shop resource corresponding to the access token used in the request. The Shop resource contains
     * business and store management settings for the shop.
     */
    public Builder shop(Shop shop) {
      this.shop = shop;
      return this;
    }

    /**
     * The shop's billing preferences.
     */
    public Builder shopBillingPreferences(ShopBillingPreferences shopBillingPreferences) {
      this.shopBillingPreferences = shopBillingPreferences;
      return this;
    }

    /**
     * A list of locales available on a shop.
     */
    public Builder shopLocales(List<ShopLocale> shopLocales) {
      this.shopLocales = shopLocales;
      return this;
    }

    /**
     * The Shopify Function.
     */
    public Builder shopifyFunction(ShopifyFunction shopifyFunction) {
      this.shopifyFunction = shopifyFunction;
      return this;
    }

    /**
     * Returns the Shopify Functions for apps installed on the shop.
     */
    public Builder shopifyFunctions(ShopifyFunctionConnection shopifyFunctions) {
      this.shopifyFunctions = shopifyFunctions;
      return this;
    }

    /**
     * Shopify Payments account information, including balances and payouts.
     */
    public Builder shopifyPaymentsAccount(ShopifyPaymentsAccount shopifyPaymentsAccount) {
      this.shopifyPaymentsAccount = shopifyPaymentsAccount;
      return this;
    }

    /**
     * Returns the results of a ShopifyQL query. Refer to the [ShopifyQL
     * documentation](https://shopify.dev/api/shopifyql) for more information.
     */
    public Builder shopifyqlQuery(ShopifyqlResponse shopifyqlQuery) {
      this.shopifyqlQuery = shopifyqlQuery;
      return this;
    }

    /**
     * The StaffMember resource, by ID.
     */
    public Builder staffMember(StaffMember staffMember) {
      this.staffMember = staffMember;
      return this;
    }

    /**
     * Standard metafield definitions are intended for specific, common use cases.
     * Their namespace and keys reflect these use cases and are reserved.
     *   
     * Refer to all available [`Standard Metafield Definition Templates`](https://shopify.dev/api/admin-graphql/latest/objects/StandardMetafieldDefinitionTemplate).
     */
    public Builder standardMetafieldDefinitionTemplates(
        StandardMetafieldDefinitionTemplateConnection standardMetafieldDefinitionTemplates) {
      this.standardMetafieldDefinitionTemplates = standardMetafieldDefinitionTemplates;
      return this;
    }

    /**
     * Returns a SubscriptionBillingAttempt by ID.
     */
    public Builder subscriptionBillingAttempt(
        SubscriptionBillingAttempt subscriptionBillingAttempt) {
      this.subscriptionBillingAttempt = subscriptionBillingAttempt;
      return this;
    }

    /**
     * Returns subscription billing attempts on a store.
     */
    public Builder subscriptionBillingAttempts(
        SubscriptionBillingAttemptConnection subscriptionBillingAttempts) {
      this.subscriptionBillingAttempts = subscriptionBillingAttempts;
      return this;
    }

    /**
     * Returns a subscription billing cycle found either by cycle index or date.
     */
    public Builder subscriptionBillingCycle(SubscriptionBillingCycle subscriptionBillingCycle) {
      this.subscriptionBillingCycle = subscriptionBillingCycle;
      return this;
    }

    /**
     * Returns subscription billing cycles for a contract ID.
     */
    public Builder subscriptionBillingCycles(
        SubscriptionBillingCycleConnection subscriptionBillingCycles) {
      this.subscriptionBillingCycles = subscriptionBillingCycles;
      return this;
    }

    /**
     * Returns a Subscription Contract resource by ID.
     */
    public Builder subscriptionContract(SubscriptionContract subscriptionContract) {
      this.subscriptionContract = subscriptionContract;
      return this;
    }

    /**
     * List Subscription Contracts.
     */
    public Builder subscriptionContracts(SubscriptionContractConnection subscriptionContracts) {
      this.subscriptionContracts = subscriptionContracts;
      return this;
    }

    /**
     * Returns a Subscription Draft resource by ID.
     */
    public Builder subscriptionDraft(SubscriptionDraft subscriptionDraft) {
      this.subscriptionDraft = subscriptionDraft;
      return this;
    }

    /**
     * Returns a list of TenderTransactions associated with the shop.
     */
    public Builder tenderTransactions(TenderTransactionConnection tenderTransactions) {
      this.tenderTransactions = tenderTransactions;
      return this;
    }

    /**
     * A resource that can have localized values for different languages.
     */
    public Builder translatableResource(TranslatableResource translatableResource) {
      this.translatableResource = translatableResource;
      return this;
    }

    /**
     * Resources that can have localized values for different languages.
     */
    public Builder translatableResources(TranslatableResourceConnection translatableResources) {
      this.translatableResources = translatableResources;
      return this;
    }

    /**
     * Resources that can have localized values for different languages.
     */
    public Builder translatableResourcesByIds(
        TranslatableResourceConnection translatableResourcesByIds) {
      this.translatableResourcesByIds = translatableResourcesByIds;
      return this;
    }

    /**
     * Returns a redirect resource by ID.
     */
    public Builder urlRedirect(UrlRedirect urlRedirect) {
      this.urlRedirect = urlRedirect;
      return this;
    }

    /**
     * Returns a redirect import resource by ID.
     */
    public Builder urlRedirectImport(UrlRedirectImport urlRedirectImport) {
      this.urlRedirectImport = urlRedirectImport;
      return this;
    }

    /**
     * A list of the shop's URL redirect saved searches.
     */
    public Builder urlRedirectSavedSearches(SavedSearchConnection urlRedirectSavedSearches) {
      this.urlRedirectSavedSearches = urlRedirectSavedSearches;
      return this;
    }

    /**
     * A list of redirects for a shop.
     */
    public Builder urlRedirects(UrlRedirectConnection urlRedirects) {
      this.urlRedirects = urlRedirects;
      return this;
    }

    /**
     * Validation available on the shop.
     */
    public Builder validation(Validation validation) {
      this.validation = validation;
      return this;
    }

    /**
     * Validations available on the shop.
     */
    public Builder validations(ValidationConnection validations) {
      this.validations = validations;
      return this;
    }

    /**
     * The web pixel configured by the app.
     */
    public Builder webPixel(WebPixel webPixel) {
      this.webPixel = webPixel;
      return this;
    }

    /**
     * Returns a webhook subscription by ID.
     *   
     * Building an app? If you only use app-specific webhooks, you won't need this.
     * App-specific webhook subscriptions specified in your `shopify.app.toml` may be
     * easier. They are automatically kept up to date by Shopify & require less
     * maintenance. Please read [About managing webhook
     * subscriptions](https://shopify.dev/docs/apps/build/webhooks/subscribe).
     */
    public Builder webhookSubscription(WebhookSubscription webhookSubscription) {
      this.webhookSubscription = webhookSubscription;
      return this;
    }

    /**
     * Returns a list of webhook subscriptions.
     *   
     * Building an app? If you only use app-specific webhooks, you won't need this.
     * App-specific webhook subscriptions specified in your `shopify.app.toml` may be
     * easier. They are automatically kept up to date by Shopify & require less
     * maintenance. Please read [About managing webhook
     * subscriptions](https://shopify.dev/docs/apps/build/webhooks/subscribe).
     */
    public Builder webhookSubscriptions(WebhookSubscriptionConnection webhookSubscriptions) {
      this.webhookSubscriptions = webhookSubscriptions;
      return this;
    }
  }
}
