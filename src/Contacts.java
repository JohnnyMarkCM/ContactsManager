

public class Contacts {

    //  ---------PROPERTIES-----------
    public String name;
    public int zip;
    public String phone;

    //    --------CONSTRUCTOR-----------
    public Contacts(String name, int zip, String phone) {
        this.name = name;
        this.zip = 77380;
        this.phone = phone;
    }

//    ----------GETTERS AND SETTERS-------------

    //    -------NAME---------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //    ------ZIP----------
    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public void addZip(int i) {
        return;
    }

    //    ------PHONE----------
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}





