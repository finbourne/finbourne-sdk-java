# com.finbourne.sdk.services.luminesce.model.ColumnStateType
classname ColumnStateType
Representation of a column within the grid

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**colId** | **String** | Unique identifier for the column | [default to String]
**hide** | **Boolean** | Flag to determine whether the column is visible in the grid | [default to Boolean]
**sort** | **String** | The sort order (asc or desc) | [optional] [default to String]
**sortIndex** | **Integer** | The index of the sort to determine the order in which the sorts are applied | [optional] [default to Integer]

```java
import com.finbourne.sdk.services.luminesce.model.ColumnStateType;
import java.util.*;
import java.lang.System;
import java.net.URI;

String colId = "example colId";
Boolean hide = true;
@javax.annotation.Nullable String sort = "example sort";
@javax.annotation.Nullable Integer sortIndex = new Integer("100.00");


ColumnStateType columnStateTypeInstance = new ColumnStateType()
    .colId(colId)
    .hide(hide)
    .sort(sort)
    .sortIndex(sortIndex);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)