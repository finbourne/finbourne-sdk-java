# com.finbourne.sdk.services.luminesce.model.OnClauseTermDesign
classname OnClauseTermDesign
A single on clause term (a pair of columns to join or a column to filter on)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**leftTableField** | **String** | Name of field in the left table to join to (complex expressions are not supported at this time) | [optional] [default to String]
**rightTableField** | **String** | Name of field in the left table to join to (complex expressions are not supported at this time) | [optional] [default to String]
**operator** | [**QueryDesignerBinaryOperator**](QueryDesignerBinaryOperator.md) |  | [default to QueryDesignerBinaryOperator]
**filterValue** | **String** | The value to compare against (always as a string, but will be formatted to the correct type) | [optional] [default to String]
**filterValueDataType** | [**DataType**](DataType.md) |  | [optional] [default to DataType]

```java
import com.finbourne.sdk.services.luminesce.model.OnClauseTermDesign;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String leftTableField = "example leftTableField";
@javax.annotation.Nullable String rightTableField = "example rightTableField";
QueryDesignerBinaryOperator @javax.annotation.Nullable String filterValue = "example filterValue";
DataType 

OnClauseTermDesign onClauseTermDesignInstance = new OnClauseTermDesign()
    .leftTableField(leftTableField)
    .rightTableField(rightTableField)
    .operator(operator)
    .filterValue(filterValue)
    .filterValueDataType(filterValueDataType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)