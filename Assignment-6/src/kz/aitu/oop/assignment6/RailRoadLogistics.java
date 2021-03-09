package kz.aitu.oop.assignment6;

public class RailRoadLogistics implements Logistics{

	@Override
	public Transport planDelivery() {
		return new Train();
	}

	@Override
	public Transport createTransport() {
		return new Train();
	}
}
