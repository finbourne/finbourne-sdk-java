# com.finbourne.sdk.services.lusid.model.MarginRunShard
classname MarginRunShard
One valuation shard of a margin run: the agreements it values with one recipe, and how far it has got.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The identifier of the shard within the run. | [default to String]
**recipeId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**agreements** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The collateral agreements the shard values. | [default to List<ResourceId>]
**status** | **String** | The status of the shard. One of Pending, Running, Completed or Failed. | [default to String]
**callCount** | **Integer** | The number of margin calls the shard published. | [default to Integer]
**lineCount** | **Integer** | The number of margin lines the shard published. | [default to Integer]
**detail** | **String** | Why the shard failed, or which of its netting sets it completed without figures and why. | [optional] [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | When the shard was valued: the run&#39;s as-at, or the time of the retry that valued it. Null until the shard has finished. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.MarginRunShard;
import java.util.*;
import java.lang.System;
import java.net.URI;

String id = "example id";
ResourceId recipeId = new ResourceId();
List<ResourceId> agreements = new List<ResourceId>();
String status = "example status";
Integer callCount = new Integer("100.00");
Integer lineCount = new Integer("100.00");
@javax.annotation.Nullable String detail = "example detail";
@javax.annotation.Nullable OffsetDateTime asAt = OffsetDateTime.now();


MarginRunShard marginRunShardInstance = new MarginRunShard()
    .id(id)
    .recipeId(recipeId)
    .agreements(agreements)
    .status(status)
    .callCount(callCount)
    .lineCount(lineCount)
    .detail(detail)
    .asAt(asAt);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)