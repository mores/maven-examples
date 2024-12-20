package com.test.shopify.generated.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Comment events are generated by staff members of a shop.
 * They are created when a staff member adds a comment to the timeline of an order, draft order, customer, or transfer.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CommentEvent implements com.test.shopify.generated.types.Event, com.test.shopify.generated.types.Node {
  /**
   * The name of the app that created the event.
   */
  private String appTitle;

  /**
   * The attachments associated with the comment event.
   */
  private List<CommentEventAttachment> attachments;

  /**
   * Whether the event was created by an app.
   */
  private boolean attributeToApp;

  /**
   * Whether the event was caused by an admin user.
   */
  private boolean attributeToUser;

  /**
   * The name of the user that authored the comment event.
   */
  private StaffMember author;

  /**
   * Whether the comment event can be deleted. If true, then the comment event can be deleted.
   */
  private boolean canDelete;

  /**
   * Whether the comment event can be edited. If true, then the comment event can be edited.
   */
  private boolean canEdit;

  /**
   * The date and time when the event was created.
   */
  private OffsetDateTime createdAt;

  /**
   * Whether the event is critical.
   */
  private boolean criticalAlert;

  /**
   * Whether the comment event has been edited. If true, then the comment event has been edited.
   */
  private boolean edited;

  /**
   * The object reference associated with the comment event. For example, a product or discount).
   */
  private CommentEventEmbed embed;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * Human readable text that describes the event.
   */
  private String message;

  /**
   * The raw body of the comment event.
   */
  private String rawMessage;

  /**
   * The parent subject to which the comment event belongs.
   */
  private CommentEventSubject subject;

  public CommentEvent() {
  }

  /**
   * The name of the app that created the event.
   */
  public String getAppTitle() {
    return appTitle;
  }

  public void setAppTitle(String appTitle) {
    this.appTitle = appTitle;
  }

  /**
   * The attachments associated with the comment event.
   */
  public List<CommentEventAttachment> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<CommentEventAttachment> attachments) {
    this.attachments = attachments;
  }

  /**
   * Whether the event was created by an app.
   */
  public boolean getAttributeToApp() {
    return attributeToApp;
  }

  public void setAttributeToApp(boolean attributeToApp) {
    this.attributeToApp = attributeToApp;
  }

  /**
   * Whether the event was caused by an admin user.
   */
  public boolean getAttributeToUser() {
    return attributeToUser;
  }

  public void setAttributeToUser(boolean attributeToUser) {
    this.attributeToUser = attributeToUser;
  }

  /**
   * The name of the user that authored the comment event.
   */
  public StaffMember getAuthor() {
    return author;
  }

  public void setAuthor(StaffMember author) {
    this.author = author;
  }

  /**
   * Whether the comment event can be deleted. If true, then the comment event can be deleted.
   */
  public boolean getCanDelete() {
    return canDelete;
  }

  public void setCanDelete(boolean canDelete) {
    this.canDelete = canDelete;
  }

  /**
   * Whether the comment event can be edited. If true, then the comment event can be edited.
   */
  public boolean getCanEdit() {
    return canEdit;
  }

  public void setCanEdit(boolean canEdit) {
    this.canEdit = canEdit;
  }

  /**
   * The date and time when the event was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Whether the event is critical.
   */
  public boolean getCriticalAlert() {
    return criticalAlert;
  }

  public void setCriticalAlert(boolean criticalAlert) {
    this.criticalAlert = criticalAlert;
  }

  /**
   * Whether the comment event has been edited. If true, then the comment event has been edited.
   */
  public boolean getEdited() {
    return edited;
  }

  public void setEdited(boolean edited) {
    this.edited = edited;
  }

  /**
   * The object reference associated with the comment event. For example, a product or discount).
   */
  public CommentEventEmbed getEmbed() {
    return embed;
  }

  public void setEmbed(CommentEventEmbed embed) {
    this.embed = embed;
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
   * Human readable text that describes the event.
   */
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * The raw body of the comment event.
   */
  public String getRawMessage() {
    return rawMessage;
  }

  public void setRawMessage(String rawMessage) {
    this.rawMessage = rawMessage;
  }

  /**
   * The parent subject to which the comment event belongs.
   */
  public CommentEventSubject getSubject() {
    return subject;
  }

  public void setSubject(CommentEventSubject subject) {
    this.subject = subject;
  }

  @Override
  public String toString() {
    return "CommentEvent{appTitle='" + appTitle + "', attachments='" + attachments + "', attributeToApp='" + attributeToApp + "', attributeToUser='" + attributeToUser + "', author='" + author + "', canDelete='" + canDelete + "', canEdit='" + canEdit + "', createdAt='" + createdAt + "', criticalAlert='" + criticalAlert + "', edited='" + edited + "', embed='" + embed + "', id='" + id + "', message='" + message + "', rawMessage='" + rawMessage + "', subject='" + subject + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CommentEvent that = (CommentEvent) o;
    return Objects.equals(appTitle, that.appTitle) &&
        Objects.equals(attachments, that.attachments) &&
        attributeToApp == that.attributeToApp &&
        attributeToUser == that.attributeToUser &&
        Objects.equals(author, that.author) &&
        canDelete == that.canDelete &&
        canEdit == that.canEdit &&
        Objects.equals(createdAt, that.createdAt) &&
        criticalAlert == that.criticalAlert &&
        edited == that.edited &&
        Objects.equals(embed, that.embed) &&
        Objects.equals(id, that.id) &&
        Objects.equals(message, that.message) &&
        Objects.equals(rawMessage, that.rawMessage) &&
        Objects.equals(subject, that.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appTitle, attachments, attributeToApp, attributeToUser, author, canDelete, canEdit, createdAt, criticalAlert, edited, embed, id, message, rawMessage, subject);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The name of the app that created the event.
     */
    private String appTitle;

    /**
     * The attachments associated with the comment event.
     */
    private List<CommentEventAttachment> attachments;

    /**
     * Whether the event was created by an app.
     */
    private boolean attributeToApp;

    /**
     * Whether the event was caused by an admin user.
     */
    private boolean attributeToUser;

    /**
     * The name of the user that authored the comment event.
     */
    private StaffMember author;

    /**
     * Whether the comment event can be deleted. If true, then the comment event can be deleted.
     */
    private boolean canDelete;

    /**
     * Whether the comment event can be edited. If true, then the comment event can be edited.
     */
    private boolean canEdit;

    /**
     * The date and time when the event was created.
     */
    private OffsetDateTime createdAt;

    /**
     * Whether the event is critical.
     */
    private boolean criticalAlert;

    /**
     * Whether the comment event has been edited. If true, then the comment event has been edited.
     */
    private boolean edited;

    /**
     * The object reference associated with the comment event. For example, a product or discount).
     */
    private CommentEventEmbed embed;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * Human readable text that describes the event.
     */
    private String message;

    /**
     * The raw body of the comment event.
     */
    private String rawMessage;

    /**
     * The parent subject to which the comment event belongs.
     */
    private CommentEventSubject subject;

    public CommentEvent build() {
      CommentEvent result = new CommentEvent();
      result.appTitle = this.appTitle;
      result.attachments = this.attachments;
      result.attributeToApp = this.attributeToApp;
      result.attributeToUser = this.attributeToUser;
      result.author = this.author;
      result.canDelete = this.canDelete;
      result.canEdit = this.canEdit;
      result.createdAt = this.createdAt;
      result.criticalAlert = this.criticalAlert;
      result.edited = this.edited;
      result.embed = this.embed;
      result.id = this.id;
      result.message = this.message;
      result.rawMessage = this.rawMessage;
      result.subject = this.subject;
      return result;
    }

    /**
     * The name of the app that created the event.
     */
    public Builder appTitle(String appTitle) {
      this.appTitle = appTitle;
      return this;
    }

    /**
     * The attachments associated with the comment event.
     */
    public Builder attachments(List<CommentEventAttachment> attachments) {
      this.attachments = attachments;
      return this;
    }

    /**
     * Whether the event was created by an app.
     */
    public Builder attributeToApp(boolean attributeToApp) {
      this.attributeToApp = attributeToApp;
      return this;
    }

    /**
     * Whether the event was caused by an admin user.
     */
    public Builder attributeToUser(boolean attributeToUser) {
      this.attributeToUser = attributeToUser;
      return this;
    }

    /**
     * The name of the user that authored the comment event.
     */
    public Builder author(StaffMember author) {
      this.author = author;
      return this;
    }

    /**
     * Whether the comment event can be deleted. If true, then the comment event can be deleted.
     */
    public Builder canDelete(boolean canDelete) {
      this.canDelete = canDelete;
      return this;
    }

    /**
     * Whether the comment event can be edited. If true, then the comment event can be edited.
     */
    public Builder canEdit(boolean canEdit) {
      this.canEdit = canEdit;
      return this;
    }

    /**
     * The date and time when the event was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * Whether the event is critical.
     */
    public Builder criticalAlert(boolean criticalAlert) {
      this.criticalAlert = criticalAlert;
      return this;
    }

    /**
     * Whether the comment event has been edited. If true, then the comment event has been edited.
     */
    public Builder edited(boolean edited) {
      this.edited = edited;
      return this;
    }

    /**
     * The object reference associated with the comment event. For example, a product or discount).
     */
    public Builder embed(CommentEventEmbed embed) {
      this.embed = embed;
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
     * Human readable text that describes the event.
     */
    public Builder message(String message) {
      this.message = message;
      return this;
    }

    /**
     * The raw body of the comment event.
     */
    public Builder rawMessage(String rawMessage) {
      this.rawMessage = rawMessage;
      return this;
    }

    /**
     * The parent subject to which the comment event belongs.
     */
    public Builder subject(CommentEventSubject subject) {
      this.subject = subject;
      return this;
    }
  }
}