# com.finbourne.sdk.services.lusid.model.VirtualDocument
classname VirtualDocument
Virtual document consists of (potentially several) upserted documents.                The documents get parsed according to the provided data map on upsert, the collection of resulting values in  aggregated in a virtual document

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**documentId** | [**StructuredResultDataId**](StructuredResultDataId.md) |  | [optional] [default to StructuredResultDataId]
**data** | [**List&lt;VirtualDocumentRow&gt;**](VirtualDocumentRow.md) | The data inside the document | [optional] [default to List<VirtualDocumentRow>]

```java
import com.finbourne.sdk.services.lusid.model.VirtualDocument;
import java.util.*;
import java.lang.System;
import java.net.URI;

StructuredResultDataId documentId = new StructuredResultDataId();
@javax.annotation.Nullable List<VirtualDocumentRow> data = new List<VirtualDocumentRow>();


VirtualDocument virtualDocumentInstance = new VirtualDocument()
    .documentId(documentId)
    .data(data);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)