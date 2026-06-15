# com.finbourne.sdk.services.access.model.IfIdentityClaimExpression
classname IfIdentityClaimExpression

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**claimType** | **String** |  | [default to String]
**claimValueType** | **String** |  | [optional] [default to String]
**claimIssuer** | **String** |  | [optional] [default to String]
**claimOriginalIssuer** | **String** |  | [optional] [default to String]
**operator** | [**TextOperator**](TextOperator.md) |  | [default to TextOperator]
**value** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.access.model.IfIdentityClaimExpression;
import java.util.*;
import java.lang.System;
import java.net.URI;

String claimType = "example claimType";
@javax.annotation.Nullable String claimValueType = "example claimValueType";
@javax.annotation.Nullable String claimIssuer = "example claimIssuer";
@javax.annotation.Nullable String claimOriginalIssuer = "example claimOriginalIssuer";
TextOperator @javax.annotation.Nullable String value = "example value";


IfIdentityClaimExpression ifIdentityClaimExpressionInstance = new IfIdentityClaimExpression()
    .claimType(claimType)
    .claimValueType(claimValueType)
    .claimIssuer(claimIssuer)
    .claimOriginalIssuer(claimOriginalIssuer)
    .operator(operator)
    .value(value);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)