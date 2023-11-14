package org.mpei.HomeWork_9.Version_1.InitiatorBehavior;

import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;

public class ReceiveAcceptSubBehInt extends Behaviour {
    /**
     * Поведение агента-инициатора, которое принимает сообщение типа ACLMessage.CFP от агента-участника.
     * В этом сообщении хранится ответ агента-участника, будет он заключать контракт или нет.
     * После получения ответа, вызывается конечный метод, где возвращается соответствующее число.
     */
    private boolean resive = false; //Флаг для окончания поведения
    private boolean agred = false; //Флаг по получению утвердительного ответа от агента-участника о заключении контракта

    @Override
    public void action() {
        ACLMessage agr = myAgent.receive(MessageTemplate.MatchPerformative(ACLMessage.CFP)); //Получение сообщения типа ACLMessage.CFP
        if (agr != null) {
            resive = true;
            String answer = agr.getContent();
            if (answer.equals("Yes")) { //Агент-участник согласен на контракт
                agred = true;
            }
            if (answer.equals("No")) { //Агент-участник не согласен на контракт
                agred = false;
            }
        } else {
            block();
        }
    }

    @Override
    public boolean done() {
        return resive;
    }

    @Override
    public int onEnd() {
        if (agred) { //Если агент-победитель согласен на контракт
            return 1; //Вернется 1
        } else { //Если не согласен
            return 0; //Вернется 0
        }
    }
}
