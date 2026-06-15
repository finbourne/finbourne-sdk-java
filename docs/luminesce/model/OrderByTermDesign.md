# com.finbourne.sdk.services.luminesce.model.OrderByTermDesign
classname OrderByTermDesign
A single clause within an Order BY

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | **String** | Name of the field to order by | [default to String]
**direction** | [**OrderByDirection**](OrderByDirection.md) |  | [optional] [default to OrderByDirection]
**tableAlias** | **String** | Table Alias of the field to order by | [optional] [default to String]

```java
import com.finbourne.sdk.services.luminesce.model.OrderByTermDesign;
import java.util.*;
import java.lang.System;
import java.net.URI;

String field = "example field";
OrderByDirection @javax.annotation.Nullable String tableAlias = "example tableAlias";


OrderByTermDesign orderByTermDesignInstance = new OrderByTermDesign()
    .field(field)
    .direction(direction)
    .tableAlias(tableAlias);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)