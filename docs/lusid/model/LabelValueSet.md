# com.finbourne.sdk.services.lusid.model.LabelValueSet
classname LabelValueSet
The set of string labels in a multi-value property.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | **List&lt;String&gt;** |  | [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.LabelValueSet;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<String> values = new List<String>();


LabelValueSet labelValueSetInstance = new LabelValueSet()
    .values(values);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)