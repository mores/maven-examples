package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A nested array representation of the data. An index in an array represents a row number.
 */
public class TableDataColumn {
  /**
   * For comparison columns, indicates the column to compare to.
   */
  private String comparedTo;

  /**
   * The data type of the column value.
   */
  private String dataType;

  /**
   * The display name of the column in the data model.
   */
  private String displayName;

  /**
   * The name of the column in the data model.
   */
  private String name;

  public TableDataColumn() {
  }

  /**
   * For comparison columns, indicates the column to compare to.
   */
  public String getComparedTo() {
    return comparedTo;
  }

  public void setComparedTo(String comparedTo) {
    this.comparedTo = comparedTo;
  }

  /**
   * The data type of the column value.
   */
  public String getDataType() {
    return dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = dataType;
  }

  /**
   * The display name of the column in the data model.
   */
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * The name of the column in the data model.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "TableDataColumn{comparedTo='" + comparedTo + "', dataType='" + dataType + "', displayName='" + displayName + "', name='" + name + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TableDataColumn that = (TableDataColumn) o;
    return Objects.equals(comparedTo, that.comparedTo) &&
        Objects.equals(dataType, that.dataType) &&
        Objects.equals(displayName, that.displayName) &&
        Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comparedTo, dataType, displayName, name);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * For comparison columns, indicates the column to compare to.
     */
    private String comparedTo;

    /**
     * The data type of the column value.
     */
    private String dataType;

    /**
     * The display name of the column in the data model.
     */
    private String displayName;

    /**
     * The name of the column in the data model.
     */
    private String name;

    public TableDataColumn build() {
      TableDataColumn result = new TableDataColumn();
      result.comparedTo = this.comparedTo;
      result.dataType = this.dataType;
      result.displayName = this.displayName;
      result.name = this.name;
      return result;
    }

    /**
     * For comparison columns, indicates the column to compare to.
     */
    public Builder comparedTo(String comparedTo) {
      this.comparedTo = comparedTo;
      return this;
    }

    /**
     * The data type of the column value.
     */
    public Builder dataType(String dataType) {
      this.dataType = dataType;
      return this;
    }

    /**
     * The display name of the column in the data model.
     */
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * The name of the column in the data model.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }
}
