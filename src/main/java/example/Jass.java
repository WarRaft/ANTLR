// https://github.com/antlr/antlr4/blob/master/doc/java-target.md

package example;

import java.io.IOException;

import anal.example.JassLexer;
import anal.example.JassParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Jass {
    public static void main(String[] args) throws IOException {
        CharStream cs = fromFileName("/Users/nazarpunk/IdeaProjects/ANTLR/src/test/resources/test.j");

        // lexer
        final var lexer = new JassLexer(cs);
        final var tokens = new CommonTokenStream(lexer);

        // parser
        final var parser = new JassParser(tokens);
        final var tree = parser.root();

        // listener
        System.out.print("💋 Listen:\n");
        final var listener = new JassCustomListener();
        final var walker = new ParseTreeWalker();
        walker.walk(listener, tree);

        // visitor
        System.out.print("💋 Visit\n");
        final var visitor = new JassCustomVisitor();
        tree.accept(visitor);
    }

}
