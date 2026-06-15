# com.finbourne.sdk.services.lusid.model.PortfolioIdComplianceParameter
classname PortfolioIdComplianceParameter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**complianceParameterType** | **String** | The parameter type. Available values: BoolComplianceParameter, StringComplianceParameter, DecimalComplianceParameter, DateTimeComplianceParameter, PropertyKeyComplianceParameter, AddressKeyComplianceParameter, PortfolioIdComplianceParameter, PortfolioGroupIdComplianceParameter, StringListComplianceParameter, BoolListComplianceParameter, DateTimeListComplianceParameter, DecimalListComplianceParameter, PropertyKeyListComplianceParameter, AddressKeyListComplianceParameter, PortfolioIdListComplianceParameter, PortfolioGroupIdListComplianceParameter, InstrumentListComplianceParameter, FilterPredicateComplianceParameter, GroupFilterPredicateComplianceParameter, GroupBySelectorComplianceParameter, PropertyListComplianceParameter, GroupCalculationComplianceParameter. | [default to String]
**value** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]

```java
import com.finbourne.sdk.services.lusid.model.PortfolioIdComplianceParameter;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId value = new ResourceId();


PortfolioIdComplianceParameter portfolioIdComplianceParameterInstance = new PortfolioIdComplianceParameter()
    .value(value);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)