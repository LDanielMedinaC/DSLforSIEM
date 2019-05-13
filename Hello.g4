/**
 * Define a grammar called Hello
 */
grammar Hello;

r  : check+;         // match keyword hello followed by an identifier

check: firewall_attack|attack_login|dos;

dos: 'if there are more than' INT 'requests in less than' limit 'with the IP address' IP;// {System.out.println("aplica dos")};  

attack_login: 'if there are more than' INT 'failed login' limit 'with the same' ACCOUNT;

firewall_attack: 'if there are more than' INT 'firewall' DENY_WORDS 'in less than' limit;


limit: INT TIME;  

IP : INT'.'INT'.'INT'.'INT;

ACCOUNT: ID'@'ID'.'ID;

DENY_WORDS : 'drop'|'reject'|'deny';

TIME: 'seconds'|'minutes'|'hours';
 

ID : [a-zA-z]+ ;             // match lower-case identifiers

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

INT: [0-9]+;