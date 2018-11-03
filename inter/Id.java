package inter;
import lexer.*; import symbols.*;

//Classe responsável por representar todas as variáveis
public class Id extends Expr{
	public int offset;
	public Id(Word id, Type p, int b ) { super(id, p); offset = b; }
}
