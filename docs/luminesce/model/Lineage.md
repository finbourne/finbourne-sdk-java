# com.finbourne.sdk.services.luminesce.model.Lineage
classname Lineage

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** |  | [optional] [default to String]
**subtype** | **String** |  | [optional] [default to String]
**legendText** | **String** |  | [optional] [default to String]
**alias** | **String** |  | [optional] [default to String]
**columnTitleTooltip** | **String** |  | [optional] [default to String]
**columnTitleIcon** | [**LineageColumnIcon**](LineageColumnIcon.md) |  | [optional] [default to LineageColumnIcon]
**explainTitle** | **String** |  | [optional] [default to String]
**explainTooltip** | **String** |  | [optional] [default to String]
**arrowToParentTooltip** | **String** |  | [optional] [default to String]
**fullFormula** | **String** |  | [optional] [default to String]
**documentationAsHtml** | **String** |  | [optional] [default to String]
**documentationAsMarkDown** | **String** |  | [optional] [default to String]
**children** | [**List&lt;Lineage&gt;**](Lineage.md) |  | [optional] [default to List<Lineage>]

```java
import com.finbourne.sdk.services.luminesce.model.Lineage;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable String subtype = "example subtype";
@javax.annotation.Nullable String legendText = "example legendText";
@javax.annotation.Nullable String alias = "example alias";
@javax.annotation.Nullable String columnTitleTooltip = "example columnTitleTooltip";
LineageColumnIcon @javax.annotation.Nullable String explainTitle = "example explainTitle";
@javax.annotation.Nullable String explainTooltip = "example explainTooltip";
@javax.annotation.Nullable String arrowToParentTooltip = "example arrowToParentTooltip";
@javax.annotation.Nullable String fullFormula = "example fullFormula";
@javax.annotation.Nullable String documentationAsHtml = "example documentationAsHtml";
@javax.annotation.Nullable String documentationAsMarkDown = "example documentationAsMarkDown";
@javax.annotation.Nullable List<Lineage> children = new List<Lineage>();


Lineage lineageInstance = new Lineage()
    .type(type)
    .subtype(subtype)
    .legendText(legendText)
    .alias(alias)
    .columnTitleTooltip(columnTitleTooltip)
    .columnTitleIcon(columnTitleIcon)
    .explainTitle(explainTitle)
    .explainTooltip(explainTooltip)
    .arrowToParentTooltip(arrowToParentTooltip)
    .fullFormula(fullFormula)
    .documentationAsHtml(documentationAsHtml)
    .documentationAsMarkDown(documentationAsMarkDown)
    .children(children);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)