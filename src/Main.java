import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class Main {
    public static void main(String[] args) {
        if (args == null || args.length == 0) {
            System.out.println("Please input a correct expression");
            return;
        }

        String input = args[0];
        System.out.println(input);
        // create a lexer that feeds off of input CharStream
        MyGrammarLexer lexer = new MyGrammarLexer(CharStreams.fromString(input));

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        MyGrammarParser parser = new MyGrammarParser(tokens);
        ParseTree tree = parser.expr(); // begin parsing at init rule

        MyVisitor translator = new MyVisitor();
        System.out.println(translator.visit(tree));
    }
}