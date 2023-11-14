package org.mpei.HomeWork_9.Version_1.InitiatorBehavior;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Data
@Slf4j
public class ReceiveProposesSubBehInit extends Behaviour {
    /**
     * Поведение агента-инициатора для определения победителя аукциона.
     * Агент-участник, чья цена окажется лучшей, становится победителем, остальные агенты-участники становятся проигравшими.
     */
    private List<String> loseAgent = List.of("PartAgent1", "PartAgent2", "PartAgent3"); //Лист, содержащий всех агентов-участников
    private String winAgent; //Содержит имя агента, победившего в аукционе
    private List<ACLMessage> answer = new ArrayList<>(); //Список, содержащий, полученные сообщения
    private final int participantsCount; //Содержит количество агентов-участников
    private ACLMessage bestOffer = null; //Переменная для хранения сообщения победителя
    private Double bestPrice = null; //Хранит промежуточные значения предлагаемых цен
    private MessageTemplate messageTemplate; //Переменная, содержащая тип получаемого сообщения

    public ReceiveProposesSubBehInit(int participantsCount) {
        this.participantsCount = participantsCount;
    }

    @Override
    public void onStart() { //Метод, вызываемый при старте поведения
        this.messageTemplate = MessageTemplate.MatchPerformative(ACLMessage.PROPOSE); //Задаем тип, получаемого сообщения
    }

    @Override
    public void action() {
        ACLMessage propose = myAgent.receive(messageTemplate);
        if (propose != null) {

            answer.add(propose);
            String stringPrice = propose.getContent();
            double price = -1;

            try {
                price = Double.parseDouble(stringPrice); //Содержит предлагаемую цену от агента-участника
            } catch (NumberFormatException e) {
                log.warn("NumberFormatException " + propose.getSender().getLocalName());
            }
            if (price != 666) { //Проверка, если содержимое сообщения = 666, то агент-участник игнорирует данный аукцион
                if (price > 0 && (bestPrice == null || price < bestPrice)) {
                    bestPrice = price; //Записывает цену, предлагаемую победителем
                    bestOffer = propose; //Переопределяет сообщение от агента-участника, победившего в аукционе
                    winAgent = propose.getSender().getLocalName(); //Переопределяет имя агента-участника, победившего в аукционе
                }
            } else {
                block();
            }
        } else {
            block();
        }
    }

    @Override
    public boolean done() {
        return participantsCount == answer.size();
    }

    @Override
    public int onEnd() {
        return bestOffer == null ? 0 : 1; //Если сообщений не поступало, вернет 0, если было получено хотя бы одно сообщение, вернет 1
    }
}
