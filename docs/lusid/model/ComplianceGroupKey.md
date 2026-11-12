# com.finbourne.sdk.services.lusid.model.ComplianceGroupKey
classname ComplianceGroupKey
The dimension a group was formed on: the key the grouping step read, and this group's value for it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** |  | [default to String]
**value** | **String** |  | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceGroupKey;
import java.util.*;
import java.lang.System;
import java.net.URI;

String key = "example key";
String value = "example value";


ComplianceGroupKey complianceGroupKeyInstance = new ComplianceGroupKey()
    .key(key)
    .value(value);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)