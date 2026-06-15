# com.finbourne.sdk.services.luminesce.model.ExpressionWithAlias
classname ExpressionWithAlias
Contract for an expression of data we \"have\" that we may \"want to map to a table-parameter's column\"

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expression** | **String** | Expression (column name, constant, complex expression, etc.) | [default to String]
**alias** | **String** | Column Alias for the expression | [optional] [default to String]
**flags** | [**MappingFlags**](MappingFlags.md) |  | [optional] [default to MappingFlags]

```java
import com.finbourne.sdk.services.luminesce.model.ExpressionWithAlias;
import java.util.*;
import java.lang.System;
import java.net.URI;

String expression = "example expression";
@javax.annotation.Nullable String alias = "example alias";
MappingFlags 

ExpressionWithAlias expressionWithAliasInstance = new ExpressionWithAlias()
    .expression(expression)
    .alias(alias)
    .flags(flags);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)