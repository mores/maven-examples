package com.test.shopify.generated.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A Shopify application.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class App implements com.test.shopify.generated.types.Node {
  /**
   * A unique application API identifier.
   */
  private String apiKey;

  /**
   * App store page URL of the app.
   */
  private String appStoreAppUrl;

  /**
   * App store page URL of the developer who created the app.
   */
  private String appStoreDeveloperUrl;

  /**
   * All requestable access scopes available to the app.
   */
  private List<AccessScope> availableAccessScopes;

  /**
   * Banner image for the app.
   */
  private Image banner;

  /**
   * Description of the app.
   */
  private String description;

  /**
   * The name of the app developer.
   */
  private String developerName;

  /**
   * The type of app developer.
   */
  private AppDeveloperType developerType;

  /**
   * Website of the developer who created the app.
   */
  private String developerUrl;

  /**
   * Whether the app uses the Embedded App SDK.
   */
  private boolean embedded;

  /**
   * Requirements that must be met before the app can be installed.
   */
  private List<FailedRequirement> failedRequirements;

  /**
   * A list of app features that are shown in the Shopify App Store listing.
   */
  private List<String> features;

  /**
   * Feedback from this app about the store.
   */
  private AppFeedback feedback;

  /**
   * Handle of the app.
   */
  private String handle;

  /**
   * Icon that represents the app.
   */
  private Image icon;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * Webpage where you can install the app.
   */
  private String installUrl;

  /**
   * Corresponding AppInstallation for this shop and App.
   * Returns null if the App is not installed.
   */
  private AppInstallation installation;

  /**
   * Whether the app is the [post purchase](https://shopify.dev/apps/checkout/post-purchase) app in use.
   */
  private boolean isPostPurchaseAppInUse;

  /**
   * Webpage that the app starts in.
   */
  private String launchUrl;

  /**
   * Menu items for the app, which also appear as submenu items in left navigation sidebar in the Shopify admin.
   */
  private List<NavigationItem> navigationItems;

  /**
   * Whether the app was previously installed on the current shop.
   */
  private boolean previouslyInstalled;

  /**
   * Detailed information about the app pricing.
   */
  private String pricingDetails;

  /**
   * Summary of the app pricing details.
   */
  private String pricingDetailsSummary;

  /**
   * Link to app privacy policy.
   */
  private String privacyPolicyUrl;

  /**
   * The public category for the app.
   */
  private AppPublicCategory publicCategory;

  /**
   * Whether the app is published to the Shopify App Store.
   */
  private boolean published;

  /**
   * The access scopes requested by the app. Lists the access scopes the app has
   * declared in its configuration. Merchant must grant approval to these scopes
   * for the app to be installed.
   */
  private List<AccessScope> requestedAccessScopes;

  /**
   * Screenshots of the app.
   */
  private List<Image> screenshots;

  /**
   * Whether the app was developed by Shopify.
   */
  private boolean shopifyDeveloped;

  /**
   * Name of the app.
   */
  private String title;

  /**
   * Message that appears when the app is uninstalled. For example:
   * By removing this app, you will no longer be able to publish products to
   * MySocialSite or view this app in your Shopify admin. You can re-enable this
   * channel at any time.
   */
  private String uninstallMessage;

  /**
   * Webpage where you can uninstall the app.
   */
  private String uninstallUrl;

  /**
   * The webhook API version for the app.
   */
  private String webhookApiVersion;

  public App() {
  }

  /**
   * A unique application API identifier.
   */
  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  /**
   * App store page URL of the app.
   */
  public String getAppStoreAppUrl() {
    return appStoreAppUrl;
  }

  public void setAppStoreAppUrl(String appStoreAppUrl) {
    this.appStoreAppUrl = appStoreAppUrl;
  }

  /**
   * App store page URL of the developer who created the app.
   */
  public String getAppStoreDeveloperUrl() {
    return appStoreDeveloperUrl;
  }

  public void setAppStoreDeveloperUrl(String appStoreDeveloperUrl) {
    this.appStoreDeveloperUrl = appStoreDeveloperUrl;
  }

  /**
   * All requestable access scopes available to the app.
   */
  public List<AccessScope> getAvailableAccessScopes() {
    return availableAccessScopes;
  }

  public void setAvailableAccessScopes(List<AccessScope> availableAccessScopes) {
    this.availableAccessScopes = availableAccessScopes;
  }

  /**
   * Banner image for the app.
   */
  public Image getBanner() {
    return banner;
  }

  public void setBanner(Image banner) {
    this.banner = banner;
  }

  /**
   * Description of the app.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The name of the app developer.
   */
  public String getDeveloperName() {
    return developerName;
  }

  public void setDeveloperName(String developerName) {
    this.developerName = developerName;
  }

  /**
   * The type of app developer.
   */
  public AppDeveloperType getDeveloperType() {
    return developerType;
  }

  public void setDeveloperType(AppDeveloperType developerType) {
    this.developerType = developerType;
  }

  /**
   * Website of the developer who created the app.
   */
  public String getDeveloperUrl() {
    return developerUrl;
  }

  public void setDeveloperUrl(String developerUrl) {
    this.developerUrl = developerUrl;
  }

  /**
   * Whether the app uses the Embedded App SDK.
   */
  public boolean getEmbedded() {
    return embedded;
  }

  public void setEmbedded(boolean embedded) {
    this.embedded = embedded;
  }

  /**
   * Requirements that must be met before the app can be installed.
   */
  public List<FailedRequirement> getFailedRequirements() {
    return failedRequirements;
  }

  public void setFailedRequirements(List<FailedRequirement> failedRequirements) {
    this.failedRequirements = failedRequirements;
  }

  /**
   * A list of app features that are shown in the Shopify App Store listing.
   */
  public List<String> getFeatures() {
    return features;
  }

  public void setFeatures(List<String> features) {
    this.features = features;
  }

  /**
   * Feedback from this app about the store.
   */
  public AppFeedback getFeedback() {
    return feedback;
  }

  public void setFeedback(AppFeedback feedback) {
    this.feedback = feedback;
  }

  /**
   * Handle of the app.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * Icon that represents the app.
   */
  public Image getIcon() {
    return icon;
  }

  public void setIcon(Image icon) {
    this.icon = icon;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Webpage where you can install the app.
   */
  public String getInstallUrl() {
    return installUrl;
  }

  public void setInstallUrl(String installUrl) {
    this.installUrl = installUrl;
  }

  /**
   * Corresponding AppInstallation for this shop and App.
   * Returns null if the App is not installed.
   */
  public AppInstallation getInstallation() {
    return installation;
  }

  public void setInstallation(AppInstallation installation) {
    this.installation = installation;
  }

  /**
   * Whether the app is the [post purchase](https://shopify.dev/apps/checkout/post-purchase) app in use.
   */
  public boolean getIsPostPurchaseAppInUse() {
    return isPostPurchaseAppInUse;
  }

  public void setIsPostPurchaseAppInUse(boolean isPostPurchaseAppInUse) {
    this.isPostPurchaseAppInUse = isPostPurchaseAppInUse;
  }

  /**
   * Webpage that the app starts in.
   */
  public String getLaunchUrl() {
    return launchUrl;
  }

  public void setLaunchUrl(String launchUrl) {
    this.launchUrl = launchUrl;
  }

  /**
   * Menu items for the app, which also appear as submenu items in left navigation sidebar in the Shopify admin.
   */
  public List<NavigationItem> getNavigationItems() {
    return navigationItems;
  }

  public void setNavigationItems(List<NavigationItem> navigationItems) {
    this.navigationItems = navigationItems;
  }

  /**
   * Whether the app was previously installed on the current shop.
   */
  public boolean getPreviouslyInstalled() {
    return previouslyInstalled;
  }

  public void setPreviouslyInstalled(boolean previouslyInstalled) {
    this.previouslyInstalled = previouslyInstalled;
  }

  /**
   * Detailed information about the app pricing.
   */
  public String getPricingDetails() {
    return pricingDetails;
  }

  public void setPricingDetails(String pricingDetails) {
    this.pricingDetails = pricingDetails;
  }

  /**
   * Summary of the app pricing details.
   */
  public String getPricingDetailsSummary() {
    return pricingDetailsSummary;
  }

  public void setPricingDetailsSummary(String pricingDetailsSummary) {
    this.pricingDetailsSummary = pricingDetailsSummary;
  }

  /**
   * Link to app privacy policy.
   */
  public String getPrivacyPolicyUrl() {
    return privacyPolicyUrl;
  }

  public void setPrivacyPolicyUrl(String privacyPolicyUrl) {
    this.privacyPolicyUrl = privacyPolicyUrl;
  }

  /**
   * The public category for the app.
   */
  public AppPublicCategory getPublicCategory() {
    return publicCategory;
  }

  public void setPublicCategory(AppPublicCategory publicCategory) {
    this.publicCategory = publicCategory;
  }

  /**
   * Whether the app is published to the Shopify App Store.
   */
  public boolean getPublished() {
    return published;
  }

  public void setPublished(boolean published) {
    this.published = published;
  }

  /**
   * The access scopes requested by the app. Lists the access scopes the app has
   * declared in its configuration. Merchant must grant approval to these scopes
   * for the app to be installed.
   */
  public List<AccessScope> getRequestedAccessScopes() {
    return requestedAccessScopes;
  }

  public void setRequestedAccessScopes(List<AccessScope> requestedAccessScopes) {
    this.requestedAccessScopes = requestedAccessScopes;
  }

  /**
   * Screenshots of the app.
   */
  public List<Image> getScreenshots() {
    return screenshots;
  }

  public void setScreenshots(List<Image> screenshots) {
    this.screenshots = screenshots;
  }

  /**
   * Whether the app was developed by Shopify.
   */
  public boolean getShopifyDeveloped() {
    return shopifyDeveloped;
  }

  public void setShopifyDeveloped(boolean shopifyDeveloped) {
    this.shopifyDeveloped = shopifyDeveloped;
  }

  /**
   * Name of the app.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Message that appears when the app is uninstalled. For example:
   * By removing this app, you will no longer be able to publish products to
   * MySocialSite or view this app in your Shopify admin. You can re-enable this
   * channel at any time.
   */
  public String getUninstallMessage() {
    return uninstallMessage;
  }

  public void setUninstallMessage(String uninstallMessage) {
    this.uninstallMessage = uninstallMessage;
  }

  /**
   * Webpage where you can uninstall the app.
   */
  public String getUninstallUrl() {
    return uninstallUrl;
  }

  public void setUninstallUrl(String uninstallUrl) {
    this.uninstallUrl = uninstallUrl;
  }

  /**
   * The webhook API version for the app.
   */
  public String getWebhookApiVersion() {
    return webhookApiVersion;
  }

  public void setWebhookApiVersion(String webhookApiVersion) {
    this.webhookApiVersion = webhookApiVersion;
  }

  @Override
  public String toString() {
    return "App{apiKey='" + apiKey + "', appStoreAppUrl='" + appStoreAppUrl + "', appStoreDeveloperUrl='" + appStoreDeveloperUrl + "', availableAccessScopes='" + availableAccessScopes + "', banner='" + banner + "', description='" + description + "', developerName='" + developerName + "', developerType='" + developerType + "', developerUrl='" + developerUrl + "', embedded='" + embedded + "', failedRequirements='" + failedRequirements + "', features='" + features + "', feedback='" + feedback + "', handle='" + handle + "', icon='" + icon + "', id='" + id + "', installUrl='" + installUrl + "', installation='" + installation + "', isPostPurchaseAppInUse='" + isPostPurchaseAppInUse + "', launchUrl='" + launchUrl + "', navigationItems='" + navigationItems + "', previouslyInstalled='" + previouslyInstalled + "', pricingDetails='" + pricingDetails + "', pricingDetailsSummary='" + pricingDetailsSummary + "', privacyPolicyUrl='" + privacyPolicyUrl + "', publicCategory='" + publicCategory + "', published='" + published + "', requestedAccessScopes='" + requestedAccessScopes + "', screenshots='" + screenshots + "', shopifyDeveloped='" + shopifyDeveloped + "', title='" + title + "', uninstallMessage='" + uninstallMessage + "', uninstallUrl='" + uninstallUrl + "', webhookApiVersion='" + webhookApiVersion + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    App that = (App) o;
    return Objects.equals(apiKey, that.apiKey) &&
        Objects.equals(appStoreAppUrl, that.appStoreAppUrl) &&
        Objects.equals(appStoreDeveloperUrl, that.appStoreDeveloperUrl) &&
        Objects.equals(availableAccessScopes, that.availableAccessScopes) &&
        Objects.equals(banner, that.banner) &&
        Objects.equals(description, that.description) &&
        Objects.equals(developerName, that.developerName) &&
        Objects.equals(developerType, that.developerType) &&
        Objects.equals(developerUrl, that.developerUrl) &&
        embedded == that.embedded &&
        Objects.equals(failedRequirements, that.failedRequirements) &&
        Objects.equals(features, that.features) &&
        Objects.equals(feedback, that.feedback) &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(icon, that.icon) &&
        Objects.equals(id, that.id) &&
        Objects.equals(installUrl, that.installUrl) &&
        Objects.equals(installation, that.installation) &&
        isPostPurchaseAppInUse == that.isPostPurchaseAppInUse &&
        Objects.equals(launchUrl, that.launchUrl) &&
        Objects.equals(navigationItems, that.navigationItems) &&
        previouslyInstalled == that.previouslyInstalled &&
        Objects.equals(pricingDetails, that.pricingDetails) &&
        Objects.equals(pricingDetailsSummary, that.pricingDetailsSummary) &&
        Objects.equals(privacyPolicyUrl, that.privacyPolicyUrl) &&
        Objects.equals(publicCategory, that.publicCategory) &&
        published == that.published &&
        Objects.equals(requestedAccessScopes, that.requestedAccessScopes) &&
        Objects.equals(screenshots, that.screenshots) &&
        shopifyDeveloped == that.shopifyDeveloped &&
        Objects.equals(title, that.title) &&
        Objects.equals(uninstallMessage, that.uninstallMessage) &&
        Objects.equals(uninstallUrl, that.uninstallUrl) &&
        Objects.equals(webhookApiVersion, that.webhookApiVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, appStoreAppUrl, appStoreDeveloperUrl, availableAccessScopes, banner, description, developerName, developerType, developerUrl, embedded, failedRequirements, features, feedback, handle, icon, id, installUrl, installation, isPostPurchaseAppInUse, launchUrl, navigationItems, previouslyInstalled, pricingDetails, pricingDetailsSummary, privacyPolicyUrl, publicCategory, published, requestedAccessScopes, screenshots, shopifyDeveloped, title, uninstallMessage, uninstallUrl, webhookApiVersion);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A unique application API identifier.
     */
    private String apiKey;

    /**
     * App store page URL of the app.
     */
    private String appStoreAppUrl;

    /**
     * App store page URL of the developer who created the app.
     */
    private String appStoreDeveloperUrl;

    /**
     * All requestable access scopes available to the app.
     */
    private List<AccessScope> availableAccessScopes;

    /**
     * Banner image for the app.
     */
    private Image banner;

    /**
     * Description of the app.
     */
    private String description;

    /**
     * The name of the app developer.
     */
    private String developerName;

    /**
     * The type of app developer.
     */
    private AppDeveloperType developerType;

    /**
     * Website of the developer who created the app.
     */
    private String developerUrl;

    /**
     * Whether the app uses the Embedded App SDK.
     */
    private boolean embedded;

    /**
     * Requirements that must be met before the app can be installed.
     */
    private List<FailedRequirement> failedRequirements;

    /**
     * A list of app features that are shown in the Shopify App Store listing.
     */
    private List<String> features;

    /**
     * Feedback from this app about the store.
     */
    private AppFeedback feedback;

    /**
     * Handle of the app.
     */
    private String handle;

    /**
     * Icon that represents the app.
     */
    private Image icon;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * Webpage where you can install the app.
     */
    private String installUrl;

    /**
     * Corresponding AppInstallation for this shop and App.
     * Returns null if the App is not installed.
     */
    private AppInstallation installation;

    /**
     * Whether the app is the [post purchase](https://shopify.dev/apps/checkout/post-purchase) app in use.
     */
    private boolean isPostPurchaseAppInUse;

    /**
     * Webpage that the app starts in.
     */
    private String launchUrl;

    /**
     * Menu items for the app, which also appear as submenu items in left navigation sidebar in the Shopify admin.
     */
    private List<NavigationItem> navigationItems;

    /**
     * Whether the app was previously installed on the current shop.
     */
    private boolean previouslyInstalled;

    /**
     * Detailed information about the app pricing.
     */
    private String pricingDetails;

    /**
     * Summary of the app pricing details.
     */
    private String pricingDetailsSummary;

    /**
     * Link to app privacy policy.
     */
    private String privacyPolicyUrl;

    /**
     * The public category for the app.
     */
    private AppPublicCategory publicCategory;

    /**
     * Whether the app is published to the Shopify App Store.
     */
    private boolean published;

    /**
     * The access scopes requested by the app. Lists the access scopes the app has
     * declared in its configuration. Merchant must grant approval to these scopes
     * for the app to be installed.
     */
    private List<AccessScope> requestedAccessScopes;

    /**
     * Screenshots of the app.
     */
    private List<Image> screenshots;

    /**
     * Whether the app was developed by Shopify.
     */
    private boolean shopifyDeveloped;

    /**
     * Name of the app.
     */
    private String title;

    /**
     * Message that appears when the app is uninstalled. For example:
     * By removing this app, you will no longer be able to publish products to
     * MySocialSite or view this app in your Shopify admin. You can re-enable this
     * channel at any time.
     */
    private String uninstallMessage;

    /**
     * Webpage where you can uninstall the app.
     */
    private String uninstallUrl;

    /**
     * The webhook API version for the app.
     */
    private String webhookApiVersion;

    public App build() {
      App result = new App();
      result.apiKey = this.apiKey;
      result.appStoreAppUrl = this.appStoreAppUrl;
      result.appStoreDeveloperUrl = this.appStoreDeveloperUrl;
      result.availableAccessScopes = this.availableAccessScopes;
      result.banner = this.banner;
      result.description = this.description;
      result.developerName = this.developerName;
      result.developerType = this.developerType;
      result.developerUrl = this.developerUrl;
      result.embedded = this.embedded;
      result.failedRequirements = this.failedRequirements;
      result.features = this.features;
      result.feedback = this.feedback;
      result.handle = this.handle;
      result.icon = this.icon;
      result.id = this.id;
      result.installUrl = this.installUrl;
      result.installation = this.installation;
      result.isPostPurchaseAppInUse = this.isPostPurchaseAppInUse;
      result.launchUrl = this.launchUrl;
      result.navigationItems = this.navigationItems;
      result.previouslyInstalled = this.previouslyInstalled;
      result.pricingDetails = this.pricingDetails;
      result.pricingDetailsSummary = this.pricingDetailsSummary;
      result.privacyPolicyUrl = this.privacyPolicyUrl;
      result.publicCategory = this.publicCategory;
      result.published = this.published;
      result.requestedAccessScopes = this.requestedAccessScopes;
      result.screenshots = this.screenshots;
      result.shopifyDeveloped = this.shopifyDeveloped;
      result.title = this.title;
      result.uninstallMessage = this.uninstallMessage;
      result.uninstallUrl = this.uninstallUrl;
      result.webhookApiVersion = this.webhookApiVersion;
      return result;
    }

    /**
     * A unique application API identifier.
     */
    public Builder apiKey(String apiKey) {
      this.apiKey = apiKey;
      return this;
    }

    /**
     * App store page URL of the app.
     */
    public Builder appStoreAppUrl(String appStoreAppUrl) {
      this.appStoreAppUrl = appStoreAppUrl;
      return this;
    }

    /**
     * App store page URL of the developer who created the app.
     */
    public Builder appStoreDeveloperUrl(String appStoreDeveloperUrl) {
      this.appStoreDeveloperUrl = appStoreDeveloperUrl;
      return this;
    }

    /**
     * All requestable access scopes available to the app.
     */
    public Builder availableAccessScopes(List<AccessScope> availableAccessScopes) {
      this.availableAccessScopes = availableAccessScopes;
      return this;
    }

    /**
     * Banner image for the app.
     */
    public Builder banner(Image banner) {
      this.banner = banner;
      return this;
    }

    /**
     * Description of the app.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * The name of the app developer.
     */
    public Builder developerName(String developerName) {
      this.developerName = developerName;
      return this;
    }

    /**
     * The type of app developer.
     */
    public Builder developerType(AppDeveloperType developerType) {
      this.developerType = developerType;
      return this;
    }

    /**
     * Website of the developer who created the app.
     */
    public Builder developerUrl(String developerUrl) {
      this.developerUrl = developerUrl;
      return this;
    }

    /**
     * Whether the app uses the Embedded App SDK.
     */
    public Builder embedded(boolean embedded) {
      this.embedded = embedded;
      return this;
    }

    /**
     * Requirements that must be met before the app can be installed.
     */
    public Builder failedRequirements(List<FailedRequirement> failedRequirements) {
      this.failedRequirements = failedRequirements;
      return this;
    }

    /**
     * A list of app features that are shown in the Shopify App Store listing.
     */
    public Builder features(List<String> features) {
      this.features = features;
      return this;
    }

    /**
     * Feedback from this app about the store.
     */
    public Builder feedback(AppFeedback feedback) {
      this.feedback = feedback;
      return this;
    }

    /**
     * Handle of the app.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    /**
     * Icon that represents the app.
     */
    public Builder icon(Image icon) {
      this.icon = icon;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Webpage where you can install the app.
     */
    public Builder installUrl(String installUrl) {
      this.installUrl = installUrl;
      return this;
    }

    /**
     * Corresponding AppInstallation for this shop and App.
     * Returns null if the App is not installed.
     */
    public Builder installation(AppInstallation installation) {
      this.installation = installation;
      return this;
    }

    /**
     * Whether the app is the [post purchase](https://shopify.dev/apps/checkout/post-purchase) app in use.
     */
    public Builder isPostPurchaseAppInUse(boolean isPostPurchaseAppInUse) {
      this.isPostPurchaseAppInUse = isPostPurchaseAppInUse;
      return this;
    }

    /**
     * Webpage that the app starts in.
     */
    public Builder launchUrl(String launchUrl) {
      this.launchUrl = launchUrl;
      return this;
    }

    /**
     * Menu items for the app, which also appear as submenu items in left navigation sidebar in the Shopify admin.
     */
    public Builder navigationItems(List<NavigationItem> navigationItems) {
      this.navigationItems = navigationItems;
      return this;
    }

    /**
     * Whether the app was previously installed on the current shop.
     */
    public Builder previouslyInstalled(boolean previouslyInstalled) {
      this.previouslyInstalled = previouslyInstalled;
      return this;
    }

    /**
     * Detailed information about the app pricing.
     */
    public Builder pricingDetails(String pricingDetails) {
      this.pricingDetails = pricingDetails;
      return this;
    }

    /**
     * Summary of the app pricing details.
     */
    public Builder pricingDetailsSummary(String pricingDetailsSummary) {
      this.pricingDetailsSummary = pricingDetailsSummary;
      return this;
    }

    /**
     * Link to app privacy policy.
     */
    public Builder privacyPolicyUrl(String privacyPolicyUrl) {
      this.privacyPolicyUrl = privacyPolicyUrl;
      return this;
    }

    /**
     * The public category for the app.
     */
    public Builder publicCategory(AppPublicCategory publicCategory) {
      this.publicCategory = publicCategory;
      return this;
    }

    /**
     * Whether the app is published to the Shopify App Store.
     */
    public Builder published(boolean published) {
      this.published = published;
      return this;
    }

    /**
     * The access scopes requested by the app. Lists the access scopes the app has
     * declared in its configuration. Merchant must grant approval to these scopes
     * for the app to be installed.
     */
    public Builder requestedAccessScopes(List<AccessScope> requestedAccessScopes) {
      this.requestedAccessScopes = requestedAccessScopes;
      return this;
    }

    /**
     * Screenshots of the app.
     */
    public Builder screenshots(List<Image> screenshots) {
      this.screenshots = screenshots;
      return this;
    }

    /**
     * Whether the app was developed by Shopify.
     */
    public Builder shopifyDeveloped(boolean shopifyDeveloped) {
      this.shopifyDeveloped = shopifyDeveloped;
      return this;
    }

    /**
     * Name of the app.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * Message that appears when the app is uninstalled. For example:
     * By removing this app, you will no longer be able to publish products to
     * MySocialSite or view this app in your Shopify admin. You can re-enable this
     * channel at any time.
     */
    public Builder uninstallMessage(String uninstallMessage) {
      this.uninstallMessage = uninstallMessage;
      return this;
    }

    /**
     * Webpage where you can uninstall the app.
     */
    public Builder uninstallUrl(String uninstallUrl) {
      this.uninstallUrl = uninstallUrl;
      return this;
    }

    /**
     * The webhook API version for the app.
     */
    public Builder webhookApiVersion(String webhookApiVersion) {
      this.webhookApiVersion = webhookApiVersion;
      return this;
    }
  }
}
