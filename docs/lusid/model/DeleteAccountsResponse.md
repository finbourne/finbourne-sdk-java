# com.finbourne.sdk.services.lusid.model.DeleteAccountsResponse
classname DeleteAccountsResponse
The delete accounts response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**accountIds** | **List&lt;String&gt;** | The Accounts which have been soft/hard deleted. | [optional] [default to List<String>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.DeleteAccountsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Version version = new Version();
@javax.annotation.Nullable List<String> accountIds = new List<String>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


DeleteAccountsResponse deleteAccountsResponseInstance = new DeleteAccountsResponse()
    .version(version)
    .accountIds(accountIds)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)