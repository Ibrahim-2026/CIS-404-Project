package email.Package;

public class Main {
    public static void main(String[] args) {
        Email em1 = new Email("Ibrahim", "Diallo");
        em1.setAltEmail("NEW EMAIL: " + "idiallo@gmail.com");
        em1.changePassword("NEW PASSWORD: " + "em1Project");
        System.out.println(em1.getAltEmail());
        System.out.println(em1.getPassword());

    }
}