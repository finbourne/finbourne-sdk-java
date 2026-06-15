# com.finbourne.sdk.services.lusid.model.TranslateEntitiesResponse
classname TranslateEntitiesResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**Map&lt;String, TranslationResult&gt;**](TranslationResult.md) | The entities that were successfully translated. | [optional] [default to Map<String, TranslationResult>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The error details corresponding to entities that failed to be translated. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.TranslateEntitiesResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, TranslationResult> values = new Map<String, TranslationResult>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


TranslateEntitiesResponse translateEntitiesResponseInstance = new TranslateEntitiesResponse()
    .values(values)
    .failed(failed)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)