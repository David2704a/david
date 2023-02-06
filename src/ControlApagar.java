
public class ControlApagar implements IControl {

private Lavadora_Beneficiario lavadora_Receptor;
	
	
	public ControlApagar(Lavadora_Beneficiario lavadora_R) {
		this.lavadora_Receptor = lavadora_R;
	}
	@Override
	public void ejecutar() {
		lavadora_Receptor.apagar();
	}
}
