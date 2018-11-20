package inter;

public class Exit extends Stmt{

	Stmt stmt;
	
	public Exit() {
		if(Stmt.enclosing == null)
			error("exit n�o fechado");
		
		stmt = Stmt.enclosing;
	}
	
	public void gen(int b, int a) {
		emit("goto L" + stmt.after);
	}
	
}
