# com.finbourne.sdk.services.lusid.model.GroupReconciliationComparisonRuleStringValueMap
classname GroupReconciliationComparisonRuleStringValueMap

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**leftValue** | **String** | The left string to map | [default to String]
**rightValue** | **String** | The right string to map | [default to String]
**direction** | **String** | The direction to map. Available values: BiDirectional, UniDirectional. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.GroupReconciliationComparisonRuleStringValueMap;
import java.util.*;
import java.lang.System;
import java.net.URI;

String leftValue = "example leftValue";
String rightValue = "example rightValue";
String direction = "example direction";


GroupReconciliationComparisonRuleStringValueMap groupReconciliationComparisonRuleStringValueMapInstance = new GroupReconciliationComparisonRuleStringValueMap()
    .leftValue(leftValue)
    .rightValue(rightValue)
    .direction(direction);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)