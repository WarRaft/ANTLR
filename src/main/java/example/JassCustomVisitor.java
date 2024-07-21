package example;

import anal.example.JassBaseVisitor;
import anal.example.JassParser;

public class JassCustomVisitor extends JassBaseVisitor<JassCustomVisitor> {
    @Override
    public JassCustomVisitor visitRoot(JassParser.RootContext ctx) {
        System.out.println("visitRoot: " + ctx.getText() + "\n");
        return super.visitRoot(ctx);
    }
}
