# com.finbourne.sdk.services.lusid.model.DataType
classname DataType

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**typeValueRange** | **String** | Available values: Open, Closed. | [default to String]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** |  | [default to String]
**description** | **String** |  | [default to String]
**valueType** | **String** | Available values: String, Int, Decimal, DateTime, Boolean, Map, List, PropertyArray, Percentage, Code, Id, Uri, CurrencyAndAmount, TradePrice, Currency, MetricValue, ResourceId, ResultValue, CutLocalTime, DateOrCutLabel, UnindexedText. | [default to String]
**acceptableValues** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**unitSchema** | **String** | Available values: NoUnits, Basic, Iso4217Currency. | [optional] [default to String]
**acceptableUnits** | [**List&lt;IUnitDefinitionDto&gt;**](IUnitDefinitionDto.md) |  | [optional] [default to List<IUnitDefinitionDto>]
**referenceData** | [**ReferenceData**](ReferenceData.md) |  | [optional] [default to ReferenceData]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**stagedModifications** | [**StagedModificationsInfo**](StagedModificationsInfo.md) |  | [optional] [default to StagedModificationsInfo]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.DataType;
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
ReferenceData referenceData = new ReferenceData();
Version version = new Version();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
StagedModificationsInfo stagedModifications = new StagedModificationsInfo();
@javax.annotation.Nullable List<Link> links = new List<Link>();


DataType dataTypeInstance = new DataType()
    .typeValueRange(typeValueRange)
    .id(id)
    .displayName(displayName)
    .description(description)
    .valueType(valueType)
    .acceptableValues(acceptableValues)
    .unitSchema(unitSchema)
    .acceptableUnits(acceptableUnits)
    .referenceData(referenceData)
    .version(version)
    .href(href)
    .stagedModifications(stagedModifications)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)