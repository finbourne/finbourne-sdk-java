# com.finbourne.sdk.services.lusid.model.DateTimeComplianceParameter
classname DateTimeComplianceParameter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**complianceParameterType** | **String** | The parameter type. Available values: BoolComplianceParameter, StringComplianceParameter, DecimalComplianceParameter, DateTimeComplianceParameter, PropertyKeyComplianceParameter, AddressKeyComplianceParameter, PortfolioIdComplianceParameter, PortfolioGroupIdComplianceParameter, StringListComplianceParameter, BoolListComplianceParameter, DateTimeListComplianceParameter, DecimalListComplianceParameter, PropertyKeyListComplianceParameter, AddressKeyListComplianceParameter, PortfolioIdListComplianceParameter, PortfolioGroupIdListComplianceParameter, InstrumentListComplianceParameter, FilterPredicateComplianceParameter, GroupFilterPredicateComplianceParameter, GroupBySelectorComplianceParameter, PropertyListComplianceParameter, GroupCalculationComplianceParameter. | [default to String]
**value** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.DateTimeComplianceParameter;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime value = OffsetDateTime.now();


DateTimeComplianceParameter dateTimeComplianceParameterInstance = new DateTimeComplianceParameter()
    .value(value);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)