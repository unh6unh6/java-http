package org.apache.coyote.http11.handle;

import org.apache.coyote.http11.request.HttpMethod;
import org.apache.coyote.http11.request.HttpRequest;

public record HttpHandlerCondition(
        HttpMethod method,
        String uri
) {

    public static HttpHandlerCondition from(final HttpRequest request) {
        return new HttpHandlerCondition(
                request.method(),
                request.uri()
        );
    }
}
