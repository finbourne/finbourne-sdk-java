# com.finbourne.sdk.services.lusid.model.VirtualRow
classname VirtualRow
Rows identified by the composite id, based on the data maps

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rowId** | **Map&lt;String, String&gt;** | The identifier for the row. This is keyed by address keys, and values obtained through applying the data map to the documents. | [optional] [default to Map<String, String>]
**rowData** | [**Map&lt;String, ResultValue&gt;**](ResultValue.md) | The data for the particular row | [optional] [default to Map<String, ResultValue>]

```java
import com.finbourne.sdk.services.lusid.model.VirtualRow;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, String> rowId = new Map<String, String>();
@javax.annotation.Nullable Map<String, ResultValue> rowData = new Map<String, ResultValue>();


VirtualRow virtualRowInstance = new VirtualRow()
    .rowId(rowId)
    .rowData(rowData);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)