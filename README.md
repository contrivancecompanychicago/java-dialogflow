# Google Dialogflow API Client for Java

Java idiomatic client for [Dialogflow API][product-docs].

[![Maven][maven-version-image]][maven-version-link]
![Stability][stability-image]

- [Product Documentation][product-docs]
- [Client Library Documentation][javadocs]

## Quickstart

If you are using Maven with [BOM][libraries-bom], add this to your pom.xml file
```xml
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.google.cloud</groupId>
      <artifactId>libraries-bom</artifactId>
      <version>16.2.0</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency>
  </dependencies>
</dependencyManagement>

<dependencies>
  <dependency>
    <groupId>com.google.cloud</groupId>
    <artifactId>google-cloud-dialogflow</artifactId>
  </dependency>

```

If you are using Maven without BOM, add this to your dependencies:

```xml
<dependency>
  <groupId>com.google.cloud</groupId>
  <artifactId>google-cloud-dialogflow</artifactId>
  <version>2.4.3</version>
</dependency>

```

If you are using Gradle, add this to your dependencies
```Groovy
compile 'com.google.cloud:google-cloud-dialogflow:2.4.3'
```
If you are using SBT, add this to your dependencies
```Scala
libraryDependencies += "com.google.cloud" % "google-cloud-dialogflow" % "2.4.3"
```

## Authentication

See the [Authentication][authentication] section in the base directory's README.

## Getting Started

### Prerequisites

You will need a [Google Cloud Platform Console][developer-console] project with the Dialogflow API [API enabled][enable-api].
You will need to [enable billing][enable-billing] to use Google Dialogflow API.
[Follow these instructions][create-project] to get your project set up. You will also need to set up the local development environment by
[installing the Google Cloud SDK][cloud-sdk] and running the following commands in command line:
`gcloud auth login` and `gcloud config set project [YOUR PROJECT ID]`.

### Installation and setup

You'll need to obtain the `google-cloud-dialogflow` library.  See the [Quickstart](#quickstart) section
to add `google-cloud-dialogflow` as a dependency in your code.

## About Dialogflow API


[Dialogflow API][product-docs] is an end-to-end, build-once deploy-everywhere development suite for creating conversational interfaces for websites, mobile applications, popular messaging platforms, and IoT devices. You can use it to build interfaces (such as chatbots and conversational IVR) that enable natural and rich interactions between your users and your business. Dialogflow Enterprise Edition users have access to Google Cloud Support and a service level agreement (SLA) for production deployments.

See the [Dialogflow API client library docs][javadocs] to learn how to
use this Dialogflow API Client Library.





## Samples

