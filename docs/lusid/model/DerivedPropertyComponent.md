# com.finbourne.sdk.services.lusid.model.DerivedPropertyComponent
classname DerivedPropertyComponent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | **String** | The component of the formula which is being evaluated. | [optional] [default to String]
**displayName** | **String** | The display name of the component being evaluated. | [optional] [default to String]
**type** | **String** | The type of the formula component. Available values: Variable, DerivedProperty, Literal, PartialFormula. | [optional] [default to String]
**value** | [**PropertyValue**](PropertyValue.md) |  | [optional] [default to PropertyValue]
**derivationFormula** | **String** | The derivation formula of the component. This field will only be populated if the component is a derived property. | [optional] [default to String]
**subComponents** | [**List&lt;DerivedPropertyComponent&gt;**](DerivedPropertyComponent.md) | Any sub-components of this formula. If this formula cannot be further decomposed, this collection will be null. | [optional] [default to List<DerivedPropertyComponent>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.DerivedPropertyComponent;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String component = "example component";
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String type = "example type";
PropertyValue value = new PropertyValue();
@javax.annotation.Nullable String derivationFormula = "example derivationFormula";
@javax.annotation.Nullable List<DerivedPropertyComponent> subComponents = new List<DerivedPropertyComponent>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


DerivedPropertyComponent derivedPropertyComponentInstance = new DerivedPropertyComponent()
    .component(component)
    .displayName(displayName)
    .type(type)
    .value(value)
    .derivationFormula(derivationFormula)
    .subComponents(subComponents)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)