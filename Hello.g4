/**
 * Define a grammar called Hello
 */
grammar Hello;

r  : MORE_THAN;         // match keyword hello followed by an identifier

check: dos;

dos: MORE_THAN 'requests in less than' limit 'with the IP address' IP;  

attack_login: MORE_THAN 'failed login' limit 'with the same' ACCOUNT;

firewall_attack: MORE_THAN 'firewall' DENY_WORDS 'in less than' limit;


limit: INT TIME;  

MORE_THAN: 'if''there''are''more''than'INT;

IP : INT'.'INT'.'INT'.'INT;

ACCOUNT: ID'@'ID'.'ID;

DENY_WORDS : 'drop'|'reject'|'deny';

TIME: 'seconds'|'minutes';

ID : [a-zA-z]+ ;             // match lower-case identifiers

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

INT: [0-9]+;