# com.finbourne.sdk.services.luminesce.model.ExportNumberFormat
classname ExportNumberFormat

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**minDecimals** | **Integer** |  | [optional] [default to Integer]
**maxDecimals** | **Integer** |  | [optional] [default to Integer]
**thousandSeparator** | **Boolean** |  | [optional] [default to Boolean]
**displayAsPercentage** | **Boolean** |  | [optional] [default to Boolean]
**negativeNumberFormat** | [**ExportNegativeNumberFormat**](ExportNegativeNumberFormat.md) |  | [optional] [default to ExportNegativeNumberFormat]
**excelFormat** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.luminesce.model.ExportNumberFormat;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Integer minDecimals = new Integer("100.00");
@javax.annotation.Nullable Integer maxDecimals = new Integer("100.00");
Boolean thousandSeparator = true;
Boolean displayAsPercentage = true;
ExportNegativeNumberFormat @javax.annotation.Nullable String excelFormat = "example excelFormat";


ExportNumberFormat exportNumberFormatInstance = new ExportNumberFormat()
    .minDecimals(minDecimals)
    .maxDecimals(maxDecimals)
    .thousandSeparator(thousandSeparator)
    .displayAsPercentage(displayAsPercentage)
    .negativeNumberFormat(negativeNumberFormat)
    .excelFormat(excelFormat);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)