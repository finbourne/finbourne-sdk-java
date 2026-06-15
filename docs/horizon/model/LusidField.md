# com.finbourne.sdk.services.horizon.model.LusidField
classname LusidField
A field on a LUSID entity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fieldName** | **String** | The name of the LUSID field. | [default to String]
**defaultValue** | **String** | The default value for the field. | [optional] [default to String]
**vendorPackages** | **List&lt;String&gt;** | The vendor package that contributes to this LUSID field. | [default to List<String>]
**vendorNamespaces** | **List&lt;String&gt;** | The vendor namespace that contributes to this LUSID field. | [default to List<String>]
**vendorFields** | **List&lt;String&gt;** | The underlying fields on the vendor package that contribute to this LUSID field | [default to List<String>]
**transformationDescription** | **String** | A description of how the vendor package&#39;s field(s) get mapped to the LUSID field | [optional] [default to String]
**entityType** | **String** | LUSID Entity this refers to (e.g. Instrument) | [default to String]
**entitySubType** | **String** | Sub-Entity this field refers to (e.g. Equity) | [optional] [default to String]

```java
import com.finbourne.sdk.services.horizon.model.LusidField;
import java.util.*;
import java.lang.System;
import java.net.URI;

String fieldName = "example fieldName";
@javax.annotation.Nullable String defaultValue = "example defaultValue";
List<String> vendorPackages = new List<String>();
List<String> vendorNamespaces = new List<String>();
List<String> vendorFields = new List<String>();
@javax.annotation.Nullable String transformationDescription = "example transformationDescription";
String entityType = "example entityType";
@javax.annotation.Nullable String entitySubType = "example entitySubType";


LusidField lusidFieldInstance = new LusidField()
    .fieldName(fieldName)
    .defaultValue(defaultValue)
    .vendorPackages(vendorPackages)
    .vendorNamespaces(vendorNamespaces)
    .vendorFields(vendorFields)
    .transformationDescription(transformationDescription)
    .entityType(entityType)
    .entitySubType(entitySubType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)