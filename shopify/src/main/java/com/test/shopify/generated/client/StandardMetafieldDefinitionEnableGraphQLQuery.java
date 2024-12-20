package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.MetafieldOwnerType;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Activates the specified standard metafield definition from its template.
 *   
 * Refer to the [list of standard metafield definition templates](https://shopify.dev/apps/metafields/definitions/standard-definitions).
 */
public class StandardMetafieldDefinitionEnableGraphQLQuery extends GraphQLQuery {
  public StandardMetafieldDefinitionEnableGraphQLQuery(MetafieldOwnerType ownerType, String id,
      String namespace, String key, boolean pin, Boolean visibleToStorefrontApi,
      Boolean useAsCollectionCondition, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (ownerType != null || fieldsSet.contains("ownerType")) {
        getInput().put("ownerType", ownerType);
    }if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (namespace != null || fieldsSet.contains("namespace")) {
        getInput().put("namespace", namespace);
    }if (key != null || fieldsSet.contains("key")) {
        getInput().put("key", key);
    }getInput().put("pin", pin);                   if (visibleToStorefrontApi != null || fieldsSet.contains("visibleToStorefrontApi")) {
        getInput().put("visibleToStorefrontApi", visibleToStorefrontApi);
    }if (useAsCollectionCondition != null || fieldsSet.contains("useAsCollectionCondition")) {
        getInput().put("useAsCollectionCondition", useAsCollectionCondition);
    }
  }

  public StandardMetafieldDefinitionEnableGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "standardMetafieldDefinitionEnable";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private MetafieldOwnerType ownerType;

    private String id;

    private String namespace;

    private String key;

    private boolean pin;

    private Boolean visibleToStorefrontApi;

    private Boolean useAsCollectionCondition;

    private String queryName;

    public StandardMetafieldDefinitionEnableGraphQLQuery build() {
      return new StandardMetafieldDefinitionEnableGraphQLQuery(ownerType, id, namespace, key, pin, visibleToStorefrontApi, useAsCollectionCondition, queryName, fieldsSet);
               
    }

    /**
     * The resource type that the metafield definition is scoped to.
     */
    public Builder ownerType(MetafieldOwnerType ownerType) {
      this.ownerType = ownerType;
      this.fieldsSet.add("ownerType");
      return this;
    }

    /**
     * The ID of the standard metafield definition template to enable.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The namespace of the standard metafield to enable. Used in combination with `key`.
     */
    public Builder namespace(String namespace) {
      this.namespace = namespace;
      this.fieldsSet.add("namespace");
      return this;
    }

    /**
     * The key of the standard metafield to enable. Used in combination with `namespace`.
     */
    public Builder key(String key) {
      this.key = key;
      this.fieldsSet.add("key");
      return this;
    }

    /**
     * Whether to pin the metafield definition.
     */
    public Builder pin(boolean pin) {
      this.pin = pin;
      this.fieldsSet.add("pin");
      return this;
    }

    /**
     * Whether metafields for the definition are visible using the Storefront API.
     */
    public Builder visibleToStorefrontApi(Boolean visibleToStorefrontApi) {
      this.visibleToStorefrontApi = visibleToStorefrontApi;
      this.fieldsSet.add("visibleToStorefrontApi");
      return this;
    }

    /**
     * Whether the metafield definition can be used as a collection condition.
     */
    public Builder useAsCollectionCondition(Boolean useAsCollectionCondition) {
      this.useAsCollectionCondition = useAsCollectionCondition;
      this.fieldsSet.add("useAsCollectionCondition");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
