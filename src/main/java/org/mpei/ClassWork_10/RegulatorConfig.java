package org.mpei.ClassWork_10;

import lombok.Data;

import javax.xml.bind.annotation.*;

@Data
@XmlRootElement(name = "cfg")
@XmlAccessorType(XmlAccessType.FIELD)
public class RegulatorConfig {
    @XmlElement(name = "info")
    private RegulatorInfo regulatorInfo;
    @XmlElement
    private double minQ;
    @XmlElement
    private double maxQ;
    @XmlElement(name = "corfficients")
    private Coefs coefs;
}
