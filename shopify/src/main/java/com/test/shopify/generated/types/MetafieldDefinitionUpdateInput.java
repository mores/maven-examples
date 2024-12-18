package com.test.shopify.generated.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields required to update a metafield definition.
 */
public class MetafieldDefinitionUpdateInput {
  /**
   * The container for a group of metafields that the metafield definition is associated with. Used to help identify
   * the metafield definition, but cannot be updated itself. If omitted, the app-reserved namespace will be used.
   */
  private String namespace;

  /**
   * The unique identifier for the metafield definition within its namespace. Used to help identify the metafield
   * definition, but can't be updated itself.
   */
  private String key;

  /**
   * The human-readable name for the metafield definition.
   */
  private String name;

  /**
   * The description for the metafield definition.
   */
  private String description;

  /**
   * The resource type that the metafield definition is attached to. Used to help identify the metafield definition,
   * but can't be updated itself.
   */
  private MetafieldOwnerType ownerType;

  /**
   * A list of [validation options](https://shopify.dev/apps/metafields/definitions/validation) for
   * the metafields that belong to the metafield definition. For example, for a metafield definition with the
   * type `date`, you can set a minimum date validation so that each of the metafields that belong to it can only
   * store dates after the specified minimum.
   */
  private List<MetafieldDefinitionValidationInput> validations;

  /**
   * Whether to pin the metafield definition.
   */
  private Boolean pin;

  /**
   * The access settings that apply to each of the metafields that belong to the metafield definition.
   */
  private MetafieldAccessUpdateInput access;

  public MetafieldDefinitionUpdateInput() {
  }

  /**
   * The container for a group of metafields that the metafield definition is associated with. Used to help identify
   * the metafield definition, but cannot be updated itself. If omitted, the app-reserved namespace will be used.
   */
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  /**
   * The unique identifier for the metafield definition within its namespace. Used to help identify the metafield
   * definition, but can't be updated itself.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * The human-readable name for the metafield definition.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The description for the metafield definition.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The resource type that the metafield definition is attached to. Used to help identify the metafield definition,
   * but can't be updated itself.
   */
  public MetafieldOwnerType getOwnerType() {
    return ownerType;
  }

  public void setOwnerType(MetafieldOwnerType ownerType) {
    this.ownerType = ownerType;
  }

  /**
   * A list of [validation options](https://shopify.dev/apps/metafields/definitions/validation) for
   * the metafields that belong to the metafield definition. For example, for a metafield definition with the
   * type `date`, you can set a minimum date validation so that each of the metafields that belong to it can only
   * store dates after the specified minimum.
   */
  public List<MetafieldDefinitionValidationInput> getValidations() {
    return validations;
  }

  public void setValidations(List<MetafieldDefinitionValidationInput> validations) {
    this.validations = validations;
  }

  /**
   * Whether to pin the metafield definition.
   */
  public Boolean getPin() {
    return pin;
  }

  public void setPin(Boolean pin) {
    this.pin = pin;
  }

  /**
   * The access settings that apply to each of the metafields that belong to the metafield definition.
   */
  public MetafieldAccessUpdateInput getAccess() {
    return access;
  }

  public void setAccess(MetafieldAccessUpdateInput access) {
    this.access = access;
  }

  @Override
  public String toString() {
    return "MetafieldDefinitionUpdateInput{namespace='" + namespace + "', key='" + key + "', name='" + name + "', description='" + description + "', ownerType='" + ownerType + "', validations='" + validations + "', pin='" + pin + "', access='" + access + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldDefinitionUpdateInput that = (MetafieldDefinitionUpdateInput) o;
    return Objects.equals(namespace, that.namespace) &&
        Objects.equals(key, that.key) &&
        Objects.equals(name, that.name) &&
        Objects.equals(description, that.description) &&
        Objects.equals(ownerType, that.ownerType) &&
        Objects.equals(validations, that.validations) &&
        Objects.equals(pin, that.pin) &&
        Objects.equals(access, that.access);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, key, name, description, ownerType, validations, pin, access);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The container for a group of metafields that the metafield definition is associated with. Used to help identify
     * the metafield definition, but cannot be updated itself. If omitted, the app-reserved namespace will be used.
     */
    private String namespace;

    /**
     * The unique identifier for the metafield definition within its namespace. Used to help identify the metafield
     * definition, but can't be updated itself.
     */
    private String key;

    /**
     * The human-readable name for the metafield definition.
     */
    private String name;

    /**
     * The description for the metafield definition.
     */
    private String description;

    /**
     * The resource type that the metafield definition is attached to. Used to help identify the metafield definition,
     * but can't be updated itself.
     */
    private MetafieldOwnerType ownerType;

    /**
     * A list of [validation options](https://shopify.dev/apps/metafields/definitions/validation) for
     * the metafields that belong to the metafield definition. For example, for a metafield definition with the
     * type `date`, you can set a minimum date validation so that each of the metafields that belong to it can only
     * store dates after the specified minimum.
     */
    private List<MetafieldDefinitionValidationInput> validations;

    /**
     * Whether to pin the metafield definition.
     */
    private Boolean pin;

    /**
     * The access settings that apply to each of the metafields that belong to the metafield definition.
     */
    private MetafieldAccessUpdateInput access;

    public MetafieldDefinitionUpdateInput build() {
      MetafieldDefinitionUpdateInput result = new MetafieldDefinitionUpdateInput();
      result.namespace = this.namespace;
      result.key = this.key;
      result.name = this.name;
      result.description = this.description;
      result.ownerType = this.ownerType;
      result.validations = this.validations;
      result.pin = this.pin;
      result.access = this.access;
      return result;
    }

    /**
     * The container for a group of metafields that the metafield definition is associated with. Used to help identify
     * the metafield definition, but cannot be updated itself. If omitted, the app-reserved namespace will be used.
     */
    public Builder namespace(String namespace) {
      this.namespace = namespace;
      return this;
    }

    /**
     * The unique identifier for the metafield definition within its namespace. Used to help identify the metafield
     * definition, but can't be updated itself.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * The human-readable name for the metafield definition.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The description for the metafield definition.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * The resource type that the metafield definition is attached to. Used to help identify the metafield definition,
     * but can't be updated itself.
     */
    public Builder ownerType(MetafieldOwnerType ownerType) {
      this.ownerType = ownerType;
      return this;
    }

    /**
     * A list of [validation options](https://shopify.dev/apps/metafields/definitions/validation) for
     * the metafields that belong to the metafield definition. For example, for a metafield definition with the
     * type `date`, you can set a minimum date validation so that each of the metafields that belong to it can only
     * store dates after the specified minimum.
     */
    public Builder validations(List<MetafieldDefinitionValidationInput> validations) {
      this.validations = validations;
      return this;
    }

    /**
     * Whether to pin the metafield definition.
     */
    public Builder pin(Boolean pin) {
      this.pin = pin;
      return this;
    }

    /**
     * The access settings that apply to each of the metafields that belong to the metafield definition.
     */
    public Builder access(MetafieldAccessUpdateInput access) {
      this.access = access;
      return this;
    }
  }
}
