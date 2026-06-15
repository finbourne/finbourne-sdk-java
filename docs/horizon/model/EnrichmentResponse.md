# com.finbourne.sdk.services.horizon.model.EnrichmentResponse
classname EnrichmentResponse
Collated enrichment result information

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enrichedInstruments** | **List&lt;String&gt;** |  | [default to List<String>]
**ignoredInstruments** | **List&lt;String&gt;** |  | [default to List<String>]
**errorFileId** | **String** | Error File ID, if one was created | [optional] [default to String]

```java
import com.finbourne.sdk.services.horizon.model.EnrichmentResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<String> enrichedInstruments = new List<String>();
List<String> ignoredInstruments = new List<String>();
@javax.annotation.Nullable String errorFileId = "example errorFileId";


EnrichmentResponse enrichmentResponseInstance = new EnrichmentResponse()
    .enrichedInstruments(enrichedInstruments)
    .ignoredInstruments(ignoredInstruments)
    .errorFileId(errorFileId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)