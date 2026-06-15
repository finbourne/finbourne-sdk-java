# com.finbourne.sdk.services.horizon.model.OpenFigiSearchResult
classname OpenFigiSearchResult
Response coming back from a search request to OpenFIGI

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**results** | [**List&lt;OpenFigiData&gt;**](OpenFigiData.md) | Enumerable list of OpenFIGI results | [default to List<OpenFigiData>]
**permIdUri** | **String** | URI of the related PermID response, if requested | [optional] [default to String]

```java
import com.finbourne.sdk.services.horizon.model.OpenFigiSearchResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<OpenFigiData> results = new List<OpenFigiData>();
@javax.annotation.Nullable String permIdUri = "example permIdUri";


OpenFigiSearchResult openFigiSearchResultInstance = new OpenFigiSearchResult()
    .results(results)
    .permIdUri(permIdUri);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)