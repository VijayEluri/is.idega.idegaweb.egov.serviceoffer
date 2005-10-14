/*
 * $Id: ServiceOfferBusinessHomeImpl.java,v 1.2 2005/10/14 21:54:53 eiki Exp $
 * Created on Oct 12, 2005
 *
 * Copyright (C) 2005 Idega Software hf. All Rights Reserved.
 *
 * This software is the proprietary information of Idega hf.
 * Use is subject to license terms.
 */
package is.idega.idegaweb.egov.serviceoffer.business;

import com.idega.business.IBOHomeImpl;


/**
 * 
 *  Last modified: $Date: 2005/10/14 21:54:53 $ by $Author: eiki $
 * 
 * @author <a href="mailto:eiki@idega.com">eiki</a>
 * @version $Revision: 1.2 $
 */
public class ServiceOfferBusinessHomeImpl extends IBOHomeImpl implements ServiceOfferBusinessHome {

	protected Class getBeanInterfaceClass() {
		return ServiceOfferBusiness.class;
	}

	public ServiceOfferBusiness create() throws javax.ejb.CreateException {
		return (ServiceOfferBusiness) super.createIBO();
	}
}
