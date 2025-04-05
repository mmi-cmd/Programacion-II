package app;

public class JavaApplication {

    public static void main(String[] args) {

        System.out.println(
            AdminFile.createFolder("192354")
        );

        System.out.println(
            AdminFile.createFolders("19235465")
        );

        System.out.println(
            AdminFile.createFolders("192355")
        );

        System.out.println(
            AdminFile.createFolders("192356")
        );


        System.out.println(
            AdminFile.createFile("192354.txt")
        );

        System.out.println(
            AdminFile.writeFile("192354.txt", "Hola Mundo ijdioawuf0wrq0ru30fjplsj", true)
        );


        AdminFile.readFile("192354.txt");

        AdminFile.readFileBuffer("192354.txt");

        AdminFile.deleteFile("192355");
    }
}