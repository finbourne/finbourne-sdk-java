# com.finbourne.sdk.services.lusid.model.BucketSetDefinition
classname BucketSetDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** |  | [default to String]
**displayName** | **String** |  | [default to String]
**navTypes** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**unitised** | **Boolean** |  | [default to Boolean]
**buckets** | [**List&lt;BucketDefinition&gt;**](BucketDefinition.md) |  | [default to List<BucketDefinition>]

```java
import com.finbourne.sdk.services.lusid.model.BucketSetDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String code = "example code";
String displayName = "example displayName";
@javax.annotation.Nullable List<String> navTypes = new List<String>();
Boolean unitised = true;
List<BucketDefinition> buckets = new List<BucketDefinition>();


BucketSetDefinition bucketSetDefinitionInstance = new BucketSetDefinition()
    .code(code)
    .displayName(displayName)
    .navTypes(navTypes)
    .unitised(unitised)
    .buckets(buckets);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)