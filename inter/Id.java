package inter;
import lexer.*; import symbols.*;

//Classe respons�vel por representar todas as vari�veis
public class Id extends Expr{
	public int offset;
	public Id(Word id, Type p, int b ) { super(id, p); offset = b; }
}
