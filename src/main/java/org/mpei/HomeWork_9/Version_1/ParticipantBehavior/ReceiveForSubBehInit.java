package org.mpei.HomeWork_9.Version_1.ParticipantBehavior;

import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;
import lombok.Data;

@Data
public class ReceiveForSubBehInit extends Behaviour {
    /**
     * Поведение по принятию сообщений от агента-инициатора, оповещающее о том, что агент-участник является либо победителем,
     * либо проигравшим.
     * При принятии ненулевого сообщения, заканчивает поведение и возвращает через конечное поведение либо 1, либо 0.
     * 1 - агент-участник, получивший данное сообщение, является победителем данного аукциона;
     * 0 - агент-участник, получивший данное сообщение, является проигравшим данного аукциона;
     */
    private String winAgent; //Хранит имя агента-победителя
    private boolean agres = false; //Флаг о получении сообщения-победителя
    private boolean recivers = false; //Флаг, подсказывающий, когда надо закончить поведение
    private boolean refreser = false; //Флаг о получении сообщения-проигравшего

    @Override
    public void action() {
        ACLMessage agr = myAgent.receive(MessageTemplate.MatchPerformative(ACLMessage.AGREE)); //Получает сообщения типа ACLMessage.AGREE
        ACLMessage ref = myAgent.receive(MessageTemplate.MatchPerformative(ACLMessage.REJECT_PROPOSAL)); //Получает сообщения типа ACLMessage.REJECT_PROPOSAL

        if (agr != null) { //Если сообщение типа ACLMessage.AGREE не нулевое, то агент-участник является победителем
            recivers = true; //Заканчивает данное поведение у конкретного агента-участника
            agres = true; //Передает в конечный метод булевое значение, чтобы вернуть соответствующее значение (1)
            this.winAgent = agr.getSender().getLocalName(); //Записывает агента-участника, победившего в аукционе
        } else if (ref != null) { //Проверка, не пусто ли сообщение типа ACLMessage.REJECT_PROPOSAL
            recivers = true; //Заканчивает поведение, если прило сообщение с оповещением о проигрыше
            refreser = true; //Передает в конечный метод булевое значение, чтобы вернуть соответствующее значение (0)
        } else {
            block(); //Блокировка
        }
    }

    @Override
    public boolean done() {
        return recivers; //Если true - поведение закончится
    }

    @Override
    public int onEnd() {
        if (agres) {
            return 1; //Агент-участник - победитель
        } else {
            return 0; //Агент-участник - проигравший
        }
    }
}
