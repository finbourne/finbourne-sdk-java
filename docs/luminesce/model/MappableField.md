# com.finbourne.sdk.services.luminesce.model.MappableField
classname MappableField
Information about a field that can be designed on (regardless if it currently is) Kind of a \"mini-available catalog entry\"

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the field in need of mapping (The field name from within the Table Parameter itself) | [optional] [default to String]
**type** | [**DataType**](DataType.md) |  | [optional] [default to DataType]
**description** | **String** | Description of the field (just for rendering to the user) | [optional] [default to String]
**displayName** | **String** | Display Name of the field (just for rendering to the user) | [optional] [default to String]
**sampleValues** | **String** | Example values for the field (just for rendering to the user) | [optional] [default to String]
**allowedValues** | **String** | Any set of exactly allowed values for the field (perhaps just for rendering to the user, if nothing else) | [optional] [default to String]
**mandatoryForActions** | **String** | Which &#x60;Actions&#x60; is this mandatory for? If any (and potentially when), perhaps just for rendering to the user, if nothing else | [optional] [default to String]
**mapping** | [**ExpressionWithAlias**](ExpressionWithAlias.md) |  | [optional] [default to ExpressionWithAlias]

```java
import com.finbourne.sdk.services.luminesce.model.MappableField;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String name = "example name";
DataType @javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String sampleValues = "example sampleValues";
@javax.annotation.Nullable String allowedValues = "example allowedValues";
@javax.annotation.Nullable String mandatoryForActions = "example mandatoryForActions";
ExpressionWithAlias mapping = new ExpressionWithAlias();


MappableField mappableFieldInstance = new MappableField()
    .name(name)
    .type(type)
    .description(description)
    .displayName(displayName)
    .sampleValues(sampleValues)
    .allowedValues(allowedValues)
    .mandatoryForActions(mandatoryForActions)
    .mapping(mapping);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)