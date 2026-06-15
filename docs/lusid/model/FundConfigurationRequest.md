# com.finbourne.sdk.services.lusid.model.FundConfigurationRequest
classname FundConfigurationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** |  | [default to String]
**displayName** | **String** | The name of the Fund. | [optional] [default to String]
**description** | **String** | A description for the Fund. | [optional] [default to String]
**dealingFilters** | [**List&lt;ComponentFilter&gt;**](ComponentFilter.md) | The set of filters used to decide which JE lines are included in the dealing. | [default to List<ComponentFilter>]
**pnlFilters** | [**List&lt;ComponentFilter&gt;**](ComponentFilter.md) | The set of filters used to decide which JE lines are included in the PnL. | [default to List<ComponentFilter>]
**backOutFilters** | [**List&lt;ComponentFilter&gt;**](ComponentFilter.md) | The set of filters used to decide which JE lines are included in the back outs. | [default to List<ComponentFilter>]
**externalFeeFilters** | [**List&lt;ExternalFeeComponentFilter&gt;**](ExternalFeeComponentFilter.md) | The set of filters used to decide which JE lines are used for inputting fees from an external source. | [optional] [default to List<ExternalFeeComponentFilter>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the Fund Configuration. | [optional] [default to Map<String, Property>]

```java
import com.finbourne.sdk.services.lusid.model.FundConfigurationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String code = "example code";
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
List<ComponentFilter> dealingFilters = new List<ComponentFilter>();
List<ComponentFilter> pnlFilters = new List<ComponentFilter>();
List<ComponentFilter> backOutFilters = new List<ComponentFilter>();
@javax.annotation.Nullable List<ExternalFeeComponentFilter> externalFeeFilters = new List<ExternalFeeComponentFilter>();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();


FundConfigurationRequest fundConfigurationRequestInstance = new FundConfigurationRequest()
    .code(code)
    .displayName(displayName)
    .description(description)
    .dealingFilters(dealingFilters)
    .pnlFilters(pnlFilters)
    .backOutFilters(backOutFilters)
    .externalFeeFilters(externalFeeFilters)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)