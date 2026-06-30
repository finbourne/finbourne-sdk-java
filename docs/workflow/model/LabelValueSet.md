# com.finbourne.sdk.services.workflow.model.LabelValueSet
classname LabelValueSet
The set of string labels that make up a multi-value property.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | **List&lt;String&gt;** | The distinct string values of the multi-value property. | [default to List<String>]

```java
import com.finbourne.sdk.services.workflow.model.LabelValueSet;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<String> values = new List<String>();


LabelValueSet labelValueSetInstance = new LabelValueSet()
    .values(values);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)