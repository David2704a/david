
public class ControlLavar implements IControl {

	
	private Lavadora_Beneficiario lavadora_Receptor;
	
	
	public ControlLavar(Lavadora_Beneficiario lavadora_R) {
		this.lavadora_Receptor = lavadora_R;
	}
	public void ejecutar() {
		lavadora_Receptor.lavar();
	}
}
