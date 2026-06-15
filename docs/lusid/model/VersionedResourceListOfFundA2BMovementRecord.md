# com.finbourne.sdk.services.lusid.model.VersionedResourceListOfFundA2BMovementRecord
classname VersionedResourceListOfFundA2BMovementRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | [**Version**](Version.md) |  | [default to Version]
**values** | [**List&lt;FundA2BMovementRecord&gt;**](FundA2BMovementRecord.md) |  | [default to List<FundA2BMovementRecord>]
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**nextPage** | **String** |  | [optional] [default to String]
**previousPage** | **String** |  | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.VersionedResourceListOfFundA2BMovementRecord;
import java.util.*;
import java.lang.System;
import java.net.URI;

Version version = new Version();
List<FundA2BMovementRecord> values = new List<FundA2BMovementRecord>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable String nextPage = "example nextPage";
@javax.annotation.Nullable String previousPage = "example previousPage";
@javax.annotation.Nullable List<Link> links = new List<Link>();


VersionedResourceListOfFundA2BMovementRecord versionedResourceListOfFundA2BMovementRecordInstance = new VersionedResourceListOfFundA2BMovementRecord()
    .version(version)
    .values(values)
    .href(href)
    .nextPage(nextPage)
    .previousPage(previousPage)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)