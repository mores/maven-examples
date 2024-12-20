package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.test.shopify.generated.types.CompanyLocationRoleAssign;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Assigns roles on a company location.
 */
public class CompanyLocationAssignRolesGraphQLQuery extends GraphQLQuery {
  public CompanyLocationAssignRolesGraphQLQuery(String companyLocationId,
      List<CompanyLocationRoleAssign> rolesToAssign, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyLocationId != null || fieldsSet.contains("companyLocationId")) {
        getInput().put("companyLocationId", companyLocationId);
    }if (rolesToAssign != null || fieldsSet.contains("rolesToAssign")) {
        getInput().put("rolesToAssign", rolesToAssign);
    }
  }

  public CompanyLocationAssignRolesGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyLocationAssignRoles";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String companyLocationId;

    private List<CompanyLocationRoleAssign> rolesToAssign;

    private String queryName;

    public CompanyLocationAssignRolesGraphQLQuery build() {
      return new CompanyLocationAssignRolesGraphQLQuery(companyLocationId, rolesToAssign, queryName, fieldsSet);
               
    }

    /**
     * The location whose roles are being assigned.
     */
    public Builder companyLocationId(String companyLocationId) {
      this.companyLocationId = companyLocationId;
      this.fieldsSet.add("companyLocationId");
      return this;
    }

    /**
     * The roles to assign.
     */
    public Builder rolesToAssign(List<CompanyLocationRoleAssign> rolesToAssign) {
      this.rolesToAssign = rolesToAssign;
      this.fieldsSet.add("rolesToAssign");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
