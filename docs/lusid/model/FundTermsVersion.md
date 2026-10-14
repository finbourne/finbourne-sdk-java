# com.finbourne.sdk.services.lusid.model.FundTermsVersion
classname FundTermsVersion

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**termsVersionId** | **String** |  | [default to String]
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**fees** | [**List&lt;FeeDefinition&gt;**](FeeDefinition.md) |  | [optional] [default to List<FeeDefinition>]
**carry** | [**CarryParameters**](CarryParameters.md) |  | [optional] [default to CarryParameters]
**recycling** | [**RecyclingTerms**](RecyclingTerms.md) |  | [optional] [default to RecyclingTerms]
**equalisation** | [**EqualisationTerms**](EqualisationTerms.md) |  | [optional] [default to EqualisationTerms]
**appliesFromClosingId** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.FundTermsVersion;
import java.util.*;
import java.lang.System;
import java.net.URI;

String termsVersionId = "example termsVersionId";
OffsetDateTime effectiveFrom = OffsetDateTime.now();
@javax.annotation.Nullable List<FeeDefinition> fees = new List<FeeDefinition>();
CarryParameters carry = new CarryParameters();
RecyclingTerms recycling = new RecyclingTerms();
EqualisationTerms equalisation = new EqualisationTerms();
@javax.annotation.Nullable String appliesFromClosingId = "example appliesFromClosingId";


FundTermsVersion fundTermsVersionInstance = new FundTermsVersion()
    .termsVersionId(termsVersionId)
    .effectiveFrom(effectiveFrom)
    .fees(fees)
    .carry(carry)
    .recycling(recycling)
    .equalisation(equalisation)
    .appliesFromClosingId(appliesFromClosingId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)