//package com.gch.yunpan;
//
//import org.apache.kafka.clients.consumer.ConsumerRecord;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Component;
//
//@Component
//public class consumer {
//
//    @KafkaListener(topics = "test")
//    public void listen(ConsumerRecord<?, ?> record) throws Exception {
//        System.out.println("---------- 接收到kafka消息：" + record.value() + " ----------");
//    }
//
//}