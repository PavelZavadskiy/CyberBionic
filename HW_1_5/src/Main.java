/*
 * Требуется: Создать класс с именем Address. В теле класса требуется создать поля:
 * index, country, city, street, house, apartment. Для каждого поля, создать метод
 * с двумя методами доступа (get, set) Создать экземпляр класса Address. В поля
 * экземпляра записать информацию о почтовом адресе. Выведите на экран значения полей,
 * описывающих адрес.
 */
public class Main {
    public static void main(String[] args) {
        final String INDEX = "02000";
        final String COUNTRY = "Ukraine";
        final String CITY = "Kyiv";
        final String STREET = "Khreschatyk";
        final String HOUSE = "24";
        final String APARTMENT = "1";

        Address address1 = new Address(INDEX, COUNTRY, CITY, STREET, HOUSE, APARTMENT);
        System.out.println(address1.toString());

        System.out.println("____________________________________");
        Address address2 = new Address();
        address2.setIndex(INDEX);
        address2.setCountry(COUNTRY);
        address2.setCity(CITY);
        address2.setStreet(STREET);
        address2.setHouse(HOUSE);
        address2.setApartment(APARTMENT);
        System.out.println("Index: "		+ address2.getIndex()		+ "\n" +
                "Country: "		+ address2.getCountry()		+ "\n" +
                "City: "		+ address2.getCity()		+ "\n" +
                "Street: "		+ address2.getStreet()		+ "\n" +
                "House: "		+ address2.getHouse()		+ "\n" +
                "Apartment: "	+ address2.getApartment()	+ "\n");
    }
}