// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.sdk.xdr;


import java.io.IOException;

import com.google.common.base.Objects;

// === xdr source ============================================================

//  union ManageSellOfferResult switch (ManageSellOfferResultCode code)
//  {
//  case MANAGE_SELL_OFFER_SUCCESS:
//      ManageOfferSuccessResult success;
//  default:
//      void;
//  };

//  ===========================================================================
public class ManageSellOfferResult implements XdrElement {
  public ManageSellOfferResult () {}
  ManageSellOfferResultCode code;
  public ManageSellOfferResultCode getDiscriminant() {
    return this.code;
  }
  public void setDiscriminant(ManageSellOfferResultCode value) {
    this.code = value;
  }
  private ManageOfferSuccessResult success;
  public ManageOfferSuccessResult getSuccess() {
    return this.success;
  }
  public void setSuccess(ManageOfferSuccessResult value) {
    this.success = value;
  }

  public static final class Builder {
    private ManageSellOfferResultCode discriminant;
    private ManageOfferSuccessResult success;

    public Builder discriminant(ManageSellOfferResultCode discriminant) {
      this.discriminant = discriminant;
      return this;
    }

    public Builder success(ManageOfferSuccessResult success) {
      this.success = success;
      return this;
    }

    public ManageSellOfferResult build() {
      ManageSellOfferResult val = new ManageSellOfferResult();
      val.setDiscriminant(discriminant);
      val.setSuccess(success);
      return val;
    }
  }

  public static void encode(XdrDataOutputStream stream, ManageSellOfferResult encodedManageSellOfferResult) throws IOException {
  //Xdrgen::AST::Identifier
  //ManageSellOfferResultCode
  stream.writeInt(encodedManageSellOfferResult.getDiscriminant().getValue());
  switch (encodedManageSellOfferResult.getDiscriminant()) {
  case MANAGE_SELL_OFFER_SUCCESS:
  ManageOfferSuccessResult.encode(stream, encodedManageSellOfferResult.success);
  break;
  default:
  break;
  }
  }
  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }
  public static ManageSellOfferResult decode(XdrDataInputStream stream) throws IOException {
  ManageSellOfferResult decodedManageSellOfferResult = new ManageSellOfferResult();
  ManageSellOfferResultCode discriminant = ManageSellOfferResultCode.decode(stream);
  decodedManageSellOfferResult.setDiscriminant(discriminant);
  switch (decodedManageSellOfferResult.getDiscriminant()) {
  case MANAGE_SELL_OFFER_SUCCESS:
  decodedManageSellOfferResult.success = ManageOfferSuccessResult.decode(stream);
  break;
  default:
  break;
  }
    return decodedManageSellOfferResult;
  }
  @Override
  public int hashCode() {
    return Objects.hashCode(this.success, this.code);
  }
  @Override
  public boolean equals(Object object) {
    if (!(object instanceof ManageSellOfferResult)) {
      return false;
    }

    ManageSellOfferResult other = (ManageSellOfferResult) object;
    return Objects.equal(this.success, other.success) && Objects.equal(this.code, other.code);
  }
}