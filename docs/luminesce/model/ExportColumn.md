# com.finbourne.sdk.services.luminesce.model.ExportColumn
classname ExportColumn

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**colId** | **String** |  | [default to String]
**header** | **String** |  | [optional] [default to String]
**dataType** | [**ExportColumnDataType**](ExportColumnDataType.md) |  | [optional] [default to ExportColumnDataType]
**hidden** | **Boolean** |  | [optional] [default to Boolean]
**wrapText** | **Boolean** |  | [optional] [default to Boolean]
**columnColor** | [**ExportColumnColor**](ExportColumnColor.md) |  | [optional] [default to ExportColumnColor]
**number** | [**ExportNumberFormat**](ExportNumberFormat.md) |  | [optional] [default to ExportNumberFormat]
**date** | [**ExportDateFormat**](ExportDateFormat.md) |  | [optional] [default to ExportDateFormat]
**conditionalRules** | [**List&lt;ExportConditionalRule&gt;**](ExportConditionalRule.md) |  | [optional] [default to List<ExportConditionalRule>]

```java
import com.finbourne.sdk.services.luminesce.model.ExportColumn;
import java.util.*;
import java.lang.System;
import java.net.URI;

String colId = "example colId";
@javax.annotation.Nullable String header = "example header";
ExportColumnDataType Boolean hidden = true;
Boolean wrapText = true;
ExportColumnColor columnColor = new ExportColumnColor();
ExportNumberFormat number = new ExportNumberFormat();
ExportDateFormat date = new ExportDateFormat();
@javax.annotation.Nullable List<ExportConditionalRule> conditionalRules = new List<ExportConditionalRule>();


ExportColumn exportColumnInstance = new ExportColumn()
    .colId(colId)
    .header(header)
    .dataType(dataType)
    .hidden(hidden)
    .wrapText(wrapText)
    .columnColor(columnColor)
    .number(number)
    .date(date)
    .conditionalRules(conditionalRules);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)