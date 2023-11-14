package org.mpei.HomeWork_9.Version_1.InitiatorBehavior;

import jade.core.AID;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Data
@Slf4j
public class SendContract extends OneShotBehaviour {
    /**
     * Поведение агента-инициатора для отправки сообщения агентам-участникам о том, что они победили/проиграли.
     * Если отправляется сообщению победителю, то ожидается ответ о заключении контракта.
     */
    private String nameAgent; //Хранит имя победителя
    private List<String> nameAgents; //Хранит имена всех агентов-участников

    public SendContract(String nameAgent, List<String> nameAgents) { //Конструктор
        this.nameAgent = nameAgent;
        this.nameAgents = nameAgents;
    }

    @Override
    public void action() {
        ACLMessage message = new ACLMessage(ACLMessage.AGREE); //Формирование сообщения победителю
        message.setContent("Вы победили!");
        message.addReceiver(new AID(nameAgent, false));
        myAgent.send(message); //Отправка сообщения победителю

        ACLMessage message1 = new ACLMessage(ACLMessage.REJECT_PROPOSAL); //Формирование сообщения проигравшим
        message1.setContent("Вы проиграли!");
        for (int i = 0; i < nameAgents.size(); i++) {
            if (!nameAgents.get(i).equals(nameAgent)) {
                message.addReceiver(new AID(nameAgents.get(i), false));
            }
        }
        myAgent.send(message1); //Отправка сообщения проигравшим
    }
}
