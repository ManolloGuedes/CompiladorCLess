package br.com.guedes.herlon;

/**
 * Created by Manollo Guedes on 22/10/2016.
 */
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.*;
import java.io.*;

public class Principal {

    public static void main (String[] args ) throws Exception{
        File file = new File("entradaCorreta.txt");
        CLessLexer scanner = new CLessLexer((CharStream)(new ANTLRFileStream(file.getAbsolutePath())));

        CommonTokenStream tokens = new CommonTokenStream((TokenSource)scanner);
        tokens.fill();

        for(Object o : tokens.getTokens()) {
            CommonToken token = (CommonToken) o;

            analyzer(token);
        }
    }

    private static void analyzer(Token token) {
        switch (token.getType()){
            case CLessLexer.ABRE_CHAVE:
                success(token, "ABRE_CHAVE");
                break;
            case CLessLexer.ABRE_COLC:
                success(token, "ABRE_COLC");
                break;
            case CLessLexer.ABRE_PAR:
                success(token, "ABRE_PAR");
                break;
            case CLessLexer.ARRAY:
                success(token, "ARRAY");
                break;
            case CLessLexer.ATRIBUICAO:
                success(token, "ATRIBUICAO");
                break;
            case CLessLexer.CHAR:
                success(token, "CHAR");
                break;
            case CLessLexer.COMENT:
                success(token, "COMENT");
                break;
            case CLessLexer.DIFERENTE:
                success(token, "DIFERENTE");
                break;
            case CLessLexer.ELSE:
                success(token, "ELSE");
                break;
            case CLessLexer.ERRO_ARRAY_ABRE_COLC:
                error(token, "É necessário abrir colchetes para formar token ARRAY");
                break;
            case CLessLexer.ERRO_ARRAY_FECHA_COLC:
                error(token, "É necessário abrir colchetes para formar token ARRAY");
                break;
            case CLessLexer.ERRO_DIFERENTE:
                error(token, "Não quer dizer '!=' ?");
                break;
            case CLessLexer.ERRO_FLOAT_SEM_FRACAO:
                error(token, "É necessário parte fracionária do número após '.'");
                break;
            case CLessLexer.ERRO_FLOAT_VIRGULA:
                error(token, "Token inesperado, talvez você tenha usado ',' no lugar de '.'");
                break;
            case CLessLexer.ERRO_IDENTIFICADOR_CARACTERE:
                error(token, "Não é possível utilizar caracteres especiais em variáveis");
                break;
            case CLessLexer.ERRO_IDENTIFICADOR_NUMERO:
                error(token, "Não é possível iniciar nome de variáveis com números");
                break;
            case CLessLexer.ERRO_MAIOR_IGUAL:
                error(token, "Não quer dizer '>='?");
                break;
            case CLessLexer.ERRO_MENOR_IGUAL:
                error(token, "Não quer dizer '<='?");
                break;
            case CLessLexer.FECHA_CHAVE:
                success(token, "FECHA_CHAVE");
                break;
            case CLessLexer.FECHA_COLC:
                success(token, "FECHA_COLC");
                break;
            case CLessLexer.FECHA_PAR:
                success(token, "FECHA_PAR");
                break;
            case CLessLexer.FLOAT:
                success(token, "FLOAT");
                break;
            case CLessLexer.IDENTIFICADOR:
                success(token, "IDENTIFICADOR");
                break;
            case CLessLexer.IF:
                success(token, "IF");
                break;
            case CLessLexer.IGUAL:
                success(token, "IGUAL");
                break;
            case CLessLexer.INT:
                success(token, "INT");
                break;
            case CLessLexer.MAIOR:
                success(token, "MAIOR");
                break;
            case CLessLexer.MAIOR_IGUAL:
                success(token, "MAIOR_IGUAL");
                break;
            case CLessLexer.MENOR:
                success(token, "MENOR");
                break;
            case CLessLexer.MENOR_IGUAL:
                success(token, "MENOR_IGUAL");
                break;
            case CLessLexer.MULT:
                success(token, "MULT");
                break;
            case CLessLexer.PONTO_VIRGULA:
                success(token, "PONTO_VIRGULA");
                break;
            case CLessLexer.RETURN:
                success(token, "RETURN");
                break;
            case CLessLexer.SOMA:
                success(token, "SOMA");
                break;
            case CLessLexer.STRUCT:
                success(token, "STRUCT");
                break;
            case CLessLexer.TYPE_CHAR:
                success(token, "TYPE_CHAR");
                break;
            case CLessLexer.TYPE_FLOAT:
                success(token, "TYPE_FLOAT");
                break;
            case CLessLexer.TYPE_INT:
                success(token, "TYPE_INT");
                break;
            case CLessLexer.VIRGULA:
                success(token, "VIRGULA");
                break;
            case CLessLexer.VOID:
                success(token, "VOID");
                break;
            case CLessLexer.WHILE:
                success(token, "WHILE");
                break;
            case CLessLexer.EOF:
                break;
            default:
                success(token, "OUTROS");
        }
    }
    private static void success (Token token, String string) {
        System.out.print("\t\t" + "Line: " + token.getLine() + "   Column: " + token.getCharPositionInLine() +
                "\t\tToken: " + string + "\t\tLexema: " + token.getText() + "\n");
    }

    private static void error (Token token, String string) {
        System.err.print("[ERRO]\tLine: " + token.getLine() + "   Column: " + token.getCharPositionInLine() +
                "\t\tErro: " + string + "\t\tLexema: " + token.getText() + "\n");
    }
}