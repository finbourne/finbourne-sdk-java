# com.finbourne.sdk.services.lusid.model.VirtualDocumentRow
classname VirtualDocumentRow
Rows identified by the composite id, based on the data maps

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rowId** | **Map&lt;String, String&gt;** | The identifier for the row. This is keyed by address keys, and values obtained through applying the data map to the documents. | [optional] [default to Map<String, String>]
**rowData** | [**GroupedResultOfAddressKey**](GroupedResultOfAddressKey.md) |  | [optional] [default to GroupedResultOfAddressKey]

```java
import com.finbourne.sdk.services.lusid.model.VirtualDocumentRow;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, String> rowId = new Map<String, String>();
GroupedResultOfAddressKey rowData = new GroupedResultOfAddressKey();


VirtualDocumentRow virtualDocumentRowInstance = new VirtualDocumentRow()
    .rowId(rowId)
    .rowData(rowData);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)