package com.bonex.sys.util;

import java.io.File;

public class Constants {

	/**
	 * default to \web-inf\db.xml
	 */
	final static public String XML_DB_DEFINITION = File.separator + "web-inf" + File.separator + "db.xml";
	
	/**
	 * db-path
	 */
	final static public String XML_DB_PATH = "db-path";
	
	/**
	 * db-access-filename
	 */
	final static public String XML_DB_ACCESS_FILENAME = "db-access-filename";
	
	/**
	 * db-username
	 */
	final static public String XML_DB_USERNAME = "db-username";
	
	/**
	 * db-password
	 */
	final static public String XML_DB_PASSWORD = "db-password";
	final static public String FALSE = "false";
	final static public String TRUE = "true";
	final static public String DB_ACTION_DELETE = "delete";
	final static public String DB_ACTION_UPDATE = "update";
	final static public String DB_ACTION_INSERT = "insert";
	final static public String DB_ACTION_QUERY = "query";
	final static public String DB_ACTION_SQL = "sql";
}
