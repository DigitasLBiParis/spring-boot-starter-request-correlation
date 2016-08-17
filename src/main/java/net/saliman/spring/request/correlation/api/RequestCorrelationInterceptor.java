/**
 * Copyright (c) 2015 the original author or authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.saliman.spring.request.correlation.api;

/**
 * An interceptor that can be used for
 *
 * @author Jakub Narloch
 */
public interface RequestCorrelationInterceptor {

    /**
     * Callback method called whenever the correlation id has been assigned for the current request. No matter whether
     * it has set from the request header or a new id has been generated for incoming request.
     *
     * @param sessionId the session id
     * @param requestId the request id
     */
    void afterCorrelationIdSet(String sessionId, String requestId);

    /**
     * Callback method called after filter chain has completed.
     *
     * @param sessionId the session id
     * @param requestId the request id
     */
    void cleanUp(String sessionId, String requestId);
}
