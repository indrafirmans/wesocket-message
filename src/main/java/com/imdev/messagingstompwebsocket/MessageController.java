package com.imdev.messagingstompwebsocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class MessageController {


	@MessageMapping("/send-message")
	@SendTo("/topic/send-message")
	public MessageResponse message(MessageRequest message) throws Exception {
		return new MessageResponse(HtmlUtils.htmlEscape(message.getName()));
	}

}
