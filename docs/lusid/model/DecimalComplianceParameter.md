# com.finbourne.sdk.services.lusid.model.DecimalComplianceParameter
classname DecimalComplianceParameter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**complianceParameterType** | **String** | The parameter type. Available values: BoolComplianceParameter, StringComplianceParameter, DecimalComplianceParameter, DateTimeComplianceParameter, PropertyKeyComplianceParameter, AddressKeyComplianceParameter, PortfolioIdComplianceParameter, PortfolioGroupIdComplianceParameter, StringListComplianceParameter, BoolListComplianceParameter, DateTimeListComplianceParameter, DecimalListComplianceParameter, PropertyKeyListComplianceParameter, AddressKeyListComplianceParameter, PortfolioIdListComplianceParameter, PortfolioGroupIdListComplianceParameter, InstrumentListComplianceParameter, FilterPredicateComplianceParameter, GroupFilterPredicateComplianceParameter, GroupBySelectorComplianceParameter, PropertyListComplianceParameter, GroupCalculationComplianceParameter. | [default to String]
**value** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.DecimalComplianceParameter;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal value = new java.math.BigDecimal("100.00");


DecimalComplianceParameter decimalComplianceParameterInstance = new DecimalComplianceParameter()
    .value(value);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)