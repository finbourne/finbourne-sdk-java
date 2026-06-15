# com.finbourne.sdk.services.lusid.model.GeneralLedgerProfileResponse
classname GeneralLedgerProfileResponse
A General Ledger Profile Definition.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**chartOfAccountsId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**generalLedgerProfileCode** | **String** | The unique code for the General Ledger Profile | [default to String]
**displayName** | **String** | The name of the General Ledger Profile | [default to String]
**description** | **String** | A description for the General Ledger Profile | [optional] [default to String]
**generalLedgerProfileMappings** | [**List&lt;GeneralLedgerProfileMapping&gt;**](GeneralLedgerProfileMapping.md) | Rules for mapping Account or property values to aggregation pattern definitions | [default to List<GeneralLedgerProfileMapping>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.GeneralLedgerProfileResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
ResourceId chartOfAccountsId = new ResourceId();
String generalLedgerProfileCode = "example generalLedgerProfileCode";
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
List<GeneralLedgerProfileMapping> generalLedgerProfileMappings = new List<GeneralLedgerProfileMapping>();
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


GeneralLedgerProfileResponse generalLedgerProfileResponseInstance = new GeneralLedgerProfileResponse()
    .href(href)
    .chartOfAccountsId(chartOfAccountsId)
    .generalLedgerProfileCode(generalLedgerProfileCode)
    .displayName(displayName)
    .description(description)
    .generalLedgerProfileMappings(generalLedgerProfileMappings)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)