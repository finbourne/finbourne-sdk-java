# com.finbourne.sdk.services.luminesce.model.ColumnInfo
classname ColumnInfo
Information on how to construct a file-read sql query

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**select** | **Boolean** | Should the column be used/selected? | [optional] [default to Boolean]
**type** | [**DataType**](DataType.md) |  | [optional] [default to DataType]
**name** | **String** | The name of the column | [optional] [default to String]
**xPath** | **String** | Xpath for the column (only applicable to XML defined columns) | [optional] [default to String]

```java
import com.finbourne.sdk.services.luminesce.model.ColumnInfo;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean select = true;
DataType @javax.annotation.Nullable String name = "example name";
@javax.annotation.Nullable String xPath = "example xPath";


ColumnInfo columnInfoInstance = new ColumnInfo()
    .select(select)
    .type(type)
    .name(name)
    .xPath(xPath);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)