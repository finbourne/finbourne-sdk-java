# com.finbourne.sdk.services.access.model.IfRequestHeaderExpression
classname IfRequestHeaderExpression

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**headerName** | **String** |  | [default to String]
**operator** | [**TextOperator**](TextOperator.md) |  | [default to TextOperator]
**value** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.access.model.IfRequestHeaderExpression;
import java.util.*;
import java.lang.System;
import java.net.URI;

String headerName = "example headerName";
TextOperator @javax.annotation.Nullable String value = "example value";


IfRequestHeaderExpression ifRequestHeaderExpressionInstance = new IfRequestHeaderExpression()
    .headerName(headerName)
    .operator(operator)
    .value(value);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)