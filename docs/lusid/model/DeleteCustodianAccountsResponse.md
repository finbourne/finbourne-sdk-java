# com.finbourne.sdk.services.lusid.model.DeleteCustodianAccountsResponse
classname DeleteCustodianAccountsResponse
The delete custodian accounts response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**custodianAccountIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The Custodian Accounts which have been soft/hard deleted. | [optional] [default to List<ResourceId>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.DeleteCustodianAccountsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Version version = new Version();
@javax.annotation.Nullable List<ResourceId> custodianAccountIds = new List<ResourceId>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


DeleteCustodianAccountsResponse deleteCustodianAccountsResponseInstance = new DeleteCustodianAccountsResponse()
    .version(version)
    .custodianAccountIds(custodianAccountIds)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)