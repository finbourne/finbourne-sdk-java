# com.finbourne.sdk.services.lusid.model.SingleValuationPointQueryParameters
classname SingleValuationPointQueryParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateOrDiaryEntry** | [**DateOrDiaryEntry**](DateOrDiaryEntry.md) |  | [default to DateOrDiaryEntry]
**variant** | **String** | Optional variant code. Only required when it is necessary to choose between scenarios with multiple estimates. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.SingleValuationPointQueryParameters;
import java.util.*;
import java.lang.System;
import java.net.URI;

DateOrDiaryEntry dateOrDiaryEntry = new DateOrDiaryEntry();
@javax.annotation.Nullable String variant = "example variant";


SingleValuationPointQueryParameters singleValuationPointQueryParametersInstance = new SingleValuationPointQueryParameters()
    .dateOrDiaryEntry(dateOrDiaryEntry)
    .variant(variant);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)