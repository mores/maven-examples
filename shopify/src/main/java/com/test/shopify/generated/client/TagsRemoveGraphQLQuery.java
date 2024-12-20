package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Remove tags from an order, a draft order, a customer, a product, or an online store article.
 */
public class TagsRemoveGraphQLQuery extends GraphQLQuery {
  public TagsRemoveGraphQLQuery(String id, List<String> tags, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (tags != null || fieldsSet.contains("tags")) {
        getInput().put("tags", tags);
    }
  }

  public TagsRemoveGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "tagsRemove";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private List<String> tags;

    private String queryName;

    public TagsRemoveGraphQLQuery build() {
      return new TagsRemoveGraphQLQuery(id, tags, queryName, fieldsSet);
               
    }

    /**
     * The ID of the resource to remove tags from.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * A list of tags to remove from the resource in the form of an array of
     * strings. Example value: `["tag1", "tag2", "tag3"]`.
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      this.fieldsSet.add("tags");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
