# com.finbourne.sdk.services.luminesce.model.TableExport
classname TableExport

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tableName** | **String** |  | [optional] [default to String]
**columns** | [**List&lt;ExportColumn&gt;**](ExportColumn.md) |  | [optional] [default to List<ExportColumn>]
**grouping** | [**ExportGrouping**](ExportGrouping.md) |  | [optional] [default to ExportGrouping]

```java
import com.finbourne.sdk.services.luminesce.model.TableExport;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String tableName = "example tableName";
@javax.annotation.Nullable List<ExportColumn> columns = new List<ExportColumn>();
ExportGrouping grouping = new ExportGrouping();


TableExport tableExportInstance = new TableExport()
    .tableName(tableName)
    .columns(columns)
    .grouping(grouping);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)