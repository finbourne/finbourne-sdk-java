# com.finbourne.sdk.services.lusid.model.RecyclingTerms
classname RecyclingTerms

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **Boolean** |  | [default to Boolean]
**capPercentageOfCommitments** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**recyclingEndDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.RecyclingTerms;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean enabled = true;
@javax.annotation.Nullable java.math.BigDecimal capPercentageOfCommitments = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable OffsetDateTime recyclingEndDate = OffsetDateTime.now();


RecyclingTerms recyclingTermsInstance = new RecyclingTerms()
    .enabled(enabled)
    .capPercentageOfCommitments(capPercentageOfCommitments)
    .recyclingEndDate(recyclingEndDate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)