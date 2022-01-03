package org.stellar.sdk.responses.effects;

/**
 * Represents trustline_removed effect response.
 * @see <a href="https://developers.stellar.org/api/resources/effects/" target="_blank">Effect documentation</a>
 * @see org.stellar.sdk.requests.EffectsRequestBuilder
 * @see org.stellar.sdk.Server#effects()
 */
public class TrustlineRemovedEffectResponse extends TrustlineCUDResponse {
  TrustlineRemovedEffectResponse(String limit, String assetType, String assetCode, String assetIssuer) {
    super(limit, assetType, assetCode, assetIssuer);
  }
}