import antlr4, {ParseTreeWalker} from "antlr4";
import JassLexer from "../../../gen/JassLexer.js";
import JassParser from "../../../gen/JassParser.js";
import JassParserListener from "../../../gen/JassParserListener.js";

const input = `
function a () 

end
`;

// lexer
const tokens = new antlr4.CommonTokenStream(new JassLexer(new antlr4.InputStream(input)));

// parser
const parser = new JassParser(tokens);
const tree = parser.start();

// visitor
class Visitor extends JassParserListener {
    enterStart(ctx) {
        console.log(`enterStart_${ctx.getText()}`);
    }

    enterFuncbody(ctx) {
        console.log(`enterFuncbody->${ctx.getText()}<-`);
    }
}

ParseTreeWalker.DEFAULT.walk(new Visitor(), tree)



