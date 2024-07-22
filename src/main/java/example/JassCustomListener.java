package example;

import raft.war.antlr.jass.JassBaseListener;
import raft.war.antlr.jass.JassParser;

public class JassCustomListener extends JassBaseListener {
    @Override
    public void enterRoot(JassParser.RootContext ctx) {
        System.out.print("enterRoot:" + ctx + "\n");
    }
}
