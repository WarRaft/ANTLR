import antlr4, {ParseTreeWalker} from 'antlr4'
import JassLexer from '../../../gen/JassLexer.js'
import JassParser from '../../../gen/JassParser.js'
import JassParserListener from '../../../gen/JassParserListener.js'
import fs from 'fs'
import JassParserVisitor from '../../../gen/JassParserVisitor.js'

// https://github.com/antlr/antlr4/blob/master/doc/javascript-target.md


const input = fs.readFileSync('Main.j', {encoding: 'utf8', flag: 'r'})

// lexer
const tokens = new antlr4.CommonTokenStream(new JassLexer(new antlr4.InputStream(input)))

// parser
const parser = new JassParser(tokens)
const tree = parser.root()

// listener
class Listener extends JassParserListener {
    enterRoot(ctx) {

        console.log(`enterRoot->${ctx.getText()}<- ${typeof Object.keys(ctx)}\n`)
    }

    enterFun(ctx) {
        console.log(`enterFuncbody->${ctx.getText()}<-`)
    }
}

ParseTreeWalker.DEFAULT.walk(new Listener(), tree)

// visitor
class Visitor extends JassParserVisitor {
    visitChildren(ctx) {
        if (!ctx) return

        if (ctx.children) {
            return ctx.children.map(child => {
                if (child.children && child.children.length !== 0) {
                    return child.accept(this)
                } else {
                    console.log(child.getText())
                    return child.getText()
                }
            })
        }
    }
}

tree.accept(new Visitor())
