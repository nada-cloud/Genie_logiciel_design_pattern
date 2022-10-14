package parcel;

public class Service implements DeliveryService {

    @Override
    public void deliverTo(Client client) {
        if (client.isRealBuyer()) {
            System.out.println("I am the real buyer. Phone number : " + client.getPhoneNumber() + " and parcel content : " + client.getParcelContent());
        } else {
            System.out.println("I am a friend of " + client.getRealBuyerName());
        }
        System.out.println("Delivered to the customer : " + client.getName() + ". Real buyer is : " + client.getRealBuyerName());
    }
}
