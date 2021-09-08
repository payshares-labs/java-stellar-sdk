// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.sdk.xdr;


import java.io.IOException;


// === xdr source ============================================================

//  enum LedgerHeaderFlags
//  { // masks for each flag
//  
//      DISABLE_LIQUIDITY_POOL_TRADING_FLAG = 0x1,
//      DISABLE_LIQUIDITY_POOL_DEPOSIT_FLAG = 0x2,
//      DISABLE_LIQUIDITY_POOL_WITHDRAWAL_FLAG = 0x4
//  };

//  ===========================================================================
public enum LedgerHeaderFlags implements XdrElement {
  DISABLE_LIQUIDITY_POOL_TRADING_FLAG(1),
  DISABLE_LIQUIDITY_POOL_DEPOSIT_FLAG(2),
  DISABLE_LIQUIDITY_POOL_WITHDRAWAL_FLAG(4),
  ;
  private int mValue;

  LedgerHeaderFlags(int value) {
      mValue = value;
  }

  public int getValue() {
      return mValue;
  }

  public static LedgerHeaderFlags decode(XdrDataInputStream stream) throws IOException {
    int value = stream.readInt();
    switch (value) {
      case 1: return DISABLE_LIQUIDITY_POOL_TRADING_FLAG;
      case 2: return DISABLE_LIQUIDITY_POOL_DEPOSIT_FLAG;
      case 4: return DISABLE_LIQUIDITY_POOL_WITHDRAWAL_FLAG;
      default:
        throw new RuntimeException("Unknown enum value: " + value);
    }
  }

  public static void encode(XdrDataOutputStream stream, LedgerHeaderFlags value) throws IOException {
    stream.writeInt(value.getValue());
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }
}
