package com.utils;

import java.util.HashMap;
import java.util.Map;

public class MysqUsers {

	public static Map<String, String> UserMaps = new HashMap<>();
	static{
		UserMaps.put("350000000000", "083EAD47FA1EEA4C953FF85BB0BC3C47");
		UserMaps.put("350700000000", "0B8B57ACA892B04EBEEE541FD5C02D2F");
		UserMaps.put("350400000000", "406D53E6EA0FB54BBC9F9CD69542182C");
		UserMaps.put("350300000000", "5112DF67CD9CBF49B354B871FD7A3E09");
		UserMaps.put("350100000000", "52B551662D7B8C4691DD2A9F42192958");
		UserMaps.put("350800000000", "6AB17E3A6758F742BB6E4A0239DFA601");
		UserMaps.put("350200000000", "8C59B98781BA534C8EE27EAFC47AD98F");
		UserMaps.put("350000000000", "admin");
		UserMaps.put("350500000000", "C91A12CA7CB86D458060796847329155");
		UserMaps.put("350600000000", "D25CC29DF46FB44ABC11C583E0117C4F");
		UserMaps.put("350900000000", "F35EF7809B0CCC478C258F82F78DDCD1");
	}
	
	public static String GetUserByOrg(String org){
		if(org == null || "".equals(org)){
			org = "350000000000";
		}
		return UserMaps.get(org);
	}
}
