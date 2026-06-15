# com.finbourne.sdk.services.lusid.model.ValuationPointDataQueryParameters
classname ValuationPointDataQueryParameters
The parameters used in getting the ValuationPointData.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start** | [**DateOrDiaryEntry**](DateOrDiaryEntry.md) |  | [optional] [default to DateOrDiaryEntry]
**end** | [**DateOrDiaryEntry**](DateOrDiaryEntry.md) |  | [default to DateOrDiaryEntry]
**variant** | **String** | Optional variant code. Only required when it is necessary to choose between scenarios with multiple estimates. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ValuationPointDataQueryParameters;
import java.util.*;
import java.lang.System;
import java.net.URI;

DateOrDiaryEntry start = new DateOrDiaryEntry();
DateOrDiaryEntry end = new DateOrDiaryEntry();
@javax.annotation.Nullable String variant = "example variant";


ValuationPointDataQueryParameters valuationPointDataQueryParametersInstance = new ValuationPointDataQueryParameters()
    .start(start)
    .end(end)
    .variant(variant);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)