/*
 * $Id: ServiceOfferConstants.java,v 1.1 2005/10/02 23:42:29 eiki Exp $
 * Created on Oct 2, 2005
 *
 * Copyright (C) 2005 Idega Software hf. All Rights Reserved.
 *
 * This software is the proprietary information of Idega hf.
 * Use is subject to license terms.
 */
package is.idega.idegaweb.egov.serviceoffer.util;

/**
 * Contains all constants for the serviceoffer package. "Implement" this interface to get access to them.
 * 
 *  Last modified: $Date: 2005/10/02 23:42:29 $ by $Author: eiki $
 * 
 * @author <a href="mailto:eiki@idega.com">eiki</a>
 * @version $Revision: 1.1 $
 */
public interface ServiceOfferConstants {
	public static final String IW_BUNDLE_IDENTIFIER = "is.idega.idegaweb.egov.serviceoffer";	
	public static final String CASE_CODE_KEY_SERVICE_OFFER = "SERVOFF";
	public static final String CASE_CODE_KEY_SERVICE_OFFER_PARENT = "SERVOFP";
	
	public static final String PAYMENT_TYPE_CASH = "CASH";
	public static final String PAYMENT_TYPE_INVOICE = "INVOICE";
	public static final String PAYMENT_TYPE_CREDIT_CARD = "CREDIT";
	
}
