# com.finbourne.sdk.services.lusid.model.WithholdingTaxResolutionProvenance
classname WithholdingTaxResolutionProvenance

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**matchScore** | **java.math.BigDecimal** | The share of the main dataset&#39;s dimensions that the row matches, from 0 to 1. Null on an anomaly match. | [optional] [default to java.math.BigDecimal]
**matchedFieldCount** | **Integer** | The number of the main dataset&#39;s dimensions that the row matches. Null on an anomaly match. | [optional] [default to Integer]
**sourceFilterApplied** | **String** | The rule source level that matched. Null when no source priority applies. | [optional] [default to String]
**tieBroken** | **Boolean** | True when another row matched as well as the winner, so the tie-break order chose: the latest effective date, then the rule id. | [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.WithholdingTaxResolutionProvenance;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable java.math.BigDecimal matchScore = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable Integer matchedFieldCount = new Integer("100.00");
@javax.annotation.Nullable String sourceFilterApplied = "example sourceFilterApplied";
Boolean tieBroken = true;


WithholdingTaxResolutionProvenance withholdingTaxResolutionProvenanceInstance = new WithholdingTaxResolutionProvenance()
    .matchScore(matchScore)
    .matchedFieldCount(matchedFieldCount)
    .sourceFilterApplied(sourceFilterApplied)
    .tieBroken(tieBroken);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)