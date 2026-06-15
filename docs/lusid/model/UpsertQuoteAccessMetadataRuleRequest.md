# com.finbourne.sdk.services.lusid.model.UpsertQuoteAccessMetadataRuleRequest
classname UpsertQuoteAccessMetadataRuleRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**QuoteAccessMetadataRuleId**](QuoteAccessMetadataRuleId.md) |  | [default to QuoteAccessMetadataRuleId]
**metadata** | [**Map&lt;String, List&lt;AccessMetadataValue&gt;&gt;**](List.md) | The access control metadata to assign to quotes that match the identifier | [default to Map<String, List<AccessMetadataValue>>]

```java
import com.finbourne.sdk.services.lusid.model.UpsertQuoteAccessMetadataRuleRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

QuoteAccessMetadataRuleId id = new QuoteAccessMetadataRuleId();
Map<String, List<AccessMetadataValue>> metadata = new Map<String, List<AccessMetadataValue>>();


UpsertQuoteAccessMetadataRuleRequest upsertQuoteAccessMetadataRuleRequestInstance = new UpsertQuoteAccessMetadataRuleRequest()
    .id(id)
    .metadata(metadata);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)