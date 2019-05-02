// Generated from Hello.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(HelloParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(HelloParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#check}.
	 * @param ctx the parse tree
	 */
	void enterCheck(HelloParser.CheckContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#check}.
	 * @param ctx the parse tree
	 */
	void exitCheck(HelloParser.CheckContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#dos}.
	 * @param ctx the parse tree
	 */
	void enterDos(HelloParser.DosContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#dos}.
	 * @param ctx the parse tree
	 */
	void exitDos(HelloParser.DosContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#attack_login}.
	 * @param ctx the parse tree
	 */
	void enterAttack_login(HelloParser.Attack_loginContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#attack_login}.
	 * @param ctx the parse tree
	 */
	void exitAttack_login(HelloParser.Attack_loginContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#firewall_attack}.
	 * @param ctx the parse tree
	 */
	void enterFirewall_attack(HelloParser.Firewall_attackContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#firewall_attack}.
	 * @param ctx the parse tree
	 */
	void exitFirewall_attack(HelloParser.Firewall_attackContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#limit}.
	 * @param ctx the parse tree
	 */
	void enterLimit(HelloParser.LimitContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#limit}.
	 * @param ctx the parse tree
	 */
	void exitLimit(HelloParser.LimitContext ctx);
}