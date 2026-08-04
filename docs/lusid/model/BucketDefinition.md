# com.finbourne.sdk.services.lusid.model.BucketDefinition
classname BucketDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bucketId** | **String** |  | [default to String]
**displayName** | **String** |  | [default to String]
**filterExpression** | **String** |  | [default to String]
**bucketType** | **String** | Available values: Dealing, PnL, Fees, BalanceSheet, Misc. | [default to String]
**unitised** | **Boolean** |  | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.BucketDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String bucketId = "example bucketId";
String displayName = "example displayName";
String filterExpression = "example filterExpression";
String bucketType = "example bucketType";
@javax.annotation.Nullable Boolean unitised = true;


BucketDefinition bucketDefinitionInstance = new BucketDefinition()
    .bucketId(bucketId)
    .displayName(displayName)
    .filterExpression(filterExpression)
    .bucketType(bucketType)
    .unitised(unitised);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)