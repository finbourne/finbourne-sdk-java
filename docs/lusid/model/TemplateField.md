# com.finbourne.sdk.services.lusid.model.TemplateField
classname TemplateField

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fieldName** | **String** |  | [default to String]
**specificity** | **String** | Available values: AllEventsAndHoldings, InstrumentEventType, ElectionType. | [default to String]
**description** | **String** |  | [default to String]
**type** | **String** | Available values: String, Decimal, InstrumentScope, Currency, DateTime, PriceType, InstrumentId, PropertyKey, Boolean. | [default to String]
**availability** | **String** | Available values: Guaranteed, DataDependent, Informational. | [default to String]
**usage** | **List&lt;String&gt;** |  | [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.TemplateField;
import java.util.*;
import java.lang.System;
import java.net.URI;

String fieldName = "example fieldName";
String specificity = "example specificity";
String description = "example description";
String type = "example type";
String availability = "example availability";
List<String> usage = new List<String>();


TemplateField templateFieldInstance = new TemplateField()
    .fieldName(fieldName)
    .specificity(specificity)
    .description(description)
    .type(type)
    .availability(availability)
    .usage(usage);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)