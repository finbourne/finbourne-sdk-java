# com.finbourne.sdk.services.lusid.model.BatchAmendCustomDataModelMembershipResponse
classname BatchAmendCustomDataModelMembershipResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**Map&lt;String, MembershipAmendmentResponse&gt;**](MembershipAmendmentResponse.md) |  | [optional] [default to Map<String, MembershipAmendmentResponse>]
**staged** | [**Map&lt;String, MembershipAmendmentResponse&gt;**](MembershipAmendmentResponse.md) |  | [optional] [default to Map<String, MembershipAmendmentResponse>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) |  | [optional] [default to Map<String, ErrorDetail>]
**metadata** | [**Map&lt;String, List&lt;ResponseMetaData&gt;&gt;**](List.md) |  | [optional] [default to Map<String, List<ResponseMetaData>>]

```java
import com.finbourne.sdk.services.lusid.model.BatchAmendCustomDataModelMembershipResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, MembershipAmendmentResponse> values = new Map<String, MembershipAmendmentResponse>();
@javax.annotation.Nullable Map<String, MembershipAmendmentResponse> staged = new Map<String, MembershipAmendmentResponse>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable Map<String, List<ResponseMetaData>> metadata = new Map<String, List<ResponseMetaData>>();


BatchAmendCustomDataModelMembershipResponse batchAmendCustomDataModelMembershipResponseInstance = new BatchAmendCustomDataModelMembershipResponse()
    .values(values)
    .staged(staged)
    .failed(failed)
    .metadata(metadata);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)