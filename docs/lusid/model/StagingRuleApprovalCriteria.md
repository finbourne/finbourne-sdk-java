# com.finbourne.sdk.services.lusid.model.StagingRuleApprovalCriteria
classname StagingRuleApprovalCriteria

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requiredApprovals** | **Integer** |  | [optional] [default to Integer]
**decidingUser** | **String** |  | [optional] [default to String]
**stagingUserCanDecide** | **Boolean** |  | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.StagingRuleApprovalCriteria;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Integer requiredApprovals = new Integer("100.00");
@javax.annotation.Nullable String decidingUser = "example decidingUser";
@javax.annotation.Nullable Boolean stagingUserCanDecide = true;


StagingRuleApprovalCriteria stagingRuleApprovalCriteriaInstance = new StagingRuleApprovalCriteria()
    .requiredApprovals(requiredApprovals)
    .decidingUser(decidingUser)
    .stagingUserCanDecide(stagingUserCanDecide);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)