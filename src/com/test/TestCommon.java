package com.test;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import org.apache.log4j.Logger;

import com.utils.MysqUsers;

public class TestCommon {
public static void main(String[] args) throws ParseException {
//	
//	SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//
//	Date a = sf.parse("2017-06-16 18:00:00");
//	Date b = sf.parse("");
//	Logger lo  =Logger.getLogger(TestCommon.class);
//	String b = MysqUsers.UserMaps.get("350300000000");
//	System.out.println("s:"+b.toString());
//	lo.info("d：");
	String cclj = "\\\\44.53.4.111\\share\\TempFile\\20171228\\c10f2718-d713-4ece-bc7b-0640b5906cdf.jpg";
	cclj = cclj.replace("\\\\44.53.4.111\\share", "");
	cclj = cclj.replace("\\", "/");
	System.out.println("s:"+cclj);
}
}
