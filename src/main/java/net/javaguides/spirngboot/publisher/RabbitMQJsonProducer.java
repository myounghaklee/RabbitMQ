package net.javaguides.spirngboot.publisher;


import lombok.RequiredArgsConstructor;

import net.javaguides.spirngboot.dto.User;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RabbitMQJsonProducer {

    private String exchange;

    private String routingJsonKey;

    private RabbitTemplate rabbitTemplate;

    private void sendJsonMessage(User user){}


}
