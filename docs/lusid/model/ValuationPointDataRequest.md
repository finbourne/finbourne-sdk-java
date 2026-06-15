# com.finbourne.sdk.services.lusid.model.ValuationPointDataRequest
classname ValuationPointDataRequest
The ValuationPointDataRequest.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**diaryEntryCode** | **String** | Unique code for the Valuation Point. | [default to String]
**diaryEntryVariant** | **String** | Optional variant code. Only required when it is necessary to choose between scenarios with multiple estimates. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ValuationPointDataRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String diaryEntryCode = "example diaryEntryCode";
@javax.annotation.Nullable String diaryEntryVariant = "example diaryEntryVariant";


ValuationPointDataRequest valuationPointDataRequestInstance = new ValuationPointDataRequest()
    .diaryEntryCode(diaryEntryCode)
    .diaryEntryVariant(diaryEntryVariant);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)