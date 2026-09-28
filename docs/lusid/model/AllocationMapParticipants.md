# com.finbourne.sdk.services.lusid.model.AllocationMapParticipants
classname AllocationMapParticipants
Who takes part in the allocations of an Allocation Map: the default rule that finds the participant set, and the  exceptions that exclude particular investor records or fix their share.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rule** | **String** | How the default participant set is found. AllCommittedToMembers takes every investor record committed to any of the funds in memberIds; ExplicitList takes exactly the investor records in explicitInvestorRecordIds. Available values: AllCommittedToMembers, ExplicitList. | [optional] [default to String]
**memberIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | Under the AllCommittedToMembers rule, the member funds whose committed investor records participate, as scope and code. At least one is required under that rule. | [optional] [default to List<ResourceId>]
**explicitInvestorRecordIds** | **List&lt;String&gt;** | Under the ExplicitList rule, the investor records that participate. At least one is required under that rule. | [optional] [default to List<String>]
**exceptions** | [**List&lt;AllocationMapException&gt;**](AllocationMapException.md) | Departures from the default participation for particular investor records. Each names the investor record, what happens to it, and why. | [optional] [default to List<AllocationMapException>]

```java
import com.finbourne.sdk.services.lusid.model.AllocationMapParticipants;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String rule = "example rule";
@javax.annotation.Nullable List<ResourceId> memberIds = new List<ResourceId>();
@javax.annotation.Nullable List<String> explicitInvestorRecordIds = new List<String>();
@javax.annotation.Nullable List<AllocationMapException> exceptions = new List<AllocationMapException>();


AllocationMapParticipants allocationMapParticipantsInstance = new AllocationMapParticipants()
    .rule(rule)
    .memberIds(memberIds)
    .explicitInvestorRecordIds(explicitInvestorRecordIds)
    .exceptions(exceptions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)