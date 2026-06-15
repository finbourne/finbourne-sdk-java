# com.finbourne.sdk.services.horizon.model.JSchema
classname JSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schemaVersion** | [**URI**](URI.md) |  | [optional] [default to URI]
**valid** | **Boolean** |  | [optional] [default to Boolean]
**reference** | [**URI**](URI.md) |  | [optional] [default to URI]
**ref** | [**JSchema**](JSchema.md) |  | [optional] [default to JSchema]
**recursiveReference** | [**URI**](URI.md) |  | [optional] [default to URI]
**recursiveAnchor** | **Boolean** |  | [optional] [default to Boolean]
**id** | [**URI**](URI.md) |  | [optional] [default to URI]
**anchor** | **String** |  | [optional] [default to String]
**type** | [**JSchemaType**](JSchemaType.md) |  | [optional] [default to JSchemaType]
**_default** | **Object** |  | [optional] [default to Object]
**properties** | [**Map&lt;String, JSchema&gt;**](JSchema.md) |  | [readonly] [default to Map<String, JSchema>]
**items** | [**List&lt;JSchema&gt;**](JSchema.md) |  | [readonly] [default to List<JSchema>]
**itemsPositionValidation** | **Boolean** |  | [default to Boolean]
**required** | **List&lt;String&gt;** |  | [readonly] [default to List<String>]
**allOf** | [**List&lt;JSchema&gt;**](JSchema.md) |  | [readonly] [default to List<JSchema>]
**anyOf** | [**List&lt;JSchema&gt;**](JSchema.md) |  | [readonly] [default to List<JSchema>]
**oneOf** | [**List&lt;JSchema&gt;**](JSchema.md) |  | [readonly] [default to List<JSchema>]
**_if** | [**JSchema**](JSchema.md) |  | [optional] [default to JSchema]
**then** | [**JSchema**](JSchema.md) |  | [optional] [default to JSchema]
**_else** | [**JSchema**](JSchema.md) |  | [optional] [default to JSchema]
**not** | [**JSchema**](JSchema.md) |  | [optional] [default to JSchema]
**contains** | [**JSchema**](JSchema.md) |  | [optional] [default to JSchema]
**propertyNames** | [**JSchema**](JSchema.md) |  | [optional] [default to JSchema]
**_enum** | **List&lt;Object&gt;** |  | [readonly] [default to List<Object>]
**_const** | **Object** |  | [optional] [default to Object]
**uniqueItems** | **Boolean** |  | [default to Boolean]
**minimumLength** | **Long** |  | [optional] [default to Long]
**maximumLength** | **Long** |  | [optional] [default to Long]
**exclusiveMinimum** | **Boolean** |  | [default to Boolean]
**exclusiveMaximum** | **Boolean** |  | [default to Boolean]
**minimumItems** | **Long** |  | [optional] [default to Long]
**maximumItems** | **Long** |  | [optional] [default to Long]
**minimumProperties** | **Long** |  | [optional] [default to Long]
**maximumProperties** | **Long** |  | [optional] [default to Long]
**minimumContains** | **Long** |  | [optional] [default to Long]
**maximumContains** | **Long** |  | [optional] [default to Long]
**contentEncoding** | **String** |  | [optional] [default to String]
**contentMediaType** | **String** |  | [optional] [default to String]
**writeOnly** | **Boolean** |  | [optional] [default to Boolean]
**readOnly** | **Boolean** |  | [optional] [default to Boolean]
**extensionData** | **Map&lt;String, Object&gt;** |  | [readonly] [default to Map<String, Object>]
**title** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]
**multipleOf** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**pattern** | **String** |  | [optional] [default to String]
**dependencies** | **Map&lt;String, Object&gt;** |  | [readonly] [default to Map<String, Object>]
**dependentRequired** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) |  | [readonly] [default to Map<String, List<String>>]
**dependentSchemas** | [**Map&lt;String, JSchema&gt;**](JSchema.md) |  | [readonly] [default to Map<String, JSchema>]
**patternProperties** | [**Map&lt;String, JSchema&gt;**](JSchema.md) |  | [readonly] [default to Map<String, JSchema>]
**additionalProperties** | [**JSchema**](JSchema.md) |  | [optional] [default to JSchema]
**allowAdditionalProperties** | **Boolean** |  | [default to Boolean]
**allowAdditionalPropertiesSpecified** | **Boolean** |  | [default to Boolean]
**unevaluatedProperties** | [**JSchema**](JSchema.md) |  | [optional] [default to JSchema]
**allowUnevaluatedProperties** | **Boolean** |  | [optional] [default to Boolean]
**additionalItems** | [**JSchema**](JSchema.md) |  | [optional] [default to JSchema]
**allowAdditionalItems** | **Boolean** |  | [default to Boolean]
**allowAdditionalItemsSpecified** | **Boolean** |  | [default to Boolean]
**unevaluatedItems** | [**JSchema**](JSchema.md) |  | [optional] [default to JSchema]
**allowUnevaluatedItems** | **Boolean** |  | [optional] [default to Boolean]
**format** | **String** |  | [optional] [default to String]
**validators** | **List&lt;Object&gt;** |  | [readonly] [default to List<Object>]

