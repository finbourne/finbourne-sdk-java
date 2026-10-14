# com.finbourne.sdk.services.lusid.model.FundClosing
classname FundClosing

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**closingId** | **String** |  | [default to String]
**closingDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**isFinal** | **Boolean** |  | [optional] [default to Boolean]
**description** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.FundClosing;
import java.util.*;
import java.lang.System;
import java.net.URI;

String closingId = "example closingId";
OffsetDateTime closingDate = OffsetDateTime.now();
@javax.annotation.Nullable Boolean isFinal = true;
@javax.annotation.Nullable String description = "example description";


FundClosing fundClosingInstance = new FundClosing()
    .closingId(closingId)
    .closingDate(closingDate)
    .isFinal(isFinal)
    .description(description);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)