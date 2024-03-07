package com.github.yshameer;

import com.github.yshameer.claudeai.ClaudeApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
    ClaudeApi claudeApi;

    public HomeController(ClaudeApi claudeApi){
         this.claudeApi = claudeApi;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Welcome to the chatbot!";
    }


    @PostMapping(
            value = "/chatCompletion"
    )
    public @ResponseBody String getChatCompletion(@RequestParam("question") String question) {
        return claudeApi.getClaudeMessageResponse(question).content().getFirst().text();
    }

}
