public class ReferenceDataTypes {
    public static void main(String[] args) {
        String name = "Shubham";
        String name2 = "Shubham";
        String name3 = new String("Shubham");


        // = = compare the address
        // .equals() compare the values
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));
    }
}
