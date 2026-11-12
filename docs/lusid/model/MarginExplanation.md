# com.finbourne.sdk.services.lusid.model.MarginExplanation
classname MarginExplanation
How the margin figures of a call or a line were arrived at: the working behind each figure as a tree of components,  with the working of portfolios the caller may not read replaced by a redacted component.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The URI of this explanation. | [optional] [default to URI]
**runId** | **String** | The run whose figures are explained. | [default to String]
**agreementId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**item** | **String** | The margin item of the call explained or, for a line, of the line. | [optional] [default to String]
**marginType** | **String** | The margin type of the call explained. Null when a line is explained. | [optional] [default to String]
**direction** | **String** | Who posts under the call explained: WePost, TheyPost or None. Null when a line is explained. | [optional] [default to String]
**lineKey** | **String** | The key of the line explained. Null when a call is explained. | [optional] [default to String]
**currency** | **String** | The agreement&#39;s base currency, in which a component&#39;s value is expressed unless the component names another. | [default to String]
**scenario** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**components** | [**List&lt;MarginExplanationComponent&gt;**](MarginExplanationComponent.md) | The working behind each figure explained, one root component per figure: for a call its required amount, named InitialMarginRequired, and for a line each figure asked for that the run explained, named VariationMargin or InitialMargin. | [default to List<MarginExplanationComponent>]

```java
import com.finbourne.sdk.services.lusid.model.MarginExplanation;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
String runId = "example runId";
ResourceId agreementId = new ResourceId();
@javax.annotation.Nullable String item = "example item";
@javax.annotation.Nullable String marginType = "example marginType";
@javax.annotation.Nullable String direction = "example direction";
@javax.annotation.Nullable String lineKey = "example lineKey";
String currency = "example currency";
ResourceId scenario = new ResourceId();
List<MarginExplanationComponent> components = new List<MarginExplanationComponent>();


MarginExplanation marginExplanationInstance = new MarginExplanation()
    .href(href)
    .runId(runId)
    .agreementId(agreementId)
    .item(item)
    .marginType(marginType)
    .direction(direction)
    .lineKey(lineKey)
    .currency(currency)
    .scenario(scenario)
    .components(components);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)