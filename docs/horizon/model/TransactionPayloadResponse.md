# com.finbourne.sdk.services.horizon.model.TransactionPayloadResponse
classname TransactionPayloadResponse
record containing details of a transaction payload.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**columns** | **List&lt;String&gt;** |  | [default to List<String>]
**values** | **Map&lt;String, String&gt;** |  | [default to Map<String, String>]
**rawCsvRow** | **String** |  | [default to String]

```java
import com.finbourne.sdk.services.horizon.model.TransactionPayloadResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<String> columns = new List<String>();
Map<String, String> values = new Map<String, String>();
String rawCsvRow = "example rawCsvRow";


TransactionPayloadResponse transactionPayloadResponseInstance = new TransactionPayloadResponse()
    .columns(columns)
    .values(values)
    .rawCsvRow(rawCsvRow);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)