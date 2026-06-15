# com.finbourne.sdk.services.lusid.model.CreatePortfolioGroupRequest
classname CreatePortfolioGroupRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code that the portfolio group will be created with. Together with the scope this uniquely identifies the portfolio group. | [default to String]
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime at which the portfolio group was created. Defaults to the current LUSID system datetime if not specified. | [optional] [default to OffsetDateTime]
**values** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The resource identifiers of the portfolios to be contained within the portfolio group. | [optional] [default to List<ResourceId>]
**subGroups** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The resource identifiers of the portfolio groups to be contained within the portfolio group as sub groups. | [optional] [default to List<ResourceId>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of unique group properties to add to the portfolio group. Each property must be from the &#39;PortfolioGroup&#39; domain and should be identified by its key which has the format {domain}/{scope}/{code}, e.g. &#39;PortfolioGroup/Manager/Id&#39;. These properties must be pre-defined. | [optional] [default to Map<String, Property>]
**displayName** | **String** | The name of the portfolio group. | [default to String]
**description** | **String** | A long form description of the portfolio group. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CreatePortfolioGroupRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String code = "example code";
@javax.annotation.Nullable OffsetDateTime created = OffsetDateTime.now();
@javax.annotation.Nullable List<ResourceId> values = new List<ResourceId>();
@javax.annotation.Nullable List<ResourceId> subGroups = new List<ResourceId>();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";


CreatePortfolioGroupRequest createPortfolioGroupRequestInstance = new CreatePortfolioGroupRequest()
    .code(code)
    .created(created)
    .values(values)
    .subGroups(subGroups)
    .properties(properties)
    .displayName(displayName)
    .description(description);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)