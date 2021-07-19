package com.buit.his.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by sg on 2021/4/14.
 */
@XmlRootElement(name="Prescriptions")
public class PackMedSendXml implements Serializable {
    private static final long serialVersionUID = -1405788706727502853L;
    private List<PackMedSendReqXml> list;

    public List<PackMedSendReqXml> getList() {
        return list;
    }
    @XmlElement(name="Prescription")
    public void setList(List<PackMedSendReqXml> list) {
        this.list = list;
    }
}
