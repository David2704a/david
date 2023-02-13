
public class ControlSecar implements IControl {

	private Lavadora_Beneficiario lavadora_Receptor;
	
	
	public ControlSecar(Lavadora_Beneficiario lavadora_R) {
		this.lavadora_Receptor = lavadora_R;
	}
	@Override
	public void ejecutar() {
		lavadora_Receptor.secar();
		
		
		System.out.println("david la propiia");
	}
}
