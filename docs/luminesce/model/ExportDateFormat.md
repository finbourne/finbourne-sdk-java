# com.finbourne.sdk.services.luminesce.model.ExportDateFormat
classname ExportDateFormat

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**preset** | **String** |  | [optional] [default to String]
**pattern** | **String** |  | [optional] [default to String]
**excelFormat** | **String** |  | [default to String]

```java
import com.finbourne.sdk.services.luminesce.model.ExportDateFormat;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String preset = "example preset";
@javax.annotation.Nullable String pattern = "example pattern";
String excelFormat = "example excelFormat";


ExportDateFormat exportDateFormatInstance = new ExportDateFormat()
    .preset(preset)
    .pattern(pattern)
    .excelFormat(excelFormat);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)