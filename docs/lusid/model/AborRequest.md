# com.finbourne.sdk.services.lusid.model.AborRequest
classname AborRequest
The request used to create an Abor.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code given for the Abor. | [default to String]
**displayName** | **String** | The name of the Abor. | [default to String]
**description** | **String** | The description for the Abor. | [optional] [default to String]
**portfolioIds** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | The list with the portfolio ids which are part of the Abor. Note: These must all have the same base currency. | [default to List<PortfolioEntityId>]
**aborConfigurationId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the Abor. | [optional] [default to Map<String, Property>]

```java
import com.finbourne.sdk.services.lusid.model.AborRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String code = "example code";
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
List<PortfolioEntityId> portfolioIds = new List<PortfolioEntityId>();
ResourceId aborConfigurationId = new ResourceId();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();


AborRequest aborRequestInstance = new AborRequest()
    .code(code)
    .displayName(displayName)
    .description(description)
    .portfolioIds(portfolioIds)
    .aborConfigurationId(aborConfigurationId)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)