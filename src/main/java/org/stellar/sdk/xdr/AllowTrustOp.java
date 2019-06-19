// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.sdk.xdr;


import java.io.IOException;

import com.google.common.base.Objects;

// === xdr source ============================================================

//  struct AllowTrustOp
//  {
//      AccountID trustor;
//      union switch (AssetType type)
//      {
//      // ASSET_TYPE_NATIVE is not allowed
//      case ASSET_TYPE_CREDIT_ALPHANUM4:
//          AssetCode4 assetCode4;
//  
//      case ASSET_TYPE_CREDIT_ALPHANUM12:
//          AssetCode12 assetCode12;
//  
//          // add other asset types here in the future
//      }
//      asset;
//  
//      bool authorize;
//  };

//  ===========================================================================
public class AllowTrustOp  {
  public AllowTrustOp () {}
  private AccountID trustor;
  public AccountID getTrustor() {
    return this.trustor;
  }
  public void setTrustor(AccountID value) {
    this.trustor = value;
  }
  private AllowTrustOpAsset asset;
  public AllowTrustOpAsset getAsset() {
    return this.asset;
  }
  public void setAsset(AllowTrustOpAsset value) {
    this.asset = value;
  }
  private Boolean authorize;
  public Boolean getAuthorize() {
    return this.authorize;
  }
  public void setAuthorize(Boolean value) {
    this.authorize = value;
  }
  public static void encode(XdrDataOutputStream stream, AllowTrustOp encodedAllowTrustOp) throws IOException{
    AccountID.encode(stream, encodedAllowTrustOp.trustor);
    AllowTrustOpAsset.encode(stream, encodedAllowTrustOp.asset);
    stream.writeInt(encodedAllowTrustOp.authorize ? 1 : 0);
  }
  public static AllowTrustOp decode(XdrDataInputStream stream) throws IOException {
    AllowTrustOp decodedAllowTrustOp = new AllowTrustOp();
    decodedAllowTrustOp.trustor = AccountID.decode(stream);
    decodedAllowTrustOp.asset = AllowTrustOpAsset.decode(stream);
    decodedAllowTrustOp.authorize = stream.readInt() == 1 ? true : false;
    return decodedAllowTrustOp;
  }
  @Override
  public int hashCode() {
    return Objects.hashCode(this.trustor, this.asset, this.authorize);
  }
  @Override
  public boolean equals(Object object) {
    if (object == null || !(object instanceof AllowTrustOp)) {
      return false;
    }

    AllowTrustOp other = (AllowTrustOp) object;
    return Objects.equal(this.trustor, other.trustor) && Objects.equal(this.asset, other.asset) && Objects.equal(this.authorize, other.authorize);
  }

  public static class AllowTrustOpAsset {
    public AllowTrustOpAsset () {}
    AssetType type;
    public AssetType getDiscriminant() {
      return this.type;
    }
    public void setDiscriminant(AssetType value) {
      this.type = value;
    }
    private AssetCode4 assetCode4;
    public AssetCode4 getAssetCode4() {
      return this.assetCode4;
    }
    public void setAssetCode4(AssetCode4 value) {
      this.assetCode4 = value;
    }
    private AssetCode12 assetCode12;
    public AssetCode12 getAssetCode12() {
      return this.assetCode12;
    }
    public void setAssetCode12(AssetCode12 value) {
      this.assetCode12 = value;
    }
    public static void encode(XdrDataOutputStream stream, AllowTrustOpAsset encodedAllowTrustOpAsset) throws IOException {
    //Xdrgen::AST::Identifier
    //AssetType
    stream.writeInt(encodedAllowTrustOpAsset.getDiscriminant().getValue());
    switch (encodedAllowTrustOpAsset.getDiscriminant()) {
    case ASSET_TYPE_CREDIT_ALPHANUM4:
    AssetCode4.encode(stream, encodedAllowTrustOpAsset.assetCode4);
    break;
    case ASSET_TYPE_CREDIT_ALPHANUM12:
    AssetCode12.encode(stream, encodedAllowTrustOpAsset.assetCode12);
    break;
    }
    }
    public static AllowTrustOpAsset decode(XdrDataInputStream stream) throws IOException {
    AllowTrustOpAsset decodedAllowTrustOpAsset = new AllowTrustOpAsset();
    AssetType discriminant = AssetType.decode(stream);
    decodedAllowTrustOpAsset.setDiscriminant(discriminant);
    switch (decodedAllowTrustOpAsset.getDiscriminant()) {
    case ASSET_TYPE_CREDIT_ALPHANUM4:
    decodedAllowTrustOpAsset.assetCode4 = AssetCode4.decode(stream);
    break;
    case ASSET_TYPE_CREDIT_ALPHANUM12:
    decodedAllowTrustOpAsset.assetCode12 = AssetCode12.decode(stream);
    break;
    }
      return decodedAllowTrustOpAsset;
    }
    @Override
    public int hashCode() {
      return Objects.hashCode(this.assetCode4, this.assetCode12, this.type);
    }
    @Override
    public boolean equals(Object object) {
      if (object == null || !(object instanceof AllowTrustOpAsset)) {
        return false;
      }

      AllowTrustOpAsset other = (AllowTrustOpAsset) object;
      return Objects.equal(this.assetCode4, other.assetCode4) && Objects.equal(this.assetCode12, other.assetCode12) && Objects.equal(this.type, other.type);
    }

  }
}
