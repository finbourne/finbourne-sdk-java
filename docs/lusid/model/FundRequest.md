# com.finbourne.sdk.services.lusid.model.FundRequest
classname FundRequest
The request used to create a Fund.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code given for the Fund. | [default to String]
**displayName** | **String** | The name of the Fund. | [optional] [default to String]
**description** | **String** | A description for the Fund. | [optional] [default to String]
**fundConfigurationId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**aborId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**shareClassInstrumentScopes** | **List&lt;String&gt;** | The scopes in which the instruments lie, currently limited to one. | [optional] [default to List<String>]
**shareClassInstruments** | [**List&lt;InstrumentResolutionDetail&gt;**](InstrumentResolutionDetail.md) | Details the user-provided instrument identifiers and the instrument resolved from them. These would be decommissioned in favour of the new AllocationGroups and ShareClasses structures. | [optional] [default to List<InstrumentResolutionDetail>]
**type** | **String** | The type of fund. Available values: Standalone, Master, Feeder. | [default to String]
**inceptionDate** | [**OffsetDateTime**](OffsetDateTime.md) | Inception date of the Fund | [default to OffsetDateTime]
**decimalPlaces** | **Integer** | Number of decimal places for reporting | [optional] [default to Integer]
**yearEndDate** | [**DayMonth**](DayMonth.md) |  | [default to DayMonth]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the Fund. | [optional] [default to Map<String, Property>]

```java
import com.finbourne.sdk.services.lusid.model.FundRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String code = "example code";
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
ResourceId fundConfigurationId = new ResourceId();
ResourceId aborId = new ResourceId();
@javax.annotation.Nullable List<String> shareClassInstrumentScopes = new List<String>();
@javax.annotation.Nullable List<InstrumentResolutionDetail> shareClassInstruments = new List<InstrumentResolutionDetail>();
String type = "example type";
OffsetDateTime inceptionDate = OffsetDateTime.now();
@javax.annotation.Nullable Integer decimalPlaces = new Integer("100.00");
DayMonth yearEndDate = new DayMonth();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();


FundRequest fundRequestInstance = new FundRequest()
    .code(code)
    .displayName(displayName)
    .description(description)
    .fundConfigurationId(fundConfigurationId)
    .aborId(aborId)
    .shareClassInstrumentScopes(shareClassInstrumentScopes)
    .shareClassInstruments(shareClassInstruments)
    .type(type)
    .inceptionDate(inceptionDate)
    .decimalPlaces(decimalPlaces)
    .yearEndDate(yearEndDate)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)