# com.finbourne.sdk.services.luminesce.model.Column
classname Column

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isPrimaryKey** | **Boolean** |  | [optional] [default to Boolean]
**isMain** | **Boolean** |  | [optional] [default to Boolean]
**isRequiredByProvider** | **Boolean** |  | [optional] [default to Boolean]
**mandatoryForActions** | **String** |  | [optional] [default to String]
**lineage** | [**Lineage**](Lineage.md) |  | [optional] [default to Lineage]
**name** | **String** |  | [optional] [default to String]
**type** | [**DataType**](DataType.md) |  | [optional] [default to DataType]
**description** | **String** |  | [optional] [default to String]
**displayName** | **String** |  | [optional] [default to String]
**conditionUsage** | [**ConditionAttributes**](ConditionAttributes.md) |  | [optional] [default to ConditionAttributes]
**sampleValues** | **String** |  | [optional] [default to String]
**allowedValues** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.luminesce.model.Column;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean isPrimaryKey = true;
Boolean isMain = true;
Boolean isRequiredByProvider = true;
@javax.annotation.Nullable String mandatoryForActions = "example mandatoryForActions";
Lineage lineage = new Lineage();
@javax.annotation.Nullable String name = "example name";
DataType @javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable String displayName = "example displayName";
ConditionAttributes @javax.annotation.Nullable String sampleValues = "example sampleValues";
@javax.annotation.Nullable String allowedValues = "example allowedValues";


Column columnInstance = new Column()
    .isPrimaryKey(isPrimaryKey)
    .isMain(isMain)
    .isRequiredByProvider(isRequiredByProvider)
    .mandatoryForActions(mandatoryForActions)
    .lineage(lineage)
    .name(name)
    .type(type)
    .description(description)
    .displayName(displayName)
    .conditionUsage(conditionUsage)
    .sampleValues(sampleValues)
    .allowedValues(allowedValues);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)