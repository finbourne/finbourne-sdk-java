# com.finbourne.sdk.services.lusid.model.PropertyKeyComplianceParameter
classname PropertyKeyComplianceParameter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**complianceParameterType** | **String** | The parameter type. Available values: BoolComplianceParameter, StringComplianceParameter, DecimalComplianceParameter, DateTimeComplianceParameter, PropertyKeyComplianceParameter, AddressKeyComplianceParameter, PortfolioIdComplianceParameter, PortfolioGroupIdComplianceParameter, StringListComplianceParameter, BoolListComplianceParameter, DateTimeListComplianceParameter, DecimalListComplianceParameter, PropertyKeyListComplianceParameter, AddressKeyListComplianceParameter, PortfolioIdListComplianceParameter, PortfolioGroupIdListComplianceParameter, InstrumentListComplianceParameter, FilterPredicateComplianceParameter, GroupFilterPredicateComplianceParameter, GroupBySelectorComplianceParameter, PropertyListComplianceParameter, GroupCalculationComplianceParameter. | [default to String]
**value** | **String** | The key that uniquely identifies the property. It has the format {domain}/{scope}/{code}. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.PropertyKeyComplianceParameter;
import java.util.*;
import java.lang.System;
import java.net.URI;

String value = "example value";


PropertyKeyComplianceParameter propertyKeyComplianceParameterInstance = new PropertyKeyComplianceParameter()
    .value(value);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)