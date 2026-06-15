# com.finbourne.sdk.services.lusid.model.StagingRuleMatchCriteria
classname StagingRuleMatchCriteria

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actionIn** | **List&lt;String&gt;** | Available values: Create, Update, Delete. | [optional] [default to List<String>]
**requestingUser** | **String** |  | [optional] [default to String]
**entityAttributes** | **String** |  | [optional] [default to String]
**changedAttributeNameIn** | **List&lt;String&gt;** |  | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.StagingRuleMatchCriteria;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<String> actionIn = new List<String>();
@javax.annotation.Nullable String requestingUser = "example requestingUser";
@javax.annotation.Nullable String entityAttributes = "example entityAttributes";
@javax.annotation.Nullable List<String> changedAttributeNameIn = new List<String>();


StagingRuleMatchCriteria stagingRuleMatchCriteriaInstance = new StagingRuleMatchCriteria()
    .actionIn(actionIn)
    .requestingUser(requestingUser)
    .entityAttributes(entityAttributes)
    .changedAttributeNameIn(changedAttributeNameIn);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)