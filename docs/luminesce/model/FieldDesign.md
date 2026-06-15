# com.finbourne.sdk.services.luminesce.model.FieldDesign
classname FieldDesign
Treatment of a single field within a QueryDesign

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the Field (column name, constant, complex expression, etc.) | [default to String]
**tableAlias** | **String** | Alias of the Table the field belongs to | [optional] [default to String]
**alias** | **String** | Alias if any (if none the Name is used) | [optional] [default to String]
**dataType** | [**DataType**](DataType.md) |  | [optional] [default to DataType]
**shouldSelect** | **Boolean** | Should this be selected? False would imply it is only being filtered on. Ignored when Aggregations are present | [optional] [default to Boolean]
**filters** | [**List&lt;FilterTermDesign&gt;**](FilterTermDesign.md) | Filter clauses to apply to this field (And&#39;ed together) | [optional] [default to List<FilterTermDesign>]
**aggregations** | [**List&lt;Aggregation&gt;**](Aggregation.md) | Aggregations to apply (as opposed to simply selecting) | [optional] [default to List<Aggregation>]
**isExpression** | **Boolean** | Is this field an expression | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.luminesce.model.FieldDesign;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
@javax.annotation.Nullable String tableAlias = "example tableAlias";
@javax.annotation.Nullable String alias = "example alias";
DataType Boolean shouldSelect = true;
@javax.annotation.Nullable List<FilterTermDesign> filters = new List<FilterTermDesign>();
@javax.annotation.Nullable List<Aggregation> aggregations = new List<Aggregation>();
Boolean isExpression = true;


FieldDesign fieldDesignInstance = new FieldDesign()
    .name(name)
    .tableAlias(tableAlias)
    .alias(alias)
    .dataType(dataType)
    .shouldSelect(shouldSelect)
    .filters(filters)
    .aggregations(aggregations)
    .isExpression(isExpression);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)