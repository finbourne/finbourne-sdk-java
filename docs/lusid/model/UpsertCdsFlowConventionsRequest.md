# com.finbourne.sdk.services.lusid.model.UpsertCdsFlowConventionsRequest
classname UpsertCdsFlowConventionsRequest
CDS Flow convention that is to be stored in the convention data store.  Only one of these must be present.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cdsFlowConventions** | [**CdsFlowConventions**](CdsFlowConventions.md) |  | [optional] [default to CdsFlowConventions]

```java
import com.finbourne.sdk.services.lusid.model.UpsertCdsFlowConventionsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

CdsFlowConventions cdsFlowConventions = new CdsFlowConventions();


UpsertCdsFlowConventionsRequest upsertCdsFlowConventionsRequestInstance = new UpsertCdsFlowConventionsRequest()
    .cdsFlowConventions(cdsFlowConventions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)