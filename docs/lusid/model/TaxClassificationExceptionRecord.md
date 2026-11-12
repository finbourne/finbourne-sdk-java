# com.finbourne.sdk.services.lusid.model.TaxClassificationExceptionRecord
classname TaxClassificationExceptionRecord
An instrument the engine could not classify, or a qualifying-investments flip, for the exceptions feed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**luid** | **String** | The LUSID instrument identifier of the instrument the exception was raised for. | [default to String]
**instrumentName** | **String** | The name of the instrument the exception was raised for. | [optional] [default to String]
**exception** | [**TaxClassificationException**](TaxClassificationException.md) |  | [default to TaxClassificationException]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective date the exception was observed at. | [default to OffsetDateTime]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt time the exception was observed at. | [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.TaxClassificationExceptionRecord;
import java.util.*;
import java.lang.System;
import java.net.URI;

String luid = "example luid";
@javax.annotation.Nullable String instrumentName = "example instrumentName";
TaxClassificationException exception = new TaxClassificationException();
OffsetDateTime effectiveAt = OffsetDateTime.now();
OffsetDateTime asAt = OffsetDateTime.now();


TaxClassificationExceptionRecord taxClassificationExceptionRecordInstance = new TaxClassificationExceptionRecord()
    .luid(luid)
    .instrumentName(instrumentName)
    .exception(exception)
    .effectiveAt(effectiveAt)
    .asAt(asAt);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)