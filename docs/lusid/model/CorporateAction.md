# com.finbourne.sdk.services.lusid.model.CorporateAction
classname CorporateAction
A corporate action

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**corporateActionCode** | **String** | The unique identifier of this corporate action | [default to String]
**description** | **String** | The description of the corporate action. | [optional] [default to String]
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The announcement date of the corporate action | [optional] [default to OffsetDateTime]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The ex date of the corporate action | [optional] [default to OffsetDateTime]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | The record date of the corporate action | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The payment date of the corporate action | [optional] [default to OffsetDateTime]
**transitions** | [**List&lt;CorporateActionTransition&gt;**](CorporateActionTransition.md) | The transitions that result from this corporate action | [optional] [default to List<CorporateActionTransition>]

```java
import com.finbourne.sdk.services.lusid.model.CorporateAction;
import java.util.*;
import java.lang.System;
import java.net.URI;

String corporateActionCode = "example corporateActionCode";
@javax.annotation.Nullable String description = "example description";
OffsetDateTime announcementDate = OffsetDateTime.now();
OffsetDateTime exDate = OffsetDateTime.now();
OffsetDateTime recordDate = OffsetDateTime.now();
OffsetDateTime paymentDate = OffsetDateTime.now();
@javax.annotation.Nullable List<CorporateActionTransition> transitions = new List<CorporateActionTransition>();


CorporateAction corporateActionInstance = new CorporateAction()
    .corporateActionCode(corporateActionCode)
    .description(description)
    .announcementDate(announcementDate)
    .exDate(exDate)
    .recordDate(recordDate)
    .paymentDate(paymentDate)
    .transitions(transitions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)