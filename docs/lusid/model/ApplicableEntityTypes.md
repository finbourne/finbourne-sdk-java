# com.finbourne.sdk.services.lusid.model.ApplicableEntityTypes
classname ApplicableEntityTypes

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applicableEntityTypesToAdd** | **List&lt;String&gt;** | The types of entities this relational dataset definition can be applied to (e.g. Instrument, Portfolio, etc.). | [optional] [default to List<String>]
**applicableEntityTypesToRemove** | **List&lt;String&gt;** | The types of entities this relational dataset definition can be applied to (e.g. Instrument, Portfolio, etc.). | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.ApplicableEntityTypes;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<String> applicableEntityTypesToAdd = new List<String>();
@javax.annotation.Nullable List<String> applicableEntityTypesToRemove = new List<String>();


ApplicableEntityTypes applicableEntityTypesInstance = new ApplicableEntityTypes()
    .applicableEntityTypesToAdd(applicableEntityTypesToAdd)
    .applicableEntityTypesToRemove(applicableEntityTypesToRemove);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)