# com.finbourne.sdk.services.lusid.model.ResourceRecord
classname ResourceRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deploymentScope** | **String** | The scope of the deployment this record is part of. | [default to String]
**deploymentCode** | **String** | The code of the deployment this record is part of. | [default to String]
**resourceId** | **String** | The unique identifier of the resource associated with this record. | [default to String]
**format** | **String** | A semver format identifier for the resource record. | [default to String]
**resourceType** | **String** | The type of resource associated with this record. | [default to String]
**resourceState** | **Object** | The state of the resource associated with this record. | [default to Object]
**dependencies** | **List&lt;String&gt;** | A collection of resource identifiers that this resource depends on. | [default to List<String>]
**trackingState** | **Object** | The tracking state of the resource record. | [optional] [default to Object]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for the resource record at the requested effective and asAt datetime. | [optional] [default to URI]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.ResourceRecord;
import java.util.*;
import java.lang.System;
import java.net.URI;

String deploymentScope = "example deploymentScope";
String deploymentCode = "example deploymentCode";
String resourceId = "example resourceId";
String format = "example format";
String resourceType = "example resourceType";
@javax.annotation.Nullable Object List<String> dependencies = new List<String>();
@javax.annotation.Nullable Object Version version = new Version();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable List<Link> links = new List<Link>();


ResourceRecord resourceRecordInstance = new ResourceRecord()
    .deploymentScope(deploymentScope)
    .deploymentCode(deploymentCode)
    .resourceId(resourceId)
    .format(format)
    .resourceType(resourceType)
    .resourceState(resourceState)
    .dependencies(dependencies)
    .trackingState(trackingState)
    .version(version)
    .href(href)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)