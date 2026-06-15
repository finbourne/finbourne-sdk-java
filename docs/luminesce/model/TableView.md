# com.finbourne.sdk.services.luminesce.model.TableView
classname TableView
Representation of the table structure

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**headerNames** | **Map&lt;String, String&gt;** | Mapping of column ids to aliases | [default to Map<String, String>]
**columnState** | [**List&lt;ColumnStateType&gt;**](ColumnStateType.md) | Array of all columns in the dashboard | [default to List<ColumnStateType>]
**filters** | [**Map&lt;String, FilterModel&gt;**](FilterModel.md) | Filters applied to columns in the dashboard | [optional] [default to Map<String, FilterModel>]
**meta** | [**TableMeta**](TableMeta.md) |  | [default to TableMeta]

```java
import com.finbourne.sdk.services.luminesce.model.TableView;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, String> headerNames = new Map<String, String>();
List<ColumnStateType> columnState = new List<ColumnStateType>();
@javax.annotation.Nullable Map<String, FilterModel> filters = new Map<String, FilterModel>();
TableMeta meta = new TableMeta();


TableView tableViewInstance = new TableView()
    .headerNames(headerNames)
    .columnState(columnState)
    .filters(filters)
    .meta(meta);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)