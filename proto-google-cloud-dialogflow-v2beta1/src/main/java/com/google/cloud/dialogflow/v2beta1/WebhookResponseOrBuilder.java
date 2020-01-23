/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/webhook.proto

package com.google.cloud.dialogflow.v2beta1;

public interface WebhookResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.WebhookResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The text to be shown on the screen. This value is passed directly
   * to `QueryResult.fulfillment_text`.
   * </pre>
   *
   * <code>string fulfillment_text = 1;</code>
   *
   * @return The fulfillmentText.
   */
  java.lang.String getFulfillmentText();
  /**
   *
   *
   * <pre>
   * Optional. The text to be shown on the screen. This value is passed directly
   * to `QueryResult.fulfillment_text`.
   * </pre>
   *
   * <code>string fulfillment_text = 1;</code>
   *
   * @return The bytes for fulfillmentText.
   */
  com.google.protobuf.ByteString getFulfillmentTextBytes();

  /**
   *
   *
   * <pre>
   * Optional. The collection of rich messages to present to the user. This
   * value is passed directly to `QueryResult.fulfillment_messages`.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent.Message fulfillment_messages = 2;</code>
   */
  java.util.List<com.google.cloud.dialogflow.v2beta1.Intent.Message> getFulfillmentMessagesList();
  /**
   *
   *
   * <pre>
   * Optional. The collection of rich messages to present to the user. This
   * value is passed directly to `QueryResult.fulfillment_messages`.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent.Message fulfillment_messages = 2;</code>
   */
  com.google.cloud.dialogflow.v2beta1.Intent.Message getFulfillmentMessages(int index);
  /**
   *
   *
   * <pre>
   * Optional. The collection of rich messages to present to the user. This
   * value is passed directly to `QueryResult.fulfillment_messages`.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent.Message fulfillment_messages = 2;</code>
   */
  int getFulfillmentMessagesCount();
  /**
   *
   *
   * <pre>
   * Optional. The collection of rich messages to present to the user. This
   * value is passed directly to `QueryResult.fulfillment_messages`.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent.Message fulfillment_messages = 2;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2beta1.Intent.MessageOrBuilder>
      getFulfillmentMessagesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. The collection of rich messages to present to the user. This
   * value is passed directly to `QueryResult.fulfillment_messages`.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent.Message fulfillment_messages = 2;</code>
   */
  com.google.cloud.dialogflow.v2beta1.Intent.MessageOrBuilder getFulfillmentMessagesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Optional. This value is passed directly to `QueryResult.webhook_source`.
   * </pre>
   *
   * <code>string source = 3;</code>
   *
   * @return The source.
   */
  java.lang.String getSource();
  /**
   *
   *
   * <pre>
   * Optional. This value is passed directly to `QueryResult.webhook_source`.
   * </pre>
   *
   * <code>string source = 3;</code>
   *
   * @return The bytes for source.
   */
  com.google.protobuf.ByteString getSourceBytes();

  /**
   *
   *
   * <pre>
   * Optional. This value is passed directly to `QueryResult.webhook_payload`.
   * See the related `fulfillment_messages[i].payload field`, which may be used
   * as an alternative to this field.
   * This field can be used for Actions on Google responses.
   * It should have a structure similar to the JSON message shown here. For more
   * information, see
   * [Actions on Google Webhook
   * Format](https://developers.google.com/actions/dialogflow/webhook)
   * &lt;pre&gt;{
   *   "google": {
   *     "expectUserResponse": true,
   *     "richResponse": {
   *       "items": [
   *         {
   *           "simpleResponse": {
   *             "textToSpeech": "this is a simple response"
   *           }
   *         }
   *       ]
   *     }
   *   }
   * }&lt;/pre&gt;
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 4;</code>
   *
   * @return Whether the payload field is set.
   */
  boolean hasPayload();
  /**
   *
   *
   * <pre>
   * Optional. This value is passed directly to `QueryResult.webhook_payload`.
   * See the related `fulfillment_messages[i].payload field`, which may be used
   * as an alternative to this field.
   * This field can be used for Actions on Google responses.
   * It should have a structure similar to the JSON message shown here. For more
   * information, see
   * [Actions on Google Webhook
   * Format](https://developers.google.com/actions/dialogflow/webhook)
   * &lt;pre&gt;{
   *   "google": {
   *     "expectUserResponse": true,
   *     "richResponse": {
   *       "items": [
   *         {
   *           "simpleResponse": {
   *             "textToSpeech": "this is a simple response"
   *           }
   *         }
   *       ]
   *     }
   *   }
   * }&lt;/pre&gt;
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 4;</code>
   *
   * @return The payload.
   */
  com.google.protobuf.Struct getPayload();
  /**
   *
   *
   * <pre>
   * Optional. This value is passed directly to `QueryResult.webhook_payload`.
   * See the related `fulfillment_messages[i].payload field`, which may be used
   * as an alternative to this field.
   * This field can be used for Actions on Google responses.
   * It should have a structure similar to the JSON message shown here. For more
   * information, see
   * [Actions on Google Webhook
   * Format](https://developers.google.com/actions/dialogflow/webhook)
   * &lt;pre&gt;{
   *   "google": {
   *     "expectUserResponse": true,
   *     "richResponse": {
   *       "items": [
   *         {
   *           "simpleResponse": {
   *             "textToSpeech": "this is a simple response"
   *           }
   *         }
   *       ]
   *     }
   *   }
   * }&lt;/pre&gt;
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 4;</code>
   */
  com.google.protobuf.StructOrBuilder getPayloadOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The collection of output contexts. This value is passed directly
   * to `QueryResult.output_contexts`.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context output_contexts = 5;</code>
   */
  java.util.List<com.google.cloud.dialogflow.v2beta1.Context> getOutputContextsList();
  /**
   *
   *
   * <pre>
   * Optional. The collection of output contexts. This value is passed directly
   * to `QueryResult.output_contexts`.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context output_contexts = 5;</code>
   */
  com.google.cloud.dialogflow.v2beta1.Context getOutputContexts(int index);
  /**
   *
   *
   * <pre>
   * Optional. The collection of output contexts. This value is passed directly
   * to `QueryResult.output_contexts`.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context output_contexts = 5;</code>
   */
  int getOutputContextsCount();
  /**
   *
   *
   * <pre>
   * Optional. The collection of output contexts. This value is passed directly
   * to `QueryResult.output_contexts`.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context output_contexts = 5;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2beta1.ContextOrBuilder>
      getOutputContextsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. The collection of output contexts. This value is passed directly
   * to `QueryResult.output_contexts`.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context output_contexts = 5;</code>
   */
  com.google.cloud.dialogflow.v2beta1.ContextOrBuilder getOutputContextsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Makes the platform immediately invoke another `DetectIntent` call
   * internally with the specified event as input.
   * When this field is set, Dialogflow ignores the `fulfillment_text`,
   * `fulfillment_messages`, and `payload` fields.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.EventInput followup_event_input = 6;</code>
   *
   * @return Whether the followupEventInput field is set.
   */
  boolean hasFollowupEventInput();
  /**
   *
   *
   * <pre>
   * Optional. Makes the platform immediately invoke another `DetectIntent` call
   * internally with the specified event as input.
   * When this field is set, Dialogflow ignores the `fulfillment_text`,
   * `fulfillment_messages`, and `payload` fields.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.EventInput followup_event_input = 6;</code>
   *
   * @return The followupEventInput.
   */
  com.google.cloud.dialogflow.v2beta1.EventInput getFollowupEventInput();
  /**
   *
   *
   * <pre>
   * Optional. Makes the platform immediately invoke another `DetectIntent` call
   * internally with the specified event as input.
   * When this field is set, Dialogflow ignores the `fulfillment_text`,
   * `fulfillment_messages`, and `payload` fields.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.EventInput followup_event_input = 6;</code>
   */
  com.google.cloud.dialogflow.v2beta1.EventInputOrBuilder getFollowupEventInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Indicates that this intent ends an interaction. Some integrations
   * (e.g., Actions on Google or Dialogflow phone gateway) use this information
   * to close interaction with an end user. Default is false.
   * </pre>
   *
   * <code>bool end_interaction = 8;</code>
   *
   * @return The endInteraction.
   */
  boolean getEndInteraction();

  /**
   *
   *
   * <pre>
   * Optional. Additional session entity types to replace or extend developer
   * entity types with. The entity synonyms apply to all languages and persist
   * for the session of this query. Setting the session entity types inside
   * webhook overwrites the session entity types that have been set through
   * `DetectIntentRequest.query_params.session_entity_types`.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SessionEntityType session_entity_types = 10;
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.v2beta1.SessionEntityType> getSessionEntityTypesList();
  /**
   *
   *
   * <pre>
   * Optional. Additional session entity types to replace or extend developer
   * entity types with. The entity synonyms apply to all languages and persist
   * for the session of this query. Setting the session entity types inside
   * webhook overwrites the session entity types that have been set through
   * `DetectIntentRequest.query_params.session_entity_types`.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SessionEntityType session_entity_types = 10;
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.SessionEntityType getSessionEntityTypes(int index);
  /**
   *
   *
   * <pre>
   * Optional. Additional session entity types to replace or extend developer
   * entity types with. The entity synonyms apply to all languages and persist
   * for the session of this query. Setting the session entity types inside
   * webhook overwrites the session entity types that have been set through
   * `DetectIntentRequest.query_params.session_entity_types`.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SessionEntityType session_entity_types = 10;
   * </code>
   */
  int getSessionEntityTypesCount();
  /**
   *
   *
   * <pre>
   * Optional. Additional session entity types to replace or extend developer
   * entity types with. The entity synonyms apply to all languages and persist
   * for the session of this query. Setting the session entity types inside
   * webhook overwrites the session entity types that have been set through
   * `DetectIntentRequest.query_params.session_entity_types`.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SessionEntityType session_entity_types = 10;
   * </code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2beta1.SessionEntityTypeOrBuilder>
      getSessionEntityTypesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. Additional session entity types to replace or extend developer
   * entity types with. The entity synonyms apply to all languages and persist
   * for the session of this query. Setting the session entity types inside
   * webhook overwrites the session entity types that have been set through
   * `DetectIntentRequest.query_params.session_entity_types`.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SessionEntityType session_entity_types = 10;
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.SessionEntityTypeOrBuilder getSessionEntityTypesOrBuilder(
      int index);
}
