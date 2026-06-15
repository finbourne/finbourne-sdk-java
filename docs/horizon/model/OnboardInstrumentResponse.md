# com.finbourne.sdk.services.horizon.model.OnboardInstrumentResponse
classname OnboardInstrumentResponse
Simplified structure converted from the LUSID UpsertInstrumentReponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | **String** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to String]
**values** | **List&lt;String&gt;** | The instruments which have been successfully updated or created. | [default to List<String>]
**failed** | **Map&lt;String, String&gt;** | The instruments that could not be updated or created or were left unchanged without error along with a reason for their failure. | [default to Map<String, String>]

```java
import com.finbourne.sdk.services.horizon.model.OnboardInstrumentResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String href = "example href";
List<String> values = new List<String>();
Map<String, String> failed = new Map<String, String>();


OnboardInstrumentResponse onboardInstrumentResponseInstance = new OnboardInstrumentResponse()
    .href(href)
    .values(values)
    .failed(failed);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)