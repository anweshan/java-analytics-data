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
// source: google/analytics/data/v1alpha/data.proto

package com.google.analytics.data.v1alpha;

public interface FunnelResponseMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.FunnelResponseMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * If funnel report results are
   * [sampled](https://support.google.com/analytics/answer/2637192), this
   * describes what percentage of events were used in this funnel report. One
   * `samplingMetadatas` is populated for each date range. Each
   * `samplingMetadatas` corresponds to a date range in order that date ranges
   * were specified in the request.
   * However if the results are not sampled, this field will not be defined.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.SamplingMetadata sampling_metadatas = 1;</code>
   */
  java.util.List<com.google.analytics.data.v1alpha.SamplingMetadata> getSamplingMetadatasList();
  /**
   *
   *
   * <pre>
   * If funnel report results are
   * [sampled](https://support.google.com/analytics/answer/2637192), this
   * describes what percentage of events were used in this funnel report. One
   * `samplingMetadatas` is populated for each date range. Each
   * `samplingMetadatas` corresponds to a date range in order that date ranges
   * were specified in the request.
   * However if the results are not sampled, this field will not be defined.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.SamplingMetadata sampling_metadatas = 1;</code>
   */
  com.google.analytics.data.v1alpha.SamplingMetadata getSamplingMetadatas(int index);
  /**
   *
   *
   * <pre>
   * If funnel report results are
   * [sampled](https://support.google.com/analytics/answer/2637192), this
   * describes what percentage of events were used in this funnel report. One
   * `samplingMetadatas` is populated for each date range. Each
   * `samplingMetadatas` corresponds to a date range in order that date ranges
   * were specified in the request.
   * However if the results are not sampled, this field will not be defined.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.SamplingMetadata sampling_metadatas = 1;</code>
   */
  int getSamplingMetadatasCount();
  /**
   *
   *
   * <pre>
   * If funnel report results are
   * [sampled](https://support.google.com/analytics/answer/2637192), this
   * describes what percentage of events were used in this funnel report. One
   * `samplingMetadatas` is populated for each date range. Each
   * `samplingMetadatas` corresponds to a date range in order that date ranges
   * were specified in the request.
   * However if the results are not sampled, this field will not be defined.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.SamplingMetadata sampling_metadatas = 1;</code>
   */
  java.util.List<? extends com.google.analytics.data.v1alpha.SamplingMetadataOrBuilder>
      getSamplingMetadatasOrBuilderList();
  /**
   *
   *
   * <pre>
   * If funnel report results are
   * [sampled](https://support.google.com/analytics/answer/2637192), this
   * describes what percentage of events were used in this funnel report. One
   * `samplingMetadatas` is populated for each date range. Each
   * `samplingMetadatas` corresponds to a date range in order that date ranges
   * were specified in the request.
   * However if the results are not sampled, this field will not be defined.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.SamplingMetadata sampling_metadatas = 1;</code>
   */
  com.google.analytics.data.v1alpha.SamplingMetadataOrBuilder getSamplingMetadatasOrBuilder(
      int index);
}
