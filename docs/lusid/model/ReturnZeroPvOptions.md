# com.finbourne.sdk.services.lusid.model.ReturnZeroPvOptions
classname ReturnZeroPvOptions
Options to indicate which errors to ignore when performing valuation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentMatured** | **Boolean** | Indicates whether attempting to value an instrument after its maturity date should produce a failure (false)  or a zero PV (true). | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.ReturnZeroPvOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean instrumentMatured = true;


ReturnZeroPvOptions returnZeroPvOptionsInstance = new ReturnZeroPvOptions()
    .instrumentMatured(instrumentMatured);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)