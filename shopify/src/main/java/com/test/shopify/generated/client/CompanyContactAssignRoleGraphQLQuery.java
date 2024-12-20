package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Assigns a role to a contact for a location.
 */
public class CompanyContactAssignRoleGraphQLQuery extends GraphQLQuery {
  public CompanyContactAssignRoleGraphQLQuery(String companyContactId, String companyContactRoleId,
      String companyLocationId, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyContactId != null || fieldsSet.contains("companyContactId")) {
        getInput().put("companyContactId", companyContactId);
    }if (companyContactRoleId != null || fieldsSet.contains("companyContactRoleId")) {
        getInput().put("companyContactRoleId", companyContactRoleId);
    }if (companyLocationId != null || fieldsSet.contains("companyLocationId")) {
        getInput().put("companyLocationId", companyLocationId);
    }
  }

  public CompanyContactAssignRoleGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyContactAssignRole";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String companyContactId;

    private String companyContactRoleId;

    private String companyLocationId;

    private String queryName;

    public CompanyContactAssignRoleGraphQLQuery build() {
      return new CompanyContactAssignRoleGraphQLQuery(companyContactId, companyContactRoleId, companyLocationId, queryName, fieldsSet);
               
    }

    /**
     * The ID of the contact to assign a role to.
     */
    public Builder companyContactId(String companyContactId) {
      this.companyContactId = companyContactId;
      this.fieldsSet.add("companyContactId");
      return this;
    }

    /**
     * The ID of the role to assign to a contact.
     */
    public Builder companyContactRoleId(String companyContactRoleId) {
      this.companyContactRoleId = companyContactRoleId;
      this.fieldsSet.add("companyContactRoleId");
      return this;
    }

    /**
     * The ID of the location to assign a role to a contact.
     */
    public Builder companyLocationId(String companyLocationId) {
      this.companyLocationId = companyLocationId;
      this.fieldsSet.add("companyLocationId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
