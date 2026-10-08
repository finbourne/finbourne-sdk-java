# com.finbourne.sdk.services.lusid.model.RevertValuationPointResponse
classname RevertValuationPointResponse
A Valuation Point reverted to Estimate, with all of its variants. Any variant that finalising the Valuation Point  had rejected is brought back as an Estimate by the revert, and is reported here alongside it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**valuationPointCode** | **String** | The code of the Valuation Point. | [optional] [default to String]
**navTypeCode** | **String** | The navTypeCode of the Fund Calendar Entry. This is the code of the NAV type that this Calendar Entry is associated with. | [optional] [default to String]
**status** | **String** | The status of the Valuation Point. Available values: Undefined, Estimate, Final, Candidate, Rejected, Unofficial. | [default to String]
**applyClearDown** | **Boolean** | Indicates whether a clear down was applied when the Valuation Point was created. | [optional] [default to Boolean]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective time of the Valuation Point. | [default to OffsetDateTime]
**previous** | [**PreviousValuationPoint**](PreviousValuationPoint.md) |  | [optional] [default to PreviousValuationPoint]
**variants** | [**List&lt;EstimateVariant&gt;**](EstimateVariant.md) | The variants of the Estimate Valuation Point.  | [optional] [default to List<EstimateVariant>]
**stagedModifications** | [**StagedModificationsInfo**](StagedModificationsInfo.md) |  | [optional] [default to StagedModificationsInfo]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.RevertValuationPointResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable String valuationPointCode = "example valuationPointCode";
@javax.annotation.Nullable String navTypeCode = "example navTypeCode";
String status = "example status";
Boolean applyClearDown = true;
OffsetDateTime effectiveAt = OffsetDateTime.now();
PreviousValuationPoint previous = new PreviousValuationPoint();
@javax.annotation.Nullable List<EstimateVariant> variants = new List<EstimateVariant>();
StagedModificationsInfo stagedModifications = new StagedModificationsInfo();
@javax.annotation.Nullable List<Link> links = new List<Link>();


RevertValuationPointResponse revertValuationPointResponseInstance = new RevertValuationPointResponse()
    .href(href)
    .valuationPointCode(valuationPointCode)
    .navTypeCode(navTypeCode)
    .status(status)
    .applyClearDown(applyClearDown)
    .effectiveAt(effectiveAt)
    .previous(previous)
    .variants(variants)
    .stagedModifications(stagedModifications)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)