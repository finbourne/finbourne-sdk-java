# com.finbourne.sdk.services.lusid.model.UpsertInvestorRecordRequest
classname UpsertInvestorRecordRequest
Request to create or update an investor record

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope in which the Investor Record lies. | [default to String]
**identifiers** | [**Map&lt;String, Property&gt;**](Property.md) | Unique client-defined identifiers of the Investor Record. | [default to Map<String, Property>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties associated to the Investor Record. | [optional] [default to Map<String, Property>]
**displayName** | **String** | The display name of the Investor Record | [default to String]
**description** | **String** | The description of the Investor Record | [optional] [default to String]
**investor** | [**InvestorIdentifier**](InvestorIdentifier.md) |  | [default to InvestorIdentifier]

```java
import com.finbourne.sdk.services.lusid.model.UpsertInvestorRecordRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String scope = "example scope";
Map<String, Property> identifiers = new Map<String, Property>();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
InvestorIdentifier investor = new InvestorIdentifier();


UpsertInvestorRecordRequest upsertInvestorRecordRequestInstance = new UpsertInvestorRecordRequest()
    .scope(scope)
    .identifiers(identifiers)
    .properties(properties)
    .displayName(displayName)
    .description(description)
    .investor(investor);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)