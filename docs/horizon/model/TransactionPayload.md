# com.finbourne.sdk.services.horizon.model.TransactionPayload
classname TransactionPayload
record containing the payload for a single transaction. Columns is compiled once from the TPF instance configuration and is identical across every item in the paginated result. PublicationStatus is the row's outcome: Sent, or Failed when the file holding it reached no destination.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionId** | **String** |  | [default to String]
**columns** | **List&lt;String&gt;** |  | [default to List<String>]
**values** | **Map&lt;String, String&gt;** |  | [default to Map<String, String>]
**rawCsvRow** | **String** |  | [default to String]
**publicationStatus** | **String** |  | [default to String]

```java
import com.finbourne.sdk.services.horizon.model.TransactionPayload;
import java.util.*;
import java.lang.System;
import java.net.URI;

String transactionId = "example transactionId";
List<String> columns = new List<String>();
Map<String, String> values = new Map<String, String>();
String rawCsvRow = "example rawCsvRow";
String publicationStatus = "example publicationStatus";


TransactionPayload transactionPayloadInstance = new TransactionPayload()
    .transactionId(transactionId)
    .columns(columns)
    .values(values)
    .rawCsvRow(rawCsvRow)
    .publicationStatus(publicationStatus);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)