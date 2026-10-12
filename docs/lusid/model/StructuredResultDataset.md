# com.finbourne.sdk.services.lusid.model.StructuredResultDataset
classname StructuredResultDataset
Contains the run-time parameters that are appropriate for check definitions  with datasetSchema.type = \"StructuredResultData\". Names one structured result data document.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effectiveAt date of the document&#39;s rows to check. Required. | [optional] [default to OffsetDateTime]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt date to fetch the data. Nullable. Defaults to latest. | [optional] [default to OffsetDateTime]
**scope** | **String** | The scope of the document. Required. | [optional] [default to String]
**code** | **String** | The code of the document. Required. | [optional] [default to String]
**source** | **String** | The platform or vendor that provided the document, e.g. \&quot;Client\&quot;. Required. | [optional] [default to String]
**resultType** | **String** | The document&#39;s result type, e.g. \&quot;UnitResult/Custom\&quot;. Required. | [optional] [default to String]
**rowSelectorAttribute** | **String** | A row field to narrow down the rows checked, e.g. rowId[&#39;Instrument/default/LusidInstrumentId&#39;] or  rowData[&#39;Valuation/PV&#39;].Units. Cannot be provided without rowSelectorValue, and vice versa. | [optional] [default to String]
**rowSelectorValue** | **String** | The value of the above row field used to narrow down the rows. Cannot be provided without  rowSelectorAttribute, and vice versa. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.StructuredResultDataset;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable OffsetDateTime effectiveAt = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime asAt = OffsetDateTime.now();
@javax.annotation.Nullable String scope = "example scope";
@javax.annotation.Nullable String code = "example code";
@javax.annotation.Nullable String source = "example source";
@javax.annotation.Nullable String resultType = "example resultType";
@javax.annotation.Nullable String rowSelectorAttribute = "example rowSelectorAttribute";
@javax.annotation.Nullable String rowSelectorValue = "example rowSelectorValue";


StructuredResultDataset structuredResultDatasetInstance = new StructuredResultDataset()
    .effectiveAt(effectiveAt)
    .asAt(asAt)
    .scope(scope)
    .code(code)
    .source(source)
    .resultType(resultType)
    .rowSelectorAttribute(rowSelectorAttribute)
    .rowSelectorValue(rowSelectorValue);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)