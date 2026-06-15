# com.finbourne.sdk.services.lusid.model.ComplianceRuleResultPortfolioDetail
classname ComplianceRuleResultPortfolioDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**name** | **String** |  | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceRuleResultPortfolioDetail;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
String name = "example name";


ComplianceRuleResultPortfolioDetail complianceRuleResultPortfolioDetailInstance = new ComplianceRuleResultPortfolioDetail()
    .id(id)
    .name(name);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)