# com.finbourne.sdk.services.lusid.model.ResultKeyRule
classname ResultKeyRule
Base class for representing result key rules in LUSID, which describe how to resolve (unit) result data.  This base class should not be directly instantiated; each supported ResultKeyRuleType has a corresponding inherited class.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resultKeyRuleType** | **String** | Available values: Invalid, ResultDataKeyRule, PortfolioResultDataKeyRule. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ResultKeyRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String resultKeyRuleType = "example resultKeyRuleType";


ResultKeyRule resultKeyRuleInstance = new ResultKeyRule()
    .resultKeyRuleType(resultKeyRuleType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)