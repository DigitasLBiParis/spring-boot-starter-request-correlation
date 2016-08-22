/**
 * Copyright (c) 2015 the original author or authors
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.saliman.spring.request.correlation.filter;

import net.saliman.spring.request.correlation.api.RequestCorrelation;

/**
 * Base implementation of {@link RequestCorrelation}.
 *
 * @author Jakub Narloch
 */
public final class DefaultRequestCorrelation implements RequestCorrelation {

    /**
     * The actual request correlation id.
     */
    private final String sessionId;

    private final String requestId;

    /**
     * Creates new instance of {@link DefaultRequestCorrelation} class.
     *
     * @param sessionId the session id
     * @param requestId the request id
     */
    public DefaultRequestCorrelation(String sessionId, String requestId) {
        this.sessionId = sessionId;
        this.requestId = requestId;
    }

    /**
     * Retrieves the request identifier.
     *
     * @return the request identifier
     */
    @Override
    public String getSessionId() {
        return sessionId;
    }
    /**
     * Retrieves the request identifier.
     *
     * @return the request identifier
     */
    @Override
    public String getRequestId() {
        return requestId;
    }
}
