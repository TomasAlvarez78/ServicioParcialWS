
package ar.edu.ubp.das.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.5.6
 * Tue Nov 14 20:55:46 ART 2023
 * Generated source version: 3.5.6
 */

@XmlRootElement(name = "getTiposServiciosResponse", namespace = "http://ws.das.ubp.edu.ar/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTiposServiciosResponse", namespace = "http://ws.das.ubp.edu.ar/")

public class GetTiposServiciosResponse {

    @XmlElement(name = "return")
    private java.util.List<ar.edu.ubp.das.beans.TipoServicioBean> _return;

    public java.util.List<ar.edu.ubp.das.beans.TipoServicioBean> getReturn() {
        return this._return;
    }

    public void setReturn(java.util.List<ar.edu.ubp.das.beans.TipoServicioBean> new_return)  {
        this._return = new_return;
    }

}

