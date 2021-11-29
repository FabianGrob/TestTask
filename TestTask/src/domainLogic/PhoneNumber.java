package domainLogic;

/**
 *
 * @author Fabian
 */
public class PhoneNumber {

    private String number;
    private String countryCode;
    private String cityCode;

    static final String defaultCityCode = "812";
    static final String defaultCountryCode = "7";

    public PhoneNumber(String data) {
        int condition = data.length();
        switch (condition) {
            case 11:
                this.countryCode = data.substring(0, 1);
                this.cityCode = data.substring(1, 4);
                this.number = data.substring(4);
                break;
            case 10:
                this.countryCode = defaultCountryCode;
                this.cityCode = data.substring(0, 3);
                this.number = data.substring(3);
                break;
            case 8:
                this.countryCode = data.substring(0, 1);
                this.cityCode = defaultCityCode;
                this.number = data.substring(1);
                break;
            case 7:
                this.countryCode = defaultCountryCode;
                this.cityCode = defaultCityCode;
                this.number = data;
                break;
            default:
                this.countryCode = "";
                this.cityCode = "";
                this.number = "";
                break;
        }

    }

    @Override
    public String toString() {
        String formattedPhone = "";
        if(this.number.length()>0){
            formattedPhone  = String.format("+%s (%s) %s-%s", countryCode, cityCode, number.substring(0, 3), number.substring(3));
        }
        return formattedPhone;
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) {
            return true;
        }

        if (!(o instanceof PhoneNumber)) {
            return false;
        }

        PhoneNumber n = (PhoneNumber) o;

        return n.number.equals(this.number) && n.countryCode.equals(this.countryCode) && n.cityCode.equals(this.cityCode);
    }

}
