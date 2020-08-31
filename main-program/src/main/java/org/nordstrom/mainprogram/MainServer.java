package org.nordstrom.mainprogram;

import org.nordstrom.sortingalgorithms.InsertionSort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class MainServer implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        sendMessage("Hi Welcome to Spring For Apache Kafka");
    }

    public static void main(String[] args) {
        SpringApplication.run(MainServer.class, args);
    }
    /*
    public static void main(String[] args) {
        System.out.println("Program is started.");

        int[] list = { 15, 2, 3, 20, 9, 6, 1, 16 };

        System.out.println("This program will sort following list");
        for (int val : list) {
            System.out.print(val + ", ");
        }
        System.out.println();
        System.out.println("sorting...");
        InsertionSort.sort(list);

        System.out.println("List is sorted: ");

        for (int val : list) {
            System.out.print(val + ", ");
        }


        System.out.println();
        System.out.println("Program finished.");
    }*/

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String msg) {
        kafkaTemplate.send("Kafka_Example", msg);
    }
}
