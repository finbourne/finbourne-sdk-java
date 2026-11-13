# com.finbourne.sdk.services.lusid.model.TaxAccountingPeriod
classname TaxAccountingPeriod

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label** | **String** | The label of the period, for example the four-digit year. | [optional] [default to String]
**start** | [**OffsetDateTime**](OffsetDateTime.md) | The first day of the period, inclusive. | [optional] [default to OffsetDateTime]
**end** | [**OffsetDateTime**](OffsetDateTime.md) | The last day of the period, inclusive. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.TaxAccountingPeriod;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String label = "example label";
OffsetDateTime start = OffsetDateTime.now();
OffsetDateTime end = OffsetDateTime.now();


TaxAccountingPeriod taxAccountingPeriodInstance = new TaxAccountingPeriod()
    .label(label)
    .start(start)
    .end(end);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)