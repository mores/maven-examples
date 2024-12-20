package com.test.shopify.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldReferenceProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldReferenceProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldReference"));
  }

  public MetafieldReferenceProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionFragmentProjection<MetafieldReferenceProjection<PARENT, ROOT>, ROOT> onCollection(
      ) {
    CollectionFragmentProjection<MetafieldReferenceProjection<PARENT, ROOT>, ROOT> fragment = new CollectionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyFragmentProjection<MetafieldReferenceProjection<PARENT, ROOT>, ROOT> onCompany() {
    CompanyFragmentProjection<MetafieldReferenceProjection<PARENT, ROOT>, ROOT> fragment = new CompanyFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CustomerFragmentProjection<MetafieldReferenceProjection<PARENT, ROOT>, ROOT> onCustomer() {
    CustomerFragmentProjection<MetafieldReferenceProjection<PARENT, ROOT>, ROOT> fragment = new CustomerFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public GenericFileFragmentProjection<MetafieldReferenceProjection<PARENT, ROOT>, ROOT> onGenericFile(
      ) {
    GenericFileFragmentProjection<MetafieldReferenceProjection<PARENT, ROOT>, ROOT> fragment = new GenericFileFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public MediaImageFragmentProjection<MetafieldReferenceProjection<PARENT, ROOT>, ROOT> onMediaImage(
      ) {
    MediaImageFragmentProjection<MetafieldReferenceProjection<PARENT, ROOT>, ROOT> fragment = new MediaImageFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public MetaobjectFragmentProjection<MetafieldReferenceProjection<PARENT, ROOT>, ROOT> onMetaobject(
      ) {
    MetaobjectFragmentProjection<MetafieldReferenceProjection<PARENT, ROOT>, ROOT> fragment = new MetaobjectFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public Model3dFragmentProjection<MetafieldReferenceProjection<PARENT, ROOT>, ROOT> onModel3d() {
    Model3dFragmentProjection<MetafieldReferenceProjection<PARENT, ROOT>, ROOT> fragment = new Model3dFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public OnlineStorePageFragmentProjection<MetafieldReferenceProjection<PARENT, ROOT>, ROOT> onOnlineStorePage(
      ) {
    OnlineStorePageFragmentProjection<MetafieldReferenceProjection<PARENT, ROOT>, ROOT> fragment = new OnlineStorePageFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public OrderFragmentProjection<MetafieldReferenceProjection<PARENT, ROOT>, ROOT> onOrder() {
    OrderFragmentProjection<MetafieldReferenceProjection<PARENT, ROOT>, ROOT> fragment = new OrderFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ProductFragmentProjection<MetafieldReferenceProjection<PARENT, ROOT>, ROOT> onProduct() {
    ProductFragmentProjection<MetafieldReferenceProjection<PARENT, ROOT>, ROOT> fragment = new ProductFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ProductVariantFragmentProjection<MetafieldReferenceProjection<PARENT, ROOT>, ROOT> onProductVariant(
      ) {
    ProductVariantFragmentProjection<MetafieldReferenceProjection<PARENT, ROOT>, ROOT> fragment = new ProductVariantFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public VideoFragmentProjection<MetafieldReferenceProjection<PARENT, ROOT>, ROOT> onVideo() {
    VideoFragmentProjection<MetafieldReferenceProjection<PARENT, ROOT>, ROOT> fragment = new VideoFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