```java
import com.finbourne.sdk.services.horizon.model.JSchema;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI schemaVersion = URI.create("http://example.com/schemaVersion");
@javax.annotation.Nullable Boolean valid = true;
@javax.annotation.Nullable URI reference = URI.create("http://example.com/reference");
JSchema ref = new JSchema();
@javax.annotation.Nullable URI recursiveReference = URI.create("http://example.com/recursiveReference");
@javax.annotation.Nullable Boolean recursiveAnchor = true;
@javax.annotation.Nullable URI id = URI.create("http://example.com/id");
@javax.annotation.Nullable String anchor = "example anchor";
JSchemaType @javax.annotation.Nullable Object Map<String, JSchema> properties = new Map<String, JSchema>();
List<JSchema> items = new List<JSchema>();
Boolean itemsPositionValidation = true;
List<String> required = new List<String>();
List<JSchema> allOf = new List<JSchema>();
List<JSchema> anyOf = new List<JSchema>();
List<JSchema> oneOf = new List<JSchema>();
JSchema if = new JSchema();
JSchema then = new JSchema();
JSchema else = new JSchema();
JSchema not = new JSchema();
JSchema contains = new JSchema();
JSchema propertyNames = new JSchema();
List<Object> enum = new List<Object>();
@javax.annotation.Nullable Object Boolean uniqueItems = true;
@javax.annotation.Nullable Long minimumLength = new Long("100.00");
@javax.annotation.Nullable Long maximumLength = new Long("100.00");
Boolean exclusiveMinimum = true;
Boolean exclusiveMaximum = true;
@javax.annotation.Nullable Long minimumItems = new Long("100.00");
@javax.annotation.Nullable Long maximumItems = new Long("100.00");
@javax.annotation.Nullable Long minimumProperties = new Long("100.00");
@javax.annotation.Nullable Long maximumProperties = new Long("100.00");
@javax.annotation.Nullable Long minimumContains = new Long("100.00");
@javax.annotation.Nullable Long maximumContains = new Long("100.00");
@javax.annotation.Nullable String contentEncoding = "example contentEncoding";
@javax.annotation.Nullable String contentMediaType = "example contentMediaType";
@javax.annotation.Nullable Boolean writeOnly = true;
@javax.annotation.Nullable Boolean readOnly = true;
Map<String, Object> extensionData = new Map<String, Object>();
@javax.annotation.Nullable String title = "example title";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable java.math.BigDecimal multipleOf = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String pattern = "example pattern";
Map<String, Object> dependencies = new Map<String, Object>();
Map<String, List<String>> dependentRequired = new Map<String, List<String>>();
Map<String, JSchema> dependentSchemas = new Map<String, JSchema>();
Map<String, JSchema> patternProperties = new Map<String, JSchema>();
JSchema additionalProperties = new JSchema();
Boolean allowAdditionalProperties = true;
Boolean allowAdditionalPropertiesSpecified = true;
JSchema unevaluatedProperties = new JSchema();
@javax.annotation.Nullable Boolean allowUnevaluatedProperties = true;
JSchema additionalItems = new JSchema();
Boolean allowAdditionalItems = true;
Boolean allowAdditionalItemsSpecified = true;
JSchema unevaluatedItems = new JSchema();
@javax.annotation.Nullable Boolean allowUnevaluatedItems = true;
@javax.annotation.Nullable String format = "example format";
List<Object> validators = new List<Object>();


JSchema jSchemaInstance = new JSchema()
    .schemaVersion(schemaVersion)
    .valid(valid)
    .reference(reference)
    .ref(ref)
    .recursiveReference(recursiveReference)
    .recursiveAnchor(recursiveAnchor)
    .id(id)
    .anchor(anchor)
    .type(type)
    .default(default)
    .properties(properties)
    .items(items)
    .itemsPositionValidation(itemsPositionValidation)
    .required(required)
    .allOf(allOf)
    .anyOf(anyOf)
    .oneOf(oneOf)
    .if(if)
    .then(then)
    .else(else)
    .not(not)
    .contains(contains)
    .propertyNames(propertyNames)
    .enum(enum)
    .const(const)
    .uniqueItems(uniqueItems)
    .minimumLength(minimumLength)
    .maximumLength(maximumLength)
    .exclusiveMinimum(exclusiveMinimum)
    .exclusiveMaximum(exclusiveMaximum)
    .minimumItems(minimumItems)
    .maximumItems(maximumItems)
    .minimumProperties(minimumProperties)
    .maximumProperties(maximumProperties)
    .minimumContains(minimumContains)
    .maximumContains(maximumContains)
    .contentEncoding(contentEncoding)
    .contentMediaType(contentMediaType)
    .writeOnly(writeOnly)
    .readOnly(readOnly)
    .extensionData(extensionData)
    .title(title)
    .description(description)
    .multipleOf(multipleOf)
    .pattern(pattern)
    .dependencies(dependencies)
    .dependentRequired(dependentRequired)
    .dependentSchemas(dependentSchemas)
    .patternProperties(patternProperties)
    .additionalProperties(additionalProperties)
    .allowAdditionalProperties(allowAdditionalProperties)
    .allowAdditionalPropertiesSpecified(allowAdditionalPropertiesSpecified)
    .unevaluatedProperties(unevaluatedProperties)
    .allowUnevaluatedProperties(allowUnevaluatedProperties)
    .additionalItems(additionalItems)
    .allowAdditionalItems(allowAdditionalItems)
    .allowAdditionalItemsSpecified(allowAdditionalItemsSpecified)
    .unevaluatedItems(unevaluatedItems)
    .allowUnevaluatedItems(allowUnevaluatedItems)
    .format(format)
    .validators(validators);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)