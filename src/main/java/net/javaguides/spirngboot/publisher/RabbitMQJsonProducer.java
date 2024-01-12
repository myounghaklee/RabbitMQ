package net.javaguides.spirngboot.publisher;


import lombok.RequiredArgsConstructor;

import lombok.extern.slf4j.Slf4j;
import net.javaguides.spirngboot.dto.User;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class RabbitMQJsonProducer {

    @Value("${rabbitmq.exchange.name}")
    private String exchange;

    @Value("${rabbitmq.routing.json.key}")
    private String routingJsonKey;


    private RabbitTemplate rabbitTemplate;

    public void sendJsonMessage(User user){
        log.info(String.format("Json message sent ->{}", user.toString()));
        rabbitTemplate.convertAndSend(exchange, routingJsonKey, user);
    }


}
