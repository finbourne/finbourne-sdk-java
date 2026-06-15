# com.finbourne.sdk.services.identity.model.NetworkZonesApplyRules
classname NetworkZonesApplyRules

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sessionType** | **List&lt;String&gt;** |  | [default to List<String>]
**userRoles** | **List&lt;String&gt;** |  | [default to List<String>]

```java
import com.finbourne.sdk.services.identity.model.NetworkZonesApplyRules;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<String> sessionType = new List<String>();
List<String> userRoles = new List<String>();


NetworkZonesApplyRules networkZonesApplyRulesInstance = new NetworkZonesApplyRules()
    .sessionType(sessionType)
    .userRoles(userRoles);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)