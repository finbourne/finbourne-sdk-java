# com.finbourne.sdk.services.lusid.model.ReferenceData
classname ReferenceData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fieldDefinitions** | [**List&lt;FieldDefinition&gt;**](FieldDefinition.md) |  | [default to List<FieldDefinition>]
**values** | [**List&lt;FieldValue&gt;**](FieldValue.md) |  | [default to List<FieldValue>]

```java
import com.finbourne.sdk.services.lusid.model.ReferenceData;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<FieldDefinition> fieldDefinitions = new List<FieldDefinition>();
List<FieldValue> values = new List<FieldValue>();


ReferenceData referenceDataInstance = new ReferenceData()
    .fieldDefinitions(fieldDefinitions)
    .values(values);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)