# com.finbourne.sdk.services.lusid.model.ComplianceParameter
classname ComplianceParameter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**complianceParameterType** | **String** | The parameter type. Available values: BoolComplianceParameter, StringComplianceParameter, DecimalComplianceParameter, DateTimeComplianceParameter, PropertyKeyComplianceParameter, AddressKeyComplianceParameter, PortfolioIdComplianceParameter, PortfolioGroupIdComplianceParameter, StringListComplianceParameter, BoolListComplianceParameter, DateTimeListComplianceParameter, DecimalListComplianceParameter, PropertyKeyListComplianceParameter, AddressKeyListComplianceParameter, PortfolioIdListComplianceParameter, PortfolioGroupIdListComplianceParameter, InstrumentListComplianceParameter, FilterPredicateComplianceParameter, GroupFilterPredicateComplianceParameter, GroupBySelectorComplianceParameter, PropertyListComplianceParameter, GroupCalculationComplianceParameter. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceParameter;
import java.util.*;
import java.lang.System;
import java.net.URI;

String complianceParameterType = "example complianceParameterType";


ComplianceParameter complianceParameterInstance = new ComplianceParameter()
    .complianceParameterType(complianceParameterType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)