# com.finbourne.sdk.services.access.model.IfViaApiExpression
classname IfViaApiExpression

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiFeatureCodes** | **List&lt;String&gt;** |  | [default to List<String>]
**operator** | **String** |  | [default to String]

```java
import com.finbourne.sdk.services.access.model.IfViaApiExpression;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<String> apiFeatureCodes = new List<String>();
String operator = "example operator";


IfViaApiExpression ifViaApiExpressionInstance = new IfViaApiExpression()
    .apiFeatureCodes(apiFeatureCodes)
    .operator(operator);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)