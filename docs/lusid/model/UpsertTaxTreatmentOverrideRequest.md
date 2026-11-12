# com.finbourne.sdk.services.lusid.model.UpsertTaxTreatmentOverrideRequest
classname UpsertTaxTreatmentOverrideRequest
Pins an instrument to a treatment leaf in place of the system-derived one.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**treatment** | **String** | The treatment leaf to pin the instrument to, replacing the system-derived one. Available values: OutsideBlagab, LoanRelationship, IndexLinkedGilt, PrivateEquity, RealEstate, FinancialFuture, PooledDerivative, DerivativeProfitAndLoss, NonTransparentScheme, BondFund, TransparentScheme, StandardEquity, Exempt. | [default to String]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective date the override applies from. Defaults to the start of time if not specified. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.UpsertTaxTreatmentOverrideRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String treatment = "example treatment";
@javax.annotation.Nullable OffsetDateTime effectiveAt = OffsetDateTime.now();


UpsertTaxTreatmentOverrideRequest upsertTaxTreatmentOverrideRequestInstance = new UpsertTaxTreatmentOverrideRequest()
    .treatment(treatment)
    .effectiveAt(effectiveAt);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)