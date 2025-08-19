public class Problem9FileExtension {
    public static void main(String[] args) {

        String fileName = "photo.jpeg";

        System.out.println(fileName.substring(fileName.lastIndexOf('.')));
        //lastIndexOf finds '.' and .substring creates a new string starting from there

    }
}