Samples are in the [`samples/`](https://github.com/googleapis/java-dialogflow/tree/master/samples) directory. The samples' `README.md`
has instructions for running the samples.

| Sample                      | Source Code                       | Try it |
| --------------------------- | --------------------------------- | ------ |
| Detect Intent Audio | [source code](https://github.com/googleapis/java-dialogflow/blob/master/samples/snippets/src/main/java/com/example/dialogflow/DetectIntentAudio.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-dialogflow&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/dialogflow/DetectIntentAudio.java) |
| Detect Intent Knowledge | [source code](https://github.com/googleapis/java-dialogflow/blob/master/samples/snippets/src/main/java/com/example/dialogflow/DetectIntentKnowledge.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-dialogflow&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/dialogflow/DetectIntentKnowledge.java) |
| Detect Intent Stream | [source code](https://github.com/googleapis/java-dialogflow/blob/master/samples/snippets/src/main/java/com/example/dialogflow/DetectIntentStream.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-dialogflow&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/dialogflow/DetectIntentStream.java) |
| Detect Intent Texts | [source code](https://github.com/googleapis/java-dialogflow/blob/master/samples/snippets/src/main/java/com/example/dialogflow/DetectIntentTexts.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-dialogflow&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/dialogflow/DetectIntentTexts.java) |
| Detect Intent With Location | [source code](https://github.com/googleapis/java-dialogflow/blob/master/samples/snippets/src/main/java/com/example/dialogflow/DetectIntentWithLocation.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-dialogflow&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/dialogflow/DetectIntentWithLocation.java) |
| Detect Intent With Sentiment Analysis | [source code](https://github.com/googleapis/java-dialogflow/blob/master/samples/snippets/src/main/java/com/example/dialogflow/DetectIntentWithSentimentAnalysis.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-dialogflow&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/dialogflow/DetectIntentWithSentimentAnalysis.java) |
| Detect Intent With Text To Speech Response | [source code](https://github.com/googleapis/java-dialogflow/blob/master/samples/snippets/src/main/java/com/example/dialogflow/DetectIntentWithTextToSpeechResponse.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-dialogflow&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/dialogflow/DetectIntentWithTextToSpeechResponse.java) |
| Document Management | [source code](https://github.com/googleapis/java-dialogflow/blob/master/samples/snippets/src/main/java/com/example/dialogflow/DocumentManagement.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-dialogflow&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/dialogflow/DocumentManagement.java) |
| Intent Management | [source code](https://github.com/googleapis/java-dialogflow/blob/master/samples/snippets/src/main/java/com/example/dialogflow/IntentManagement.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-dialogflow&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/dialogflow/IntentManagement.java) |
| Knowledge Base Management | [source code](https://github.com/googleapis/java-dialogflow/blob/master/samples/snippets/src/main/java/com/example/dialogflow/KnowledgeBaseManagement.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-dialogflow&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/dialogflow/KnowledgeBaseManagement.java) |



## Troubleshooting

To get help, follow the instructions in the [shared Troubleshooting document][troubleshooting].

## Transport

Dialogflow API uses gRPC for the transport layer.

## Java Versions

Java 7 or above is required for using this client.

## Versioning


This library follows [Semantic Versioning](http://semver.org/).


## Contributing


Contributions to this library are always welcome and highly encouraged.

See [CONTRIBUTING][contributing] for more information how to get started.

Please note that this project is released with a Contributor Code of Conduct. By participating in
this project you agree to abide by its terms. See [Code of Conduct][code-of-conduct] for more
information.

## License

Apache 2.0 - See [LICENSE][license] for more information.

## CI Status

Java Version | Status
------------ | ------
Java 7 | [![Kokoro CI][kokoro-badge-image-1]][kokoro-badge-link-1]
Java 8 | [![Kokoro CI][kokoro-badge-image-2]][kokoro-badge-link-2]
Java 8 OSX | [![Kokoro CI][kokoro-badge-image-3]][kokoro-badge-link-3]
Java 8 Windows | [![Kokoro CI][kokoro-badge-image-4]][kokoro-badge-link-4]
Java 11 | [![Kokoro CI][kokoro-badge-image-5]][kokoro-badge-link-5]

Java is a registered trademark of Oracle and/or its affiliates.

[product-docs]: https://cloud.google.com/dialogflow-enterprise/
[javadocs]: https://googleapis.dev/java/google-cloud-dialogflow/latest/
[kokoro-badge-image-1]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-dialogflow/java7.svg
[kokoro-badge-link-1]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-dialogflow/java7.html
[kokoro-badge-image-2]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-dialogflow/java8.svg
[kokoro-badge-link-2]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-dialogflow/java8.html
[kokoro-badge-image-3]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-dialogflow/java8-osx.svg
[kokoro-badge-link-3]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-dialogflow/java8-osx.html
[kokoro-badge-image-4]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-dialogflow/java8-win.svg
[kokoro-badge-link-4]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-dialogflow/java8-win.html
[kokoro-badge-image-5]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-dialogflow/java11.svg
[kokoro-badge-link-5]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-dialogflow/java11.html
[stability-image]: https://img.shields.io/badge/stability-ga-green
[maven-version-image]: https://img.shields.io/maven-central/v/com.google.cloud/google-cloud-dialogflow.svg
[maven-version-link]: https://search.maven.org/search?q=g:com.google.cloud%20AND%20a:google-cloud-dialogflow&core=gav
[authentication]: https://github.com/googleapis/google-cloud-java#authentication
[developer-console]: https://console.developers.google.com/
[create-project]: https://cloud.google.com/resource-manager/docs/creating-managing-projects
[cloud-sdk]: https://cloud.google.com/sdk/
[troubleshooting]: https://github.com/googleapis/google-cloud-common/blob/master/troubleshooting/readme.md#troubleshooting
[contributing]: https://github.com/googleapis/java-dialogflow/blob/master/CONTRIBUTING.md
[code-of-conduct]: https://github.com/googleapis/java-dialogflow/blob/master/CODE_OF_CONDUCT.md#contributor-code-of-conduct
[license]: https://github.com/googleapis/java-dialogflow/blob/master/LICENSE
[enable-billing]: https://cloud.google.com/apis/docs/getting-started#enabling_billing
[enable-api]: https://console.cloud.google.com/flows/enableapi?apiid=dialogflow.googleapis.com
[libraries-bom]: https://github.com/GoogleCloudPlatform/cloud-opensource-java/wiki/The-Google-Cloud-Platform-Libraries-BOM
[shell_img]: https://gstatic.com/cloudssh/images/open-btn.png
