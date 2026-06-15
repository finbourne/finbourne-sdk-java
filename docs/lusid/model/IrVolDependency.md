# com.finbourne.sdk.services.lusid.model.IrVolDependency
classname IrVolDependency
Economic dependency required to price interest rate products that contain optionality, for example swaptions.  For example, can indicate a dependency on an IrVolCubeData.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dependencyType** | **String** | Available values: OpaqueDependency, CashDependency, DiscountingDependency, EquityCurveDependency, EquityVolDependency, FxDependency, FxForwardsDependency, FxVolDependency, IndexProjectionDependency, IrVolDependency, QuoteDependency, Vendor, CalendarDependency, InflationFixingDependency. | [default to String]
**currency** | **String** | The domestic currency of the instrument declaring this dependency. | [default to String]
**volType** | **String** | Volatility type e.g. \&quot;LN\&quot; and \&quot;N\&quot; for log-normal and normal volatility. | [default to String]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The effectiveDate of the entity that this is a dependency for.  Unless there is an obvious date this should be, like for a historic reset, then this is the valuation date. | [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.IrVolDependency;
import java.util.*;
import java.lang.System;
import java.net.URI;

String currency = "example currency";
String volType = "example volType";
OffsetDateTime date = OffsetDateTime.now();


IrVolDependency irVolDependencyInstance = new IrVolDependency()
    .currency(currency)
    .volType(volType)
    .date(date);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)