/*
 * $Id: ServiceOfferBusinessHome.java,v 1.1 2005/10/02 23:42:29 eiki Exp $
 * Created on Oct 2, 2005
 *
 * Copyright (C) 2005 Idega Software hf. All Rights Reserved.
 *
 * This software is the proprietary information of Idega hf.
 * Use is subject to license terms.
 */
package is.idega.idegaweb.egov.serviceoffer.business;

import com.idega.business.IBOHome;


/**
 * 
 *  Last modified: $Date: 2005/10/02 23:42:29 $ by $Author: eiki $
 * 
 * @author <a href="mailto:eiki@idega.com">eiki</a>
 * @version $Revision: 1.1 $
 */
public interface ServiceOfferBusinessHome extends IBOHome {

	public ServiceOfferBusiness create() throws javax.ejb.CreateException, java.rmi.RemoteException;
}
