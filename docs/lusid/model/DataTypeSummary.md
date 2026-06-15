# com.finbourne.sdk.services.lusid.model.DataTypeSummary
classname DataTypeSummary

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**typeValueRange** | **String** | Indicates the range of data acceptable by a data type. Available values: Open, Closed. | [default to String]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The display name of the data type. | [default to String]
**description** | **String** | The description of the data type. | [default to String]
**valueType** | **String** | The expected type of the values. Available values: String, Int, Decimal, DateTime, Boolean, Map, List, PropertyArray, Percentage, Code, Id, Uri, CurrencyAndAmount, TradePrice, Currency, MetricValue, ResourceId, ResultValue, CutLocalTime, DateOrCutLabel, UnindexedText. | [default to String]
**acceptableValues** | **List&lt;String&gt;** | The acceptable set of values for this data type. Only applies to &#39;open&#39; value type range. | [optional] [default to List<String>]
**unitSchema** | **String** | The schema of the data type&#39;s units. Available values: NoUnits, Basic, Iso4217Currency. | [optional] [default to String]
**acceptableUnits** | [**List&lt;IUnitDefinitionDto&gt;**](IUnitDefinitionDto.md) | The definitions of the acceptable units. | [optional] [default to List<IUnitDefinitionDto>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]

```java
import com.finbourne.sdk.services.lusid.model.DataTypeSummary;
import java.util.*;
import java.lang.System;
import java.net.URI;

String typeValueRange = "example typeValueRange";
ResourceId id = new ResourceId();
String displayName = "example displayName";
String description = "example description";
String valueType = "example valueType";
@javax.annotation.Nullable List<String> acceptableValues = new List<String>();
String unitSchema = "example unitSchema";
@javax.annotation.Nullable List<IUnitDefinitionDto> acceptableUnits = new List<IUnitDefinitionDto>();
Version version = new Version();


DataTypeSummary dataTypeSummaryInstance = new DataTypeSummary()
    .typeValueRange(typeValueRange)
    .id(id)
    .displayName(displayName)
    .description(description)
    .valueType(valueType)
    .acceptableValues(acceptableValues)
    .unitSchema(unitSchema)
    .acceptableUnits(acceptableUnits)
    .version(version);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)