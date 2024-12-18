package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `translationsRegister` mutation.
 */
public class TranslationsRegisterPayload {
  /**
   * The translations that were created or updated.
   */
  private List<Translation> translations;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<TranslationUserError> userErrors;

  public TranslationsRegisterPayload() {
  }

  /**
   * The translations that were created or updated.
   */
  public List<Translation> getTranslations() {
    return translations;
  }

  public void setTranslations(List<Translation> translations) {
    this.translations = translations;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<TranslationUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<TranslationUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "TranslationsRegisterPayload{translations='" + translations + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TranslationsRegisterPayload that = (TranslationsRegisterPayload) o;
    return Objects.equals(translations, that.translations) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(translations, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The translations that were created or updated.
     */
    private List<Translation> translations;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<TranslationUserError> userErrors;

    public TranslationsRegisterPayload build() {
      TranslationsRegisterPayload result = new TranslationsRegisterPayload();
      result.translations = this.translations;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The translations that were created or updated.
     */
    public Builder translations(List<Translation> translations) {
      this.translations = translations;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<TranslationUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
