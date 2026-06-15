# com.finbourne.sdk.services.horizon.model.QueryRequest
classname QueryRequest
Used to control queries, including getting \"pages\" of data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**specification** | [**QuerySpecification**](QuerySpecification.md) |  | [optional] [default to QuerySpecification]

```java
import com.finbourne.sdk.services.horizon.model.QueryRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

QuerySpecification specification = new QuerySpecification();


QueryRequest queryRequestInstance = new QueryRequest()
    .specification(specification);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)