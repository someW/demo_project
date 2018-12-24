package com.rabbit;

import java.io.IOException;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Consumer;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;

public class Customer {
	 private final static String QUEUE_NAME = "hello";  
	  
	    public static void main(String[] argv) throws Exception {  
        // �������ӹ���  
        ConnectionFactory factory = new ConnectionFactory();  
        //����RabbitMQ��ַ  
        factory.setHost("192.168.126.130");
        factory.setPassword("admin");
        factory.setUsername("admin");
        factory.setPort(5672);
        //����һ���µ�����  
        Connection connection = factory.newConnection();  
        //����һ��Ƶ��  
        Channel channel = connection.createChannel();  
        //����Ҫ��ע�Ķ��� -- ��RabbitMQ�У������������ݵ��Եģ�һ���ݵȲ������ص�����������ִ����������Ӱ�����һ��ִ�е�Ӱ����ͬ����Ҳ����˵����������ڣ��ʹ�����������ڣ�������Ѿ����ڵĶ��в����κ�Ӱ�졣  
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);  
        System.out.println("C [*] Waiting for messages. To exit press CTRL+C");  
        /* DefaultConsumer��ʵ����Consumer�ӿڣ�ͨ������һ��Ƶ����
         * ���߷�����������Ҫ�Ǹ�Ƶ������Ϣ�����Ƶ��������Ϣ��
         * �ͻ�ִ�лص�����handleDelivery  
         */
        Consumer consumer = new DefaultConsumer(channel) {  
            @Override  
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {  
                String message = new String(body, "UTF-8");  
                System.out.println("C [x] Received '" + message + "'");  
            }  
        };  
        //�Զ��ظ�����Ӧ�� -- RabbitMQ�е���Ϣȷ�ϻ��ƣ������½ڻ���ϸ����  
        channel.basicConsume(QUEUE_NAME, true, consumer);  
    }  
}