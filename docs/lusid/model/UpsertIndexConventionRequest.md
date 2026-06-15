# com.finbourne.sdk.services.lusid.model.UpsertIndexConventionRequest
classname UpsertIndexConventionRequest
Index convention that is to be stored in the convention data store.  Only one of these must be present.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**indexConvention** | [**IndexConvention**](IndexConvention.md) |  | [optional] [default to IndexConvention]

```java
import com.finbourne.sdk.services.lusid.model.UpsertIndexConventionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

IndexConvention indexConvention = new IndexConvention();


UpsertIndexConventionRequest upsertIndexConventionRequestInstance = new UpsertIndexConventionRequest()
    .indexConvention(indexConvention);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)