# com.finbourne.sdk.services.lusid.model.InvestorRecord
classname InvestorRecord
Representation of an Investor Record on the LUSID API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope in which the Investor Record lies. | [optional] [default to String]
**identifiers** | [**Map&lt;String, Property&gt;**](Property.md) | Unique client-defined identifiers of the Investor Record. | [optional] [default to Map<String, Property>]
**displayName** | **String** | The display name of the Investor Record | [optional] [default to String]
**description** | **String** | The description of the Investor Record | [optional] [default to String]
**investor** | [**Investor**](Investor.md) |  | [optional] [default to Investor]
**lusidInvestorRecordId** | **String** | The unique LUSID Investor Record Identifier of the Investor Record. | [optional] [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties associated to the Investor Record. | [optional] [default to Map<String, Property>]
**relationships** | [**List&lt;Relationship&gt;**](Relationship.md) | A set of relationships associated to the Investor Record. | [optional] [default to List<Relationship>]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.InvestorRecord;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String scope = "example scope";
@javax.annotation.Nullable Map<String, Property> identifiers = new Map<String, Property>();
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
Investor investor = new Investor();
@javax.annotation.Nullable String lusidInvestorRecordId = "example lusidInvestorRecordId";
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
@javax.annotation.Nullable List<Relationship> relationships = new List<Relationship>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


InvestorRecord investorRecordInstance = new InvestorRecord()
    .scope(scope)
    .identifiers(identifiers)
    .displayName(displayName)
    .description(description)
    .investor(investor)
    .lusidInvestorRecordId(lusidInvestorRecordId)
    .properties(properties)
    .relationships(relationships)
    .href(href)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)