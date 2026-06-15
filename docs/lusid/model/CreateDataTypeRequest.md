# com.finbourne.sdk.services.lusid.model.CreateDataTypeRequest
classname CreateDataTypeRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope that the data type will be created in. | [default to String]
**code** | **String** | The code of the data type. Together with the scope this uniquely defines the data type. | [default to String]
**typeValueRange** | **String** | Indicates the range of data acceptable by a data type. Available values: Open, Closed. | [default to String]
**displayName** | **String** | The display name of the data type. | [default to String]
**description** | **String** | The description of the data type. | [default to String]
**valueType** | **String** | The expected type of the values. Available values: String, Int, Decimal, DateTime, Boolean, Map, List, PropertyArray, Percentage, Code, Id, Uri, CurrencyAndAmount, TradePrice, Currency, MetricValue, ResourceId, ResultValue, CutLocalTime, DateOrCutLabel, UnindexedText. | [default to String]
**acceptableValues** | **List&lt;String&gt;** | The acceptable set of values for this data type. Only applies to &#39;open&#39; value type range. | [optional] [default to List<String>]
**unitSchema** | **String** | The schema of the data type&#39;s units. Available values: NoUnits, Basic, Iso4217Currency. | [optional] [default to String]
**acceptableUnits** | [**List&lt;CreateUnitDefinition&gt;**](CreateUnitDefinition.md) | The definitions of the acceptable units. | [optional] [default to List<CreateUnitDefinition>]
**referenceData** | [**ReferenceData**](ReferenceData.md) |  | [optional] [default to ReferenceData]

```java
import com.finbourne.sdk.services.lusid.model.CreateDataTypeRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String scope = "example scope";
String code = "example code";
String typeValueRange = "example typeValueRange";
String displayName = "example displayName";
String description = "example description";
String valueType = "example valueType";
@javax.annotation.Nullable List<String> acceptableValues = new List<String>();
String unitSchema = "example unitSchema";
@javax.annotation.Nullable List<CreateUnitDefinition> acceptableUnits = new List<CreateUnitDefinition>();
ReferenceData referenceData = new ReferenceData();


CreateDataTypeRequest createDataTypeRequestInstance = new CreateDataTypeRequest()
    .scope(scope)
    .code(code)
    .typeValueRange(typeValueRange)
    .displayName(displayName)
    .description(description)
    .valueType(valueType)
    .acceptableValues(acceptableValues)
    .unitSchema(unitSchema)
    .acceptableUnits(acceptableUnits)
    .referenceData(referenceData);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)