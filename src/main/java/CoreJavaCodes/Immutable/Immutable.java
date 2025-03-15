package CoreJavaCodes.Immutable;


//class level restriction
public final class Immutable {
    //field level restriction so that direct access,so that value assigned once
    private final String  name;
    private final Address address;
//method level retriction
    public Immutable(String name, Address address) {
        this.name = name;
        this.address = new Address(address.city);
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return new Address(address.city);
    }

    @Override
    public String toString() {
        return "Immutable{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
class ImmutableMain{
    public static void main(String [] args)
    {
    Immutable immutable=new Immutable("sana",new Address("dhanbad"));
    immutable.getAddress().setCity("china");
    System.out.println(immutable);
    }
}
