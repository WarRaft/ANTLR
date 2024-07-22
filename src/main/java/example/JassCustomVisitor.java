package example;


import raft.war.antlr.jass.JassBaseVisitor;
import raft.war.antlr.jass.JassParser;

public class JassCustomVisitor extends JassBaseVisitor<JassCustomVisitor> {
    @Override
    public JassCustomVisitor visitRoot(JassParser.RootContext ctx) {
        System.out.println("visitRoot: " + ctx.getText() + "\n");
        return super.visitChildren(ctx);
    }
}
