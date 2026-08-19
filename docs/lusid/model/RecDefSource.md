# com.finbourne.sdk.services.lusid.model.RecDefSource
classname RecDefSource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sourceType** | **String** | The type of entity that this source refers to. One of: Portfolio, PortfolioGroup, Fund. Available values: Portfolio, PortfolioGroup, Fund. | [default to String]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]

```java
import com.finbourne.sdk.services.lusid.model.RecDefSource;
import java.util.*;
import java.lang.System;
import java.net.URI;

String sourceType = "example sourceType";
ResourceId id = new ResourceId();


RecDefSource recDefSourceInstance = new RecDefSource()
    .sourceType(sourceType)
    .id(id);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)