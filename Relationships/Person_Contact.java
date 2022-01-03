import java.util.Scanner;

class Contact {
    private Integer mobile;
    private Integer Amobile;
    private Integer landline;
    private String email;
    private Address address;

    Contact(Integer mobile, Integer Amobile, Integer landline, String email, Address address) {
        this.mobile = mobile;
        this.Amobile = Amobile;
        this.address = address;
        this.email = email;
        this.landline = landline;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getAmobile() {
        return Amobile;
    }

    public void setAmobile(Integer amobile) {
        Amobile = amobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLandline(Integer landline) {
        this.landline = landline;
    }

    public Integer getLandline() {
        return landline;
    }

    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }

    public Integer getMobile() {
        return mobile;
    }

    @Override
    public String toString() {
        return mobile + " " + Amobile + " " + landline + " " + email + " " + address.getAl2() + " " + address.getAl1()
                + " " + address.getCity() + " " + address.getState() + " " + address.getPin();
    }
}

class Address {
    private String al1;
    private String al2;
    private String city;
    private String state;
    private Integer pin;
    private Contact contact;

    Address(String al1, String al2, String city, String state, Integer pin, Contact contact) {
        this.al1 = al1;
        this.al2 = al2;
        this.city = city;
        this.contact = contact;
        this.state = state;
        this.pin = pin;
    }

    public String getAl1() {
        return al1;
    }

    public void setAl1(String al1) {
        this.al1 = al1;
    }

    public String getAl2() {
        return al2;
    }

    public void setAl2(String al2) {
        this.al2 = al2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}

class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Contact[] arr = new Contact[n];
        for (int i = 0; i < n; i++) {
            Integer mobile = Integer.parseInt(sc.nextLine());
            Integer Amobile = Integer.parseInt(sc.nextLine());
            Integer landline = Integer.parseInt(sc.nextLine());
            String email = sc.nextLine();
            String al2 = sc.nextLine();
            String al1 = sc.nextLine();
            String city = sc.nextLine();
            String state = sc.nextLine();
            Integer pin = Integer.parseInt(sc.nextLine());
            Address address = new Address(al1, al2, city, state, pin, arr[i]);
            arr[i] = new Contact(mobile, Amobile, landline, email, address);
            System.out.println(arr[i].toString());
        }
        Integer sh = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            if (arr[i].getAmobile().equals(sh) || arr[i].getMobile().equals(sh)) {
                System.out.println(arr[i].toString());
                return;
            }
        }
        System.out.printf("No contact with mobile %d found", sh);
        sc.close();
    }
}
