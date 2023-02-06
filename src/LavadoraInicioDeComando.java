
public class LavadoraInicioDeComando {
	private IControl[] lavadora_IComandos_Array = new IControl[5];
	public LavadoraInicioDeComando(Lavadora_Beneficiario lavadora_R) {
		
		lavadora_IComandos_Array[0] = new ControlEncender(lavadora_R);
		lavadora_IComandos_Array[1] = new ControlLavar(lavadora_R);
		lavadora_IComandos_Array[2] = new ControlSecar(lavadora_R);
		lavadora_IComandos_Array[3] = new ControlApagar(lavadora_R);
	}
	
	public void seleccionControl(int indice) {
		lavadora_IComandos_Array[indice].ejecutar();
	}
	
}
