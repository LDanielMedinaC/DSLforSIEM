import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
	
	public static void main( String[] args) throws Exception, IOException 
	{
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Reporte.txt"), "UTF-8"));
		BufferedWriter writerXml = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("XML.txt"), "UTF-8"));
		try {
		ANTLRInputStream input = new ANTLRInputStream( System.in);

		HelloLexer lexer = new HelloLexer(input);

		CommonTokenStream tokens = new CommonTokenStream(lexer);

		HelloParser parser = new HelloParser(tokens);
		ParseTree tree = parser.r(); // begin parsing at rule 'r'
		System.out.println(tree.toStringTree(parser)); // print LISP-style tree
		ParseTreeWalker walker = new ParseTreeWalker();
		MiListener listener = new MiListener();
		walker.walk(listener, tree);
		
		writer.write(listener.query);
		writerXml.write(listener.xml);
		writer.close();
		writerXml.close();
		}
		catch(Exception e) {
			System.out.println("Error");
		}
		
		
	}
}
