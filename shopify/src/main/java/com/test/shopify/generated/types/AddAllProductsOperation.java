package com.test.shopify.generated.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents an operation publishing all products to a publication.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class AddAllProductsOperation implements PublicationOperation, com.test.shopify.generated.types.Node, com.test.shopify.generated.types.ResourceOperation {
  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The count of processed rows, summing imported, failed, and skipped rows.
   */
  private Integer processedRowCount;

  /**
   * Represents a rows objects within this background operation.
   */
  private RowCount rowCount;

  /**
   * The status of this operation.
   */
  private ResourceOperationStatus status;

  public AddAllProductsOperation() {
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
   * The count of processed rows, summing imported, failed, and skipped rows.
   */
  public Integer getProcessedRowCount() {
    return processedRowCount;
  }

  public void setProcessedRowCount(Integer processedRowCount) {
    this.processedRowCount = processedRowCount;
  }

  /**
   * Represents a rows objects within this background operation.
   */
  public RowCount getRowCount() {
    return rowCount;
  }

  public void setRowCount(RowCount rowCount) {
    this.rowCount = rowCount;
  }

  /**
   * The status of this operation.
   */
  public ResourceOperationStatus getStatus() {
    return status;
  }

  public void setStatus(ResourceOperationStatus status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "AddAllProductsOperation{id='" + id + "', processedRowCount='" + processedRowCount + "', rowCount='" + rowCount + "', status='" + status + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AddAllProductsOperation that = (AddAllProductsOperation) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(processedRowCount, that.processedRowCount) &&
        Objects.equals(rowCount, that.rowCount) &&
        Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, processedRowCount, rowCount, status);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The count of processed rows, summing imported, failed, and skipped rows.
     */
    private Integer processedRowCount;

    /**
     * Represents a rows objects within this background operation.
     */
    private RowCount rowCount;

    /**
     * The status of this operation.
     */
    private ResourceOperationStatus status;

    public AddAllProductsOperation build() {
      AddAllProductsOperation result = new AddAllProductsOperation();
      result.id = this.id;
      result.processedRowCount = this.processedRowCount;
      result.rowCount = this.rowCount;
      result.status = this.status;
      return result;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The count of processed rows, summing imported, failed, and skipped rows.
     */
    public Builder processedRowCount(Integer processedRowCount) {
      this.processedRowCount = processedRowCount;
      return this;
    }

    /**
     * Represents a rows objects within this background operation.
     */
    public Builder rowCount(RowCount rowCount) {
      this.rowCount = rowCount;
      return this;
    }

    /**
     * The status of this operation.
     */
    public Builder status(ResourceOperationStatus status) {
      this.status = status;
      return this;
    }
  }
}
