package com.test.shopify.generated.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Represents information about a company which is also a customer of the shop.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Company implements MetafieldReference, MetafieldReferencer, com.test.shopify.generated.types.CommentEventSubject, com.test.shopify.generated.types.HasEvents, com.test.shopify.generated.types.HasMetafieldDefinitions, com.test.shopify.generated.types.HasMetafields, com.test.shopify.generated.types.Navigable, com.test.shopify.generated.types.Node {
  /**
   * The number of contacts that belong to the company.
   */
  private int contactCount;

  /**
   * The list of roles for the company contacts.
   */
  private CompanyContactRoleConnection contactRoles;

  /**
   * The list of contacts in the company.
   */
  private CompanyContactConnection contacts;

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) at which the company was created in Shopify.
   */
  private OffsetDateTime createdAt;

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) at which the company became the customer.
   */
  private OffsetDateTime customerSince;

  /**
   * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
   * returns the single next record, sorted ascending by ID.
   */
  private String defaultCursor;

  /**
   * The role proposed by default for a contact at the company.
   */
  private CompanyContactRole defaultRole;

  /**
   * The list of the company's draft orders.
   */
  private DraftOrderConnection draftOrders;

  /**
   * The paginated list of events associated with the host subject.
   */
  private EventConnection events;

  /**
   * A unique externally-supplied ID for the company.
   */
  private String externalId;

  /**
   * Whether the merchant added a timeline comment to the company.
   */
  private boolean hasTimelineComment;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The lifetime duration of the company, since it became a customer of the shop. Examples: `2 days`, `3 months`, `1 year`.
   */
  private String lifetimeDuration;

  /**
   * The number of locations that belong to the company.
   */
  private int locationCount;

  /**
   * The list of locations in the company.
   */
  private CompanyLocationConnection locations;

  /**
   * The main contact for the company.
   */
  private CompanyContact mainContact;

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
   * including its `namespace` and `key`, that's associated with a Shopify resource
   * for the purposes of adding and storing additional information.
   */
  private Metafield metafield;

  /**
   * List of metafield definitions.
   */
  private MetafieldDefinitionConnection metafieldDefinitions;

  /**
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  private MetafieldConnection metafields;

  /**
   * The name of the company.
   */
  private String name;

  /**
   * A note about the company.
   */
  private String note;

  /**
   * The total number of orders placed for this company, across all its locations.
   */
  private int orderCount;

  /**
   * The list of the company's orders.
   */
  private OrderConnection orders;

  /**
   * Returns a private metafield by namespace and key that belongs to the resource.
   */
  private PrivateMetafield privateMetafield;

  /**
   * List of private metafields that belong to the resource.
   */
  private PrivateMetafieldConnection privateMetafields;

  /**
   * The total amount spent by this company, across all its locations.
   */
  private MoneyV2 totalSpent;

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) at which the company was last modified.
   */
  private OffsetDateTime updatedAt;

  public Company() {
  }

  /**
   * The number of contacts that belong to the company.
   */
  public int getContactCount() {
    return contactCount;
  }

  public void setContactCount(int contactCount) {
    this.contactCount = contactCount;
  }

  /**
   * The list of roles for the company contacts.
   */
  public CompanyContactRoleConnection getContactRoles() {
    return contactRoles;
  }

  public void setContactRoles(CompanyContactRoleConnection contactRoles) {
    this.contactRoles = contactRoles;
  }

  /**
   * The list of contacts in the company.
   */
  public CompanyContactConnection getContacts() {
    return contacts;
  }

  public void setContacts(CompanyContactConnection contacts) {
    this.contacts = contacts;
  }

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) at which the company was created in Shopify.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) at which the company became the customer.
   */
  public OffsetDateTime getCustomerSince() {
    return customerSince;
  }

  public void setCustomerSince(OffsetDateTime customerSince) {
    this.customerSince = customerSince;
  }

  /**
   * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
   * returns the single next record, sorted ascending by ID.
   */
  public String getDefaultCursor() {
    return defaultCursor;
  }

  public void setDefaultCursor(String defaultCursor) {
    this.defaultCursor = defaultCursor;
  }

  /**
   * The role proposed by default for a contact at the company.
   */
  public CompanyContactRole getDefaultRole() {
    return defaultRole;
  }

  public void setDefaultRole(CompanyContactRole defaultRole) {
    this.defaultRole = defaultRole;
  }

  /**
   * The list of the company's draft orders.
   */
  public DraftOrderConnection getDraftOrders() {
    return draftOrders;
  }

  public void setDraftOrders(DraftOrderConnection draftOrders) {
    this.draftOrders = draftOrders;
  }

  /**
   * The paginated list of events associated with the host subject.
   */
  public EventConnection getEvents() {
    return events;
  }

  public void setEvents(EventConnection events) {
    this.events = events;
  }

  /**
   * A unique externally-supplied ID for the company.
   */
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  /**
   * Whether the merchant added a timeline comment to the company.
   */
  public boolean getHasTimelineComment() {
    return hasTimelineComment;
  }

  public void setHasTimelineComment(boolean hasTimelineComment) {
    this.hasTimelineComment = hasTimelineComment;
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
   * The lifetime duration of the company, since it became a customer of the shop. Examples: `2 days`, `3 months`, `1 year`.
   */
  public String getLifetimeDuration() {
    return lifetimeDuration;
  }

  public void setLifetimeDuration(String lifetimeDuration) {
    this.lifetimeDuration = lifetimeDuration;
  }

  /**
   * The number of locations that belong to the company.
   */
  public int getLocationCount() {
    return locationCount;
  }

  public void setLocationCount(int locationCount) {
    this.locationCount = locationCount;
  }

  /**
   * The list of locations in the company.
   */
  public CompanyLocationConnection getLocations() {
    return locations;
  }

  public void setLocations(CompanyLocationConnection locations) {
    this.locations = locations;
  }

  /**
   * The main contact for the company.
   */
  public CompanyContact getMainContact() {
    return mainContact;
  }

  public void setMainContact(CompanyContact mainContact) {
    this.mainContact = mainContact;
  }

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
   * including its `namespace` and `key`, that's associated with a Shopify resource
   * for the purposes of adding and storing additional information.
   */
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  /**
   * List of metafield definitions.
   */
  public MetafieldDefinitionConnection getMetafieldDefinitions() {
    return metafieldDefinitions;
  }

  public void setMetafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
    this.metafieldDefinitions = metafieldDefinitions;
  }

  /**
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  public MetafieldConnection getMetafields() {
    return metafields;
  }

  public void setMetafields(MetafieldConnection metafields) {
    this.metafields = metafields;
  }

  /**
   * The name of the company.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * A note about the company.
   */
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  /**
   * The total number of orders placed for this company, across all its locations.
   */
  public int getOrderCount() {
    return orderCount;
  }

  public void setOrderCount(int orderCount) {
    this.orderCount = orderCount;
  }

  /**
   * The list of the company's orders.
   */
  public OrderConnection getOrders() {
    return orders;
  }

  public void setOrders(OrderConnection orders) {
    this.orders = orders;
  }

  /**
   * Returns a private metafield by namespace and key that belongs to the resource.
   */
  public PrivateMetafield getPrivateMetafield() {
    return privateMetafield;
  }

  public void setPrivateMetafield(PrivateMetafield privateMetafield) {
    this.privateMetafield = privateMetafield;
  }

  /**
   * List of private metafields that belong to the resource.
   */
  public PrivateMetafieldConnection getPrivateMetafields() {
    return privateMetafields;
  }

  public void setPrivateMetafields(PrivateMetafieldConnection privateMetafields) {
    this.privateMetafields = privateMetafields;
  }

  /**
   * The total amount spent by this company, across all its locations.
   */
  public MoneyV2 getTotalSpent() {
    return totalSpent;
  }

  public void setTotalSpent(MoneyV2 totalSpent) {
    this.totalSpent = totalSpent;
  }

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) at which the company was last modified.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "Company{contactCount='" + contactCount + "', contactRoles='" + contactRoles + "', contacts='" + contacts + "', createdAt='" + createdAt + "', customerSince='" + customerSince + "', defaultCursor='" + defaultCursor + "', defaultRole='" + defaultRole + "', draftOrders='" + draftOrders + "', events='" + events + "', externalId='" + externalId + "', hasTimelineComment='" + hasTimelineComment + "', id='" + id + "', lifetimeDuration='" + lifetimeDuration + "', locationCount='" + locationCount + "', locations='" + locations + "', mainContact='" + mainContact + "', metafield='" + metafield + "', metafieldDefinitions='" + metafieldDefinitions + "', metafields='" + metafields + "', name='" + name + "', note='" + note + "', orderCount='" + orderCount + "', orders='" + orders + "', privateMetafield='" + privateMetafield + "', privateMetafields='" + privateMetafields + "', totalSpent='" + totalSpent + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Company that = (Company) o;
    return contactCount == that.contactCount &&
        Objects.equals(contactRoles, that.contactRoles) &&
        Objects.equals(contacts, that.contacts) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(customerSince, that.customerSince) &&
        Objects.equals(defaultCursor, that.defaultCursor) &&
        Objects.equals(defaultRole, that.defaultRole) &&
        Objects.equals(draftOrders, that.draftOrders) &&
        Objects.equals(events, that.events) &&
        Objects.equals(externalId, that.externalId) &&
        hasTimelineComment == that.hasTimelineComment &&
        Objects.equals(id, that.id) &&
        Objects.equals(lifetimeDuration, that.lifetimeDuration) &&
        locationCount == that.locationCount &&
        Objects.equals(locations, that.locations) &&
        Objects.equals(mainContact, that.mainContact) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafieldDefinitions, that.metafieldDefinitions) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(name, that.name) &&
        Objects.equals(note, that.note) &&
        orderCount == that.orderCount &&
        Objects.equals(orders, that.orders) &&
        Objects.equals(privateMetafield, that.privateMetafield) &&
        Objects.equals(privateMetafields, that.privateMetafields) &&
        Objects.equals(totalSpent, that.totalSpent) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactCount, contactRoles, contacts, createdAt, customerSince, defaultCursor, defaultRole, draftOrders, events, externalId, hasTimelineComment, id, lifetimeDuration, locationCount, locations, mainContact, metafield, metafieldDefinitions, metafields, name, note, orderCount, orders, privateMetafield, privateMetafields, totalSpent, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The number of contacts that belong to the company.
     */
    private int contactCount;

    /**
     * The list of roles for the company contacts.
     */
    private CompanyContactRoleConnection contactRoles;

    /**
     * The list of contacts in the company.
     */
    private CompanyContactConnection contacts;

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) at which the company was created in Shopify.
     */
    private OffsetDateTime createdAt;

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) at which the company became the customer.
     */
    private OffsetDateTime customerSince;

    /**
     * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
     * returns the single next record, sorted ascending by ID.
     */
    private String defaultCursor;

    /**
     * The role proposed by default for a contact at the company.
     */
    private CompanyContactRole defaultRole;

    /**
     * The list of the company's draft orders.
     */
    private DraftOrderConnection draftOrders;

    /**
     * The paginated list of events associated with the host subject.
     */
    private EventConnection events;

    /**
     * A unique externally-supplied ID for the company.
     */
    private String externalId;

    /**
     * Whether the merchant added a timeline comment to the company.
     */
    private boolean hasTimelineComment;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The lifetime duration of the company, since it became a customer of the shop. Examples: `2 days`, `3 months`, `1 year`.
     */
    private String lifetimeDuration;

    /**
     * The number of locations that belong to the company.
     */
    private int locationCount;

    /**
     * The list of locations in the company.
     */
    private CompanyLocationConnection locations;

    /**
     * The main contact for the company.
     */
    private CompanyContact mainContact;

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
     * including its `namespace` and `key`, that's associated with a Shopify resource
     * for the purposes of adding and storing additional information.
     */
    private Metafield metafield;

    /**
     * List of metafield definitions.
     */
    private MetafieldDefinitionConnection metafieldDefinitions;

    /**
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    private MetafieldConnection metafields;

    /**
     * The name of the company.
     */
    private String name;

    /**
     * A note about the company.
     */
    private String note;

    /**
     * The total number of orders placed for this company, across all its locations.
     */
    private int orderCount;

    /**
     * The list of the company's orders.
     */
    private OrderConnection orders;

    /**
     * Returns a private metafield by namespace and key that belongs to the resource.
     */
    private PrivateMetafield privateMetafield;

    /**
     * List of private metafields that belong to the resource.
     */
    private PrivateMetafieldConnection privateMetafields;

    /**
     * The total amount spent by this company, across all its locations.
     */
    private MoneyV2 totalSpent;

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) at which the company was last modified.
     */
    private OffsetDateTime updatedAt;

    public Company build() {
      Company result = new Company();
      result.contactCount = this.contactCount;
      result.contactRoles = this.contactRoles;
      result.contacts = this.contacts;
      result.createdAt = this.createdAt;
      result.customerSince = this.customerSince;
      result.defaultCursor = this.defaultCursor;
      result.defaultRole = this.defaultRole;
      result.draftOrders = this.draftOrders;
      result.events = this.events;
      result.externalId = this.externalId;
      result.hasTimelineComment = this.hasTimelineComment;
      result.id = this.id;
      result.lifetimeDuration = this.lifetimeDuration;
      result.locationCount = this.locationCount;
      result.locations = this.locations;
      result.mainContact = this.mainContact;
      result.metafield = this.metafield;
      result.metafieldDefinitions = this.metafieldDefinitions;
      result.metafields = this.metafields;
      result.name = this.name;
      result.note = this.note;
      result.orderCount = this.orderCount;
      result.orders = this.orders;
      result.privateMetafield = this.privateMetafield;
      result.privateMetafields = this.privateMetafields;
      result.totalSpent = this.totalSpent;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * The number of contacts that belong to the company.
     */
    public Builder contactCount(int contactCount) {
      this.contactCount = contactCount;
      return this;
    }

    /**
     * The list of roles for the company contacts.
     */
    public Builder contactRoles(CompanyContactRoleConnection contactRoles) {
      this.contactRoles = contactRoles;
      return this;
    }

    /**
     * The list of contacts in the company.
     */
    public Builder contacts(CompanyContactConnection contacts) {
      this.contacts = contacts;
      return this;
    }

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) at which the company was created in Shopify.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) at which the company became the customer.
     */
    public Builder customerSince(OffsetDateTime customerSince) {
      this.customerSince = customerSince;
      return this;
    }

    /**
     * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
     * returns the single next record, sorted ascending by ID.
     */
    public Builder defaultCursor(String defaultCursor) {
      this.defaultCursor = defaultCursor;
      return this;
    }

    /**
     * The role proposed by default for a contact at the company.
     */
    public Builder defaultRole(CompanyContactRole defaultRole) {
      this.defaultRole = defaultRole;
      return this;
    }

    /**
     * The list of the company's draft orders.
     */
    public Builder draftOrders(DraftOrderConnection draftOrders) {
      this.draftOrders = draftOrders;
      return this;
    }

    /**
     * The paginated list of events associated with the host subject.
     */
    public Builder events(EventConnection events) {
      this.events = events;
      return this;
    }

    /**
     * A unique externally-supplied ID for the company.
     */
    public Builder externalId(String externalId) {
      this.externalId = externalId;
      return this;
    }

    /**
     * Whether the merchant added a timeline comment to the company.
     */
    public Builder hasTimelineComment(boolean hasTimelineComment) {
      this.hasTimelineComment = hasTimelineComment;
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
     * The lifetime duration of the company, since it became a customer of the shop. Examples: `2 days`, `3 months`, `1 year`.
     */
    public Builder lifetimeDuration(String lifetimeDuration) {
      this.lifetimeDuration = lifetimeDuration;
      return this;
    }

    /**
     * The number of locations that belong to the company.
     */
    public Builder locationCount(int locationCount) {
      this.locationCount = locationCount;
      return this;
    }

    /**
     * The list of locations in the company.
     */
    public Builder locations(CompanyLocationConnection locations) {
      this.locations = locations;
      return this;
    }

    /**
     * The main contact for the company.
     */
    public Builder mainContact(CompanyContact mainContact) {
      this.mainContact = mainContact;
      return this;
    }

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
     * including its `namespace` and `key`, that's associated with a Shopify resource
     * for the purposes of adding and storing additional information.
     */
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    /**
     * List of metafield definitions.
     */
    public Builder metafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
      this.metafieldDefinitions = metafieldDefinitions;
      return this;
    }

    /**
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    public Builder metafields(MetafieldConnection metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * The name of the company.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * A note about the company.
     */
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    /**
     * The total number of orders placed for this company, across all its locations.
     */
    public Builder orderCount(int orderCount) {
      this.orderCount = orderCount;
      return this;
    }

    /**
     * The list of the company's orders.
     */
    public Builder orders(OrderConnection orders) {
      this.orders = orders;
      return this;
    }

    /**
     * Returns a private metafield by namespace and key that belongs to the resource.
     */
    public Builder privateMetafield(PrivateMetafield privateMetafield) {
      this.privateMetafield = privateMetafield;
      return this;
    }

    /**
     * List of private metafields that belong to the resource.
     */
    public Builder privateMetafields(PrivateMetafieldConnection privateMetafields) {
      this.privateMetafields = privateMetafields;
      return this;
    }

    /**
     * The total amount spent by this company, across all its locations.
     */
    public Builder totalSpent(MoneyV2 totalSpent) {
      this.totalSpent = totalSpent;
      return this;
    }

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) at which the company was last modified.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
