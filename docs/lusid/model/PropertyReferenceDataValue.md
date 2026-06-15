# com.finbourne.sdk.services.lusid.model.PropertyReferenceDataValue
classname PropertyReferenceDataValue
The ReferenceData relevant to the property. The ReferenceData is taken from the DataType on the PropertyDefinition that defines the Property.  Only ReferenceData where the ReferenceData value matches the Property value is included.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stringValue** | **String** |  | [optional] [default to String]
**numericValue** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.PropertyReferenceDataValue;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String stringValue = "example stringValue";
@javax.annotation.Nullable java.math.BigDecimal numericValue = new java.math.BigDecimal("100.00");


PropertyReferenceDataValue propertyReferenceDataValueInstance = new PropertyReferenceDataValue()
    .stringValue(stringValue)
    .numericValue(numericValue);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)