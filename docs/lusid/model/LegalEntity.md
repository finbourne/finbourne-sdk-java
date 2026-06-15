# com.finbourne.sdk.services.lusid.model.LegalEntity
classname LegalEntity
Representation of Legal Entity on LUSID API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The display name of the Legal Entity | [optional] [default to String]
**description** | **String** | The description of the Legal Entity | [optional] [default to String]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**lusidLegalEntityId** | **String** | The unique LUSID Legal Entity Identifier of the Legal Entity. | [optional] [default to String]
**identifiers** | [**Map&lt;String, Property&gt;**](Property.md) | Unique client-defined identifiers of the Legal Entity. | [optional] [default to Map<String, Property>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties associated to the Legal Entity. | [optional] [default to Map<String, Property>]
**relationships** | [**List&lt;Relationship&gt;**](Relationship.md) | A set of relationships associated to the Legal Entity. | [optional] [default to List<Relationship>]
**counterpartyRiskInformation** | [**CounterpartyRiskInformation**](CounterpartyRiskInformation.md) |  | [optional] [default to CounterpartyRiskInformation]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.LegalEntity;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable String lusidLegalEntityId = "example lusidLegalEntityId";
@javax.annotation.Nullable Map<String, Property> identifiers = new Map<String, Property>();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
@javax.annotation.Nullable List<Relationship> relationships = new List<Relationship>();
CounterpartyRiskInformation counterpartyRiskInformation = new CounterpartyRiskInformation();
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


LegalEntity legalEntityInstance = new LegalEntity()
    .displayName(displayName)
    .description(description)
    .href(href)
    .lusidLegalEntityId(lusidLegalEntityId)
    .identifiers(identifiers)
    .properties(properties)
    .relationships(relationships)
    .counterpartyRiskInformation(counterpartyRiskInformation)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)