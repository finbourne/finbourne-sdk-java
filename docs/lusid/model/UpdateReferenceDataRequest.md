# com.finbourne.sdk.services.lusid.model.UpdateReferenceDataRequest
classname UpdateReferenceDataRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestDefinitions** | [**List&lt;FieldDefinition&gt;**](FieldDefinition.md) | Definition of a reference data field. | [default to List<FieldDefinition>]
**requestValues** | [**List&lt;FieldValue&gt;**](FieldValue.md) | Reference data. | [default to List<FieldValue>]

```java
import com.finbourne.sdk.services.lusid.model.UpdateReferenceDataRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<FieldDefinition> requestDefinitions = new List<FieldDefinition>();
List<FieldValue> requestValues = new List<FieldValue>();


UpdateReferenceDataRequest updateReferenceDataRequestInstance = new UpdateReferenceDataRequest()
    .requestDefinitions(requestDefinitions)
    .requestValues(requestValues);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)