# com.finbourne.sdk.services.horizon.model.OpenFigiPermIdResult
classname OpenFigiPermIdResult
A packed WebAPI OpenFigi DTO and PermId DTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**openFigiResult** | [**OpenFigiData**](OpenFigiData.md) |  | [default to OpenFigiData]
**permIdResult** | [**PermIdData**](PermIdData.md) |  | [optional] [default to PermIdData]

```java
import com.finbourne.sdk.services.horizon.model.OpenFigiPermIdResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

OpenFigiData openFigiResult = new OpenFigiData();
PermIdData permIdResult = new PermIdData();


OpenFigiPermIdResult openFigiPermIdResultInstance = new OpenFigiPermIdResult()
    .openFigiResult(openFigiResult)
    .permIdResult(permIdResult);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)