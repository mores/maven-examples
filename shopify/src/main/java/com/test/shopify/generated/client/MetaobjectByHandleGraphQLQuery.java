package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.MetaobjectHandleInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Retrieves a metaobject by handle.
 */
public class MetaobjectByHandleGraphQLQuery extends GraphQLQuery {
  public MetaobjectByHandleGraphQLQuery(MetaobjectHandleInput handle, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (handle != null || fieldsSet.contains("handle")) {
        getInput().put("handle", handle);
    }
  }

  public MetaobjectByHandleGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "metaobjectByHandle";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private MetaobjectHandleInput handle;

    private String queryName;

    public MetaobjectByHandleGraphQLQuery build() {
      return new MetaobjectByHandleGraphQLQuery(handle, queryName, fieldsSet);
               
    }

    /**
     * The identifier of the metaobject to return.
     */
    public Builder handle(MetaobjectHandleInput handle) {
      this.handle = handle;
      this.fieldsSet.add("handle");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
