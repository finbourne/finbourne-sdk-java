# com.finbourne.sdk.services.lusid.model.Calendar
classname Calendar

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**type** | **String** |  | [default to String]
**weekendMask** | [**WeekendMask**](WeekendMask.md) |  | [default to WeekendMask]
**sourceProvider** | **String** |  | [default to String]
**properties** | [**List&lt;Property&gt;**](Property.md) |  | [default to List<Property>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.Calendar;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
ResourceId id = new ResourceId();
String type = "example type";
WeekendMask weekendMask = new WeekendMask();
String sourceProvider = "example sourceProvider";
List<Property> properties = new List<Property>();
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


Calendar calendarInstance = new Calendar()
    .href(href)
    .id(id)
    .type(type)
    .weekendMask(weekendMask)
    .sourceProvider(sourceProvider)
    .properties(properties)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)