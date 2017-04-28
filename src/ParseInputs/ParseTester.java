package ParseInputs;
import AST.*;
import ASTNodes.BaseNode;
import ASTNodes.ProgNode;
import Generated.*;

import java.io.*;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

import Generated.*;

public class ParseTester
{
    public void ParseAllInputs(int i){
        List<String> allInputs = new ArrayList<String>();

        int iterator = 1;
        while(true)
        {
            String str = "InputFiles/Input" + Integer.toString(iterator);
            allInputs.add(str);
            iterator++;
            if (iterator == i){
                break;
            }
        }
        for(String item : allInputs)
        {
            try
            {
                //This would not work, if "InputFiles" was a "package". It has to be a folder
                InputStream stream = new FileInputStream(item);

                ANTLRInputStream input = new ANTLRInputStream(stream);

                LanguageLexer lexer = new LanguageLexer(input);

                CommonTokenStream tokens = new CommonTokenStream(lexer);

                LanguageParser parser = new LanguageParser(tokens);

                //stackoverflow guide, uses "parser.compileUnit();", but that one is the same as "parser.prog();" in our case
                ParseTree tree = parser.prog();

                tree.accept(new ASTBuilder());

                System.out.println(tree.toStringTree(parser)); //print tree as text
                System.out.println(); // extra line
            }
            catch (Exception parser)
            {
                System.out.print("Other stuff failed!");
            }
        }
    }
    public void ParseSpecificInput(int i)
    {
        try
        {
            String str = "InputFiles/Input" + Integer.toString(i);
            //This would not work, if "InputFiles" was a "package". It has to be a folder
            InputStream stream = new FileInputStream(str);
            ANTLRInputStream input = new ANTLRInputStream(stream);

            LanguageLexer lexer = new LanguageLexer(input);

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            LanguageParser parser = new LanguageParser(tokens);

            //stackoverflow guide, uses "parser.compileUnit();", but that one is the same as "parser.prog();" in our case
            ParseTree tree = parser.prog();

            //AST ast = new AST(); what we want to write
            BaseNode AST = new ProgNode();



            tree.accept(new ASTBuilder());

            /*
            System.out.println(tree.getText());

            System.out.println(tree.toStringTree(parser)); //print tree as text
            */
        }
        catch (Exception parser)
        {
            System.out.print("Other stuff failed!");
        }
    }
}
