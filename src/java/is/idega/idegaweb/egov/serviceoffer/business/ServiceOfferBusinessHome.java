package is.idega.idegaweb.egov.serviceoffer.business;


import javax.ejb.CreateException;
import com.idega.business.IBOHome;
import java.rmi.RemoteException;

public interface ServiceOfferBusinessHome extends IBOHome {

	public ServiceOfferBusiness create() throws CreateException, RemoteException;
}