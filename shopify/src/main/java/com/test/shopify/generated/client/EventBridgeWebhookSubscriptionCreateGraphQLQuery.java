package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.EventBridgeWebhookSubscriptionInput;
import com.test.shopify.generated.types.WebhookSubscriptionTopic;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a new Amazon EventBridge webhook subscription.
 *   
 * Building an app? If you only use app-specific webhooks, you won't need this.
 * App-specific webhook subscriptions specified in your `shopify.app.toml` may be
 * easier. They are automatically kept up to date by Shopify & require less
 * maintenance. Please read [About managing webhook
 * subscriptions](https://shopify.dev/docs/apps/build/webhooks/subscribe).
 */
public class EventBridgeWebhookSubscriptionCreateGraphQLQuery extends GraphQLQuery {
  public EventBridgeWebhookSubscriptionCreateGraphQLQuery(WebhookSubscriptionTopic topic,
      EventBridgeWebhookSubscriptionInput webhookSubscription, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (topic != null || fieldsSet.contains("topic")) {
        getInput().put("topic", topic);
    }if (webhookSubscription != null || fieldsSet.contains("webhookSubscription")) {
        getInput().put("webhookSubscription", webhookSubscription);
    }
  }

  public EventBridgeWebhookSubscriptionCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "eventBridgeWebhookSubscriptionCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private WebhookSubscriptionTopic topic;

    private EventBridgeWebhookSubscriptionInput webhookSubscription;

    private String queryName;

    public EventBridgeWebhookSubscriptionCreateGraphQLQuery build() {
      return new EventBridgeWebhookSubscriptionCreateGraphQLQuery(topic, webhookSubscription, queryName, fieldsSet);
               
    }

    /**
     * The type of event that triggers the webhook.
     */
    public Builder topic(WebhookSubscriptionTopic topic) {
      this.topic = topic;
      this.fieldsSet.add("topic");
      return this;
    }

    /**
     * Specifies the input fields for an EventBridge webhook subscription.
     */
    public Builder webhookSubscription(EventBridgeWebhookSubscriptionInput webhookSubscription) {
      this.webhookSubscription = webhookSubscription;
      this.fieldsSet.add("webhookSubscription");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
