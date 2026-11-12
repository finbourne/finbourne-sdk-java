# com.finbourne.sdk.services.lusid.model.ComplianceKeyUsed
classname ComplianceKeyUsed
A key a holding contributed to the rule: the key, the role(s) it played in the rule, the holding's own value for  it, and which bag the value was read from.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** |  | [default to String]
**roles** | **List&lt;String&gt;** |  | [default to List<String>]
**value** | **Object** | This holding&#39;s own value for the key. Polymorphic: a number for a result or metric property, a label string for  a label property, or a string for a related property. | [optional] [default to Object]
**source** | **String** |  | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceKeyUsed;
import java.util.*;
import java.lang.System;
import java.net.URI;

String key = "example key";
List<String> roles = new List<String>();
@javax.annotation.Nullable Object String source = "example source";


ComplianceKeyUsed complianceKeyUsedInstance = new ComplianceKeyUsed()
    .key(key)
    .roles(roles)
    .value(value)
    .source(source);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)