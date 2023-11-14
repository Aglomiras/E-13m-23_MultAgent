package org.mpei.HomeWork_9.Version_1.ParticipantBehavior;

import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WaitForInivite extends Behaviour {
    /**
     * Поведение агента-участника, оповещающее о получении сообщения от агента-иницатора
     * о начале аукциона
     */
    private boolean res = false; //Флажок для прекращения поведения, после получения сообщения
    private MessageTemplate messageTemplate; //Переменная, хранящая тип получаемого сообщения

    @Override
    public void onStart() { //Метод, вызываемый при запуске поведения (вызывается первым)
        this.messageTemplate = MessageTemplate.MatchPerformative(ACLMessage.FAILURE); //Обозначение типа принимаемых сообщений
    }

    @Override
    public void action() {
        ACLMessage receive = myAgent.receive(messageTemplate); //Принятие сообщения (прослушивание канала)
        if (receive != null) { //Проверка, не пустое ли сообщение пришло
            log.info("Предложение доставлено! " + myAgent.getLocalName());
            res = true; //Прекращает поведение
        } else {
            block();
        }
    }

    @Override
    public boolean done() {
        return res;
    }
}
