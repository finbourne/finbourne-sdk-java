# com.finbourne.sdk.services.lusid.model.TaxClassificationInputs
classname TaxClassificationInputs
The instrument static the decision tree reads. A missing flag is a missing input, not a false.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**loanRelationshipAsset** | **Boolean** | Whether the instrument is a loan relationship asset. | [optional] [default to Boolean]
**indexLinkedGilt** | **Boolean** | Whether the instrument is an index-linked gilt. | [optional] [default to Boolean]
**chargeableAsset** | **Boolean** | Whether disposals of the instrument give rise to chargeable gains. | [optional] [default to Boolean]
**cisNonTransparent** | **Boolean** | Whether the instrument is a non-transparent collective investment scheme. | [optional] [default to Boolean]
**cisTransparent** | **Boolean** | Whether the instrument is a transparent collective investment scheme. | [optional] [default to Boolean]
**derivative** | **Boolean** | Whether the instrument is a derivative contract. | [optional] [default to Boolean]
**derivativeFinancialFuture** | **Boolean** | Whether the derivative is a financial future or option within the chargeable gains rules. | [optional] [default to Boolean]
**derivativePooledSecurity** | **Boolean** | Whether the derivative is pooled as a security. | [optional] [default to Boolean]
**privateEquity** | **Boolean** | Whether the instrument is a private equity holding. | [optional] [default to Boolean]
**realEstate** | **Boolean** | Whether the instrument is a real estate holding. | [optional] [default to Boolean]
**qualifyingInvestmentsPercent** | **java.math.BigDecimal** | The percentage of the scheme&#39;s assets that are qualifying (non-equity) investments; more than 60 percent makes the scheme a bond fund. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.TaxClassificationInputs;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Boolean loanRelationshipAsset = true;
@javax.annotation.Nullable Boolean indexLinkedGilt = true;
@javax.annotation.Nullable Boolean chargeableAsset = true;
@javax.annotation.Nullable Boolean cisNonTransparent = true;
@javax.annotation.Nullable Boolean cisTransparent = true;
@javax.annotation.Nullable Boolean derivative = true;
@javax.annotation.Nullable Boolean derivativeFinancialFuture = true;
@javax.annotation.Nullable Boolean derivativePooledSecurity = true;
@javax.annotation.Nullable Boolean privateEquity = true;
@javax.annotation.Nullable Boolean realEstate = true;
@javax.annotation.Nullable java.math.BigDecimal qualifyingInvestmentsPercent = new java.math.BigDecimal("100.00");


TaxClassificationInputs taxClassificationInputsInstance = new TaxClassificationInputs()
    .loanRelationshipAsset(loanRelationshipAsset)
    .indexLinkedGilt(indexLinkedGilt)
    .chargeableAsset(chargeableAsset)
    .cisNonTransparent(cisNonTransparent)
    .cisTransparent(cisTransparent)
    .derivative(derivative)
    .derivativeFinancialFuture(derivativeFinancialFuture)
    .derivativePooledSecurity(derivativePooledSecurity)
    .privateEquity(privateEquity)
    .realEstate(realEstate)
    .qualifyingInvestmentsPercent(qualifyingInvestmentsPercent);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)