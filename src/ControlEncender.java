
public class ControlEncender implements IControl {

	private Lavadora_Beneficiario lavadora_Receptor;
	
	
	public ControlEncender(Lavadora_Beneficiario lavadora_R) {
		this.lavadora_Receptor = lavadora_R;
	}
	
	public void ejecutar() {
		lavadora_Receptor.encender();
	}
}
