package org.mpei.HomeWork_9.Version_1.ParticipantBehavior;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;
import lombok.extern.slf4j.Slf4j;

import java.util.Random;

@Slf4j
public class SendAnswer extends OneShotBehaviour {
    /**
     * Поведение агента-участника для отправки ответного сообщения агенту-инициатору, после того как сообщение
     * о начале аукциона было получено.
     * Отправляет одно из трех возможных сообщений:
     * - ставка >0;
     * - ставка <0;
     * - игнорирование аукциона;
     * <p>
     * Ставки выбираются случайным образом. Если ставка агента-участника оказалась >0, то
     * он будет ждать ответного сообщения от агента-инициатора, чтобы понять, победил он в аукционе или нет.
     */
    private int val; //Флаг для дальнейшего вызова поведений в классе FSM-поведения агента-участника

    @Override
    public void action() {

        ACLMessage message = new ACLMessage(ACLMessage.PROPOSE); //Создание сообщения типа ACLMessage.PROPOSE
        message.addReceiver(new AID("Initiator", false)); //Добавление адресата - агента-инициатора

        val = randomAnswer();
        switch (val) {
            case (0):
                log.info("Цена >0 " + myAgent.getLocalName());
                double recIntP = randomPositiv();
                message.setContent(String.valueOf(recIntP)); //Добавление цены в сообщение
                break;
            case (1):
                log.info("Цена <0 " + myAgent.getLocalName());
                double recIntN = randNegativ();
                message.setContent(String.valueOf(recIntN));
                break;
            case (2):
                log.info("Не отвечаю! " + myAgent.getLocalName());
                message.setContent("666");
                break;
        }
        myAgent.send(message); //Отправка сообщения
    }

    @Override
    public int onEnd() { //Метод, вызываем при окончании поведения
        if (val == 0) { //Проверка условия, что агент-участник предложил ставку >0
            return 1; //Возвращает 1, если агент-участник предлагает цену >0
        } else {
            return 0; //Возвращает 0, если агент-участник предлагает цену <0 или не участвует в аукционе
        }
    }

    public int randomAnswer() { //Метод для случайного выбора значений (0, 1, 2), чтобы определить, какой ответ агент-участник даст на сообщении о начале аукциона
        Random random = new Random();
        int tInt = random.nextInt(3);
        return tInt;
    }

    public double randNegativ() { //Выбор отрицательной цены случайным образом
        return (new Random()).nextDouble(101) - 100;
    }

    public double randomPositiv() { //Выбор положительной цены случайным образом
        return (new Random()).nextDouble(101);
    }
}
