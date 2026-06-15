# com.finbourne.sdk.services.lusid.model.Reconciliation
classname Reconciliation
Representation of Reconciliation in LUSID Api

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ReconciliationId**](ReconciliationId.md) |  | [optional] [default to ReconciliationId]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**name** | **String** | The name of the scheduled reconciliation | [optional] [default to String]
**description** | **String** | A description of the scheduled reconciliation | [optional] [default to String]
**isPortfolioGroup** | **Boolean** | Specifies whether reconciliation is between portfolios or portfolio groups | [optional] [default to Boolean]
**left** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**right** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**transactions** | [**ReconciliationTransactions**](ReconciliationTransactions.md) |  | [optional] [default to ReconciliationTransactions]
**positions** | [**ReconciliationConfiguration**](ReconciliationConfiguration.md) |  | [optional] [default to ReconciliationConfiguration]
**valuations** | [**ReconciliationConfiguration**](ReconciliationConfiguration.md) |  | [optional] [default to ReconciliationConfiguration]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | Reconciliation properties | [optional] [default to Map<String, Property>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.Reconciliation;
import java.util.*;
import java.lang.System;
import java.net.URI;

ReconciliationId id = new ReconciliationId();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable String name = "example name";
@javax.annotation.Nullable String description = "example description";
Boolean isPortfolioGroup = true;
ResourceId left = new ResourceId();
ResourceId right = new ResourceId();
ReconciliationTransactions transactions = new ReconciliationTransactions();
ReconciliationConfiguration positions = new ReconciliationConfiguration();
ReconciliationConfiguration valuations = new ReconciliationConfiguration();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


Reconciliation reconciliationInstance = new Reconciliation()
    .id(id)
    .href(href)
    .name(name)
    .description(description)
    .isPortfolioGroup(isPortfolioGroup)
    .left(left)
    .right(right)
    .transactions(transactions)
    .positions(positions)
    .valuations(valuations)
    .properties(properties)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)