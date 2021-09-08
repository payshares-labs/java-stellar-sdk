// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.sdk.xdr;


import java.io.IOException;

import com.google.common.base.Objects;

// === xdr source ============================================================

//  struct AlphaNum12
//  {
//      AssetCode12 assetCode;
//      AccountID issuer;
//  };

//  ===========================================================================
public class AlphaNum12 implements XdrElement {
  public AlphaNum12 () {}
  private AssetCode12 assetCode;
  public AssetCode12 getAssetCode() {
    return this.assetCode;
  }
  public void setAssetCode(AssetCode12 value) {
    this.assetCode = value;
  }
  private AccountID issuer;
  public AccountID getIssuer() {
    return this.issuer;
  }
  public void setIssuer(AccountID value) {
    this.issuer = value;
  }
  public static void encode(XdrDataOutputStream stream, AlphaNum12 encodedAlphaNum12) throws IOException{
    AssetCode12.encode(stream, encodedAlphaNum12.assetCode);
    AccountID.encode(stream, encodedAlphaNum12.issuer);
  }
  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }
  public static AlphaNum12 decode(XdrDataInputStream stream) throws IOException {
    AlphaNum12 decodedAlphaNum12 = new AlphaNum12();
    decodedAlphaNum12.assetCode = AssetCode12.decode(stream);
    decodedAlphaNum12.issuer = AccountID.decode(stream);
    return decodedAlphaNum12;
  }
  @Override
  public int hashCode() {
    return Objects.hashCode(this.assetCode, this.issuer);
  }
  @Override
  public boolean equals(Object object) {
    if (!(object instanceof AlphaNum12)) {
      return false;
    }

    AlphaNum12 other = (AlphaNum12) object;
    return Objects.equal(this.assetCode, other.assetCode) && Objects.equal(this.issuer, other.issuer);
  }

  public static final class Builder {
    private AssetCode12 assetCode;
    private AccountID issuer;

    public Builder assetCode(AssetCode12 assetCode) {
      this.assetCode = assetCode;
      return this;
    }

    public Builder issuer(AccountID issuer) {
      this.issuer = issuer;
      return this;
    }

    public AlphaNum12 build() {
      AlphaNum12 val = new AlphaNum12();
      val.setAssetCode(assetCode);
      val.setIssuer(issuer);
      return val;
    }
  }
}
