# com.finbourne.sdk.services.luminesce.model.ExportType
classname ExportType
The types of Exporting capable of being delivered by the WebAPI. Similar but not identical to <seealso cref=\"T:Finbourne.Honeycomb.Api.Hosting.Exporting.OutputType\" />

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ExportType** | [**String**](.md) | **The types of Exporting capable of being delivered by the WebAPI. Similar but not identical to &lt;seealso cref&#x3D;\&quot;T:Finbourne.Honeycomb.Api.Hosting.Exporting.OutputType\&quot; /&gt;** | [default to String]

```java
import com.finbourne.sdk.services.luminesce.model.ExportType;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example usage of ExportType:
ExportType method = ExportType.CSV;
ExportType method = ExportType.PIPE;
ExportType method = ExportType.EXCEL;
ExportType method = ExportType.JSON;
ExportType method = ExportType.JSON_PROPER;
ExportType method = ExportType.XML;
ExportType method = ExportType.PARQUET;
ExportType method = ExportType.SQLITE;
ExportType method = ExportType.TABLE_INTERNAL;
ExportType method = ExportType.JSON_PROPER_WITH_LINEAGE;
ExportType method = ExportType.PDF;
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)