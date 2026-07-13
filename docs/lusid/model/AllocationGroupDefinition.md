# com.finbourne.sdk.services.lusid.model.AllocationGroupDefinition
classname AllocationGroupDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**classes** | [**List&lt;AllocationGroupClassDefinition&gt;**](AllocationGroupClassDefinition.md) | An optional list of share classes that belong to this group. Each entry must reference a ShareClass already present on the Fund. You can provide this or the Formula, but not both. | [optional] [default to List<AllocationGroupClassDefinition>]
**name** | **String** | The display name of the Allocation Group. | [default to String]
**description** | **String** | An optional description for the Allocation Group. | [optional] [default to String]
**shareClassShortCode** | **String** | The short code that identifies the Allocation Group. | [default to String]
**apportionmentMethodProperty** | [**ApportionmentMethodProperty**](ApportionmentMethodProperty.md) |  | [optional] [default to ApportionmentMethodProperty]
**formula** | **String** | An optional filter expression used to define which classes belong to this group, based on fund grouping criteria. You can provide this or the Classes, but not both. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AllocationGroupDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<AllocationGroupClassDefinition> classes = new List<AllocationGroupClassDefinition>();
String name = "example name";
@javax.annotation.Nullable String description = "example description";
String shareClassShortCode = "example shareClassShortCode";
ApportionmentMethodProperty apportionmentMethodProperty = new ApportionmentMethodProperty();
@javax.annotation.Nullable String formula = "example formula";


AllocationGroupDefinition allocationGroupDefinitionInstance = new AllocationGroupDefinition()
    .classes(classes)
    .name(name)
    .description(description)
    .shareClassShortCode(shareClassShortCode)
    .apportionmentMethodProperty(apportionmentMethodProperty)
    .formula(formula);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)