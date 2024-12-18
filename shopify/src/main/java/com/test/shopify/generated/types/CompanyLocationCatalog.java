package com.test.shopify.generated.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A list of products with publishing and pricing information associated with company locations.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CompanyLocationCatalog implements com.test.shopify.generated.types.Catalog, com.test.shopify.generated.types.Node {
  /**
   * The company locations associated with the catalog.
   */
  private CompanyLocationConnection companyLocations;

  /**
   * The number of company locations associated with the catalog.
   */
  private int companyLocationsCount;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * Most recent catalog operations.
   */
  private List<ResourceOperation> operations;

  /**
   * The price list associated with the catalog.
   */
  private PriceList priceList;

  /**
   * A group of products and collections that's published to a catalog.
   */
  private Publication publication;

  /**
   * The status of the catalog.
   */
  private CatalogStatus status;

  /**
   * The name of the catalog.
   */
  private String title;

  public CompanyLocationCatalog() {
  }

  /**
   * The company locations associated with the catalog.
   */
  public CompanyLocationConnection getCompanyLocations() {
    return companyLocations;
  }

  public void setCompanyLocations(CompanyLocationConnection companyLocations) {
    this.companyLocations = companyLocations;
  }

  /**
   * The number of company locations associated with the catalog.
   */
  public int getCompanyLocationsCount() {
    return companyLocationsCount;
  }

  public void setCompanyLocationsCount(int companyLocationsCount) {
    this.companyLocationsCount = companyLocationsCount;
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
   * Most recent catalog operations.
   */
  public List<ResourceOperation> getOperations() {
    return operations;
  }

  public void setOperations(List<ResourceOperation> operations) {
    this.operations = operations;
  }

  /**
   * The price list associated with the catalog.
   */
  public PriceList getPriceList() {
    return priceList;
  }

  public void setPriceList(PriceList priceList) {
    this.priceList = priceList;
  }

  /**
   * A group of products and collections that's published to a catalog.
   */
  public Publication getPublication() {
    return publication;
  }

  public void setPublication(Publication publication) {
    this.publication = publication;
  }

  /**
   * The status of the catalog.
   */
  public CatalogStatus getStatus() {
    return status;
  }

  public void setStatus(CatalogStatus status) {
    this.status = status;
  }

  /**
   * The name of the catalog.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "CompanyLocationCatalog{companyLocations='" + companyLocations + "', companyLocationsCount='" + companyLocationsCount + "', id='" + id + "', operations='" + operations + "', priceList='" + priceList + "', publication='" + publication + "', status='" + status + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyLocationCatalog that = (CompanyLocationCatalog) o;
    return Objects.equals(companyLocations, that.companyLocations) &&
        companyLocationsCount == that.companyLocationsCount &&
        Objects.equals(id, that.id) &&
        Objects.equals(operations, that.operations) &&
        Objects.equals(priceList, that.priceList) &&
        Objects.equals(publication, that.publication) &&
        Objects.equals(status, that.status) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyLocations, companyLocationsCount, id, operations, priceList, publication, status, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The company locations associated with the catalog.
     */
    private CompanyLocationConnection companyLocations;

    /**
     * The number of company locations associated with the catalog.
     */
    private int companyLocationsCount;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * Most recent catalog operations.
     */
    private List<ResourceOperation> operations;

    /**
     * The price list associated with the catalog.
     */
    private PriceList priceList;

    /**
     * A group of products and collections that's published to a catalog.
     */
    private Publication publication;

    /**
     * The status of the catalog.
     */
    private CatalogStatus status;

    /**
     * The name of the catalog.
     */
    private String title;

    public CompanyLocationCatalog build() {
      CompanyLocationCatalog result = new CompanyLocationCatalog();
      result.companyLocations = this.companyLocations;
      result.companyLocationsCount = this.companyLocationsCount;
      result.id = this.id;
      result.operations = this.operations;
      result.priceList = this.priceList;
      result.publication = this.publication;
      result.status = this.status;
      result.title = this.title;
      return result;
    }

    /**
     * The company locations associated with the catalog.
     */
    public Builder companyLocations(CompanyLocationConnection companyLocations) {
      this.companyLocations = companyLocations;
      return this;
    }

    /**
     * The number of company locations associated with the catalog.
     */
    public Builder companyLocationsCount(int companyLocationsCount) {
      this.companyLocationsCount = companyLocationsCount;
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
     * Most recent catalog operations.
     */
    public Builder operations(List<ResourceOperation> operations) {
      this.operations = operations;
      return this;
    }

    /**
     * The price list associated with the catalog.
     */
    public Builder priceList(PriceList priceList) {
      this.priceList = priceList;
      return this;
    }

    /**
     * A group of products and collections that's published to a catalog.
     */
    public Builder publication(Publication publication) {
      this.publication = publication;
      return this;
    }

    /**
     * The status of the catalog.
     */
    public Builder status(CatalogStatus status) {
      this.status = status;
      return this;
    }

    /**
     * The name of the catalog.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
