
public class Slot05 extends SlotChain{

	public Slot05(SlotID id) {
		super(id);
	}

	@Override
	public Double efetuarCompra(SlotID valores) {
		if (valores.toString().equals("slot1")) {
			return new Double(1.00);
		}
		else if(next!= null){
			return next.efetuarCompra(valores);
		}
		next = new Slot05(SlotID.slot10);
		return next.efetuarCompra(valores);
	}

}
