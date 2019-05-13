import java.util.*;

//import HelloParser.Attack_loginContext;

import java.io.*;


public class MiListener extends HelloBaseListener {
	Stack<Float> pila = new Stack<>();
	Map<String,Float> variables = new HashMap<>();
	
	String query = "";
	
	String xml = "";
	
	int ruleCounter, dosCounter, firewallCounter, loginCounter, intentCounter, limitCounter;
	
	@Override public void enterCheck(HelloParser.CheckContext ctx) { 
		
		String kindAttack = "";
		
		String aux = ctx.getChild(0).getChild(2).getText();
		
		if(aux.contains("firewall")) {
			kindAttack = "firewall attack";
		}else if(aux.contains("failed")) {
			kindAttack = "Brute force password attack";
		}else
			kindAttack = "DoS attack";
			
		
		
		xml += "<rule id = "+ ++ruleCounter + " group = " + "\"" + kindAttack + "\"" + " >\n";
		System.out.println("check");
	}
	@Override public void exitCheck(HelloParser.CheckContext ctx) { 
		
		xml += "</rule>";
	}
	
	
	@Override public void enterDos(HelloParser.DosContext ctx) {
		
		
		String sip = ctx.getChild(5).getText();
		
		String[] ips = sip.split(".");
		
		int[] ip = new int[4];
		
		
		int requests = Integer.parseInt(ctx.getChild(1).getText()); 
		
		int time = Integer.parseInt(ctx.getChild(3).getChild(0).getText());////x
		
		
		
		String timeU = ctx.getChild(3).getChild(1).getText();///ut
		
		
		timeU = timeU.toUpperCase();
		
		query = "SET @count:= SELCT COUNT(ip) FROM syslog_request WHERE ip = " + sip + "\n";
		query += "SET @min:= SELECT MIN(time) FROM syslog_request WHERE ip = " + sip + "\n";
		query += "SET @max:= SELECT MAX(time) FROM syslog_request WHERE ip = " + sip + "\n";
		query += "SET @dif:= SELECT DATEDIFF("+timeU+", @min, @max) AS rt FROM syslog_request WHERE ip = "+ sip + "\n";
		query += "BEGIN\n\tIF dif/" + time + "*" + requests  + "< @count\n\tBEGIN\n\t\t SENDALERT DOS ATTACK\n\t END\nEND";
		
		for(int i = 0; i < ips.length; i++) {
			ip[i] = Integer.parseInt(ips[i]);
			if(ip[i] > 255 || ip[i] < 0||true) {
				System.err.println("IP address invalid");
			}
		}
		
		
		xml += "\t<DosAttack id=" + ++dosCounter + " >\n";
		xml += "\t\t<numberofIntent id=" + ++intentCounter + " cant = "+requests+"/>\n";
		xml += "<ip ipv="+ ip +" />";
		System.out.println("dos");
		
		
	}
	
	
	
	
	@Override public void exitDos(HelloParser.DosContext ctx) {
		
		xml += "\t</DoSAttack>\n";
	}
	
	@Override public void enterAttack_login(HelloParser.Attack_loginContext ctx) {
		
		String saccount = ctx.getChild(5).getText();
		
		
		
		int failedNum = Integer.parseInt(ctx.getChild(1).getText()); 
		
		int time = Integer.parseInt(ctx.getChild(3).getChild(0).getText());////x
		
		String timeU = ctx.getChild(3).getChild(1).getText();///ut
			
		timeU = timeU.toUpperCase();
		
		query = "SET @count:= SELECT COUNT(account) FROM syslog_login WHERE account = " + saccount + "status = FAILED \n";
		query += "SET @min:= SELECT MIN(time) FROM syslog_login WHERE account = " + saccount + "status = FAILED \n";
		query += "SET @max:= SELECT MAX(time) FROM syslog_login WHERE account = " + saccount + "status = FAILED \n";
		query += "SET @dif:= SELECT DATEDIFF( "+ timeU + ", @min, @max) AS rt FROM syslog_request WHERE account = "+ saccount + "status = FAILED \n";
		query += "BEGIN\n\tIF dif/" + time + "*" + failedNum  + "< @count\n\tBEGIN\n\t\t SENDALERT Login ATTACK\n\tEND\nEND";
		
		xml += "\t<attackLogin id=" + ++loginCounter + " >\n";
		xml += "\t\t<numberofIntent id=" + ++intentCounter + " cant = "+failedNum+"/>\n";
		xml += "<account acc="+ saccount +" />";
	}
	
	
	@Override public void exitAttack_login(HelloParser.Attack_loginContext ctx) {
		xml += "\t</attackLogin>\n";
	}

	@Override public void enterFirewall_attack(HelloParser.Firewall_attackContext ctx){
		
		int intents = Integer.parseInt(ctx.getChild(1).getText());
		int time = Integer.parseInt(ctx.getChild(5).getChild(0).getText());
		String timeU = ctx.getChild(5).getChild(1).getText();
		timeU = timeU.toUpperCase();
		query = "SET @count:= SELECT COUNT(ip) FROM syslog_firewall WHERE status = FAILED \n";
		query += "SET @min:= SELECT MIN(time) FROM syslog_request WHERE status = FAILED \n";
		query += "SET @max:= SELECT MAX(time) FROM syslog_request status = FAILED \n";
		query += "SET @dif:= SELECT DATEDIFF("+ timeU + ", @min, @max) AS rt FROM syslog_request WHERE status = FAILED \n";
		query += "BEGIN\n\tIF dif/" + time + "*" + intents  + "< @count\n\tBEGIN\n\t\t SENDALERT Login ATTACK\n\tEND\nEND";
		xml += "\t<attackLogin id=" + ++firewallCounter + " >\n";
		xml += "\t\t<numberofIntent id=" + ++intentCounter + " cant = "+intents+"/>\n";
	}
	
	@Override public void exitFirewall_attack(HelloParser.Firewall_attackContext ctx) {
		xml += "\t</attackFirewall>\n";
	}
	
	@Override public void enterLimit(HelloParser.LimitContext ctx) {
		int i = Integer.parseInt(ctx.getChild(0).getText());
		String s= ctx.getChild(1).getText();
		xml += "\t\t<limit id=" + ++limitCounter + ">\n";
		
		xml += "\t\t\t<unit cant="+ i +"/>\n";
		xml += "\t\t\t<time kind= \""+ s +"\"/>\n";
	}
	@Override public void exitLimit(HelloParser.LimitContext ctx)
	{
		xml+= "\t\t</limit>\n";
	}

}
