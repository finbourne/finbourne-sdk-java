# com.finbourne.sdk.services.lusid.model.RevertValuationPointDataRequest
classname RevertValuationPointDataRequest
The RevertValuationPointDataRequest.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**diaryEntryCode** | **String** | Unique code for the Valuation Point. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.RevertValuationPointDataRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String diaryEntryCode = "example diaryEntryCode";


RevertValuationPointDataRequest revertValuationPointDataRequestInstance = new RevertValuationPointDataRequest()
    .diaryEntryCode(diaryEntryCode);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)