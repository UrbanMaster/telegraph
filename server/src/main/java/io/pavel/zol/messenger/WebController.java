package io.pavel.zol.messenger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    Logger log = LoggerFactory.getLogger(WebController.class);

    @PostMapping("/api/v1/message/send")
    public void sendMessage(@RequestBody SendMessageDto sendMessageDto) {
        log.info(sendMessageDto.text());
    }
}
