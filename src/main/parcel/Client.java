package parcel;

public class Client {

    private String name;
    private boolean isRealBuyer = false;
    private String realBuyerName;
    private boolean isDelegated = false;
    private String phoneNumber;
    private String parcelContent;


    Client(String name) {
        this.name = name;
    }

    Client(String name, String phoneNumber, String parcelContent) {
        this.name = name;
        isRealBuyer = true;
        this.phoneNumber = phoneNumber;
        this.parcelContent = parcelContent;
        this.realBuyerName = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRealBuyer() {
        return isRealBuyer;
    }

    public void setRealBuyer(boolean realBuyer) {
        isRealBuyer = realBuyer;
    }

    public String getRealBuyerName() {
        return realBuyerName;
    }

    public void setRealBuyerName(String realBuyerName) {
        this.realBuyerName = realBuyerName;
    }

    public boolean isDelegated() {
        return isDelegated;
    }

    public void setDelegated(boolean delegated) {
        isDelegated = delegated;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getParcelContent() {
        return parcelContent;
    }

    public void setParcelContent(String parcelContent) {
        this.parcelContent = parcelContent;
    }

    public void delegateDelivery(Client delegatedPerson) {
        delegatedPerson.setDelegated(true);
        delegatedPerson.setRealBuyerName(name);
    }
}
