# com.finbourne.sdk.services.horizon.model.QuerySpecification
classname QuerySpecification
Defines the information that can be used to query a set of data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**limit** | **Integer** | The maximum number of results to be returned in a \&quot;page\&quot; | [optional] [default to Integer]

```java
import com.finbourne.sdk.services.horizon.model.QuerySpecification;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Integer limit = new Integer("100.00");


QuerySpecification querySpecificationInstance = new QuerySpecification()
    .limit(limit);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)