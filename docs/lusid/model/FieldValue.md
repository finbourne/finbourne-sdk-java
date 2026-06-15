# com.finbourne.sdk.services.lusid.model.FieldValue
classname FieldValue

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **String** |  | [default to String]
**fields** | **Map&lt;String, String&gt;** |  | [optional] [default to Map<String, String>]
**numericFields** | **Map&lt;String, java.math.BigDecimal&gt;** |  | [optional] [default to Map<String, java.math.BigDecimal>]

```java
import com.finbourne.sdk.services.lusid.model.FieldValue;
import java.util.*;
import java.lang.System;
import java.net.URI;

String value = "example value";
@javax.annotation.Nullable Map<String, String> fields = new Map<String, String>();
@javax.annotation.Nullable Map<String, java.math.BigDecimal> numericFields = new Map<String, java.math.BigDecimal>();


FieldValue fieldValueInstance = new FieldValue()
    .value(value)
    .fields(fields)
    .numericFields(numericFields);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)