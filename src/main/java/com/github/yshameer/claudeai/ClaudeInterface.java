package com.github.yshameer.claudeai;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;

@HttpExchange("/v1")
public interface ClaudeInterface {
    @PostExchange("/messages")
    ClaudeMessageResponse getMessageResponse(@RequestBody ClaudeMessageRequest request);
}
