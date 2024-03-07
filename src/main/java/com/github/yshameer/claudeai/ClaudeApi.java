package com.github.yshameer.claudeai;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClaudeApi {
    public static final Double DEFAULT_TEMPERATURE = 0.3;
    public static final Integer MAX_TOKENS_TO_SAMPLE = 1024;

    public final static String CLAUDE_3_SONNET = "claude-3-sonnet-20240229";

    private final ClaudeInterface claudeInterface;

    public ClaudeApi(ClaudeInterface claudeInterface) {
        this.claudeInterface = claudeInterface;
    }

    public ClaudeMessageResponse getClaudeMessageResponse(String prompt) {
        ClaudeMessageRequest request = new ClaudeMessageRequest(
                CLAUDE_3_SONNET,
                "",
                MAX_TOKENS_TO_SAMPLE,
                DEFAULT_TEMPERATURE,
                List.of(new ClaudeMessageRequest.Message("user", prompt))
        );
        return claudeInterface.getMessageResponse(request);
    }

}
