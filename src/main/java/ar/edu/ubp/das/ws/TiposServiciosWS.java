package ar.edu.ubp.das.ws;

import java.sql.SQLException;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.apache.cxf.interceptor.Fault;

import ar.edu.ubp.das.beans.TipoServicioBean;
import ar.edu.ubp.das.db.Dao;
import ar.edu.ubp.das.db.DaoFactory;

@WebService(targetNamespace = "http://ws.das.ubp.edu.ar/", portName = "TiposServiciosWSPort", serviceName = "TiposServiciosWSService")
@XmlSeeAlso({TipoServicioBean.class})
public class TiposServiciosWS {

	@WebMethod(operationName = "getTiposServicios", action = "urn:GetTiposServicios")
	@WebResult(name = "return")
	public List<TipoServicioBean> getTiposServicios(){
		try(Dao<TipoServicioBean,?,?> dao = DaoFactory.getDao("TiposServicios", "ar.edu.ubp.das")) {
			return dao.select(null);
		} 
		catch (SQLException e) {
			throw new Fault(e);
		}
	}
	
}
