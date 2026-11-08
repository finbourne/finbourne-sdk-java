# com.finbourne.sdk.services.luminesce.model.ExportFormatting
classname ExportFormatting

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timezone** | **String** |  | [optional] [default to String]
**locale** | **String** |  | [optional] [default to String]
**tables** | [**List&lt;TableExport&gt;**](TableExport.md) |  | [optional] [default to List<TableExport>]

```java
import com.finbourne.sdk.services.luminesce.model.ExportFormatting;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String timezone = "example timezone";
@javax.annotation.Nullable String locale = "example locale";
@javax.annotation.Nullable List<TableExport> tables = new List<TableExport>();


ExportFormatting exportFormattingInstance = new ExportFormatting()
    .timezone(timezone)
    .locale(locale)
    .tables(tables);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)