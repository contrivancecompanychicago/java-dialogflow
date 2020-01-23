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
// source: google/cloud/dialogflow/v2beta1/session.proto

package com.google.cloud.dialogflow.v2beta1;

public interface StreamingDetectIntentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the session the query is sent to.
   * Format of the session name:
   * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;`, or
   * `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User
   * ID&gt;/sessions/&lt;Session ID&gt;`. If `Environment ID` is not specified, we assume
   * default 'draft' environment. If `User ID` is not specified, we are using
   * "-". It's up to the API caller to choose an appropriate `Session ID` and
   * `User Id`. They can be a random number or some type of user and session
   * identifiers (preferably hashed). The length of the `Session ID` and
   * `User ID` must not exceed 36 characters.
   * </pre>
   *
   * <code>string session = 1;</code>
   *
   * @return The session.
   */
  java.lang.String getSession();
  /**
   *
   *
   * <pre>
   * Required. The name of the session the query is sent to.
   * Format of the session name:
   * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;`, or
   * `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User
   * ID&gt;/sessions/&lt;Session ID&gt;`. If `Environment ID` is not specified, we assume
   * default 'draft' environment. If `User ID` is not specified, we are using
   * "-". It's up to the API caller to choose an appropriate `Session ID` and
   * `User Id`. They can be a random number or some type of user and session
   * identifiers (preferably hashed). The length of the `Session ID` and
   * `User ID` must not exceed 36 characters.
   * </pre>
   *
   * <code>string session = 1;</code>
   *
   * @return The bytes for session.
   */
  com.google.protobuf.ByteString getSessionBytes();

  /**
   *
   *
   * <pre>
   * Optional. The parameters of this query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.QueryParameters query_params = 2;</code>
   *
   * @return Whether the queryParams field is set.
   */
  boolean hasQueryParams();
  /**
   *
   *
   * <pre>
   * Optional. The parameters of this query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.QueryParameters query_params = 2;</code>
   *
   * @return The queryParams.
   */
  com.google.cloud.dialogflow.v2beta1.QueryParameters getQueryParams();
  /**
   *
   *
   * <pre>
   * Optional. The parameters of this query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.QueryParameters query_params = 2;</code>
   */
  com.google.cloud.dialogflow.v2beta1.QueryParametersOrBuilder getQueryParamsOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The input specification. It can be set to:
   * 1.  an audio config which instructs the speech recognizer how to process
   *     the speech audio,
   * 2.  a conversational query in the form of text, or
   * 3.  an event that specifies which intent to trigger.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.QueryInput query_input = 3;</code>
   *
   * @return Whether the queryInput field is set.
   */
  boolean hasQueryInput();
  /**
   *
   *
   * <pre>
   * Required. The input specification. It can be set to:
   * 1.  an audio config which instructs the speech recognizer how to process
   *     the speech audio,
   * 2.  a conversational query in the form of text, or
   * 3.  an event that specifies which intent to trigger.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.QueryInput query_input = 3;</code>
   *
   * @return The queryInput.
   */
  com.google.cloud.dialogflow.v2beta1.QueryInput getQueryInput();
  /**
   *
   *
   * <pre>
   * Required. The input specification. It can be set to:
   * 1.  an audio config which instructs the speech recognizer how to process
   *     the speech audio,
   * 2.  a conversational query in the form of text, or
   * 3.  an event that specifies which intent to trigger.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.QueryInput query_input = 3;</code>
   */
  com.google.cloud.dialogflow.v2beta1.QueryInputOrBuilder getQueryInputOrBuilder();

  /**
   *
   *
   * <pre>
   * DEPRECATED. Please use [InputAudioConfig.single_utterance][google.cloud.dialogflow.v2beta1.InputAudioConfig.single_utterance] instead.
   * Optional. If `false` (default), recognition does not cease until the
   * client closes the stream.
   * If `true`, the recognizer will detect a single spoken utterance in input
   * audio. Recognition ceases when it detects the audio's voice has
   * stopped or paused. In this case, once a detected intent is received, the
   * client should close the stream and start a new request with a new stream as
   * needed.
   * This setting is ignored when `query_input` is a piece of text or an event.
   * </pre>
   *
   * <code>bool single_utterance = 4;</code>
   *
   * @return The singleUtterance.
   */
  boolean getSingleUtterance();

  /**
   *
   *
   * <pre>
   * Optional. Instructs the speech synthesizer how to generate the output
   * audio. If this field is not set and agent-level speech synthesizer is not
   * configured, no output audio is generated.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.OutputAudioConfig output_audio_config = 5;</code>
   *
   * @return Whether the outputAudioConfig field is set.
   */
  boolean hasOutputAudioConfig();
  /**
   *
   *
   * <pre>
   * Optional. Instructs the speech synthesizer how to generate the output
   * audio. If this field is not set and agent-level speech synthesizer is not
   * configured, no output audio is generated.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.OutputAudioConfig output_audio_config = 5;</code>
   *
   * @return The outputAudioConfig.
   */
  com.google.cloud.dialogflow.v2beta1.OutputAudioConfig getOutputAudioConfig();
  /**
   *
   *
   * <pre>
   * Optional. Instructs the speech synthesizer how to generate the output
   * audio. If this field is not set and agent-level speech synthesizer is not
   * configured, no output audio is generated.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.OutputAudioConfig output_audio_config = 5;</code>
   */
  com.google.cloud.dialogflow.v2beta1.OutputAudioConfigOrBuilder getOutputAudioConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The input audio content to be recognized. Must be sent if
   * `query_input` was set to a streaming input audio config. The complete audio
   * over all streaming messages must not exceed 1 minute.
   * </pre>
   *
   * <code>bytes input_audio = 6;</code>
   *
   * @return The inputAudio.
   */
  com.google.protobuf.ByteString getInputAudio();
}
