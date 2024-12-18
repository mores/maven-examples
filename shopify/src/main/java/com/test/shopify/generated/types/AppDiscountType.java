package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A script that defines a discount type.
 */
public class AppDiscountType {
  /**
   * The app providing the app discount type.
   */
  private App app;

  /**
   * The App Bridge details for discount type configuration.
   */
  private FunctionsAppBridge appBridge;

  /**
   * The client ID of the app providing the app discount type.
   */
  private String appKey;

  /**
   * A description of the app discount type.
   */
  private String description;

  /**
   * The class of the app discount type.
   */
  private DiscountClass discountClass;

  /**
   * The ID of the function providing the app discount type.
   */
  private String functionId;

  /**
   * The target type of the app discount type. Possible values: `SHIPPING_LINE` and `LINE_ITEM`.
   */
  private DiscountApplicationTargetType targetType;

  /**
   * The title of the app discount type.
   */
  private String title;

  public AppDiscountType() {
  }

  /**
   * The app providing the app discount type.
   */
  public App getApp() {
    return app;
  }

  public void setApp(App app) {
    this.app = app;
  }

  /**
   * The App Bridge details for discount type configuration.
   */
  public FunctionsAppBridge getAppBridge() {
    return appBridge;
  }

  public void setAppBridge(FunctionsAppBridge appBridge) {
    this.appBridge = appBridge;
  }

  /**
   * The client ID of the app providing the app discount type.
   */
  public String getAppKey() {
    return appKey;
  }

  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  /**
   * A description of the app discount type.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The class of the app discount type.
   */
  public DiscountClass getDiscountClass() {
    return discountClass;
  }

  public void setDiscountClass(DiscountClass discountClass) {
    this.discountClass = discountClass;
  }

  /**
   * The ID of the function providing the app discount type.
   */
  public String getFunctionId() {
    return functionId;
  }

  public void setFunctionId(String functionId) {
    this.functionId = functionId;
  }

  /**
   * The target type of the app discount type. Possible values: `SHIPPING_LINE` and `LINE_ITEM`.
   */
  public DiscountApplicationTargetType getTargetType() {
    return targetType;
  }

  public void setTargetType(DiscountApplicationTargetType targetType) {
    this.targetType = targetType;
  }

  /**
   * The title of the app discount type.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "AppDiscountType{app='" + app + "', appBridge='" + appBridge + "', appKey='" + appKey + "', description='" + description + "', discountClass='" + discountClass + "', functionId='" + functionId + "', targetType='" + targetType + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppDiscountType that = (AppDiscountType) o;
    return Objects.equals(app, that.app) &&
        Objects.equals(appBridge, that.appBridge) &&
        Objects.equals(appKey, that.appKey) &&
        Objects.equals(description, that.description) &&
        Objects.equals(discountClass, that.discountClass) &&
        Objects.equals(functionId, that.functionId) &&
        Objects.equals(targetType, that.targetType) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, appBridge, appKey, description, discountClass, functionId, targetType, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The app providing the app discount type.
     */
    private App app;

    /**
     * The App Bridge details for discount type configuration.
     */
    private FunctionsAppBridge appBridge;

    /**
     * The client ID of the app providing the app discount type.
     */
    private String appKey;

    /**
     * A description of the app discount type.
     */
    private String description;

    /**
     * The class of the app discount type.
     */
    private DiscountClass discountClass;

    /**
     * The ID of the function providing the app discount type.
     */
    private String functionId;

    /**
     * The target type of the app discount type. Possible values: `SHIPPING_LINE` and `LINE_ITEM`.
     */
    private DiscountApplicationTargetType targetType;

    /**
     * The title of the app discount type.
     */
    private String title;

    public AppDiscountType build() {
      AppDiscountType result = new AppDiscountType();
      result.app = this.app;
      result.appBridge = this.appBridge;
      result.appKey = this.appKey;
      result.description = this.description;
      result.discountClass = this.discountClass;
      result.functionId = this.functionId;
      result.targetType = this.targetType;
      result.title = this.title;
      return result;
    }

    /**
     * The app providing the app discount type.
     */
    public Builder app(App app) {
      this.app = app;
      return this;
    }

    /**
     * The App Bridge details for discount type configuration.
     */
    public Builder appBridge(FunctionsAppBridge appBridge) {
      this.appBridge = appBridge;
      return this;
    }

    /**
     * The client ID of the app providing the app discount type.
     */
    public Builder appKey(String appKey) {
      this.appKey = appKey;
      return this;
    }

    /**
     * A description of the app discount type.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * The class of the app discount type.
     */
    public Builder discountClass(DiscountClass discountClass) {
      this.discountClass = discountClass;
      return this;
    }

    /**
     * The ID of the function providing the app discount type.
     */
    public Builder functionId(String functionId) {
      this.functionId = functionId;
      return this;
    }

    /**
     * The target type of the app discount type. Possible values: `SHIPPING_LINE` and `LINE_ITEM`.
     */
    public Builder targetType(DiscountApplicationTargetType targetType) {
      this.targetType = targetType;
      return this;
    }

    /**
     * The title of the app discount type.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
