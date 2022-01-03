import java.util.Scanner;

class Country {
    private String code;
    private String name;

    Country(String code, String name) {
        this.name = name;
        this.code = code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class CountryBo {
    public Country createCountry(String data) {
        String[] arr = data.split(",");
        return new Country(arr[0], arr[1]);
    }
}

class Airport {
    String airName;
    Country country;

    Airport(String airName, Country country) {
        this.airName = airName;
        this.country = country;
    }

    public String getAirName() {
        return airName;
    }

    public void setAirName(String airName) {
        this.airName = airName;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

}

class AirportBo {
    public Airport createAirport(String data, Country[] countryList) {
        String[] arr = data.split(",");
        Country country = countryList[0];
        for (int i = 0; i < countryList.length; i++) {
            if (arr[1].equals(countryList[i].getName())) {
                country = countryList[i];
                break;
            }
        }
        return new Airport(arr[0], country);
    }

    public String findCountryName(Airport[] airportList, String airportName) {
        String name = "";
        for (int i = 0; i < airportList.length; i++) {
            if ((airportList[i].getAirName()).equals(airportName)) {
                name = (airportList[i].getCountry().getName());
                break;
            }
        }
        return name;
    }

    public boolean findInCountry(Airport[] airportList, String an1, String an2) {
        String ac1 = "", ac2 = "";
        int i = 0;
        for (; i < airportList.length; i++) {
            if (airportList[i].getAirName().equals(an1)) {
                ac1 = airportList[i].getCountry().getName();
                break;
            }
        }
        for (; i < airportList.length; i++) {
            if (airportList[i].getAirName().equals(an2)) {
                ac2 = airportList[i].getCountry().getName();
                break;
            }
        }
        if (ac1.equals(ac2)) {
            return true;
        }
        return false;

    }
}

class Q2 {
    public static void main(String[] args) throws NumberFormatException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        CountryBo x = new CountryBo();
        Country[] carr = new Country[n];
        for (int i = 0; i < n; i++) {
            carr[i] = x.createCountry(sc.nextLine());
        }
        n = Integer.parseInt(sc.nextLine());
        Airport[] arr = new Airport[n];
        AirportBo y = new AirportBo();
        for (int i = 0; i < n; i++) {
            arr[i] = y.createAirport(sc.nextLine(), carr);
        }
        String sh=sc.nextLine().toString();
        System.out.printf("%s belongs to %s\n",sh,y.findCountryName(arr,sh));
        if (y.findInCountry(arr, sc.nextLine(), sc.nextLine())) {
            System.out.println("The 2 airports are in the same country");
        } else {
            System.out.println("The 2 airports are in different countries");
        }
    }
}
