package example;

import anal.example.JassBaseListener;
import anal.example.JassParser;

public class JassCustomListener extends JassBaseListener {
    @Override
    public void enterRoot(JassParser.RootContext ctx) {
        System.out.print("enterRoot:" + ctx + "\n");
    }
}
