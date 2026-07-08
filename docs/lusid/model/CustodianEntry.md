# com.finbourne.sdk.services.lusid.model.CustodianEntry
classname CustodianEntry

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**accountSelector** | **String** | Available values: From, To. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CustodianEntry;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId accountId = new ResourceId();
@javax.annotation.Nullable String accountSelector = "example accountSelector";


CustodianEntry custodianEntryInstance = new CustodianEntry()
    .accountId(accountId)
    .accountSelector(accountSelector);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)