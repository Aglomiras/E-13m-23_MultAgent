package org.mpei.HomeWork_9.Version_1.ParticipantBehavior;

import jade.core.AID;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;
import lombok.extern.slf4j.Slf4j;

import java.util.Random;

@Slf4j
public class SendContract extends OneShotBehaviour {
    /**
     * Поведение агента-участника, вызываемое, после получения агентом-участником сообщения
     * от агента-инициатора, о том что агент-участник победил.
     * В данном поведении принимается решение агента-участника будет ли он заключать контракт или нет.
     */
    private int val; //Хранит код ответа агента-участника (для последующей отправки сообщения агенту-инициатору)

    public SendContract() {
    }

    @Override
    public void action() {
        ACLMessage message = new ACLMessage(ACLMessage.CFP); //Создание сообщения типа ACLMessage.CFP
        message.addReceiver(new AID("Initiator", false)); //Добавление адресата агента-инициатора

        val = randomContract();
        switch (val) {
            case (0):
                log.info("Отказ от контракта! " + myAgent.getLocalName());
                message.setContent("No"); //Отправка отказа от контракта
                break;
            case (1):
                log.info("Согласие на контракт! " + myAgent.getLocalName());
                message.setContent("Yes"); //Отправка согласия на заключение контракта
                break;
            case (2):
                log.info("Игнорирование... " + myAgent.getLocalName());
                message.setContent("Игнорирование... "); //Игнорирование
                break;
        }
        myAgent.send(message);
    }

    public int randomContract() { //Метод для случайного выбора действия агента-участника
        Random random = new Random();
        int tInt = random.nextInt(3);
        return tInt;
    }

    @Override
    public int onEnd() { //Метод, вызываемый при окончании поведения
        if (val == 1) {
            return 1; //Вернет 1, если агент-участник согласен заключить контракт
        } else {
            return 0; //Вернет 0, если агент-участник НЕ согласен заключать контракт
        }
    }
}
