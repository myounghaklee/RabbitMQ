# RabbitMQ

## Message Queue 란?
MQ는 목적지(target)이 현재 다른 연산 중이거나 연결되어 있지 않을때 message 임시저장소를 제공한다.
Producer, Broker, Consumer로 구성되어있으며 각 Application 간의 비동기 통신을 제공한다.

## RabbitMQ
원래는 AMQP(Advanced Message Queuing Protocol) 만 지원 했었지만 현재는 STOMP, MQTT, HTTP 통신도 지원한다.
* 메시지 브로커: RabbitMQ는 메시지 브로커로서 동작합니다. 이는 송신자와 수신자 간의 통신을 관리하고 중간에서 메시지를 라우팅 및 전달하는 역할을 합니다.
* AMQP 프로토콜: RabbitMQ는 AMQP(Advanced Message Queuing Protocol) 프로토콜을 사용하여 메시지 통신을 처리합니다. AMQP는 메시지 브로커와 클라이언트 간의 표준 통신 프로토콜로서, 다양한 프로그래밍 언어와 플랫폼에서 RabbitMQ와 통합할 수 있도록 해줍니다.
* 큐(Queues): RabbitMQ에서 메시지는 큐에 저장됩니다. 송신자가 메시지를 큐로 보내면, 수신자가 해당 큐로부터 메시지를 가져올 수 있습니다. 큐는 메시지의 버퍼 역할을 하며, 메시지의 순서를 관리하고, 다양한 큐 모델을 지원합니다.
* 교환(Exchanges): 교환은 메시지가 어떤 큐로 전달될지 결정하는 데 사용됩니다. 송신자는 메시지를 교환에게 보내며, 교환은 메시지를 적절한 큐에 라우팅합니다. RabbitMQ는 다양한 교환 유형을 지원하여 메시지 라우팅 규칙을 유연하게 정의할 수 있습니다.
* 바인딩(Bindings): 바인딩은 교환과 큐 간의 연결을 정의합니다. 바인딩은 교환이 어떤 큐로 메시지를 라우팅해야 하는지 결정합니다.
* 가상 호스트(Virtual Hosts): RabbitMQ는 가상 호스트를 사용하여 여러 개의 독립적인 메시지 브로커 인스턴스를 단일 RabbitMQ 서버에 호스팅할 수 있습니다. 각 가상 호스트는 격리되어 서로 영향을 주지 않습니다.
* 클러스터링(Clustering): RabbitMQ는 클러스터링을 지원하여 고가용성 및 확장성을 제공합니다. 클러스터는 여러 RabbitMQ 노드를 하나로 묶어 하나의 논리적 브로커처럼 동작하게 합니다.
* 다양한 클라이언트 라이브러리: RabbitMQ는 다양한 프로그래밍 언어를 지원하는 클라이언트 라이브러리를 제공하므로, 다양한 플랫폼 및 언어에서 RabbitMQ와 통합할 수 있습니다.


### 구성

![image](https://github.com/myounghaklee/WebRTC_zoom/assets/43670838/cd992fab-34c1-460e-a118-60720c6bda6c)


- Producer : 메세지를 보내는 역할을 한다. consumer에게 직접 보내진 않고 오직 broker에게 메세지를 보낸다.
- Consumer :  broker로부터 메세지를 읽는다
- Queue :  메세지를 저장하는 rabbitMQ 브로커의  버퍼, 저장소이다.  한번 메세지가 읽혀지면 queue로부터 제거된다.
- Message : producer -> consumer 에게 보내는 정보이다. 
- Exchange :  producer와 queue사이의 중개인 역할을 한다. producer는 queue로 메세지를 바로보내기전에 exchange로 보낸다.  exchange는 producer로 부터 받은 메세지를 여러 어떠한 규칙에 따라서 queue에 분배한다. 
- Routing key : 메세지fmf 어떻게 queue에 보낼지 결정하는 역할




