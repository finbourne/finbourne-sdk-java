# com.finbourne.sdk.services.lusid.model.Touch
classname Touch
Touch class for exotic FxOption

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**direction** | **String** | Supported string (enumeration) values are: [Down, Up]. | [default to String]
**level** | **java.math.BigDecimal** | Trigger level, which the underlying should (or should not) cross/touch. | [default to java.math.BigDecimal]
**monitoring** | **String** | Supported string (enumeration) values are: [European, Bermudan, American].  Defaults to \&quot;European\&quot; if not set. | [optional] [default to String]
**type** | **String** | Supported string (enumeration) values are: [Touch, Notouch]. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.Touch;
import java.util.*;
import java.lang.System;
import java.net.URI;

String direction = "example direction";
java.math.BigDecimal level = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String monitoring = "example monitoring";
String type = "example type";


Touch touchInstance = new Touch()
    .direction(direction)
    .level(level)
    .monitoring(monitoring)
    .type(type);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)