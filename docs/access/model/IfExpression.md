# com.finbourne.sdk.services.access.model.IfExpression
classname IfExpression

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ifRequestHeaderExpression** | [**IfRequestHeaderExpression**](IfRequestHeaderExpression.md) |  | [optional] [default to IfRequestHeaderExpression]
**ifIdentityClaimExpression** | [**IfIdentityClaimExpression**](IfIdentityClaimExpression.md) |  | [optional] [default to IfIdentityClaimExpression]
**ifIdentityScopeExpression** | [**IfIdentityScopeExpression**](IfIdentityScopeExpression.md) |  | [optional] [default to IfIdentityScopeExpression]
**ifViaApiExpression** | [**IfViaApiExpression**](IfViaApiExpression.md) |  | [optional] [default to IfViaApiExpression]

```java
import com.finbourne.sdk.services.access.model.IfExpression;
import java.util.*;
import java.lang.System;
import java.net.URI;

IfRequestHeaderExpression ifRequestHeaderExpression = new IfRequestHeaderExpression();
IfIdentityClaimExpression ifIdentityClaimExpression = new IfIdentityClaimExpression();
IfIdentityScopeExpression ifIdentityScopeExpression = new IfIdentityScopeExpression();
IfViaApiExpression ifViaApiExpression = new IfViaApiExpression();


IfExpression ifExpressionInstance = new IfExpression()
    .ifRequestHeaderExpression(ifRequestHeaderExpression)
    .ifIdentityClaimExpression(ifIdentityClaimExpression)
    .ifIdentityScopeExpression(ifIdentityScopeExpression)
    .ifViaApiExpression(ifViaApiExpression);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)