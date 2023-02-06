
public class Control {

	public class ComandoEncender implements IControl{
		
		private Lavadora_Beneficiario lavadora_Receptor;
		
		
		public ComandoEncender(Lavadora_Beneficiario lavadora_R) {
			this.lavadora_Receptor = lavadora_R;
		}
		@Override
		public void ejecutar() {
			lavadora_Receptor.encender();
		}
		
	}
	
	public class ComandoLavar implements IControl{
		
		private Lavadora_Beneficiario lavadora_Receptor;
		
		
		public ComandoLavar(Lavadora_Beneficiario lavadora_R) {
			this.lavadora_Receptor = lavadora_R;
		}
		@Override
		public void ejecutar() {
			lavadora_Receptor.lavar();
		}
	}
	
public class ComandoSecar implements IControl{
		
		private Lavadora_Beneficiario lavadora_Receptor;
		
		
		public ComandoSecar(Lavadora_Beneficiario lavadora_R) {
			this.lavadora_Receptor = lavadora_R;
		}
		@Override
		public void ejecutar() {
			lavadora_Receptor.secar();
		}
	}


	public class ComandoApagar implements IControl{
	
	private Lavadora_Beneficiario lavadora_Receptor;
	
	
	public ComandoApagar(Lavadora_Beneficiario lavadora_R) {
		this.lavadora_Receptor = lavadora_R;
	}
	@Override
	public void ejecutar() {
		lavadora_Receptor.apagar();
	}
}
}
