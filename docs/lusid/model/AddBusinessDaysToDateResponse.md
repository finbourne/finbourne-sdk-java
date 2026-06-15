# com.finbourne.sdk.services.lusid.model.AddBusinessDaysToDateResponse
classname AddBusinessDaysToDateResponse
The date that is the requested number of business days after the given start date

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.AddBusinessDaysToDateResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime value = OffsetDateTime.now();


AddBusinessDaysToDateResponse addBusinessDaysToDateResponseInstance = new AddBusinessDaysToDateResponse()
    .value(value);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)