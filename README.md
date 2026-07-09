# FINBOURNE Java SDK

FINBOURNE Java SDK for accessing LUSID and related APIs.

## Requirements

- Java 21+
- Maven 3.8.3+ or Gradle 7.2+

## Installation

### Maven

```xml
<dependency>
  <groupId>com.finbourne.sdk</groupId>
  <artifactId>finbourne.sdk</artifactId>
  <version>0.0.20</version>
</dependency>
```

### Gradle

```groovy
implementation "com.finbourne.sdk:finbourne.sdk:0.0.20"
```

## Authentication

The SDK supports two authentication methods: **short-lived OAuth2 tokens** (username/password + client credentials) and **long-lived Personal Access Tokens**.

Configuration is loaded from a `secrets.json` file or from environment variables. The SDK tries the secrets file first, then falls back to environment variables.

### Secrets file

Create a `secrets.json` file with profiles:

**Using OAuth2 credentials:**

```json
{
  "profiles": {
    "default": {
      "tokenUrl": "https://<your-domain>.lusid.com/oauth2/token",
      "baseUrl": "https://<your-domain>.lusid.com/api",
      "username": "<your-username>",
      "password": "<your-password>",
      "clientId": "<your-client-id>",
      "clientSecret": "<your-client-secret>"
    }
  }
}
```

**Using a Personal Access Token:**

```json
{
  "profiles": {
    "default": {
      "baseUrl": "https://<your-domain>.lusid.com/api",
      "accessToken": "<your-access-token>"
    }
  }
}
```

### Environment variables

| Variable | Description |
|----------|-------------|
| `FBN_TOKEN_URL` | OAuth2 token endpoint |
| `FBN_BASE_URL` | API base URL (required) |
| `FBN_USERNAME` | OAuth2 username |
| `FBN_PASSWORD` | OAuth2 password |
| `FBN_CLIENT_ID` | OAuth2 client ID |
| `FBN_CLIENT_SECRET` | OAuth2 client secret |
| `FBN_ACCESS_TOKEN` | Personal Access Token (alternative to OAuth2) |

Optional configuration:

| Variable | Default | Description |
|----------|---------|-------------|
| `FBN_TOTAL_TIMEOUT_MS` | `1800000` | Total request timeout (ms) |
| `FBN_CONNECT_TIMEOUT_MS` | `30000` | Connection timeout (ms) |
| `FBN_READ_TIMEOUT_MS` | `30000` | Read timeout (ms) |
| `FBN_WRITE_TIMEOUT_MS` | `30000` | Write timeout (ms) |
| `FBN_RATE_LIMIT_RETRIES` | `2` | Retries on HTTP 429 |

## Getting Started

### Basic usage with a secrets file

```java
import com.finbourne.sdk.extensions.ApiFactory;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.services.lusid.api.PortfoliosApi;
import com.finbourne.sdk.services.lusid.model.ResourceListOfPortfolio;

public class Example {
    public static void main(String[] args) throws Exception {
        // Build a factory from a secrets file
        ApiFactory factory = new ApiFactoryBuilder()
                .withConfigurationFile("secrets.json")
                .build();

        // Create an API instance
        PortfoliosApi portfoliosApi = factory.build(PortfoliosApi.class);

        // Make a request
        ResourceListOfPortfolio portfolios = portfoliosApi.listPortfoliosForScope("my-scope")
                .execute();

        System.out.println("Found " + portfolios.getValues().size() + " portfolios");
    }
}
```

### Using a named profile

```java
ApiFactory factory = new ApiFactoryBuilder()
        .withConfigurationFile("secrets.json")
        .withProfileName("production")
        .build();
```

### Using environment variables

```java
// Reads FBN_* environment variables automatically when no secrets file is provided
ApiFactory factory = new ApiFactoryBuilder().build();
```

### Overriding timeouts

```java
import com.finbourne.sdk.core.config.ConfigurationOptions;

ConfigurationOptions opts = new ConfigurationOptions();
opts.setTotalTimeoutMs(30000);
opts.setConnectTimeoutMs(5000);

ApiFactory factory = new ApiFactoryBuilder()
        .withConfigurationFile("secrets.json")
        .withConfigurationOptions(opts)
        .build();
```

## Documentation

Refer to the [docs](docs/) folder for API endpoint and model documentation.
