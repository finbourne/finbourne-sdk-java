# com.finbourne.sdk.services.luminesce.model.FilterTermDesign
classname FilterTermDesign
A single filter clause

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operator** | [**QueryDesignerBinaryOperator**](QueryDesignerBinaryOperator.md) |  | [default to QueryDesignerBinaryOperator]
**value** | **String** | The value to compare against (always as a string, but will be formatted to the correct type) | [default to String]

```java
import com.finbourne.sdk.services.luminesce.model.FilterTermDesign;
import java.util.*;
import java.lang.System;
import java.net.URI;

QueryDesignerBinaryOperator String value = "example value";


FilterTermDesign filterTermDesignInstance = new FilterTermDesign()
    .operator(operator)
    .value(value);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)