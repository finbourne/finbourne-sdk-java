# com.finbourne.sdk.services.luminesce.model.QueryDesign
classname QueryDesign
Representation of a \"designable Query\" suitable for formatting to SQL or being built from compliant SQL.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tableName** | **String** | Name of the table being designed | [default to String]
**alias** | **String** | Alias for the table in the generated SQL, if any | [optional] [default to String]
**fields** | [**List&lt;FieldDesign&gt;**](FieldDesign.md) | Fields to be selected, aggregated over and/or filtered on | [default to List<FieldDesign>]
**joinedTables** | [**List&lt;JoinedTableDesign&gt;**](JoinedTableDesign.md) | Joined in table to the main TableName / Alias | [optional] [default to List<JoinedTableDesign>]
**orderBy** | [**List&lt;OrderByTermDesign&gt;**](OrderByTermDesign.md) | Order By clauses to apply | [optional] [default to List<OrderByTermDesign>]
**limit** | **Integer** | Row limit to apply, if any | [optional] [default to Integer]
**offset** | **Integer** | Row offset to apply, if any | [optional] [default to Integer]
**warnings** | **List&lt;String&gt;** | Any warnings to show the user when converting from SQL to this representation | [optional] [default to List<String>]
**availableFields** | [**List&lt;AvailableField&gt;**](AvailableField.md) | Fields that are known to be available for design when parsing SQL | [optional] [default to List<AvailableField>]

```java
import com.finbourne.sdk.services.luminesce.model.QueryDesign;
import java.util.*;
import java.lang.System;
import java.net.URI;

String tableName = "example tableName";
@javax.annotation.Nullable String alias = "example alias";
List<FieldDesign> fields = new List<FieldDesign>();
@javax.annotation.Nullable List<JoinedTableDesign> joinedTables = new List<JoinedTableDesign>();
@javax.annotation.Nullable List<OrderByTermDesign> orderBy = new List<OrderByTermDesign>();
@javax.annotation.Nullable Integer limit = new Integer("100.00");
@javax.annotation.Nullable Integer offset = new Integer("100.00");
@javax.annotation.Nullable List<String> warnings = new List<String>();
@javax.annotation.Nullable List<AvailableField> availableFields = new List<AvailableField>();


QueryDesign queryDesignInstance = new QueryDesign()
    .tableName(tableName)
    .alias(alias)
    .fields(fields)
    .joinedTables(joinedTables)
    .orderBy(orderBy)
    .limit(limit)
    .offset(offset)
    .warnings(warnings)
    .availableFields(availableFields);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)