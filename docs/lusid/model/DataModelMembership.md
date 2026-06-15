# com.finbourne.sdk.services.lusid.model.DataModelMembership
classname DataModelMembership

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**membership** | [**List&lt;Membership&gt;**](Membership.md) | The collection of data models this entity is a member of. | [default to List<Membership>]
**currentModel** | [**MembershipAndStatus**](MembershipAndStatus.md) |  | [optional] [default to MembershipAndStatus]

```java
import com.finbourne.sdk.services.lusid.model.DataModelMembership;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<Membership> membership = new List<Membership>();
MembershipAndStatus currentModel = new MembershipAndStatus();


DataModelMembership dataModelMembershipInstance = new DataModelMembership()
    .membership(membership)
    .currentModel(currentModel);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)