# com.finbourne.sdk.services.lusid.model.AccountsUpsertResponse
classname AccountsUpsertResponse
The upsert accounts response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**accounts** | [**List&lt;Account&gt;**](Account.md) | The Accounts which have been upserted. | [optional] [default to List<Account>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.AccountsUpsertResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
Version version = new Version();
@javax.annotation.Nullable List<Account> accounts = new List<Account>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


AccountsUpsertResponse accountsUpsertResponseInstance = new AccountsUpsertResponse()
    .href(href)
    .version(version)
    .accounts(accounts)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)