package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for an EventBridge webhook subscription.
 */
public class EventBridgeWebhookSubscriptionInput {
  /**
   * The ARN of the EventBridge partner event source.
   */
  private String arn;

  /**
   * The format in which the webhook subscription should send the data.
   */
  private WebhookSubscriptionFormat format;

  /**
   * The list of fields to be included in the webhook subscription.
   */
  private List<String> includeFields;

  /**
   * The list of namespaces for any metafields that should be included in the webhook subscription.
   */
  private List<String> metafieldNamespaces;

  public EventBridgeWebhookSubscriptionInput() {
  }

  /**
   * The ARN of the EventBridge partner event source.
   */
  public String getArn() {
    return arn;
  }

  public void setArn(String arn) {
    this.arn = arn;
  }

  /**
   * The format in which the webhook subscription should send the data.
   */
  public WebhookSubscriptionFormat getFormat() {
    return format;
  }

  public void setFormat(WebhookSubscriptionFormat format) {
    this.format = format;
  }

  /**
   * The list of fields to be included in the webhook subscription.
   */
  public List<String> getIncludeFields() {
    return includeFields;
  }

  public void setIncludeFields(List<String> includeFields) {
    this.includeFields = includeFields;
  }

  /**
   * The list of namespaces for any metafields that should be included in the webhook subscription.
   */
  public List<String> getMetafieldNamespaces() {
    return metafieldNamespaces;
  }

  public void setMetafieldNamespaces(List<String> metafieldNamespaces) {
    this.metafieldNamespaces = metafieldNamespaces;
  }

  @Override
  public String toString() {
    return "EventBridgeWebhookSubscriptionInput{arn='" + arn + "', format='" + format + "', includeFields='" + includeFields + "', metafieldNamespaces='" + metafieldNamespaces + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EventBridgeWebhookSubscriptionInput that = (EventBridgeWebhookSubscriptionInput) o;
    return Objects.equals(arn, that.arn) &&
        Objects.equals(format, that.format) &&
        Objects.equals(includeFields, that.includeFields) &&
        Objects.equals(metafieldNamespaces, that.metafieldNamespaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arn, format, includeFields, metafieldNamespaces);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ARN of the EventBridge partner event source.
     */
    private String arn;

    /**
     * The format in which the webhook subscription should send the data.
     */
    private WebhookSubscriptionFormat format;

    /**
     * The list of fields to be included in the webhook subscription.
     */
    private List<String> includeFields;

    /**
     * The list of namespaces for any metafields that should be included in the webhook subscription.
     */
    private List<String> metafieldNamespaces;

    public EventBridgeWebhookSubscriptionInput build() {
      EventBridgeWebhookSubscriptionInput result = new EventBridgeWebhookSubscriptionInput();
      result.arn = this.arn;
      result.format = this.format;
      result.includeFields = this.includeFields;
      result.metafieldNamespaces = this.metafieldNamespaces;
      return result;
    }

    /**
     * The ARN of the EventBridge partner event source.
     */
    public Builder arn(String arn) {
      this.arn = arn;
      return this;
    }

    /**
     * The format in which the webhook subscription should send the data.
     */
    public Builder format(WebhookSubscriptionFormat format) {
      this.format = format;
      return this;
    }

    /**
     * The list of fields to be included in the webhook subscription.
     */
    public Builder includeFields(List<String> includeFields) {
      this.includeFields = includeFields;
      return this;
    }

    /**
     * The list of namespaces for any metafields that should be included in the webhook subscription.
     */
    public Builder metafieldNamespaces(List<String> metafieldNamespaces) {
      this.metafieldNamespaces = metafieldNamespaces;
      return this;
    }
  }
}
